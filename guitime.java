import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;

public class guitime extends Composite {
	private Text text;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public guitime(Composite parent, int style) {
		super(parent, style);
		setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		setLayout(null);
		
		text = new Text(this, SWT.BORDER);
		text.setBounds(207, 399, 64, 19);
		
		Label label = new Label(this, SWT.NONE);
		label.setBounds(115, 141, 447, 198);
		
		Button btnEnter = new Button(this, SWT.NONE);
		btnEnter.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnEnter.setBounds(398, 396, 94, 27);
		btnEnter.setText("Enter 👻");
		
		Label lblNewLabel = new Label(this, SWT.CENTER);
		lblNewLabel.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 24, SWT.NORMAL));
		lblNewLabel.setBounds(115, 65, 447, 37);
		lblNewLabel.setText("Choose Your Own Halloween Adventure");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}

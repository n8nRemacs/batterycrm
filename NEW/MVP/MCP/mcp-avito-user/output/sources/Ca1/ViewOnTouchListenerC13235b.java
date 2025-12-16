package Ca1;

import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import ru.mts.biometry.sdk.view.SdkBioEditText;

/* compiled from: R8$$SyntheticClass */
/* renamed from: Ca1.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class ViewOnTouchListenerC13235b implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2254b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EditText f2255c;

    public /* synthetic */ ViewOnTouchListenerC13235b(EditText editText, int i12) {
        this.f2254b = i12;
        this.f2255c = editText;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        EditText editText = this.f2255c;
        switch (this.f2254b) {
            case 0:
                int i12 = SdkBioEditText.f436531f;
                if (motionEvent.getAction() == 1 && motionEvent.getX() >= editText.getRight() - editText.getCompoundPaddingRight()) {
                    editText.setText("");
                }
                return false;
            default:
                int i13 = ru.mts.biometry.sdk.feature.passport.ui.address.f.f436482i0;
                if (motionEvent.getAction() != 1 || motionEvent.getX() < editText.getRight() - editText.getCompoundPaddingRight()) {
                    return false;
                }
                editText.setText("");
                return true;
        }
    }
}

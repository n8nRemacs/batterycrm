package Ha1;

import android.view.MotionEvent;
import android.view.View;
import com.avito.android.messenger_icebreakers_dialog.view.MessengerIcebreakerBottomSheetFragment;
import ru.mts.biometry.sdk.view.modalcard.wheel.view.WheelView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class a implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7285b;

    public /* synthetic */ a(int i12) {
        this.f7285b = i12;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f7285b) {
            case 0:
                int i12 = WheelView.f436641T;
                view.getParent().requestDisallowInterceptTouchEvent(true);
                view.onTouchEvent(motionEvent);
                return true;
            case 1:
                return true;
            case 2:
                int action = motionEvent.getAction();
                if ((action == 0 || action == 1) && !view.hasFocus()) {
                    view.requestFocus();
                }
                return false;
            case 3:
                MessengerIcebreakerBottomSheetFragment.a aVar = MessengerIcebreakerBottomSheetFragment.f197675q0;
                view.getParent().requestDisallowInterceptTouchEvent(true);
                if ((motionEvent.getAction() & 255) == 1) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
                return false;
            case 4:
                int action2 = motionEvent.getAction();
                if ((action2 == 0 || action2 == 1) && !view.hasFocus()) {
                    view.requestFocus();
                }
                return false;
            case 5:
                int action3 = motionEvent.getAction();
                if ((action3 == 0 || action3 == 1) && !view.hasFocus()) {
                    view.requestFocus();
                }
                return false;
            default:
                return ru.cyberity.cbr.camera.photo.presentation.document.b.a(view, motionEvent);
        }
    }
}

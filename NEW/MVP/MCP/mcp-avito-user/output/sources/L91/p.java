package L91;

import B91.C13108a;
import B91.F;
import B91.K;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.camera.view.PreviewView;
import androidx.core.view.C22832m;
import com.avito.android.beduin.common.component.cart_item.a;
import da1.C39689a;
import kotlin.jvm.internal.N;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class p implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9841b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9842c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9843d;

    public /* synthetic */ p(int i12, Object obj, Object obj2) {
        this.f9841b = i12;
        this.f9842c = obj;
        this.f9843d = obj2;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Object obj = this.f9842c;
        Object obj2 = this.f9843d;
        switch (this.f9841b) {
            case 0:
                kotlin.reflect.n[] nVarArr = ru.mts.biometry.sdk.feature.document.camera.ui.n.f436424m0;
                if (motionEvent.getAction() == 1) {
                    ((Ba1.o) ((ru.mts.biometry.sdk.feature.document.camera.ui.n) obj).f436427j0.getValue()).b(((B91.z) obj2).f1204g, motionEvent);
                    break;
                }
                break;
            case 1:
                a.b bVar = com.avito.android.beduin.common.component.cart_item.a.f100882j;
                ((C22832m) obj).a(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 1 || actionMasked == 3) {
                    ((com.avito.android.beduin.common.component.cart_item.g) obj2).setPressed(false);
                    break;
                }
            case 2:
                kotlin.reflect.n<Object>[] nVarArr2 = com.avito.android.messenger.map.d.f196447r;
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 1 || actionMasked2 == 3) {
                    com.avito.android.messenger.map.d dVar = (com.avito.android.messenger.map.d) obj;
                    int height = dVar.f196455i.getHeight() - dVar.f196457k.getHeight();
                    if (height > 0) {
                        int scrollY = dVar.f196458l.getScrollY();
                        int i12 = height / 2;
                        View view2 = (View) obj2;
                        if (i12 <= scrollY && scrollY < height) {
                            view2.post(new androidx.camera.video.internal.audio.q(height, 8, dVar));
                            break;
                        } else if (scrollY >= 0 && scrollY < i12) {
                            view2.post(new com.avito.android.messenger.map.c(dVar, 0));
                            break;
                        }
                    }
                }
                break;
            case 3:
                Drawable drawable = ((TextView) obj).getCompoundDrawables()[2];
                if (drawable != null) {
                    float fWidth = drawable.getBounds().width();
                    float width = (r4.getWidth() - r4.getPaddingRight()) - motionEvent.getX();
                    if (0.0f <= width && width <= fWidth) {
                        if (motionEvent.getAction() == 1) {
                            ((N) obj2).invoke();
                        }
                        break;
                    }
                }
                break;
            case 4:
                Y41.p pVar = (Y41.p) obj;
                if (pVar != null) {
                    pVar.invoke(view, motionEvent);
                }
                C22832m c22832m = (C22832m) obj2;
                if (c22832m != null) {
                    break;
                }
                break;
            case 5:
                C39689a c39689a = ru.mts.biometry.sdk.feature.passport.ui.camera.m.f436486m0;
                if (motionEvent.getAction() == 1) {
                    aa1.e eVarG5 = ((ru.mts.biometry.sdk.feature.passport.ui.camera.m) obj).g5();
                    PreviewView previewView = ((F) obj2).f1031d;
                    eVarG5.getClass();
                    eVarG5.f20928b.b(previewView, motionEvent);
                    break;
                }
                break;
            case 6:
                kotlin.reflect.n[] nVarArr3 = ru.mts.biometry.sdk.feature.recognition.ui.camera.i.f436493l0;
                if (motionEvent.getAction() == 1) {
                    ((ru.mts.biometry.sdk.feature.recognition.ui.camera.i) obj).e5().b(((B91.z) obj2).f1204g, motionEvent);
                    break;
                }
                break;
            case 7:
                kotlin.reflect.n[] nVarArr4 = ru.mts.biometry.sdk.feature.registration.ui.camera.h.f436507m0;
                if (motionEvent.getAction() == 1) {
                    ((ru.mts.biometry.sdk.feature.registration.ui.camera.h) obj).f436512l0.b(((K) obj2).f1076e, motionEvent);
                    break;
                }
                break;
            default:
                if (motionEvent.getAction() == 1) {
                    ((ru.mts.biometry.sdk.feature.selfie.ui.camera.i) obj).f436522i0.b(((C13108a) obj2).f1088b, motionEvent);
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ p(TextView textView, Y41.a aVar) {
        this.f9841b = 3;
        this.f9842c = textView;
        this.f9843d = (N) aVar;
    }
}

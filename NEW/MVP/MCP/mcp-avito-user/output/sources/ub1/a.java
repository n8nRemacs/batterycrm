package Ub1;

import android.graphics.drawable.Animatable;
import android.widget.TextView;
import y2.C50041b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16489b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f16490c;

    public /* synthetic */ a(b bVar, int i12) {
        this.f16489b = i12;
        this.f16490c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar = this.f16490c;
        switch (this.f16489b) {
            case 0:
                int i12 = b.f16491x;
                TextView textView = bVar.f16503m;
                if (textView == null) {
                    textView = null;
                }
                Object obj = textView.getCompoundDrawables()[0];
                Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
                if (animatable != null) {
                    animatable.start();
                    break;
                }
                break;
            default:
                C50041b c50041b = bVar.f16499i;
                if (c50041b.f442864b) {
                    c50041b.f442864b = false;
                    bVar.getContext().getApplicationContext().unbindService(c50041b);
                    break;
                }
                break;
        }
    }
}

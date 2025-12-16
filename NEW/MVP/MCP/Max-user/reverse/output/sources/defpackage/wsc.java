package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.function.IntSupplier;

/* loaded from: classes3.dex */
public final /* synthetic */ class wsc implements IntSupplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wsc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.IntSupplier
    public final int getAsInt() {
        switch (this.a) {
            case 0:
                return ((rde) this.b).d();
            default:
                View view = (View) ((WeakReference) this.b).get();
                if (view != null) {
                    return view.getWidth();
                }
                return 0;
        }
    }
}

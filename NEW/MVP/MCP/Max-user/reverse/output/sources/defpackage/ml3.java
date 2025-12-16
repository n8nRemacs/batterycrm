package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.b;

/* loaded from: classes.dex */
public final class ml3 extends u08 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ml3(b bVar, int i) {
        super(0);
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                b bVar = this.b;
                return new lyd(bVar.getApplication(), bVar, bVar.getIntent() != null ? bVar.getIntent().getExtras() : null);
            case 1:
                this.b.reportFullyDrawn();
                return qqg.a;
            case 2:
                b bVar2 = this.b;
                return new bm6(bVar2.X, new ml3(bVar2, 1));
            default:
                b bVar3 = this.b;
                jva jvaVar = new jva(new dl3(bVar3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (fni.a(Looper.myLooper(), Looper.getMainLooper())) {
                        bVar3.a.a(new hl3(jvaVar, 0, bVar3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new my1(bVar3, 12, jvaVar));
                    }
                }
                return jvaVar;
        }
    }
}

package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class hp0 extends yk8 {
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hp0(int i, int i2) {
        super(i);
        this.g = i2;
    }

    @Override // defpackage.yk8
    public Object a(Object obj) {
        switch (this.g) {
            case 3:
                return hte.b(((s8f) obj).a);
            default:
                return super.a(obj);
        }
    }

    @Override // defpackage.yk8
    public void b(boolean z, Object obj, Object obj2, Object obj3) {
        switch (this.g) {
            case 0:
                break;
            case 1:
                ((Bitmap) obj2).recycle();
                break;
        }
    }

    @Override // defpackage.yk8
    public int h(Object obj) {
        switch (this.g) {
            case 0:
                int iD = xp0.d((Bitmap) obj);
                if (iD < 1) {
                    return 1;
                }
                return iD;
            default:
                return super.h(obj);
        }
    }
}

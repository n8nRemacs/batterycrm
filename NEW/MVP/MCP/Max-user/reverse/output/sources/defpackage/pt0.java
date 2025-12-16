package defpackage;

import ru.ok.tamtam.photoeditor.view.BrushWidthViewImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class pt0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pt0(Object obj, float f, int i) {
        this.a = i;
        this.c = obj;
        this.b = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                BrushWidthViewImpl brushWidthViewImpl = (BrushWidthViewImpl) this.c;
                float f = brushWidthViewImpl.z0;
                float f2 = (this.b - f) / (brushWidthViewImpl.A0 - f);
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
                float f3 = brushWidthViewImpl.x0;
                brushWidthViewImpl.v0 = f3 - ((f3 - brushWidthViewImpl.w0) * f2);
                brushWidthViewImpl.invalidate();
                break;
            case 1:
                ((f7a) ((h08) this.c).b).e.F(this.b);
                break;
            default:
                ((s2f) ((v32) this.c).c).d.F(this.b);
                break;
        }
    }
}

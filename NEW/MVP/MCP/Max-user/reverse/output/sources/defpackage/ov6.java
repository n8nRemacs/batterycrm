package defpackage;

import android.graphics.Picture;
import android.text.Layout;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ov6 extends dtf implements sm6 {
    public final /* synthetic */ pv6 X;
    public final /* synthetic */ Layout o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov6(Layout layout, pv6 pv6Var, Continuation continuation) {
        super(2, continuation);
        this.o = layout;
        this.X = pv6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ov6 ov6Var = (ov6) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ov6Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ov6(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Layout layout = this.o;
        g8j.b(obj);
        e6c e6cVar = pv6.c;
        Picture picture = (Picture) e6cVar.a();
        if (picture == null) {
            picture = new Picture();
        }
        try {
            try {
                layout.draw(picture.beginRecording(layout.getWidth(), layout.getHeight()));
                picture.endRecording();
                e6cVar.b(picture);
            } catch (Throwable th) {
                picture.endRecording();
                throw th;
            }
        } catch (Throwable th2) {
            wqi.e(this.X.b, "fail to warm layout", th2);
        }
        return qqg.a;
    }
}

package defpackage;

import android.view.ViewGroup;
import kotlin.coroutines.Continuation;
import one.me.sharedata.ShareDataPickerScreen;

/* loaded from: classes2.dex */
public final class gue extends dtf implements sm6 {
    public final /* synthetic */ ViewGroup o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gue(ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.o = viewGroup;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        gue gueVar = (gue) l(bool, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        gueVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new gue(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        zfi.b(this.o, ShareDataPickerScreen.J0, null);
        return qqg.a;
    }
}

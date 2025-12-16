package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.sharedata.ShareDataPickerScreen;

/* loaded from: classes2.dex */
public final class due extends dtf implements sm6 {
    public final /* synthetic */ muc X;
    public final /* synthetic */ ShareDataPickerScreen Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public due(muc mucVar, ShareDataPickerScreen shareDataPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.X = mucVar;
        this.Y = shareDataPickerScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        due dueVar = (due) l((qte) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        dueVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        due dueVar = new due(this.X, this.Y, continuation);
        dueVar.o = obj;
        return dueVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        qte qteVar = (qte) this.o;
        int i = 8;
        muc mucVar = this.X;
        if (qteVar == null) {
            mucVar.setVisibility(8);
        } else {
            ShareDataPickerScreen shareDataPickerScreen = this.Y;
            if (!shareDataPickerScreen.v0 && ((Set) shareDataPickerScreen.I0().Y.a.getValue()).isEmpty()) {
                i = 0;
            }
            mucVar.setVisibility(i);
            s5g s5gVar = qteVar.a;
            s5g s5gVar2 = qteVar.b;
            String str = qteVar.c;
            Integer num = qteVar.d;
            CharSequence charSequenceB = s5gVar.b(mucVar.getContext());
            if (charSequenceB == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            mucVar.setTitle(charSequenceB);
            mucVar.setBody(s5gVar2 != null ? s5gVar2.b(mucVar.getContext()) : null);
            mucVar.a(null, str, null, false, false);
            mucVar.setCounter(num);
        }
        return qqg.a;
    }
}

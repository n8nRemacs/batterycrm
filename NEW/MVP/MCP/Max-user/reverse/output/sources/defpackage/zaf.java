package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.startconversation.StartConversationScreen;

/* loaded from: classes2.dex */
public final class zaf extends dtf implements sm6 {
    public final /* synthetic */ StartConversationScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaf(Continuation continuation, StartConversationScreen startConversationScreen) {
        super(2, continuation);
        this.X = startConversationScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((zaf) l((List) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        zaf zafVar = new zaf(continuation, this.X);
        zafVar.o = obj;
        return zafVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        List list = (List) this.o;
        yy7[] yy7VarArr = StartConversationScreen.H0;
        StartConversationScreen startConversationScreen = this.X;
        CharSequence charSequenceY0 = startConversationScreen.y0();
        boolean z = charSequenceY0 == null || charSequenceY0.length() == 0;
        qqg qqgVar = qqg.a;
        if (!z) {
            return qqgVar;
        }
        startConversationScreen.x0.E(list);
        return qqgVar;
    }
}

package com.avito.android.messenger.conversation.mvi.messages;

import com.avito.android.messenger.conversation.mvi.messages.f0;
import com.avito.android.util.K2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MessageListView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class j0 extends kotlin.jvm.internal.H implements Y41.l<f0, G0> {
    public j0(Object obj) {
        super(1, obj, q0.class, "onScrollAction", "onScrollAction(Lcom/avito/android/messenger/conversation/mvi/messages/MessageListScrollAction;)V", 0);
    }

    @Override // Y41.l
    public final G0 invoke(f0 f0Var) {
        f0 f0Var2 = f0Var;
        q0 q0Var = (q0) this.receiver;
        q0Var.getClass();
        if (kotlin.jvm.internal.L.f(f0Var2, f0.a.f192948a)) {
            q0Var.f193100H = true;
            q0Var.f193096D.accept(G0.f406611a);
        } else if (f0Var2 instanceof f0.c) {
            q0Var.f193093A.accept(Boolean.valueOf(((f0.c) f0Var2).f192950a));
        } else if (kotlin.jvm.internal.L.f(f0Var2, f0.d.f192951a)) {
            if (q0Var.f193101I) {
                q0Var.f193094B.accept(G0.f406611a);
            }
        } else if (f0Var2 instanceof f0.e) {
            q0Var.f193095C.accept(G0.f406611a);
        } else if ((f0Var2 instanceof f0.b) && q0Var.f193104b) {
            float f12 = ((f0.b) f0Var2).f192949a;
            if (f12 < 0.0f && Math.abs(f12) >= q0Var.f193118p) {
                K2.d(q0Var.f193117o, false);
            }
        }
        return G0.f406611a;
    }
}

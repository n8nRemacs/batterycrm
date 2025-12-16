package com.avito.android.messenger.conversation.adapter;

import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.T1;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: OutgoingMessagePresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/z;", "LTV0/d;", "Lcom/avito/android/messenger/conversation/adapter/B;", "Lcom/avito/android/messenger/conversation/T1$d;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface z extends TV0.d<B, T1.d> {

    /* compiled from: OutgoingMessagePresenter.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/z$a;", "Lcom/avito/android/messenger/conversation/adapter/z;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements z {
        @Inject
        public a() {
            throw null;
        }

        @Override // TV0.d
        public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
            B b12 = (B) eVar;
            T1.d dVar = (T1.d) aVar;
            b12.c(new w(dVar, this));
            b12.KC(new x(0));
            b12.b0(dVar.f189170e);
            b12.S6(dVar.f189171f);
            b12.qB(dVar.f189173h);
            b12.m80(new y(dVar, this));
            T1.c cVar = dVar.f189179n;
            boolean z12 = false;
            if (cVar != null && cVar.f189147a && !cVar.f189149c && !cVar.f189151e && !cVar.f189153g) {
                z12 = true;
            }
            b12.n60(z12);
        }
    }
}

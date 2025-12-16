package com.avito.android.messenger.conversation.mvi.message_menu.elements;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.message_menu.AbstractC32118b;
import com.avito.android.messenger.conversation.mvi.message_menu.InterfaceC32117a;
import com.avito.android.messenger.conversation.mvi.message_menu.d;
import com.avito.android.messenger.conversation.mvi.message_menu.l;
import com.avito.android.mvi.rx3.with_monolithic_state.C32891b;
import com.avito.android.mvi.rx3.with_monolithic_state.x;
import com.avito.android.remote.model.messenger.ActionConfirmation;
import com.avito.android.remote.model.messenger.MessengerTimestamp;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.completable.C41828t;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: RetrySendingMessageElementProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/elements/j;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/a;", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j implements InterfaceC32117a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32024m f191708a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f191709b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f191710c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f191711d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a f191712e;

    /* compiled from: RetrySendingMessageElementProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/elements/j$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void M2();
    }

    /* compiled from: RetrySendingMessageElementProvider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/elements/j$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/b;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends C32891b<l.a> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.messenger.conversation.mvi.message_menu.d f191713d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@Y61.k com.avito.android.messenger.conversation.mvi.message_menu.d dVar) {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            this.f191713d = dVar;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32891b
        public final I b(l.a aVar) {
            MessengerTimestamp messengerTimestamp = MessengerTimestamp.INSTANCE;
            j jVar = j.this;
            long jFromMillis = messengerTimestamp.fromMillis(jVar.f191709b.now());
            com.avito.android.messenger.conversation.mvi.message_menu.h f191618b = this.f191713d.getF191618b();
            C41828t c41828tD0 = jVar.f191708a.d0(jFromMillis, f191618b.f191748c);
            InterfaceC35745a5 interfaceC35745a5 = jVar.f191711d;
            return c41828tD0.x(interfaceC35745a5.a()).q(interfaceC35745a5.c()).l(new k(f191618b, jVar)).s(new l(f191618b, jVar)).r().B(G0.f406611a).j(new m(f191618b, jVar));
        }
    }

    @Inject
    public j(@Y61.k InterfaceC32024m interfaceC32024m, @Y61.k com.avito.android.server_time.f fVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k a aVar) {
        this.f191708a = interfaceC32024m;
        this.f191709b = fVar;
        this.f191710c = interfaceC28373a;
        this.f191711d = interfaceC35745a5;
        this.f191712e = aVar;
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.c
    @Y61.l
    public final AbstractC32118b a(@Y61.k com.avito.android.messenger.conversation.mvi.message_menu.d dVar) {
        boolean z12 = dVar.getF191618b().f191750e == null;
        boolean z13 = dVar.getF191618b().f191751f;
        if (!(dVar instanceof d.e) && z12 && z13) {
            return new AbstractC32118b.a("retry_sending_message", R.string.messenger_retry_sending, R.drawable.ic_retry_24);
        }
        return null;
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.InterfaceC32117a
    @Y61.l
    public final ActionConfirmation b() {
        return null;
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.InterfaceC32117a
    @Y61.k
    public final x<l.a> c(@Y61.k com.avito.android.messenger.conversation.mvi.message_menu.d dVar) {
        return new b(dVar);
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.InterfaceC32117a
    @Y61.k
    public final String d() {
        return "retry_sending_message";
    }
}

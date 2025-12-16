package com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.mvi.message_menu.AbstractC32118b;
import com.avito.android.messenger.conversation.mvi.message_menu.InterfaceC32117a;
import com.avito.android.messenger.conversation.mvi.message_menu.d;
import com.avito.android.messenger.conversation.mvi.message_menu.l;
import com.avito.android.mvi.rx3.with_monolithic_state.C32891b;
import com.avito.android.mvi.rx3.with_monolithic_state.x;
import com.avito.android.remote.model.messenger.ActionConfirmation;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.I;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DeleteLocalMessageElementProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/elements/delete_local/a;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/a;", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements InterfaceC32117a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f191637a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f191638b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f191639c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC5663a f191640d;

    /* compiled from: DeleteLocalMessageElementProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/elements/delete_local/a$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.a$a, reason: collision with other inner class name */
    public interface InterfaceC5663a {
        void Y8();
    }

    /* compiled from: DeleteLocalMessageElementProvider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/elements/delete_local/a$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/b;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends C32891b<l.a> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.messenger.conversation.mvi.message_menu.d f191641d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@Y61.k com.avito.android.messenger.conversation.mvi.message_menu.d dVar) {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            this.f191641d = dVar;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32891b
        public final I b(l.a aVar) {
            com.avito.android.messenger.conversation.mvi.message_menu.d dVar = this.f191641d;
            com.avito.android.messenger.conversation.mvi.message_menu.h f191618b = dVar.getF191618b();
            a aVar2 = a.this;
            return aVar2.f191637a.a(dVar.getF191618b().f191747b, dVar.getF191618b().f191748c, dVar.getF191618b().f191746a).s(aVar2.f191639c.c()).h(new com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.b(f191618b, aVar2)).i(new c(f191618b, aVar2)).u(new com.avito.android.analytics.clickstream.I(5));
        }
    }

    @Inject
    public a(@Y61.k f fVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC5663a interfaceC5663a) {
        this.f191637a = fVar;
        this.f191638b = interfaceC28373a;
        this.f191639c = interfaceC35745a5;
        this.f191640d = interfaceC5663a;
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.c
    @Y61.l
    public final AbstractC32118b a(@Y61.k com.avito.android.messenger.conversation.mvi.message_menu.d dVar) {
        boolean z12 = dVar.getF191618b().f191750e == null;
        if (!(dVar instanceof d.e) && z12 && dVar.getF191618b().f191754i) {
            return new AbstractC32118b.a("delete_local_message", R.string.messenger_delete_message, R.drawable.ic_rds_trash_24);
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
        return "delete_local_message";
    }
}

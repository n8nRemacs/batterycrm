package com.avito.android.messenger.conversation.mvi.message_menu.elements.quick_reply;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.messenger.conversation.mvi.message_menu.AbstractC32118b;
import com.avito.android.messenger.conversation.mvi.message_menu.InterfaceC32117a;
import com.avito.android.messenger.conversation.mvi.message_menu.l;
import com.avito.android.messenger.conversation.mvi.quick_replies.InterfaceC32188a;
import com.avito.android.mvi.rx3.with_monolithic_state.C32891b;
import com.avito.android.mvi.rx3.with_monolithic_state.x;
import com.avito.android.remote.model.messenger.ActionConfirmation;
import io.reactivex.rxjava3.core.I;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: AddQuickReplyElementProvider.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/elements/quick_reply/c;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/a;", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements InterfaceC32117a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC32188a f191728a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f191729b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final f f191730c;

    /* compiled from: AddQuickReplyElementProvider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/elements/quick_reply/c$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/b;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a extends C32891b<l.a> {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final com.avito.android.messenger.conversation.mvi.message_menu.d f191731d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@k com.avito.android.messenger.conversation.mvi.message_menu.d dVar) {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            this.f191731d = dVar;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32891b
        public final I b(l.a aVar) {
            c cVar = c.this;
            String strA = cVar.f191730c.a(this.f191731d);
            return (strA == null ? I.l(new IllegalStateException("Quick reply not implemented")) : C43066x.K(strA) ? I.l(new IllegalArgumentException("Message is blank")) : cVar.f191728a.a(strA).r(new com.avito.android.messenger.conversation.mvi.message_menu.elements.quick_reply.a(cVar)).i(new com.avito.android.messenger.conversation.mvi.message_menu.elements.quick_reply.b(cVar))).u(new androidx.room.rxjava3.b(this, 8));
        }
    }

    /* compiled from: AddQuickReplyElementProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/elements/quick_reply/c$b;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        void G4(@k String str);

        void f9();

        void o8();
    }

    @Inject
    public c(@k InterfaceC32188a interfaceC32188a, @k b bVar, @k f fVar) {
        this.f191728a = interfaceC32188a;
        this.f191729b = bVar;
        this.f191730c = fVar;
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.c
    @Y61.l
    public final AbstractC32118b a(@k com.avito.android.messenger.conversation.mvi.message_menu.d dVar) {
        String strA = this.f191730c.a(dVar);
        if (strA == null || C43066x.K(strA)) {
            return null;
        }
        return new AbstractC32118b.a("add_quick_reply", R.string.messenger_quick_replies_add_to_replies, R.drawable.ic_messenger_quick_reply_24);
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.InterfaceC32117a
    @Y61.l
    public final ActionConfirmation b() {
        return null;
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.InterfaceC32117a
    @k
    public final x<l.a> c(@k com.avito.android.messenger.conversation.mvi.message_menu.d dVar) {
        return new a(dVar);
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.InterfaceC32117a
    @k
    public final String d() {
        return "add_quick_reply";
    }
}

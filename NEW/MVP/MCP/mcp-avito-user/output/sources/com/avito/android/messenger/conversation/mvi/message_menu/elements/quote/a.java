package com.avito.android.messenger.conversation.mvi.message_menu.elements.quote;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.messenger.conversation.mvi.message_menu.AbstractC32118b;
import com.avito.android.messenger.conversation.mvi.message_menu.InterfaceC32117a;
import com.avito.android.messenger.conversation.mvi.message_menu.d;
import com.avito.android.messenger.conversation.mvi.message_menu.l;
import com.avito.android.mvi.rx3.with_monolithic_state.C32890a;
import com.avito.android.mvi.rx3.with_monolithic_state.x;
import com.avito.android.remote.model.messenger.ActionConfirmation;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: QuoteMessageElementProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/elements/quote/a;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/a;", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements InterfaceC32117a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC5665a f191737a;

    /* compiled from: QuoteMessageElementProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/elements/quote/a$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.message_menu.elements.quote.a$a, reason: collision with other inner class name */
    public interface InterfaceC5665a {
        void q6(@k d dVar);
    }

    /* compiled from: QuoteMessageElementProvider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/elements/quote/a$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends C32890a<l.a> {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final d f191738d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@k d dVar) {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            this.f191738d = dVar;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32890a
        public final void b(l.a aVar) {
            a.this.f191737a.q6(this.f191738d);
        }
    }

    @Inject
    public a(@k InterfaceC5665a interfaceC5665a) {
        this.f191737a = interfaceC5665a;
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.c
    @Y61.l
    public final AbstractC32118b a(@k d dVar) {
        if (dVar.getF191621e()) {
            return new AbstractC32118b.a("quote_message", R.string.messenger_quote_message, R.drawable.ic_message_quote_reply);
        }
        return null;
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.InterfaceC32117a
    @Y61.l
    public final ActionConfirmation b() {
        return null;
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.InterfaceC32117a
    @k
    public final x<l.a> c(@k d dVar) {
        return new b(dVar);
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.InterfaceC32117a
    @k
    public final String d() {
        return "quote_message";
    }
}

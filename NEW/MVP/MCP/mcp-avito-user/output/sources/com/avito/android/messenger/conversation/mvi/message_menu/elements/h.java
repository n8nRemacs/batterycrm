package com.avito.android.messenger.conversation.mvi.message_menu.elements;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.analytics.F;
import com.avito.android.messenger.conversation.mvi.message_menu.AbstractC32118b;
import com.avito.android.messenger.conversation.mvi.message_menu.InterfaceC32117a;
import com.avito.android.messenger.conversation.mvi.message_menu.d;
import com.avito.android.messenger.conversation.mvi.message_menu.l;
import com.avito.android.mvi.rx3.with_monolithic_state.C32890a;
import com.avito.android.mvi.rx3.with_monolithic_state.x;
import com.avito.android.remote.model.messenger.ActionConfirmation;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: OpenInBrowserElementProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/elements/h;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/a;", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements InterfaceC32117a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f191702a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f191703b;

    /* compiled from: OpenInBrowserElementProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/elements/h$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void z5(@Y61.k String str);
    }

    /* compiled from: OpenInBrowserElementProvider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/elements/h$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends C32890a<l.a> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.messenger.conversation.mvi.message_menu.d f191704d;

        public b(@Y61.k com.avito.android.messenger.conversation.mvi.message_menu.d dVar) {
            super(null, null, 3, null);
            this.f191704d = dVar;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32890a
        public final void b(l.a aVar) {
            String str;
            com.avito.android.messenger.conversation.mvi.message_menu.d dVar = this.f191704d;
            if (dVar instanceof d.c) {
                str = ((d.c) dVar).f191578d;
            } else if (dVar instanceof d.b) {
                str = ((d.b) dVar).f191573e;
            } else if (dVar instanceof d.C5661d) {
                str = ((d.C5661d) dVar).f191584c;
            } else if (!(dVar instanceof d.e)) {
                return;
            } else {
                str = ((d.e) dVar).f191590c;
            }
            h hVar = h.this;
            hVar.f191703b.c(new F(dVar.getF191618b().f191747b, str, dVar.getF191618b().f191750e, null, null, 24, null));
            hVar.f191702a.z5(str);
        }
    }

    @Inject
    public h(@Y61.k a aVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f191702a = aVar;
        this.f191703b = interfaceC28373a;
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.c
    @Y61.l
    public final AbstractC32118b a(@Y61.k com.avito.android.messenger.conversation.mvi.message_menu.d dVar) {
        if (dVar instanceof d.c ? true : dVar instanceof d.C5661d ? true : dVar instanceof d.e) {
            return new AbstractC32118b.a("open_in_browser", R.string.messenger_chat_link_menu_open_in_browser, R.drawable.ic_messenger_link_menu_open_in_browser);
        }
        if (dVar instanceof d.h ? true : dVar instanceof d.f ? true : dVar instanceof d.g ? true : dVar instanceof d.a ? true : dVar instanceof d.i ? true : dVar instanceof d.j ? true : dVar instanceof d.b) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
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
        return "open_in_browser";
    }
}

package com.avito.android.messenger.conversation.mvi.message_menu.elements;

import androidx.compose.runtime.internal.P;
import com.avito.android.C30277e1;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
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

/* compiled from: DownloadImageElementProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/elements/d;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/a;", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements InterfaceC32117a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f191632a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f191633b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f191634c;

    /* compiled from: DownloadImageElementProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/elements/d$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void Ec(@Y61.k String str);
    }

    /* compiled from: DownloadImageElementProvider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/elements/d$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends C32890a<l.a> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.messenger.conversation.mvi.message_menu.d f191635d;

        public b(@Y61.k com.avito.android.messenger.conversation.mvi.message_menu.d dVar) {
            super(null, null, 3, null);
            this.f191635d = dVar;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32890a
        public final void b(l.a aVar) {
            com.avito.android.messenger.conversation.mvi.message_menu.d dVar = this.f191635d;
            if (!(dVar instanceof d.b)) {
                if (!(dVar instanceof d.c ? true : dVar instanceof d.C5661d ? true : dVar instanceof d.e ? true : dVar instanceof d.h ? true : dVar instanceof d.f ? true : dVar instanceof d.g ? true : dVar instanceof d.a ? true : dVar instanceof d.i ? true : dVar instanceof d.j)) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                String str = ((d.b) dVar).f191573e;
                d dVar2 = d.this;
                dVar2.f191633b.c(new H70.a(str, ((d.b) dVar).f191570b.f191747b));
                dVar2.f191632a.Ec(str);
            }
        }
    }

    @Inject
    public d(@Y61.k a aVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C30277e1 c30277e1) {
        this.f191632a = aVar;
        this.f191633b = interfaceC28373a;
        this.f191634c = c30277e1;
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.c
    @Y61.l
    public final AbstractC32118b a(@Y61.k com.avito.android.messenger.conversation.mvi.message_menu.d dVar) {
        if (!(dVar instanceof d.b)) {
            if (dVar instanceof d.c ? true : dVar instanceof d.C5661d ? true : dVar instanceof d.e ? true : dVar instanceof d.h ? true : dVar instanceof d.f ? true : dVar instanceof d.g ? true : dVar instanceof d.a ? true : dVar instanceof d.i ? true : dVar instanceof d.j) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        C30277e1 c30277e1 = this.f191634c;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[52];
        if (((Boolean) c30277e1.f144997Z.a().invoke()).booleanValue()) {
            return new AbstractC32118b.a("download_image", R.string.messenger_image_menu_download, R.drawable.ic_messenger_image_menu_download);
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
        return "download_image";
    }
}

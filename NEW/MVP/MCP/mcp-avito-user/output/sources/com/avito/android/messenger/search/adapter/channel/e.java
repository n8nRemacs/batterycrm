package com.avito.android.messenger.search.adapter.channel;

import HY.q;
import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.widget.chat_list_element.ChatListElement;
import fZ.AbstractC40377a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ChannelSearchItemView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/search/adapter/channel/e;", "LTV0/e;", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface e extends TV0.e {

    /* compiled from: ChannelSearchItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: ChannelSearchItemView.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/search/adapter/channel/e$b;", "Lcom/avito/android/messenger/search/adapter/channel/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.konveyor.adapter.b implements e {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ChatListElement f197051b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public Y41.a<G0> f197052c;

        /* compiled from: ChannelSearchItemView.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends N implements Y41.a<G0> {
            public a() {
                super(0);
            }

            @Override // Y41.a
            public final G0 invoke() {
                Y41.a<G0> aVar = b.this.f197052c;
                if (aVar != null) {
                    aVar.invoke();
                }
                return G0.f406611a;
            }
        }

        public b(@k View view) {
            super(view);
            this.f197051b = ChatListElement.b.a(ChatListElement.f197463a, view);
        }

        @Override // com.avito.android.messenger.search.adapter.channel.e
        public final void c(@l Y41.a<G0> aVar) {
            this.f197052c = aVar;
        }

        @Override // com.avito.android.messenger.search.adapter.channel.e
        public final void rm(@k AbstractC40377a.C11158a c11158a) {
            ChatListElement chatListElement = this.f197051b;
            chatListElement.k(c11158a.f395917g);
            boolean z12 = c11158a.f395921k;
            chatListElement.i(z12);
            q qVar = c11158a.f395923m;
            ChatListElement.LastMessageType lastMessageType = c11158a.f395922l;
            chatListElement.b(lastMessageType, qVar);
            chatListElement.n(z12, lastMessageType);
            chatListElement.f(com.avito.android.image_loader.b.b(c11158a.f395920j), c11158a.f395926p);
            AbstractC40377a.C11158a.C11159a c11159a = c11158a.f395918h;
            chatListElement.j(c11159a != null ? c11159a.f395929a : null, c11159a != null ? c11159a.f395930b : null, c11158a.f395924n);
            chatListElement.d(c11158a.f395919i);
            chatListElement.b0(c11158a.f395915e);
            chatListElement.a(c11158a.f395916f);
            chatListElement.e(false);
            chatListElement.c(new a());
        }
    }

    void c(@l Y41.a<G0> aVar);

    void rm(@k AbstractC40377a.C11158a c11158a);
}

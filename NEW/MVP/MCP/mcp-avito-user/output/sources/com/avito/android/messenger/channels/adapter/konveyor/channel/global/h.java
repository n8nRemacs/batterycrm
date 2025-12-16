package com.avito.android.messenger.channels.adapter.konveyor.channel.global;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.messenger.channels.adapter.ChannelsListItem;
import com.avito.android.messenger.widget.chat_list_element.ChatListElement;
import com.avito.android.remote.model.Image;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelItemViewGlobal.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/konveyor/channel/global/h;", "Lcom/avito/android/messenger/channels/adapter/konveyor/channel/global/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f186866b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Y41.a<G0> f186867c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ChatListElement f186868d;

    /* compiled from: ChannelItemViewGlobal.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f186870l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a<G0> aVar) {
            super(0);
            this.f186870l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f186870l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: ChannelItemViewGlobal.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f186871l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    public h(@k View view, boolean z12) {
        super(view);
        this.f186866b = view;
        if (z12) {
            view.addOnAttachStateChangeListener(new a());
        }
        this.f186868d = ChatListElement.b.a(ChatListElement.f197463a, view.findViewById(R.id.chat_list_element));
    }

    @Override // com.avito.android.messenger.channels.adapter.konveyor.channel.global.g
    public final void fW(@k ChannelsListItem.b bVar, @k Y41.a<G0> aVar, @k Y41.a<G0> aVar2) {
        this.f186867c = aVar2;
        ChatListElement chatListElement = this.f186868d;
        chatListElement.c(new b(aVar));
        chatListElement.a(bVar.f186791f);
        chatListElement.k(bVar.f186792g);
        ChannelsListItem.b.a aVar3 = bVar.f186793h;
        chatListElement.j(aVar3 != null ? aVar3.f186812a : null, aVar3 != null ? aVar3.f186813b : null, bVar.f186807v);
        ChatListElement.LastMessageType lastMessageType = ChatListElement.LastMessageType.f197472h;
        ChatListElement.LastMessageType lastMessageType2 = bVar.f186800o;
        chatListElement.b0(lastMessageType2 != lastMessageType ? bVar.f186796k : null);
        chatListElement.e(bVar.f186797l);
        chatListElement.h(bVar.f186808w);
        Image image = bVar.f186798m;
        chatListElement.f(image != null ? com.avito.android.image_loader.b.b(image) : null, bVar.f186810y);
        boolean z12 = bVar.f186799n;
        chatListElement.i(z12);
        chatListElement.b(lastMessageType2, bVar.f186801p);
        chatListElement.n(z12, lastMessageType2);
        chatListElement.g(bVar.f186802q);
        chatListElement.d(bVar.f186794i);
        chatListElement.l(bVar.f186788A);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f186868d.c(c.f186871l);
        this.f186867c = null;
    }

    /* compiled from: ChannelItemViewGlobal.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/messenger/channels/adapter/konveyor/channel/global/h$a", "Landroid/view/View$OnAttachStateChangeListener;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@k View view) {
            Y41.a<G0> aVar = h.this.f186867c;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@k View view) {
        }
    }
}

package com.avito.android.messenger.channels.adapter.konveyor.channel;

import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.messenger.channels.adapter.ChannelsListItem;
import com.avito.android.messenger.channels.adapter.konveyor.common.swipable.c;
import com.avito.android.messenger.widget.chat_list_element.ChatListElement;
import com.avito.android.remote.model.Image;
import com.avito.android.util.D6;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ru.rambler.libs.swipe_layout.SwipeLayout;

/* compiled from: ChannelItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/konveyor/channel/p;", "Lcom/avito/android/messenger/channels/adapter/konveyor/channel/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/messenger/channels/adapter/konveyor/common/swipable/c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class p extends com.avito.konveyor.adapter.b implements k, com.avito.android.messenger.channels.adapter.konveyor.common.swipable.c {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f186887n = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f186888b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final View f186889c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final View f186890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.messenger.channels.adapter.konveyor.common.swipable.d f186891e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f186892f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f186893g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ChatListElement f186894h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Object f186895i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Object f186896j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Object f186897k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Object f186898l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Object f186899m;

    /* compiled from: ChannelItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f186902m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a<G0> aVar) {
            super(0);
            this.f186902m = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.jakewharton.rxrelay3.d<c.a> dVar = p.this.f186891e.f186917d;
            if (dVar != null) {
                dVar.accept(c.a.C5485a.f186913a);
            }
            ((com.avito.android.messenger.channels.adapter.konveyor.channel.d) this.f186902m).invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: ChannelItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<View> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            return p.this.f186888b.findViewById(R.id.chat_list_element_right_view);
        }
    }

    /* compiled from: ChannelItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<ImageView> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final ImageView invoke() {
            View view = p.this.f186889c;
            if (view != null) {
                return (ImageView) view.findViewById(R.id.chat_list_element_swipe_mark_as_read_icon);
            }
            return null;
        }
    }

    /* compiled from: ChannelItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<TextView> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final TextView invoke() {
            View view = p.this.f186889c;
            if (view != null) {
                return (TextView) view.findViewById(R.id.chat_list_element_swipe_mark_as_read_title);
            }
            return null;
        }
    }

    /* compiled from: ChannelItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f186906l = new f();

        public f() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: ChannelItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends N implements Y41.a<ImageView> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final ImageView invoke() {
            View view = p.this.f186890d;
            if (view != null) {
                return (ImageView) view.findViewById(R.id.chat_list_element_swipe_pin_icon);
            }
            return null;
        }
    }

    /* compiled from: ChannelItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class h extends N implements Y41.a<TextView> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final TextView invoke() {
            View view = p.this.f186890d;
            if (view != null) {
                return (TextView) view.findViewById(R.id.chat_list_element_swipe_pin_title);
            }
            return null;
        }
    }

    public p(@Y61.k View view, @Y61.l View view2, @Y61.l View view3, boolean z12) {
        super(view);
        this.f186888b = view;
        this.f186889c = view2;
        this.f186890d = view3;
        this.f186891e = new com.avito.android.messenger.channels.adapter.konveyor.common.swipable.d(view);
        if (z12) {
            view.addOnAttachStateChangeListener(new a());
        }
        this.f186894h = ChatListElement.b.a(ChatListElement.f197463a, view.findViewById(R.id.chat_list_element));
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f186895i = C42727D.b(lazyThreadSafetyMode, new c());
        this.f186896j = C42727D.b(lazyThreadSafetyMode, new d());
        this.f186897k = C42727D.b(lazyThreadSafetyMode, new e());
        this.f186898l = C42727D.b(lazyThreadSafetyMode, new g());
        this.f186899m = C42727D.b(lazyThreadSafetyMode, new h());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.messenger.channels.adapter.konveyor.channel.k
    public final void aL(@Y61.k final ChannelsListItem.b bVar, @Y61.k com.avito.android.messenger.channels.adapter.konveyor.common.swipable.b bVar2, @Y61.k Y41.a<G0> aVar, @Y61.k final Y41.a<G0> aVar2, @Y61.k final Y41.l<? super Boolean, G0> lVar, @Y61.k final Y41.l<? super Boolean, G0> lVar2, @Y61.k Y41.a<G0> aVar3, @Y61.k Y41.a<G0> aVar4) {
        boolean z12 = bVar.f186804s;
        this.f186893g = z12;
        this.f186892f = aVar4;
        bVar2.a(this, bVar.f186789d);
        ((View) this.f186895i.getValue()).setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.messenger.channels.adapter.konveyor.channel.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = p.f186887n;
                com.jakewharton.rxrelay3.d<c.a> dVar = this.f186879b.f186891e.f186917d;
                if (dVar != null) {
                    dVar.accept(c.a.C5485a.f186913a);
                }
                ((e) aVar2).invoke();
            }
        });
        View view = this.f186889c;
        if (view != null) {
            final int i12 = 0;
            view.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.messenger.channels.adapter.konveyor.channel.n

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ p f186882c;

                {
                    this.f186882c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Y41.l lVar3 = lVar;
                    ChannelsListItem.b bVar3 = bVar;
                    p pVar = this.f186882c;
                    switch (i12) {
                        case 0:
                            int i13 = p.f186887n;
                            com.jakewharton.rxrelay3.d<c.a> dVar = pVar.f186891e.f186917d;
                            if (dVar != null) {
                                dVar.accept(c.a.C5485a.f186913a);
                            }
                            ((f) lVar3).invoke(Boolean.valueOf(!bVar3.f186799n));
                            break;
                        default:
                            int i14 = p.f186887n;
                            com.jakewharton.rxrelay3.d<c.a> dVar2 = pVar.f186891e.f186917d;
                            if (dVar2 != null) {
                                dVar2.accept(c.a.C5485a.f186913a);
                            }
                            ((g) lVar3).invoke(Boolean.valueOf(!bVar3.f186788A));
                            break;
                    }
                }
            });
        }
        View view2 = this.f186890d;
        if (view2 != null) {
            final int i13 = 1;
            view2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.messenger.channels.adapter.konveyor.channel.n

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ p f186882c;

                {
                    this.f186882c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    Y41.l lVar3 = lVar2;
                    ChannelsListItem.b bVar3 = bVar;
                    p pVar = this.f186882c;
                    switch (i13) {
                        case 0:
                            int i132 = p.f186887n;
                            com.jakewharton.rxrelay3.d<c.a> dVar = pVar.f186891e.f186917d;
                            if (dVar != null) {
                                dVar.accept(c.a.C5485a.f186913a);
                            }
                            ((f) lVar3).invoke(Boolean.valueOf(!bVar3.f186799n));
                            break;
                        default:
                            int i14 = p.f186887n;
                            com.jakewharton.rxrelay3.d<c.a> dVar2 = pVar.f186891e.f186917d;
                            if (dVar2 != null) {
                                dVar2.accept(c.a.C5485a.f186913a);
                            }
                            ((g) lVar3).invoke(Boolean.valueOf(!bVar3.f186788A));
                            break;
                    }
                }
            });
        }
        boolean z13 = bVar.f186803r;
        boolean z14 = z12 || z13;
        View view3 = this.f186888b;
        SwipeLayout swipeLayout = view3 instanceof SwipeLayout ? (SwipeLayout) view3 : null;
        if (swipeLayout != null) {
            swipeLayout.setLeftSwipeEnabled(z14);
        }
        boolean z15 = bVar.f186799n;
        if (view != null) {
            if (z13) {
                ?? r92 = this.f186897k;
                ?? r12 = this.f186896j;
                if (z15) {
                    D6.H(view);
                    ImageView imageView = (ImageView) r12.getValue();
                    if (imageView != null) {
                        imageView.setImageResource(R.drawable.ic_messenger_chat_unread_24);
                    }
                    TextView textView = (TextView) r92.getValue();
                    if (textView != null) {
                        textView.setText(view3.getContext().getString(R.string.messenger_channels_list_mark_as_unread_action_title));
                    }
                } else {
                    D6.H(view);
                    TextView textView2 = (TextView) r92.getValue();
                    if (textView2 != null) {
                        textView2.setText(view3.getContext().getString(R.string.messenger_channels_list_mark_as_read_action_title));
                    }
                    ImageView imageView2 = (ImageView) r12.getValue();
                    if (imageView2 != null) {
                        imageView2.setImageResource(R.drawable.ic_messenger_chat_read_24);
                    }
                }
            } else {
                D6.w(view);
            }
        }
        boolean z16 = bVar.f186788A;
        if (view2 != null) {
            if (z12) {
                ?? r93 = this.f186898l;
                ?? r02 = this.f186899m;
                if (z16) {
                    D6.H(view2);
                    TextView textView3 = (TextView) r02.getValue();
                    if (textView3 != null) {
                        textView3.setText(view3.getContext().getString(R.string.messenger_channels_list_unpin_action_title));
                    }
                    ImageView imageView3 = (ImageView) r93.getValue();
                    if (imageView3 != null) {
                        imageView3.setImageResource(R.drawable.ic_messenger_pin_off_solid_24);
                    }
                } else {
                    D6.H(view2);
                    TextView textView4 = (TextView) r02.getValue();
                    if (textView4 != null) {
                        textView4.setText(view3.getContext().getString(R.string.messenger_channels_list_pin_action_title));
                    }
                    ImageView imageView4 = (ImageView) r93.getValue();
                    if (imageView4 != null) {
                        imageView4.setImageResource(R.drawable.ic_messenger_pin_solid_24);
                    }
                }
            } else {
                D6.w(view2);
            }
        }
        ChatListElement chatListElement = this.f186894h;
        chatListElement.c(new b(aVar));
        chatListElement.m(new o(0, aVar3));
        chatListElement.a(bVar.f186791f);
        chatListElement.k(bVar.f186792g);
        ChannelsListItem.b.a aVar5 = bVar.f186793h;
        chatListElement.j(aVar5 != null ? aVar5.f186812a : null, aVar5 != null ? aVar5.f186813b : null, bVar.f186807v);
        ChatListElement.LastMessageType lastMessageType = ChatListElement.LastMessageType.f197472h;
        ChatListElement.LastMessageType lastMessageType2 = bVar.f186800o;
        chatListElement.b0(lastMessageType2 != lastMessageType ? bVar.f186796k : null);
        chatListElement.e(bVar.f186797l);
        chatListElement.h(bVar.f186808w);
        Image image = bVar.f186798m;
        chatListElement.f(image != null ? com.avito.android.image_loader.b.b(image) : null, bVar.f186810y);
        chatListElement.i(z15);
        chatListElement.b(lastMessageType2, bVar.f186801p);
        chatListElement.n(z15, lastMessageType2);
        chatListElement.g(bVar.f186802q);
        chatListElement.d(bVar.f186794i);
        chatListElement.l(z16);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        ((View) this.f186895i.getValue()).setOnClickListener(null);
        ChatListElement chatListElement = this.f186894h;
        chatListElement.c(f.f186906l);
        chatListElement.m(new l(0));
        this.f186893g = false;
        this.f186892f = null;
        com.avito.android.messenger.channels.adapter.konveyor.common.swipable.d dVar = this.f186891e;
        dVar.f186921h.e();
        ObjectAnimator objectAnimator = dVar.f186920g.get();
        if (objectAnimator != null) {
            dVar.f186920g.clear();
            if (objectAnimator.isRunning()) {
                objectAnimator.end();
            }
        }
        SwipeLayout swipeLayoutA = dVar.a();
        if (swipeLayoutA.f436726e != null) {
            swipeLayoutA.f436723b.a();
            swipeLayoutA.b(null, -swipeLayoutA.f436726e.getLeft());
        }
        dVar.a().setOnSwipeListener(null);
        dVar.f186917d = null;
        dVar.f186918e = null;
    }

    /* compiled from: ChannelItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/messenger/channels/adapter/konveyor/channel/p$a", "Landroid/view/View$OnAttachStateChangeListener;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@Y61.k View view) {
            Y41.a<G0> aVar = p.this.f186892f;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@Y61.k View view) {
        }
    }
}

package com.avito.android.messenger.channels.adapter.konveyor.channel;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.C30277e1;
import com.avito.android.R;
import com.avito.android.messenger.channels.adapter.ChannelsListItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelItemBlueprint.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/konveyor/channel/a;", "LTV0/b;", "Lcom/avito/android/messenger/channels/adapter/konveyor/channel/k;", "Lcom/avito/android/messenger/channels/adapter/ChannelsListItem$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements TV0.b<k, ChannelsListItem.b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f186832a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f186833b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final JY.a f186834c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<p> f186835d = new g.a<>(R.layout.chat_list_element_swipable, new C5483a());

    /* compiled from: ChannelItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/messenger/channels/adapter/konveyor/channel/p;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/messenger/channels/adapter/konveyor/channel/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.adapter.konveyor.channel.a$a, reason: collision with other inner class name */
    public static final class C5483a extends N implements Y41.p<ViewGroup, View, p> {
        public C5483a() {
            super(2);
        }

        @Override // Y41.p
        public final p invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            View viewFindViewById = view2.findViewById(R.id.chat_list_element_swipe_mark_as_read_view);
            View viewFindViewById2 = view2.findViewById(R.id.chat_list_element_swipe_pin_view);
            C30277e1 c30277e1 = a.this.f186833b;
            c30277e1.getClass();
            kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[62];
            return new p(view2, viewFindViewById, viewFindViewById2, ((Boolean) c30277e1.f145020j0.a().invoke()).booleanValue());
        }
    }

    @Inject
    public a(@Y61.k c cVar, @Y61.k C30277e1 c30277e1, @Y61.k JY.a aVar) {
        this.f186832a = cVar;
        this.f186833b = c30277e1;
        this.f186834c = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f186832a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<p> b() {
        return this.f186835d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof ChannelsListItem.b) {
            JY.a aVar2 = this.f186834c;
            if (aVar2.x() || aVar2.t() || aVar2.p()) {
                return true;
            }
        }
        return false;
    }
}

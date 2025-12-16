package com.avito.android.messenger.channels.adapter.konveyor.channel.global;

import TV0.g;
import Y41.p;
import Y61.k;
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
import kotlin.reflect.n;

/* compiled from: ChannelItemBlueprintGlobal.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/konveyor/channel/global/a;", "LTV0/b;", "Lcom/avito/android/messenger/channels/adapter/konveyor/channel/global/g;", "Lcom/avito/android/messenger/channels/adapter/ChannelsListItem$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements TV0.b<g, ChannelsListItem.b> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f186851a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C30277e1 f186852b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final JY.a f186853c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f186854d = new g.a<>(R.layout.chat_list_element, new C5484a());

    /* compiled from: ChannelItemBlueprintGlobal.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/messenger/channels/adapter/konveyor/channel/global/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/messenger/channels/adapter/konveyor/channel/global/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.adapter.konveyor.channel.global.a$a, reason: collision with other inner class name */
    public static final class C5484a extends N implements p<ViewGroup, View, h> {
        public C5484a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            C30277e1 c30277e1 = a.this.f186852b;
            c30277e1.getClass();
            n<Object> nVar = C30277e1.f144946d1[62];
            return new h(view, ((Boolean) c30277e1.f145020j0.a().invoke()).booleanValue());
        }
    }

    @Inject
    public a(@k c cVar, @k C30277e1 c30277e1, @k JY.a aVar) {
        this.f186851a = cVar;
        this.f186852b = c30277e1;
        this.f186853c = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f186851a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f186854d;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        if (aVar instanceof ChannelsListItem.b) {
            JY.a aVar2 = this.f186853c;
            if (!aVar2.x() && !aVar2.t() && !aVar2.p()) {
                return true;
            }
        }
        return false;
    }
}

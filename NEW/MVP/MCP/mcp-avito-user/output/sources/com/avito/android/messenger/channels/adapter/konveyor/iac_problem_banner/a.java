package com.avito.android.messenger.channels.adapter.konveyor.iac_problem_banner;

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
import ur.InterfaceC49101b;

/* compiled from: ChannelsIacProblemBannerBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/konveyor/iac_problem_banner/a;", "LTV0/b;", "Lcom/avito/android/messenger/channels/adapter/konveyor/iac_problem_banner/m;", "Lcom/avito/android/messenger/channels/adapter/ChannelsListItem$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements TV0.b<m, ChannelsListItem.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f186927a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f186928b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49101b f186929c;

    /* compiled from: ChannelsIacProblemBannerBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/messenger/channels/adapter/konveyor/iac_problem_banner/o;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/messenger/channels/adapter/konveyor/iac_problem_banner/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.adapter.konveyor.iac_problem_banner.a$a, reason: collision with other inner class name */
    public static final class C5486a extends N implements Y41.p<ViewGroup, View, o> {
        public C5486a() {
            super(2);
        }

        @Override // Y41.p
        public final o invoke(ViewGroup viewGroup, View view) {
            return new o(view, a.this.f186929c.d());
        }
    }

    /* compiled from: ChannelsIacProblemBannerBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/messenger/channels/adapter/konveyor/iac_problem_banner/p;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/messenger/channels/adapter/konveyor/iac_problem_banner/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<ViewGroup, View, p> {
        public b() {
            super(2);
        }

        @Override // Y41.p
        public final p invoke(ViewGroup viewGroup, View view) {
            return new p(view, a.this.f186929c.d());
        }
    }

    @Inject
    public a(@Y61.k c cVar, @Y61.k C30277e1 c30277e1, @Y61.k InterfaceC49101b interfaceC49101b) {
        this.f186927a = cVar;
        this.f186928b = c30277e1;
        this.f186929c = interfaceC49101b;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f186927a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        C30277e1 c30277e1 = this.f186928b;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[64];
        return ((Boolean) c30277e1.f145024l0.a().invoke()).booleanValue() ? new g.a<>(R.layout.messenger_iac_problem_banner_card, new C5486a()) : new g.a<>(R.layout.messenger_iac_problem_banner_card_old, new b());
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof ChannelsListItem.d;
    }
}

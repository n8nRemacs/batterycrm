package com.avito.android.messenger.channels.adapter.konveyor.notifications_banner;

import android.view.View;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import com.avito.android.messenger.channels.adapter.ChannelsListItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ChannelsNotificationsBannerView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/konveyor/notifications_banner/b;", "Lcom/avito/android/messenger/channels/adapter/konveyor/notifications_banner/w;", "Lcom/avito/konveyor/adapter/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b extends com.avito.konveyor.adapter.b implements w {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f186982b;

    /* compiled from: ChannelsNotificationsBannerView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ChannelsListItem.e f186983l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b f186984m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f186985n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f186986o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ChannelsListItem.e eVar, b bVar, Y41.a<G0> aVar, Y41.a<G0> aVar2) {
            super(2);
            this.f186983l = eVar;
            this.f186984m = bVar;
            this.f186985n = aVar;
            this.f186986o = aVar2;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(-21792374, new C31692a(this.f186983l, this.f186984m, this.f186985n, this.f186986o), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    public b(@Y61.k View view, boolean z12) {
        super(view);
        this.f186982b = z12;
    }

    @Override // com.avito.android.messenger.channels.adapter.konveyor.notifications_banner.w
    public final void uq(@Y61.k ChannelsListItem.e eVar, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2) {
        View view = this.itemView;
        ComposeView composeView = view instanceof ComposeView ? (ComposeView) view : null;
        if (composeView != null) {
            composeView.setContent(new C22096n(-696497105, new a(eVar, this, aVar, aVar2), true));
        }
    }
}

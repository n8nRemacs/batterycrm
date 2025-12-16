package com.avito.android.str_cancellation_settings.deeplink;

import Ju.AbstractC14250d;
import com.avito.android.str_cancellation_settings.analytics.FromPageLabel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StrCancellationSettingsLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f288294l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ StrCancellationSettingsDeeplink f288295m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, StrCancellationSettingsDeeplink strCancellationSettingsDeeplink) {
        super(0);
        this.f288294l = bVar;
        this.f288295m = strCancellationSettingsDeeplink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        b bVar = this.f288294l;
        StrCancellationSettingsDeeplink strCancellationSettingsDeeplink = this.f288295m;
        long j12 = strCancellationSettingsDeeplink.f288291b;
        FromPageLabel.a aVar = FromPageLabel.f288145c;
        bVar.f288298h.R(bVar.f288296f.a(j12, strCancellationSettingsDeeplink.f288292c, strCancellationSettingsDeeplink.f288293d, "refund_banner"), com.avito.android.deeplink_handler.view.b.f134588l);
        bVar.j(AbstractC14250d.c.f9171c);
        return G0.f406611a;
    }
}

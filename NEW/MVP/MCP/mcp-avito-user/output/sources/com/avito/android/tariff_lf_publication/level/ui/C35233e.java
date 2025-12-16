package com.avito.android.tariff_lf_publication.level.ui;

import UD0.a;
import UD0.c;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TariffLfPublicationLevelFeature.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.tariff_lf_publication.level.ui.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35233e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c.b.a f300964l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<UD0.a, G0> f300965m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C35233e(c.b.a aVar, Y41.l<? super UD0.a, G0> lVar) {
        super(0);
        this.f300964l = aVar;
        this.f300965m = lVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink = this.f300964l.f16295d;
        if (deepLink != null) {
            this.f300965m.invoke(new a.b(deepLink));
        }
        return G0.f406611a;
    }
}

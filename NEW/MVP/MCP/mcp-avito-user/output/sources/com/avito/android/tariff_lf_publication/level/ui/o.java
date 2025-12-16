package com.avito.android.tariff_lf_publication.level.ui;

import UD0.a;
import UD0.c;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TariffLfPublicationLevelInfo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class o extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c.b.C1110b f300991l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<UD0.a, G0> f300992m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(c.b.C1110b c1110b, Y41.l<? super UD0.a, G0> lVar) {
        super(1);
        this.f300991l = c1110b;
        this.f300992m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        num.intValue();
        DeepLink deepLink = this.f300991l.f16299d;
        if (deepLink != null) {
            this.f300992m.invoke(new a.b(deepLink));
        }
        return G0.f406611a;
    }
}

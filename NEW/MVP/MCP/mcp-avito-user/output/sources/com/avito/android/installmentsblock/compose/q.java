package com.avito.android.installmentsblock.compose;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.installments_block.entity.InstallmentsPriceInfo;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InstallmentsBlock.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class q extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f172949l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AttributedText f172950m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f172951n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f172952o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InstallmentsPriceInfo.PriceBadge f172953p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f172954q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str, AttributedText attributedText, Y41.l lVar, v vVar, InstallmentsPriceInfo.PriceBadge priceBadge, int i12) {
        super(2);
        this.f172949l = str;
        this.f172950m = attributedText;
        this.f172951n = lVar;
        this.f172952o = vVar;
        this.f172953p = priceBadge;
        this.f172954q = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f172954q | 1);
        AttributedText attributedText = this.f172950m;
        Y41.l<DeepLink, G0> lVar = this.f172951n;
        b.g(this.f172949l, attributedText, lVar, this.f172952o, this.f172953p, a12, iA2);
        return G0.f406611a;
    }
}

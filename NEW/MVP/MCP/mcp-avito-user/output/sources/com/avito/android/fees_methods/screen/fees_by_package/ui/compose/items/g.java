package com.avito.android.fees_methods.screen.fees_by_package.ui.compose.items;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.fees_methods.screen.fees_by_package.mvi.entity.FeesByPackageState;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FeesByPackageFooter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class g extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ FeesByPackageState.Button f158125l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AttributedText f158126m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<FE.a, G0> f158127n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f158128o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v f158129p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(FeesByPackageState.Button button, AttributedText attributedText, Y41.l lVar, boolean z12, v vVar, int i12) {
        super(2);
        this.f158125l = button;
        this.f158126m = attributedText;
        this.f158127n = lVar;
        this.f158128o = z12;
        this.f158129p = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(65);
        AttributedText attributedText = this.f158126m;
        Y41.l<FE.a, G0> lVar = this.f158127n;
        m.a(this.f158125l, attributedText, lVar, this.f158128o, a12, iA2);
        return G0.f406611a;
    }
}

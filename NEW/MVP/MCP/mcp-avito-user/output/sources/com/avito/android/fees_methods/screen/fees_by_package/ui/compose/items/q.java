package com.avito.android.fees_methods.screen.fees_by_package.ui.compose.items;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.fees_methods.screen.fees_by_package.mvi.entity.FeesByPackageState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FeesByPackageSnippetItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class q extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ FeesByPackageState.e f158146l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f158147m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f158148n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(FeesByPackageState.e eVar, v vVar, int i12) {
        super(2);
        this.f158146l = eVar;
        this.f158147m = vVar;
        this.f158148n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f158148n | 1);
        t.a(this.f158146l, this.f158147m, a12, iA2);
        return G0.f406611a;
    }
}

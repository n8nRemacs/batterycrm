package com.avito.android.fees_methods.screen.fees_by_package.ui.compose.items;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.fees_methods.screen.fees_by_package.mvi.entity.FeesByPackageState;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FeesByPackageBulletsList.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class e extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<FeesByPackageState.b> f158121l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<FE.a, G0> f158122m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f158123n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f158124o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i12, Y41.l lVar, v vVar, List list) {
        super(2);
        this.f158121l = list;
        this.f158122m = lVar;
        this.f158123n = vVar;
        this.f158124o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f158124o | 1);
        v vVar = this.f158123n;
        List<FeesByPackageState.b> list = this.f158121l;
        f.a(iA2, this.f158122m, a12, vVar, list);
        return G0.f406611a;
    }
}

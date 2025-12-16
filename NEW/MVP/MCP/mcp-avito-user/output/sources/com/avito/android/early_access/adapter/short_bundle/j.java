package com.avito.android.early_access.adapter.short_bundle;

import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.internal.C22096n;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: EarlyAccessShortBundle.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class j extends N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<EarlyAccessShortBundleItem> f145206l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f145207m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<EarlyAccessShortBundleItem, G0> f145208n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(List<EarlyAccessShortBundleItem> list, float f12, Y41.l<? super EarlyAccessShortBundleItem, G0> lVar) {
        super(1);
        this.f145206l = list;
        this.f145207m = f12;
        this.f145208n = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        m0 m0Var2 = m0Var;
        a.f145188a.getClass();
        m0Var2.c(null, null, a.f145189b);
        f fVar = f.f145200l;
        List<EarlyAccessShortBundleItem> list = this.f145206l;
        m0Var2.a(list.size(), null, new h(fVar, list), new C22096n(-632812321, new i(list, this.f145207m, this.f145208n), true));
        m0Var2.c(null, null, a.f145190c);
        return G0.f406611a;
    }
}

package com.avito.android.user_stats.extended_user_stats.metrics;

import com.avito.android.user_stats.extended_user_stats.metrics.item.DataMetrics;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MetricsBottomSheetDialog.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f317283l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar) {
        super(0);
        this.f317283l = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        a aVar = this.f317283l;
        aVar.f317276c = "";
        ArrayList arrayListB = aVar.b(null);
        DataMetrics dataMetrics = aVar.f317274a;
        aVar.c(arrayListB, (dataMetrics != null ? dataMetrics : null).f317288c);
        return G0.f406611a;
    }
}

package com.avito.android.lib.compose.design.shared.benchmark;

import androidx.compose.runtime.A;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;

/* compiled from: BenchmarkComposeActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class a extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<U2.b> f177623l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C42784z0 f177624m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(List list, C42784z0 c42784z0) {
        super(2);
        this.f177623l = list;
        this.f177624m = c42784z0;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            o.a(this.f177623l, this.f177624m, a13, 56);
        }
        return G0.f406611a;
    }
}

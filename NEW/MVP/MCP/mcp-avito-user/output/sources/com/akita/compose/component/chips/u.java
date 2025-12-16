package com.akita.compose.component.chips;

import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.internal.C22096n;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Chips.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class u extends N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f60969l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y f60970m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ N f60971n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f60972o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(ArrayList arrayList, y yVar, Y41.p pVar, C22096n c22096n) {
        super(1);
        this.f60969l = arrayList;
        this.f60970m = yVar;
        this.f60971n = (N) pVar;
        this.f60972o = c22096n;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        ArrayList arrayList = this.f60969l;
        m0Var.a(arrayList.size(), null, new s(arrayList), new C22096n(-1091073711, new t(arrayList, this.f60970m, this.f60971n, this.f60972o), true));
        return G0.f406611a;
    }
}

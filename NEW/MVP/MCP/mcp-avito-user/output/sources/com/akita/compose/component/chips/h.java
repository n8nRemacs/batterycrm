package com.akita.compose.component.chips;

import androidx.compose.foundation.layout.V1;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Chips.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class h extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<InterfaceC27333b> f60897l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y f60898m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<Integer, InterfaceC27333b, G0> f60899n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f60900o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C22096n f60901p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f60902q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f60903r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(List list, y yVar, Y41.p pVar, androidx.compose.ui.v vVar, V1 v12, C22096n c22096n, int i12, int i13) {
        super(2);
        ChipsDisplayType chipsDisplayType = ChipsDisplayType.f60861b;
        this.f60897l = list;
        this.f60898m = yVar;
        this.f60899n = pVar;
        this.f60900o = vVar;
        this.f60901p = c22096n;
        this.f60902q = i12;
        this.f60903r = i13;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        num.intValue();
        int iA2 = C22066f2.a(this.f60902q | 1);
        ChipsDisplayType chipsDisplayType = ChipsDisplayType.f60861b;
        d.a(this.f60897l, this.f60898m, this.f60899n, this.f60900o, this.f60901p, a13, iA2, this.f60903r);
        return G0.f406611a;
    }
}

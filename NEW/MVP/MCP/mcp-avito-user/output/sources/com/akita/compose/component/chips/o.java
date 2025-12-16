package com.akita.compose.component.chips;

import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Chips.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class o extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<InterfaceC27333b> f60951l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y f60952m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ChipsDisplayType f60953n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f60954o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ T1 f60955p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22096n f60956q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f60957r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(List list, y yVar, ChipsDisplayType chipsDisplayType, androidx.compose.ui.v vVar, T1 t12, C22096n c22096n, int i12) {
        super(2);
        this.f60951l = list;
        this.f60952m = yVar;
        this.f60953n = chipsDisplayType;
        this.f60954o = vVar;
        this.f60955p = t12;
        this.f60956q = c22096n;
        this.f60957r = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f60957r | 1);
        C22096n c22096n = this.f60956q;
        androidx.compose.ui.v vVar = this.f60954o;
        T1 t12 = this.f60955p;
        d.c(this.f60951l, this.f60952m, this.f60953n, vVar, t12, c22096n, a12, iA2);
        return G0.f406611a;
    }
}

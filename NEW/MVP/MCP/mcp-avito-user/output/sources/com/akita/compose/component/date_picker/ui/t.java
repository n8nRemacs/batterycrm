package com.akita.compose.component.date_picker.ui;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WeekDaysHeader.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class t extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<String> f61400l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.foundation.r f61401m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.foundation.p f61402n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f61403o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v f61404p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f61405q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(List list, com.akita.compose.foundation.r rVar, com.akita.compose.foundation.p pVar, float f12, v vVar, int i12) {
        super(2);
        this.f61400l = list;
        this.f61401m = rVar;
        this.f61402n = pVar;
        this.f61403o = f12;
        this.f61404p = vVar;
        this.f61405q = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f61405q | 1);
        com.akita.compose.foundation.r rVar = this.f61401m;
        com.akita.compose.foundation.p pVar = this.f61402n;
        u.b(this.f61400l, rVar, pVar, this.f61403o, this.f61404p, a12, iA2);
        return G0.f406611a;
    }
}

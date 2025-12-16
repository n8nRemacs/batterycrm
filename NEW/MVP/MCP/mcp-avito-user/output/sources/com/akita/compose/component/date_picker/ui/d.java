package com.akita.compose.component.date_picker.ui;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.akita.compose.component.date_picker.F;
import com.akita.compose.component.date_picker.data.DayRangeType;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DayItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class d extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f61300l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DayRangeType f61301m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f61302n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ F f61303o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f61304p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f61305q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f61306r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f61307s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f61308t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f61309u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f61310v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v.a f61311w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f61312x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f61313y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, DayRangeType dayRangeType, boolean z12, F f12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, v.a aVar, Y41.a aVar2, int i12) {
        super(2);
        this.f61300l = str;
        this.f61301m = dayRangeType;
        this.f61302n = z12;
        this.f61303o = f12;
        this.f61304p = z13;
        this.f61305q = z14;
        this.f61306r = z15;
        this.f61307s = z16;
        this.f61308t = z17;
        this.f61309u = z18;
        this.f61310v = z19;
        this.f61311w = aVar;
        this.f61312x = aVar2;
        this.f61313y = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f61313y | 1);
        DayRangeType dayRangeType = this.f61301m;
        boolean z12 = this.f61309u;
        boolean z13 = this.f61310v;
        i.a(this.f61300l, dayRangeType, this.f61302n, this.f61303o, this.f61304p, this.f61305q, this.f61306r, this.f61307s, this.f61308t, z12, z13, this.f61311w, this.f61312x, a12, iA2);
        return G0.f406611a;
    }
}

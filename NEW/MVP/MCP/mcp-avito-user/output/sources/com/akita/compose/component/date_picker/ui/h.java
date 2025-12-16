package com.akita.compose.component.date_picker.ui;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.akita.compose.component.date_picker.F;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DayItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class h extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f61349l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.skeleton.d f61350m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ F.b f61351n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f61352o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f61353p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(long j12, com.akita.compose.component.skeleton.d dVar, F.b bVar, v vVar, int i12) {
        super(2);
        this.f61349l = j12;
        this.f61350m = dVar;
        this.f61351n = bVar;
        this.f61352o = vVar;
        this.f61353p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        i.c(this.f61349l, this.f61350m, this.f61351n, this.f61352o, a12, C22066f2.a(this.f61353p | 1));
        return G0.f406611a;
    }
}

package com.akita.compose.component.date_picker.ui;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.akita.compose.component.date_picker.F;
import com.akita.compose.component.date_picker.K;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DatePickerContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class b extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K f61293l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ F f61294m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Long, G0> f61295n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Long, Boolean> f61296o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Long, Boolean> f61297p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ v f61298q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f61299r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(K k12, F f12, Y41.l lVar, Y41.l lVar2, Y41.l lVar3, v vVar, int i12) {
        super(2);
        this.f61293l = k12;
        this.f61294m = f12;
        this.f61295n = lVar;
        this.f61296o = lVar2;
        this.f61297p = lVar3;
        this.f61298q = vVar;
        this.f61299r = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f61299r | 1);
        Y41.l<Long, G0> lVar = this.f61295n;
        Y41.l<Long, Boolean> lVar2 = this.f61296o;
        c.a(this.f61293l, this.f61294m, lVar, lVar2, this.f61297p, this.f61298q, a12, iA2);
        return G0.f406611a;
    }
}

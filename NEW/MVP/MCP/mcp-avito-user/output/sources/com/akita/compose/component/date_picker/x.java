package com.akita.compose.component.date_picker;

import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DatePickerBottomSheet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class x extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.navbar.u f61428l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f61429m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f61430n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f61431o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f61432p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f61433q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.akita.compose.component.navbar.u uVar, int i12, Y41.a aVar, Y41.a aVar2, androidx.compose.ui.v vVar, int i13) {
        super(2);
        this.f61428l = uVar;
        this.f61429m = i12;
        this.f61430n = aVar;
        this.f61431o = aVar2;
        this.f61432p = vVar;
        this.f61433q = i13;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f61433q | 1);
        int i12 = this.f61429m;
        Y41.a<G0> aVar = this.f61430n;
        y.d(this.f61428l, i12, aVar, this.f61431o, this.f61432p, a12, iA2);
        return G0.f406611a;
    }
}

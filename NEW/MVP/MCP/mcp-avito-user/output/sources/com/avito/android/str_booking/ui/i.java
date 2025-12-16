package com.avito.android.str_booking.ui;

import com.avito.android.str_booking.mvi.entity.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StrBookingView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f286044l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b.j f286045m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f286046n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f fVar, b.j jVar, com.avito.android.lib.design.bottom_sheet.d dVar) {
        super(0);
        this.f286044l = fVar;
        this.f286045m = jVar;
        this.f286046n = dVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f286044l.f286019f.accept(this.f286045m.f285812e);
        this.f286046n.r();
        return G0.f406611a;
    }
}

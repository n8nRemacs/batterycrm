package com.avito.android.sx_address.entry;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SxAddressEntryScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class i extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.sx_address.entry.domain.a f292943l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f292944m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f292945n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f292946o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.avito.android.sx_address.entry.domain.a aVar, Y41.a aVar2, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f292943l = aVar;
        this.f292944m = aVar2;
        this.f292945n = vVar;
        this.f292946o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f292946o | 1);
        androidx.compose.ui.v vVar = this.f292945n;
        s.b(this.f292943l, this.f292944m, vVar, a12, iA2);
        return G0.f406611a;
    }
}

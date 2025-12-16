package com.akita.compose.component.bottom_sheet.internal;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.window.H;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BottomSheetDialog.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class f extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f60621l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ H f60622m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f60623n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f60624o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Y41.a aVar, H h12, C22096n c22096n, int i12) {
        super(2);
        this.f60621l = aVar;
        this.f60622m = h12;
        this.f60623n = c22096n;
        this.f60624o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f60624o | 1);
        C22096n c22096n = this.f60623n;
        j.a(this.f60621l, this.f60622m, c22096n, a12, iA2);
        return G0.f406611a;
    }
}

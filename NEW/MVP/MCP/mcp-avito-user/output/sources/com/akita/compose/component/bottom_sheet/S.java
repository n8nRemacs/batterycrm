package com.akita.compose.component.bottom_sheet;

import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DragHandle.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class S extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f60558l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ O f60559m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f60560n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(androidx.compose.ui.v vVar, O o12, int i12) {
        super(2);
        this.f60558l = vVar;
        this.f60559m = o12;
        this.f60560n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f60560n | 1);
        T.a(this.f60558l, this.f60559m, a12, iA2);
        return G0.f406611a;
    }
}

package com.avito.android.favorites.compose.items_remove_sheet_global;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ItemsRemoveBottomSheet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class d extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f156834l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f156835m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f156836n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(int i12, Y41.a aVar, v vVar) {
        super(2);
        this.f156834l = vVar;
        this.f156835m = (N) aVar;
        this.f156836n = i12;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        m.d(C22066f2.a(this.f156836n | 1), this.f156835m, a12, this.f156834l);
        return G0.f406611a;
    }
}

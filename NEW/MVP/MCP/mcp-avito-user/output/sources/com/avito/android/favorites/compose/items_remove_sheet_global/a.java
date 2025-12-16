package com.avito.android.favorites.compose.items_remove_sheet_global;

import Y41.p;
import androidx.compose.foundation.layout.K;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.akita.compose.component.button.t;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ItemsRemoveBottomSheet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class a extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K f156819l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f156820m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t f156821n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v.a f156822o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ N f156823p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f156824q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(K k12, String str, t tVar, v.a aVar, Y41.a aVar2, int i12) {
        super(2);
        this.f156819l = k12;
        this.f156820m = str;
        this.f156821n = tVar;
        this.f156822o = aVar;
        this.f156823p = (N) aVar2;
        this.f156824q = i12;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f156824q | 1);
        ?? r42 = this.f156823p;
        t tVar = this.f156821n;
        v.a aVar = this.f156822o;
        m.a(this.f156819l, this.f156820m, tVar, aVar, r42, a12, iA2);
        return G0.f406611a;
    }
}

package com.avito.android.advert_collection_list.actions;

import Y41.l;
import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CollectionActionsBottomSheet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class d extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.collections.builders.b f82011l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l<a, G0> f82012m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f82013n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f82014o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kotlin.collections.builders.b bVar, l lVar, v vVar, int i12) {
        super(2);
        this.f82011l = bVar;
        this.f82012m = lVar;
        this.f82013n = vVar;
        this.f82014o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f82014o | 1);
        l<a, G0> lVar = this.f82012m;
        b.b(this.f82011l, lVar, a12, iA2);
        return G0.f406611a;
    }
}

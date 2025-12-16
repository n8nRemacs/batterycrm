package com.avito.android.mortgage.root.list.items.team;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TeamItemScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class e extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f202861l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f202862m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f202863n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, Y41.l lVar, v vVar, int i12) {
        super(2);
        this.f202861l = cVar;
        this.f202862m = lVar;
        this.f202863n = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(9);
        h.a(this.f202861l, this.f202862m, a12, iA2);
        return G0.f406611a;
    }
}

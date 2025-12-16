package com.akita.compose.component.date_picker.ui;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.akita.compose.component.date_picker.F;
import com.akita.compose.component.date_picker.K;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MonthTitle.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class m extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f61364l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ K f61365m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.foundation.r f61366n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.skeleton.d f61367o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ F.b f61368p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ v f61369q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, K k12, com.akita.compose.foundation.r rVar, com.akita.compose.component.skeleton.d dVar, F.b bVar, v vVar, int i12) {
        super(2);
        this.f61364l = str;
        this.f61365m = k12;
        this.f61366n = rVar;
        this.f61367o = dVar;
        this.f61368p = bVar;
        this.f61369q = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1);
        com.akita.compose.foundation.r rVar = this.f61366n;
        com.akita.compose.component.skeleton.d dVar = this.f61367o;
        n.a(this.f61364l, this.f61365m, rVar, dVar, this.f61368p, this.f61369q, a12, iA2);
        return G0.f406611a;
    }
}

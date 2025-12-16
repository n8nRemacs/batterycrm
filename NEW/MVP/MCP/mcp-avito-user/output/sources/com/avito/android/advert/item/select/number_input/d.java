package com.avito.android.advert.item.select.number_input;

import Y41.l;
import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;

/* compiled from: AutoSelectNumberInput.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class d extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f79512l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ H f79513m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ N f79514n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ N f79515o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v f79516p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.input.v f79517q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f79518r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f79519s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(f fVar, l<? super String, G0> lVar, p<? super String, ? super String, G0> pVar, l<? super DeepLink, G0> lVar2, v vVar, com.akita.compose.component.input.v vVar2, int i12, int i13) {
        super(2);
        this.f79512l = fVar;
        this.f79513m = (H) lVar;
        this.f79514n = (N) pVar;
        this.f79515o = (N) lVar2;
        this.f79516p = vVar;
        this.f79517q = vVar2;
        this.f79518r = i12;
        this.f79519s = i13;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.H] */
    /* JADX WARN: Type inference failed for: r2v0, types: [Y41.p, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r3v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f79518r | 1);
        com.akita.compose.component.input.v vVar = this.f79517q;
        ?? r12 = this.f79513m;
        ?? r22 = this.f79514n;
        ?? r32 = this.f79515o;
        e.a(this.f79512l, r12, r22, r32, vVar, a12, iA2, this.f79519s);
        return G0.f406611a;
    }
}

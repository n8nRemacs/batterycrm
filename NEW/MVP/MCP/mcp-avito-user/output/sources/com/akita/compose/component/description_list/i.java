package com.akita.compose.component.description_list;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DescriptionList.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class i extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22602e f61482l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22602e f61483m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f61484n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a f61485o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f61486p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ v f61487q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f61488r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f61489s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(C22602e c22602e, C22602e c22602e2, boolean z12, a aVar, j jVar, v vVar, boolean z13, int i12) {
        super(2);
        this.f61482l = c22602e;
        this.f61483m = c22602e2;
        this.f61484n = z12;
        this.f61485o = aVar;
        this.f61486p = jVar;
        this.f61487q = vVar;
        this.f61488r = z13;
        this.f61489s = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f61489s | 1);
        C22602e c22602e = this.f61482l;
        C22602e c22602e2 = this.f61483m;
        a aVar = this.f61485o;
        j jVar = this.f61486p;
        d.c(c22602e, c22602e2, this.f61484n, aVar, jVar, this.f61487q, this.f61488r, a12, iA2);
        return G0.f406611a;
    }
}

package com.akita.compose.component.tooltip;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.text.C22602e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Tooltip.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class m extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f63518l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f63519m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22602e f63520n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22602e f63521o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f63522p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f63523q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f63524r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f63525s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f63526t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r rVar, androidx.compose.ui.v vVar, C22602e c22602e, C22602e c22602e2, String str, Y41.a aVar, Y41.a aVar2, boolean z12, int i12) {
        super(2);
        this.f63518l = rVar;
        this.f63519m = vVar;
        this.f63520n = c22602e;
        this.f63521o = c22602e2;
        this.f63522p = str;
        this.f63523q = aVar;
        this.f63524r = aVar2;
        this.f63525s = z12;
        this.f63526t = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f63526t | 1);
        String str = this.f63522p;
        Y41.a<G0> aVar = this.f63523q;
        k.c(this.f63518l, this.f63519m, this.f63520n, this.f63521o, str, aVar, this.f63524r, this.f63525s, a12, iA2);
        return G0.f406611a;
    }
}

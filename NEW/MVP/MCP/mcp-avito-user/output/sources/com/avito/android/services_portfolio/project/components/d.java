package com.avito.android.services_portfolio.project.components;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExpandableText.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class d extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f280163l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f280164m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f280165n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f280166o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i12, int i13, Y41.a aVar, v vVar, String str) {
        super(2);
        this.f280163l = str;
        this.f280164m = vVar;
        this.f280165n = aVar;
        this.f280166o = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(433);
        String str = this.f280163l;
        v vVar = this.f280164m;
        e.a(iA2, this.f280166o, this.f280165n, a12, vVar, str);
        return G0.f406611a;
    }
}

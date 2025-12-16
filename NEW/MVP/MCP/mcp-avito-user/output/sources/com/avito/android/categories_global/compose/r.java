package com.avito.android.categories_global.compose;

import Ln.C14417b;
import Ln.C14418c;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CategoriesScreenContentUi.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class r extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f116365l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f116366m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C14418c f116367n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<C14417b, G0> f116368o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v.a f116369p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f116370q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(boolean z12, String str, C14418c c14418c, Y41.l lVar, v.a aVar, int i12) {
        super(2);
        this.f116365l = z12;
        this.f116366m = str;
        this.f116367n = c14418c;
        this.f116368o = lVar;
        this.f116369p = aVar;
        this.f116370q = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f116370q | 1);
        C14418c c14418c = this.f116367n;
        g.c(this.f116365l, this.f116366m, c14418c, this.f116368o, this.f116369p, a12, iA2);
        return G0.f406611a;
    }
}

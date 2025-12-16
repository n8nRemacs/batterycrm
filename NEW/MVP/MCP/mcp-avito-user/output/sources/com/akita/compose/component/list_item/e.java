package com.akita.compose.component.list_item;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ListItemCheckmark.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class e extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f61872l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f61873m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s f61874n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f61875o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C22096n f61876p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22096n f61877q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f61878r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f61879s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, boolean z12, s sVar, androidx.compose.ui.v vVar, C22096n c22096n, C22096n c22096n2, int i12, int i13) {
        super(2);
        this.f61872l = str;
        this.f61873m = z12;
        this.f61874n = sVar;
        this.f61875o = vVar;
        this.f61876p = c22096n;
        this.f61877q = c22096n2;
        this.f61878r = i12;
        this.f61879s = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f61878r | 1);
        androidx.compose.ui.v vVar = this.f61875o;
        h.b(this.f61872l, this.f61873m, this.f61874n, vVar, this.f61876p, this.f61877q, a12, iA2, this.f61879s);
        return G0.f406611a;
    }
}

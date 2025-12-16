package com.akita.compose.component.list_item;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ListItemSwitcher.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class t extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f61958l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f61959m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s f61960n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f61961o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f61962p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22096n f61963q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C22096n f61964r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f61965s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f61966t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(String str, boolean z12, s sVar, androidx.compose.ui.v vVar, boolean z13, C22096n c22096n, C22096n c22096n2, int i12, int i13) {
        super(2);
        this.f61958l = str;
        this.f61959m = z12;
        this.f61960n = sVar;
        this.f61961o = vVar;
        this.f61962p = z13;
        this.f61963q = c22096n;
        this.f61964r = c22096n2;
        this.f61965s = i12;
        this.f61966t = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f61965s | 1);
        boolean z12 = this.f61962p;
        w.b(this.f61958l, this.f61959m, this.f61960n, this.f61961o, z12, this.f61963q, this.f61964r, a12, iA2, this.f61966t);
        return G0.f406611a;
    }
}

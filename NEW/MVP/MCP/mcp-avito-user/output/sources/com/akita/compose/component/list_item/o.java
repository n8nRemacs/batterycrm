package com.akita.compose.component.list_item;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ListItemRadio.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class o extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f61932l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f61933m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s f61934n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f61935o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C22096n f61936p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22096n f61937q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f61938r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f61939s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, boolean z12, s sVar, androidx.compose.ui.v vVar, C22096n c22096n, C22096n c22096n2, int i12, int i13) {
        super(2);
        this.f61932l = str;
        this.f61933m = z12;
        this.f61934n = sVar;
        this.f61935o = vVar;
        this.f61936p = c22096n;
        this.f61937q = c22096n2;
        this.f61938r = i12;
        this.f61939s = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f61938r | 1);
        androidx.compose.ui.v vVar = this.f61935o;
        r.b(this.f61932l, this.f61933m, this.f61934n, vVar, this.f61936p, this.f61937q, a12, iA2, this.f61939s);
        return G0.f406611a;
    }
}

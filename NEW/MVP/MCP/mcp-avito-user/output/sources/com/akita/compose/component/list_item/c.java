package com.akita.compose.component.list_item;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.text.C22602e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ListItemCheckbox.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class c extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22602e f61865l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f61866m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s f61867n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f61868o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C22096n f61869p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22096n f61870q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f61871r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C22602e c22602e, boolean z12, s sVar, androidx.compose.ui.v vVar, C22096n c22096n, C22096n c22096n2, int i12) {
        super(2);
        this.f61865l = c22602e;
        this.f61866m = z12;
        this.f61867n = sVar;
        this.f61868o = vVar;
        this.f61869p = c22096n;
        this.f61870q = c22096n2;
        this.f61871r = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f61871r | 1);
        C22602e c22602e = this.f61865l;
        s sVar = this.f61867n;
        androidx.compose.ui.v vVar = this.f61868o;
        d.a(c22602e, this.f61866m, sVar, vVar, this.f61869p, this.f61870q, a12, iA2);
        return G0.f406611a;
    }
}

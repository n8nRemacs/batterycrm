package com.akita.compose.component.list_item;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ListItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class i extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f61889l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f61890m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s f61891n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f61892o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C22096n f61893p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22096n f61894q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f61895r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f61896s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, String str2, s sVar, androidx.compose.ui.v vVar, C22096n c22096n, C22096n c22096n2, int i12, int i13) {
        super(2);
        this.f61889l = str;
        this.f61890m = str2;
        this.f61891n = sVar;
        this.f61892o = vVar;
        this.f61893p = c22096n;
        this.f61894q = c22096n2;
        this.f61895r = i12;
        this.f61896s = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f61895r | 1);
        androidx.compose.ui.v vVar = this.f61892o;
        m.e(this.f61889l, this.f61890m, this.f61891n, vVar, this.f61893p, this.f61894q, a12, iA2, this.f61896s);
        return G0.f406611a;
    }
}

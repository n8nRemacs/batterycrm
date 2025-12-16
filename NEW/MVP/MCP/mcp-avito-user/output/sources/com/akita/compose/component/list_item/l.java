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
final class l extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f61906l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s f61907m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f61908n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f61909o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C22096n f61910p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22096n f61911q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f61912r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f61913s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, s sVar, androidx.compose.ui.v vVar, C22096n c22096n, C22096n c22096n2, C22096n c22096n3, int i12, int i13) {
        super(2);
        this.f61906l = str;
        this.f61907m = sVar;
        this.f61908n = vVar;
        this.f61909o = c22096n;
        this.f61910p = c22096n2;
        this.f61911q = c22096n3;
        this.f61912r = i12;
        this.f61913s = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f61912r | 1);
        C22096n c22096n = this.f61909o;
        m.d(this.f61906l, this.f61907m, this.f61908n, c22096n, this.f61910p, this.f61911q, a12, iA2, this.f61913s);
        return G0.f406611a;
    }
}

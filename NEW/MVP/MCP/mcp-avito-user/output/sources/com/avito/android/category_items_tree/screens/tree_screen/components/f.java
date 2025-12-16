package com.avito.android.category_items_tree.screens.tree_screen.components;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TreeItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class f extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f117043l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f117044m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f117045n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f117046o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v.a f117047p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f117048q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f117049r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f117050s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, int i12, boolean z12, boolean z13, v.a aVar, Y41.a aVar2, int i13, int i14) {
        super(2);
        this.f117043l = str;
        this.f117044m = i12;
        this.f117045n = z12;
        this.f117046o = z13;
        this.f117047p = aVar;
        this.f117048q = aVar2;
        this.f117049r = i13;
        this.f117050s = i14;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f117049r | 1);
        boolean z12 = this.f117046o;
        j.a(this.f117043l, this.f117044m, this.f117045n, z12, this.f117047p, this.f117048q, a12, iA2, this.f117050s);
        return G0.f406611a;
    }
}

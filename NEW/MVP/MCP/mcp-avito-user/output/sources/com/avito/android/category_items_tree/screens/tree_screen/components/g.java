package com.avito.android.category_items_tree.screens.tree_screen.components;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TreeItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class g extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f117051l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f117052m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v.a f117053n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f117054o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i12, float f12, v.a aVar, int i13) {
        super(2);
        this.f117051l = i12;
        this.f117052m = f12;
        this.f117053n = aVar;
        this.f117054o = i13;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f117054o | 1);
        v.a aVar = this.f117053n;
        j.b(this.f117051l, this.f117052m, aVar, a12, iA2);
        return G0.f406611a;
    }
}

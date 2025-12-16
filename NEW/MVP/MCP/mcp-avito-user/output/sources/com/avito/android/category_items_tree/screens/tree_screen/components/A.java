package com.avito.android.category_items_tree.screens.tree_screen.components;

import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TreeScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class A extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f117024l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f117025m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f117026n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(androidx.compose.ui.v vVar, int i12, int i13) {
        super(2);
        this.f117024l = vVar;
        this.f117025m = i12;
        this.f117026n = i13;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f117025m | 1);
        int i12 = this.f117026n;
        w.c(this.f117024l, a12, iA2, i12);
        return G0.f406611a;
    }
}

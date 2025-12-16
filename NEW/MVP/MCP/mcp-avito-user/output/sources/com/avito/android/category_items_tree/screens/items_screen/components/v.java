package com.avito.android.category_items_tree.screens.items_screen.components;

import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CategoryItemsScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class v extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f116913l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f116914m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f116915n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(androidx.compose.ui.v vVar, int i12, int i13) {
        super(2);
        this.f116913l = vVar;
        this.f116914m = i12;
        this.f116915n = i13;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f116914m | 1);
        int i12 = this.f116915n;
        i.c(this.f116913l, a12, iA2, i12);
        return G0.f406611a;
    }
}

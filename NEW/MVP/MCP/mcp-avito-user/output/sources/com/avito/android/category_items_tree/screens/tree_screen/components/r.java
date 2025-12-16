package com.avito.android.category_items_tree.screens.tree_screen.components;

import androidx.compose.runtime.C22066f2;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Tree.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class r extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<com.avito.android.category_items_tree.screens.tree_screen.k> f117069l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.category_items_tree.screens.tree_screen.k, G0> f117070m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f117071n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f117072o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i12, Y41.l lVar, androidx.compose.ui.v vVar, List list) {
        super(2);
        this.f117069l = list;
        this.f117070m = lVar;
        this.f117071n = vVar;
        this.f117072o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f117072o | 1);
        Y41.l<com.avito.android.category_items_tree.screens.tree_screen.k, G0> lVar = this.f117070m;
        v.a(this.f117069l, lVar, a12, iA2);
        return G0.f406611a;
    }
}

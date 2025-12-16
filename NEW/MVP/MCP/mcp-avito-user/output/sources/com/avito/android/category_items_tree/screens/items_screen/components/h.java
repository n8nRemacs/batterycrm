package com.avito.android.category_items_tree.screens.items_screen.components;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.category_items_tree.screens.items_screen.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CategoryItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class h extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a.d f116855l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v.a f116856m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f116857n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a.d dVar, v.a aVar, int i12) {
        super(2);
        this.f116855l = dVar;
        this.f116856m = aVar;
        this.f116857n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f116857n | 1);
        C29367b.g(this.f116855l, this.f116856m, a12, iA2);
        return G0.f406611a;
    }
}

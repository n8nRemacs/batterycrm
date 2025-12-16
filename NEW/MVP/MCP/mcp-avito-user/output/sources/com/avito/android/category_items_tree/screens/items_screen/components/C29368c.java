package com.avito.android.category_items_tree.screens.items_screen.components;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.category_items_tree.screens.items_screen.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CategoryItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.category_items_tree.screens.items_screen.components.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29368c extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a.C3406a f116844l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v.a f116845m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f116846n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29368c(a.C3406a c3406a, v.a aVar, int i12) {
        super(2);
        this.f116844l = c3406a;
        this.f116845m = aVar;
        this.f116846n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f116846n | 1);
        C29367b.c(this.f116844l, this.f116845m, a12, iA2);
        return G0.f406611a;
    }
}

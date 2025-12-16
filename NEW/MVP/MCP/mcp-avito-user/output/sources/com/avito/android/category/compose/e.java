package com.avito.android.category.compose;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.category.ListItem;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CategoryScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class e extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<ListItem> f116520l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.screens.mvi.r f116521m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<ListItem, G0> f116522n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f116523o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(List<? extends ListItem> list, com.avito.android.analytics.screens.mvi.r rVar, Y41.l<? super ListItem, G0> lVar, int i12) {
        super(2);
        this.f116520l = list;
        this.f116521m = rVar;
        this.f116522n = lVar;
        this.f116523o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f116523o | 1);
        com.avito.android.analytics.screens.mvi.r rVar = this.f116521m;
        Y41.l<ListItem, G0> lVar = this.f116522n;
        b.c(this.f116520l, rVar, lVar, a12, iA2);
        return G0.f406611a;
    }
}

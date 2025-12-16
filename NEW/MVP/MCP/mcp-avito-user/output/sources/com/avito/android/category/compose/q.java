package com.avito.android.category.compose;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.category.ListItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HeaderItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class q extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ListItem.Header f116536l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<ListItem, G0> f116537m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v.a f116538n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f116539o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ListItem.Header header, Y41.l lVar, v.a aVar, int i12) {
        super(2);
        this.f116536l = header;
        this.f116537m = lVar;
        this.f116538n = aVar;
        this.f116539o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f116539o | 1);
        v.a aVar = this.f116538n;
        r.a(this.f116536l, this.f116537m, aVar, a12, iA2);
        return G0.f406611a;
    }
}

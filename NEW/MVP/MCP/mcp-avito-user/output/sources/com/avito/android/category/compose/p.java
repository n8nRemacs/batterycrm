package com.avito.android.category.compose;

import com.avito.android.category.ListItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HeaderItem.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class p extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<ListItem, G0> f116534l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ListItem.Header f116535m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(Y41.l<? super ListItem, G0> lVar, ListItem.Header header) {
        super(0);
        this.f116534l = lVar;
        this.f116535m = header;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f116534l.invoke(this.f116535m);
        return G0.f406611a;
    }
}

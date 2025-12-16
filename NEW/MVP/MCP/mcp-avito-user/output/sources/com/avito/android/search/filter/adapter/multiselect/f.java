package com.avito.android.search.filter.adapter.multiselect;

import com.avito.android.search.filter.adapter.select.l;
import com.avito.android.search.filter.converter.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MultiselectItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f262541l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f262542m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.s f262543n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l lVar, i iVar, ParameterElement.s sVar) {
        super(0);
        this.f262541l = lVar;
        this.f262542m = iVar;
        this.f262543n = sVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f262541l.m("");
        this.f262542m.f262548c.accept(this.f262543n);
        return G0.f406611a;
    }
}

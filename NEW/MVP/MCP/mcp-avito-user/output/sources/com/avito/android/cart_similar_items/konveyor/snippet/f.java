package com.avito.android.cart_similar_items.konveyor.snippet;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import mn.InterfaceC44101a;

/* compiled from: SnippetItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "quantity", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class f extends N implements l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f115887l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f115888m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f115889n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f115890o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, String str, int i12, int i13) {
        super(1);
        this.f115887l = gVar;
        this.f115888m = str;
        this.f115889n = i12;
        this.f115890o = i13;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        this.f115887l.f115892c.invoke(new InterfaceC44101a.d(this.f115888m, this.f115889n, num.intValue(), this.f115890o));
        return G0.f406611a;
    }
}

package com.avito.android.cart_similar_items;

import androidx.recyclerview.widget.GridLayoutManager;
import com.avito.android.component.toast.f;
import com.avito.android.printable_text.PrintableText;
import gj.o;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CartSimilarItemsView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class o extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ GridLayoutManager f116138l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f116139m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o.a f116140n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintableText f116141o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Throwable f116142p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(GridLayoutManager gridLayoutManager, int i12, o.a aVar, PrintableText printableText, Throwable th2) {
        super(0);
        this.f116138l = gridLayoutManager;
        this.f116139m = i12;
        this.f116140n = aVar;
        this.f116141o = printableText;
        this.f116142p = th2;
    }

    @Override // Y41.a
    public final G0 invoke() {
        if (this.f116138l.M1() < this.f116139m - 1) {
            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
            o.a aVar = this.f116140n;
            com.avito.android.component.toast.c.b(cVar, aVar.f396763a, this.f116141o, null, null, null, new f.c(this.f116142p), 0, aVar.f396764b, null, false, false, null, null, 4014);
        }
        return G0.f406611a;
    }
}

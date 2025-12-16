package com.avito.android.seller_promotions;

import androidx.recyclerview.widget.GridLayoutManager;
import com.avito.android.component.toast.f;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import gj.o;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SellerPromotionsView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class r extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ GridLayoutManager f268096l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f268097m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o.a f268098n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintableText f268099o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ApiError f268100p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(GridLayoutManager gridLayoutManager, int i12, o.a aVar, PrintableText printableText, ApiError apiError) {
        super(0);
        this.f268096l = gridLayoutManager;
        this.f268097m = i12;
        this.f268098n = aVar;
        this.f268099o = printableText;
        this.f268100p = apiError;
    }

    @Override // Y41.a
    public final G0 invoke() {
        if (this.f268096l.M1() < this.f268097m - 1) {
            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
            o.a aVar = this.f268098n;
            com.avito.android.component.toast.c.b(cVar, aVar.f396763a, this.f268099o, null, null, null, new f.c(this.f268100p), 0, aVar.f396764b, null, false, false, null, null, 4014);
        }
        return G0.f406611a;
    }
}

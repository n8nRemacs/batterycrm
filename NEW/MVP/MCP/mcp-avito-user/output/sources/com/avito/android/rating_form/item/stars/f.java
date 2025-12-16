package com.avito.android.rating_form.item.stars;

import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.O2;
import ih0.InterfaceC41402a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StarsItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f248662l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l f248663m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g f248664n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar, l lVar, g gVar) {
        super(1);
        this.f248662l = bVar;
        this.f248663m = lVar;
        this.f248664n = gVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        Integer numValueOf = Integer.valueOf(iIntValue);
        b bVar = this.f248662l;
        bVar.f248655h = numValueOf;
        ?? r02 = bVar.f248653f;
        PrintableText printableText = O2.a(r02) ? ((k) r02.get(iIntValue)).f248673a : a.a(iIntValue).f248648b;
        bVar.f248651d = printableText;
        this.f248663m.y(printableText);
        this.f248664n.f248665b.invoke(new InterfaceC41402a.b(bVar.f248650c, bVar.f248655h));
        return G0.f406611a;
    }
}

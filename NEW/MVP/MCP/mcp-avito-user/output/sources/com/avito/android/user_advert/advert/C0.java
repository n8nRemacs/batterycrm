package com.avito.android.user_advert.advert;

import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35741a1;
import kotlin.Metadata;

/* compiled from: MyAdvertDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class C0 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C35435m0 f308218l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Throwable f308219m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(C35435m0 c35435m0, Throwable th2) {
        super(0);
        this.f308218l = c35435m0;
        this.f308219m = th2;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        C35435m0 c35435m0 = this.f308218l;
        PrintableText printableTextA = InterfaceC35741a1.a.a(c35435m0.f310484o, this.f308219m, null, null, 6);
        C35436m1 c35436m1 = c35435m0.f310463d0;
        if (c35436m1 != null) {
            c35436m1.c(printableTextA);
        }
        c35435m0.f310487p0 = false;
        C35436m1 c35436m12 = c35435m0.f310463d0;
        if (c35436m12 != null) {
            D6.H(c35436m12.f310561p);
            c35436m12.f310562q.a("");
        }
        return kotlin.G0.f406611a;
    }
}

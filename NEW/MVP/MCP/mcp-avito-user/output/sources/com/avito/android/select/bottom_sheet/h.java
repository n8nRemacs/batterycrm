package com.avito.android.select.bottom_sheet;

import android.view.View;
import com.avito.android.util.D6;
import dq0.C39783e;
import dq0.InterfaceC39780b;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: SelectBottomSheetMviView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f265309l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C39783e f265310m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, C39783e c39783e) {
        super(0);
        this.f265309l = gVar;
        this.f265310m = c39783e;
    }

    @Override // Y41.a
    public final G0 invoke() {
        InterfaceC39780b interfaceC39780b = this.f265310m.f394143j;
        g gVar = this.f265309l;
        gVar.getClass();
        boolean zF2 = L.f(interfaceC39780b, InterfaceC39780b.C11038b.f394116a);
        C42670a c42670a = gVar.f265297i;
        View view = gVar.f265302n;
        if (zF2) {
            D6.H(view);
            c42670a.b();
            D6.w(gVar.f265296h);
        } else if (L.f(interfaceC39780b, InterfaceC39780b.a.f394115a)) {
            D6.w(view);
            c42670a.b();
        } else if (L.f(interfaceC39780b, InterfaceC39780b.d.f394118a)) {
            D6.w(view);
            C42670a.d(c42670a);
        } else if (interfaceC39780b instanceof InterfaceC39780b.c) {
            D6.w(view);
            c42670a.c(null, new i(interfaceC39780b, gVar));
        }
        return G0.f406611a;
    }
}

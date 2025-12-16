package com.avito.android.mortgage.root.list.items.navigation;

import KZ.A;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.items.application.ApplicationProcessType;
import f10.InterfaceC40199a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: NavigationPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/navigation/d;", "LTV0/f;", "Lcom/avito/android/mortgage/root/list/items/navigation/k;", "Lcom/avito/android/mortgage/root/list/items/navigation/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements TV0.f<k, c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC40199a, G0> f202709b;

    /* compiled from: NavigationPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f202710a = new int[ApplicationProcessType.values().length];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@Y61.k Y41.l<? super InterfaceC40199a, G0> lVar) {
        this.f202709b = lVar;
    }

    public static void O(k kVar, c cVar, ApplicationProcessType applicationProcessType) {
        if ((applicationProcessType == null ? -1 : a.f202710a[applicationProcessType.ordinal()]) == -1) {
            kVar.sF(false);
            kVar.DJ(false);
            return;
        }
        A a12 = cVar.f202704c;
        if (applicationProcessType == (a12 != null ? a12.getType() : null)) {
            kVar.sF(true);
            return;
        }
        A a13 = cVar.f202705d;
        if (applicationProcessType == (a13 != null ? a13.getType() : null)) {
            kVar.DJ(true);
        } else {
            kVar.sF(false);
            kVar.DJ(false);
        }
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((k) eVar, (c) aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    @Override // TV0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g2(TV0.e r5, TV0.a r6, int r7, java.util.List r8) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.root.list.items.navigation.d.g2(TV0.e, TV0.a, int, java.util.List):void");
    }

    public final void k(@Y61.k k kVar, @Y61.k c cVar) {
        kVar.nH(new e(cVar, this));
        kVar.W60(new f(cVar, this));
        kVar.ky(new g(this));
        O(kVar, cVar, cVar.f202706e);
        kVar.setEnabled(cVar.f202708g);
        A a12 = cVar.f202704c;
        kVar.SI(a12 != null ? a12.getTitle() : null);
        A a13 = cVar.f202705d;
        kVar.a30(a13 != null ? a13.getTitle() : null);
        kVar.Jf(cVar.f202707f);
    }
}

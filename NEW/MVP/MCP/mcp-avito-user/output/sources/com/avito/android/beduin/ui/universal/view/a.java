package com.avito.android.beduin.ui.universal.view;

import Y41.l;
import Y61.k;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23040h0;
import bj.AbstractC25658a;
import com.avito.android.R;
import com.avito.android.beduin.ui.universal.m;
import com.avito.android.lib.util.g;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: UniversalBeduinBottomSheetViewImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/ui/universal/view/a;", "Lcom/avito/android/beduin/ui/universal/view/c;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements com.avito.android.beduin.ui.universal.view.c {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final C3124a f104548e = new C3124a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.bottom_sheet.d f104549a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC22983P f104550b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<Boolean, G0> f104551c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.beduin.ui.universal.view.c f104552d;

    /* compiled from: UniversalBeduinBottomSheetViewImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/ui/universal/view/a$a;", "", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.ui.universal.view.a$a, reason: collision with other inner class name */
    public static final class C3124a {
        public /* synthetic */ C3124a(C42822w c42822w) {
            this();
        }

        public C3124a() {
        }
    }

    /* compiled from: UniversalBeduinBottomSheetViewImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "isExpanded", "Lkotlin/G0;", "invoke", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<Boolean, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            com.avito.android.lib.design.bottom_sheet.d dVar = a.this.f104549a;
            dVar.K(zBooleanValue);
            dVar.J(zBooleanValue);
            return G0.f406611a;
        }
    }

    /* compiled from: UniversalBeduinBottomSheetViewImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f104554b;

        public c(l lVar) {
            this.f104554b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return L.f(this.f104554b, ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f104554b;
        }

        public final int hashCode() {
            return this.f104554b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f104554b.invoke(obj);
        }
    }

    public a() {
        throw null;
    }

    public a(com.avito.android.lib.design.bottom_sheet.d dVar, InterfaceC22983P interfaceC22983P, io.reactivex.rxjava3.disposables.c cVar, com.avito.android.beduin.common.navigation_bar.b bVar, AbstractC25658a abstractC25658a, AbstractC25658a abstractC25658a2, AbstractC25658a abstractC25658a3, l lVar, int i12, com.avito.android.beduin.ui.universal.view.c cVar2, int i13, C42822w c42822w) {
        com.avito.android.beduin.ui.universal.view.c dVar2;
        if ((i13 & 512) != 0) {
            f104548e.getClass();
            dVar.setContentView(i12);
            com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
            dVar.setCancelable(true);
            dVar.setCanceledOnTouchOutside(true);
            com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
            dVar2 = new d(dVar.findViewById(R.id.beduin_universalpage_bottomsheet_root), interfaceC22983P, cVar, bVar, abstractC25658a, abstractC25658a2, abstractC25658a3, null, lVar);
        } else {
            dVar2 = cVar2;
        }
        this.f104549a = dVar;
        this.f104550b = interfaceC22983P;
        this.f104551c = lVar;
        this.f104552d = dVar2;
        g.a(dVar);
    }

    @Override // com.avito.android.beduin.ui.universal.view.c
    @k
    public final View a() {
        View viewU = this.f104549a.u();
        return viewU == null ? this.f104552d.getF104557a() : viewU;
    }

    @Override // com.avito.android.beduin.ui.universal.view.c
    @k
    /* renamed from: b */
    public final RecyclerView getF104570n() {
        return this.f104552d.getF104570n();
    }

    @Override // com.avito.android.beduin.ui.universal.view.c
    @k
    /* renamed from: c */
    public final RecyclerView getF104571o() {
        return this.f104552d.getF104571o();
    }

    @Override // com.avito.android.beduin.ui.universal.view.c
    public final void d(@k m mVar) {
        this.f104552d.d(mVar);
    }

    @Override // com.avito.android.beduin.ui.universal.view.c
    @k
    /* renamed from: e */
    public final RecyclerView getF104569m() {
        return this.f104552d.getF104569m();
    }

    @Override // com.avito.android.beduin.ui.universal.view.c
    public final void f(@k m mVar) {
        this.f104552d.f(mVar);
        mVar.f104508Y.observe(this.f104550b, new c(new b()));
    }

    @Override // com.avito.android.beduin.ui.universal.view.c
    @k
    /* renamed from: getView */
    public final View getF104557a() {
        return this.f104552d.getF104557a();
    }
}

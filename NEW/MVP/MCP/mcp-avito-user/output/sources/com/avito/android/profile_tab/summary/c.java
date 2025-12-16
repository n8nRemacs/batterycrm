package com.avito.android.profile_tab.summary;

import Dc0.InterfaceC13384a;
import Dc0.InterfaceC13385b;
import Dc0.InterfaceC13386c;
import Dc0.g;
import Y61.k;
import androidx.view.N0;
import com.avito.android.arch.mvi.q;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.n2;

/* compiled from: ProfileSummaryFeatureViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_tab/summary/c;", "Lcom/avito/android/profile_tab/summary/f;", "_avito_profile-tab_summary_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c extends f {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final InterfaceC42726C f230850E;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final InterfaceC42726C f230851J = C42727D.c(new C7022c());

    /* renamed from: K, reason: collision with root package name */
    @k
    public final InterfaceC42726C f230852K = C42727D.c(a.f230853l);

    /* compiled from: ProfileSummaryFeatureViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/i;", "LDc0/b;", "invoke", "()Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<InterfaceC43160i<? extends InterfaceC13385b>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f230853l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final InterfaceC43160i<? extends InterfaceC13385b> invoke() {
            return C43175k.w();
        }
    }

    /* compiled from: ProfileSummaryFeatureViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/arch/mvi/c;", "LDc0/c;", "LDc0/e;", "LDc0/f;", "LDc0/d;", "invoke", "()Lcom/avito/android/arch/mvi/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.arch.mvi.c<InterfaceC13386c, Dc0.e, Dc0.f, Dc0.d>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.profile_tab.summary.mvi.k f230854l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ c f230855m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.profile_tab.summary.mvi.k kVar, c cVar) {
            super(0);
            this.f230854l = kVar;
            this.f230855m = cVar;
        }

        @Override // Y41.a
        public final com.avito.android.arch.mvi.c<InterfaceC13386c, Dc0.e, Dc0.f, Dc0.d> invoke() {
            return q.b(this.f230854l, null, N0.a(this.f230855m), 1);
        }
    }

    /* compiled from: ProfileSummaryFeatureViewModel.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/n2;", "LDc0/g;", "invoke", "()Lkotlinx/coroutines/flow/n2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.profile_tab.summary.c$c, reason: collision with other inner class name */
    public static final class C7022c extends N implements Y41.a<n2<? extends Dc0.g>> {
        public C7022c() {
            super(0);
        }

        @Override // Y41.a
        public final n2<? extends Dc0.g> invoke() {
            c cVar = c.this;
            d dVar = new d((com.avito.android.arch.mvi.c) cVar.f230850E.getValue(), cVar);
            A1.a aVarA = N0.a(cVar);
            i2 i2Var = com.avito.android.arch.mvi.android.a.f91843a;
            InterfaceC42726C interfaceC42726C = cVar.f230850E;
            Dc0.f fVar = (Dc0.f) ((com.avito.android.arch.mvi.c) interfaceC42726C.getValue()).f91929r.get();
            Dc0.f fVar2 = (Dc0.f) ((com.avito.android.arch.mvi.c) interfaceC42726C.getValue()).f91929r.get();
            return C43175k.U(dVar, aVarA, i2Var, new Dc0.g(fVar.f3277b, fVar2.f3278c, g.a.d.f3294a));
        }
    }

    public c(@k com.avito.android.profile_tab.summary.mvi.k kVar) {
        this.f230850E = C42727D.c(new b(kVar, this));
    }

    @Override // com.avito.android.arch.mvi.android.l
    public final void accept(Object obj) {
        C43259k.d(N0.a(this), null, null, new com.avito.android.profile_tab.summary.b((InterfaceC13384a) obj, this, null), 3);
    }

    @Override // com.avito.android.arch.mvi.android.m
    @k
    public final InterfaceC43160i<InterfaceC13385b> getEvents() {
        return (InterfaceC43160i) this.f230852K.getValue();
    }

    @Override // com.avito.android.arch.mvi.android.m
    @k
    public final n2<Dc0.g> getState() {
        return (n2) this.f230851J.getValue();
    }
}

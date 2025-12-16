package com.avito.android.settings.mvi;

import Nv0.InterfaceC14616a;
import Nv0.InterfaceC14617b;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.C28431o;
import com.avito.android.analytics.event.C28433p;
import com.avito.android.location.LocationSource;
import com.avito.android.location.r;
import com.avito.android.remote.model.Location;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.y;

/* compiled from: SettingsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/settings/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LNv0/a;", "LNv0/b;", "LNv0/d;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC14616a, InterfaceC14617b, Nv0.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.settings.f f280907a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location.r f280908b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f280909c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final U20.d f280910d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.replace_main.toggle.m f280911e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final U20.e f280912f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.onboarding_manager.f f280913g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f280914h;

    /* compiled from: SettingsActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LNv0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.settings.mvi.SettingsActor$process$2", f = "SettingsActor.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC14617b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f280915q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f280916r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC14616a f280918t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC14616a interfaceC14616a, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f280918t = interfaceC14616a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = d.this.new a(this.f280918t, continuation);
            aVar.f280916r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC14617b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f280915q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f280916r;
                InterfaceC14616a.d dVar = (InterfaceC14616a.d) this.f280918t;
                Location location = dVar.f11813a;
                d dVar2 = d.this;
                dVar2.getClass();
                LocationSource locationSource = LocationSource.f181718j;
                com.avito.android.location.r rVar = dVar2.f280908b;
                r.a.a(rVar, location, locationSource, 4);
                rVar.a(location, LocationSource.f181713e, true);
                r.a.a(rVar, dVar.f11813a, null, 2);
                InterfaceC14617b.h hVar = new InterfaceC14617b.h(dVar.f11813a);
                this.f280915q = 1;
                if (interfaceC43172j.emit(hVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public d(@Y61.k com.avito.android.settings.f fVar, @Y61.k com.avito.android.location.r rVar, @Y61.k R0 r02, @Y61.k U20.d dVar, @Y61.k com.avito.android.replace_main.toggle.m mVar, @Y61.k U20.e eVar, @Y61.k com.avito.android.onboarding_manager.f fVar2, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f280907a = fVar;
        this.f280908b = rVar;
        this.f280909c = r02;
        this.f280910d = dVar;
        this.f280911e = mVar;
        this.f280912f = eVar;
        this.f280913g = fVar2;
        this.f280914h = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return com.avito.android.bxcontent.mvi.entity.f.r(C42745f0.U(((Nv0.d) aVar.invoke()).f11868d == null ? C43175k.I(this.f280909c.a(), new C43152f0(new e(y.a(r.a.b(this.f280908b, false, 3))), new f(3, null))) : C43175k.w(), C43175k.C(new c(this, aVar, null), c43197r1)));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<InterfaceC14617b> b(@Y61.k InterfaceC14616a interfaceC14616a, @Y61.k Nv0.d dVar) {
        C43210w c43210w;
        if (interfaceC14616a.equals(InterfaceC14616a.b.f11811a)) {
            return C43175k.G(new b(this, null));
        }
        if (interfaceC14616a instanceof InterfaceC14616a.c) {
            String str = ((InterfaceC14616a.c) interfaceC14616a).f11812a;
            switch (str.hashCode()) {
                case -1907010560:
                    if (str.equals("avitoCare")) {
                        c43210w = new C43210w(InterfaceC14617b.j.f11826a);
                        break;
                    }
                    break;
                case -1694056056:
                    if (str.equals("b2b_hub")) {
                        c43210w = new C43210w(InterfaceC14617b.k.f11827a);
                        break;
                    }
                    break;
                case -1496909990:
                    if (str.equals("recTechnologies")) {
                        c43210w = new C43210w(InterfaceC14617b.r.f11834a);
                        break;
                    }
                    break;
                case -1355179393:
                    if (str.equals("userAgreement")) {
                        c43210w = new C43210w(InterfaceC14617b.u.f11837a);
                        break;
                    }
                    break;
                case -1097853370:
                    if (str.equals("osLicences")) {
                        c43210w = new C43210w(InterfaceC14617b.s.f11835a);
                        break;
                    }
                    break;
                case -449416299:
                    if (str.equals("uiTheme")) {
                        c43210w = new C43210w(InterfaceC14617b.t.f11836a);
                        break;
                    }
                    break;
                case 3327403:
                    if (str.equals("logo")) {
                        c43210w = new C43210w(InterfaceC14617b.l.f11828a);
                        break;
                    }
                    break;
                case 105650780:
                    if (str.equals("offer")) {
                        c43210w = new C43210w(InterfaceC14617b.q.f11833a);
                        break;
                    }
                    break;
                case 351608024:
                    if (str.equals("version")) {
                        c43210w = new C43210w(InterfaceC14617b.y.f11842a);
                        break;
                    }
                    break;
                case 749097718:
                    if (str.equals("helpCenter")) {
                        c43210w = new C43210w(InterfaceC14617b.m.f11829a);
                        break;
                    }
                    break;
                case 1005982551:
                    if (str.equals("languageSelector")) {
                        c43210w = new C43210w(InterfaceC14617b.n.f11830a);
                        break;
                    }
                    break;
                case 1074400127:
                    if (str.equals("appsLicence")) {
                        c43210w = new C43210w(InterfaceC14617b.i.f11825a);
                        break;
                    }
                    break;
                case 1272354024:
                    if (str.equals("notifications")) {
                        c43210w = new C43210w(InterfaceC14617b.p.f11832a);
                        break;
                    }
                    break;
                case 1625213055:
                    if (str.equals("clearSearchHistory")) {
                        return !dVar.f11869e ? this.f280907a.a() : C43175k.w();
                    }
                    break;
                case 1901043637:
                    if (str.equals("location")) {
                        Location location = dVar.f11868d;
                        return location != null ? new C43210w(new InterfaceC14617b.o(location)) : C43175k.w();
                    }
                    break;
            }
            return C43175k.w();
        }
        if (interfaceC14616a instanceof InterfaceC14616a.d) {
            return C43175k.G(new a(interfaceC14616a, null));
        }
        if (interfaceC14616a instanceof InterfaceC14616a.e) {
            return C43175k.G(new com.avito.android.settings.mvi.a(this, dVar, (InterfaceC14616a.e) interfaceC14616a, null));
        }
        boolean z12 = interfaceC14616a instanceof InterfaceC14616a.g;
        InterfaceC28373a interfaceC28373a = this.f280914h;
        if (z12) {
            interfaceC28373a.c(new C28433p("b360_profile", ((InterfaceC14616a.g) interfaceC14616a).f11816a.f254626b.f254624a));
            return C43175k.w();
        }
        if (interfaceC14616a instanceof InterfaceC14616a.f) {
            interfaceC28373a.c(new C28431o("b360_profile", ((InterfaceC14616a.f) interfaceC14616a).f11815a.f254626b.f254624a));
            return C43175k.w();
        }
        if (!(interfaceC14616a instanceof InterfaceC14616a.C0770a)) {
            throw new NoWhenBranchMatchedException();
        }
        c43210w = new C43210w(InterfaceC14617b.d.f11820a);
        return c43210w;
    }
}

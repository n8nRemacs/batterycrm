package com.avito.android.mortgage.landing.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.mortgage.api.model.landing.LandingHeader;
import com.avito.android.mortgage.api.model.landing.LandingHeaderAction;
import com.avito.android.mortgage.landing.model.LandingArguments;
import com.avito.android.mortgage.landing.mvi.entity.LandingInternalAction;
import com.avito.android.mortgage.landing.mvi.entity.LandingState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import w00.InterfaceC49409a;

/* compiled from: LandingActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/g;", "Lcom/avito/android/arch/mvi/a;", "Lw00/a;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingState;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements com.avito.android.arch.mvi.a<InterfaceC49409a, LandingInternalAction, LandingState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.landing.mvi.domain.a f200265a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public N0 f200266b;

    @Inject
    public g(@Y61.k com.avito.android.mortgage.landing.mvi.domain.a aVar) {
        this.f200265a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<LandingInternalAction> b(InterfaceC49409a interfaceC49409a, LandingState landingState) {
        InterfaceC43160i<LandingInternalAction> c43210w;
        LandingHeaderAction secondaryAction;
        LandingHeaderAction primaryAction;
        InterfaceC43160i<LandingInternalAction> c43210w2;
        InterfaceC49409a interfaceC49409a2 = interfaceC49409a;
        LandingState landingState2 = landingState;
        if (interfaceC49409a2 instanceof InterfaceC49409a.C49411c) {
            c43210w2 = new C43210w(LandingInternalAction.Close.f200170b);
        } else if (interfaceC49409a2 instanceof InterfaceC49409a.s) {
            c43210w2 = new C43210w(LandingInternalAction.ScreenOpened.f200206b);
        } else if (interfaceC49409a2 instanceof InterfaceC49409a.r) {
            c43210w2 = new C43210w(LandingInternalAction.ScreenClosed.f200205b);
        } else {
            if (interfaceC49409a2 instanceof InterfaceC49409a.B) {
                c43210w2 = C43175k.h(new f(this, landingState2, null));
            } else if (interfaceC49409a2 instanceof InterfaceC49409a.i) {
                InterfaceC49409a.i iVar = (InterfaceC49409a.i) interfaceC49409a2;
                c43210w2 = new C43207v(new LandingInternalAction[]{new LandingInternalAction.InputFieldFilled(iVar.f441103a, iVar.f441104b), LandingInternalAction.ApplyBusinessRules.f200163b});
            } else {
                if (interfaceC49409a2 instanceof InterfaceC49409a.D) {
                    InterfaceC49409a.D d12 = (InterfaceC49409a.D) interfaceC49409a2;
                    c43210w = new C43210w(new LandingInternalAction.ValueUpdated(d12.f441087a, d12.f441088b));
                } else if (interfaceC49409a2 instanceof InterfaceC49409a.E) {
                    InterfaceC49409a.E e12 = (InterfaceC49409a.E) interfaceC49409a2;
                    c43210w2 = new C43207v(new LandingInternalAction[]{new LandingInternalAction.ValueUpdatedByPredefined(e12.f441089a, e12.f441090b), LandingInternalAction.ApplyBusinessRules.f200163b});
                } else if (interfaceC49409a2 instanceof InterfaceC49409a.F) {
                    InterfaceC49409a.F f12 = (InterfaceC49409a.F) interfaceC49409a2;
                    c43210w = new C43210w(new LandingInternalAction.ValueUpdatedBySlider(f12.f441091a, f12.f441092b));
                } else if (interfaceC49409a2 instanceof InterfaceC49409a.z) {
                    InterfaceC49409a.z zVar = (InterfaceC49409a.z) interfaceC49409a2;
                    c43210w2 = new C43207v(new LandingInternalAction[]{new LandingInternalAction.SliderFilled(zVar.f441124a, zVar.f441125b), LandingInternalAction.ApplyBusinessRules.f200163b});
                } else if (interfaceC49409a2 instanceof InterfaceC49409a.C49410b) {
                    InterfaceC49409a.C49410b c49410b = (InterfaceC49409a.C49410b) interfaceC49409a2;
                    c43210w2 = new C43207v(new LandingInternalAction[]{new LandingInternalAction.ChipSelected(c49410b.f441096a, c49410b.f441097b), LandingInternalAction.ApplyBusinessRules.f200163b});
                } else if (interfaceC49409a2 instanceof InterfaceC49409a.y) {
                    c43210w2 = C43175k.G(new e(landingState2, ((InterfaceC49409a.y) interfaceC49409a2).f441123a.f199952b, this, null));
                } else if (interfaceC49409a2 instanceof InterfaceC49409a.C) {
                    c43210w2 = new C43207v(new LandingInternalAction[]{new LandingInternalAction.ProgramUpdated(((InterfaceC49409a.C) interfaceC49409a2).f441086a), LandingInternalAction.ApplyBusinessRules.f200163b});
                } else if (interfaceC49409a2 instanceof InterfaceC49409a.G) {
                    InterfaceC49409a.G g12 = (InterfaceC49409a.G) interfaceC49409a2;
                    c43210w2 = new C43207v(new LandingInternalAction[]{new LandingInternalAction.ValueSelected(g12.f441093a, g12.f441094b), LandingInternalAction.ApplyBusinessRules.f200163b});
                } else if (interfaceC49409a2 instanceof InterfaceC49409a.C49412d) {
                    c43210w = new C43210w(new LandingInternalAction.ItemExpanded(((InterfaceC49409a.C49412d) interfaceC49409a2).f441099a));
                } else if (interfaceC49409a2 instanceof InterfaceC49409a.j) {
                    InterfaceC49409a.j jVar = (InterfaceC49409a.j) interfaceC49409a2;
                    c43210w = new C43210w(new LandingInternalAction.OfferClicked(jVar.f441105a, jVar.f441106b));
                } else if (interfaceC49409a2 instanceof InterfaceC49409a.o) {
                    c43210w2 = C43175k.G(new b(landingState2, null));
                } else if (interfaceC49409a2 instanceof InterfaceC49409a.w) {
                    c43210w2 = new C43207v(new LandingInternalAction[]{new LandingInternalAction.ProgramUpdated(((InterfaceC49409a.w) interfaceC49409a2).f441121a), LandingInternalAction.ApplyBusinessRules.f200163b});
                } else if (interfaceC49409a2 instanceof InterfaceC49409a.x) {
                    c43210w2 = new C43207v(new LandingInternalAction[]{new LandingInternalAction.ProgramTabInDialogSelected(((InterfaceC49409a.x) interfaceC49409a2).f441122a), LandingInternalAction.ApplyBusinessRules.f200163b});
                } else {
                    boolean z12 = interfaceC49409a2 instanceof InterfaceC49409a.h;
                    com.avito.android.mortgage.landing.mvi.domain.a aVar = this.f200265a;
                    if (z12) {
                        LandingArguments landingArguments = landingState2.f200230f;
                        c43210w2 = aVar.b(landingArguments != null ? landingArguments.c() : null);
                    } else {
                        boolean z13 = interfaceC49409a2 instanceof InterfaceC49409a.C12803a;
                        String str = landingState2.f200234j;
                        String str2 = landingState2.f200233i;
                        if (z13) {
                            c43210w2 = aVar.a(str2, str);
                        } else if (interfaceC49409a2 instanceof InterfaceC49409a.A) {
                            c43210w2 = C43175k.N(new C43210w(LandingInternalAction.CreateApplicationClicked.f200172b), aVar.d(landingState2.f200231g, landingState2.f200227c, landingState2.f200228d, str2, str));
                        } else if (interfaceC49409a2 instanceof InterfaceC49409a.u) {
                            c43210w2 = C43175k.G(new c(landingState2, null));
                        } else if (interfaceC49409a2 instanceof InterfaceC49409a.m) {
                            String str3 = landingState2.f200231g;
                            if (str3 == null) {
                                return C43175k.w();
                            }
                            c43210w2 = C43175k.N(new C43210w(LandingInternalAction.UpdateApplicationClicked.f200215b), aVar.c(str3, str2, str, landingState2.f200227c));
                        } else if (interfaceC49409a2 instanceof InterfaceC49409a.n) {
                            c43210w2 = C43175k.G(new d(landingState2, null));
                        } else if (interfaceC49409a2 instanceof InterfaceC49409a.t) {
                            InterfaceC49409a.t tVar = (InterfaceC49409a.t) interfaceC49409a2;
                            c43210w = new C43210w(new LandingInternalAction.ScreenScrolled(tVar.f441117a, tVar.f441118b));
                        } else if (interfaceC49409a2 instanceof InterfaceC49409a.q) {
                            InterfaceC49409a.q qVar = (InterfaceC49409a.q) interfaceC49409a2;
                            c43210w = new C43210w(new LandingInternalAction.ProgramsScrolled(qVar.f441113a, qVar.f441114b));
                        } else if (interfaceC49409a2 instanceof InterfaceC49409a.p) {
                            c43210w2 = new C43210w(LandingInternalAction.ProgramsScrollStarted.f200201b);
                        } else if (interfaceC49409a2 instanceof InterfaceC49409a.k) {
                            c43210w2 = new C43210w(LandingInternalAction.OffersScrollStarted.f200191b);
                        } else if (interfaceC49409a2 instanceof InterfaceC49409a.C49413e) {
                            c43210w = new C43210w(new LandingInternalAction.HandleBottomUspBannerDeeplink(((InterfaceC49409a.C49413e) interfaceC49409a2).f441100a));
                        } else if (interfaceC49409a2 instanceof InterfaceC49409a.C49415g) {
                            c43210w2 = new C43210w(new LandingInternalAction.HandlePreApprovalBannerDeeplink());
                        } else {
                            boolean z14 = interfaceC49409a2 instanceof InterfaceC49409a.l;
                            LandingHeader landingHeader = landingState2.f200226b;
                            if (z14) {
                                c43210w = (landingHeader == null || (primaryAction = landingHeader.getPrimaryAction()) == null) ? C43175k.w() : C43175k.G(new a(primaryAction, null));
                            } else if (interfaceC49409a2 instanceof InterfaceC49409a.v) {
                                c43210w = (landingHeader == null || (secondaryAction = landingHeader.getSecondaryAction()) == null) ? C43175k.w() : C43175k.G(new a(secondaryAction, null));
                            } else {
                                if (!(interfaceC49409a2 instanceof InterfaceC49409a.C49414f)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                c43210w = new C43210w(new LandingInternalAction.HandleDeeplink(((InterfaceC49409a.C49414f) interfaceC49409a2).f441101a));
                            }
                        }
                    }
                }
                c43210w2 = c43210w;
            }
        }
        return c43210w2;
    }
}

package com.avito.android.mortgage.root.mvi;

import KZ.C14271a;
import KZ.C14272b;
import KZ.C14282l;
import KZ.C14285o;
import KZ.InterfaceC14286p;
import Y00.InterfaceC18246g;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.acceptance_dialog.model.AcceptanceDialogArguments;
import com.avito.android.mortgage.acceptance_dialog.model.ButtonStyle;
import com.avito.android.mortgage.api.model.ConfirmCloseContent;
import com.avito.android.mortgage.api.model.items.application.ApplicationContentItemType;
import com.avito.android.mortgage.api.model.items.application.ApplicationProcessType;
import com.avito.android.mortgage.applicant_type.model.ApplicantType;
import com.avito.android.mortgage.applicant_type.model.ApplicantTypeSelectorArguments;
import com.avito.android.mortgage.root.model.BorrowerDeleteAction;
import com.avito.android.mortgage.root.model.SignChangeAction;
import com.avito.android.mortgage.root.mvi.domain.G;
import com.avito.android.mortgage.root.mvi.domain.InterfaceC32687a;
import com.avito.android.mortgage.root.mvi.domain.InterfaceC32694h;
import com.avito.android.mortgage.root.mvi.domain.InterfaceC32697k;
import com.avito.android.mortgage.root.mvi.domain.InterfaceC32700n;
import com.avito.android.mortgage.root.mvi.domain.K;
import com.avito.android.mortgage.root.mvi.domain.N;
import com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction;
import com.avito.android.mortgage.sending_confirm.model.SendingConfirmArguments;
import com.avito.android.mortgage.steps_details.model.StepDetailsModel;
import com.avito.android.mortgage.steps_details.model.StepsDetailsArguments;
import com.avito.android.util.R0;
import f10.InterfaceC40199a;
import g10.C40511a;
import g10.C40513c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: MortgageRootActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/s;", "Lcom/avito/android/arch/mvi/a;", "Lf10/a;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lg10/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class s implements com.avito.android.arch.mvi.a<InterfaceC40199a, MortgageRootInternalAction, C40513c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.root.mvi.domain.z f203329a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.root.mvi.domain.t f203330b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32687a f203331c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32700n f203332d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32694h f203333e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32697k f203334f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.root.mvi.domain.D f203335g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final K f203336h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final G f203337i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.root.mvi.domain.q f203338j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final N f203339k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC18246g f203340l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final R0 f203341m;

    @Inject
    public s(@Y61.k com.avito.android.mortgage.root.mvi.domain.z zVar, @Y61.k com.avito.android.mortgage.root.mvi.domain.t tVar, @Y61.k InterfaceC32687a interfaceC32687a, @Y61.k InterfaceC32700n interfaceC32700n, @Y61.k InterfaceC32694h interfaceC32694h, @Y61.k InterfaceC32697k interfaceC32697k, @Y61.k com.avito.android.mortgage.root.mvi.domain.D d12, @Y61.k K k12, @Y61.k G g12, @Y61.k com.avito.android.mortgage.root.mvi.domain.q qVar, @Y61.k N n12, @Y61.k InterfaceC18246g interfaceC18246g, @Y61.k R0 r02) {
        this.f203329a = zVar;
        this.f203330b = tVar;
        this.f203331c = interfaceC32687a;
        this.f203332d = interfaceC32700n;
        this.f203333e = interfaceC32694h;
        this.f203334f = interfaceC32697k;
        this.f203335g = d12;
        this.f203336h = k12;
        this.f203337i = g12;
        this.f203338j = qVar;
        this.f203339k = n12;
        this.f203340l = interfaceC18246g;
        this.f203341m = r02;
    }

    public static final C14272b c(s sVar, List list, String str) {
        Object obj;
        Object next;
        sVar.getClass();
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C14285o) next).f9530b instanceof C14282l) {
                break;
            }
        }
        C14285o c14285o = (C14285o) next;
        InterfaceC14286p interfaceC14286p = c14285o != null ? c14285o.f9530b : null;
        if (!(interfaceC14286p instanceof C14282l)) {
            interfaceC14286p = null;
        }
        C14282l c14282l = (C14282l) interfaceC14286p;
        if (c14282l == null) {
            return null;
        }
        Iterator<T> it2 = c14282l.a().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (L.f(((C14272b) next2).getId(), str)) {
                obj = next2;
                break;
            }
        }
        return (C14272b) obj;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<MortgageRootInternalAction> b(InterfaceC40199a interfaceC40199a, C40513c c40513c) {
        InterfaceC43160i<MortgageRootInternalAction> interfaceC43160iG;
        C14285o c14285oPrevious;
        InterfaceC43160i<MortgageRootInternalAction> c43210w;
        JZ.a analytics;
        KZ.A a12;
        KZ.A a13;
        JZ.r stepDetails;
        InterfaceC40199a interfaceC40199a2 = interfaceC40199a;
        C40513c c40513c2 = c40513c;
        if (interfaceC40199a2 instanceof InterfaceC40199a.L) {
            InterfaceC40199a.L l12 = (InterfaceC40199a.L) interfaceC40199a2;
            interfaceC43160iG = new C43210w(new MortgageRootInternalAction.ScreenScrolled(l12.f395588a, l12.f395589b));
        } else {
            boolean z12 = interfaceC40199a2 instanceof InterfaceC40199a.C40216r;
            R0 r02 = this.f203341m;
            if (z12) {
                interfaceC43160iG = C43175k.I(r02.a(), C43175k.G(new C32703e(this, c40513c2, null)));
            } else if (interfaceC40199a2 instanceof InterfaceC40199a.P) {
                interfaceC43160iG = C43175k.G(new i(this, c40513c2, null));
            } else if (interfaceC40199a2 instanceof InterfaceC40199a.v) {
                interfaceC43160iG = new C43210w(MortgageRootInternalAction.NeedReload.f203197b);
            } else {
                if (interfaceC40199a2 instanceof InterfaceC40199a.K) {
                    c43210w = c40513c2.f396253i ? C43175k.I(r02.a(), C43175k.G(new r(this, c40513c2, null))) : C43175k.w();
                } else {
                    boolean z13 = interfaceC40199a2 instanceof InterfaceC40199a.C40211m;
                    JZ.d dVar = c40513c2.f396249e;
                    if (z13) {
                        ConfirmCloseContent confirmCloseContent = dVar != null ? dVar.getConfirmCloseContent() : null;
                        if (confirmCloseContent != null) {
                            c43210w = new C43210w(new MortgageRootInternalAction.OpenConfirmCloseDialog(confirmCloseContent));
                        } else {
                            interfaceC43160iG = new C43210w(MortgageRootInternalAction.GoBack.f203193b);
                        }
                    } else if (interfaceC40199a2 instanceof InterfaceC40199a.C40202d) {
                        interfaceC43160iG = new C43207v(new MortgageRootInternalAction[]{MortgageRootInternalAction.CloseConfirmed.f203183b, MortgageRootInternalAction.GoBack.f203193b});
                    } else if (interfaceC40199a2 instanceof InterfaceC40199a.C40203e) {
                        interfaceC43160iG = new C43210w(MortgageRootInternalAction.CloseDeclined.f203184b);
                    } else if (interfaceC40199a2 instanceof InterfaceC40199a.C40207i) {
                        if (dVar == null || (stepDetails = dVar.getStepDetails()) == null) {
                            c43210w = C43175k.w();
                        } else {
                            String title = stepDetails.getTitle();
                            List<JZ.q> listB = stepDetails.b();
                            ArrayList arrayList = new ArrayList(C42745f0.q(listB, 10));
                            for (JZ.q qVar : listB) {
                                arrayList.add(new StepDetailsModel(qVar.getTitle(), qVar.getDescription(), qVar.getAdditionalInfo()));
                            }
                            interfaceC43160iG = new C43210w(new MortgageRootInternalAction.OpenDetails(new StepsDetailsArguments(stepDetails.getCurrentStepIdx(), title, arrayList)));
                        }
                    } else if (interfaceC40199a2 instanceof InterfaceC40199a.s) {
                        interfaceC43160iG = new C43210w(new MortgageRootInternalAction.OpenAcceptDialog(new AcceptanceDialogArguments("DELETE_APPLICATION_REQUEST_KEY", com.avito.android.printable_text.b.c(R.string.application_delete_acceptance_title, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.application_delete_acceptance_description, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.acceptance_delete, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.acceptance_decline, new Serializable[0]), ButtonStyle.f198196c, null, 64, null)));
                    } else {
                        boolean z14 = interfaceC40199a2 instanceof InterfaceC40199a.C40204f;
                        String str = c40513c2.f396246b;
                        if (z14) {
                            JZ.c cVar = c40513c2.f396247c;
                            interfaceC43160iG = C43175k.G(new C32683a(cVar != null ? cVar.e() : null, dVar, str, null));
                        } else if (interfaceC40199a2 instanceof InterfaceC40199a.C40214p) {
                            interfaceC43160iG = new C43210w(new MortgageRootInternalAction.HandleDeeplink(((InterfaceC40199a.C40214p) interfaceC40199a2).f395613a));
                        } else if (interfaceC40199a2 instanceof InterfaceC40199a.C40213o) {
                            InterfaceC40199a.C40213o c40213o = (InterfaceC40199a.C40213o) interfaceC40199a2;
                            KZ.L l13 = c40213o.f395612c;
                            boolean zF2 = l13 != null ? L.f(l13.getHasUploadedSignature(), Boolean.TRUE) : false;
                            DeepLink deepLink = c40213o.f395611b;
                            if (zF2) {
                                c43210w = new C43210w(new MortgageRootInternalAction.OpenAcceptDialog(new AcceptanceDialogArguments("CHANGE_SIGNATURE_REQUEST_KEY", com.avito.android.printable_text.b.c(R.string.sign_change_acceptance_title, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.sign_change_acceptance_description, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.sign_change_acceptance_accept, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.acceptance_decline, new Serializable[0]), ButtonStyle.f198195b, new SignChangeAction(c40213o.f395610a, l13.getApplicantType(), deepLink))));
                            } else {
                                interfaceC43160iG = new C43210w(new MortgageRootInternalAction.HandleDeeplink(deepLink));
                            }
                        } else if (interfaceC40199a2 instanceof InterfaceC40199a.C40215q) {
                            interfaceC43160iG = C43175k.G(new C32685c(((InterfaceC40199a.C40215q) interfaceC40199a2).f395614a, this, c40513c2, null));
                        } else if (interfaceC40199a2 instanceof InterfaceC40199a.C40212n) {
                            interfaceC43160iG = new C43207v(new MortgageRootInternalAction[]{MortgageRootInternalAction.BannerClicked.f203182b, new MortgageRootInternalAction.HandleDeeplink(((InterfaceC40199a.C40212n) interfaceC40199a2).f395609a)});
                        } else if (interfaceC40199a2 instanceof InterfaceC40199a.Q) {
                            interfaceC43160iG = d(c40513c2, ((InterfaceC40199a.Q) interfaceC40199a2).f395594a, true);
                        } else if (interfaceC40199a2 instanceof InterfaceC40199a.t) {
                            interfaceC43160iG = d(c40513c2, ApplicationProcessType.NEXT, false);
                        } else if (interfaceC40199a2 instanceof InterfaceC40199a.u) {
                            interfaceC43160iG = new C43210w(new MortgageRootInternalAction.NavigationHideChanged(((InterfaceC40199a.u) interfaceC40199a2).f395618a));
                        } else {
                            boolean z15 = interfaceC40199a2 instanceof InterfaceC40199a.C40209k;
                            C40511a c40511a = c40513c2.f396250f;
                            if (z15) {
                                if (c40511a == null || (a13 = c40511a.f396231a) == null || (c43210w = d(c40513c2, a13.getType(), false)) == null) {
                                    interfaceC43160iG = new C43207v(new MortgageRootInternalAction[0]);
                                }
                            } else if (!(interfaceC40199a2 instanceof InterfaceC40199a.C40210l)) {
                                boolean z16 = interfaceC40199a2 instanceof InterfaceC40199a.C11121a;
                                InterfaceC32694h interfaceC32694h = this.f203333e;
                                if (z16) {
                                    interfaceC43160iG = interfaceC32694h.a(((InterfaceC40199a.C11121a) interfaceC40199a2).f395596a, str);
                                } else if (interfaceC40199a2 instanceof InterfaceC40199a.C40200b) {
                                    List<C14285o> list = c40513c2.f396248d;
                                    ListIterator<C14285o> listIterator = list.listIterator(list.size());
                                    while (true) {
                                        if (!listIterator.hasPrevious()) {
                                            c14285oPrevious = null;
                                            break;
                                        }
                                        c14285oPrevious = listIterator.previous();
                                        if (c14285oPrevious.f9529a == ApplicationContentItemType.ADD_CO_BORROWER) {
                                            break;
                                        }
                                    }
                                    C14285o c14285o = c14285oPrevious;
                                    InterfaceC14286p interfaceC14286p = c14285o != null ? c14285o.f9530b : null;
                                    C14271a c14271a = interfaceC14286p instanceof C14271a ? (C14271a) interfaceC14286p : null;
                                    if (c14271a == null) {
                                        c43210w = C43175k.w();
                                    } else if (c14271a.a()) {
                                        String currentMortgageStage = (dVar == null || (analytics = dVar.getAnalytics()) == null) ? null : analytics.getCurrentMortgageStage();
                                        if (currentMortgageStage == null) {
                                            currentMortgageStage = "";
                                        }
                                        c43210w = new C43210w(new MortgageRootInternalAction.OpenApplicantTypeSelector(new ApplicantTypeSelectorArguments(str, currentMortgageStage)));
                                    } else {
                                        c43210w = interfaceC32694h.a(ApplicantType.f198305d, str);
                                    }
                                } else if (interfaceC40199a2 instanceof InterfaceC40199a.C40206h) {
                                    interfaceC43160iG = this.f203332d.a(str);
                                } else if (interfaceC40199a2 instanceof InterfaceC40199a.C40208j) {
                                    interfaceC43160iG = new C43210w(new MortgageRootInternalAction.OpenAcceptDialog(new AcceptanceDialogArguments("DELETE_APPLICANT_REQUEST_KEY", com.avito.android.printable_text.b.c(R.string.applicant_delete_acceptance_title, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.applicant_delete_acceptance_description, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.acceptance_delete, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.acceptance_decline, new Serializable[0]), ButtonStyle.f198196c, new BorrowerDeleteAction(((InterfaceC40199a.C40208j) interfaceC40199a2).f395605a))));
                                } else if (interfaceC40199a2 instanceof InterfaceC40199a.C40205g) {
                                    interfaceC43160iG = C43175k.G(new C32684b(this, c40513c2, ((InterfaceC40199a.C40205g) interfaceC40199a2).f395602a, null));
                                } else if (interfaceC40199a2 instanceof InterfaceC40199a.R) {
                                    interfaceC43160iG = new C43207v(new MortgageRootInternalAction[0]);
                                } else if (interfaceC40199a2 instanceof InterfaceC40199a.O) {
                                    SignChangeAction signChangeAction = ((InterfaceC40199a.O) interfaceC40199a2).f395592a;
                                    interfaceC43160iG = new C43207v(new MortgageRootInternalAction[]{new MortgageRootInternalAction.SignChangeSelected(signChangeAction.f202934b, signChangeAction.f202935c), new MortgageRootInternalAction.HandleDeeplink(signChangeAction.f202936d)});
                                } else if (interfaceC40199a2 instanceof InterfaceC40199a.y) {
                                    interfaceC43160iG = C43175k.G(new j(c40513c2, interfaceC40199a2, null));
                                } else if (interfaceC40199a2 instanceof InterfaceC40199a.C40201c) {
                                    interfaceC43160iG = C43175k.G(new k(this, interfaceC40199a2, c40513c2, null));
                                } else if (interfaceC40199a2 instanceof InterfaceC40199a.w) {
                                    interfaceC43160iG = this.f203335g.a(((InterfaceC40199a.w) interfaceC40199a2).f395620a, str);
                                } else if (interfaceC40199a2 instanceof InterfaceC40199a.x) {
                                    interfaceC43160iG = C43175k.G(new l(this, interfaceC40199a2, c40513c2, null));
                                } else if (interfaceC40199a2 instanceof InterfaceC40199a.M) {
                                    interfaceC43160iG = C43175k.G(new m(this, interfaceC40199a2, c40513c2, null));
                                } else if (interfaceC40199a2 instanceof InterfaceC40199a.N) {
                                    interfaceC43160iG = C43175k.G(new n(this, interfaceC40199a2, c40513c2, null));
                                } else if (interfaceC40199a2 instanceof InterfaceC40199a.J) {
                                    interfaceC43160iG = new C43210w(new MortgageRootInternalAction.OpenAcceptDialog(new AcceptanceDialogArguments("DELETE_REALTY_OBJECT_REQUEST_KEY", com.avito.android.printable_text.b.c(R.string.mortgage_realty_object_delete_acceptance_title, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.mortgage_realty_object_delete_acceptance_description, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.acceptance_delete, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.acceptance_decline, new Serializable[0]), ButtonStyle.f198196c, null, 64, null)));
                                } else if (interfaceC40199a2 instanceof InterfaceC40199a.z) {
                                    interfaceC43160iG = this.f203338j.a(str);
                                } else if (interfaceC40199a2 instanceof InterfaceC40199a.I) {
                                    interfaceC43160iG = C43175k.G(new o(this, interfaceC40199a2, c40513c2, null));
                                } else if (interfaceC40199a2 instanceof InterfaceC40199a.F) {
                                    interfaceC43160iG = C43175k.G(new p(this, interfaceC40199a2, c40513c2, null));
                                } else if (interfaceC40199a2 instanceof InterfaceC40199a.C) {
                                    interfaceC43160iG = C43175k.G(new q(this, c40513c2, null));
                                } else if (interfaceC40199a2 instanceof InterfaceC40199a.E) {
                                    interfaceC43160iG = C43175k.G(new f(this, interfaceC40199a2, c40513c2, null));
                                } else if (interfaceC40199a2 instanceof InterfaceC40199a.A) {
                                    interfaceC43160iG = new C43207v(new MortgageRootInternalAction[]{new MortgageRootInternalAction.RealtyObjectDetailsFirstFieldUpdated(((InterfaceC40199a.A) interfaceC40199a2).f395577a), MortgageRootInternalAction.RealtyObjectDetailsAddressFillByHandClicked.f203217b});
                                } else if (interfaceC40199a2 instanceof InterfaceC40199a.D) {
                                    interfaceC43160iG = new C43210w(new MortgageRootInternalAction.RealtyObjectDetailsFirstFieldUpdated(((InterfaceC40199a.D) interfaceC40199a2).f395580a));
                                } else if (interfaceC40199a2 instanceof InterfaceC40199a.H) {
                                    interfaceC43160iG = new C43210w(new MortgageRootInternalAction.RealtyObjectDetailsSecondFieldUpdated(((InterfaceC40199a.H) interfaceC40199a2).f395584a));
                                } else if (interfaceC40199a2 instanceof InterfaceC40199a.B) {
                                    interfaceC43160iG = C43175k.G(new g(this, c40513c2, null));
                                } else {
                                    if (!(interfaceC40199a2 instanceof InterfaceC40199a.G)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    interfaceC43160iG = C43175k.G(new h(this, c40513c2, null));
                                }
                            } else if (c40511a == null || (a12 = c40511a.f396232b) == null || (c43210w = d(c40513c2, a12.getType(), false)) == null) {
                                interfaceC43160iG = new C43207v(new MortgageRootInternalAction[0]);
                            }
                        }
                    }
                }
                interfaceC43160iG = c43210w;
            }
        }
        return new C43197r1(new C32686d(this, c40513c2, null), interfaceC43160iG);
    }

    public final InterfaceC43160i<MortgageRootInternalAction> d(C40513c c40513c, ApplicationProcessType applicationProcessType, boolean z12) {
        if (applicationProcessType == ApplicationProcessType.SAVE) {
            JZ.d dVar = c40513c.f396249e;
            if ((dVar != null ? dVar.getLegalRequirements() : null) != null) {
                JZ.d dVar2 = c40513c.f396249e;
                return new C43210w(new MortgageRootInternalAction.OpenSendingConfirm(new SendingConfirmArguments(dVar2.getLegalRequirements(), c40513c.f396246b, dVar2.getAnalytics().getCurrentMortgageStage())));
            }
        }
        return this.f203329a.b(c40513c.f396246b, applicationProcessType, z12);
    }
}

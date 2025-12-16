package Y00;

import KZ.C14272b;
import KZ.C14280j;
import KZ.C14282l;
import KZ.C14285o;
import KZ.InterfaceC14286p;
import a10.InterfaceC19665b;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.InterfaceC28464o;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.acceptance_dialog.model.AcceptanceDialogArguments;
import com.avito.android.mortgage.api.model.ActionButton;
import com.avito.android.mortgage.api.model.items.application.ApplicationContentItemType;
import com.avito.android.mortgage.api.model.items.application.ApplicationLegacyStatusType;
import com.avito.android.mortgage.api.model.items.application.ApplicationProcessType;
import com.avito.android.mortgage.api.model.items.application.BannerAnalyticsType;
import com.avito.android.mortgage.deeplink.MortgageConsultationLink;
import com.avito.android.mortgage.root.model.SignChangeAction;
import com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction;
import g10.C40513c;
import g10.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageRootAnalyticsHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LY00/e;", "LY00/d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Y00.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C18244e implements InterfaceC18243d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f19221a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC18246g f19222b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f19223c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public String f19224d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public List<C14285o> f19225e;

    /* compiled from: MortgageRootAnalyticsHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Y00.e$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19226a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f19227b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f19228c;

        static {
            int[] iArr = new int[ApplicationLegacyStatusType.values().length];
            try {
                iArr[ApplicationLegacyStatusType.VALIDATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApplicationLegacyStatusType.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f19226a = iArr;
            int[] iArr2 = new int[ApplicationProcessType.values().length];
            try {
                iArr2[ApplicationProcessType.NEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ApplicationProcessType.SAVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ApplicationProcessType.CONFIRM_REALTY_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ApplicationProcessType.PREVIOUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f19227b = iArr2;
            int[] iArr3 = new int[BannerAnalyticsType.values().length];
            try {
                iArr3[BannerAnalyticsType.SEARCH_REALTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[BannerAnalyticsType.BUY_INSURANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f19228c = iArr3;
        }
    }

    @Inject
    public C18244e(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC18246g interfaceC18246g) {
        this.f19221a = interfaceC28373a;
        this.f19222b = interfaceC18246g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y00.InterfaceC18243d
    public final void a(@Y61.k MortgageRootInternalAction mortgageRootInternalAction, @Y61.k C40513c c40513c) {
        JZ.a analytics;
        String currentMortgageStage;
        String str;
        Iterable iterable;
        KZ.H h12;
        ActionButton action;
        InterfaceC28464o f12;
        String str2;
        JZ.d dVar = c40513c.f396249e;
        if (dVar == null || (analytics = dVar.getAnalytics()) == null || (currentMortgageStage = analytics.getCurrentMortgageStage()) == null) {
            return;
        }
        String currentApplicantType = dVar.getAnalytics().getCurrentApplicantType();
        boolean z12 = mortgageRootInternalAction instanceof MortgageRootInternalAction.ApplicationLoadingCompleted;
        String str3 = c40513c.f396246b;
        if (z12 || (mortgageRootInternalAction instanceof MortgageRootInternalAction.StepLoadingCompleted) || (mortgageRootInternalAction instanceof MortgageRootInternalAction.ApplicationPollingCompleted) || (mortgageRootInternalAction instanceof MortgageRootInternalAction.ApplicationReloadingCompleted)) {
            b(c40513c, str3, currentMortgageStage);
        } else {
            boolean z13 = mortgageRootInternalAction instanceof MortgageRootInternalAction.OpenAcceptDialog;
            str = "";
            InterfaceC28373a interfaceC28373a = this.f19221a;
            if (z13) {
                AcceptanceDialogArguments acceptanceDialogArguments = ((MortgageRootInternalAction.OpenAcceptDialog) mortgageRootInternalAction).f203198b;
                String str4 = acceptanceDialogArguments.f198187b;
                int iHashCode = str4.hashCode();
                if (iHashCode != -872309428) {
                    if (iHashCode != -131685634) {
                        if (iHashCode == 1549420537 && str4.equals("CHANGE_SIGNATURE_REQUEST_KEY")) {
                            Parcelable parcelable = acceptanceDialogArguments.f198193h;
                            SignChangeAction signChangeAction = parcelable instanceof SignChangeAction ? (SignChangeAction) parcelable : null;
                            if (signChangeAction != null && (str2 = signChangeAction.f202935c) != null) {
                                str = str2;
                            }
                            interfaceC28373a.c(new s(str3, str));
                        }
                    } else if (str4.equals("DELETE_APPLICANT_REQUEST_KEY")) {
                        interfaceC28373a.c(new j(str3));
                    }
                } else if (str4.equals("DELETE_APPLICATION_REQUEST_KEY")) {
                    interfaceC28373a.c(new A(str3, currentMortgageStage));
                }
            } else if (mortgageRootInternalAction instanceof MortgageRootInternalAction.ApplicationDeleteStarted) {
                interfaceC28373a.c(new x(str3, currentMortgageStage));
            } else if (mortgageRootInternalAction instanceof MortgageRootInternalAction.OpenDetails) {
                interfaceC28373a.c(new D(str3, currentMortgageStage));
            } else if ((mortgageRootInternalAction instanceof MortgageRootInternalAction.OpenApplicantTypeSelector) || (mortgageRootInternalAction instanceof MortgageRootInternalAction.CreateApplicantLoadingStarted)) {
                interfaceC28373a.c(new C18241b(str3));
            } else if (mortgageRootInternalAction instanceof MortgageRootInternalAction.DeleteApplicant) {
                interfaceC28373a.c(new w(str3));
            } else if (mortgageRootInternalAction instanceof MortgageRootInternalAction.StepLoadingStarted) {
                MortgageRootInternalAction.StepLoadingStarted stepLoadingStarted = (MortgageRootInternalAction.StepLoadingStarted) mortgageRootInternalAction;
                if (stepLoadingStarted.f203252e) {
                    int i12 = a.f19227b[stepLoadingStarted.f203251d.ordinal()];
                    if (i12 == 1 || i12 == 2) {
                        interfaceC28373a.c(new C(str3, currentMortgageStage, currentApplicantType, null));
                    } else if (i12 == 3) {
                        interfaceC28373a.c(new C(str3, currentMortgageStage, currentApplicantType, "property_documents_continue"));
                    } else if (i12 == 4) {
                        interfaceC28373a.c(new E(str3, currentMortgageStage));
                    }
                }
            } else if (mortgageRootInternalAction instanceof MortgageRootInternalAction.SignChangeSelected) {
                MortgageRootInternalAction.SignChangeSelected signChangeSelected = (MortgageRootInternalAction.SignChangeSelected) mortgageRootInternalAction;
                String str5 = signChangeSelected.f203240c;
                interfaceC28373a.c(new t(str3, signChangeSelected.f203239b, str5 != null ? str5 : ""));
            } else if (mortgageRootInternalAction instanceof MortgageRootInternalAction.OpenConfirmCloseDialog) {
                interfaceC28373a.c(new l(str3, currentMortgageStage));
            } else if (mortgageRootInternalAction instanceof MortgageRootInternalAction.CloseConfirmed) {
                interfaceC28373a.c(new k(str3, currentMortgageStage, "left_from_pop_up"));
            } else if (mortgageRootInternalAction instanceof MortgageRootInternalAction.CloseDeclined) {
                interfaceC28373a.c(new k(str3, currentMortgageStage, "return_from_pop_up"));
            } else if (mortgageRootInternalAction instanceof MortgageRootInternalAction.OpenMortgageTerms) {
                interfaceC28373a.c(new B(str3));
            } else if (mortgageRootInternalAction instanceof MortgageRootInternalAction.StatusReloadClicked) {
                interfaceC28373a.c(new y(str3));
            } else if (mortgageRootInternalAction instanceof MortgageRootInternalAction.BannerClicked) {
                interfaceC28373a.c(new q(str3));
            } else if (mortgageRootInternalAction instanceof MortgageRootInternalAction.ScreenScrolled) {
                MortgageRootInternalAction.ScreenScrolled screenScrolled = (MortgageRootInternalAction.ScreenScrolled) mortgageRootInternalAction;
                kotlin.ranges.l lVar = new kotlin.ranges.l(screenScrolled.f203231b, screenScrolled.f203232c, 1);
                g10.d dVar2 = c40513c.f396255k;
                d.a aVar = dVar2 instanceof d.a ? (d.a) dVar2 : null;
                if (aVar == null || (iterable = aVar.f396257b) == null) {
                    iterable = C42784z0.f406748b;
                }
                Iterable iterable2 = iterable;
                ArrayList arrayList = new ArrayList(C42745f0.q(iterable2, 10));
                int i13 = 0;
                for (Object obj : iterable2) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    arrayList.add(new Q(Integer.valueOf(i13), (InterfaceC19665b) obj));
                    i13 = i14;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((Q) next).f406620c instanceof com.avito.android.mortgage.root.list.items.cta_banner.c) {
                        arrayList2.add(next);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    LinkedHashMap linkedHashMap = this.f19223c;
                    int i15 = lVar.f406906c;
                    int i16 = lVar.f406905b;
                    if (zHasNext) {
                        Q q12 = (Q) it2.next();
                        int iIntValue = ((Number) q12.f406619b).intValue();
                        InterfaceC19665b interfaceC19665b = (InterfaceC19665b) q12.f406620c;
                        com.avito.android.mortgage.root.list.items.cta_banner.c cVar = interfaceC19665b instanceof com.avito.android.mortgage.root.list.items.cta_banner.c ? (com.avito.android.mortgage.root.list.items.cta_banner.c) interfaceC19665b : null;
                        boolean z14 = iIntValue <= i15 && i16 <= iIntValue;
                        String f202520b = interfaceC19665b.getF202520b();
                        if (z14) {
                            Object obj2 = linkedHashMap.get(f202520b);
                            Boolean bool = Boolean.TRUE;
                            if (L.f(obj2, bool)) {
                                continue;
                            } else {
                                BannerAnalyticsType bannerAnalyticsType = cVar != null ? cVar.f202525g : null;
                                int i17 = bannerAnalyticsType == null ? -1 : a.f19228c[bannerAnalyticsType.ordinal()];
                                if (i17 == -1) {
                                    f12 = null;
                                } else if (i17 == 1) {
                                    f12 = new F(str3);
                                } else {
                                    if (i17 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    f12 = new r(str3);
                                }
                                if (f12 != null) {
                                    interfaceC28373a.c(f12);
                                }
                                linkedHashMap.put(f202520b, bool);
                            }
                        } else {
                            linkedHashMap.put(f202520b, Boolean.FALSE);
                        }
                    } else {
                        ArrayList arrayList3 = new ArrayList(C42745f0.q(iterable2, 10));
                        int i18 = 0;
                        for (Object obj3 : iterable2) {
                            int i19 = i18 + 1;
                            if (i18 < 0) {
                                C42745f0.H0();
                                throw null;
                            }
                            arrayList3.add(new Q(Integer.valueOf(i18), (InterfaceC19665b) obj3));
                            i18 = i19;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            Object next2 = it3.next();
                            if (((Q) next2).f406620c instanceof com.avito.android.mortgage.root.list.items.team.c) {
                                arrayList4.add(next2);
                            }
                        }
                        Iterator it4 = arrayList4.iterator();
                        while (it4.hasNext()) {
                            Q q13 = (Q) it4.next();
                            int iIntValue2 = ((Number) q13.f406619b).intValue();
                            InterfaceC19665b interfaceC19665b2 = (InterfaceC19665b) q13.f406620c;
                            com.avito.android.mortgage.root.list.items.team.c cVar2 = interfaceC19665b2 instanceof com.avito.android.mortgage.root.list.items.team.c ? (com.avito.android.mortgage.root.list.items.team.c) interfaceC19665b2 : null;
                            DeepLink link = (cVar2 == null || (h12 = cVar2.f202857e) == null || (action = h12.getAction()) == null) ? null : action.getLink();
                            MortgageConsultationLink mortgageConsultationLink = link instanceof MortgageConsultationLink ? (MortgageConsultationLink) link : null;
                            if (mortgageConsultationLink != null) {
                                boolean z15 = iIntValue2 <= i15 && i16 <= iIntValue2;
                                String f202520b2 = interfaceC19665b2.getF202520b();
                                if (z15) {
                                    Object obj4 = linkedHashMap.get(f202520b2);
                                    Boolean bool2 = Boolean.TRUE;
                                    if (!L.f(obj4, bool2)) {
                                        interfaceC28373a.c(new v(str3, mortgageConsultationLink.f198697d));
                                        linkedHashMap.put(f202520b2, bool2);
                                    }
                                } else {
                                    linkedHashMap.put(f202520b2, Boolean.FALSE);
                                }
                            }
                        }
                    }
                }
            } else if (mortgageRootInternalAction instanceof MortgageRootInternalAction.OpenImmutableDataDescription) {
                interfaceC28373a.c(new C18240a(str3, currentMortgageStage, ((MortgageRootInternalAction.OpenImmutableDataDescription) mortgageRootInternalAction).f203210c));
            } else if (mortgageRootInternalAction instanceof MortgageRootInternalAction.HandleDeeplink) {
                DeepLink deepLink = ((MortgageRootInternalAction.HandleDeeplink) mortgageRootInternalAction).f203194b;
                if (deepLink instanceof MortgageConsultationLink) {
                    interfaceC28373a.c(new u(str3, ((MortgageConsultationLink) deepLink).f198697d));
                }
            }
        }
        this.f19225e = c40513c.f396248d;
        this.f19224d = currentMortgageStage;
    }

    public final void b(C40513c c40513c, String str, String str2) {
        Object obj;
        Object next;
        Object next2;
        boolean zF2 = L.f(this.f19224d, str2);
        InterfaceC28373a interfaceC28373a = this.f19221a;
        if (!zF2) {
            interfaceC28373a.c(new G(str, str2));
        }
        List<C14285o> list = c40513c.f396248d;
        if (L.f(list, this.f19225e)) {
            return;
        }
        List<C14285o> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
                if (((C14285o) next).f9529a == ApplicationContentItemType.APPLICATION_STATUS) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C14285o c14285o = (C14285o) next;
        InterfaceC14286p interfaceC14286p = c14285o != null ? c14285o.f9530b : null;
        KZ.y yVar = interfaceC14286p instanceof KZ.y ? (KZ.y) interfaceC14286p : null;
        ApplicationLegacyStatusType type = yVar != null ? yVar.getType() : null;
        int i12 = type == null ? -1 : a.f19226a[type.ordinal()];
        if (i12 == 1) {
            interfaceC28373a.c(new H(str));
        } else if (i12 == 2) {
            interfaceC28373a.c(new z(str));
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            if (((C14285o) obj2).f9529a == ApplicationContentItemType.APPEALS) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            InterfaceC14286p interfaceC14286p2 = ((C14285o) it2.next()).f9530b;
            C14282l c14282l = interfaceC14286p2 instanceof C14282l ? (C14282l) interfaceC14286p2 : null;
            if (c14282l != null) {
                arrayList2.add(c14282l);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            C14282l c14282l2 = (C14282l) it3.next();
            LinkedHashMap linkedHashMapB = c14282l2.b();
            if (linkedHashMapB == null) {
                List<C14272b> listA = c14282l2.a();
                ArrayList arrayList3 = new ArrayList(C42745f0.q(listA, 10));
                Iterator<T> it4 = listA.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(((C14272b) it4.next()).getTitle());
                }
                interfaceC28373a.c(new p(str, str2, arrayList3));
            } else {
                Iterator<T> it5 = c14282l2.c().iterator();
                while (true) {
                    if (it5.hasNext()) {
                        next2 = it5.next();
                        if (L.f(((C14280j) next2).getState(), c40513c.f396251g)) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                C14280j c14280j = (C14280j) next2;
                if (c14280j == null) {
                    c14280j = (C14280j) C42745f0.E(c14282l2.c());
                }
                List<C14272b> list3 = (List) linkedHashMapB.get(c14280j.getState());
                if (list3 == null) {
                    list3 = C42784z0.f406748b;
                }
                this.f19222b.b(str, str2, list3);
            }
        }
        Iterator<T> it6 = list2.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next3 = it6.next();
            if (((C14285o) next3).f9529a == ApplicationContentItemType.APPEAL_BANNER) {
                obj = next3;
                break;
            }
        }
        if (((C14285o) obj) != null) {
            interfaceC28373a.c(new m(str, str2));
        }
    }
}

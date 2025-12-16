package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import Lw.InterfaceC14443a;
import Mw.C14536a;
import Qw.InterfaceC14939a;
import com.avito.android.arch.mvi.a;
import com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.Tab;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.RealtyAgencySearchArguments;
import com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.E;
import com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction;
import com.avito.android.realty_agency.beduin.DevelopmentCardParentScreen;
import com.avito.android.remote.model.SearchParams;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import okhttp3.internal.ws.WebSocketProtocol;
import ri0.InterfaceC47661a;

/* compiled from: RealtyAgencySearchActor.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LLw/a;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "LLw/c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C29866a implements com.avito.android.arch.mvi.a<InterfaceC14443a, RealtyAgencySearchInternalAction, Lw.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final E f138784a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47661a f138785b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Kw.e f138786c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RealtyAgencySearchArguments f138787d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14939a f138788e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Mw.b f138789f;

    /* compiled from: RealtyAgencySearchActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C4185a {
        static {
            int[] iArr = new int[Tab.values().length];
            try {
                iArr[Tab.f138450c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Tab.f138451d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public C29866a(@Y61.k E e12, @Y61.k InterfaceC47661a interfaceC47661a, @Y61.k Kw.e eVar, @Y61.k RealtyAgencySearchArguments realtyAgencySearchArguments, @Y61.k InterfaceC14939a interfaceC14939a, @Y61.k Mw.b bVar) {
        this.f138784a = e12;
        this.f138785b = interfaceC47661a;
        this.f138786c = eVar;
        this.f138787d = realtyAgencySearchArguments;
        this.f138788e = interfaceC14939a;
        this.f138789f = bVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<RealtyAgencySearchInternalAction> b(InterfaceC14443a interfaceC14443a, Lw.c cVar) {
        InterfaceC43160i<RealtyAgencySearchInternalAction> c43207v;
        InterfaceC14443a interfaceC14443a2 = interfaceC14443a;
        Lw.c cVar2 = cVar;
        if (interfaceC14443a2.equals(InterfaceC14443a.C0637a.f10177a)) {
            return new C43210w(RealtyAgencySearchInternalAction.CloseScreen.f138833b);
        }
        if (interfaceC14443a2 instanceof InterfaceC14443a.p) {
            return C43175k.G(new C29876k(cVar2, this, null));
        }
        if (interfaceC14443a2 instanceof InterfaceC14443a.q) {
            return C43175k.G(new C29877l(interfaceC14443a2, cVar2, this, null));
        }
        if (interfaceC14443a2.equals(InterfaceC14443a.t.f10215a)) {
            return E.a.a(this.f138784a, cVar2, null, null, false, null, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
        }
        if (interfaceC14443a2 instanceof InterfaceC14443a.u) {
            return C43175k.G(new C29884t((InterfaceC14443a.u) interfaceC14443a2, cVar2, this, null));
        }
        if (interfaceC14443a2 instanceof InterfaceC14443a.s) {
            return C43175k.G(new C29878m(cVar2, this, null));
        }
        if (interfaceC14443a2 instanceof InterfaceC14443a.k) {
            return C43175k.G(new C29879n(interfaceC14443a2, cVar2, this, null));
        }
        if (interfaceC14443a2 instanceof InterfaceC14443a.n) {
            return C43175k.G(new C29880o(interfaceC14443a2, cVar2, this, null));
        }
        if (interfaceC14443a2 instanceof InterfaceC14443a.h) {
            return C43175k.G(new C29881p(interfaceC14443a2, cVar2, this, null));
        }
        if (interfaceC14443a2 instanceof InterfaceC14443a.c.C0641c) {
            c43207v = new C43210w(new RealtyAgencySearchInternalAction.ShowDevelopmentItemBottomSheetOptions(((InterfaceC14443a.c.C0641c) interfaceC14443a2).f10183a));
        } else {
            boolean z12 = interfaceC14443a2 instanceof InterfaceC14443a.c.C0640a;
            RealtyAgencySearchArguments realtyAgencySearchArguments = this.f138787d;
            if (z12) {
                c43207v = new C43210w(new RealtyAgencySearchInternalAction.ShowDevelopmentItemCardScreen(DevelopmentCardParentScreen.f250844c, ((InterfaceC14443a.c.C0640a) interfaceC14443a2).f10181a, realtyAgencySearchArguments.f138671i));
            } else if (interfaceC14443a2 instanceof InterfaceC14443a.e.c) {
                c43207v = new C43210w(new RealtyAgencySearchInternalAction.ShowLotItemCardScreen(((InterfaceC14443a.e.c) interfaceC14443a2).f10191a, realtyAgencySearchArguments.f138671i));
            } else if (interfaceC14443a2 instanceof InterfaceC14443a.e.C0645e) {
                InterfaceC14443a.e.C0645e c0645e = (InterfaceC14443a.e.C0645e) interfaceC14443a2;
                c43207v = new C43210w(new RealtyAgencySearchInternalAction.ShowLotItemBottomSheetOptions(c0645e.f10194a, c0645e.f10195b));
            } else if (interfaceC14443a2 instanceof InterfaceC14443a.e.C0644a) {
                c43207v = new C43210w(new RealtyAgencySearchInternalAction.ShowSelectionClientPickerBottomSheetScreen(((InterfaceC14443a.e.C0644a) interfaceC14443a2).f10188a, realtyAgencySearchArguments.f138671i));
            } else {
                if (interfaceC14443a2 instanceof InterfaceC14443a.c.b) {
                    return C43175k.G(new C29882q(interfaceC14443a2, cVar2, this, null));
                }
                if (interfaceC14443a2 instanceof InterfaceC14443a.e.d) {
                    return C43175k.G(new r(interfaceC14443a2, cVar2, this, null));
                }
                if (interfaceC14443a2 instanceof InterfaceC14443a.e.b) {
                    return C43175k.G(new C29883s(interfaceC14443a2, cVar2, this, null));
                }
                boolean z13 = interfaceC14443a2 instanceof InterfaceC14443a.i;
                SearchParams searchParams = cVar2.f10238b;
                if (z13) {
                    return new C43210w(new RealtyAgencySearchInternalAction.OpenFiltersScreen(searchParams));
                }
                if (interfaceC14443a2 instanceof InterfaceC14443a.l) {
                    return new C43210w(new RealtyAgencySearchInternalAction.OpenLocationGroupScreen(searchParams));
                }
                if (interfaceC14443a2 instanceof InterfaceC14443a.j) {
                    return C43175k.G(new C29868c(this, null));
                }
                if (interfaceC14443a2 instanceof InterfaceC14443a.r) {
                    c43207v = new C43210w(new RealtyAgencySearchInternalAction.OpenWebView(((InterfaceC14443a.r) interfaceC14443a2).f10213a));
                } else {
                    if (interfaceC14443a2 instanceof InterfaceC14443a.o) {
                        return new C43210w(RealtyAgencySearchInternalAction.ShowNavigationMenuScreen.f138883b);
                    }
                    if (interfaceC14443a2 instanceof InterfaceC14443a.m) {
                        return C43175k.G(new C29869d(interfaceC14443a2, cVar2, null));
                    }
                    if (interfaceC14443a2 instanceof InterfaceC14443a.f.d) {
                        return C43175k.G(new C29870e(interfaceC14443a2, cVar2, this, null));
                    }
                    if (interfaceC14443a2 instanceof InterfaceC14443a.f.c) {
                        return C43175k.G(new C29871f(interfaceC14443a2, cVar2, this, null));
                    }
                    if (interfaceC14443a2 instanceof InterfaceC14443a.f.C0646a) {
                        return C43175k.G(new C29872g(2, null));
                    }
                    if (interfaceC14443a2 instanceof InterfaceC14443a.f.b) {
                        Mw.b bVar = this.f138789f;
                        c43207v = new C29867b(new C14536a(kotlinx.coroutines.rx3.y.a(bVar.f11102c.b(bVar.f11101b, (4 & 2) == 0, (4 & 4) == 0))));
                    } else {
                        if (interfaceC14443a2 instanceof InterfaceC14443a.b.C0638a) {
                            return C43175k.G(new C29873h(cVar2, null));
                        }
                        if (interfaceC14443a2 instanceof InterfaceC14443a.b.c) {
                            return C43175k.G(new C29874i(cVar2, null));
                        }
                        if (interfaceC14443a2 instanceof InterfaceC14443a.b.C0639b) {
                            return new C43210w(RealtyAgencySearchInternalAction.ContentBottomSheet.ExpandByHalf.f138835b);
                        }
                        if (interfaceC14443a2 instanceof InterfaceC14443a.g) {
                            return new C43210w(new RealtyAgencySearchInternalAction.ShowHelpCenterBottomSheet(searchParams.getLocationId()));
                        }
                        if (interfaceC14443a2 instanceof InterfaceC14443a.d.c) {
                            c43207v = new C43210w(new RealtyAgencySearchInternalAction.HandleDeeplink(((InterfaceC14443a.d.c) interfaceC14443a2).f10186a));
                        } else if (interfaceC14443a2 instanceof InterfaceC14443a.d.C0642a) {
                            c43207v = new C43210w(new RealtyAgencySearchInternalAction.ShowDevelopmentItemCardScreen(DevelopmentCardParentScreen.f250845d, ((InterfaceC14443a.d.C0642a) interfaceC14443a2).f10184a, realtyAgencySearchArguments.f138671i));
                        } else {
                            if (!(interfaceC14443a2 instanceof InterfaceC14443a.d.b)) {
                                if (interfaceC14443a2 instanceof InterfaceC14443a.d.C0643d) {
                                    return C43175k.G(new C29875j(cVar2, this, null));
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            c43207v = new C43207v(new RealtyAgencySearchInternalAction[]{new RealtyAgencySearchInternalAction.Map.UpdateSelectedMarker(null), RealtyAgencySearchInternalAction.SelectedDevelopmentItemInfoLoading.Clear.f138863b});
                        }
                    }
                }
            }
        }
        return c43207v;
    }
}

package com.avito.android.publish.screen.step.params.mvi;

import Ie0.InterfaceC14065a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.publish.screen.step.params.domain.InterfaceC34074a;
import com.avito.android.publish.screen.step.params.domain.g0;
import com.avito.android.publish.screen.step.params.mvi.entity.PublishDetailsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PublishDetailsActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/y;", "Lcom/avito/android/arch/mvi/a;", "LIe0/a;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction;", "LIe0/f;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class y implements com.avito.android.arch.mvi.a<InterfaceC14065a, PublishDetailsInternalAction, Ie0.f> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34074a f241505a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g0 f241506b;

    @Inject
    public y(@Y61.k InterfaceC34074a interfaceC34074a, @Y61.k g0 g0Var) {
        this.f241505a = interfaceC34074a;
        this.f241506b = g0Var;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r5v1, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r8v100, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<PublishDetailsInternalAction> b(InterfaceC14065a interfaceC14065a, Ie0.f fVar) {
        InterfaceC43160i<PublishDetailsInternalAction> interfaceC43160iG;
        Object obj;
        Object openDeepLink;
        InterfaceC14065a interfaceC14065a2 = interfaceC14065a;
        if (!(interfaceC14065a2 instanceof InterfaceC14065a.c)) {
            if (interfaceC14065a2 instanceof InterfaceC14065a.d) {
                InterfaceC14065a.d dVar = (InterfaceC14065a.d) interfaceC14065a2;
                if (dVar instanceof InterfaceC14065a.d.l) {
                    interfaceC43160iG = C43175k.G(new p(this, null));
                } else if (dVar instanceof InterfaceC14065a.d.C14075b) {
                    interfaceC43160iG = C43175k.G(new q(this, dVar, null));
                } else if (dVar instanceof InterfaceC14065a.d.C0475d) {
                    interfaceC43160iG = C43175k.G(new r(this, dVar, null));
                } else {
                    if (dVar instanceof InterfaceC14065a.d.h) {
                        return new C43210w(PublishDetailsInternalAction.InternalStateAction.HideLoading.f241441b);
                    }
                    if (dVar instanceof InterfaceC14065a.d.v) {
                        InterfaceC14065a.d.v vVar = (InterfaceC14065a.d.v) dVar;
                        interfaceC43160iG = new C43210w(new PublishDetailsInternalAction.InternalStateAction.ShowLoading(vVar.f8325c, vVar.f8324b, vVar.f8323a));
                    } else if (dVar instanceof InterfaceC14065a.d.m) {
                        interfaceC43160iG = C43175k.G(new s(this, dVar, null));
                    } else if (dVar instanceof InterfaceC14065a.d.o) {
                        interfaceC43160iG = C43175k.G(new t(this, null));
                    } else if (dVar instanceof InterfaceC14065a.d.r) {
                        interfaceC43160iG = C43175k.G(new u(this, dVar, null));
                    } else if (dVar instanceof InterfaceC14065a.d.t) {
                        interfaceC43160iG = new C43210w(new PublishDetailsInternalAction.InternalViewAction.ShowConfettiAnimation(((InterfaceC14065a.d.t) dVar).f8321a));
                    } else if (dVar instanceof InterfaceC14065a.d.u) {
                        interfaceC43160iG = new C43210w(new PublishDetailsInternalAction.InternalViewAction.ShowErrorAlert(((InterfaceC14065a.d.u) dVar).f8322a));
                    } else if (dVar instanceof InterfaceC14065a.d.x) {
                        InterfaceC14065a.d.x xVar = (InterfaceC14065a.d.x) dVar;
                        interfaceC43160iG = new C43210w(new PublishDetailsInternalAction.InternalStateAction.UpdateEditorNavigationButtonsState(xVar.f8327a, xVar.f8328b));
                    } else if (dVar instanceof InterfaceC14065a.d.z) {
                        interfaceC43160iG = new C43210w(new PublishDetailsInternalAction.InternalStateAction.UpdateHtmlEditorToolbarFlags(((InterfaceC14065a.d.z) dVar).f8330a));
                    } else if (dVar instanceof InterfaceC14065a.d.A) {
                        interfaceC43160iG = new C43210w(new PublishDetailsInternalAction.InternalStateAction.UpdateHtmlEditorToolbarVisible(((InterfaceC14065a.d.A) dVar).f8295a));
                    } else if (dVar instanceof InterfaceC14065a.d.i) {
                        interfaceC43160iG = new C43210w(new PublishDetailsInternalAction.InternalRouteAction.HtmlFormatClicked(((InterfaceC14065a.d.i) dVar).f8309a));
                    } else if (dVar instanceof InterfaceC14065a.d.j) {
                        interfaceC43160iG = new C43210w(new PublishDetailsInternalAction.InternalRouteAction.HtmlHistoryNavigationClicked(((InterfaceC14065a.d.j) dVar).f8310a));
                    } else if (dVar instanceof InterfaceC14065a.d.s) {
                        InterfaceC14065a.d.s sVar = (InterfaceC14065a.d.s) dVar;
                        interfaceC43160iG = new C43210w(new PublishDetailsInternalAction.InternalViewAction.ShowAddressActionMessageAlert(sVar.f8319a, sVar.f8320b));
                    } else if (dVar instanceof InterfaceC14065a.d.w) {
                        interfaceC43160iG = new C43210w(new PublishDetailsInternalAction.InternalViewAction.ShowSimpleMessageAlert(((InterfaceC14065a.d.w) dVar).f8326a));
                    } else if (dVar instanceof InterfaceC14065a.d.C14076c) {
                        interfaceC43160iG = C43175k.G(new v(this, dVar, null));
                    } else if (dVar instanceof InterfaceC14065a.d.k) {
                        interfaceC43160iG = C43175k.G(new w(this, dVar, null));
                    } else if (dVar instanceof InterfaceC14065a.d.n) {
                        interfaceC43160iG = C43175k.G(new x(this, dVar, null));
                    } else if (dVar instanceof InterfaceC14065a.d.q) {
                        interfaceC43160iG = C43175k.G(new C34114h(this, null));
                    } else if (dVar instanceof InterfaceC14065a.d.p) {
                        interfaceC43160iG = C43175k.G(new C34115i(this, dVar, null));
                    } else if (dVar instanceof InterfaceC14065a.d.y) {
                        interfaceC43160iG = C43175k.G(new j(this, dVar, null));
                    } else if (dVar instanceof InterfaceC14065a.d.C) {
                        interfaceC43160iG = C43175k.G(new k(this, dVar, null));
                    } else if (dVar instanceof InterfaceC14065a.d.D) {
                        interfaceC43160iG = C43175k.G(new l(this, dVar, null));
                    } else if (dVar instanceof InterfaceC14065a.d.C0474a) {
                        interfaceC43160iG = C43175k.G(new m(this, null));
                    } else if (dVar instanceof InterfaceC14065a.d.f) {
                        interfaceC43160iG = C43175k.G(new n(this, null));
                    } else if (dVar instanceof InterfaceC14065a.d.B) {
                        interfaceC43160iG = C43175k.G(new o(this, dVar, null));
                    } else {
                        if (!(dVar instanceof InterfaceC14065a.d.g ? true : dVar instanceof InterfaceC14065a.d.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        interfaceC43160iG = C43175k.w();
                    }
                }
            } else if (interfaceC14065a2 instanceof InterfaceC14065a.InterfaceC0468a) {
                InterfaceC14065a.InterfaceC0468a interfaceC0468a = (InterfaceC14065a.InterfaceC0468a) interfaceC14065a2;
                if (interfaceC0468a instanceof InterfaceC14065a.InterfaceC0468a.c) {
                    return new C43210w(new PublishDetailsInternalAction.InternalRouteAction.ShowConfirmation());
                }
                if (interfaceC0468a instanceof InterfaceC14065a.InterfaceC0468a.C0469a) {
                    interfaceC43160iG = C43175k.G(new C34107a(this, interfaceC0468a, null));
                } else {
                    if (!(interfaceC0468a instanceof InterfaceC14065a.InterfaceC0468a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC43160iG = C43175k.G(new C34108b(this, interfaceC0468a, null));
                }
            } else {
                if (!(interfaceC14065a2 instanceof InterfaceC14065a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC14065a.b bVar = (InterfaceC14065a.b) interfaceC14065a2;
                if (bVar instanceof InterfaceC14065a.b.C0470a) {
                    interfaceC43160iG = C43175k.G(new C34109c(this, null));
                } else if (bVar instanceof InterfaceC14065a.b.c) {
                    interfaceC43160iG = C43175k.G(new C34110d(this, bVar, null));
                } else if (bVar instanceof InterfaceC14065a.b.d) {
                    interfaceC43160iG = C43175k.G(new C34111e(this, bVar, null));
                } else if (bVar instanceof InterfaceC14065a.b.C0471b) {
                    interfaceC43160iG = C43175k.G(new C34112f(this, bVar, null));
                } else {
                    if (!(bVar instanceof InterfaceC14065a.b.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC43160iG = C43175k.G(new C34113g(this, bVar, null));
                }
            }
            return interfaceC43160iG;
        }
        InterfaceC14065a.c cVar = (InterfaceC14065a.c) interfaceC14065a2;
        if (cVar instanceof InterfaceC14065a.c.C0472a) {
            obj = PublishDetailsInternalAction.InternalRouteAction.CheckVideoPicker.f241356b;
        } else if (cVar instanceof InterfaceC14065a.c.C14066b) {
            obj = PublishDetailsInternalAction.InternalRouteAction.ContinuePublishAfterVerification.f241357b;
        } else if (cVar instanceof InterfaceC14065a.c.C14067d) {
            obj = PublishDetailsInternalAction.InternalRouteAction.GoToPreviousStep.f241358b;
        } else {
            if (cVar instanceof InterfaceC14065a.c.C14069f) {
                openDeepLink = new PublishDetailsInternalAction.InternalRouteAction.NavigateToSelectDistrictsScreen(((InterfaceC14065a.c.C14069f) cVar).f8267a);
            } else if (cVar instanceof InterfaceC14065a.c.C14070g) {
                InterfaceC14065a.c.C14070g c14070g = (InterfaceC14065a.c.C14070g) cVar;
                openDeepLink = new PublishDetailsInternalAction.InternalRouteAction.NavigateToSelectMetroScreen(c14070g.f8268a, c14070g.f8269b, c14070g.f8270c);
            } else if (cVar instanceof InterfaceC14065a.c.C14071h) {
                openDeepLink = new PublishDetailsInternalAction.InternalRouteAction.NavigateToSelectPriceListScreen(((InterfaceC14065a.c.C14071h) cVar).f8271a);
            } else if (cVar instanceof InterfaceC14065a.c.C14072i) {
                obj = PublishDetailsInternalAction.InternalRouteAction.OnEditCategoryClicked.f241371b;
            } else if (cVar instanceof InterfaceC14065a.c.C14073j) {
                obj = PublishDetailsInternalAction.InternalRouteAction.OpenCamera.f241372b;
            } else if (cVar instanceof InterfaceC14065a.c.C14074k) {
                obj = PublishDetailsInternalAction.InternalRouteAction.OpenCameraRequest.f241373b;
            } else if (cVar instanceof InterfaceC14065a.c.l) {
                openDeepLink = new PublishDetailsInternalAction.InternalRouteAction.OpenConfirmDisablingDialog(((InterfaceC14065a.c.l) cVar).f8274a);
            } else if (cVar instanceof InterfaceC14065a.c.m) {
                openDeepLink = new PublishDetailsInternalAction.InternalRouteAction.OpenDeleteAddressConfirmationDialog(((InterfaceC14065a.c.m) cVar).f8275a);
            } else if (cVar instanceof InterfaceC14065a.c.n) {
                InterfaceC14065a.c.n nVar = (InterfaceC14065a.c.n) cVar;
                openDeepLink = new PublishDetailsInternalAction.InternalRouteAction.OpenDeliveryAddressesListDialog(nVar.f8276a, nVar.f8277b);
            } else if (cVar instanceof InterfaceC14065a.c.o) {
                obj = PublishDetailsInternalAction.InternalRouteAction.OpenDeliveryToggles.f241380b;
            } else if (cVar instanceof InterfaceC14065a.c.p) {
                InterfaceC14065a.c.p pVar = (InterfaceC14065a.c.p) cVar;
                openDeepLink = new PublishDetailsInternalAction.InternalRouteAction.OpenFilePicker(pVar.f8279a, pVar.f8280b);
            } else if (cVar instanceof InterfaceC14065a.c.q) {
                obj = PublishDetailsInternalAction.InternalRouteAction.OpenIacDevicesInfoDialog.f241383b;
            } else if (cVar instanceof InterfaceC14065a.c.r) {
                InterfaceC14065a.c.r rVar = (InterfaceC14065a.c.r) cVar;
                openDeepLink = new PublishDetailsInternalAction.InternalRouteAction.OpenIacDevicesSelectDialog(rVar.f8282a, rVar.f8283b, rVar.f8284c);
            } else if (cVar instanceof InterfaceC14065a.c.s) {
                InterfaceC14065a.c.s sVar2 = (InterfaceC14065a.c.s) cVar;
                openDeepLink = new PublishDetailsInternalAction.InternalRouteAction.OpenParametersBottomSheet(sVar2.f8285a, sVar2.f8286b, sVar2.f8287c);
            } else if (cVar instanceof InterfaceC14065a.c.t) {
                openDeepLink = new PublishDetailsInternalAction.InternalRouteAction.OpenSleepingPlacesBedTypesDialog(((InterfaceC14065a.c.t) cVar).f8288a);
            } else if (cVar instanceof InterfaceC14065a.c.u) {
                openDeepLink = new PublishDetailsInternalAction.InternalRouteAction.OpenVideoPicker(((InterfaceC14065a.c.u) cVar).f8289a);
            } else if (cVar instanceof InterfaceC14065a.c.v) {
                openDeepLink = new PublishDetailsInternalAction.InternalRouteAction.OpenWebUrl(((InterfaceC14065a.c.v) cVar).f8290a);
            } else if (cVar instanceof InterfaceC14065a.c.w) {
                obj = PublishDetailsInternalAction.InternalRouteAction.ShowAppSettings.f241398b;
            } else if (cVar instanceof InterfaceC14065a.c.x) {
                openDeepLink = new PublishDetailsInternalAction.InternalRouteAction.ShowAutoEarlyAccessSelectScreen(((InterfaceC14065a.c.x) cVar).f8291a);
            } else if (cVar instanceof InterfaceC14065a.c.K) {
                openDeepLink = new PublishDetailsInternalAction.InternalRouteAction.ShowSelectorCardGroupBottomSheet(((InterfaceC14065a.c.K) cVar).f8261a);
            } else if (cVar instanceof InterfaceC14065a.c.z) {
                InterfaceC14065a.c.z zVar = (InterfaceC14065a.c.z) cVar;
                openDeepLink = new PublishDetailsInternalAction.InternalRouteAction.ShowDateDialog(zVar.f8293a, zVar.f8294b);
            } else if (cVar instanceof InterfaceC14065a.c.A) {
                InterfaceC14065a.c.A a12 = (InterfaceC14065a.c.A) cVar;
                openDeepLink = new PublishDetailsInternalAction.InternalRouteAction.ShowDatePickerDialog(a12.f8236a, a12.f8237b, a12.f8238c);
            } else if (cVar instanceof InterfaceC14065a.c.B) {
                InterfaceC14065a.c.B b12 = (InterfaceC14065a.c.B) cVar;
                openDeepLink = new PublishDetailsInternalAction.InternalRouteAction.ShowDateTimeRangeDialog(b12.f8239a, b12.f8240b, b12.f8241c);
            } else if (cVar instanceof InterfaceC14065a.c.C) {
                InterfaceC14065a.c.C c12 = (InterfaceC14065a.c.C) cVar;
                openDeepLink = new PublishDetailsInternalAction.InternalRouteAction.ShowDialog(c12.f8242a, c12.f8243b, c12.f8244c, c12.f8245d, c12.f8246e);
            } else if (cVar instanceof InterfaceC14065a.c.D) {
                InterfaceC14065a.c.D d12 = (InterfaceC14065a.c.D) cVar;
                openDeepLink = new PublishDetailsInternalAction.InternalRouteAction.ShowDialogDismissable(d12.f8247a, d12.f8248b, d12.f8249c, d12.f8250d, d12.f8251e, d12.f8252f);
            } else if (cVar instanceof InterfaceC14065a.c.E) {
                InterfaceC14065a.c.E e12 = (InterfaceC14065a.c.E) cVar;
                openDeepLink = new PublishDetailsInternalAction.InternalRouteAction.ShowEditObjectsScreen(e12.f8253a, e12.f8254b);
            } else if (cVar instanceof InterfaceC14065a.c.F) {
                openDeepLink = new PublishDetailsInternalAction.InternalRouteAction.ShowHelpCenterScreen(((InterfaceC14065a.c.F) cVar).f8255a);
            } else if (cVar instanceof InterfaceC14065a.c.G) {
                InterfaceC14065a.c.G g12 = (InterfaceC14065a.c.G) cVar;
                openDeepLink = new PublishDetailsInternalAction.InternalRouteAction.ShowLocationPicker(g12.f8256a, g12.f8257b);
            } else if (cVar instanceof InterfaceC14065a.c.H) {
                openDeepLink = new PublishDetailsInternalAction.InternalRouteAction.ShowPublishDetailsStepForFillParams(((InterfaceC14065a.c.H) cVar).f8258a);
            } else if (cVar instanceof InterfaceC14065a.c.I) {
                obj = PublishDetailsInternalAction.InternalRouteAction.ShowResidentialComplexSuggestScreen.f241431b;
            } else if (cVar instanceof InterfaceC14065a.c.J) {
                openDeepLink = new PublishDetailsInternalAction.InternalRouteAction.ShowSelectScreen(((InterfaceC14065a.c.J) cVar).f8260a);
            } else if (cVar instanceof InterfaceC14065a.c.y) {
                openDeepLink = new PublishDetailsInternalAction.InternalRouteAction.ShowCpaTariffRequestScreen(((InterfaceC14065a.c.y) cVar).f8292a);
            } else if (cVar instanceof InterfaceC14065a.c.C0473c) {
                InterfaceC14065a.c.C0473c c0473c = (InterfaceC14065a.c.C0473c) cVar;
                openDeepLink = new PublishDetailsInternalAction.InternalRouteAction.OpenDeepLink(c0473c.f8263a, c0473c.f8264b);
            } else {
                if (!(cVar instanceof InterfaceC14065a.c.C14068e)) {
                    throw new NoWhenBranchMatchedException();
                }
                obj = PublishDetailsInternalAction.InternalRouteAction.LeaveScreen.f241365b;
            }
            obj = openDeepLink;
        }
        return new C43210w(obj);
    }
}

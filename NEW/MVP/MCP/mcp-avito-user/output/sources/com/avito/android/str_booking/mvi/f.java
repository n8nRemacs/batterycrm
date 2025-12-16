package com.avito.android.str_booking.mvi;

import Jx0.C14258a;
import Vx0.AbstractC15725a;
import com.avito.android.analytics.a0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.str_booking.mvi.entity.StrBookingInternalAction;
import com.avito.android.str_booking.mvi.entity.a;
import com.avito.android.str_booking.network.models.common.Prompt;
import com.avito.android.str_booking.network.models.sections.InfoContent;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import com.yandex.metrica.YandexMetricaDefaultValues;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: StrBookingActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_booking.mvi.StrBookingActor$process$1", f = "StrBookingActor.kt", i = {}, l = {64, 83, 85, 89, YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS, 91, 97, UpdateStatusCode.DialogButton.CONFIRM, 106, 110, 114, 118, 122, WebSocketProtocol.PAYLOAD_SHORT, 135, 139, 149}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrBookingInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f285818q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f285819r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.str_booking.mvi.entity.a f285820s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f285821t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.avito.android.str_booking.mvi.entity.a aVar, a aVar2, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f285820s = aVar;
        this.f285821t = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f285820s, this.f285821t, continuation);
        fVar.f285819r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrBookingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        ParametrizedEvent onExpandEvent;
        C14258a c14258aA;
        SuggestAnalyticsEvent suggestAnalyticsEvent;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.f285818q) {
            case 0:
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f285819r;
                com.avito.android.str_booking.mvi.entity.a aVar = this.f285820s;
                boolean z12 = aVar instanceof a.i;
                a aVar2 = this.f285821t;
                if (z12) {
                    a.i iVar = (a.i) aVar;
                    C14258a c14258a = iVar.f285791d;
                    if (c14258a != null) {
                        aVar2.f285718a.c(c14258a);
                    }
                    Prompt prompt = iVar.f285790c;
                    if (prompt != null) {
                        String header = prompt.getHeader();
                        String str = header == null ? "" : header;
                        String approve = prompt.getApprove();
                        String str2 = approve == null ? "" : approve;
                        String cancel = prompt.getCancel();
                        String str3 = cancel == null ? "" : cancel;
                        AttributedText description = prompt.getDescription();
                        Map<String, SuggestAnalyticsEvent> mapC = prompt.c();
                        if (mapC == null || (suggestAnalyticsEvent = mapC.get("approve")) == null) {
                            c14258aA = null;
                        } else {
                            C14258a.f9179c.getClass();
                            c14258aA = C14258a.C0546a.a(suggestAnalyticsEvent);
                        }
                        StrBookingInternalAction.ShowConfirmBottomSheet showConfirmBottomSheet = new StrBookingInternalAction.ShowConfirmBottomSheet(str, str2, str3, description, new a.i(iVar.f285788a, iVar.f285789b, null, c14258aA));
                        this.f285818q = 1;
                        if (interfaceC43172j.emit(showConfirmBottomSheet, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        AbstractC15725a abstractC15725a = iVar.f285788a;
                        if (abstractC15725a instanceof AbstractC15725a.C1218a) {
                            Map<String, String> map = iVar.f285789b;
                            if (map != null) {
                                InterfaceC43160i<StrBookingInternalAction> interfaceC43160iA = aVar2.f285719b.a(abstractC15725a.f17529a, map);
                                this.f285818q = 2;
                                if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                InterfaceC43160i<StrBookingInternalAction> interfaceC43160iC = aVar2.f285719b.c(abstractC15725a.f17529a);
                                this.f285818q = 3;
                                if (C43175k.u(this, interfaceC43160iC, interfaceC43172j) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else if (abstractC15725a instanceof AbstractC15725a.b) {
                            StrBookingInternalAction.OpenDeeplink.Link link = new StrBookingInternalAction.OpenDeeplink.Link(abstractC15725a.f17529a);
                            this.f285818q = 4;
                            if (interfaceC43172j.emit(link, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (abstractC15725a instanceof AbstractC15725a.d) {
                            StrBookingInternalAction.OpenWebView openWebView = new StrBookingInternalAction.OpenWebView(abstractC15725a.f17529a);
                            this.f285818q = 5;
                            if (interfaceC43172j.emit(openWebView, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (abstractC15725a instanceof AbstractC15725a.c) {
                            StrBookingInternalAction.CallUser callUser = new StrBookingInternalAction.CallUser(abstractC15725a.f17529a);
                            this.f285818q = 6;
                            if (interfaceC43172j.emit(callUser, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                } else if (aVar instanceof a.h) {
                    a.h hVar = (a.h) aVar;
                    StrBookingInternalAction.OpenGalleryScreen openGalleryScreen = new StrBookingInternalAction.OpenGalleryScreen(hVar.f285786a, hVar.f285787b);
                    this.f285818q = 7;
                    if (interfaceC43172j.emit(openGalleryScreen, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (aVar instanceof a.j) {
                    StrBookingInternalAction.OpenMap openMap = new StrBookingInternalAction.OpenMap(((a.j) aVar).f285792a);
                    this.f285818q = 8;
                    if (interfaceC43172j.emit(openMap, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (aVar instanceof a.C8553a) {
                    InfoContent infoContent = ((a.C8553a) aVar).f285779a;
                    if (infoContent != null && (onExpandEvent = infoContent.getOnExpandEvent()) != null) {
                        aVar2.f285718a.c(a0.a(onExpandEvent));
                    }
                    StrBookingInternalAction.AnimateInfoClick animateInfoClick = StrBookingInternalAction.AnimateInfoClick.f285747b;
                    this.f285818q = 9;
                    if (interfaceC43172j.emit(animateInfoClick, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (L.f(aVar, a.k.f285793a)) {
                    InterfaceC43160i interfaceC43160iC2 = a.c(aVar2);
                    this.f285818q = 10;
                    if (C43175k.u(this, interfaceC43160iC2, interfaceC43172j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (L.f(aVar, a.l.f285794a)) {
                    StrBookingInternalAction.ShowFooter showFooter = StrBookingInternalAction.ShowFooter.f285772b;
                    this.f285818q = 11;
                    if (interfaceC43172j.emit(showFooter, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (L.f(aVar, a.g.f285785a)) {
                    StrBookingInternalAction.HideFooter hideFooter = StrBookingInternalAction.HideFooter.f285754b;
                    this.f285818q = 12;
                    if (interfaceC43172j.emit(hideFooter, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (aVar instanceof a.b) {
                    StrBookingInternalAction.CloseScreen closeScreen = StrBookingInternalAction.CloseScreen.f285749b;
                    this.f285818q = 13;
                    if (interfaceC43172j.emit(closeScreen, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (aVar instanceof a.m) {
                    a.m mVar = (a.m) aVar;
                    StrBookingInternalAction.UpdateScrollStates updateScrollStates = new StrBookingInternalAction.UpdateScrollStates(mVar.f285795a, mVar.f285796b);
                    this.f285818q = 14;
                    if (interfaceC43172j.emit(updateScrollStates, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (aVar instanceof a.c) {
                    StrBookingInternalAction.ToggleCollapsableCalculation toggleCollapsableCalculation = new StrBookingInternalAction.ToggleCollapsableCalculation(((a.c) aVar).f285781a);
                    this.f285818q = 15;
                    if (interfaceC43172j.emit(toggleCollapsableCalculation, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (aVar instanceof a.d) {
                    DeepLink deepLink = ((a.d) aVar).f285782a;
                    if (deepLink != null) {
                        StrBookingInternalAction.OpenDeeplink.Deeplink deeplink = new StrBookingInternalAction.OpenDeeplink.Deeplink(deepLink);
                        this.f285818q = 16;
                        if (interfaceC43172j.emit(deeplink, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (aVar instanceof a.e) {
                    aVar2.f285720c.f285576a.putBoolean("guest_profile_shown", true);
                    break;
                } else if (aVar instanceof a.f) {
                    com.avito.android.str_booking.domain.d dVar = aVar2.f285720c;
                    int i12 = dVar.f285576a.getInt("guest_profile_tooltip_shown_count", 0) + 1;
                    dVar.f285576a.a(i12 <= 5 ? i12 : 5, "guest_profile_tooltip_shown_count");
                    StrBookingInternalAction.GuestProfileTooltipShown guestProfileTooltipShown = StrBookingInternalAction.GuestProfileTooltipShown.f285753b;
                    this.f285818q = 17;
                    if (interfaceC43172j.emit(guestProfileTooltipShown, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                C42729a0.b(obj);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return G0.f406611a;
    }
}

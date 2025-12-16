package com.avito.android.user_advert.advert.delegate.user_advert_action;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DraftDeletionLink;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.job.cv_info_actualization.deeplink.JsxCvInfoActualizationDeeplink;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.SuccessResult;
import com.avito.android.remote.model.my_advert.CloseReason;
import com.avito.android.user_advert.advert.InterfaceC35384d1;
import com.avito.android.user_advert.advert.S;
import com.avito.android.user_advert.advert.delegate.user_advert_action.i;
import com.avito.android.user_advert.advert.items.actions_item.ActionsItem;
import com.avito.android.user_advert.advert.items.advert_details.MyAdvertDetailsItem;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import fH0.AbstractC40291a;
import fH0.InterfaceC40292b;
import hz.InterfaceC41196a;
import iI0.C41298c;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import javax.inject.Inject;
import jz.InterfaceC42451b;
import kI0.InterfaceC42585a;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kv.C43501a;

/* compiled from: UserAdvertActionPresenterDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/user_advert_action/b;", "Lcom/avito/android/user_advert/advert/delegate/user_advert_action/a;", "LfH0/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends AbstractC40291a implements com.avito.android.user_advert.advert.delegate.user_advert_action.a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC28373a f308833d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC42585a f308834e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final S f308835f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f308836g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC35384d1 f308837h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC41196a f308838i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public Object f308839j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public Object f308840k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public Object f308841l;

    /* compiled from: UserAdvertActionPresenterDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
            boolean z12 = interfaceC14249c instanceof DraftDeletionLink.b.a;
            b bVar = b.this;
            if (z12) {
                bVar.f395801b.accept(new i.j(((DraftDeletionLink.b.a) interfaceC14249c).f133287b));
                return;
            }
            if (interfaceC14249c instanceof DraftDeletionLink.b.C3996b) {
                bVar.f395801b.accept(new i.k(bVar.f308837h.u()));
                return;
            }
            if (interfaceC14249c instanceof MyAdvertLink.ActivateV2.b.c) {
                bVar.f395801b.accept(new i.c(new SuccessResult(((MyAdvertLink.ActivateV2.b.c) interfaceC14249c).f133472b)));
                return;
            }
            if (interfaceC14249c instanceof MyAdvertLink.ActivateV2.b.a) {
                bVar.f395801b.accept(new i.b(((MyAdvertLink.ActivateV2.b.a) interfaceC14249c).f133470c));
                return;
            }
            if (interfaceC14249c instanceof MyAdvertLink.RestoreV2.b.c) {
                bVar.f395801b.accept(new i.o(((MyAdvertLink.RestoreV2.b.c) interfaceC14249c).f133510b));
                return;
            }
            if (interfaceC14249c instanceof MyAdvertLink.RestoreV2.b.C4009b) {
                bVar.f395801b.accept(new i.n(((MyAdvertLink.RestoreV2.b.C4009b) interfaceC14249c).f133509b));
                return;
            }
            if (interfaceC14249c instanceof MyAdvertLink.RestoreV2.b.a) {
                bVar.f395801b.accept(new i.m(((MyAdvertLink.RestoreV2.b.a) interfaceC14249c).f133508c));
                return;
            }
            if (interfaceC14249c instanceof MyAdvertLink.Delete.b.a) {
                MyAdvertLink.Delete.b.a aVar = (MyAdvertLink.Delete.b.a) interfaceC14249c;
                bVar.f308834e.O(aVar.f133487b);
                InterfaceC42585a interfaceC42585a = bVar.f308834e;
                interfaceC42585a.j();
                ApiError apiError = aVar.f133487b;
                bVar.f395801b.accept(new i.h(apiError));
                interfaceC42585a.E(apiError);
                return;
            }
            if (interfaceC14249c instanceof MyAdvertLink.Delete.b.C4008b) {
                bVar.f308834e.P();
                InterfaceC42585a interfaceC42585a2 = bVar.f308834e;
                interfaceC42585a2.j();
                bVar.f395801b.accept(new i.C9481i(((MyAdvertLink.Delete.b.C4008b) interfaceC14249c).f133488b));
                interfaceC42585a2.G();
                return;
            }
            if (!(interfaceC14249c instanceof MyAdvertLink.Deactivate.b.a)) {
                if (interfaceC14249c instanceof MyAdvertLink.Deactivate.b.C4006b) {
                    MyAdvertLink.Deactivate.b.C4006b c4006b = (MyAdvertLink.Deactivate.b.C4006b) interfaceC14249c;
                    bVar.f395801b.accept(new i.e(c4006b.f133477b, c4006b.f133478c));
                    return;
                } else {
                    if (interfaceC14249c instanceof InterfaceC14249c.a) {
                        return;
                    }
                    boolean z13 = interfaceC14249c instanceof InterfaceC14249c.b;
                    return;
                }
            }
            MyAdvertLink.Deactivate.b.a aVar2 = (MyAdvertLink.Deactivate.b.a) interfaceC14249c;
            bVar.f308834e.u(aVar2.f133476b);
            InterfaceC42585a interfaceC42585a3 = bVar.f308834e;
            interfaceC42585a3.C();
            ApiError apiError2 = aVar2.f133476b;
            bVar.f395801b.accept(new i.f(apiError2));
            interfaceC42585a3.I(apiError2);
        }
    }

    /* compiled from: UserAdvertActionPresenterDelegate.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/SuccessResult;", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_advert.advert.delegate.user_advert_action.b$b, reason: collision with other inner class name */
    public static final class C9480b<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CloseReason f308844c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f308845d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f308846e;

        public C9480b(CloseReason closeReason, String str, String str2) {
            this.f308844c = closeReason;
            this.f308845d = str;
            this.f308846e = str2;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            P2 p22 = (P2) obj;
            boolean z12 = p22 instanceof P2.a;
            b bVar = b.this;
            if (z12) {
                InterfaceC42585a interfaceC42585a = bVar.f308834e;
                ApiError apiError = ((P2.a) p22).f318719a;
                interfaceC42585a.u(apiError);
                InterfaceC42585a interfaceC42585a2 = bVar.f308834e;
                interfaceC42585a2.C();
                bVar.f395801b.accept(new i.f(apiError));
                interfaceC42585a2.I(apiError);
                return;
            }
            if (!(p22 instanceof P2.b)) {
                boolean z13 = p22 instanceof P2.c;
                return;
            }
            bVar.f308834e.c();
            InterfaceC42585a interfaceC42585a3 = bVar.f308834e;
            interfaceC42585a3.C();
            String message = ((SuccessResult) ((P2.b) p22).f318720a).getMessage();
            CloseReason closeReason = this.f308844c;
            Boolean showAppRater = closeReason.getShowAppRater();
            String uxFeedbackEventName = closeReason.getUxFeedbackEventName();
            String str = this.f308845d;
            if (str == null) {
                str = "";
            }
            bVar.f395801b.accept(new i.g(closeReason.getDeliveryRestriction(), message, this.f308846e, b.S(bVar, str, closeReason.getShouldUpdateIncome()), uxFeedbackEventName, showAppRater));
            interfaceC42585a3.M();
        }
    }

    /* compiled from: UserAdvertActionPresenterDelegate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u001e\u0010\u0004\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/SimpleMessageResult;", "Lcom/avito/android/remote/model/SuccessResult;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CloseReason f308849c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f308850d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f308851e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f308852f;

        public d(CloseReason closeReason, String str, String str2, String str3) {
            this.f308849c = closeReason;
            this.f308850d = str;
            this.f308851e = str2;
            this.f308852f = str3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            String str;
            Q q12 = (Q) obj;
            P2 p22 = (P2) q12.f406619b;
            P2 p23 = (P2) q12.f406620c;
            boolean z12 = p22 instanceof P2.b;
            if (p23 instanceof P2.c) {
                return;
            }
            boolean z13 = p23 instanceof P2.a;
            b bVar = b.this;
            if (z13) {
                P2.a aVar = (P2.a) p23;
                bVar.f308834e.u(aVar.f318719a);
                InterfaceC42585a interfaceC42585a = bVar.f308834e;
                interfaceC42585a.C();
                ApiError apiError = aVar.f318719a;
                bVar.f395801b.accept(new i.f(apiError));
                interfaceC42585a.I(apiError);
                return;
            }
            if (p23 instanceof P2.b) {
                bVar.f308834e.c();
                InterfaceC42585a interfaceC42585a2 = bVar.f308834e;
                interfaceC42585a2.C();
                String message = z12 ? ((SuccessResult) ((P2.b) p23).f318720a).getMessage() : bVar.f308837h.x();
                CloseReason closeReason = this.f308849c;
                Boolean showAppRater = closeReason.getShowAppRater();
                String uxFeedbackEventName = closeReason.getUxFeedbackEventName();
                if (z12) {
                    str = this.f308850d;
                } else {
                    str = this.f308851e;
                    if (str == null) {
                        str = "";
                    }
                }
                bVar.f395801b.accept(new i.g(closeReason.getDeliveryRestriction(), message, this.f308852f, b.S(bVar, str, closeReason.getShouldUpdateIncome()), uxFeedbackEventName, showAppRater));
                interfaceC42585a2.M();
            }
        }
    }

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a, @k InterfaceC42585a interfaceC42585a, @k S s5, @k InterfaceC35745a5 interfaceC35745a5, @k InterfaceC35384d1 interfaceC35384d1, @k InterfaceC41196a interfaceC41196a, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f308833d = interfaceC28373a;
        this.f308834e = interfaceC42585a;
        this.f308835f = s5;
        this.f308836g = interfaceC35745a5;
        this.f308837h = interfaceC35384d1;
        this.f308838i = interfaceC41196a;
        EmptyDisposable emptyDisposable = EmptyDisposable.f401988b;
        this.f308839j = emptyDisposable;
        this.f308840k = emptyDisposable;
        this.f308841l = emptyDisposable;
        this.f395802c.d(emptyDisposable, emptyDisposable, emptyDisposable);
        this.f395802c.b(aVar.d9().t0(new a()));
    }

    public static final String S(b bVar, String str, Boolean bool) {
        Character chValueOf;
        bVar.getClass();
        if (!L.f(bool, Boolean.TRUE)) {
            return null;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= str.length()) {
                chValueOf = null;
                break;
            }
            char cCharAt = str.charAt(i12);
            if (Character.isDigit(cCharAt)) {
                chValueOf = Character.valueOf(cCharAt);
                break;
            }
            i12++;
        }
        if (chValueOf == null || str.equals("0")) {
            return null;
        }
        FormatterType.f179288e.getClass();
        return "+ " + com.avito.android.lib.design.input.c.d(FormatterType.a.c(), str, "", 0, Integer.MAX_VALUE, false).f179394a + bVar.f308837h.w();
    }

    @Override // com.avito.android.user_advert.advert.delegate.user_advert_action.a
    public final void B(@k ActionsItem.a aVar, @l MyAdvertDetailsItem myAdvertDetailsItem) {
        T(aVar.f309012b, myAdvertDetailsItem, false);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [io.reactivex.rxjava3.disposables.d, java.lang.Object] */
    @Override // com.avito.android.user_advert.advert.delegate.user_advert_action.a
    public final void D(@k String str, @k CloseReason closeReason, @l String str2, @l String str3) {
        Boolean shouldUpdateIncome = closeReason.getShouldUpdateIncome();
        Boolean bool = Boolean.TRUE;
        String str4 = (L.f(shouldUpdateIncome, bool) || L.f(closeReason.getShowAppRater(), bool)) ? str : null;
        this.f308840k.dispose();
        InterfaceC35745a5 interfaceC35745a5 = this.f308836g;
        S s5 = this.f308835f;
        this.f308840k = str2 == null ? s5.i(closeReason.getId(), str).s(interfaceC35745a5.e()).x(new C9480b(closeReason, str3, str4), io.reactivex.rxjava3.internal.functions.a.f401996f) : I.G(s5.e(str, str2), s5.i(closeReason.getId(), str), new l41.c() { // from class: com.avito.android.user_advert.advert.delegate.user_advert_action.b.c
            @Override // l41.c
            public final Object apply(Object obj, Object obj2) {
                return new Q((P2) obj, (P2) obj2);
            }
        }).s(interfaceC35745a5.e()).x(new d(closeReason, str2, str3, str4), io.reactivex.rxjava3.internal.functions.a.f401996f);
    }

    /* JADX WARN: Type inference failed for: r11v11, types: [io.reactivex.rxjava3.disposables.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v16, types: [io.reactivex.rxjava3.disposables.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6, types: [io.reactivex.rxjava3.disposables.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2, types: [io.reactivex.rxjava3.disposables.d, java.lang.Object] */
    public final void T(DeepLink deepLink, MyAdvertDetailsItem myAdvertDetailsItem, boolean z12) {
        boolean z13 = deepLink instanceof MyAdvertLink.EditLink;
        InterfaceC28373a interfaceC28373a = this.f308833d;
        com.jakewharton.rxrelay3.c<InterfaceC40292b> cVar = this.f395801b;
        if (z13) {
            MyAdvertLink.EditLink editLink = (MyAdvertLink.EditLink) deepLink;
            if (editLink.f()) {
                interfaceC28373a.c(new C41298c(editLink.getF133462b()));
            }
            cVar.accept(new InterfaceC40292b.a(editLink));
            return;
        }
        boolean z14 = deepLink instanceof MyAdvertLink.Delete;
        InterfaceC42585a interfaceC42585a = this.f308834e;
        if (z14) {
            interfaceC42585a.S();
            cVar.accept(new InterfaceC40292b.a((MyAdvertLink.Delete) deepLink));
            return;
        }
        boolean z15 = deepLink instanceof MyAdvertLink.Activate;
        boolean z16 = z15 ? true : deepLink instanceof MyAdvertLink.ActivateV2;
        InterfaceC35745a5 interfaceC35745a5 = this.f308836g;
        S s5 = this.f308835f;
        if (z16) {
            boolean zF2 = L.f(myAdvertDetailsItem != null ? myAdvertDetailsItem.f309139g : null, "112");
            boolean zF3 = L.f(this.f308838i.a(), InterfaceC42451b.a.f405966a);
            if (zF2) {
                if ((myAdvertDetailsItem != null ? myAdvertDetailsItem.f309175y : null) != null && !z12 && zF3) {
                    cVar.accept(new InterfaceC40292b.a(new JsxCvInfoActualizationDeeplink(deepLink, myAdvertDetailsItem.f309129b)));
                    return;
                }
            }
            if (!z15) {
                if (deepLink instanceof MyAdvertLink.ActivateV2) {
                    cVar.accept(new InterfaceC40292b.a(deepLink));
                    return;
                }
                return;
            } else {
                MyAdvertLink.Activate activate = (MyAdvertLink.Activate) deepLink;
                String str = activate.f133463c;
                interfaceC28373a.c(new C41298c(str));
                this.f308839j.dispose();
                this.f308839j = s5.g(str, activate.f133465e).r0(P2.c.f318721a).j0(interfaceC35745a5.e()).t0(new com.avito.android.user_advert.advert.delegate.user_advert_action.c(this));
                return;
            }
        }
        if (deepLink instanceof MyAdvertLink.Allow) {
            String str2 = ((MyAdvertLink.Allow) deepLink).f133473c;
            this.f308839j.dispose();
            this.f308839j = s5.j(str2).r0(P2.c.f318721a).j0(interfaceC35745a5.e()).t0(new com.avito.android.user_advert.advert.delegate.user_advert_action.d(this));
        } else if (deepLink instanceof MyAdvertLink.UpdateReservation) {
            MyAdvertLink.UpdateReservation updateReservation = (MyAdvertLink.UpdateReservation) deepLink;
            this.f308839j.dispose();
            this.f308839j = s5.c(updateReservation.f133511c, updateReservation.f133512d).r0(P2.c.f318721a).j0(interfaceC35745a5.e()).t0(new f(this));
        } else if (deepLink instanceof MyAdvertLink.Deactivate) {
            interfaceC42585a.q();
            cVar.accept(new InterfaceC40292b.a((MyAdvertLink.Deactivate) deepLink));
        } else if (!(deepLink instanceof MyAdvertLink.Restore)) {
            cVar.accept(new InterfaceC40292b.a(deepLink));
        } else {
            this.f308841l.dispose();
            this.f308841l = s5.f(((MyAdvertLink.Restore) deepLink).f133505c).r0(P2.c.f318721a).j0(interfaceC35745a5.e()).t0(new e(this));
        }
    }

    @Override // com.avito.android.user_advert.advert.delegate.user_advert_action.a
    public final void v(@k DeepLink deepLink, @l MyAdvertDetailsItem myAdvertDetailsItem, boolean z12) {
        T(deepLink, myAdvertDetailsItem, z12);
    }
}

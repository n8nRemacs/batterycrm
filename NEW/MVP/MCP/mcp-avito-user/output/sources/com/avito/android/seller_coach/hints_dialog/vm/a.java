package com.avito.android.seller_coach.hints_dialog.vm;

import Hq0.InterfaceC14019a;
import Iq0.C14148e;
import Y61.k;
import Y61.l;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.error.z;
import com.avito.android.remote.model.AdviceAction;
import com.avito.android.remote.model.AdviceDetail;
import com.avito.android.remote.model.AdviceDetailItem;
import com.avito.android.remote.model.AdviceDetailStats;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.MenuAction;
import com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem;
import com.avito.android.seller_coach.hints_dialog.item.hint.i;
import com.avito.android.seller_coach.hints_dialog.view.h;
import com.avito.android.seller_coach.hints_dialog.vm.h;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: HintDialogViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_coach/hints_dialog/vm/a;", "Landroidx/lifecycle/M0;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final InterfaceC14019a f267591E;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f267592J;

    /* renamed from: K, reason: collision with root package name */
    @k
    public final InterfaceC28373a f267593K;

    /* renamed from: L, reason: collision with root package name */
    @l
    public m f267594L;

    /* renamed from: M, reason: collision with root package name */
    @l
    public m f267595M;

    /* renamed from: N, reason: collision with root package name */
    @l
    public AdviceDetail f267596N;

    /* renamed from: P, reason: collision with root package name */
    public boolean f267598P;

    /* renamed from: S, reason: collision with root package name */
    @l
    public h.c f267601S;

    /* renamed from: O, reason: collision with root package name */
    @k
    public String f267597O = "";

    /* renamed from: Q, reason: collision with root package name */
    @k
    public h f267599Q = h.c.f267621a;

    /* renamed from: R, reason: collision with root package name */
    @k
    public String f267600R = "";

    /* renamed from: T, reason: collision with root package name */
    @k
    public final C23038g0<h> f267602T = new C23038g0<>();

    /* compiled from: HintDialogViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/AdviceDetail;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/AdviceDetail;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.seller_coach.hints_dialog.vm.a$a, reason: collision with other inner class name */
    public static final class C7994a<T> implements l41.g {
        public C7994a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String buttonText;
            AdviceDetail adviceDetail = (AdviceDetail) obj;
            a aVar = a.this;
            aVar.f267596N = adviceDetail;
            aVar.f267593K.c(new Iq0.f(adviceDetail.getTitle(), adviceDetail.getAdviceId(), aVar.f267597O, a.le(adviceDetail)));
            AdviceAction action = adviceDetail.getAction();
            g gVar = action != null ? new g(adviceDetail.getTitle(), adviceDetail.getDescription(), action.getButtonText(), action.getDeepLink()) : null;
            ArrayList arrayList = new ArrayList();
            if (adviceDetail.getItems() == null || adviceDetail.getItems().isEmpty()) {
                String str = adviceDetail.getAdviceId() + "empty";
                adviceDetail.getDescription();
                arrayList.add(new com.avito.android.seller_coach.hints_dialog.item.empty_hints.a(str));
            } else {
                arrayList.add(new com.avito.android.seller_coach.hints_dialog.item.header.a(adviceDetail.getAdviceId(), adviceDetail.getTitle(), adviceDetail.getDescription()));
                List<AdviceDetailItem> items = adviceDetail.getItems();
                if (items != null) {
                    for (AdviceDetailItem adviceDetailItem : items) {
                        String itemId = adviceDetailItem.getItemId();
                        String title = adviceDetailItem.getTitle();
                        String description = adviceDetailItem.getDescription();
                        String dateText = adviceDetailItem.getDateText();
                        AdviceAction action2 = adviceDetailItem.getAction();
                        DeepLink deepLink = action2 != null ? action2.getDeepLink() : null;
                        AdviceAction action3 = adviceDetailItem.getAction();
                        if (action3 == null || (buttonText = action3.getButtonText()) == null) {
                            buttonText = "";
                        }
                        String str2 = buttonText;
                        Image image = adviceDetailItem.getImage();
                        UserAdvertsHintItem.Type.a aVar2 = UserAdvertsHintItem.Type.f267225c;
                        AdviceDetailStats stats = adviceDetailItem.getStats();
                        arrayList.add(new com.avito.android.seller_coach.hints_dialog.item.hint.a(itemId, title, description, dateText, deepLink, str2, image, stats != null ? new i(stats.getViews(), stats.getContacts(), stats.getConversion()) : null));
                    }
                }
            }
            h.b bVar = new h.b(arrayList, gVar, adviceDetail.getAdditionalMenu() != null);
            aVar.f267599Q = bVar;
            aVar.f267602T.postValue(bVar);
        }
    }

    /* compiled from: HintDialogViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Throwable th2 = (Throwable) obj;
            h.a aVar = new h.a(z.m(th2), z.l(th2));
            a aVar2 = a.this;
            aVar2.f267599Q = aVar;
            aVar2.f267602T.postValue(aVar);
        }
    }

    @Inject
    public a(@k InterfaceC14019a interfaceC14019a, @k InterfaceC35745a5 interfaceC35745a5, @k InterfaceC28373a interfaceC28373a) {
        this.f267591E = interfaceC14019a;
        this.f267592J = interfaceC35745a5;
        this.f267593K = interfaceC28373a;
    }

    public static ArrayList le(AdviceDetail adviceDetail) {
        ArrayList arrayList = new ArrayList();
        List<AdviceDetailItem> items = adviceDetail.getItems();
        if (items != null) {
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                arrayList.add(((AdviceDetailItem) it.next()).getItemId());
            }
        }
        return arrayList;
    }

    public static MenuAction me(AdviceDetail adviceDetail) {
        List<MenuAction> additionalMenu;
        Object obj = null;
        if (adviceDetail == null || (additionalMenu = adviceDetail.getAdditionalMenu()) == null) {
            return null;
        }
        Iterator<T> it = additionalMenu.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (L.f(((MenuAction) next).getAction(), "hide-advice")) {
                obj = next;
                break;
            }
        }
        return (MenuAction) obj;
    }

    public static void oe(a aVar, String str, String str2, int i12) {
        h.c cVar;
        if ((i12 & 1) != 0) {
            str = null;
        }
        if ((i12 & 2) != 0) {
            str2 = "complete";
        }
        AdviceDetail adviceDetail = aVar.f267596N;
        if (adviceDetail != null) {
            aVar.f267598P = true;
            m mVar = aVar.f267595M;
            if (mVar != null) {
                DisposableHelper.a(mVar);
            }
            aVar.f267595M = (m) aVar.f267591E.b(adviceDetail.getAdviceId(), str, str2).s(aVar.f267592J.e()).x(com.avito.android.seller_coach.hints_dialog.vm.b.f267605b, c.f267606b);
        }
        if (L.f(str2, "hide-advice")) {
            h.c cVar2 = aVar.f267601S;
            if (cVar2 != null) {
                cVar2.Za(aVar.f267600R);
                return;
            }
            return;
        }
        if (!L.f(str2, "complete") || (cVar = aVar.f267601S) == null) {
            return;
        }
        cVar.Wb();
    }

    public final void ke() {
        AdviceDetail adviceDetail;
        if (this.f267598P || (adviceDetail = this.f267596N) == null) {
            return;
        }
        this.f267593K.c(new C14148e(adviceDetail.getTitle(), adviceDetail.getAdviceId(), this.f267597O, le(adviceDetail)));
    }

    public final void ne() {
        this.f267598P = false;
        m mVar = this.f267594L;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        h.c cVar = h.c.f267621a;
        this.f267599Q = cVar;
        this.f267602T.postValue(cVar);
        this.f267594L = (m) this.f267591E.a(this.f267600R).s(this.f267592J.e()).x(new C7994a(), new b());
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        m mVar = this.f267594L;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        m mVar2 = this.f267595M;
        if (mVar2 != null) {
            DisposableHelper.a(mVar2);
        }
        this.f267594L = null;
        this.f267595M = null;
        this.f267602T.postValue(this.f267599Q);
    }
}

package com.avito.android.seller_coach.all_advices.vm;

import Cq0.InterfaceC13342a;
import Dq0.C13433a;
import Eq0.AbstractC13521a;
import Y61.k;
import Y61.l;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.error.z;
import com.avito.android.remote.model.Advice;
import com.avito.android.remote.model.Advices;
import com.avito.android.seller_coach.all_advices.vm.a;
import com.avito.android.seller_coach.all_advices.vm.d;
import com.avito.android.seller_coach.hints_dialog.view.h;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.architecture_components.D;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.m;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import l41.g;

/* compiled from: AllAdvicesViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/seller_coach/all_advices/vm/b;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/seller_coach/hints_dialog/view/h$c;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends M0 implements h.c {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final InterfaceC13342a f267438E;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f267439J;

    /* renamed from: K, reason: collision with root package name */
    @k
    public final InterfaceC28373a f267440K;

    /* renamed from: L, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f267441L;

    /* renamed from: M, reason: collision with root package name */
    @l
    public m f267442M;

    /* renamed from: N, reason: collision with root package name */
    @l
    public y f267443N;

    /* renamed from: O, reason: collision with root package name */
    @l
    public Advices f267444O;

    /* renamed from: R, reason: collision with root package name */
    public boolean f267447R;

    /* renamed from: P, reason: collision with root package name */
    @k
    public final ArrayList f267445P = new ArrayList();

    /* renamed from: Q, reason: collision with root package name */
    public boolean f267446Q = true;

    /* renamed from: S, reason: collision with root package name */
    @k
    public final C23038g0<d> f267448S = new C23038g0<>();

    /* renamed from: T, reason: collision with root package name */
    @k
    public final D<com.avito.android.seller_coach.all_advices.vm.a> f267449T = new D<>();

    /* compiled from: AllAdvicesViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LEq0/a;", "clickTarget", "Lkotlin/G0;", "accept", "(LEq0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            AbstractC13521a abstractC13521a = (AbstractC13521a) obj;
            if (abstractC13521a instanceof AbstractC13521a.C0260a) {
                b.this.f267449T.setValue(new a.b(((AbstractC13521a.C0260a) abstractC13521a).f4344a.f267209b));
            }
        }
    }

    /* compiled from: AllAdvicesViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/Advices;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/Advices;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.seller_coach.all_advices.vm.b$b, reason: collision with other inner class name */
    public static final class C7989b<T> implements g {
        public C7989b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Advices advices = (Advices) obj;
            b bVar = b.this;
            ScreenPerformanceTracker.a.d(bVar.f267441L, null, null, null, null, 15);
            ScreenPerformanceTracker screenPerformanceTracker = bVar.f267441L;
            screenPerformanceTracker.m(screenPerformanceTracker.getF90716d());
            bVar.f267444O = advices;
            if (bVar.f267446Q) {
                bVar.f267440K.c(new C13433a());
                bVar.f267446Q = false;
            }
            bVar.f267448S.postValue(b.le(advices));
            ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, null, null, 7);
        }
    }

    /* compiled from: AllAdvicesViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Throwable th2 = (Throwable) obj;
            b bVar = b.this;
            ScreenPerformanceTracker.a.d(bVar.f267441L, null, null, new J.a(th2), null, 11);
            ScreenPerformanceTracker screenPerformanceTracker = bVar.f267441L;
            screenPerformanceTracker.m(screenPerformanceTracker.getF90716d());
            bVar.f267448S.postValue(new d.a(z.m(th2), z.l(th2)));
            ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, new J.a(th2), null, 5);
        }
    }

    @Inject
    public b(@k InterfaceC13342a interfaceC13342a, @k InterfaceC35745a5 interfaceC35745a5, @k InterfaceC28373a interfaceC28373a, @k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f267438E = interfaceC13342a;
        this.f267439J = interfaceC35745a5;
        this.f267440K = interfaceC28373a;
        this.f267441L = screenPerformanceTracker;
        me(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[PHI: r4
  0x0049: PHI (r4v7 com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem$BackgroundColor) = 
  (r4v4 com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem$BackgroundColor)
  (r4v5 com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem$BackgroundColor)
  (r4v6 com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem$BackgroundColor)
 binds: [B:15:0x0047, B:18:0x0053, B:21:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.avito.android.seller_coach.all_advices.vm.d.b le(com.avito.android.remote.model.Advices r14) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = r14.getAdvices()
            if (r1 == 0) goto L86
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L86
            java.lang.Object r2 = r1.next()
            com.avito.android.remote.model.Advice r2 = (com.avito.android.remote.model.Advice) r2
            java.lang.String r3 = r2.getType()
            com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem$Type r4 = com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem.Type.f267226d
            java.lang.String r5 = "simple"
            boolean r5 = kotlin.jvm.internal.L.f(r3, r5)
            if (r5 == 0) goto L2d
        L2b:
            r10 = r4
            goto L3b
        L2d:
            com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem$Type r4 = com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem.Type.f267227e
            java.lang.String r5 = "by_items"
            boolean r3 = kotlin.jvm.internal.L.f(r3, r5)
            if (r3 == 0) goto L38
            goto L2b
        L38:
            com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem$Type r4 = com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem.Type.f267228f
            goto L2b
        L3b:
            java.lang.String r3 = r2.getColor()
            com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem$BackgroundColor r4 = com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem.BackgroundColor.f267218d
            java.lang.String r5 = "content"
            boolean r5 = kotlin.jvm.internal.L.f(r3, r5)
            if (r5 == 0) goto L4b
        L49:
            r12 = r4
            goto L64
        L4b:
            com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem$BackgroundColor r4 = com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem.BackgroundColor.f267219e
            java.lang.String r5 = "price"
            boolean r5 = kotlin.jvm.internal.L.f(r3, r5)
            if (r5 == 0) goto L56
            goto L49
        L56:
            com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem$BackgroundColor r4 = com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem.BackgroundColor.f267220f
            java.lang.String r5 = "other"
            boolean r3 = kotlin.jvm.internal.L.f(r3, r5)
            if (r3 == 0) goto L61
            goto L49
        L61:
            com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem$BackgroundColor r3 = com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem.BackgroundColor.f267221g
            r12 = r3
        L64:
            com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem r3 = new com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem
            java.lang.String r6 = r2.getAdviceId()
            java.lang.String r7 = r2.getTitle()
            java.lang.String r8 = r2.getDescription()
            java.lang.String r9 = r2.getHeaderText()
            java.lang.String r11 = r2.getSlug()
            java.util.List r13 = r2.getItemsIds()
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0.add(r3)
            goto L11
        L86:
            com.avito.android.seller_coach.all_advices.vm.d$b r1 = new com.avito.android.seller_coach.all_advices.vm.d$b
            com.avito.android.remote.model.AdviceHeader r14 = r14.getHeader()
            java.lang.String r14 = r14.getTitle()
            r1.<init>(r0, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.seller_coach.all_advices.vm.b.le(com.avito.android.remote.model.Advices):com.avito.android.seller_coach.all_advices.vm.d$b");
    }

    @Override // com.avito.android.seller_coach.hints_dialog.view.h.c
    public final void Wb() {
        this.f267447R = true;
        this.f267449T.setValue(a.C7988a.f267436a);
    }

    @Override // com.avito.android.seller_coach.hints_dialog.view.h.c
    public final void Za(@k String str) {
        Object next;
        Advices advices = this.f267444O;
        if (advices != null) {
            List listB = v0.b(advices.getAdvices());
            Iterator it = listB.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (L.f(((Advice) next).getAdviceId(), str)) {
                        break;
                    }
                }
            }
            v0.a(listB).remove((Advice) next);
            this.f267444O = Advices.copy$default(advices, null, listB, 1, null);
            this.f267448S.postValue(le(advices));
        }
    }

    public final void ke(@k io.reactivex.rxjava3.core.z<AbstractC13521a> zVar) {
        this.f267443N = (y) zVar.t0(new a());
    }

    public final void me(boolean z12) {
        ScreenPerformanceTracker.a.b(this.f267441L, null, 3);
        m mVar = this.f267442M;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        if (!z12) {
            this.f267448S.postValue(d.c.f267461a);
        }
        this.f267442M = (m) this.f267438E.a().s(this.f267439J.e()).x(new C7989b(), new c());
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        m mVar = this.f267442M;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        y yVar = this.f267443N;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f267442M = null;
        this.f267443N = null;
    }
}

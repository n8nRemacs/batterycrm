package com.avito.android.cv_actualization.view.phone_select.ui;

import Y41.l;
import Y41.p;
import Y61.k;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cv_actualization.view.phone_select.ui.items.phone.JsxCvActualizationPhoneSelectPhoneItem;
import com.avito.android.remote.model.user_profile.Phone;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.H;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.n2;
import vt.C49380c;
import wt.C49680a;

/* compiled from: JsxCvActualizationPhoneSelectFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cv_actualization.view.phone_select.ui.JsxCvActualizationPhoneSelectFragment$setupObservers$1", f = "JsxCvActualizationPhoneSelectFragment.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f131394q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ JsxCvActualizationPhoneSelectFragment f131395r;

    /* compiled from: JsxCvActualizationPhoneSelectFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cv_actualization.view.phone_select.ui.JsxCvActualizationPhoneSelectFragment$setupObservers$1$1", f = "JsxCvActualizationPhoneSelectFragment.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.cv_actualization.view.phone_select.ui.a$a, reason: collision with other inner class name */
    public static final class C3916a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f131396q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ JsxCvActualizationPhoneSelectFragment f131397r;

        /* compiled from: JsxCvActualizationPhoneSelectFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.cv_actualization.view.phone_select.ui.a$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C3917a extends H implements l<C49380c, G0> {
            @Override // Y41.l
            public final G0 invoke(C49380c c49380c) {
                List<TV0.a> list;
                C49380c c49380c2 = c49380c;
                JsxCvActualizationPhoneSelectFragment jsxCvActualizationPhoneSelectFragment = (JsxCvActualizationPhoneSelectFragment) this.receiver;
                com.avito.konveyor.adapter.d dVar = jsxCvActualizationPhoneSelectFragment.f131376o0;
                if (dVar == null) {
                    dVar = null;
                }
                com.avito.android.cv_actualization.view.phone_select.ui.state.b bVar = jsxCvActualizationPhoneSelectFragment.f131377p0;
                if (bVar == null) {
                    bVar = null;
                }
                bVar.getClass();
                if (c49380c2.f441032b) {
                    list = bVar.f131454b;
                } else if (c49380c2.f441033c) {
                    list = bVar.f131453a;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(bVar.f131455c);
                    Iterator<T> it = c49380c2.f441034d.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new JsxCvActualizationPhoneSelectPhoneItem(((Phone) it.next()).getPhone(), null, 2, null));
                    }
                    arrayList.add(bVar.f131456d);
                    list = arrayList;
                }
                dVar.l(list, null);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3916a(JsxCvActualizationPhoneSelectFragment jsxCvActualizationPhoneSelectFragment, Continuation<? super C3916a> continuation) {
            super(2, continuation);
            this.f131397r = jsxCvActualizationPhoneSelectFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return new C3916a(this.f131397r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C3916a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f131396q;
            if (i12 == 0) {
                C42729a0.b(obj);
                JsxCvActualizationPhoneSelectFragment jsxCvActualizationPhoneSelectFragment = this.f131397r;
                n2<C49380c> state = ((C49680a) jsxCvActualizationPhoneSelectFragment.f131381t0.getValue()).getState();
                ScreenPerformanceTracker screenPerformanceTracker = jsxCvActualizationPhoneSelectFragment.f131380s0;
                if (screenPerformanceTracker == null) {
                    screenPerformanceTracker = null;
                }
                C3917a c3917a = new C3917a(1, jsxCvActualizationPhoneSelectFragment, JsxCvActualizationPhoneSelectFragment.class, "renderState", "renderState(Lcom/avito/android/cv_actualization/view/phone_select/mvi/entity/JsxCvActualizationPhoneSelectState;)V", 0);
                this.f131396q = 1;
                if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c3917a, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(JsxCvActualizationPhoneSelectFragment jsxCvActualizationPhoneSelectFragment, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f131395r = jsxCvActualizationPhoneSelectFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        return new a(this.f131395r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f131394q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            JsxCvActualizationPhoneSelectFragment jsxCvActualizationPhoneSelectFragment = this.f131395r;
            C3916a c3916a = new C3916a(jsxCvActualizationPhoneSelectFragment, null);
            this.f131394q = 1;
            if (C23056p0.b(jsxCvActualizationPhoneSelectFragment, state, c3916a, this) == coroutine_suspended) {
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

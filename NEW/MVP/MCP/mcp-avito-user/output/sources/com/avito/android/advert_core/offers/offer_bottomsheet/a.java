package com.avito.android.advert_core.offers.offer_bottomsheet;

import J9.a;
import J9.c;
import Y41.p;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.os.C22777e;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.R;
import com.avito.android.advert_core.offers.items.OfferItem;
import com.avito.android.advert_core.offers.offer_bottomsheet.mvi.entity.OfferBottomSheetState;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.q;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;

/* compiled from: OfferBottomSheetDialog.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert_core.offers.offer_bottomsheet.OfferBottomSheetDialog$onViewInflated$1", f = "OfferBottomSheetDialog.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f83865q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ OfferBottomSheetDialog f83866r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f83867s;

    /* compiled from: OfferBottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_core.offers.offer_bottomsheet.OfferBottomSheetDialog$onViewInflated$1$1", f = "OfferBottomSheetDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.advert_core.offers.offer_bottomsheet.a$a, reason: collision with other inner class name */
    public static final class C2482a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f83868q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ OfferBottomSheetDialog f83869r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ j f83870s;

        /* compiled from: OfferBottomSheetDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.advert_core.offers.offer_bottomsheet.OfferBottomSheetDialog$onViewInflated$1$1$1", f = "OfferBottomSheetDialog.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.advert_core.offers.offer_bottomsheet.a$a$a, reason: collision with other inner class name */
        public static final class C2483a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f83871q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ OfferBottomSheetDialog f83872r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ j f83873s;

            /* compiled from: OfferBottomSheetDialog.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.advert_core.offers.offer_bottomsheet.a$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C2484a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ j f83874b;

                public C2484a(j jVar) {
                    this.f83874b = jVar;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) throws Resources.NotFoundException {
                    Integer numA;
                    OfferBottomSheetState offerBottomSheetState = (OfferBottomSheetState) obj;
                    final j jVar = this.f83874b;
                    ViewPager viewPager = jVar.f83887c;
                    androidx.viewpager.widget.a adapter = viewPager.getAdapter();
                    Drawable drawableL = null;
                    l lVar = adapter instanceof l ? (l) adapter : null;
                    List<OfferItem> list = offerBottomSheetState.f83904b;
                    if (!(lVar != null ? L.f(lVar.f83891c, list) : false)) {
                        viewPager.setAdapter(new l(list));
                        viewPager.setOffscreenPageLimit(list.size());
                        com.avito.android.lib.design.page_indicator_re23.b.b(jVar.f83888d, viewPager);
                        if (!list.isEmpty()) {
                            viewPager.x(offerBottomSheetState.f83905c, false);
                        }
                        viewPager.c(new k(jVar));
                    }
                    final OfferButton offerButton = offerBottomSheetState.f83906d;
                    Button button = jVar.f83889e;
                    if (offerButton == null) {
                        D6.w(button);
                        button.setOnClickListener(null);
                    } else {
                        com.avito.android.lib.design.button.b.a(button, offerButton.f83856b, false);
                        button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.advert_core.offers.offer_bottomsheet.i
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i12 = j.f83884f;
                                ((b) jVar.f83886b).invoke(new a.C0508a(offerButton.f83859e));
                            }
                        });
                        String str = offerButton.f83858d;
                        if (str == null) {
                            str = "accentLarge";
                        }
                        button.setAppearanceFromAttr(com.avito.android.lib.util.f.d(str));
                        String str2 = offerButton.f83857c;
                        if (str2 != null && (numA = q.a(str2)) != null) {
                            int iIntValue = numA.intValue();
                            Context context = jVar.f83885a.getContext();
                            drawableL = C35835l0.l(C35835l0.h(iIntValue, context), C35835l0.d(R.attr.constantWhite, context));
                        }
                        Button.g(jVar.f83889e, drawableL, null, false, null, 14);
                    }
                    G0 g02 = G0.f406611a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return g02;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                        return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.D
                @Y61.k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f83874b, j.class, "renderState", "renderState(Lcom/avito/android/advert_core/offers/offer_bottomsheet/mvi/entity/OfferBottomSheetState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2483a(OfferBottomSheetDialog offerBottomSheetDialog, j jVar, Continuation<? super C2483a> continuation) {
                super(2, continuation);
                this.f83872r = offerBottomSheetDialog;
                this.f83873s = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C2483a(this.f83872r, this.f83873s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C2483a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f83871q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    n<Object>[] nVarArr = OfferBottomSheetDialog.f83845k0;
                    n2<OfferBottomSheetState> state = ((e) this.f83872r.f83848j0.getValue()).getState();
                    C2484a c2484a = new C2484a(this.f83873s);
                    this.f83871q = 1;
                    if (state.collect(c2484a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* compiled from: OfferBottomSheetDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.advert_core.offers.offer_bottomsheet.OfferBottomSheetDialog$onViewInflated$1$1$2", f = "OfferBottomSheetDialog.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.advert_core.offers.offer_bottomsheet.a$a$b */
        public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f83875q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ OfferBottomSheetDialog f83876r;

            /* compiled from: OfferBottomSheetDialog.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.advert_core.offers.offer_bottomsheet.a$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C2485a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OfferBottomSheetDialog f83877b;

                public C2485a(OfferBottomSheetDialog offerBottomSheetDialog) {
                    this.f83877b = offerBottomSheetDialog;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    J9.c cVar = (J9.c) obj;
                    n<Object>[] nVarArr = OfferBottomSheetDialog.f83845k0;
                    OfferBottomSheetDialog offerBottomSheetDialog = this.f83877b;
                    offerBottomSheetDialog.getClass();
                    if (!(cVar instanceof c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    offerBottomSheetDialog.getParentFragmentManager().o0(C22777e.b(new Q("offers_dialog_link", ((c.a) cVar).f8810a)), "offers_dialog_fragment");
                    offerBottomSheetDialog.dismissAllowingStateLoss();
                    G0 g02 = G0.f406611a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return g02;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                        return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.D
                @Y61.k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f83877b, OfferBottomSheetDialog.class, "handleEvent", "handleEvent(Lcom/avito/android/advert_core/offers/offer_bottomsheet/mvi/entity/OfferBottomSheetOneTimeEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(OfferBottomSheetDialog offerBottomSheetDialog, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f83876r = offerBottomSheetDialog;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new b(this.f83876r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f83875q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    n<Object>[] nVarArr = OfferBottomSheetDialog.f83845k0;
                    OfferBottomSheetDialog offerBottomSheetDialog = this.f83876r;
                    InterfaceC43160i<J9.c> events = ((e) offerBottomSheetDialog.f83848j0.getValue()).getEvents();
                    C2485a c2485a = new C2485a(offerBottomSheetDialog);
                    this.f83875q = 1;
                    if (events.collect(c2485a, this) == coroutine_suspended) {
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
        public C2482a(OfferBottomSheetDialog offerBottomSheetDialog, j jVar, Continuation<? super C2482a> continuation) {
            super(2, continuation);
            this.f83869r = offerBottomSheetDialog;
            this.f83870s = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C2482a c2482a = new C2482a(this.f83869r, this.f83870s, continuation);
            c2482a.f83868q = obj;
            return c2482a;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C2482a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f83868q;
            j jVar = this.f83870s;
            OfferBottomSheetDialog offerBottomSheetDialog = this.f83869r;
            C43259k.d(t12, null, null, new C2483a(offerBottomSheetDialog, jVar, null), 3);
            C43259k.d(t12, null, null, new b(offerBottomSheetDialog, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(OfferBottomSheetDialog offerBottomSheetDialog, j jVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f83866r = offerBottomSheetDialog;
        this.f83867s = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new a(this.f83866r, this.f83867s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f83865q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            j jVar = this.f83867s;
            OfferBottomSheetDialog offerBottomSheetDialog = this.f83866r;
            C2482a c2482a = new C2482a(offerBottomSheetDialog, jVar, null);
            this.f83865q = 1;
            if (C23056p0.b(offerBottomSheetDialog, state, c2482a, this) == coroutine_suspended) {
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

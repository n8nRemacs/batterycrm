package com.avito.android.auction.offer;

import Nd.InterfaceC14561a;
import Nd.b;
import Rh.C15041a;
import Y41.p;
import Y61.k;
import Y61.l;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.auction.offer.AuctionOfferFragment;
import com.avito.android.auction.offer.mvi.j;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AuctionOfferFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.auction.offer.AuctionOfferFragment$subscribeToViewState$1", f = "AuctionOfferFragment.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f92447q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AuctionOfferFragment f92448r;

    /* compiled from: AuctionOfferFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.auction.offer.AuctionOfferFragment$subscribeToViewState$1$1", f = "AuctionOfferFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f92449q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ AuctionOfferFragment f92450r;

        /* compiled from: AuctionOfferFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.auction.offer.AuctionOfferFragment$subscribeToViewState$1$1$1", f = "AuctionOfferFragment.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.auction.offer.c$a$a, reason: collision with other inner class name */
        public static final class C2729a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f92451q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ AuctionOfferFragment f92452r;

            /* compiled from: AuctionOfferFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.auction.offer.c$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C2730a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AuctionOfferFragment f92453b;

                public C2730a(AuctionOfferFragment auctionOfferFragment) {
                    this.f92453b = auctionOfferFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    Nd.b bVar = (Nd.b) obj;
                    AuctionOfferFragment.a aVar = AuctionOfferFragment.f92425x0;
                    AuctionOfferFragment auctionOfferFragment = this.f92453b;
                    if (bVar instanceof b.d) {
                        com.avito.android.deeplink_handler.handler.composite.a aVar2 = auctionOfferFragment.f92432s0;
                        if (aVar2 == null) {
                            aVar2 = null;
                        }
                        b.a.a(aVar2, ((b.d) bVar).f11627a, null, null, 6);
                    } else if (bVar instanceof b.a) {
                        ActivityC22955m activityC22955mL1 = auctionOfferFragment.l1();
                        if (activityC22955mL1 != null) {
                            activityC22955mL1.setResult(0);
                            activityC22955mL1.finish();
                        }
                    } else if (bVar instanceof b.C0747b) {
                        ActivityC22955m activityC22955mL12 = auctionOfferFragment.l1();
                        if (activityC22955mL12 != null) {
                            activityC22955mL12.setResult(-1);
                            activityC22955mL12.finish();
                        }
                    } else if (bVar instanceof b.c) {
                        String str = ((b.c) bVar).f11626a;
                        View view = auctionOfferFragment.getView();
                        if (view != null) {
                            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                            PrintableText printableTextF = com.avito.android.printable_text.b.f(str);
                            f.c.f125255c.getClass();
                            com.avito.android.component.toast.c.b(cVar, view, printableTextF, null, null, null, f.c.a.b(), 0, ToastBarPosition.f181046d, null, false, false, null, null, 4014);
                        }
                    }
                    G0 g02 = G0.f406611a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return g02;
                }

                public final boolean equals(@l Object obj) {
                    if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                        return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.D
                @k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f92453b, AuctionOfferFragment.class, "handleOneTimeEvent", "handleOneTimeEvent(Lcom/avito/android/auction/offer/mvi/entity/AuctionEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2729a(AuctionOfferFragment auctionOfferFragment, Continuation<? super C2729a> continuation) {
                super(2, continuation);
                this.f92452r = auctionOfferFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new C2729a(this.f92452r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C2729a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f92451q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    AuctionOfferFragment.a aVar = AuctionOfferFragment.f92425x0;
                    AuctionOfferFragment auctionOfferFragment = this.f92452r;
                    InterfaceC43160i<Nd.b> events = auctionOfferFragment.q5().getEvents();
                    C2730a c2730a = new C2730a(auctionOfferFragment);
                    this.f92451q = 1;
                    if (events.collect(c2730a, this) == coroutine_suspended) {
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

        /* compiled from: AuctionOfferFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.auction.offer.AuctionOfferFragment$subscribeToViewState$1$1$2", f = "AuctionOfferFragment.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f92454q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ AuctionOfferFragment f92455r;

            /* compiled from: AuctionOfferFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.auction.offer.c$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C2731a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AuctionOfferFragment f92456b;

                public C2731a(AuctionOfferFragment auctionOfferFragment) {
                    this.f92456b = auctionOfferFragment;
                }

                /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.List] */
                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    Nd.d dVar = (Nd.d) obj;
                    final h hVar = this.f92456b.f92435v0;
                    if (hVar != null) {
                        com.avito.android.progress_overlay.l lVar = hVar.f92533k;
                        if (dVar.f11646a) {
                            lVar.k(null);
                        } else {
                            String str = dVar.f11652g;
                            if (str != null) {
                                lVar.a(str);
                                lVar.f231600j = new g(hVar);
                            } else {
                                lVar.j();
                                AttributedText attributedText = dVar.f11651f;
                                if (attributedText != null) {
                                    attributedText.setOnDeepLinkClickListener(new C15041a(hVar, 11));
                                }
                                CharSequence charSequenceC = hVar.f92525c.c(hVar.f92523a.getContext(), attributedText);
                                TextView textView = hVar.f92530h;
                                I5.a(textView, charSequenceC, false);
                                textView.setMovementMethod(LinkMovementMethod.getInstance());
                                Button button = hVar.f92531i;
                                String str2 = dVar.f11649d;
                                if (str2 == null) {
                                    D6.w(button);
                                } else {
                                    D6.H(button);
                                    button.setText(str2);
                                    final int i12 = 1;
                                    button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.auction.offer.f
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i12) {
                                                case 0:
                                                    hVar.f92526d.z4(InterfaceC14561a.c.f11619a);
                                                    break;
                                                default:
                                                    hVar.f92526d.z4(InterfaceC14561a.C0746a.f11617a);
                                                    break;
                                            }
                                        }
                                    });
                                }
                                String str3 = dVar.f11650e;
                                Button button2 = hVar.f92532j;
                                if (str3 == null) {
                                    D6.w(button2);
                                } else {
                                    D6.H(button2);
                                    button2.setText(str3);
                                    final int i13 = 0;
                                    button2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.auction.offer.f
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i13) {
                                                case 0:
                                                    hVar.f92526d.z4(InterfaceC14561a.c.f11619a);
                                                    break;
                                                default:
                                                    hVar.f92526d.z4(InterfaceC14561a.C0746a.f11617a);
                                                    break;
                                            }
                                        }
                                    });
                                }
                                if (hVar.f92527e.w().invoke().booleanValue()) {
                                    com.avito.android.beduin.common.component.adapter.a aVar = hVar.f92529g;
                                    aVar.m(dVar.f11648c);
                                    aVar.notifyDataSetChanged();
                                } else {
                                    hVar.f92524b.f338510e = new UV0.c(dVar.f11647b);
                                    hVar.f92528f.notifyDataSetChanged();
                                }
                                boolean z12 = dVar.f11653h;
                                button.setLoading(z12);
                                button.setClickable(!z12);
                            }
                        }
                    }
                    G0 g02 = G0.f406611a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return g02;
                }

                public final boolean equals(@l Object obj) {
                    if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                        return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.D
                @k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f92456b, AuctionOfferFragment.class, "render", "render(Lcom/avito/android/auction/offer/mvi/entity/AuctionState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AuctionOfferFragment auctionOfferFragment, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f92455r = auctionOfferFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new b(this.f92455r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f92454q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    AuctionOfferFragment.a aVar = AuctionOfferFragment.f92425x0;
                    AuctionOfferFragment auctionOfferFragment = this.f92455r;
                    j jVarQ5 = auctionOfferFragment.q5();
                    C2731a c2731a = new C2731a(auctionOfferFragment);
                    this.f92454q = 1;
                    if (jVarQ5.le(c2731a, this) == coroutine_suspended) {
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
        public a(AuctionOfferFragment auctionOfferFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f92450r = auctionOfferFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f92450r, continuation);
            aVar.f92449q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f92449q;
            AuctionOfferFragment auctionOfferFragment = this.f92450r;
            C43259k.d(t12, null, null, new C2729a(auctionOfferFragment, null), 3);
            C43259k.d(t12, null, null, new b(auctionOfferFragment, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AuctionOfferFragment auctionOfferFragment, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f92448r = auctionOfferFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new c(this.f92448r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f92447q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            AuctionOfferFragment auctionOfferFragment = this.f92448r;
            a aVar = new a(auctionOfferFragment, null);
            this.f92447q = 1;
            if (C23056p0.b(auctionOfferFragment, state, aVar, this) == coroutine_suspended) {
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

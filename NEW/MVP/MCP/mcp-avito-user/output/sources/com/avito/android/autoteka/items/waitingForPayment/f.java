package com.avito.android.autoteka.items.waitingForPayment;

import Y41.p;
import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import java.util.LinkedList;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.internal.K;

/* compiled from: WaitingForPaymentView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/items/waitingForPayment/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/autoteka/items/waitingForPayment/e;", "a", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f97035b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C43238h f97036c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public N0 f97037d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC42726C f97038e;

    /* compiled from: WaitingForPaymentView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/autoteka/items/waitingForPayment/f$a;", "", "<init>", "()V", "", "DELAY_TEXT_ANIMATION", "J", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: WaitingForPaymentView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/autoteka/items/waitingForPayment/f$b", "Landroid/view/View$OnAttachStateChangeListener;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements View.OnAttachStateChangeListener {

        /* compiled from: WaitingForPaymentView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.autoteka.items.waitingForPayment.WaitingForPaymentViewImpl$bindTitle$1$onViewAttachedToWindow$1", f = "WaitingForPaymentView.kt", i = {0}, l = {43}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f97040q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f97041r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ f f97042s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f97042s = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f97042s, continuation);
                aVar.f97041r = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                T t12;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f97040q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    t12 = (T) this.f97041r;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t12 = (T) this.f97041r;
                    C42729a0.b(obj);
                }
                while (U.e(t12)) {
                    f fVar = this.f97042s;
                    TextView textView = fVar.f97035b;
                    InterfaceC42726C interfaceC42726C = fVar.f97038e;
                    String str = (String) ((LinkedList) interfaceC42726C.getValue()).getFirst();
                    ((LinkedList) interfaceC42726C.getValue()).remove(0);
                    ((LinkedList) interfaceC42726C.getValue()).addLast(str);
                    textView.setText(str);
                    this.f97041r = t12;
                    this.f97040q = 1;
                    if (C43131e0.b(1000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return G0.f406611a;
            }
        }

        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@k View view) {
            f fVar = f.this;
            N0 n02 = fVar.f97037d;
            if (n02 != null) {
                ((V0) n02).c(null);
            }
            fVar.f97037d = C43259k.d(fVar.f97036c, null, null, new a(fVar, null), 3);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@k View view) {
            N0 n02 = f.this.f97037d;
            if (n02 != null) {
                ((V0) n02).c(null);
            }
        }
    }

    /* compiled from: WaitingForPaymentView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/LinkedList;", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<LinkedList<String>> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f97043l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final LinkedList<String> invoke() {
            LinkedList<String> linkedList = new LinkedList<>();
            linkedList.add("");
            linkedList.add(".");
            linkedList.add("..");
            linkedList.add("...");
            return linkedList;
        }
    }

    static {
        new a(null);
    }

    public f(@k View view) {
        super(view);
        this.f97035b = (TextView) this.itemView.findViewById(R.id.autoteka_waiting_for_payment_title_part_2);
        kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
        this.f97036c = U.a(K.f411877a);
        this.f97038e = C42727D.c(c.f97043l);
    }

    @Override // com.avito.android.autoteka.items.waitingForPayment.e
    public final void sb() {
        this.f97035b.addOnAttachStateChangeListener(new b());
    }
}

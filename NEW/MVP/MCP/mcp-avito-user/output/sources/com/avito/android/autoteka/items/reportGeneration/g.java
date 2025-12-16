package com.avito.android.autoteka.items.reportGeneration;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.progress_bar.ProgressBar;
import com.avito.android.util.C1;
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
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.internal.K;

/* compiled from: ReportGenerationView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/items/reportGeneration/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/autoteka/items/reportGeneration/f;", "a", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f96967b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f96968c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ProgressBar f96969d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f96970e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC42726C f96971f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C43238h f96972g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public N0 f96973h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public N0 f96974i;

    /* compiled from: ReportGenerationView.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/avito/android/autoteka/items/reportGeneration/g$a;", "", "<init>", "()V", "", "LINE_ANIMATION_DURATION", "J", "PROGRESS_ANIMATION_DURATION", "", "PROGRESS_ANIMATION_STEP", "F", "TITLE_ANIMATION_FIRST_DURATION", "TITLE_ANIMATION_OTHERS_DURATION", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ReportGenerationView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/autoteka/items/reportGeneration/g$b", "Landroid/view/View$OnAttachStateChangeListener;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements View.OnAttachStateChangeListener {

        /* compiled from: ReportGenerationView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.autoteka.items.reportGeneration.ReportGenerationViewImpl$bindProgressBar$1$onViewAttachedToWindow$1", f = "ReportGenerationView.kt", i = {0}, l = {83}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f96976q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f96977r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ g f96978s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g gVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f96978s = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f96978s, continuation);
                aVar.f96977r = obj;
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
                int i12 = this.f96976q;
                g gVar = this.f96978s;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    T t13 = (T) this.f96977r;
                    gVar.f96969d.setProgress(0.0f);
                    t12 = t13;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t12 = (T) this.f96977r;
                    C42729a0.b(obj);
                }
                while (U.e(t12) && gVar.f96969d.getProgress() < 1.0f) {
                    ProgressBar progressBar = gVar.f96969d;
                    progressBar.setProgress(progressBar.getProgress() + 0.002f);
                    this.f96977r = t12;
                    this.f96976q = 1;
                    if (C43131e0.b(250L, this) == coroutine_suspended) {
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
            g gVar = g.this;
            N0 n02 = gVar.f96974i;
            if (n02 != null) {
                ((V0) n02).c(null);
            }
            gVar.f96974i = C43259k.d(gVar.f96972g, null, null, new a(gVar, null), 3);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@k View view) {
            N0 n02 = g.this.f96974i;
            if (n02 != null) {
                ((V0) n02).c(null);
            }
        }
    }

    /* compiled from: ReportGenerationView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/autoteka/items/reportGeneration/g$c", "Landroid/view/View$OnAttachStateChangeListener;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements View.OnAttachStateChangeListener {

        /* compiled from: ReportGenerationView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.autoteka.items.reportGeneration.ReportGenerationViewImpl$bindTitle$1$onViewAttachedToWindow$1", f = "ReportGenerationView.kt", i = {0, 1}, l = {60, 63}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f96980q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f96981r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ g f96982s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ l0.a f96983t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g gVar, l0.a aVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f96982s = gVar;
                this.f96983t = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f96982s, this.f96983t, continuation);
                aVar.f96981r = obj;
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
                int i12 = this.f96980q;
                l0.a aVar = this.f96983t;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    t12 = (T) this.f96981r;
                } else if (i12 == 1) {
                    t12 = (T) this.f96981r;
                    C42729a0.b(obj);
                    aVar.f406838b = false;
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t12 = (T) this.f96981r;
                    C42729a0.b(obj);
                }
                while (U.e(t12)) {
                    g gVar = this.f96982s;
                    TextView textView = gVar.f96968c;
                    InterfaceC42726C interfaceC42726C = gVar.f96971f;
                    Integer num = (Integer) ((LinkedList) interfaceC42726C.getValue()).getFirst();
                    ((LinkedList) interfaceC42726C.getValue()).removeFirst();
                    ((LinkedList) interfaceC42726C.getValue()).addLast(num);
                    textView.setText(gVar.f96970e.getString(num.intValue()));
                    if (aVar.f406838b) {
                        this.f96981r = t12;
                        this.f96980q = 1;
                        if (C43131e0.b(2000L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        aVar.f406838b = false;
                    } else {
                        this.f96981r = t12;
                        this.f96980q = 2;
                        if (C43131e0.b(4000L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return G0.f406611a;
            }
        }

        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@k View view) {
            g gVar = g.this;
            N0 n02 = gVar.f96973h;
            if (n02 != null) {
                ((V0) n02).c(null);
            }
            l0.a aVar = new l0.a();
            aVar.f406838b = true;
            gVar.f96973h = C43259k.d(gVar.f96972g, null, null, new a(gVar, aVar, null), 3);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@k View view) {
            N0 n02 = g.this.f96973h;
            if (n02 != null) {
                ((V0) n02).c(null);
            }
        }
    }

    /* compiled from: ReportGenerationView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/LinkedList;", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<LinkedList<Integer>> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f96984l = new d();

        public d() {
            super(0);
        }

        @Override // Y41.a
        public final LinkedList<Integer> invoke() {
            LinkedList<Integer> linkedList = new LinkedList<>();
            linkedList.add(Integer.valueOf(R.string.autoteka_car_status_1));
            linkedList.add(Integer.valueOf(R.string.autoteka_car_status_2));
            linkedList.add(Integer.valueOf(R.string.autoteka_car_status_3));
            linkedList.add(Integer.valueOf(R.string.autoteka_car_status_4));
            linkedList.add(Integer.valueOf(R.string.autoteka_car_status_5));
            linkedList.add(Integer.valueOf(R.string.autoteka_car_status_6));
            linkedList.add(Integer.valueOf(R.string.autoteka_car_status_7));
            return linkedList;
        }
    }

    static {
        new a(null);
    }

    public g(@k View view) {
        super(view);
        this.f96967b = this.itemView.findViewById(R.id.autoteka_car_animate_line);
        this.f96968c = (TextView) this.itemView.findViewById(R.id.autoteka_report_generation_title);
        this.f96969d = (ProgressBar) this.itemView.findViewById(R.id.autoteka_report_generation_progress);
        this.f96970e = view.getContext();
        this.f96971f = C42727D.c(d.f96984l);
        kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
        this.f96972g = U.a(K.f411877a);
    }

    @Override // com.avito.android.autoteka.items.reportGeneration.f
    public final void sb() {
        this.f96968c.addOnAttachStateChangeListener(new c());
    }

    @Override // com.avito.android.autoteka.items.reportGeneration.f
    public final void w6() {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 0.1f, 2, 0.9f);
        translateAnimation.setDuration(2000L);
        C1.f318564a.getClass();
        translateAnimation.setRepeatCount(C1.a() ? -1 : 0);
        translateAnimation.setRepeatMode(2);
        this.f96967b.startAnimation(translateAnimation);
    }

    @Override // com.avito.android.autoteka.items.reportGeneration.f
    public final void wS() {
        this.f96969d.addOnAttachStateChangeListener(new b());
    }
}

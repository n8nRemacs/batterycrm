package androidx.privacysandbox.ads.adservices.java.measurement;

import X41.n;
import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.measurement.c;
import androidx.privacysandbox.ads.adservices.measurement.g;
import com.google.common.util.concurrent.D0;
import j.InterfaceC42164u;
import j.a0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;

/* compiled from: MeasurementManagerFutures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/measurement/a;", "", "<init>", "()V", "a", "b", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f53550a = new b(null);

    /* compiled from: MeasurementManagerFutures.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004H\u0017¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/measurement/a$a;", "Landroidx/privacysandbox/ads/adservices/java/measurement/a;", "Landroidx/privacysandbox/ads/adservices/measurement/a;", "deletionRequest", "Lcom/google/common/util/concurrent/D0;", "Lkotlin/G0;", "d", "(Landroidx/privacysandbox/ads/adservices/measurement/a;)Lcom/google/common/util/concurrent/D0;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "e", "(Landroid/net/Uri;Landroid/view/InputEvent;)Lcom/google/common/util/concurrent/D0;", "trigger", "c", "(Landroid/net/Uri;)Lcom/google/common/util/concurrent/D0;", "Landroidx/privacysandbox/ads/adservices/measurement/e;", "request", "f", "(Landroidx/privacysandbox/ads/adservices/measurement/e;)Lcom/google/common/util/concurrent/D0;", "Landroidx/privacysandbox/ads/adservices/measurement/g;", "g", "(Landroidx/privacysandbox/ads/adservices/measurement/g;)Lcom/google/common/util/concurrent/D0;", "", "b", "()Lcom/google/common/util/concurrent/D0;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.privacysandbox.ads.adservices.java.measurement.a$a, reason: collision with other inner class name */
    public static final class C1900a extends a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final androidx.privacysandbox.ads.adservices.measurement.c f53551b;

        /* compiled from: MeasurementManagerFutures.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1", f = "MeasurementManagerFutures.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.privacysandbox.ads.adservices.java.measurement.a$a$a, reason: collision with other inner class name */
        public static final class C1901a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f53552q;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ androidx.privacysandbox.ads.adservices.measurement.a f53554s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1901a(androidx.privacysandbox.ads.adservices.measurement.a aVar, Continuation<? super C1901a> continuation) {
                super(2, continuation);
                this.f53554s = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return C1900a.this.new C1901a(this.f53554s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C1901a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f53552q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.c cVar = C1900a.this.f53551b;
                    this.f53552q = 1;
                    if (cVar.a(this.f53554s, this) == coroutine_suspended) {
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

        /* compiled from: MeasurementManagerFutures.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)I"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", f = "MeasurementManagerFutures.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.privacysandbox.ads.adservices.java.measurement.a$a$b */
        public static final class b extends SuspendLambda implements p<T, Continuation<? super Integer>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f53555q;

            public b(Continuation<? super b> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return C1900a.this.new b(continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super Integer> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f53555q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.c cVar = C1900a.this.f53551b;
                    this.f53555q = 1;
                    obj = cVar.b(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return obj;
            }
        }

        /* compiled from: MeasurementManagerFutures.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", f = "MeasurementManagerFutures.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.privacysandbox.ads.adservices.java.measurement.a$a$c */
        public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f53557q;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Uri f53559s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ InputEvent f53560t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Uri uri, InputEvent inputEvent, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f53559s = uri;
                this.f53560t = inputEvent;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return C1900a.this.new c(this.f53559s, this.f53560t, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f53557q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.c cVar = C1900a.this.f53551b;
                    this.f53557q = 1;
                    if (cVar.c(this.f53559s, this.f53560t, this) == coroutine_suspended) {
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

        /* compiled from: MeasurementManagerFutures.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", f = "MeasurementManagerFutures.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.privacysandbox.ads.adservices.java.measurement.a$a$d */
        public static final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f53561q;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Uri f53563s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Uri uri, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f53563s = uri;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return C1900a.this.new d(this.f53563s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f53561q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.c cVar = C1900a.this.f53551b;
                    this.f53561q = 1;
                    if (cVar.d(this.f53563s, this) == coroutine_suspended) {
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

        /* compiled from: MeasurementManagerFutures.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1", f = "MeasurementManagerFutures.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.privacysandbox.ads.adservices.java.measurement.a$a$e */
        public static final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f53564q;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ androidx.privacysandbox.ads.adservices.measurement.e f53566s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(androidx.privacysandbox.ads.adservices.measurement.e eVar, Continuation<? super e> continuation) {
                super(2, continuation);
                this.f53566s = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return C1900a.this.new e(this.f53566s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f53564q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.c cVar = C1900a.this.f53551b;
                    this.f53564q = 1;
                    if (cVar.e(this.f53566s, this) == coroutine_suspended) {
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

        /* compiled from: MeasurementManagerFutures.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1", f = "MeasurementManagerFutures.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.privacysandbox.ads.adservices.java.measurement.a$a$f */
        public static final class f extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f53567q;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ g f53569s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(g gVar, Continuation<? super f> continuation) {
                super(2, continuation);
                this.f53569s = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return C1900a.this.new f(this.f53569s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f53567q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.c cVar = C1900a.this.f53551b;
                    this.f53567q = 1;
                    if (cVar.f(this.f53569s, this) == coroutine_suspended) {
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

        public C1900a(@k androidx.privacysandbox.ads.adservices.measurement.c cVar) {
            this.f53551b = cVar;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.a
        @InterfaceC42164u
        @k
        @a0
        public D0<Integer> b() {
            return androidx.privacysandbox.ads.adservices.java.internal.c.a(C43259k.b(U.a(C43262l0.f411945a), null, new b(null), 3));
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.a
        @InterfaceC42164u
        @k
        @a0
        public D0<G0> c(@k Uri trigger) {
            return androidx.privacysandbox.ads.adservices.java.internal.c.a(C43259k.b(U.a(C43262l0.f411945a), null, new d(trigger, null), 3));
        }

        @InterfaceC42164u
        @k
        @a0
        public D0<G0> d(@k androidx.privacysandbox.ads.adservices.measurement.a deletionRequest) {
            return androidx.privacysandbox.ads.adservices.java.internal.c.a(C43259k.b(U.a(C43262l0.f411945a), null, new C1901a(deletionRequest, null), 3));
        }

        @InterfaceC42164u
        @k
        @a0
        public D0<G0> e(@k Uri attributionSource, @l InputEvent inputEvent) {
            return androidx.privacysandbox.ads.adservices.java.internal.c.a(C43259k.b(U.a(C43262l0.f411945a), null, new c(attributionSource, inputEvent, null), 3));
        }

        @InterfaceC42164u
        @k
        @a0
        public D0<G0> f(@k androidx.privacysandbox.ads.adservices.measurement.e request) {
            return androidx.privacysandbox.ads.adservices.java.internal.c.a(C43259k.b(U.a(C43262l0.f411945a), null, new e(request, null), 3));
        }

        @InterfaceC42164u
        @k
        @a0
        public D0<G0> g(@k g request) {
            return androidx.privacysandbox.ads.adservices.java.internal.c.a(C43259k.b(U.a(C43262l0.f411945a), null, new f(request, null), 3));
        }
    }

    /* compiled from: MeasurementManagerFutures.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/measurement/a$b;", "", "<init>", "()V", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    @n
    @l
    public static final a a(@k Context context) {
        f53550a.getClass();
        c.f53580a.getClass();
        c cVarA = c.b.a(context);
        if (cVarA != null) {
            return new C1900a(cVarA);
        }
        return null;
    }

    @k
    @a0
    public abstract D0<Integer> b();

    @k
    @a0
    public abstract D0<G0> c(@k Uri uri);
}

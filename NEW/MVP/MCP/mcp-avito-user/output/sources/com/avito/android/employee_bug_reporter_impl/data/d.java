package com.avito.android.employee_bug_reporter_impl.data;

import Oy.InterfaceC14749b;
import com.avito.android.util.R0;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: BugReporterAnalyticsStorageImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/employee_bug_reporter_impl/data/d;", "LOy/b;", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements InterfaceC14749b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<AK0.l> f147264a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f147265b;

    /* compiled from: BugReporterAnalyticsStorageImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.employee_bug_reporter_impl.data.BugReporterAnalyticsStorageImpl$markDragEventSent$2", f = "BugReporterAnalyticsStorageImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {
        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            d.this.f147264a.get().putBoolean("br-dragged-event-sent", true);
            return G0.f406611a;
        }
    }

    @Inject
    public d(@Y61.k R0 r02, @Y61.k h31.e eVar) {
        this.f147264a = eVar;
        this.f147265b = r02;
    }

    @Override // Oy.InterfaceC14749b
    public final boolean a() {
        return this.f147264a.get().getBoolean("br-dragged-event-sent", false);
    }

    @Override // Oy.InterfaceC14749b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        Object objG = C43259k.g(this.f147265b.a(), new a(null), continuation);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }
}

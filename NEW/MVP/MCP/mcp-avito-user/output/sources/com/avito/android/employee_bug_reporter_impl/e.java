package com.avito.android.employee_bug_reporter_impl;

import Oy.InterfaceC14751d;
import Y41.p;
import Y61.k;
import Y61.l;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.view.C23069w;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.IdentityHashMap;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;

/* compiled from: EmployeeBugReporterLifecycleCallbacksImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.employee_bug_reporter_impl.EmployeeBugReporterLifecycleCallbacksImpl$subscribeToDeepLink$1", f = "EmployeeBugReporterLifecycleCallbacksImpl.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f147297q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f147298r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22983P f147299s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Activity f147300t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Sy.b f147301u;

    /* compiled from: EmployeeBugReporterLifecycleCallbacksImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LOy/d;", VoiceInfo.STATE, "Lkotlin/G0;", "emit", "(LOy/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f147302b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Activity f147303c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Sy.b f147304d;

        public a(f fVar, Activity activity, Sy.b bVar) {
            this.f147302b = fVar;
            this.f147303c = activity;
            this.f147304d = bVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            InterfaceC14751d interfaceC14751d = (InterfaceC14751d) obj;
            f fVar = this.f147302b;
            fVar.getClass();
            boolean zF2 = L.f(interfaceC14751d, InterfaceC14751d.C0822d.f12740b);
            Sy.b bVar = this.f147304d;
            if (zF2) {
                bVar.setVisible(false);
            } else {
                boolean zF3 = L.f(interfaceC14751d, InterfaceC14751d.b.f12738b);
                Activity activity = this.f147303c;
                if (zF3) {
                    View rootView = activity.getWindow().getDecorView().getRootView();
                    ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
                    IdentityHashMap<Activity, Sy.b> identityHashMap = fVar.f147308f;
                    Sy.b bVar2 = identityHashMap.get(activity);
                    if (viewGroup != null) {
                        viewGroup.removeView(bVar2);
                    }
                    if (identityHashMap.containsKey(activity)) {
                        identityHashMap.remove(activity);
                    }
                } else if (interfaceC14751d instanceof InterfaceC14751d.c) {
                    bVar.setVisible(true);
                    bVar.setOnClick(new b(fVar, activity, interfaceC14751d));
                }
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, InterfaceC22983P interfaceC22983P, Activity activity, Sy.b bVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f147298r = fVar;
        this.f147299s = interfaceC22983P;
        this.f147300t = activity;
        this.f147301u = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new e(this.f147298r, this.f147299s, this.f147300t, this.f147301u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f147297q;
        if (i12 == 0) {
            C42729a0.b(obj);
            f fVar = this.f147298r;
            InterfaceC43160i interfaceC43160iA = C23069w.a(fVar.f147305c.d(), this.f147299s.getLifecycle(), Lifecycle.State.f46682e);
            a aVar = new a(fVar, this.f147300t, this.f147301u);
            this.f147297q = 1;
            if (((AbstractC43168f) interfaceC43160iA).collect(aVar, this) == coroutine_suspended) {
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

package com.avito.android.safety.safety_settings.ui;

import androidx.compose.foundation.lazy.w0;
import com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsElement;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;

/* compiled from: SafetySettingsScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.safety.safety_settings.ui.SafetySettingsScreenKt$SafetySettingsList$1", f = "SafetySettingsScreen.kt", i = {}, l = {188}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.safety.safety_settings.ui.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34453m extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f257879q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ List<SafetySettingsElement> f257880r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f257881s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w0 f257882t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C34453m(List<? extends SafetySettingsElement> list, boolean z12, w0 w0Var, Continuation<? super C34453m> continuation) {
        super(2, continuation);
        this.f257880r = list;
        this.f257881s = z12;
        this.f257882t = w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C34453m(this.f257880r, this.f257881s, this.f257882t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C34453m) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f257879q;
        if (i12 == 0) {
            C42729a0.b(obj);
            List<SafetySettingsElement> list = this.f257880r;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof SafetySettingsElement.e) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty() && this.f257881s) {
                w0 w0Var = this.f257882t;
                if (C42745f0.J(w0Var.j().h()) - 1 == C42745f0.J(list) - 1) {
                    int size = list.size() - 1;
                    this.f257879q = 1;
                    if (w0Var.f(size, 0, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
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

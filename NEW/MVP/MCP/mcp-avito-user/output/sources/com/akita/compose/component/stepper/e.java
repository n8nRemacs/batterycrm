package com.akita.compose.component.stepper;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20274e;
import androidx.compose.animation.core.C20318t;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.InterfaceC22204y1;
import java.util.ArrayList;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43225h;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: Stepper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.akita.compose.component.stepper.StepperKt$CounterText$1", f = "Stepper.kt", i = {}, l = {181}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class e extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f62848q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f62849r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Map<Integer, C20268c<Float, C20318t>> f62850s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f62851t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22196w1 f62852u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Integer> f62853v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f62854w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Map<Integer, C20268c<Float, C20318t>> map, int i12, InterfaceC22196w1 interfaceC22196w1, InterfaceC22204y1<Integer> interfaceC22204y1, float f12, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f62850s = map;
        this.f62851t = i12;
        this.f62852u = interfaceC22196w1;
        this.f62853v = interfaceC22204y1;
        this.f62854w = f12;
    }

    public static final void a(Map map, T t12, ArrayList arrayList, float f12, int i12, int i13) {
        Integer numValueOf = Integer.valueOf(i12);
        Object objA = map.get(numValueOf);
        if (objA == null) {
            objA = C20274e.a(0.0f);
            map.put(numValueOf, objA);
        }
        arrayList.add(C43259k.d(t12, null, null, new d((C20268c) objA, f12, i13, null), 3));
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f62850s, this.f62851t, this.f62852u, this.f62853v, this.f62854w, continuation);
        eVar.f62849r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        int i12;
        int i13;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i14 = this.f62848q;
        InterfaceC22204y1<Integer> interfaceC22204y1 = this.f62853v;
        InterfaceC22196w1 interfaceC22196w1 = this.f62852u;
        int i15 = this.f62851t;
        if (i14 == 0) {
            C42729a0.b(obj);
            T t12 = (T) this.f62849r;
            this.f62850s.clear();
            ArrayList arrayList = new ArrayList();
            String strValueOf = String.valueOf(interfaceC22196w1.e());
            String strValueOf2 = String.valueOf(i15);
            interfaceC22204y1.setValue(Boxing.boxInt(i15));
            if (strValueOf.length() != strValueOf2.length()) {
                int iMax = Math.max(strValueOf.length(), strValueOf2.length());
                for (int i16 = 0; i16 < iMax; i16++) {
                    a(this.f62850s, t12, arrayList, this.f62854w, i16, i16);
                }
            } else {
                int i17 = -1;
                int i18 = 0;
                int i19 = -1;
                while (i18 < strValueOf2.length()) {
                    if (strValueOf.charAt(i18) != strValueOf2.charAt(i18)) {
                        int i22 = i19 == i17 ? i18 : i19;
                        i12 = i18;
                        i13 = i17;
                        a(this.f62850s, t12, arrayList, this.f62854w, i18, i18 - i22);
                        i19 = i22;
                    } else {
                        i12 = i18;
                        i13 = i17;
                    }
                    i18 = i12 + 1;
                    i17 = i13;
                }
            }
            this.f62848q = 1;
            if (C43225h.c(arrayList, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        interfaceC22196w1.L3(i15);
        interfaceC22204y1.setValue(null);
        return G0.f406611a;
    }
}

package com.avito.android.publish.slots.regnum_suggest;

import AK0.l;
import Y41.p;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.j;
import com.avito.android.publish.C0;
import com.avito.android.publish.Q0;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.regnum_suggest.RegnumSuggestSlot;
import com.avito.android.remote.model.category_parameters.slot.regnum_suggest.RegnumSuggestSlotConfig;
import com.avito.android.util.R0;
import i31.InterfaceC41220a;
import java.util.Iterator;
import java.util.List;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;
import lD.C43617a;
import yc.C50213a;

/* compiled from: RegnumSuggestSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/regnum_suggest/a;", "Lcom/avito/android/category_parameters/j;", "Lcom/avito/android/remote/model/category_parameters/slot/regnum_suggest/RegnumSuggestSlot;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a extends j<RegnumSuggestSlot> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final RegnumSuggestSlot f244732b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C0 f244733c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final l f244734d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C50213a f244735e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final N0 f244736f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC42726C f244737g;

    /* compiled from: RegnumSuggestSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.slots.regnum_suggest.RegnumSuggestSlotWrapper$1", f = "RegnumSuggestSlotWrapper.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.publish.slots.regnum_suggest.a$a, reason: collision with other inner class name */
    public static final class C7330a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f244738q;

        public C7330a(Continuation<? super C7330a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return a.this.new C7330a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C7330a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f244738q;
            a aVar = a.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                aVar.f244734d.putBoolean((String) aVar.f244737g.getValue(), false);
                C0 c02 = aVar.f244733c;
                c02.f231859W.setValue(Q0.o.f232055c);
                c02.xe(null);
                this.f244738q = 1;
                if (C43131e0.b(300L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            aVar.f244733c.f231859W.setValue(Q0.f.f232045c);
            return G0.f406611a;
        }
    }

    /* compiled from: RegnumSuggestSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<String> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            return "shouldRecognizeRegNumByPhoto" + a.this.f244735e.b();
        }
    }

    @i31.c
    public a(@InterfaceC41220a @k RegnumSuggestSlot regnumSuggestSlot, @k C0 c02, @k l lVar, @k C50213a c50213a, @k R0 r02, @k C43617a c43617a) {
        this.f244732b = regnumSuggestSlot;
        this.f244733c = c02;
        this.f244734d = lVar;
        this.f244735e = c50213a;
        C43238h c43238hA = U.a(r02.b());
        String vehicleNumberId = ((RegnumSuggestSlotConfig) regnumSuggestSlot.getWidget().getConfig()).getVehicleNumberId();
        String regNumByPhotoRequest = ((RegnumSuggestSlotConfig) regnumSuggestSlot.getWidget().getConfig()).getRegNumByPhotoRequest();
        InterfaceC42726C interfaceC42726CC = C42727D.c(new b());
        this.f244737g = interfaceC42726CC;
        ParameterSlot parameterSlotJ = j(vehicleNumberId);
        CharParameter charParameter = parameterSlotJ instanceof CharParameter ? (CharParameter) parameterSlotJ : null;
        String str = charParameter != null ? charParameter.get_value() : null;
        boolean z12 = lVar.getBoolean((String) interfaceC42726CC.getValue(), true);
        ParameterSlot parameterSlotJ2 = j(regNumByPhotoRequest);
        SelectParameter.Flat flat = parameterSlotJ2 instanceof SelectParameter.Flat ? (SelectParameter.Flat) parameterSlotJ2 : null;
        if (flat == null || L.f(flat.get_value(), "1") || !z12) {
            return;
        }
        c43617a.getClass();
        n<Object> nVar = C43617a.f413588V[44];
        if (((Boolean) c43617a.f413608T.a().invoke()).booleanValue()) {
            if (str == null || C43066x.K(str)) {
                N0 n02 = this.f244736f;
                if (n02 != null) {
                    ((V0) n02).c(null);
                }
                this.f244736f = C43259k.d(c43238hA, null, null, new C7330a(null), 3);
            }
        }
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f244732b;
    }

    public final ParameterSlot j(String str) {
        List<ParameterSlot> parameters;
        CategoryParameters categoryParameters = this.f244733c.f231873k0;
        Object obj = null;
        if (categoryParameters == null || (parameters = categoryParameters.getParameters()) == null) {
            return null;
        }
        Iterator<T> it = parameters.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (L.f(((ParameterSlot) next).getId(), str)) {
                obj = next;
                break;
            }
        }
        return (ParameterSlot) obj;
    }
}

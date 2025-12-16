package com.avito.android.extended_profile_selection_create.select.mvi;

import com.avito.android.extended_profile_selection_create.ExtendedProfileSelectionCreateConfig;
import com.avito.android.extended_profile_selection_create.select.InterfaceC30498c;
import com.avito.android.extended_profile_selection_create.select.mvi.entity.ExtendedProfileSelectionCreateInternalAction;
import com.avito.android.remote.model.SearchParams;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Z1;

/* compiled from: ExtendedProfileSelectionCreateBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/mvi/h;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements com.avito.android.arch.mvi.b<ExtendedProfileSelectionCreateInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30498c f152381a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ExtendedProfileSelectionCreateConfig f152382b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Z1<HA.g> f152383c;

    /* compiled from: ExtendedProfileSelectionCreateBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_selection_create.select.mvi.ExtendedProfileSelectionCreateBootstrap$produce$1", f = "ExtendedProfileSelectionCreateBootstrap.kt", i = {}, l = {31, 33}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileSelectionCreateInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f152384q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f152385r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = h.this.new a(continuation);
            aVar.f152385r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileSelectionCreateInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f152384q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f152385r;
                h hVar = h.this;
                Z1<HA.g> z12 = hVar.f152383c;
                HA.g value = z12.getValue();
                ExtendedProfileSelectionCreateConfig extendedProfileSelectionCreateConfig = hVar.f152382b;
                String str = extendedProfileSelectionCreateConfig.f151621l;
                String str2 = str == null ? "" : str;
                Boolean bool = extendedProfileSelectionCreateConfig.f151620k;
                z12.setValue(HA.g.a(value, str2, str, bool != null ? bool.booleanValue() : true, extendedProfileSelectionCreateConfig.f151620k, null, 48));
                Long l12 = extendedProfileSelectionCreateConfig.f151619j;
                InterfaceC30498c interfaceC30498c = hVar.f152381a;
                if (l12 != null) {
                    InterfaceC43160i<ExtendedProfileSelectionCreateInternalAction> interfaceC43160iB = interfaceC30498c.b(l12);
                    this.f152384q = 1;
                    if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    InterfaceC43160i interfaceC43160iA = InterfaceC30498c.a.a(interfaceC30498c, 0, new SearchParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null), 5);
                    this.f152384q = 2;
                    if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public h(@Y61.k InterfaceC30498c interfaceC30498c, @Y61.k ExtendedProfileSelectionCreateConfig extendedProfileSelectionCreateConfig, @Y61.k Z1<HA.g> z12) {
        this.f152381a = interfaceC30498c;
        this.f152382b = extendedProfileSelectionCreateConfig;
        this.f152383c = z12;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<ExtendedProfileSelectionCreateInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}

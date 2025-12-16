package com.avito.android.realty_agency.use_case;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import android.content.Context;
import com.avito.android.R;
import com.avito.android.component.toast.c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import com.avito.android.util.R0;
import java.io.Serializable;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.internal.C43238h;
import ti0.InterfaceC48675a;
import ui0.C49065a;

/* compiled from: AddLotToSelectionUseCase.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/android/realty_agency/use_case/a;", "Lkotlin/Function3;", "", "", "Lkotlinx/coroutines/flow/i;", "Lkotlin/G0;", "_avito_realty-agency_shared_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements q<String, Long, String, InterfaceC43160i<? extends G0>> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC48675a f251749b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f251750c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.realty_agency.beduin.a f251751d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.i f251752e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Context f251753f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C43238h f251754g;

    /* compiled from: AddLotToSelectionUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.realty_agency.use_case.AddLotToSelectionUseCase$invoke$1", f = "AddLotToSelectionUseCase.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.realty_agency.use_case.a$a, reason: collision with other inner class name */
    public static final class C7552a extends SuspendLambda implements p<InterfaceC43172j<? super G0>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f251755q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f251757s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f251758t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f251759u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7552a(String str, long j12, String str2, Continuation<? super C7552a> continuation) {
            super(2, continuation);
            this.f251757s = str;
            this.f251758t = j12;
            this.f251759u = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return a.this.new C7552a(this.f251757s, this.f251758t, this.f251759u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super G0> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C7552a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object objA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f251755q;
            a aVar = a.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC48675a interfaceC48675a = aVar.f251749b;
                this.f251755q = 1;
                objA = interfaceC48675a.a(null, this.f251757s, this.f251758t, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                objA = obj;
            }
            TypedResult typedResult = (TypedResult) objA;
            boolean z12 = typedResult instanceof TypedResult.Success;
            String str = this.f251759u;
            if (z12) {
                C49065a c49065a = (C49065a) ((TypedResult.Success) typedResult).getResult();
                aVar.getClass();
                a.i.C4057a.d(aVar.f251752e, com.avito.android.printable_text.b.c(R.string.realty_agency_add_lot_to_selection_success_text, str), null, Collections.singletonList(new c.a.C3719a(aVar.f251753f.getString(R.string.realty_agency_add_lot_to_selection_success_button), false, null, new c(aVar, c49065a), 6, null)), null, 0, ToastBarPosition.f181047e, null, "avitoRe23", 954);
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                TypedResult.Error error = (TypedResult.Error) typedResult;
                C35936s.a(error.getError(), error.getCause());
                aVar.getClass();
                a.i.C4057a.d(aVar.f251752e, com.avito.android.printable_text.b.c(R.string.realty_agency_add_lot_to_selection_failure_text, new Serializable[0]), null, Collections.singletonList(new c.a.C3719a(aVar.f251753f.getString(R.string.realty_agency_add_lot_to_selection_failure_button), false, null, new b(aVar, this.f251757s, this.f251758t, str), 6, null)), null, 0, ToastBarPosition.f181047e, null, "avitoRe23", 954);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k InterfaceC48675a interfaceC48675a, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k com.avito.android.realty_agency.beduin.a aVar2, @k a.i iVar, @k R0 r02, @k Context context) {
        this.f251749b = interfaceC48675a;
        this.f251750c = aVar;
        this.f251751d = aVar2;
        this.f251752e = iVar;
        this.f251753f = context;
        this.f251754g = U.a(CoroutineContext.Element.DefaultImpls.plus(Q0.a(), r02.b()));
    }

    @k
    public final InterfaceC43160i a(long j12, @k String str, @k String str2) {
        return C43175k.G(new C7552a(str, j12, str2, null));
    }

    @Override // Y41.q
    public final /* bridge */ /* synthetic */ InterfaceC43160i<? extends G0> invoke(String str, Long l12, String str2) {
        return a(l12.longValue(), str, str2);
    }
}

package com.avito.android.evidence_request.mvi.domain.evidence_details;

import android.net.Uri;
import com.avito.android.evidence_request.mvi.evidence_details.mvi.entity.EvidenceDetailsInternalAction;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.remote.model.category_parameters.SimpleParametersTree;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.validation.InterfaceC36030r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: EvidenceDetailsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/domain/evidence_details/e;", "Lcom/avito/android/evidence_request/mvi/domain/evidence_details/d;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.evidence_request.mvi.domain.evidence_details.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30385e implements InterfaceC30384d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f148682a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final FilesInteractor f148683b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final n f148684c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36030r0 f148685d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final q f148686e;

    /* compiled from: EvidenceDetailsInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.evidence_request.mvi.domain.evidence_details.EvidenceDetailsInteractorImpl$submissionRequest$1", f = "EvidenceDetailsInteractor.kt", i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 5, 5, 6}, l = {50, 105, 117, 118, 119, 120, 121, 122, 112, 140}, m = "invokeSuspend", n = {"$this$flow", "items", "this_$iv", "$this$startLocalValidation$iv", "slots$iv", "fileParameter$iv", "slots$iv", "this_$iv$iv", "$this$sendConfirmation$iv$iv", "slots$iv", "this_$iv$iv", "$this$sendConfirmation$iv$iv", "$this$sendConfirmation$iv$iv", "$this$sendConfirmation$iv$iv", "result$iv$iv", "$this$sendConfirmation$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$0", "L$1", "L$0"})
    /* renamed from: com.avito.android.evidence_request.mvi.domain.evidence_details.e$a */
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super EvidenceDetailsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Object f148687q;

        /* renamed from: r, reason: collision with root package name */
        public Object f148688r;

        /* renamed from: s, reason: collision with root package name */
        public PhotoParameter f148689s;

        /* renamed from: t, reason: collision with root package name */
        public int f148690t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f148691u;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ List<com.avito.conveyor_item.a> f148693w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ List<ParameterSlot> f148694x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends com.avito.conveyor_item.a> list, List<? extends ParameterSlot> list2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f148693w = list;
            this.f148694x = list2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = C30385e.this.new a(this.f148693w, this.f148694x, continuation);
            aVar.f148691u = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super EvidenceDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0127 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0128  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x013e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0156 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x016b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0182 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0191 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0192  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 492
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.evidence_request.mvi.domain.evidence_details.C30385e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public C30385e(@Y61.k String str, @Y61.k FilesInteractor filesInteractor, @Y61.k n nVar, @Y61.k InterfaceC36030r0 interfaceC36030r0, @Y61.k q qVar) {
        this.f148682a = str;
        this.f148683b = filesInteractor;
        this.f148684c = nVar;
        this.f148685d = interfaceC36030r0;
        this.f148686e = qVar;
    }

    @Override // com.avito.android.evidence_request.mvi.domain.evidence_details.InterfaceC30384d
    public final void a(@Y61.k List<? extends com.avito.conveyor_item.a> list, @Y61.k List<? extends ParameterSlot> list2) {
        this.f148685d.c().accept(C42745f0.h0(this.f148684c.a(list2), list));
    }

    @Override // com.avito.android.evidence_request.mvi.domain.evidence_details.InterfaceC30384d
    @Y61.l
    public final PhotoParameter b(@Y61.k List<? extends ParameterSlot> list) {
        Object next;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof PhotoParameter) {
                break;
            }
        }
        return (PhotoParameter) (next instanceof PhotoParameter ? next : null);
    }

    @Override // com.avito.android.evidence_request.mvi.domain.evidence_details.InterfaceC30384d
    @Y61.k
    public final InterfaceC43160i<EvidenceDetailsInternalAction> c(@Y61.k List<? extends com.avito.conveyor_item.a> list, @Y61.k List<? extends ParameterSlot> list2) {
        return C43175k.G(new a(list, list2, null));
    }

    @Override // com.avito.android.evidence_request.mvi.domain.evidence_details.InterfaceC30384d
    public final void d(@Y61.k List<? extends com.avito.conveyor_item.a> list, @Y61.k List<? extends ParameterSlot> list2) {
        ArrayList arrayListH0 = C42745f0.h0(this.f148684c.a(list2), list);
        SimpleParametersTree simpleParametersTree = new SimpleParametersTree(list2);
        InterfaceC36030r0 interfaceC36030r0 = this.f148685d;
        interfaceC36030r0.f(simpleParametersTree, null);
        interfaceC36030r0.c().accept(arrayListH0);
    }

    @Override // com.avito.android.evidence_request.mvi.domain.evidence_details.InterfaceC30384d
    public final void e(@Y61.k List<? extends Uri> list) {
        this.f148683b.a(list);
    }
}

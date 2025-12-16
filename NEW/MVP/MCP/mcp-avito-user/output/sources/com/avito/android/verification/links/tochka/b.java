package com.avito.android.verification.links.tochka;

import FM0.d;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.ApiException;
import com.avito.android.verification.links.tochka.h;
import java.util.LinkedHashMap;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: VerificationTochkaLinkAsyncHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.verification.links.tochka.VerificationTochkaLinkAsyncHandler$handleSuccess$1", f = "VerificationTochkaLinkAsyncHandler.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f324657q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.verification.links.tochka.a f324658r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f324659s;

    /* compiled from: VerificationTochkaLinkAsyncHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "LFM0/d;", "<anonymous>", "(Lkotlinx/coroutines/T;)LFM0/d;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.verification.links.tochka.VerificationTochkaLinkAsyncHandler$handleSuccess$1$finishResult$1", f = "VerificationTochkaLinkAsyncHandler.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super FM0.d>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f324660q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.verification.links.tochka.a f324661r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ LinkedHashMap f324662s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.verification.links.tochka.a aVar, LinkedHashMap linkedHashMap, Continuation continuation) {
            super(2, continuation);
            this.f324661r = aVar;
            this.f324662s = linkedHashMap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new a(this.f324661r, this.f324662s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super FM0.d> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) throws ApiException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f324660q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.verification.links.tochka.a aVar = this.f324661r;
                this.f324660q = 1;
                obj = aVar.f324651m.a(this.f324662s, this);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.avito.android.verification.links.tochka.a aVar, LinkedHashMap linkedHashMap, Continuation continuation) {
        super(2, continuation);
        this.f324658r = aVar;
        this.f324659s = linkedHashMap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new b(this.f324658r, this.f324659s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object objG;
        PrintableText f323386f;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f324657q;
        com.avito.android.verification.links.tochka.a aVar = this.f324658r;
        String str = "";
        a.g gVar = aVar.f324647i;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                kotlinx.coroutines.scheduling.b bVarA = aVar.f324652n.a();
                a aVar2 = new a(aVar, this.f324659s, null);
                this.f324657q = 1;
                objG = C43259k.g(bVarA, aVar2, this);
                if (objG == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                objG = obj;
            }
            FM0.d dVar = (FM0.d) objG;
            if (dVar instanceof d.b) {
                if (((d.b) dVar).getUri() instanceof NoMatchLink) {
                    aVar.j(h.b.f324678b);
                } else {
                    aVar.i(h.c.f324679b, aVar.f324650l, ((d.b) dVar).getUri());
                }
            } else if (dVar instanceof d.a) {
                String errorId = ((d.a) dVar).getErrorId();
                if (errorId != null) {
                    FM0.b toastProps = ((d.a) dVar).getToastProps();
                    String description = toastProps != null ? toastProps.getDescription() : null;
                    if (description == null) {
                        description = "";
                    }
                    FM0.b toastProps2 = ((d.a) dVar).getToastProps();
                    String errorIdPrefix = toastProps2 != null ? toastProps2.getErrorIdPrefix() : null;
                    if (errorIdPrefix == null) {
                        errorIdPrefix = "";
                    }
                    f323386f = com.avito.android.printable_text.b.f(description + ' ' + errorIdPrefix + ' ' + errorId);
                } else {
                    f323386f = aVar.f324649k.getF323386f();
                }
                PrintableText printableText = f323386f;
                a.i iVar = aVar.f324648j;
                f.c.f125255c.getClass();
                a.i.C4057a.d(iVar, printableText, null, null, f.c.a.b(), 0, null, null, null, 2030);
                aVar.j(new h.a(String.valueOf(dVar)));
            }
        } finally {
            try {
                return G0.f406611a;
            } finally {
            }
        }
        return G0.f406611a;
    }
}

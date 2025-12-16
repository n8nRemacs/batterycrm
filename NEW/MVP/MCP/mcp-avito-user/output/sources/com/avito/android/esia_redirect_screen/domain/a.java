package com.avito.android.esia_redirect_screen.domain;

import Iz.AbstractC14178c;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.x;
import com.avito.android.gig.esia_redirect_screen.generated.api.get_self_employement_esia_url.GetSelfEmploymentEsiaRespSuccessActionsItem;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: EsiaRedirectScreenInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/esia_redirect_screen/domain/a;", "", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final x f148043a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final IF.a f148044b;

    /* compiled from: EsiaRedirectScreenInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.esia_redirect_screen.domain.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C4333a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f148045a;

        static {
            int[] iArr = new int[GetSelfEmploymentEsiaRespSuccessActionsItem.Type.values().length];
            try {
                iArr[GetSelfEmploymentEsiaRespSuccessActionsItem.Type.Proceed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GetSelfEmploymentEsiaRespSuccessActionsItem.Type.HowTo.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GetSelfEmploymentEsiaRespSuccessActionsItem.Type.Policy.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f148045a = iArr;
        }
    }

    /* compiled from: EsiaRedirectScreenInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LIz/c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.esia_redirect_screen.domain.EsiaRedirectScreenInteractor$loadPage$1", f = "EsiaRedirectScreenInteractor.kt", i = {0, 1}, l = {19, 20, 45}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super AbstractC14178c>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f148046q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f148047r;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = a.this.new b(continuation);
            bVar.f148047r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AbstractC14178c> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00f0  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x010f A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 281
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.esia_redirect_screen.domain.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@k x xVar, @k IF.a aVar) {
        this.f148043a = xVar;
        this.f148044b = aVar;
    }

    @k
    public final InterfaceC43160i<AbstractC14178c> a() {
        return C43175k.G(new b(null));
    }
}

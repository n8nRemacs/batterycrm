package com.avito.android.screens.bbip_private_v2.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.DeepLinkResponse;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2InternalAction;
import com.avito.android.util.R0;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import ih.InterfaceC41399a;
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
import qp0.C47426a;

/* compiled from: BbipPrivateV2PostContextUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/domain/c;", "", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC41399a f260918a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f260919b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.screens.bbip_private_v2.data.a f260920c;

    /* compiled from: BbipPrivateV2PostContextUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.screens.bbip_private_v2.domain.BbipPrivateV2PostContextUseCase$invoke$1", f = "BbipPrivateV2PostContextUseCase.kt", i = {0, 1, 2, 2}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.USER_IGNORE_PREVIOUS_POPUP, 30, 32, 34}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "it"}, s = {"L$0", "L$0", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super BbipPrivateV2InternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public DeepLinkResponse f260921q;

        /* renamed from: r, reason: collision with root package name */
        public int f260922r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f260923s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C47426a f260925u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f260926v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C47426a c47426a, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f260925u = c47426a;
            this.f260926v = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = c.this.new a(this.f260925u, this.f260926v, continuation);
            aVar.f260923s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BbipPrivateV2InternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 212
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.screens.bbip_private_v2.domain.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public c(@k InterfaceC41399a interfaceC41399a, @k R0 r02, @k com.avito.android.screens.bbip_private_v2.data.a aVar) {
        this.f260918a = interfaceC41399a;
        this.f260919b = r02;
        this.f260920c = aVar;
    }

    @k
    public final InterfaceC43160i<BbipPrivateV2InternalAction> a(@k C47426a c47426a, @l String str) {
        return C43175k.I(this.f260919b.a(), C43175k.G(new a(c47426a, str, null)));
    }
}

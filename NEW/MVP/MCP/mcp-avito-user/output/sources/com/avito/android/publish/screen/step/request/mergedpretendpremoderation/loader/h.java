package com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader;

import Ke0.InterfaceC14308b;
import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.C0;
import com.avito.android.util.R0;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PremoderationLoader.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/h;", "Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.a {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C0 f241798e;

    /* compiled from: PremoderationLoader.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LKe0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.PremoderationLoader$load$1", f = "PremoderationLoader.kt", i = {0, 1, 2}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC14308b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public h f241799q;

        /* renamed from: r, reason: collision with root package name */
        public int f241800r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f241801s;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = h.this.new a(continuation);
            aVar.f241801s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC14308b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x008c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00fb A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 255
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public h(@k R0 r02, @k com.avito.android.publish.pretend.e eVar, @k com.avito.android.publish.premoderation.k kVar, @k C0 c02) {
        super(r02, eVar, kVar, c02);
        this.f241798e = c02;
    }

    @Override // com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.g
    @k
    public final InterfaceC43160i<InterfaceC14308b> load() {
        return C43175k.G(new a(null));
    }
}

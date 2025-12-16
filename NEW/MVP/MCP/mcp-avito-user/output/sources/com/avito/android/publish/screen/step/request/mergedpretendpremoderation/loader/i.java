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

/* compiled from: PretendLoader.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/i;", "Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.a {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C0 f241803e;

    /* compiled from: PretendLoader.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LKe0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.PretendLoader$load$1", f = "PretendLoader.kt", i = {0, 1, 2}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC14308b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public i f241804q;

        /* renamed from: r, reason: collision with root package name */
        public int f241805r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f241806s;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = i.this.new a(continuation);
            aVar.f241806s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC14308b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0087 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00c5 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f241805r
                r2 = 0
                r3 = 4
                r4 = 3
                r5 = 2
                com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.i r6 = com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.i.this
                r7 = 1
                if (r1 == 0) goto L3e
                if (r1 == r7) goto L36
                if (r1 == r5) goto L2e
                if (r1 == r4) goto L24
                if (r1 != r3) goto L1c
                kotlin.C42729a0.b(r9)
                goto Lc6
            L1c:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L24:
                com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.i r6 = r8.f241804q
                java.lang.Object r1 = r8.f241806s
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L88
            L2e:
                java.lang.Object r1 = r8.f241806s
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L79
            L36:
                java.lang.Object r1 = r8.f241806s
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L53
            L3e:
                kotlin.C42729a0.b(r9)
                java.lang.Object r9 = r8.f241806s
                r1 = r9
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                Ke0.b$d r9 = Ke0.InterfaceC14308b.d.f9582a
                r8.f241806s = r1
                r8.f241805r = r7
                java.lang.Object r9 = r1.emit(r9, r8)
                if (r9 != r0) goto L53
                return r0
            L53:
                com.avito.android.publish.C0 r9 = r6.f241803e
                com.avito.android.publish.PublishState r9 = r9.f231861Y
                com.avito.android.remote.model.Navigation r9 = r9.getNavigation()
                com.avito.android.publish.C0 r7 = r6.f241803e
                com.avito.android.remote.model.category_parameters.CategoryParameters r7 = r7.f231873k0
                if (r7 != 0) goto L64
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            L64:
                r8.f241806s = r1
                r8.f241805r = r5
                com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.e r5 = new com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.e
                r5.<init>(r6, r9, r7, r2)
                com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.b r9 = new com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.b
                r9.<init>(r6, r5, r2)
                java.lang.Object r9 = kotlinx.coroutines.U.c(r9, r8)
                if (r9 != r0) goto L79
                return r0
            L79:
                kotlinx.coroutines.a0 r9 = (kotlinx.coroutines.InterfaceC43076a0) r9
                r8.f241806s = r1
                r8.f241804q = r6
                r8.f241805r = r4
                java.lang.Object r9 = r9.F(r8)
                if (r9 != r0) goto L88
                return r0
            L88:
                com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.a$b r9 = (com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.a.b) r9
                r8.f241806s = r2
                r8.f241804q = r2
                r8.f241805r = r3
                r6.getClass()
                boolean r3 = r9 instanceof com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.a.b.C7241a
                if (r3 == 0) goto Lae
                Ke0.b$c r2 = new Ke0.b$c
                com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.a$b$a r9 = (com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.a.b.C7241a) r9
                java.lang.String r9 = r9.f241775a
                r2.<init>(r9)
                java.lang.Object r9 = r1.emit(r2, r8)
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r9 != r1) goto Lab
                goto Lc3
            Lab:
                kotlin.G0 r9 = kotlin.G0.f406611a
                goto Lc3
            Lae:
                com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.a$b$c r1 = com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.a.b.c.f241777a
                boolean r1 = kotlin.jvm.internal.L.f(r9, r1)
                if (r1 == 0) goto Lbc
                com.avito.android.publish.C0 r9 = r6.f241803e
                r9.xe(r2)
                goto Lc1
            Lbc:
                com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.a$b$b r1 = com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.a.b.C7242b.f241776a
                kotlin.jvm.internal.L.f(r9, r1)
            Lc1:
                kotlin.G0 r9 = kotlin.G0.f406611a
            Lc3:
                if (r9 != r0) goto Lc6
                return r0
            Lc6:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public i(@k R0 r02, @k com.avito.android.publish.pretend.e eVar, @k com.avito.android.publish.premoderation.k kVar, @k C0 c02) {
        super(r02, eVar, kVar, c02);
        this.f241803e = c02;
    }

    @Override // com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.g
    @k
    public final InterfaceC43160i<InterfaceC14308b> load() {
        return C43175k.G(new a(null));
    }
}

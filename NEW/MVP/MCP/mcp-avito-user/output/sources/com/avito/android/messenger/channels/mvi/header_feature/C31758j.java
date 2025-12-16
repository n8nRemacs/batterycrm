package com.avito.android.messenger.channels.mvi.header_feature;

import FY.b;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.header_feature.j, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31758j implements InterfaceC43160i<b.f> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.internal.l f187556b;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.mvi.header_feature.j$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f187557b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.messenger.channels.mvi.header_feature.ChannelsHeaderBootstrap$subscribeCrmEntryPointStatus$$inlined$map$1$2", f = "ChannelsHeaderBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.messenger.channels.mvi.header_feature.j$a$a, reason: collision with other inner class name */
        public static final class C5498a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f187558q;

            /* renamed from: r, reason: collision with root package name */
            public int f187559r;

            public C5498a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f187558q = obj;
                this.f187559r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j) {
            this.f187557b = interfaceC43172j;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r6, @Y61.k kotlin.coroutines.Continuation r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.avito.android.messenger.channels.mvi.header_feature.C31758j.a.C5498a
                if (r0 == 0) goto L13
                r0 = r7
                com.avito.android.messenger.channels.mvi.header_feature.j$a$a r0 = (com.avito.android.messenger.channels.mvi.header_feature.C31758j.a.C5498a) r0
                int r1 = r0.f187559r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f187559r = r1
                goto L18
            L13:
                com.avito.android.messenger.channels.mvi.header_feature.j$a$a r0 = new com.avito.android.messenger.channels.mvi.header_feature.j$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f187558q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f187559r
                r3 = 1
                if (r2 == 0) goto L32
                if (r2 != r3) goto L2a
                kotlin.C42729a0.b(r7)
                goto L9a
            L2a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L32:
                kotlin.C42729a0.b(r7)
                com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
                boolean r7 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
                r2 = 0
                if (r7 == 0) goto L71
                com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
                java.lang.Object r7 = r6.getResult()
                pP.a r7 = (pP.C46987a) r7
                boolean r7 = r7.getEnabled()
                java.lang.Object r6 = r6.getResult()
                pP.a r6 = (pP.C46987a) r6
                pP.b r6 = r6.getAction()
                if (r6 == 0) goto L59
                java.lang.String r4 = r6.getTitle()
                goto L5a
            L59:
                r4 = r2
            L5a:
                if (r6 == 0) goto L60
                com.avito.android.deep_linking.links.DeepLink r2 = r6.getDeeplink()
            L60:
                if (r7 == 0) goto L6e
                if (r6 == 0) goto L6e
                if (r4 == 0) goto L6e
                if (r2 == 0) goto L6e
                cZ.a$a r6 = new cZ.a$a
                r6.<init>(r4, r2)
                goto L8a
            L6e:
                cZ.a$b r6 = cZ.AbstractC27130a.b.f57931a
                goto L8a
            L71:
                boolean r7 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r7 == 0) goto L9d
                com.avito.android.util.X2 r7 = com.avito.android.util.X2.f318778a
                com.avito.android.remote.model.TypedResult$Error r6 = (com.avito.android.remote.model.TypedResult.Error) r6
                com.avito.android.remote.error.ApiError r6 = r6.getError()
                com.avito.android.util.ApiException r6 = com.avito.android.util.C35936s.a(r6, r2)
                java.lang.String r2 = "ChannelsHeaderBootstrap"
                java.lang.String r4 = "CrmEntryPointStatus request error!"
                r7.a(r2, r4, r6)
                cZ.a$b r6 = cZ.AbstractC27130a.b.f57931a
            L8a:
                FY.b$f r7 = new FY.b$f
                r7.<init>(r6)
                r0.f187559r = r3
                kotlinx.coroutines.flow.j r6 = r5.f187557b
                java.lang.Object r6 = r6.emit(r7, r0)
                if (r6 != r1) goto L9a
                return r1
            L9a:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            L9d:
                kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.mvi.header_feature.C31758j.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public C31758j(kotlinx.coroutines.flow.internal.l lVar) {
        this.f187556b = lVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super b.f> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f187556b.collect(new a(interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}

package com.avito.android.buy_contact.deeplink;

import Y61.k;
import Y61.l;
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
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kv.C43501a;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements InterfaceC43160i<C43501a> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f108768b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f108769c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.buy_contact.deeplink.a$a, reason: collision with other inner class name */
    public static final class C3254a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f108770b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f108771c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.buy_contact.deeplink.BuyContactDeeplinkHandler$doHandle$$inlined$filter$1$2", f = "BuyContactDeeplinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.buy_contact.deeplink.a$a$a, reason: collision with other inner class name */
        public static final class C3255a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f108772q;

            /* renamed from: r, reason: collision with root package name */
            public int f108773r;

            public C3255a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                this.f108772q = obj;
                this.f108773r |= BeduinInputModel.MIN_TEXT_VERSION;
                return C3254a.this.emit(null, this);
            }
        }

        public C3254a(InterfaceC43172j interfaceC43172j, e eVar) {
            this.f108770b = interfaceC43172j;
            this.f108771c = eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r7, @Y61.k kotlin.coroutines.Continuation r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.avito.android.buy_contact.deeplink.a.C3254a.C3255a
                if (r0 == 0) goto L13
                r0 = r8
                com.avito.android.buy_contact.deeplink.a$a$a r0 = (com.avito.android.buy_contact.deeplink.a.C3254a.C3255a) r0
                int r1 = r0.f108773r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f108773r = r1
                goto L18
            L13:
                com.avito.android.buy_contact.deeplink.a$a$a r0 = new com.avito.android.buy_contact.deeplink.a$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f108772q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f108773r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r8)
                goto L73
            L29:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L31:
                kotlin.C42729a0.b(r8)
                r8 = r7
                kv.a r8 = (kv.C43501a) r8
                com.avito.android.buy_contact.deeplink.e r2 = r6.f108771c
                com.avito.android.deeplink_handler.handler.bundle.a r8 = r8.f413260a
                java.lang.String r4 = "request_key_buy_link"
                java.lang.String r5 = r8.f134521b
                boolean r4 = kotlin.jvm.internal.L.f(r5, r4)
                if (r4 == 0) goto L73
                com.avito.android.deep_linking.links.DeepLink r8 = r8.f134520a
                boolean r4 = r8 instanceof com.avito.android.job.cv_packages.links.CvPackagesLink
                if (r4 == 0) goto L58
                r4 = r8
                com.avito.android.job.cv_packages.links.CvPackagesLink r4 = (com.avito.android.job.cv_packages.links.CvPackagesLink) r4
                java.lang.String r4 = r4.f174421b
                java.lang.String r5 = r2.f108784j
                boolean r4 = kotlin.jvm.internal.L.f(r4, r5)
                if (r4 != 0) goto L68
            L58:
                boolean r4 = r8 instanceof com.avito.android.contact_access.links.ContactsPackagesApplyLink
                if (r4 == 0) goto L73
                com.avito.android.contact_access.links.ContactsPackagesApplyLink r8 = (com.avito.android.contact_access.links.ContactsPackagesApplyLink) r8
                java.lang.String r8 = r8.f126153b
                java.lang.String r2 = r2.f108784j
                boolean r8 = kotlin.jvm.internal.L.f(r8, r2)
                if (r8 == 0) goto L73
            L68:
                r0.f108773r = r3
                kotlinx.coroutines.flow.j r8 = r6.f108770b
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L73
                return r1
            L73:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.buy_contact.deeplink.a.C3254a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public a(InterfaceC43160i interfaceC43160i, e eVar) {
        this.f108768b = interfaceC43160i;
        this.f108769c = eVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @l
    public final Object collect(@k InterfaceC43172j<? super C43501a> interfaceC43172j, @k Continuation continuation) {
        Object objCollect = ((AbstractC43168f) this.f108768b).collect(new C3254a(interfaceC43172j, this.f108769c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}

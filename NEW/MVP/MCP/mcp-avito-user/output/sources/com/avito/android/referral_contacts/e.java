package com.avito.android.referral_contacts;

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

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements InterfaceC43160i<PermissionCheckResult> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f252490b;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f252491b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.referral_contacts.ReferralContactsPermissionRequester$observe$$inlined$map$1$2", f = "ReferralContactsPermissionRequester.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.referral_contacts.e$a$a, reason: collision with other inner class name */
        public static final class C7583a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f252492q;

            /* renamed from: r, reason: collision with root package name */
            public int f252493r;

            public C7583a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                this.f252492q = obj;
                this.f252493r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j) {
            this.f252491b = interfaceC43172j;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.avito.android.referral_contacts.e.a.C7583a
                if (r0 == 0) goto L13
                r0 = r6
                com.avito.android.referral_contacts.e$a$a r0 = (com.avito.android.referral_contacts.e.a.C7583a) r0
                int r1 = r0.f252493r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f252493r = r1
                goto L18
            L13:
                com.avito.android.referral_contacts.e$a$a r0 = new com.avito.android.referral_contacts.e$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f252492q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f252493r
                r3 = 1
                if (r2 == 0) goto L32
                if (r2 != r3) goto L2a
                kotlin.C42729a0.b(r6)
                goto Lcf
            L2a:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L32:
                kotlin.C42729a0.b(r6)
                com.avito.android.iac_util_deeplinks.public_module.ChainEventLink r5 = (com.avito.android.iac_util_deeplinks.public_module.ChainEventLink) r5
                com.avito.android.referral_contacts.c$a$a r6 = com.avito.android.referral_contacts.c.a.C7572a.f252378a
                r6.getClass()
                kotlin.C r6 = com.avito.android.referral_contacts.c.a.C7572a.f252379b
                java.lang.Object r6 = r6.getValue()
                com.avito.android.iac_util_deeplinks.public_module.ChainEventLink r6 = (com.avito.android.iac_util_deeplinks.public_module.ChainEventLink) r6
                boolean r6 = kotlin.jvm.internal.L.f(r5, r6)
                if (r6 == 0) goto L4e
                com.avito.android.referral_contacts.PermissionCheckResult r5 = com.avito.android.referral_contacts.PermissionCheckResult.f252364b
                goto Lc4
            L4e:
                kotlin.C r6 = com.avito.android.referral_contacts.c.a.C7572a.f252380c
                java.lang.Object r6 = r6.getValue()
                com.avito.android.iac_util_deeplinks.public_module.ChainEventLink r6 = (com.avito.android.iac_util_deeplinks.public_module.ChainEventLink) r6
                boolean r6 = kotlin.jvm.internal.L.f(r5, r6)
                if (r6 == 0) goto L5f
                com.avito.android.referral_contacts.PermissionCheckResult r5 = com.avito.android.referral_contacts.PermissionCheckResult.f252365c
                goto Lc4
            L5f:
                kotlin.C r6 = com.avito.android.referral_contacts.c.a.C7572a.f252381d
                java.lang.Object r6 = r6.getValue()
                com.avito.android.iac_util_deeplinks.public_module.ChainEventLink r6 = (com.avito.android.iac_util_deeplinks.public_module.ChainEventLink) r6
                boolean r6 = kotlin.jvm.internal.L.f(r5, r6)
                if (r6 == 0) goto L70
                com.avito.android.referral_contacts.PermissionCheckResult r5 = com.avito.android.referral_contacts.PermissionCheckResult.f252366d
                goto Lc4
            L70:
                kotlin.C r6 = com.avito.android.referral_contacts.c.a.C7572a.f252382e
                java.lang.Object r6 = r6.getValue()
                com.avito.android.iac_util_deeplinks.public_module.ChainEventLink r6 = (com.avito.android.iac_util_deeplinks.public_module.ChainEventLink) r6
                boolean r6 = kotlin.jvm.internal.L.f(r5, r6)
                if (r6 == 0) goto L81
                com.avito.android.referral_contacts.PermissionCheckResult r5 = com.avito.android.referral_contacts.PermissionCheckResult.f252367e
                goto Lc4
            L81:
                kotlin.C r6 = com.avito.android.referral_contacts.c.a.C7572a.f252384g
                java.lang.Object r6 = r6.getValue()
                com.avito.android.iac_util_deeplinks.public_module.ChainEventLink r6 = (com.avito.android.iac_util_deeplinks.public_module.ChainEventLink) r6
                boolean r6 = kotlin.jvm.internal.L.f(r5, r6)
                if (r6 == 0) goto L92
                com.avito.android.referral_contacts.PermissionCheckResult r5 = com.avito.android.referral_contacts.PermissionCheckResult.f252368f
                goto Lc4
            L92:
                kotlin.C r6 = com.avito.android.referral_contacts.c.a.C7572a.f252383f
                java.lang.Object r6 = r6.getValue()
                com.avito.android.iac_util_deeplinks.public_module.ChainEventLink r6 = (com.avito.android.iac_util_deeplinks.public_module.ChainEventLink) r6
                boolean r6 = kotlin.jvm.internal.L.f(r5, r6)
                if (r6 == 0) goto La3
                com.avito.android.referral_contacts.PermissionCheckResult r5 = com.avito.android.referral_contacts.PermissionCheckResult.f252369g
                goto Lc4
            La3:
                kotlin.C r6 = com.avito.android.referral_contacts.c.a.C7572a.f252385h
                java.lang.Object r6 = r6.getValue()
                com.avito.android.iac_util_deeplinks.public_module.ChainEventLink r6 = (com.avito.android.iac_util_deeplinks.public_module.ChainEventLink) r6
                boolean r6 = kotlin.jvm.internal.L.f(r5, r6)
                if (r6 == 0) goto Lb4
                com.avito.android.referral_contacts.PermissionCheckResult r5 = com.avito.android.referral_contacts.PermissionCheckResult.f252370h
                goto Lc4
            Lb4:
                kotlin.C r6 = com.avito.android.referral_contacts.c.a.C7572a.f252386i
                java.lang.Object r6 = r6.getValue()
                com.avito.android.iac_util_deeplinks.public_module.ChainEventLink r6 = (com.avito.android.iac_util_deeplinks.public_module.ChainEventLink) r6
                boolean r5 = kotlin.jvm.internal.L.f(r5, r6)
                if (r5 == 0) goto Ld2
                com.avito.android.referral_contacts.PermissionCheckResult r5 = com.avito.android.referral_contacts.PermissionCheckResult.f252371i
            Lc4:
                r0.f252493r = r3
                kotlinx.coroutines.flow.j r6 = r4.f252491b
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto Lcf
                return r1
            Lcf:
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            Ld2:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r6 = "Link should be one of EventLinks"
                r5.<init>(r6)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.referral_contacts.e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public e(InterfaceC43160i interfaceC43160i) {
        this.f252490b = interfaceC43160i;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @l
    public final Object collect(@k InterfaceC43172j<? super PermissionCheckResult> interfaceC43172j, @k Continuation continuation) {
        Object objCollect = this.f252490b.collect(new a(interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}

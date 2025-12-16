package com.avito.android.referral_contacts.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.referral_contacts.models.ReferralContactsInternalAction;
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
public final class f implements InterfaceC43160i<ReferralContactsInternalAction.ContentLoaded> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f252468b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f252469c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f252470b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f252471c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.referral_contacts.domain.ReferralContactsInteractor$checkContacts$$inlined$map$2$2", f = "ReferralContactsInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.referral_contacts.domain.f$a$a, reason: collision with other inner class name */
        public static final class C7582a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f252472q;

            /* renamed from: r, reason: collision with root package name */
            public int f252473r;

            public C7582a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                this.f252472q = obj;
                this.f252473r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, h hVar) {
            this.f252470b = interfaceC43172j;
            this.f252471c = hVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r17, @Y61.k kotlin.coroutines.Continuation r18) {
            /*
                r16 = this;
                r0 = r16
                r1 = r18
                boolean r2 = r1 instanceof com.avito.android.referral_contacts.domain.f.a.C7582a
                if (r2 == 0) goto L17
                r2 = r1
                com.avito.android.referral_contacts.domain.f$a$a r2 = (com.avito.android.referral_contacts.domain.f.a.C7582a) r2
                int r3 = r2.f252473r
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = r3 & r4
                if (r5 == 0) goto L17
                int r3 = r3 - r4
                r2.f252473r = r3
                goto L1c
            L17:
                com.avito.android.referral_contacts.domain.f$a$a r2 = new com.avito.android.referral_contacts.domain.f$a$a
                r2.<init>(r1)
            L1c:
                java.lang.Object r1 = r2.f252472q
                java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r4 = r2.f252473r
                r5 = 1
                if (r4 == 0) goto L35
                if (r4 != r5) goto L2d
                kotlin.C42729a0.b(r1)
                goto L92
            L2d:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L35:
                kotlin.C42729a0.b(r1)
                r1 = r17
                com.avito.android.referral_contacts.models.ReferralContactsStorageDto r1 = (com.avito.android.referral_contacts.models.ReferralContactsStorageDto) r1
                com.avito.android.referral_contacts.domain.h r4 = r0.f252471c
                com.avito.android.referral_contacts.h r6 = r4.f252479b
                java.lang.String r6 = r6.getF252500a()
                java.util.ArrayList r7 = r1.f252517b
                java.util.ArrayList r8 = new java.util.ArrayList
                r9 = 10
                int r9 = kotlin.collections.C42745f0.q(r7, r9)
                r8.<init>(r9)
                java.util.Iterator r7 = r7.iterator()
            L55:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L75
                java.lang.Object r9 = r7.next()
                com.avito.android.referral_contacts.models.ContactStorageDto r9 = (com.avito.android.referral_contacts.models.ContactStorageDto) r9
                com.avito.android.referral_contacts.contacts_list.ContactItem r15 = new com.avito.android.referral_contacts.contacts_list.ContactItem
                java.lang.String r11 = r9.f252506b
                java.lang.String r12 = r9.f252507c
                r13 = 0
                r14 = 4
                r9 = 0
                r10 = r15
                r5 = r15
                r15 = r9
                r10.<init>(r11, r12, r13, r14, r15)
                r8.add(r5)
                r5 = 1
                goto L55
            L75:
                com.avito.android.referral_contacts.models.ShareStorageDto r1 = r1.f252518c
                java.lang.String r5 = r1.f252520c
                com.avito.android.deep_linking.x r4 = r4.f252481d
                java.lang.String r1 = r1.f252519b
                com.avito.android.deep_linking.links.DeepLink r1 = r4.b(r1)
                com.avito.android.referral_contacts.models.ReferralContactsInternalAction$ContentLoaded r4 = new com.avito.android.referral_contacts.models.ReferralContactsInternalAction$ContentLoaded
                r4.<init>(r1, r6, r5, r8)
                r1 = 1
                r2.f252473r = r1
                kotlinx.coroutines.flow.j r1 = r0.f252470b
                java.lang.Object r1 = r1.emit(r4, r2)
                if (r1 != r3) goto L92
                return r3
            L92:
                kotlin.G0 r1 = kotlin.G0.f406611a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.referral_contacts.domain.f.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public f(InterfaceC43160i interfaceC43160i, h hVar) {
        this.f252468b = interfaceC43160i;
        this.f252469c = hVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @l
    public final Object collect(@k InterfaceC43172j<? super ReferralContactsInternalAction.ContentLoaded> interfaceC43172j, @k Continuation continuation) {
        Object objCollect = this.f252468b.collect(new a(interfaceC43172j, this.f252469c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}

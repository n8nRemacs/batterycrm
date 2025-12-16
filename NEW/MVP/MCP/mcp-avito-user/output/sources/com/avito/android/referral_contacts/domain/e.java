package com.avito.android.referral_contacts.domain;

import Ti0.C15366a;
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
import kotlinx.coroutines.flow.internal.AbstractC43168f;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements InterfaceC43160i<ReferralContactsInternalAction> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f252457b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f252458c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f252459b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f252460c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.referral_contacts.domain.ReferralContactsInteractor$checkContacts$$inlined$map$1$2", f = "ReferralContactsInteractor.kt", i = {0, 1, 1, 1}, l = {224, 232, 219}, m = "emit", n = {"this", "this", "result", "ttl"}, s = {"L$0", "L$0", "L$2", "L$3"})
        /* renamed from: com.avito.android.referral_contacts.domain.e$a$a, reason: collision with other inner class name */
        public static final class C7581a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f252461q;

            /* renamed from: r, reason: collision with root package name */
            public int f252462r;

            /* renamed from: s, reason: collision with root package name */
            public a f252463s;

            /* renamed from: u, reason: collision with root package name */
            public InterfaceC43172j f252465u;

            /* renamed from: v, reason: collision with root package name */
            public C15366a f252466v;

            /* renamed from: w, reason: collision with root package name */
            public Long f252467w;

            public C7581a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                this.f252461q = obj;
                this.f252462r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, h hVar) {
            this.f252459b = interfaceC43172j;
            this.f252460c = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:54:0x01db A[LOOP:0: B:52:0x01d5->B:54:0x01db, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0249 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v23 */
        /* JADX WARN: Type inference failed for: r1v25, types: [Ti0.a, com.avito.android.referral_contacts.domain.e$a, java.lang.Long, kotlinx.coroutines.flow.j] */
        /* JADX WARN: Type inference failed for: r1v33 */
        /* JADX WARN: Type inference failed for: r1v36 */
        /* JADX WARN: Type inference failed for: r1v37 */
        /* JADX WARN: Type inference failed for: r1v38 */
        /* JADX WARN: Type inference failed for: r1v39 */
        /* JADX WARN: Type inference failed for: r6v13, types: [com.avito.android.referral_contacts.models.ReferralContactsInternalAction$ContentLoaded] */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v2 */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r18, @Y61.k kotlin.coroutines.Continuation r19) {
            /*
                Method dump skipped, instructions count: 595
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.referral_contacts.domain.e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public e(InterfaceC43160i interfaceC43160i, h hVar) {
        this.f252457b = interfaceC43160i;
        this.f252458c = hVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @l
    public final Object collect(@k InterfaceC43172j<? super ReferralContactsInternalAction> interfaceC43172j, @k Continuation continuation) {
        Object objCollect = ((AbstractC43168f) this.f252457b).collect(new a(interfaceC43172j, this.f252458c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}

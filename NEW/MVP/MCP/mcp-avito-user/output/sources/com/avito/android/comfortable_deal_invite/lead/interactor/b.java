package com.avito.android.comfortable_deal_invite.lead.interactor;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal_invite.lead.mvi.entity.ComfortableDealInviteInternalAction;
import com.avito.android.util.R0;
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
import xq.InterfaceC49982a;

/* compiled from: ComfortableDealInviteInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/lead/interactor/b;", "Lcom/avito/android/comfortable_deal_invite/lead/interactor/a;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.comfortable_deal_invite.lead.interactor.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC49982a f123650a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f123651b;

    /* compiled from: ComfortableDealInviteInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal_invite.lead.interactor.ComfortableDealInviteInteractorImpl$createLead$1", f = "ComfortableDealInviteInteractor.kt", i = {0, 1}, l = {45, 46, 60, 62, 68, 70}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super ComfortableDealInviteInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ boolean f123652A;

        /* renamed from: B, reason: collision with root package name */
        public final /* synthetic */ String f123653B;

        /* renamed from: q, reason: collision with root package name */
        public int f123654q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f123655r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f123657t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f123658u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f123659v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f123660w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ boolean f123661x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ boolean f123662y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ boolean f123663z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, String str4, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f123657t = str;
            this.f123658u = str2;
            this.f123659v = str3;
            this.f123660w = z12;
            this.f123661x = z13;
            this.f123662y = z14;
            this.f123663z = z15;
            this.f123652A = z16;
            this.f123653B = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(this.f123657t, this.f123658u, this.f123659v, this.f123660w, this.f123661x, this.f123662y, this.f123663z, this.f123652A, this.f123653B, continuation);
            aVar.f123655r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ComfortableDealInviteInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0062 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 274
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal_invite.lead.interactor.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@k InterfaceC49982a interfaceC49982a, @k R0 r02) {
        this.f123650a = interfaceC49982a;
        this.f123651b = r02;
    }

    @Override // com.avito.android.comfortable_deal_invite.lead.interactor.a
    @k
    public final InterfaceC43160i<ComfortableDealInviteInternalAction> a(@l String str, @k String str2, @k String str3, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, @k String str4) {
        return C43175k.I(this.f123651b.a(), C43175k.G(new a(str, str2, str3, z12, z13, z14, z15, z16, str4, null)));
    }
}

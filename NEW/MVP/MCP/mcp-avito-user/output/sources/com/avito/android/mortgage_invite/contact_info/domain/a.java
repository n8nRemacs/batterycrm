package com.avito.android.mortgage_invite.contact_info.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage_invite.common.domain.f;
import com.avito.android.mortgage_invite.contact_info.mvi.entity.ApplicationContactInfoInternalAction;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
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

/* compiled from: CreateApplicationUseCase.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/contact_info/domain/a;", "", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final S10.c f205631a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f205632b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final f f205633c;

    /* compiled from: CreateApplicationUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage_invite.contact_info.domain.CreateApplicationUseCase$invoke$1", f = "CreateApplicationUseCase.kt", i = {0, 1, 2, 2}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP, 35, 44, 47, 49}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "it"}, s = {"L$0", "L$0", "L$0", "L$1"})
    /* renamed from: com.avito.android.mortgage_invite.contact_info.domain.a$a, reason: collision with other inner class name */
    public static final class C6131a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public S10.b f205634q;

        /* renamed from: r, reason: collision with root package name */
        public int f205635r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f205636s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ b20.d f205637t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ a f205638u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6131a(b20.d dVar, a aVar, Continuation<? super C6131a> continuation) {
            super(2, continuation);
            this.f205637t = dVar;
            this.f205638u = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C6131a c6131a = new C6131a(this.f205637t, this.f205638u, continuation);
            c6131a.f205636s = obj;
            return c6131a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C6131a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x0140  */
        /* JADX WARN: Removed duplicated region for block: B:103:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x015d  */
        /* JADX WARN: Removed duplicated region for block: B:123:0x01ad  */
        /* JADX WARN: Removed duplicated region for block: B:132:0x01f3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:133:0x01f4  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x00cb A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:147:0x00fb A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:150:0x0130 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x010e  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0111  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0135  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 548
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_invite.contact_info.domain.a.C6131a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@k S10.c cVar, @k R0 r02, @k f fVar) {
        this.f205631a = cVar;
        this.f205632b = r02;
        this.f205633c = fVar;
    }

    @k
    public final InterfaceC43160i<ApplicationContactInfoInternalAction> a(@k b20.d dVar) {
        return C43175k.I(this.f205632b.a(), C43175k.G(new C6131a(dVar, this, null)));
    }
}

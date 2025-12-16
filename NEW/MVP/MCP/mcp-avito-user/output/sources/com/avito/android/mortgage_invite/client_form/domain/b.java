package com.avito.android.mortgage_invite.client_form.domain;

import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage_invite.client_form.model.ApplicationClientFormArguments;
import com.avito.android.mortgage_invite.client_form.mvi.entity.ApplicationClientFormInternalAction;
import com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId;
import com.avito.android.mortgage_invite.generated.api.api_2_mortgage_form_participant_create_post.CreateParticipantInV2;
import com.avito.android.util.R0;
import com.yandex.metrica.YandexMetricaDefaultValues;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ApplicationClientFormActionProcessor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/client_form/domain/b;", "Lcom/avito/android/mortgage_invite/client_form/domain/a;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.mortgage_invite.client_form.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final R0 f205136a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage_invite.common.domain.f f205137b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final i f205138c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.domain.check_access.b f205139d;

    /* compiled from: ApplicationClientFormActionProcessor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage_invite.client_form.domain.ApplicationClientFormActionProcessorImpl$processActionButtonClick$1", f = "ApplicationClientFormActionProcessor.kt", i = {1, 2, 4, 5, 6, 9}, l = {44, 47, 55, 56, 60, 63, 71, 72, 77, 89, YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super ApplicationClientFormInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f205140q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f205141r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ U10.d f205142s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ ApplicationClientFormArguments f205143t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ b f205144u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(U10.d dVar, ApplicationClientFormArguments applicationClientFormArguments, b bVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f205142s = dVar;
            this.f205143t = applicationClientFormArguments;
            this.f205144u = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f205142s, this.f205143t, this.f205144u, continuation);
            aVar.f205141r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ApplicationClientFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00ae A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00bc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x011e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x018b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x019a A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 442
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_invite.client_form.domain.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@Y61.k R0 r02, @Y61.k com.avito.android.mortgage_invite.common.domain.f fVar, @Y61.k i iVar, @Y61.k com.avito.android.mortgage.domain.check_access.b bVar) {
        this.f205136a = r02;
        this.f205137b = fVar;
        this.f205138c = iVar;
        this.f205139d = bVar;
    }

    public static final CreateParticipantInV2.ParticipationType b(b bVar, String str) {
        Object next;
        bVar.getClass();
        Iterator it = ((AbstractC42738c) CreateParticipantInV2.ParticipationType.f205839d).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((CreateParticipantInV2.ParticipationType) next).f205840b, str)) {
                break;
            }
        }
        CreateParticipantInV2.ParticipationType participationType = (CreateParticipantInV2.ParticipationType) next;
        return participationType == null ? CreateParticipantInV2.ParticipationType.Borrower : participationType;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.mortgage_invite.client_form.domain.b r16, kotlinx.coroutines.flow.InterfaceC43172j r17, com.avito.android.mortgage_invite.client_form.domain.g r18, com.avito.android.mortgage_invite.client_form.model.ApplicationClientFormArguments r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_invite.client_form.domain.b.c(com.avito.android.mortgage_invite.client_form.domain.b, kotlinx.coroutines.flow.j, com.avito.android.mortgage_invite.client_form.domain.g, com.avito.android.mortgage_invite.client_form.model.ApplicationClientFormArguments, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static String d(Y10.a aVar, ContactInfoFieldId contactInfoFieldId) {
        Object next;
        Iterator<T> it = aVar.f19259b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Y10.b) next).f19261a == contactInfoFieldId) {
                break;
            }
        }
        Y10.b bVar = (Y10.b) next;
        if (bVar != null) {
            return bVar.f19269i;
        }
        return null;
    }

    @Override // com.avito.android.mortgage_invite.client_form.domain.a
    @Y61.k
    public final InterfaceC43160i<ApplicationClientFormInternalAction> a(@Y61.k ApplicationClientFormArguments applicationClientFormArguments, @Y61.k U10.d dVar) {
        return C43175k.I(this.f205136a.a(), C43175k.G(new a(dVar, applicationClientFormArguments, this, null)));
    }
}

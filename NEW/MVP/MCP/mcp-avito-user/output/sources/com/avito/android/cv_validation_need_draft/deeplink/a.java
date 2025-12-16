package com.avito.android.cv_validation_need_draft.deeplink;

import Y41.l;
import Y41.p;
import Y61.k;
import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.cv_validation_bottom_sheet.deeplink.CvValidationLink;
import com.avito.android.deep_linking.links.CreateChannelLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.error.z;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.TypedResult;
import java.io.Serializable;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.T;
import mQ.InterfaceC44001a;
import nQ.C44321a;

/* compiled from: CvValidationDraftDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cv_validation_need_draft.deeplink.CvValidationDraftDeeplinkHandler$doHandle$1", f = "CvValidationDraftDeeplinkHandler.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f131958q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.cv_validation_need_draft.deeplink.b f131959r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Long f131960s;

    /* compiled from: CvValidationDraftDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LnQ/a;", "it", "Lkotlin/G0;", "invoke", "(LnQ/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.cv_validation_need_draft.deeplink.a$a, reason: collision with other inner class name */
    public static final class C3953a extends N implements l<C44321a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.cv_validation_need_draft.deeplink.b f131961l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Long f131962m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3953a(com.avito.android.cv_validation_need_draft.deeplink.b bVar, Long l12) {
            super(1);
            this.f131961l = bVar;
            this.f131962m = l12;
        }

        @Override // Y41.l
        public final G0 invoke(C44321a c44321a) {
            com.avito.android.cv_validation_need_draft.deeplink.b bVar = this.f131961l;
            CreateChannelLink createChannelLink = new CreateChannelLink(this.f131962m.toString(), null, null, null, false, false, null, 94, null);
            com.avito.android.deeplink_handler.handler.composite.a aVar = bVar.f131964f;
            b.a.a(aVar, createChannelLink, null, null, 6);
            b.a.a(aVar, c44321a.getUri(), null, null, 6);
            return G0.f406611a;
        }
    }

    /* compiled from: CvValidationDraftDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.cv_validation_need_draft.deeplink.b f131963l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.cv_validation_need_draft.deeplink.b bVar) {
            super(1);
            this.f131963l = bVar;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            com.avito.android.cv_validation_need_draft.deeplink.b bVar = this.f131963l;
            a.i.C4057a.d(bVar.f131967i, com.avito.android.printable_text.b.c(R.string.cv_need_draft_default_error_message, new Serializable[0]), null, null, new f.c(new ApiError.NetworkIOError(str)), 0, null, null, null, 2030);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.avito.android.cv_validation_need_draft.deeplink.b bVar, Long l12, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f131959r = bVar;
        this.f131960s = l12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        return new a(this.f131959r, this.f131960s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f131958q;
        Long l12 = this.f131960s;
        com.avito.android.cv_validation_need_draft.deeplink.b bVar = this.f131959r;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC44001a interfaceC44001a = bVar.f131965g.get();
            double dLongValue = l12.longValue();
            this.f131958q = 1;
            obj = interfaceC44001a.a(dLongValue, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        z.o((TypedResult) obj, new C3953a(bVar, l12), new b(bVar), null, 60);
        bVar.f131966h.g(null, false);
        bVar.j(CvValidationLink.b.a.f131798b);
        return G0.f406611a;
    }
}

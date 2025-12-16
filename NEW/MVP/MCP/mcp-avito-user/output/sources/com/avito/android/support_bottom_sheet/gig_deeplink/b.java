package com.avito.android.support_bottom_sheet.gig_deeplink;

import Ju.AbstractC14250d;
import Y41.l;
import Y41.p;
import Y61.k;
import aH.C19773a;
import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.error.z;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.support_bottom_sheet.GigSupportDialogDeeplink;
import com.avito.android.support_bottom_sheet.gig_deeplink.a;
import java.io.Serializable;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: GigSupportDialogDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.support_bottom_sheet.gig_deeplink.GigSupportDialogDeeplinkHandler$doHandle$1", f = "GigSupportDialogDeeplinkHandler.kt", i = {}, l = {46, 47}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f292444q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.support_bottom_sheet.gig_deeplink.a f292445r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ GigSupportDialogDeeplink f292446s;

    /* compiled from: GigSupportDialogDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.support_bottom_sheet.gig_deeplink.GigSupportDialogDeeplinkHandler$doHandle$1$1", f = "GigSupportDialogDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.support_bottom_sheet.gig_deeplink.a f292447q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ TypedResult<C19773a> f292448r;

        /* compiled from: GigSupportDialogDeeplinkHandler.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LaH/a;", "successResult", "Lkotlin/G0;", "invoke", "(LaH/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.support_bottom_sheet.gig_deeplink.b$a$a, reason: collision with other inner class name */
        public static final class C8873a extends N implements l<C19773a, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.support_bottom_sheet.gig_deeplink.a f292449l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8873a(com.avito.android.support_bottom_sheet.gig_deeplink.a aVar) {
                super(1);
                this.f292449l = aVar;
            }

            @Override // Y41.l
            public final G0 invoke(C19773a c19773a) {
                DeepLink deeplink = c19773a.getDeeplink();
                if (deeplink != null) {
                    a.C8872a c8872a = a.C8872a.f292443b;
                    com.avito.android.support_bottom_sheet.gig_deeplink.a aVar = this.f292449l;
                    aVar.i(c8872a, aVar.f292438i, deeplink);
                }
                return G0.f406611a;
            }
        }

        /* compiled from: GigSupportDialogDeeplinkHandler.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.support_bottom_sheet.gig_deeplink.b$a$b, reason: collision with other inner class name */
        public static final class C8874b extends N implements l<String, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.support_bottom_sheet.gig_deeplink.a f292450l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8874b(com.avito.android.support_bottom_sheet.gig_deeplink.a aVar) {
                super(1);
                this.f292450l = aVar;
            }

            @Override // Y41.l
            public final G0 invoke(String str) {
                com.avito.android.support_bottom_sheet.gig_deeplink.a aVar = this.f292450l;
                a.i.C4057a.d(aVar.f292441l, com.avito.android.printable_text.b.c(R.string.open_chat_error, new Serializable[0]), null, null, new f.c(new IllegalStateException("1/gigger/support error")), 0, null, null, null, 2030);
                aVar.j(AbstractC14250d.c.f9171c);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.support_bottom_sheet.gig_deeplink.a aVar, TypedResult<C19773a> typedResult, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f292447q = aVar;
            this.f292448r = typedResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return new a(this.f292447q, this.f292448r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            com.avito.android.support_bottom_sheet.gig_deeplink.a aVar = this.f292447q;
            aVar.f292439j.g(null, false);
            z.o(this.f292448r, new C8873a(aVar), new C8874b(aVar), null, 60);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.avito.android.support_bottom_sheet.gig_deeplink.a aVar, GigSupportDialogDeeplink gigSupportDialogDeeplink, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f292445r = aVar;
        this.f292446s = gigSupportDialogDeeplink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        return new b(this.f292445r, this.f292446s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f292444q;
        com.avito.android.support_bottom_sheet.gig_deeplink.a aVar = this.f292445r;
        if (i12 == 0) {
            C42729a0.b(obj);
            String strA = aVar.f292437h.a();
            GigSupportDialogDeeplink gigSupportDialogDeeplink = this.f292446s;
            String str = gigSupportDialogDeeplink.f292386c;
            this.f292444q = 1;
            obj = aVar.f292436g.a(strA, str, gigSupportDialogDeeplink.f292391h, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            C42729a0.b(obj);
        }
        AbstractC43129d1 abstractC43129d1B = aVar.f292440k.b();
        a aVar2 = new a(aVar, (TypedResult) obj, null);
        this.f292444q = 2;
        if (C43259k.g(abstractC43129d1B, aVar2, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}

package com.avito.android.work_profile.profile.about_me.mvi;

import Y41.p;
import com.avito.android.work_profile.profile.about_me.mvi.entity.AboutMeInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.Set;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AboutMeBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/work_profile/profile/about_me/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/work_profile/profile/about_me/mvi/entity/AboutMeInternalAction;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements com.avito.android.arch.mvi.b<AboutMeInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.work_profile.domain.j f330791a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Set<String> f330792b;

    /* compiled from: AboutMeBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/work_profile/profile/about_me/mvi/entity/AboutMeInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.work_profile.profile.about_me.mvi.AboutMeBootstrap$produce$1", f = "AboutMeBootstrap.kt", i = {0, 1}, l = {20, 22, AvailableCode.USER_IGNORE_PREVIOUS_POPUP, 33}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super AboutMeInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f330793q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f330794r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = d.this.new a(continuation);
            aVar.f330794r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AboutMeInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f330793q
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L32
                if (r1 == r5) goto L2a
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                kotlin.C42729a0.b(r7)
                goto La0
            L22:
                java.lang.Object r1 = r6.f330794r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L5f
            L2a:
                java.lang.Object r1 = r6.f330794r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L4a
            L32:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f330794r
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
                com.avito.android.work_profile.profile.about_me.mvi.entity.AboutMeInternalAction$StartLoading r1 = new com.avito.android.work_profile.profile.about_me.mvi.entity.AboutMeInternalAction$StartLoading
                r1.<init>()
                r6.f330794r = r7
                r6.f330793q = r5
                java.lang.Object r1 = r7.emit(r1, r6)
                if (r1 != r0) goto L49
                return r0
            L49:
                r1 = r7
            L4a:
                com.avito.android.work_profile.profile.about_me.mvi.d r7 = com.avito.android.work_profile.profile.about_me.mvi.d.this
                com.avito.android.work_profile.domain.j r5 = r7.f330791a
                java.util.Set<java.lang.String> r7 = r7.f330792b
                java.lang.String r7 = ZS.d.a(r7)
                r6.f330794r = r1
                r6.f330793q = r4
                java.lang.Object r7 = r5.b(r7, r6)
                if (r7 != r0) goto L5f
                return r0
            L5f:
                com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
                boolean r4 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto L86
                com.avito.android.work_profile.profile.about_me.mvi.entity.AboutMeInternalAction$ContentLoaded r2 = new com.avito.android.work_profile.profile.about_me.mvi.entity.AboutMeInternalAction$ContentLoaded
                com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
                java.lang.Object r7 = r7.getResult()
                com.avito.android.work_profile.api.about_me.AboutMeResponse r7 = (com.avito.android.work_profile.api.about_me.AboutMeResponse) r7
                com.google.gson.k r7 = r7.getForm()
                java.lang.String r7 = r7.toString()
                r2.<init>(r7)
                r6.f330794r = r5
                r6.f330793q = r3
                java.lang.Object r7 = r1.emit(r2, r6)
                if (r7 != r0) goto La0
                return r0
            L86:
                boolean r3 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto La0
                com.avito.android.work_profile.profile.about_me.mvi.entity.AboutMeInternalAction$Error r3 = new com.avito.android.work_profile.profile.about_me.mvi.entity.AboutMeInternalAction$Error
                com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
                com.avito.android.remote.error.ApiError r7 = r7.getError()
                r3.<init>(r7)
                r6.f330794r = r5
                r6.f330793q = r2
                java.lang.Object r7 = r1.emit(r3, r6)
                if (r7 != r0) goto La0
                return r0
            La0:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.work_profile.profile.about_me.mvi.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public d(@Y61.k com.avito.android.work_profile.domain.j jVar, @Y61.k Set<String> set) {
        this.f330791a = jVar;
        this.f330792b = set;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<AboutMeInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}

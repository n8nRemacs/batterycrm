package com.avito.android.extended_profile.search;

import com.avito.android.extended_profile.di.r;
import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import com.avito.android.extended_profile.mvi.entity.a;
import com.avito.android.remote.N;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileClosedAdvertsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/search/b;", "Lcom/avito/android/extended_profile/search/a;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.extended_profile.search.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f150470a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SearchParams f150471b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SearchParamsConverter f150472c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final h31.e<N> f150473d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile.converter.a f150474e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final R0 f150475f;

    /* compiled from: ExtendedProfileClosedAdvertsInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile.search.ExtendedProfileClosedAdvertsInteractorImpl$loadAdverts$1", f = "ExtendedProfileClosedAdvertsInteractor.kt", i = {0, 1}, l = {38, 44, 75}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f150476q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f150477r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ a.b f150478s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ b f150479t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a.b bVar, b bVar2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f150478s = bVar;
            this.f150479t = bVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f150478s, this.f150479t, continuation);
            aVar.f150477r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00db A[LOOP:1: B:34:0x00d5->B:36:0x00db, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x013d A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 321
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile.search.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ExtendedProfileClosedAdvertsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile.search.ExtendedProfileClosedAdvertsInteractorImpl$loadAdverts$2", f = "ExtendedProfileClosedAdvertsInteractor.kt", i = {0, 0}, l = {77, 82}, m = "invokeSuspend", n = {"$this$catch", "it"}, s = {"L$0", "L$1"})
    /* renamed from: com.avito.android.extended_profile.search.b$b, reason: collision with other inner class name */
    public static final class C4400b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super ExtendedProfileInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f150480q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f150481r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f150482s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a.b f150483t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4400b(a.b bVar, Continuation<? super C4400b> continuation) {
            super(3, continuation);
            this.f150483t = bVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            C4400b c4400b = new C4400b(this.f150483t, continuation);
            c4400b.f150481r = interfaceC43172j;
            c4400b.f150482s = th2;
            return c4400b.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Throwable th2;
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f150480q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j2 = this.f150481r;
                th2 = this.f150482s;
                a.b bVar = this.f150483t;
                ExtendedProfileInternalAction.UpdateClosedAdvertsSearchState updateClosedAdvertsSearchState = new ExtendedProfileInternalAction.UpdateClosedAdvertsSearchState(a.b.a(bVar, null, false, false, bVar.f150271a.isEmpty(), 491));
                this.f150481r = interfaceC43172j2;
                this.f150482s = th2;
                this.f150480q = 1;
                if (interfaceC43172j2.emit(updateClosedAdvertsSearchState, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC43172j = interfaceC43172j2;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                th2 = this.f150482s;
                interfaceC43172j = this.f150481r;
                C42729a0.b(obj);
            }
            Throwable cause = th2.getCause();
            if (cause != null) {
                th2 = cause;
            }
            ExtendedProfileInternalAction.ShowCommonErrorToastBar showCommonErrorToastBar = new ExtendedProfileInternalAction.ShowCommonErrorToastBar(th2);
            this.f150481r = null;
            this.f150482s = null;
            this.f150480q = 2;
            if (interfaceC43172j.emit(showCommonErrorToastBar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public b(@r.h @Y61.k String str, @r.g @Y61.k SearchParams searchParams, @Y61.k SearchParamsConverter searchParamsConverter, @Y61.k h31.e<N> eVar, @Y61.k com.avito.android.extended_profile.converter.a aVar, @Y61.k R0 r02) {
        this.f150470a = str;
        this.f150471b = searchParams;
        this.f150472c = searchParamsConverter;
        this.f150473d = eVar;
        this.f150474e = aVar;
        this.f150475f = r02;
    }

    @Override // com.avito.android.extended_profile.search.a
    @Y61.k
    public final InterfaceC43160i<ExtendedProfileInternalAction> a(@Y61.k a.b bVar) {
        return C43175k.I(this.f150475f.a(), new C43152f0(C43175k.G(new a(bVar, this, null)), new C4400b(bVar, null)));
    }
}

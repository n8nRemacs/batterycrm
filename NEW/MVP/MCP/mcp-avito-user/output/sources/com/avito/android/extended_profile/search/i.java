package com.avito.android.extended_profile.search;

import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import com.avito.android.extended_profile.mvi.entity.a;
import com.avito.android.remote.model.ExtendedProfileSearchResult;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileSearchInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile.search.ExtendedProfileSearchInteractorImpl$searchAdverts$1", f = "ExtendedProfileSearchInteractor.kt", i = {0, 1, 2, 3, 3, 3, 3}, l = {83, 89, 95, 143, 152}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "result", "searchParams", "newSearchState"}, s = {"L$0", "L$0", "L$0", "L$0", "L$3", "L$4", "L$5"})
/* loaded from: classes13.dex */
final class i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public k f150501q;

    /* renamed from: r, reason: collision with root package name */
    public a.C4397a f150502r;

    /* renamed from: s, reason: collision with root package name */
    public ExtendedProfileSearchResult f150503s;

    /* renamed from: t, reason: collision with root package name */
    public l0.h f150504t;

    /* renamed from: u, reason: collision with root package name */
    public a.C4397a f150505u;

    /* renamed from: v, reason: collision with root package name */
    public int f150506v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f150507w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a.C4397a f150508x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f150509y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ boolean f150510z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(a.C4397a c4397a, k kVar, boolean z12, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f150508x = c4397a;
        this.f150509y = kVar;
        this.f150510z = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        i iVar = new i(this.f150508x, this.f150509y, this.f150510z, continuation);
        iVar.f150507w = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x037e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0360  */
    /* JADX WARN: Type inference failed for: r0v30, types: [T, com.avito.android.remote.model.SearchParams] */
    /* JADX WARN: Type inference failed for: r4v13, types: [T, com.avito.android.remote.model.SearchParams] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r64) throws com.avito.android.util.ApiException {
        /*
            Method dump skipped, instructions count: 981
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile.search.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package com.avito.android.vas_performance.screens.stickers.edit.mvi.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.R0;
import com.avito.android.vas_performance.screens.stickers.edit.mvi.entity.StickersEditInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.Set;
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
import zL0.InterfaceC50482a;

/* compiled from: PostSaveStickersUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/domain/c;", "", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC50482a f320791a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f320792b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f320793c;

    /* compiled from: PostSaveStickersUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.vas_performance.screens.stickers.edit.mvi.domain.PostSaveStickersUseCase$invoke$1", f = "PostSaveStickersUseCase.kt", i = {0, 1, 2, 3}, l = {23, AvailableCode.USER_IGNORE_PREVIOUS_POPUP, 30, 32, 34}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super StickersEditInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f320794q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f320795r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Set<String> f320796s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ c f320797t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ DeepLink f320798u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Set<String> set, c cVar, DeepLink deepLink, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f320796s = set;
            this.f320797t = cVar;
            this.f320798u = deepLink;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f320796s, this.f320797t, this.f320798u, continuation);
            aVar.f320795r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StickersEditInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00d4 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 222
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.vas_performance.screens.stickers.edit.mvi.domain.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public c(@k R0 r02, @com.avito.android.vas_performance.screens.stickers.edit.di.c @k String str, @k InterfaceC50482a interfaceC50482a) {
        this.f320791a = interfaceC50482a;
        this.f320792b = r02;
        this.f320793c = str;
    }

    @k
    public final InterfaceC43160i a(@l DeepLink deepLink, @k Set set) {
        return C43175k.I(this.f320792b.a(), C43175k.G(new a(set, this, deepLink, null)));
    }
}

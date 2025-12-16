package com.avito.android.user_adverts.tab_screens.adverts.dataProvider;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.personal_banner.feature.domain.model.BannerContext;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements InterfaceC43160i<BannerContext> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f314934b;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f314935b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.dataProvider.UserAdvertsListBannerContextInfoProviderKt$mapToBannerContext$$inlined$map$1$2", f = "UserAdvertsListBannerContextInfoProvider.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.dataProvider.c$a$a, reason: collision with other inner class name */
        public static final class C9740a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f314936q;

            /* renamed from: r, reason: collision with root package name */
            public int f314937r;

            public C9740a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                this.f314936q = obj;
                this.f314937r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j) {
            this.f314935b = interfaceC43172j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r2v1, types: [com.avito.android.personal_banner.feature.domain.model.BannerContext$Info] */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r6, @Y61.k kotlin.coroutines.Continuation r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.avito.android.user_adverts.tab_screens.adverts.dataProvider.c.a.C9740a
                if (r0 == 0) goto L13
                r0 = r7
                com.avito.android.user_adverts.tab_screens.adverts.dataProvider.c$a$a r0 = (com.avito.android.user_adverts.tab_screens.adverts.dataProvider.c.a.C9740a) r0
                int r1 = r0.f314937r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f314937r = r1
                goto L18
            L13:
                com.avito.android.user_adverts.tab_screens.adverts.dataProvider.c$a$a r0 = new com.avito.android.user_adverts.tab_screens.adverts.dataProvider.c$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f314936q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f314937r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r7)
                goto L68
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.C42729a0.b(r7)
                com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState r6 = (com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState) r6
                com.avito.android.user_adverts.tab_screens.UserAdvertsListParams r7 = r6.f315399q
                if (r7 != 0) goto L3d
                com.avito.android.personal_banner.feature.domain.model.BannerContext$None r6 = com.avito.android.personal_banner.feature.domain.model.BannerContext.None.f215597b
                goto L5d
            L3d:
                boolean r7 = com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.a.a(r6)
                if (r7 == 0) goto L5b
                com.avito.android.user_adverts.tab_screens.UserAdvertsListParams r6 = r6.f315399q
                com.avito.android.user_adverts.tab_screens.UserAdvertsListParams$UserInfo r7 = r6.f314697c
                com.avito.android.user_adverts.space.UserAdvertsSpace r7 = r7.f314714b
                java.lang.String r7 = r7.f314193b
                int r6 = r6.hashCode()
                java.lang.String r6 = java.lang.String.valueOf(r6)
                com.avito.android.personal_banner.feature.domain.model.BannerContext$Info r2 = new com.avito.android.personal_banner.feature.domain.model.BannerContext$Info
                r4 = 0
                r2.<init>(r7, r4, r6)
                r6 = r2
                goto L5d
            L5b:
                com.avito.android.personal_banner.feature.domain.model.BannerContext$None r6 = com.avito.android.personal_banner.feature.domain.model.BannerContext.None.f215597b
            L5d:
                r0.f314937r = r3
                kotlinx.coroutines.flow.j r7 = r5.f314935b
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L68
                return r1
            L68:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_screens.adverts.dataProvider.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public c(InterfaceC43160i interfaceC43160i) {
        this.f314934b = interfaceC43160i;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @l
    public final Object collect(@k InterfaceC43172j<? super BannerContext> interfaceC43172j, @k Continuation continuation) {
        Object objCollect = this.f314934b.collect(new a(interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}

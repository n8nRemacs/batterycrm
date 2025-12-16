package com.avito.android.user_adverts.tab_screens.adverts;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.user_adverts.tab_screens.adverts.C35662a;
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
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_adverts.tab_screens.adverts.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35666e implements InterfaceC43160i<C35662a.C9735a> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f315146b;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.e$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f315147b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.UserAdvertListViewBinder$bindItems$$inlined$filter$1$2", f = "UserAdvertListViewBinder.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.e$a$a, reason: collision with other inner class name */
        public static final class C9746a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f315148q;

            /* renamed from: r, reason: collision with root package name */
            public int f315149r;

            public C9746a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f315148q = obj;
                this.f315149r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j) {
            this.f315147b = interfaceC43172j;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r7, @Y61.k kotlin.coroutines.Continuation r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.avito.android.user_adverts.tab_screens.adverts.C35666e.a.C9746a
                if (r0 == 0) goto L13
                r0 = r8
                com.avito.android.user_adverts.tab_screens.adverts.e$a$a r0 = (com.avito.android.user_adverts.tab_screens.adverts.C35666e.a.C9746a) r0
                int r1 = r0.f315149r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f315149r = r1
                goto L18
            L13:
                com.avito.android.user_adverts.tab_screens.adverts.e$a$a r0 = new com.avito.android.user_adverts.tab_screens.adverts.e$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f315148q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f315149r
                r3 = 1
                if (r2 == 0) goto L32
                if (r2 != r3) goto L2a
                kotlin.C42729a0.b(r8)
                goto L81
            L2a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L32:
                kotlin.C42729a0.b(r8)
                r8 = r7
                com.avito.android.user_adverts.tab_screens.adverts.a$a r8 = (com.avito.android.user_adverts.tab_screens.adverts.C35662a.C9735a) r8
                com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState r2 = r8.f314909a
                com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState$DataState r2 = r2.f315396n
                boolean r4 = r2 instanceof com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState.DataState.None
                r5 = 0
                if (r4 == 0) goto L42
                goto L74
            L42:
                boolean r4 = r2 instanceof com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState.DataState.Loading
                if (r4 == 0) goto L48
                r4 = r3
                goto L4a
            L48:
                boolean r4 = r2 instanceof com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState.DataState.Error
            L4a:
                if (r4 == 0) goto L4e
            L4c:
                r5 = r3
                goto L74
            L4e:
                boolean r2 = r2 instanceof com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState.DataState.Loaded
                if (r2 == 0) goto L84
                com.avito.android.personal_banner.feature.mvi.entity.BannerState r2 = r8.f314911c
                com.avito.android.personal_banner.feature.mvi.entity.BannerState$BannerData r2 = r2.f215641e
                boolean r4 = r2 instanceof com.avito.android.personal_banner.feature.mvi.entity.BannerState.BannerData.Content
                if (r4 == 0) goto L62
                com.avito.android.lib.beduin_v2.beduin_item.a r8 = r8.f314910b
                boolean r8 = r8 instanceof com.avito.android.lib.beduin_v2.beduin_item.a.C5176a
                if (r8 == 0) goto L62
                r8 = r3
                goto L63
            L62:
                r8 = r5
            L63:
                boolean r4 = r2 instanceof com.avito.android.personal_banner.feature.mvi.entity.BannerState.BannerData.Empty
                if (r4 != 0) goto L6e
                boolean r2 = r2 instanceof com.avito.android.personal_banner.feature.mvi.entity.BannerState.BannerData.Error
                if (r2 == 0) goto L6c
                goto L6e
            L6c:
                r2 = r5
                goto L6f
            L6e:
                r2 = r3
            L6f:
                if (r8 != 0) goto L4c
                if (r2 == 0) goto L74
                goto L4c
            L74:
                if (r5 == 0) goto L81
                r0.f315149r = r3
                kotlinx.coroutines.flow.j r8 = r6.f315147b
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L81
                return r1
            L81:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            L84:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_screens.adverts.C35666e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public C35666e(InterfaceC43160i interfaceC43160i) {
        this.f315146b = interfaceC43160i;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super C35662a.C9735a> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f315146b.collect(new a(interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}

package com.avito.android.user_adverts.tab_screens.adverts;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.List;
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
/* renamed from: com.avito.android.user_adverts.tab_screens.adverts.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35667f implements InterfaceC43160i<List<? extends TV0.a>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C35666e f315151b;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.f$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f315152b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.UserAdvertListViewBinder$bindItems$$inlined$map$1$2", f = "UserAdvertListViewBinder.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.f$a$a, reason: collision with other inner class name */
        public static final class C9747a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f315153q;

            /* renamed from: r, reason: collision with root package name */
            public int f315154r;

            public C9747a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f315153q = obj;
                this.f315154r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j) {
            this.f315152b = interfaceC43172j;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r10, @Y61.k kotlin.coroutines.Continuation r11) {
            /*
                r9 = this;
                boolean r0 = r11 instanceof com.avito.android.user_adverts.tab_screens.adverts.C35667f.a.C9747a
                if (r0 == 0) goto L13
                r0 = r11
                com.avito.android.user_adverts.tab_screens.adverts.f$a$a r0 = (com.avito.android.user_adverts.tab_screens.adverts.C35667f.a.C9747a) r0
                int r1 = r0.f315154r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f315154r = r1
                goto L18
            L13:
                com.avito.android.user_adverts.tab_screens.adverts.f$a$a r0 = new com.avito.android.user_adverts.tab_screens.adverts.f$a$a
                r0.<init>(r11)
            L18:
                java.lang.Object r11 = r0.f315153q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f315154r
                r3 = 1
                if (r2 == 0) goto L32
                if (r2 != r3) goto L2a
                kotlin.C42729a0.b(r11)
                goto Lad
            L2a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L32:
                kotlin.C42729a0.b(r11)
                com.avito.android.user_adverts.tab_screens.adverts.a$a r10 = (com.avito.android.user_adverts.tab_screens.adverts.C35662a.C9735a) r10
                com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState r11 = r10.f314909a
                com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState$DataState r2 = r11.f315396n
                boolean r2 = r2 instanceof com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState.DataState.Loaded
                com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState$ViewState r4 = r11.f315398p
                if (r2 == 0) goto La0
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                com.avito.android.lib.beduin_v2.beduin_item.a r5 = r10.f314910b
                boolean r6 = r5 instanceof com.avito.android.lib.beduin_v2.beduin_item.a.C5176a
                r7 = 0
                if (r6 == 0) goto L72
                com.avito.android.personal_banner.feature.mvi.entity.BannerState r6 = r10.f314911c
                com.avito.android.personal_banner.feature.mvi.entity.BannerState$BannerData r6 = r6.f215641e
                boolean r8 = r6 instanceof com.avito.android.personal_banner.feature.mvi.entity.BannerState.BannerData.Content
                if (r8 == 0) goto L72
                com.avito.android.personal_banner.feature.mvi.entity.BannerState$BannerData$Content r6 = (com.avito.android.personal_banner.feature.mvi.entity.BannerState.BannerData.Content) r6
                com.avito.android.lib.beduin_v2.beduin_item.a$a r5 = (com.avito.android.lib.beduin_v2.beduin_item.a.C5176a) r5
                com.avito.beduin.v2.avito.component.items_controller.i$a r5 = r5.f175437a
                com.avito.beduin.v2.engine.component.i r5 = r5.f334562a
                java.lang.Object r5 = r5.getState()
                com.avito.beduin.v2.avito.component.items_controller.h r5 = (com.avito.beduin.v2.avito.component.items_controller.h) r5
                java.util.Map r5 = r5.getItems()
                com.avito.android.lib.beduin_v2.beduin_item.stateless.a r6 = r6.f215645e
                java.lang.String r8 = r6.f175461b
                boolean r5 = r5.containsKey(r8)
                if (r5 == 0) goto L72
                goto L73
            L72:
                r6 = r7
            L73:
                if (r6 == 0) goto L78
                r2.add(r6)
            L78:
                com.avito.android.user_adverts.tab_screens.adverts.a$a$a r5 = com.avito.android.user_adverts.tab_screens.adverts.C35662a.C9735a.f314908e
                r5.getClass()
                java.util.List<com.avito.conveyor_item.a> r4 = r4.f315417b
                com.avito.android.personal_selections.mvi.entity.PersonalSelectionsItemState r10 = r10.f314912d
                if (r10 == 0) goto L85
                com.avito.android.personal_selections.view.PersonalSelectionsItem r7 = r10.f215818b
            L85:
                if (r7 == 0) goto L9a
                boolean r11 = com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.a.a(r11)
                if (r11 == 0) goto L9a
                com.avito.android.personal_selections.view.PersonalSelectionsItem r10 = r10.f215818b
                if (r10 == 0) goto L94
                r2.add(r10)
            L94:
                java.util.Collection r4 = (java.util.Collection) r4
                r2.addAll(r4)
                goto La2
            L9a:
                java.util.Collection r4 = (java.util.Collection) r4
                r2.addAll(r4)
                goto La2
            La0:
                java.util.List<com.avito.conveyor_item.a> r2 = r4.f315417b
            La2:
                r0.f315154r = r3
                kotlinx.coroutines.flow.j r10 = r9.f315152b
                java.lang.Object r10 = r10.emit(r2, r0)
                if (r10 != r1) goto Lad
                return r1
            Lad:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_screens.adverts.C35667f.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public C35667f(C35666e c35666e) {
        this.f315151b = c35666e;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super List<? extends TV0.a>> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f315151b.collect(new a(interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}

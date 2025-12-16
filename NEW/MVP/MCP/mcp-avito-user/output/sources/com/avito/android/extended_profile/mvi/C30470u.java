package com.avito.android.extended_profile.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;

/* compiled from: SafeCollector.common.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.extended_profile.mvi.u, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30470u implements InterfaceC43160i<ExtendedProfileInternalAction> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f150394b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C30451a f150395c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.a f150396d;

    /* compiled from: Emitters.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.extended_profile.mvi.u$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f150397b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C30451a f150398c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.a f150399d;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.extended_profile.mvi.ExtendedProfileActor$viewedAdvertsFlow$$inlined$map$1$2", f = "ExtendedProfileActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.extended_profile.mvi.u$a$a, reason: collision with other inner class name */
        public static final class C4399a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f150400q;

            /* renamed from: r, reason: collision with root package name */
            public int f150401r;

            public C4399a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f150400q = obj;
                this.f150401r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, C30451a c30451a, Y41.a aVar) {
            this.f150397b = interfaceC43172j;
            this.f150398c = c30451a;
            this.f150399d = aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r9, @Y61.k kotlin.coroutines.Continuation r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof com.avito.android.extended_profile.mvi.C30470u.a.C4399a
                if (r0 == 0) goto L13
                r0 = r10
                com.avito.android.extended_profile.mvi.u$a$a r0 = (com.avito.android.extended_profile.mvi.C30470u.a.C4399a) r0
                int r1 = r0.f150401r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f150401r = r1
                goto L18
            L13:
                com.avito.android.extended_profile.mvi.u$a$a r0 = new com.avito.android.extended_profile.mvi.u$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f150400q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f150401r
                r3 = 1
                if (r2 == 0) goto L32
                if (r2 != r3) goto L2a
                kotlin.C42729a0.b(r10)
                goto Lc1
            L2a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L32:
                kotlin.C42729a0.b(r10)
                java.lang.String r9 = (java.lang.String) r9
                Y41.a r10 = r8.f150399d
                java.lang.Object r10 = r10.invoke()
                com.avito.android.extended_profile.mvi.entity.a r10 = (com.avito.android.extended_profile.mvi.entity.a) r10
                com.avito.android.extended_profile.mvi.a r2 = r8.f150398c
                r2.getClass()
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                com.avito.android.extended_profile.data.b r10 = r10.f150240b
                if (r10 == 0) goto Lb1
                java.util.List r10 = r10.b()
                if (r10 == 0) goto Lb1
                java.lang.Iterable r10 = (java.lang.Iterable) r10
                java.util.Iterator r10 = r10.iterator()
            L59:
                boolean r4 = r10.hasNext()
                if (r4 == 0) goto Lb1
                java.lang.Object r4 = r10.next()
                QH.a r4 = (QH.a) r4
                boolean r5 = r4 instanceof com.avito.android.extended_profile_widgets.adapter.search.search_advert.SearchAdvertItem
                if (r5 == 0) goto L7d
                r5 = r4
                com.avito.android.extended_profile_widgets.adapter.search.search_advert.SearchAdvertItem r5 = (com.avito.android.extended_profile_widgets.adapter.search.search_advert.SearchAdvertItem) r5
                com.avito.android.serp.adapter.AdvertItem r6 = r5.f154691d
                java.lang.String r6 = r6.f268425c
                boolean r6 = kotlin.jvm.internal.L.f(r6, r9)
                if (r6 == 0) goto L7d
                com.avito.android.serp.adapter.AdvertItem r5 = r5.f154691d
                r5.f268394N = r3
                r2.add(r9)
            L7d:
                boolean r5 = r4 instanceof com.avito.android.extended_profile_widgets.adapter.carousel.CarouselItem
                if (r5 == 0) goto L59
                r5 = r4
                com.avito.android.extended_profile_widgets.adapter.carousel.CarouselItem r5 = (com.avito.android.extended_profile_widgets.adapter.carousel.CarouselItem) r5
                java.util.List<com.avito.android.serp.adapter.AdvertItem> r5 = r5.f154286e
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.Iterator r5 = r5.iterator()
            L8c:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto La2
                java.lang.Object r6 = r5.next()
                r7 = r6
                com.avito.android.serp.adapter.AdvertItem r7 = (com.avito.android.serp.adapter.AdvertItem) r7
                java.lang.String r7 = r7.f268425c
                boolean r7 = kotlin.jvm.internal.L.f(r7, r9)
                if (r7 == 0) goto L8c
                goto La3
            La2:
                r6 = 0
            La3:
                com.avito.android.serp.adapter.AdvertItem r6 = (com.avito.android.serp.adapter.AdvertItem) r6
                if (r6 == 0) goto L59
                r6.f268394N = r3
                com.avito.android.extended_profile_widgets.adapter.carousel.CarouselItem r4 = (com.avito.android.extended_profile_widgets.adapter.carousel.CarouselItem) r4
                java.lang.String r4 = r4.f154283b
                r2.add(r4)
                goto L59
            Lb1:
                com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction$NotifyItemsChanged r9 = new com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction$NotifyItemsChanged
                r9.<init>(r2)
                r0.f150401r = r3
                kotlinx.coroutines.flow.j r10 = r8.f150397b
                java.lang.Object r9 = r10.emit(r9, r0)
                if (r9 != r1) goto Lc1
                return r1
            Lc1:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile.mvi.C30470u.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public C30470u(InterfaceC43160i interfaceC43160i, C30451a c30451a, Y41.a aVar) {
        this.f150394b = interfaceC43160i;
        this.f150395c = c30451a;
        this.f150396d = aVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super ExtendedProfileInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = ((AbstractC43168f) this.f150394b).collect(new a(interfaceC43172j, this.f150395c, this.f150396d), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}

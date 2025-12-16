package com.avito.android.advert.item.similars;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.InterfaceC32897n0;
import com.avito.android.InterfaceC34162r0;
import com.avito.android.advert.item.AdvertDetailsFastOpenParams;
import com.avito.android.advert.item.C28131g1;
import com.avito.android.advert.item.I1;
import com.avito.android.advert.item.similars.m;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.analytics.AdvertDetailsStyleAnalytics;
import com.avito.android.advert_core.analytics.recomendations.ExpandableTitleClickEvent;
import com.avito.android.advert_core.gap.AdvertDetailsGapItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.recommended_sellers.RecommendedSeller;
import com.avito.android.remote.model.recommended_sellers.RecommendedSellerElement;
import com.avito.android.remote.model.recommended_sellers.RecommendedSellersCarousel;
import com.avito.android.remote.model.section.SectionTypeElement;
import com.avito.android.section.RedesignUnitedSectionTypeItem;
import com.avito.android.section.SectionElementData;
import com.avito.android.section.SectionItemConverter;
import com.avito.android.section.chips.SectionChip;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import com.avito.android.serp.adapter.recomendations.ExpandableSectionItem;
import com.avito.android.util.Kundle;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.flow.p2;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: AdvertAsyncComplementaryPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/similars/c;", "Lcom/avito/android/advert/item/similars/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements com.avito.android.advert.item.similars.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final n f80212a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.recomendations.j f80213b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SectionItemConverter f80214c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.analytics.a f80215d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final AdvertDetailsFastOpenParams f80216e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final A7.b f80217f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34162r0 f80218g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C43238h f80219h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final e2 f80220i;

    /* renamed from: j, reason: collision with root package name */
    public final int f80221j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public AdvertDetails f80222k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public I1 f80223l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public ArrayList f80224m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public SectionItemConverter.Params f80225n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final HashMap<String, N0> f80226o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final HashMap<String, N0> f80227p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final HashMap<String, m.a> f80228q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final e2 f80229r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final Z1<m> f80230s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final AdvertDetailsGapItem f80231t;

    /* compiled from: AdvertAsyncComplementaryPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.similars.AdvertAsyncComplementaryPresenterImpl$dismissComplementaryBottomSheet$1", f = "AdvertAsyncComplementaryPresenter.kt", i = {}, l = {304}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f80232q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return c.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f80232q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Z1<m> z12 = c.this.f80230s;
                this.f80232q = 1;
                if (z12.emit(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertAsyncComplementaryPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.similars.AdvertAsyncComplementaryPresenterImpl$invalidateComplementaryItems$1", f = "AdvertAsyncComplementaryPresenter.kt", i = {0}, l = {335, 342, 347}, m = "invokeSuspend", n = {"sections"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Object f80234q;

        /* renamed from: r, reason: collision with root package name */
        public c f80235r;

        /* renamed from: s, reason: collision with root package name */
        public c f80236s;

        /* renamed from: t, reason: collision with root package name */
        public int f80237t;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return c.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00a7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c1 A[LOOP:0: B:32:0x00bb->B:34:0x00c1, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00e4 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 232
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.similars.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: AdvertAsyncComplementaryPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.similars.AdvertAsyncComplementaryPresenterImpl$loadComplementarySection$1", f = "AdvertAsyncComplementaryPresenter.kt", i = {0}, l = {153, 166, 175, 186}, m = "invokeSuspend", n = {"currentSectionData"}, s = {"L$0"})
    /* renamed from: com.avito.android.advert.item.similars.c$c, reason: collision with other inner class name */
    public static final class C2372c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Object f80239q;

        /* renamed from: r, reason: collision with root package name */
        public String f80240r;

        /* renamed from: s, reason: collision with root package name */
        public int f80241s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f80243u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2372c(String str, Continuation<? super C2372c> continuation) {
            super(2, continuation);
            this.f80243u = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return c.this.new C2372c(this.f80243u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C2372c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:54:0x011a A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #4 {all -> 0x0028, blocks: (B:9:0x0023, B:16:0x003a, B:52:0x0112, B:54:0x011a, B:58:0x013a, B:59:0x0141), top: B:93:0x0012 }] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x013a A[Catch: all -> 0x0028, TRY_ENTER, TryCatch #4 {all -> 0x0028, blocks: (B:9:0x0023, B:16:0x003a, B:52:0x0112, B:54:0x011a, B:58:0x013a, B:59:0x0141), top: B:93:0x0012 }] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0162  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0165  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 383
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.similars.c.C2372c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: AdvertAsyncComplementaryPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.similars.AdvertAsyncComplementaryPresenterImpl$onActionClick$1", f = "AdvertAsyncComplementaryPresenter.kt", i = {}, l = {230}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f80244q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ RedesignUnitedSectionTypeItem f80246s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f80247t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(RedesignUnitedSectionTypeItem redesignUnitedSectionTypeItem, String str, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f80246s = redesignUnitedSectionTypeItem;
            this.f80247t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return c.this.new d(this.f80246s, this.f80247t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f80244q;
            if (i12 == 0) {
                C42729a0.b(obj);
                c cVar = c.this;
                Z1<m> z12 = cVar.f80230s;
                RedesignUnitedSectionTypeItem redesignUnitedSectionTypeItem = this.f80246s;
                ArrayList arrayListD = cVar.f80214c.d(redesignUnitedSectionTypeItem.f264594b, redesignUnitedSectionTypeItem.f264595c);
                HashMap<String, m.a> map = cVar.f80228q;
                String str = this.f80247t;
                m.a aVar = map.get(str);
                if (aVar == null) {
                    aVar = m.a.b.f80307a;
                    c.s(cVar, str);
                    G0 g02 = G0.f406611a;
                }
                m mVar = new m(arrayListD, aVar);
                this.f80244q = 1;
                if (z12.emit(mVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertAsyncComplementaryPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.similars.AdvertAsyncComplementaryPresenterImpl$onAdvertLoaded$1", f = "AdvertAsyncComplementaryPresenter.kt", i = {}, l = {284}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public ArrayList f80248q;

        /* renamed from: r, reason: collision with root package name */
        public int f80249r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ AdvertDetails f80251t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AdvertDetails advertDetails, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f80251t = advertDetails;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return c.this.new e(this.f80251t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
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
                int r1 = r6.f80249r
                r2 = 0
                r3 = 1
                com.avito.android.remote.model.AdvertDetails r4 = r6.f80251t
                com.avito.android.advert.item.similars.c r5 = com.avito.android.advert.item.similars.c.this
                if (r1 == 0) goto L1e
                if (r1 != r3) goto L16
                java.util.ArrayList r0 = r6.f80248q
                kotlin.C42729a0.b(r7)
                goto L3a
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                kotlin.C42729a0.b(r7)
                java.util.ArrayList r7 = r5.f80224m
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L4d
                if (r4 == 0) goto L4d
                java.util.ArrayList r7 = r5.f80224m
                r6.f80248q = r7
                r6.f80249r = r3
                java.lang.Object r1 = com.avito.android.advert.item.similars.c.q(r5, r4, r6)
                if (r1 != r0) goto L38
                return r0
            L38:
                r0 = r7
                r7 = r1
            L3a:
                java.util.Collection r7 = (java.util.Collection) r7
                r0.addAll(r7)
                r5.getClass()
                com.avito.android.advert.item.similars.f r7 = new com.avito.android.advert.item.similars.f
                r7.<init>(r5, r2)
                r0 = 3
                kotlinx.coroutines.internal.h r1 = r5.f80219h
                kotlinx.coroutines.C43259k.d(r1, r2, r2, r7, r0)
            L4d:
                if (r4 == 0) goto Ld5
                java.util.ArrayList r7 = r5.f80224m
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Iterator r7 = r7.iterator()
            L5a:
                boolean r1 = r7.hasNext()
                if (r1 == 0) goto L71
                java.lang.Object r1 = r7.next()
                r3 = r1
                com.avito.android.section.SectionElementData r3 = (com.avito.android.section.SectionElementData) r3
                T extends com.avito.android.remote.model.section.SectionTypeElement r3 = r3.f264598b
                boolean r3 = r3 instanceof com.avito.android.remote.model.section.SectionTypeItem
                if (r3 == 0) goto L5a
                r0.add(r1)
                goto L5a
            L71:
                java.util.ArrayList r7 = new java.util.ArrayList
                r1 = 10
                int r3 = kotlin.collections.C42745f0.q(r0, r1)
                r7.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L80:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L94
                java.lang.Object r3 = r0.next()
                com.avito.android.section.SectionElementData r3 = (com.avito.android.section.SectionElementData) r3
                T extends com.avito.android.remote.model.section.SectionTypeElement r3 = r3.f264598b
                com.avito.android.remote.model.section.SectionTypeItem r3 = (com.avito.android.remote.model.section.SectionTypeItem) r3
                r7.add(r3)
                goto L80
            L94:
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = kotlin.collections.C42745f0.q(r7, r1)
                r0.<init>(r1)
                java.util.Iterator r7 = r7.iterator()
            La1:
                boolean r1 = r7.hasNext()
                if (r1 == 0) goto Lb5
                java.lang.Object r1 = r7.next()
                com.avito.android.remote.model.section.SectionTypeItem r1 = (com.avito.android.remote.model.section.SectionTypeItem) r1
                java.lang.String r1 = r1.getContext()
                r0.add(r1)
                goto La1
            Lb5:
                java.util.Iterator r7 = r0.iterator()
                r0 = 0
            Lba:
                boolean r1 = r7.hasNext()
                if (r1 == 0) goto Ld5
                java.lang.Object r1 = r7.next()
                int r3 = r0 + 1
                if (r0 < 0) goto Ld1
                java.lang.String r1 = (java.lang.String) r1
                com.avito.android.advert_core.analytics.a r0 = r5.f80215d
                r0.e3(r3, r4, r1)
                r0 = r3
                goto Lba
            Ld1:
                kotlin.collections.C42745f0.H0()
                throw r2
            Ld5:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.similars.c.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: AdvertAsyncComplementaryPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.similars.AdvertAsyncComplementaryPresenterImpl$onBottomSheetReloadButtonClick$1", f = "AdvertAsyncComplementaryPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {
        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return c.this.new f(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object next;
            String str;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            c cVar = c.this;
            m value = cVar.f80230s.getValue();
            if (value == null) {
                return G0.f406611a;
            }
            Iterator<T> it = value.f80304a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((SectionChip) next).f264619d) {
                    break;
                }
            }
            SectionChip sectionChip = (SectionChip) next;
            if (sectionChip == null || (str = sectionChip.f264617b) == null) {
                return G0.f406611a;
            }
            cVar.f80228q.remove(str);
            c.s(cVar, str);
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertAsyncComplementaryPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.similars.AdvertAsyncComplementaryPresenterImpl$onClickBottomSheetChip$1", f = "AdvertAsyncComplementaryPresenter.kt", i = {}, l = {268}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f80253q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ m f80254r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ c f80255s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f80256t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(m mVar, c cVar, String str, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f80254r = mVar;
            this.f80255s = cVar;
            this.f80256t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new g(this.f80254r, this.f80255s, this.f80256t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            String str;
            c cVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f80253q;
            if (i12 == 0) {
                C42729a0.b(obj);
                List<SectionChip> list = this.f80254r.f80304a;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                Iterator<T> it = list.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    str = this.f80256t;
                    cVar = this.f80255s;
                    if (!zHasNext) {
                        break;
                    }
                    SectionChip sectionChip = (SectionChip) it.next();
                    boolean zF2 = L.f(sectionChip.f264617b, str);
                    if (zF2) {
                        cVar.f80215d.a5(sectionChip.f264620e.toString());
                    }
                    arrayList.add(SectionChip.a(sectionChip, zF2));
                }
                m.a aVar = cVar.f80228q.get(str);
                if (aVar == null) {
                    c.s(cVar, str);
                    return G0.f406611a;
                }
                Z1<m> z12 = cVar.f80230s;
                m mVar = new m(arrayList, aVar);
                this.f80253q = 1;
                if (z12.emit(mVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertAsyncComplementaryPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/section/SectionTypeElement;", "T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V", "com/avito/android/advert/item/similars/g"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.similars.AdvertAsyncComplementaryPresenterImpl$onClickChip$$inlined$updateSectionByType$1", f = "AdvertAsyncComplementaryPresenter.kt", i = {}, l = {685, 643}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f80257q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ SectionElementData f80258r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ c f80259s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f80260t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ c f80261u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f80262v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(SectionElementData sectionElementData, c cVar, int i12, Continuation continuation, c cVar2, String str) {
            super(2, continuation);
            this.f80258r = sectionElementData;
            this.f80259s = cVar;
            this.f80260t = i12;
            this.f80261u = cVar2;
            this.f80262v = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new h(this.f80258r, this.f80259s, this.f80260t, continuation, this.f80261u, this.f80262v);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.f80257q
                com.avito.android.section.SectionElementData r2 = r9.f80258r
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L21
                if (r1 == r4) goto L1d
                if (r1 != r3) goto L15
                kotlin.C42729a0.b(r10)
                goto L8c
            L15:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1d:
                kotlin.C42729a0.b(r10)
                goto L60
            L21:
                kotlin.C42729a0.b(r10)
                T extends com.avito.android.remote.model.section.SectionTypeElement r10 = r2.f264598b
                com.avito.android.section.RedesignUnitedSectionTypeItem r10 = (com.avito.android.section.RedesignUnitedSectionTypeItem) r10
                java.util.ArrayList r1 = r10.f264594b
                java.util.Iterator r1 = r1.iterator()
            L2e:
                boolean r5 = r1.hasNext()
                r6 = 0
                if (r5 == 0) goto L49
                java.lang.Object r5 = r1.next()
                r7 = r5
                com.avito.android.remote.model.section.SectionTypeItem r7 = (com.avito.android.remote.model.section.SectionTypeItem) r7
                java.lang.String r7 = r7.getSectionId()
                java.lang.String r8 = r9.f80262v
                boolean r7 = kotlin.jvm.internal.L.f(r7, r8)
                if (r7 == 0) goto L2e
                goto L4a
            L49:
                r5 = r6
            L4a:
                com.avito.android.remote.model.section.SectionTypeItem r5 = (com.avito.android.remote.model.section.SectionTypeItem) r5
                if (r5 != 0) goto L4f
                goto L61
            L4f:
                r10.f264595c = r5
                com.avito.android.advert.item.similars.c r1 = r9.f80261u
                com.avito.android.section.SectionItemConverter r5 = r1.f80214c
                com.avito.android.section.SectionItemConverter$Params r1 = r1.f80225n
                r9.f80257q = r4
                java.lang.Object r10 = r5.e(r10, r1, r6, r9)
                if (r10 != r0) goto L60
                return r0
            L60:
                r6 = r10
            L61:
                com.avito.android.section.SectionElementData r6 = (com.avito.android.section.SectionElementData) r6
                if (r6 != 0) goto L68
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            L68:
                java.util.List<com.avito.android.serp.adapter.PersistableSpannedItem> r10 = r2.f264599c
                boolean r10 = r10.isEmpty()
                int r1 = r9.f80260t
                com.avito.android.advert.item.similars.c r2 = r9.f80259s
                if (r10 == 0) goto L7a
                java.util.ArrayList r10 = r2.f80224m
                r10.remove(r1)
                goto L83
            L7a:
                java.util.ArrayList r10 = r2.f80224m
                com.avito.android.section.SectionElementData r4 = r2.w(r6)
                r10.set(r1, r4)
            L83:
                r9.f80257q = r3
                java.lang.Object r10 = r2.y(r9)
                if (r10 != r0) goto L8c
                return r0
            L8c:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.similars.c.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: AdvertAsyncComplementaryPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/section/SectionTypeElement;", "T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V", "com/avito/android/advert/item/similars/g"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.similars.AdvertAsyncComplementaryPresenterImpl$onReloadButtonClick$$inlined$updateSectionByType$1", f = "AdvertAsyncComplementaryPresenter.kt", i = {}, l = {679, 643}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f80263q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ SectionElementData f80264r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ c f80265s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f80266t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ c f80267u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(SectionElementData sectionElementData, c cVar, int i12, Continuation continuation, c cVar2) {
            super(2, continuation);
            this.f80264r = sectionElementData;
            this.f80265s = cVar;
            this.f80266t = i12;
            this.f80267u = cVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new i(this.f80264r, this.f80265s, this.f80266t, continuation, this.f80267u);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((i) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f80263q;
            SectionElementData sectionElementData = this.f80264r;
            if (i12 == 0) {
                C42729a0.b(obj);
                c cVar = this.f80267u;
                SectionItemConverter sectionItemConverter = cVar.f80214c;
                SectionItemConverter.Params params = cVar.f80225n;
                this.f80263q = 1;
                obj = sectionItemConverter.e(sectionElementData.f264598b, params, null, this);
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
            SectionElementData<?> sectionElementData2 = (SectionElementData) obj;
            if (sectionElementData2 == null) {
                return G0.f406611a;
            }
            boolean zIsEmpty = sectionElementData.f264599c.isEmpty();
            int i13 = this.f80266t;
            c cVar2 = this.f80265s;
            if (zIsEmpty) {
                cVar2.f80224m.remove(i13);
            } else {
                cVar2.f80224m.set(i13, cVar2.w(sectionElementData2));
            }
            this.f80263q = 2;
            if (cVar2.y(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public c(@Y61.k n nVar, @Y61.k com.avito.android.serp.adapter.recomendations.j jVar, @Y61.k SectionItemConverter sectionItemConverter, @Y61.k com.avito.android.advert_core.analytics.a aVar, @Y61.k AdvertDetailsFastOpenParams advertDetailsFastOpenParams, @Y61.k A7.b bVar, @Y61.k InterfaceC34162r0 interfaceC34162r0, @Y61.k j jVar2, @Y61.k R0 r02) {
        this.f80212a = nVar;
        this.f80213b = jVar;
        this.f80214c = sectionItemConverter;
        this.f80215d = aVar;
        this.f80216e = advertDetailsFastOpenParams;
        this.f80217f = bVar;
        this.f80218g = interfaceC34162r0;
        this.f80219h = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.d()));
        e2 e2VarB = f2.b(1, 0, null, 6);
        this.f80220i = e2VarB;
        int iA2 = jVar2.a();
        this.f80221j = iA2;
        this.f80224m = new ArrayList();
        this.f80225n = new SectionItemConverter.Params(jVar2.getSpanCount(), false, false, false, false, false, null, null, false, null, false, false, 4094, null);
        this.f80226o = new HashMap<>();
        this.f80227p = new HashMap<>();
        this.f80228q = new HashMap<>();
        this.f80229r = e2VarB;
        this.f80230s = p2.a(null);
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        this.f80231t = new AdvertDetailsGapItem(52, null, 28, iA2, null, null, 50, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(com.avito.android.advert.item.similars.c r13, com.avito.android.remote.model.AdvertDetails r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            r13.getClass()
            boolean r0 = r15 instanceof com.avito.android.advert.item.similars.b
            if (r0 == 0) goto L16
            r0 = r15
            com.avito.android.advert.item.similars.b r0 = (com.avito.android.advert.item.similars.b) r0
            int r1 = r0.f80211t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f80211t = r1
            goto L1b
        L16:
            com.avito.android.advert.item.similars.b r0 = new com.avito.android.advert.item.similars.b
            r0.<init>(r13, r15)
        L1b:
            java.lang.Object r15 = r0.f80209r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f80211t
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            com.avito.android.advert.item.similars.c r13 = r0.f80208q
            kotlin.C42729a0.b(r15)
            goto L97
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            kotlin.C42729a0.b(r15)
            com.avito.android.remote.model.ComplementarySections r15 = r14.getComplementarySections()
            if (r15 == 0) goto Lc3
            java.util.List r2 = r15.getSections()
            if (r2 != 0) goto L4c
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            goto Lc1
        L4c:
            com.avito.android.section.SectionItemConverter$Params r4 = r13.f80225n
            com.avito.android.remote.model.ItemCardRedesign r5 = r14.getItemCardRedesign()
            if (r5 == 0) goto L62
            java.lang.Boolean r5 = r5.getRestyle()
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            boolean r5 = kotlin.jvm.internal.L.f(r5, r6)
        L60:
            r7 = r5
            goto L64
        L62:
            r5 = 0
            goto L60
        L64:
            java.lang.Integer r9 = r15.getRedesignItemCount()
            com.avito.android.remote.model.section.SectionViewType r10 = r15.getShopSimilarRedesign()
            java.lang.String r15 = r14.getCategoryId()
            com.avito.android.remote.model.CategoryIds$AUTO r5 = com.avito.android.remote.model.CategoryIds.AUTO.CARS
            java.lang.String r5 = r5.getId()
            boolean r8 = kotlin.jvm.internal.L.f(r15, r5)
            boolean r6 = r14.getRenderByBeduin()
            r11 = 0
            r12 = 3847(0xf07, float:5.391E-42)
            r5 = 0
            com.avito.android.section.SectionItemConverter$Params r14 = com.avito.android.section.SectionItemConverter.Params.a(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.f80225n = r14
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r0.f80208q = r13
            r0.f80211t = r3
            com.avito.android.section.SectionItemConverter r15 = r13.f80214c
            java.lang.Object r15 = r15.a(r2, r14, r0)
            if (r15 != r1) goto L97
            goto Lc9
        L97:
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.ArrayList r14 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.C42745f0.q(r15, r0)
            r14.<init>(r0)
            java.util.Iterator r15 = r15.iterator()
        La8:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto Lbc
            java.lang.Object r0 = r15.next()
            com.avito.android.section.SectionElementData r0 = (com.avito.android.section.SectionElementData) r0
            com.avito.android.section.SectionElementData r0 = r13.w(r0)
            r14.add(r0)
            goto La8
        Lbc:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r14)
        Lc1:
            r1 = r13
            goto Lc9
        Lc3:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            goto Lc1
        Lc9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.similars.c.q(com.avito.android.advert.item.similars.c, com.avito.android.remote.model.AdvertDetails, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(com.avito.android.advert.item.similars.c r20, com.avito.android.section.SectionElementData r21, java.lang.Throwable r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.similars.c.r(com.avito.android.advert.item.similars.c, com.avito.android.section.SectionElementData, java.lang.Throwable, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void s(c cVar, String str) {
        HashMap<String, N0> map = cVar.f80227p;
        N0 n02 = map.get(str);
        if (n02 == null || !n02.isActive()) {
            map.put(str, C43259k.d(cVar.f80219h, null, null, new com.avito.android.advert.item.similars.e(cVar, str, null), 3));
        }
    }

    public static final void t(c cVar, Set set, SectionTypeElement sectionTypeElement) {
        List<RecommendedSellerElement> items;
        cVar.getClass();
        Set set2 = set;
        int iF2 = P0.f(C42745f0.q(set2, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (Object obj : set2) {
            linkedHashMap.put(((InterfaceC32897n0) obj).getF155494c(), obj);
        }
        if (!(sectionTypeElement instanceof RecommendedSellersCarousel) || (items = ((RecommendedSellersCarousel) sectionTypeElement).getItems()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : items) {
            if (obj2 instanceof RecommendedSeller) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            RecommendedSeller recommendedSeller = (RecommendedSeller) it.next();
            InterfaceC32897n0 interfaceC32897n0 = (InterfaceC32897n0) linkedHashMap.get(recommendedSeller.getUserKey());
            if (interfaceC32897n0 != null) {
                recommendedSeller.setSubscribed(interfaceC32897n0.getF155497f());
                recommendedSeller.setNotificationsActivated(interfaceC32897n0.getF155498g());
            }
        }
    }

    @Override // com.avito.android.advert.item.similars.a
    @Y61.k
    public final ArrayList a() {
        ArrayList arrayList = this.f80224m;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((SectionElementData) it.next()).f264598b);
        }
        return arrayList2;
    }

    @Override // com.avito.android.serp.adapter.recomendations.o
    public final void b(@Y61.k ExpandableSectionItem expandableSectionItem, boolean z12) {
        AdvertDetailsStyleAnalytics advertDetailsStyleAnalytics;
        AdvertDetails advertDetails = this.f80222k;
        if (advertDetails == null) {
            return;
        }
        boolean zF2 = L.f(null, "complementary_repair_services_in_realty");
        if (zF2) {
            advertDetailsStyleAnalytics = AdvertDetailsStyleAnalytics.f82777g;
        } else {
            C28131g1.f75660a.getClass();
            advertDetailsStyleAnalytics = com.avito.android.advert.advert_details_style.c.a(C28131g1.a(this.f80216e, advertDetails)).f68641j;
        }
        this.f80215d.V1(z12 ? ExpandableTitleClickEvent.ActionType.f82845d : ExpandableTitleClickEvent.ActionType.f82844c, advertDetailsStyleAnalytics, zF2 ? "item" : null);
        u(expandableSectionItem, z12);
    }

    @Override // com.avito.android.section.skeleton.a
    @SuppressLint({"HardcodeStringDetector"})
    public final void c(@Y61.k String str) {
        HashMap<String, N0> map = this.f80226o;
        N0 n02 = map.get(str);
        if (n02 == null || !n02.isActive()) {
            map.put(str, C43259k.d(this.f80219h, null, null, new C2372c(str, null), 3));
        }
    }

    @Override // com.avito.android.advert.item.similars.a
    public final void clearItems() {
        this.f80224m = new ArrayList();
        Q0.d(this.f80219h.f411905b);
        this.f80220i.h4();
    }

    @Override // com.avito.android.section.horizontal.button.e.a
    public final void d() {
        o();
    }

    @Override // com.avito.android.advert.item.similars.a
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.k("complementaryBlocks", this.f80224m);
        kundle.j(this.f80225n, "sectionConverterParams");
        return kundle;
    }

    @Override // com.avito.android.advert.item.similars.a
    public final void e() {
        if (this.f80222k == null || this.f80224m.isEmpty()) {
            return;
        }
        C43259k.d(this.f80219h, null, null, new b(null), 3);
    }

    @Override // com.avito.android.advert.item.similars.a
    public final void e0() {
        this.f80223l = null;
    }

    @Override // com.avito.android.section.placeholder.e.a
    public final void f() {
        if (this.f80224m.isEmpty()) {
            return;
        }
        Iterator it = this.f80224m.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (((SectionElementData) it.next()).f264598b instanceof RedesignUnitedSectionTypeItem) {
                break;
            } else {
                i12++;
            }
        }
        Integer numValueOf = Integer.valueOf(i12);
        if (i12 == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            C43259k.d(this.f80219h, null, null, new i((SectionElementData) this.f80224m.get(iIntValue), this, iIntValue, null, this), 3);
        }
    }

    @Override // com.avito.android.advert.item.similars.a
    public final void f0(@Y61.l Kundle kundle) {
        if (this.f80224m.isEmpty()) {
            List listE = kundle.e("complementaryBlocks");
            this.f80224m = listE != null ? new ArrayList(listE) : new ArrayList();
            SectionItemConverter.Params params = (SectionItemConverter.Params) kundle.d("sectionConverterParams");
            if (params != null) {
                this.f80225n = SectionItemConverter.Params.a(params, this.f80225n.f264600b, false, false, false, null, null, null, 4094);
            }
        }
    }

    @Override // com.avito.android.advert.item.similars.a
    public final void g() {
        Object next;
        List<PersistableSpannedItem> list;
        Iterator it = this.f80224m.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (L.f(((SectionElementData) next).f264598b.getSectionId(), "complementary_repair_services_in_realty")) {
                    break;
                }
            }
        }
        SectionElementData sectionElementData = (SectionElementData) next;
        Parcelable parcelable = (sectionElementData == null || (list = sectionElementData.f264599c) == null) ? null : (PersistableSpannedItem) C42745f0.E(list);
        ExpandableSectionItem expandableSectionItem = parcelable instanceof ExpandableSectionItem ? (ExpandableSectionItem) parcelable : null;
        if (expandableSectionItem != null) {
            u(expandableSectionItem, false);
        }
    }

    @Override // com.avito.android.advert.item.similars.a
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF80221j() {
        return this.f80221j;
    }

    @Override // com.avito.android.advert.item.similars.a
    @Y61.k
    /* renamed from: h, reason: from getter */
    public final e2 getF80229r() {
        return this.f80229r;
    }

    @Override // com.avito.android.advert.item.similars.a
    public final void i() {
        C43259k.d(this.f80219h, null, null, new a(null), 3);
    }

    @Override // com.avito.android.advert.item.similars.a
    public final void j() {
        C43259k.d(this.f80219h, null, null, new f(null), 3);
    }

    @Override // com.avito.android.advert.item.similars.a
    public final void k(@Y61.k I1 i12) {
        this.f80223l = i12;
    }

    @Override // com.avito.android.advert.item.similars.a
    public final void l(@Y61.l AdvertDetails advertDetails) {
        this.f80222k = advertDetails;
    }

    @Override // com.avito.android.advert.item.similars.a
    public final void m(@Y61.k String str) {
        m value = this.f80230s.getValue();
        if (value == null || L.f(value.b(), str)) {
            return;
        }
        C43259k.d(this.f80219h, null, null, new g(value, this, str, null), 3);
    }

    @Override // com.avito.android.advert.item.similars.a
    @Y61.k
    public final InterfaceC43160i<m> n() {
        return this.f80230s;
    }

    @Override // com.avito.android.section.title.with_action.redesign.f.b
    public final void o() {
        Iterator it = this.f80224m.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (((SectionElementData) it.next()).f264598b instanceof RedesignUnitedSectionTypeItem) {
                break;
            } else {
                i12++;
            }
        }
        Integer numValueOf = Integer.valueOf(i12);
        if (i12 == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            RedesignUnitedSectionTypeItem redesignUnitedSectionTypeItem = (RedesignUnitedSectionTypeItem) ((SectionElementData) this.f80224m.get(numValueOf.intValue())).f264598b;
            String sectionId = redesignUnitedSectionTypeItem.f264595c.getSectionId();
            this.f80215d.m6();
            C43259k.d(this.f80219h, null, null, new d(redesignUnitedSectionTypeItem, sectionId, null), 3);
        }
    }

    @Override // com.avito.android.advert.item.similars.a
    public final void onCleared() {
        Q0.d(this.f80219h.f411905b);
        this.f80220i.h4();
    }

    @Override // com.avito.android.section.chips.f.b
    public final void p(@Y61.k String str) {
        if (this.f80224m.isEmpty()) {
            return;
        }
        Iterator it = this.f80224m.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (((SectionElementData) it.next()).f264598b instanceof RedesignUnitedSectionTypeItem) {
                break;
            } else {
                i12++;
            }
        }
        Integer numValueOf = Integer.valueOf(i12);
        if (i12 == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            C43259k.d(this.f80219h, null, null, new h((SectionElementData) this.f80224m.get(iIntValue), this, iIntValue, null, this, str), 3);
        }
    }

    @Override // com.avito.android.advert.item.similars.a
    public final void t6(@Y61.l AdvertDetails advertDetails) {
        this.f80222k = advertDetails;
        C43259k.d(this.f80219h, null, null, new e(advertDetails, null), 3);
    }

    public final void u(ExpandableSectionItem expandableSectionItem, boolean z12) {
        int i12;
        AdvertDetails advertDetails = this.f80222k;
        if (advertDetails == null) {
            return;
        }
        this.f80213b.a(expandableSectionItem.f270541c, z12);
        Iterator it = this.f80224m.iterator();
        int i13 = 0;
        loop0: while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            List<PersistableSpannedItem> list = ((SectionElementData) it.next()).f264599c;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (PersistableSpannedItem persistableSpannedItem : list) {
                    if ((persistableSpannedItem instanceof ExpandableSectionItem) && L.f(((ExpandableSectionItem) persistableSpannedItem).f270541c, expandableSectionItem.f270541c)) {
                        i12 = i13;
                        break loop0;
                    }
                }
            }
            i13++;
        }
        if (i12 == -1) {
            return;
        }
        SectionElementData sectionElementData = (SectionElementData) this.f80224m.get(i12);
        x(advertDetails, z12, sectionElementData.f264598b.getSectionId());
        ExpandableSectionItem expandableSectionItem2 = new ExpandableSectionItem(expandableSectionItem.f270540b, expandableSectionItem.f270541c, expandableSectionItem.f270542d, z12, expandableSectionItem.f270544f, expandableSectionItem.f270545g, expandableSectionItem.f270546h, expandableSectionItem.f270547i);
        Collection collection = z12 ? C42784z0.f406748b : expandableSectionItem.f270546h;
        t0 t0Var = new t0(2);
        t0Var.a(expandableSectionItem2);
        t0Var.b(collection.toArray(new PersistableSpannedItem[0]));
        ArrayList<Object> arrayList = t0Var.f406850a;
        this.f80224m.set(i12, new SectionElementData(sectionElementData.f264598b, C42745f0.U(arrayList.toArray(new PersistableSpannedItem[arrayList.size()]))));
        C43259k.d(this.f80219h, null, null, new com.avito.android.advert.item.similars.f(this, null), 3);
    }

    public final Integer v(String str) {
        Iterator it = this.f80224m.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (((SectionElementData) it.next()).f264598b.isSectionWithId(str)) {
                break;
            }
            i12++;
        }
        Integer numValueOf = Integer.valueOf(i12);
        if (i12 != -1) {
            return numValueOf;
        }
        return null;
    }

    public final SectionElementData<?> w(SectionElementData<?> sectionElementData) {
        SectionItemConverter.Params params = this.f80225n;
        if (params.f264605g || !params.isRedesign()) {
            return sectionElementData;
        }
        return new SectionElementData<>(sectionElementData.f264598b, C42745f0.i0(this.f80231t, sectionElementData.f264599c));
    }

    public final void x(AdvertDetails advertDetails, boolean z12, String str) {
        AdvertDetailsStyleAnalytics advertDetailsStyleAnalytics;
        boolean zF2 = L.f(str, "complementary_repair_services_in_realty");
        if (zF2) {
            advertDetailsStyleAnalytics = AdvertDetailsStyleAnalytics.f82777g;
        } else {
            C28131g1.f75660a.getClass();
            advertDetailsStyleAnalytics = com.avito.android.advert.advert_details_style.c.a(C28131g1.a(this.f80216e, advertDetails)).f68641j;
        }
        this.f80215d.V1(z12 ? ExpandableTitleClickEvent.ActionType.f82845d : ExpandableTitleClickEvent.ActionType.f82844c, advertDetailsStyleAnalytics, zF2 ? "item" : null);
    }

    public final Object y(ContinuationImpl continuationImpl) {
        e2 e2Var = this.f80220i;
        ArrayList arrayList = this.f80224m;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C42745f0.h(((SectionElementData) it.next()).f264599c, arrayList2);
        }
        Object objEmit = e2Var.emit(arrayList2, continuationImpl);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
    }
}

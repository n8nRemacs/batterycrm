package com.avito.android.extended_profile;

import android.os.Bundle;
import android.os.SystemClock;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.AdvertDetailsLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DialogDeepLink;
import com.avito.android.di.InterfaceC30264p;
import com.avito.android.extended_profile.di.r;
import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import com.avito.android.rec.ScreenSource;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.serp.adapter.AdvertItem;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kv.C43501a;
import oA.C44609a;

/* compiled from: ExtendedProfileDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/d;", "Lcom/avito/android/extended_profile/c;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.extended_profile.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30395d implements InterfaceC30394c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f149435a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f149436b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f149437c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SearchParams f149438d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final r f149439e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f149440f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f149441g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f149442h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final VD.b f149443i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f149444j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final c f149445k;

    /* compiled from: ExtendedProfileDeeplinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile.ExtendedProfileDeeplinkHandlerImpl$handleAdvertDeeplink$1", f = "ExtendedProfileDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.extended_profile.d$a */
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ AdvertItem f149446q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C30395d f149447r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AdvertItem advertItem, C30395d c30395d, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f149446q = advertItem;
            this.f149447r = c30395d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f149446q, this.f149447r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            AdvertItem advertItem = this.f149446q;
            DeepLink deepLink = advertItem.f268396O;
            boolean z12 = deepLink instanceof AdvertDetailsLink;
            C30395d c30395d = this.f149447r;
            if (z12) {
                Bundle bundle = new Bundle();
                bundle.putString("title", advertItem.f268428d);
                bundle.putString("key_category_id", advertItem.f268420a0);
                bundle.putLong("click_time", SystemClock.elapsedRealtime());
                bundle.putParcelable("screen_source", ScreenSource.EXTENDED_PROFILE.f251780d);
                String str = advertItem.f268440i;
                if (str != null) {
                    bundle.putString("price", str);
                }
                String str2 = advertItem.f268446l;
                if (str2 != null) {
                    bundle.putString("old_price", str2);
                }
                DimmedImage dimmedImage = advertItem.f268368A;
                if (dimmedImage != null) {
                    bundle.putParcelable("image", dimmedImage);
                }
                c30395d.d(deepLink, bundle);
            } else if (deepLink instanceof DialogDeepLink) {
                InterfaceC28373a interfaceC28373a = c30395d.f149442h;
                String strA = c30395d.f149441g.a();
                if (strA == null) {
                    strA = "";
                }
                interfaceC28373a.c(new C44609a(strA, c30395d.f149435a, true));
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("must_use_re23", true);
                c30395d.d(deepLink, bundle2);
            } else {
                c30395d.d(deepLink, null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile.ExtendedProfileDeeplinkHandlerImpl$handleDeeplink$1", f = "ExtendedProfileDeeplinkHandler.kt", i = {}, l = {84, 87, 95, 106}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.extended_profile.d$b */
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f149448q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f149449r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ DeepLink f149451t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.extended_profile.mvi.entity.a f149452u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Bundle f149453v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(DeepLink deepLink, com.avito.android.extended_profile.mvi.entity.a aVar, Bundle bundle, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f149451t = deepLink;
            this.f149452u = aVar;
            this.f149453v = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = C30395d.this.new b(this.f149451t, this.f149452u, this.f149453v, continuation);
            bVar.f149449r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x00d5  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 257
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile.C30395d.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.extended_profile.d$c */
    public static final class c implements InterfaceC43160i<C43501a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f149454b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.extended_profile.d$c$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f149455b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.extended_profile.ExtendedProfileDeeplinkHandlerImpl$special$$inlined$filter$1$2", f = "ExtendedProfileDeeplinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.extended_profile.d$c$a$a, reason: collision with other inner class name */
            public static final class C4384a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f149456q;

                /* renamed from: r, reason: collision with root package name */
                public int f149457r;

                public C4384a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f149456q = obj;
                    this.f149457r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f149455b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.extended_profile.C30395d.c.a.C4384a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.extended_profile.d$c$a$a r0 = (com.avito.android.extended_profile.C30395d.c.a.C4384a) r0
                    int r1 = r0.f149457r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f149457r = r1
                    goto L18
                L13:
                    com.avito.android.extended_profile.d$c$a$a r0 = new com.avito.android.extended_profile.d$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f149456q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f149457r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4e
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    r6 = r5
                    kv.a r6 = (kv.C43501a) r6
                    com.avito.android.deeplink_handler.handler.bundle.a r6 = r6.f413260a
                    java.lang.String r2 = "req_key_extended_profile"
                    java.lang.String r6 = r6.f134521b
                    boolean r6 = kotlin.jvm.internal.L.f(r6, r2)
                    if (r6 == 0) goto L4e
                    r0.f149457r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f149455b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4e
                    return r1
                L4e:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile.C30395d.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(InterfaceC43160i interfaceC43160i) {
            this.f149454b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super C43501a> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f149454b).collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    @Inject
    public C30395d(@r.h @Y61.k String str, @Y61.l @r.d String str2, @r.i boolean z12, @r.g @Y61.k SearchParams searchParams, @Y61.k r rVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.account.E e12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k VD.b bVar, @Y61.l @InterfaceC30264p String str3) {
        this.f149435a = str;
        this.f149436b = str2;
        this.f149437c = z12;
        this.f149438d = searchParams;
        this.f149439e = rVar;
        this.f149440f = aVar;
        this.f149441g = e12;
        this.f149442h = interfaceC28373a;
        this.f149443i = bVar;
        this.f149444j = str3;
        this.f149445k = new c(kotlinx.coroutines.rx3.y.a(aVar.d9()));
    }

    @Override // com.avito.android.extended_profile.InterfaceC30394c
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final c getF149445k() {
        return this.f149445k;
    }

    @Override // com.avito.android.extended_profile.InterfaceC30394c
    @Y61.k
    public final InterfaceC43160i<ExtendedProfileInternalAction> b(@Y61.k AdvertItem advertItem) {
        return C43175k.G(new a(advertItem, this, null));
    }

    @Override // com.avito.android.extended_profile.InterfaceC30394c
    @Y61.k
    public final InterfaceC43160i<ExtendedProfileInternalAction> c(@Y61.l com.avito.android.extended_profile.mvi.entity.a aVar, @Y61.k DeepLink deepLink, @Y61.l Bundle bundle) {
        return C43175k.G(new b(deepLink, aVar, bundle, null));
    }

    public final void d(DeepLink deepLink, Bundle bundle) {
        this.f149440f.r6(bundle, deepLink, "req_key_extended_profile");
    }

    @Override // com.avito.android.extended_profile.InterfaceC30394c
    public final void h(@Y61.k String str) {
        this.f149440f.h(str);
    }
}

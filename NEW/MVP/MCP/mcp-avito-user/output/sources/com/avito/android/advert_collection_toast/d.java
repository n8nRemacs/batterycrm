package com.avito.android.advert_collection_toast;

import HV.a;
import Ju.InterfaceC14249c;
import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.view.C22984Q;
import androidx.view.C23069w;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.account.E;
import com.avito.android.advert_collection_toast.analytics.FromPageSource;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.AddToCollectionLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.toast_bar.c;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import com.avito.android.serp.adapter.S;
import com.avito.android.util.C35835l0;
import com.avito.android.util.R0;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43200s1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.X;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.flow.internal.m;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;
import kv.C43501a;

/* compiled from: AdvertCollectionToastService.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_toast/d;", "Lcom/avito/android/advert_collection_toast/c;", "a", "b", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements com.avito.android.advert_collection_toast.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final E f82341a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f82342b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final X7.a f82343c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C43238h f82344d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final e2 f82345e = f2.b(0, 0, null, 7);

    /* renamed from: f, reason: collision with root package name */
    @k
    public final FromPageSource f82346f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public N0 f82347g;

    /* compiled from: AdvertCollectionToastService.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/advert_collection_toast/d$a;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/advert_collection_toast/d$a$a;", "Lcom/avito/android/advert_collection_toast/d$a$b;", "Lcom/avito/android/advert_collection_toast/d$a$c;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: AdvertCollectionToastService.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_toast/d$a$a;", "Lcom/avito/android/advert_collection_toast/d$a;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.advert_collection_toast.d$a$a, reason: collision with other inner class name */
        public static final /* data */ class C2444a extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f82348a;

            public C2444a(@k String str) {
                super(null);
                this.f82348a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2444a) && L.f(this.f82348a, ((C2444a) obj).f82348a);
            }

            public final int hashCode() {
                return this.f82348a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Add(advertId="), this.f82348a, ')');
            }
        }

        /* compiled from: AdvertCollectionToastService.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_toast/d$a$b;", "Lcom/avito/android/advert_collection_toast/d$a;", "<init>", "()V", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f82349a = new b();

            public b() {
                super(null);
            }
        }

        /* compiled from: AdvertCollectionToastService.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_toast/d$a$c;", "Lcom/avito/android/advert_collection_toast/d$a;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f82350a;

            public c(@k String str) {
                super(null);
                this.f82350a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f82350a, ((c) obj).f82350a);
            }

            public final int hashCode() {
                return this.f82350a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Remove(advertId="), this.f82350a, ')');
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AdvertCollectionToastService.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_toast/d$b;", "", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f82351a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f82352b;

        public b(@k String str, boolean z12) {
            this.f82351a = str;
            this.f82352b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f82351a, bVar.f82351a) && this.f82352b == bVar.f82352b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f82352b) + (this.f82351a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FavoriteAdvert(id=");
            sb2.append(this.f82351a);
            sb2.append(", isFavorite=");
            return r.x(sb2, this.f82352b, ')');
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC43160i<a.b> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f82353b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f82354b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.advert_collection_toast.AdvertCollectionToastServiceImpl$bind$$inlined$map$1$2", f = "AdvertCollectionToastService.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.advert_collection_toast.d$c$a$a, reason: collision with other inner class name */
            public static final class C2445a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f82355q;

                /* renamed from: r, reason: collision with root package name */
                public int f82356r;

                public C2445a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f82355q = obj;
                    this.f82356r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f82354b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r4, @Y61.k kotlin.coroutines.Continuation r5) {
                /*
                    r3 = this;
                    boolean r4 = r5 instanceof com.avito.android.advert_collection_toast.d.c.a.C2445a
                    if (r4 == 0) goto L13
                    r4 = r5
                    com.avito.android.advert_collection_toast.d$c$a$a r4 = (com.avito.android.advert_collection_toast.d.c.a.C2445a) r4
                    int r0 = r4.f82356r
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r0 & r1
                    if (r2 == 0) goto L13
                    int r0 = r0 - r1
                    r4.f82356r = r0
                    goto L18
                L13:
                    com.avito.android.advert_collection_toast.d$c$a$a r4 = new com.avito.android.advert_collection_toast.d$c$a$a
                    r4.<init>(r5)
                L18:
                    java.lang.Object r5 = r4.f82355q
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r4.f82356r
                    r2 = 1
                    if (r1 == 0) goto L31
                    if (r1 != r2) goto L29
                    kotlin.C42729a0.b(r5)
                    goto L41
                L29:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r5)
                    throw r4
                L31:
                    kotlin.C42729a0.b(r5)
                    com.avito.android.advert_collection_toast.d$a$b r5 = com.avito.android.advert_collection_toast.d.a.b.f82349a
                    r4.f82356r = r2
                    kotlinx.coroutines.flow.j r1 = r3.f82354b
                    java.lang.Object r4 = r1.emit(r5, r4)
                    if (r4 != r0) goto L41
                    return r0
                L41:
                    kotlin.G0 r4 = kotlin.G0.f406611a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_collection_toast.d.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(m mVar) {
            this.f82353b = mVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super a.b> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = this.f82353b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: AdvertCollectionToastService.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection_toast.AdvertCollectionToastServiceImpl$bind$1", f = "AdvertCollectionToastService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.advert_collection_toast.d$d, reason: collision with other inner class name */
    public static final class C2446d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f82358q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22983P f82360s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.advert_collection_toast.j f82361t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ c f82362u;

        /* compiled from: AdvertCollectionToastService.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "ids", "Lcom/avito/android/advert_collection_toast/d$a;", "action", "<anonymous>", "(Ljava/util/Set;Lcom/avito/android/advert_collection_toast/d$a;)Ljava/util/Set;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.advert_collection_toast.AdvertCollectionToastServiceImpl$bind$1$1$2", f = "AdvertCollectionToastService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.advert_collection_toast.d$d$a */
        public static final class a extends SuspendLambda implements q<Set<String>, a, Continuation<? super Set<String>>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Set f82363q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f82364r;

            public a() {
                throw null;
            }

            @Override // Y41.q
            public final Object invoke(Set<String> set, a aVar, Continuation<? super Set<String>> continuation) {
                a aVar2 = new a(3, continuation);
                aVar2.f82363q = set;
                aVar2.f82364r = aVar;
                return aVar2.invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                Set set = this.f82363q;
                a aVar = (a) this.f82364r;
                if (aVar instanceof a.C2444a) {
                    set.add(((a.C2444a) aVar).f82348a);
                } else if (aVar instanceof a.c) {
                    set.remove(((a.c) aVar).f82350a);
                } else if (L.f(aVar, a.b.f82349a)) {
                    set.clear();
                }
                return set;
            }
        }

        /* compiled from: AdvertCollectionToastService.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.advert_collection_toast.AdvertCollectionToastServiceImpl$bind$1$2", f = "AdvertCollectionToastService.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.advert_collection_toast.d$d$b */
        public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super Set<String>>, Throwable, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f82365q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ InterfaceC43172j f82366r;

            public b() {
                throw null;
            }

            @Override // Y41.q
            public final Object invoke(InterfaceC43172j<? super Set<String>> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
                b bVar = new b(3, continuation);
                bVar.f82366r = interfaceC43172j;
                return bVar.invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f82365q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InterfaceC43172j interfaceC43172j = this.f82366r;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    this.f82365q = 1;
                    if (interfaceC43172j.emit(linkedHashSet, this) == coroutine_suspended) {
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

        /* compiled from: AdvertCollectionToastService.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.advert_collection_toast.AdvertCollectionToastServiceImpl$bind$1$3", f = "AdvertCollectionToastService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.advert_collection_toast.d$d$c */
        public static final class c extends SuspendLambda implements q<InterfaceC43172j<? super Set<String>>, Throwable, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.advert_collection_toast.j f82367q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(com.avito.android.advert_collection_toast.j jVar, Continuation<? super c> continuation) {
                super(3, continuation);
                this.f82367q = jVar;
            }

            @Override // Y41.q
            public final Object invoke(InterfaceC43172j<? super Set<String>> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
                return new c(this.f82367q, continuation).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                com.avito.android.advert_collection_toast.j jVar = this.f82367q;
                com.avito.android.lib.design.toast_bar.k kVar = jVar.f82415f;
                if (kVar != null) {
                    kVar.f();
                }
                jVar.f82415f = null;
                return G0.f406611a;
            }
        }

        /* compiled from: AdvertCollectionToastService.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "ids", "Lkotlin/G0;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.advert_collection_toast.AdvertCollectionToastServiceImpl$bind$1$5", f = "AdvertCollectionToastService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.advert_collection_toast.d$d$d, reason: collision with other inner class name */
        public static final class C2447d extends SuspendLambda implements p<List<? extends String>, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f82368q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ d f82369r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2447d(d dVar, Continuation<? super C2447d> continuation) {
                super(2, continuation);
                this.f82369r = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                C2447d c2447d = new C2447d(this.f82369r, continuation);
                c2447d.f82368q = obj;
                return c2447d;
            }

            @Override // Y41.p
            public final Object invoke(List<? extends String> list, Continuation<? super G0> continuation) {
                return ((C2447d) create(list, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                List<String> list = (List) this.f82368q;
                d dVar = this.f82369r;
                dVar.f82343c.a(list);
                b.a.a(dVar.f82342b, new AddToCollectionLink(list, dVar.f82346f.f82321b), null, null, 6);
                return G0.f406611a;
            }
        }

        /* compiled from: AdvertCollectionToastService.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lkv/a;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.advert_collection_toast.AdvertCollectionToastServiceImpl$bind$1$6", f = "AdvertCollectionToastService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.advert_collection_toast.d$d$e */
        public static final class e extends SuspendLambda implements p<C43501a, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f82370q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ d f82371r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.advert_collection_toast.j f82372s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(d dVar, com.avito.android.advert_collection_toast.j jVar, Continuation<? super e> continuation) {
                super(2, continuation);
                this.f82371r = dVar;
                this.f82372s = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                e eVar = new e(this.f82371r, this.f82372s, continuation);
                eVar.f82370q = obj;
                return eVar;
            }

            @Override // Y41.p
            public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
                return ((e) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Type inference failed for: r1v8, types: [T, com.avito.android.lib.design.toast_bar.k] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                C43501a c43501a = (C43501a) this.f82370q;
                this.f82371r.getClass();
                InterfaceC14249c interfaceC14249c = c43501a.f413261b;
                AddToCollectionLink.b.a aVar = interfaceC14249c instanceof AddToCollectionLink.b.a ? (AddToCollectionLink.b.a) interfaceC14249c : null;
                if (aVar != null) {
                    DeepLink deepLink = aVar.f132940b;
                    com.avito.android.advert_collection_toast.j jVar = this.f82372s;
                    l0.h hVar = new l0.h();
                    com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                    Resources resources = jVar.f82414e;
                    hVar.f406842b = com.avito.android.component.toast.c.b(cVar, jVar.f82410a, com.avito.android.printable_text.b.f(resources.getString(R.string.added_to_collection)), null, Collections.singletonList(new c.a.C3719a(resources.getString(R.string.proceed_action_button), false, null, new com.avito.android.advert_collection_toast.i(jVar, deepLink, hVar), 6, null)), null, f.a.f125253a, 0, ToastBarPosition.f181047e, null, false, false, null, null, 4010);
                }
                return G0.f406611a;
            }
        }

        /* compiled from: AdvertCollectionToastService.kt */
        @s0
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.advert_collection_toast.AdvertCollectionToastServiceImpl$bind$1$7", f = "AdvertCollectionToastService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.advert_collection_toast.d$d$f */
        public static final class f extends SuspendLambda implements p<DeepLink, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f82373q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ d f82374r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(d dVar, Continuation<? super f> continuation) {
                super(2, continuation);
                this.f82374r = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                f fVar = new f(this.f82374r, continuation);
                fVar.f82373q = obj;
                return fVar;
            }

            @Override // Y41.p
            public final Object invoke(DeepLink deepLink, Continuation<? super G0> continuation) {
                return ((f) create(deepLink, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                DeepLink deepLink = (DeepLink) this.f82373q;
                d dVar = this.f82374r;
                com.avito.android.deeplink_handler.handler.composite.a aVar = dVar.f82342b;
                Bundle bundle = new Bundle();
                bundle.putString("from_page", dVar.f82346f.f82321b);
                G0 g02 = G0.f406611a;
                b.a.a(aVar, deepLink, null, bundle, 2);
                dVar.f82343c.b();
                return G0.f406611a;
            }
        }

        /* compiled from: Merge.kt */
        @s0
        @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.advert_collection_toast.AdvertCollectionToastServiceImpl$bind$1$invokeSuspend$$inlined$flatMapLatest$1", f = "AdvertCollectionToastService.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.advert_collection_toast.d$d$g */
        public static final class g extends SuspendLambda implements q<InterfaceC43172j<? super Set<String>>, Boolean, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f82375q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ InterfaceC43172j f82376r;

            /* renamed from: s, reason: collision with root package name */
            public /* synthetic */ Object f82377s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ d f82378t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ c f82379u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(Continuation continuation, d dVar, c cVar) {
                super(3, continuation);
                this.f82378t = dVar;
                this.f82379u = cVar;
            }

            @Override // Y41.q
            public final Object invoke(InterfaceC43172j<? super Set<String>> interfaceC43172j, Boolean bool, Continuation<? super G0> continuation) {
                g gVar = new g(continuation, this.f82378t, this.f82379u);
                gVar.f82376r = interfaceC43172j;
                gVar.f82377s = bool;
                return gVar.invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f82375q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InterfaceC43172j interfaceC43172j = this.f82376r;
                    InterfaceC43160i c43200s1 = ((Boolean) this.f82377s).booleanValue() ? new C43200s1(new LinkedHashSet(), C43175k.r(C43175k.N(new i(this.f82378t.f82345e), this.f82379u)), new a(3, null)) : C43175k.w();
                    this.f82375q = 1;
                    if (C43175k.u(this, c43200s1, interfaceC43172j) == coroutine_suspended) {
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

        /* compiled from: Merge.kt */
        @s0
        @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.advert_collection_toast.AdvertCollectionToastServiceImpl$bind$1$invokeSuspend$$inlined$flatMapLatest$2", f = "AdvertCollectionToastService.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.advert_collection_toast.d$d$h */
        public static final class h extends SuspendLambda implements q<InterfaceC43172j<? super List<? extends String>>, Set<String>, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f82380q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ InterfaceC43172j f82381r;

            /* renamed from: s, reason: collision with root package name */
            public /* synthetic */ Object f82382s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.advert_collection_toast.j f82383t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(com.avito.android.advert_collection_toast.j jVar, Continuation continuation) {
                super(3, continuation);
                this.f82383t = jVar;
            }

            @Override // Y41.q
            public final Object invoke(InterfaceC43172j<? super List<? extends String>> interfaceC43172j, Set<String> set, Continuation<? super G0> continuation) {
                h hVar = new h(this.f82383t, continuation);
                hVar.f82381r = interfaceC43172j;
                hVar.f82382s = set;
                return hVar.invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                InterfaceC43160i jVar;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f82380q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InterfaceC43172j interfaceC43172j = this.f82381r;
                    Set set = (Set) this.f82382s;
                    boolean zIsEmpty = set.isEmpty();
                    com.avito.android.advert_collection_toast.j jVar2 = this.f82383t;
                    if (zIsEmpty) {
                        com.avito.android.lib.design.toast_bar.k kVar = jVar2.f82415f;
                        if (kVar != null) {
                            kVar.f();
                        }
                        jVar2.f82415f = null;
                        jVar = C43175k.w();
                    } else {
                        int size = set.size();
                        Resources resources = jVar2.f82414e;
                        String string = size == 1 ? resources.getString(R.string.add_to_collection) : resources.getQuantityString(R.plurals.add_to_collection, size, Integer.valueOf(size));
                        ToastBarState toastBarState = jVar2.f82416g;
                        com.avito.android.lib.design.toast_bar.k kVar2 = jVar2.f82415f;
                        com.avito.android.component.toast.g gVar = com.avito.android.component.toast.g.f125258a;
                        f.a aVar = f.a.f125253a;
                        gVar.getClass();
                        com.avito.android.component.toast.g.b(string, aVar);
                        if (toastBarState == null || kVar2 == null) {
                            View view = jVar2.f82410a;
                            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(view.getContext(), R.style.Theme_DesignSystem_Legacy);
                            a.C0407a c0407a = HV.a.f7100w;
                            int iJ2 = C35835l0.j(R.attr.toastBarDefault, dVar);
                            c0407a.getClass();
                            HV.a aVarB = a.C0407a.b(iJ2, dVar);
                            ToastBarState toastBarState2 = new ToastBarState(com.avito.android.printable_text.b.f(string), jVar2.f82410a, ToastBarPosition.f181048f, null, Collections.singletonList(IV.a.b(aVarB, resources.getString(R.string.add_to), dVar, new com.avito.android.advert_collection_toast.g(jVar2))), null, null, -1, false, false, new com.avito.android.advert_collection_toast.h(jVar2), null, 2920, null);
                            jVar2.f82416g = toastBarState2;
                            com.avito.android.lib.design.toast_bar.k kVar3 = new com.avito.android.lib.design.toast_bar.k(view.getContext(), null, 0, 6, null);
                            kVar3.setStyle(aVarB);
                            kVar3.setState(toastBarState2);
                            com.avito.android.lib.design.toast_bar.c.f181064a.getClass();
                            c.a.f181066b.a(kVar3);
                            jVar2.f82415f = kVar3;
                        } else {
                            ToastBarState toastBarStateA = ToastBarState.a(toastBarState, com.avito.android.printable_text.b.f(string), null, 4094);
                            jVar2.f82416g = toastBarStateA;
                            kVar2.setState(toastBarStateA);
                        }
                        jVar = new j(jVar2.f82411b, set);
                    }
                    this.f82380q = 1;
                    if (C43175k.u(this, jVar, interfaceC43172j) == coroutine_suspended) {
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

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.advert_collection_toast.d$d$i */
        public static final class i implements InterfaceC43160i<a> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e2 f82384b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.advert_collection_toast.d$d$i$a */
            public static final class a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f82385b;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.advert_collection_toast.AdvertCollectionToastServiceImpl$bind$1$invokeSuspend$lambda$1$$inlined$map$1$2", f = "AdvertCollectionToastService.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.advert_collection_toast.d$d$i$a$a, reason: collision with other inner class name */
                public static final class C2448a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f82386q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f82387r;

                    public C2448a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @l
                    public final Object invokeSuspend(@k Object obj) {
                        this.f82386q = obj;
                        this.f82387r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC43172j interfaceC43172j) {
                    this.f82385b = interfaceC43172j;
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
                        boolean r0 = r6 instanceof com.avito.android.advert_collection_toast.d.C2446d.i.a.C2448a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.android.advert_collection_toast.d$d$i$a$a r0 = (com.avito.android.advert_collection_toast.d.C2446d.i.a.C2448a) r0
                        int r1 = r0.f82387r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f82387r = r1
                        goto L18
                    L13:
                        com.avito.android.advert_collection_toast.d$d$i$a$a r0 = new com.avito.android.advert_collection_toast.d$d$i$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f82386q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f82387r
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C42729a0.b(r6)
                        goto L52
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.C42729a0.b(r6)
                        com.avito.android.advert_collection_toast.d$b r5 = (com.avito.android.advert_collection_toast.d.b) r5
                        java.lang.String r6 = r5.f82351a
                        boolean r5 = r5.f82352b
                        if (r5 == 0) goto L42
                        com.avito.android.advert_collection_toast.d$a$c r5 = new com.avito.android.advert_collection_toast.d$a$c
                        r5.<init>(r6)
                        goto L47
                    L42:
                        com.avito.android.advert_collection_toast.d$a$a r5 = new com.avito.android.advert_collection_toast.d$a$a
                        r5.<init>(r6)
                    L47:
                        r0.f82387r = r3
                        kotlinx.coroutines.flow.j r6 = r4.f82385b
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L52
                        return r1
                    L52:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_collection_toast.d.C2446d.i.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public i(e2 e2Var) {
                this.f82384b = e2Var;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @l
            public final Object collect(@k InterfaceC43172j<? super a> interfaceC43172j, @k Continuation continuation) throws Throwable {
                a aVar = new a(interfaceC43172j);
                e2 e2Var = this.f82384b;
                e2Var.getClass();
                Object objG = e2.g(e2Var, aVar, continuation);
                return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.advert_collection_toast.d$d$j */
        public static final class j implements InterfaceC43160i<List<? extends String>> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e2 f82389b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Set f82390c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.advert_collection_toast.d$d$j$a */
            public static final class a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f82391b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Set f82392c;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.advert_collection_toast.AdvertCollectionToastServiceImpl$bind$1$invokeSuspend$lambda$3$$inlined$map$1$2", f = "AdvertCollectionToastService.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.advert_collection_toast.d$d$j$a$a, reason: collision with other inner class name */
                public static final class C2449a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f82393q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f82394r;

                    public C2449a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @l
                    public final Object invokeSuspend(@k Object obj) {
                        this.f82393q = obj;
                        this.f82394r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC43172j interfaceC43172j, Set set) {
                    this.f82391b = interfaceC43172j;
                    this.f82392c = set;
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
                        boolean r0 = r6 instanceof com.avito.android.advert_collection_toast.d.C2446d.j.a.C2449a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.android.advert_collection_toast.d$d$j$a$a r0 = (com.avito.android.advert_collection_toast.d.C2446d.j.a.C2449a) r0
                        int r1 = r0.f82394r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f82394r = r1
                        goto L18
                    L13:
                        com.avito.android.advert_collection_toast.d$d$j$a$a r0 = new com.avito.android.advert_collection_toast.d$d$j$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f82393q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f82394r
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C42729a0.b(r6)
                        goto L49
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.C42729a0.b(r6)
                        kotlin.G0 r5 = (kotlin.G0) r5
                        java.util.Set r5 = r4.f82392c
                        java.lang.Iterable r5 = (java.lang.Iterable) r5
                        java.util.List r5 = kotlin.collections.C42745f0.M0(r5)
                        r0.f82394r = r3
                        kotlinx.coroutines.flow.j r6 = r4.f82391b
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L49
                        return r1
                    L49:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_collection_toast.d.C2446d.j.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public j(e2 e2Var, Set set) {
                this.f82389b = e2Var;
                this.f82390c = set;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @l
            public final Object collect(@k InterfaceC43172j<? super List<? extends String>> interfaceC43172j, @k Continuation continuation) throws Throwable {
                a aVar = new a(interfaceC43172j, this.f82390c);
                e2 e2Var = this.f82389b;
                e2Var.getClass();
                Object objG = e2.g(e2Var, aVar, continuation);
                return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2446d(InterfaceC22983P interfaceC22983P, com.avito.android.advert_collection_toast.j jVar, c cVar, Continuation continuation) {
            super(2, continuation);
            this.f82360s = interfaceC22983P;
            this.f82361t = jVar;
            this.f82362u = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C2446d c2446d = d.this.new C2446d(this.f82360s, this.f82361t, this.f82362u, continuation);
            c2446d.f82358q = obj;
            return c2446d;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C2446d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f82358q;
            d dVar = d.this;
            C43152f0 c43152f0 = new C43152f0(C43175k.Y(y.a(dVar.f82341a.g()), new g(null, dVar, this.f82362u)), new b(3, null));
            com.avito.android.advert_collection_toast.j jVar = this.f82361t;
            C43175k.K(C23069w.a(new C43197r1(new C2447d(dVar, null), C43175k.Y(new X(c43152f0, new c(jVar, null)), new h(jVar, null))), this.f82360s.getLifecycle(), Lifecycle.State.f46683f), t12);
            C43175k.K(new C43197r1(new e(dVar, jVar, null), y.a(dVar.f82342b.d9())), t12);
            C43175k.K(new C43197r1(new f(dVar, null), jVar.f82413d), t12);
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertCollectionToastService.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection_toast.AdvertCollectionToastServiceImpl$onFavoriteButtonClicked$1", f = "AdvertCollectionToastService.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f82396q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f82398s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f82399t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, boolean z12, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f82398s = str;
            this.f82399t = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return d.this.new e(this.f82398s, this.f82399t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f82396q;
            if (i12 == 0) {
                C42729a0.b(obj);
                e2 e2Var = d.this.f82345e;
                b bVar = new b(this.f82398s, this.f82399t);
                this.f82396q = 1;
                if (e2Var.emit(bVar, this) == coroutine_suspended) {
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

    @Inject
    public d(@k E e12, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k X7.a aVar2, @k FromPageSource fromPageSource, @k R0 r02) {
        this.f82341a = e12;
        this.f82342b = aVar;
        this.f82343c = aVar2;
        this.f82344d = U.a(r02.d());
        this.f82346f = fromPageSource;
    }

    @Override // com.avito.android.advert_collection_toast.a
    public final void a() {
        N0 n02 = this.f82347g;
        if (n02 != null) {
            n02.c(null);
        }
        this.f82347g = null;
    }

    @Override // com.avito.android.advert_collection_toast.b
    public final void b(@k String str, boolean z12) {
        C43259k.d(this.f82344d, null, null, new e(str, z12, null), 3);
    }

    @Override // com.avito.android.advert_collection_toast.b
    public final void c(@k S s5) {
        b(s5.getF231617b(), s5.getF156394F());
    }

    @Override // com.avito.android.advert_collection_toast.a
    public final void d(@k View view, @k InterfaceC22983P interfaceC22983P) {
        N0 n02 = this.f82347g;
        if (n02 == null || !n02.isActive()) {
            j jVar = new j(view);
            this.f82347g = C22984Q.a(interfaceC22983P).c(new C2446d(interfaceC22983P, jVar, new c(C43175k.N(jVar.f82412c, C43175k.n(this.f82345e, 5000L))), null));
        }
    }
}

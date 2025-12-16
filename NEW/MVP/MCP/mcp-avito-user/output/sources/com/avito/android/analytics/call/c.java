package com.avito.android.analytics.call;

import Nc.InterfaceC14558a;
import Oc.C14670a;
import Y41.p;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import bc.InterfaceC25627a;
import com.avito.android.analytics.C28461l;
import com.avito.android.analytics.InterfaceC28457i;
import com.avito.android.analytics.InterfaceC28459j;
import com.avito.android.analytics.call.c;
import com.avito.android.analytics_adjust.t;
import com.avito.android.remote.model.TypedResult;
import io.reactivex.rxjava3.core.z;
import java.util.Set;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import okhttp3.internal.Util;
import zc.InterfaceC50545a;

/* compiled from: CallToSellerEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/call/c;", "Lcom/avito/android/analytics/j;", "b", "_avito_analytics-call_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class c implements InterfaceC28459j {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f89706k = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f89707b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f89708c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f89709d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f89710e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Integer f89711f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f89712g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f89713h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f89714i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC28459j f89715j;

    /* compiled from: CallToSellerEvent.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/T;", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/TypedResult;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Lio/reactivex/rxjava3/core/z;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.analytics.call.CallToSellerEvent$1$1", f = "CallToSellerEvent.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super z<TypedResult<Object>>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f89716q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Object f89717r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f89718s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f89719t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f89720u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f89721v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, String str, String str2, String str3, String str4, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f89717r = obj;
            this.f89718s = str;
            this.f89719t = str2;
            this.f89720u = str3;
            this.f89721v = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new a(this.f89717r, this.f89718s, this.f89719t, this.f89720u, this.f89721v, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super z<TypedResult<Object>>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f89716q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC14558a interfaceC14558a = (InterfaceC14558a) this.f89717r;
                long longOrDefault = Util.toLongOrDefault(this.f89718s, -1L);
                C14670a c14670a = new C14670a(this.f89719t, this.f89720u, this.f89721v);
                this.f89716q = 1;
                obj = interfaceC14558a.a(longOrDefault, c14670a, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return z.c0(obj);
        }
    }

    /* compiled from: CallToSellerEvent.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/analytics/call/c$b;", "", "<init>", "()V", "", "CALL_SOURCE_IAC_ACTIVE_FALLBACK", "Ljava/lang/String;", "CALL_SOURCE_IAC_CALL_END_FALLBACK", "CALL_SOURCE_IAC_WAIT_FALLBACK", "", "FROM_BLOCK_IAC_FALLBACK", "I", "_avito_analytics-call_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
    }

    public c(@k final String str, @l String str2, @l final String str3, @l final String str4, @l final Integer num, @l final String str5, @l final String str6, final boolean z12) {
        this.f89707b = str;
        this.f89708c = str2;
        this.f89709d = str3;
        this.f89710e = str4;
        this.f89711f = num;
        this.f89712g = str5;
        this.f89713h = str6;
        this.f89714i = z12;
        this.f89715j = C28461l.a(t.a(d.f89722a), new InterfaceC25627a() { // from class: com.avito.android.analytics.call.b
            @Override // bc.InterfaceC25627a
            public final z b(Object obj) {
                int i12 = c.f89706k;
                boolean z13 = z12;
                String str7 = str;
                String str8 = str3;
                String str9 = str4;
                String str10 = str5;
                if (!z13) {
                    return ((InterfaceC50545a) obj).a(str7, str8, str9, num, str10, str6);
                }
                return (z) C43259k.e(EmptyCoroutineContext.INSTANCE, new c.a(obj, str7, str8, str10, str9, null));
            }
        });
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f89707b, cVar.f89707b) && L.f(this.f89708c, cVar.f89708c) && L.f(this.f89709d, cVar.f89709d) && L.f(this.f89710e, cVar.f89710e) && L.f(this.f89711f, cVar.f89711f) && L.f(this.f89712g, cVar.f89712g) && L.f(this.f89713h, cVar.f89713h) && this.f89714i == cVar.f89714i;
    }

    @Override // com.avito.android.analytics.InterfaceC28459j
    @k
    public final Set<InterfaceC28457i> getEvents() {
        return this.f89715j.getEvents();
    }

    public final int hashCode() {
        int iHashCode = this.f89707b.hashCode() * 31;
        String str = this.f89708c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f89709d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f89710e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f89711f;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.f89712g;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f89713h;
        return Boolean.hashCode(this.f89714i) + ((iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CallToSellerEvent(advertId=");
        sb2.append(this.f89707b);
        sb2.append(", email=");
        sb2.append(this.f89708c);
        sb2.append(", context=");
        sb2.append(this.f89709d);
        sb2.append(", source=");
        sb2.append(this.f89710e);
        sb2.append(", fromBlock=");
        sb2.append(this.f89711f);
        sb2.append(", fromSpace=");
        sb2.append(this.f89712g);
        sb2.append(", fromPage=");
        sb2.append(this.f89713h);
        sb2.append(", apicoV3=");
        return r.x(sb2, this.f89714i, ')');
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, Integer num, String str5, String str6, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, num, (i12 & 32) != 0 ? null : str5, (i12 & 64) != 0 ? null : str6, z12);
    }
}

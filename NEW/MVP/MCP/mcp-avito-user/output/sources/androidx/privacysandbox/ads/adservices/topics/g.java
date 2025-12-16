package androidx.privacysandbox.ads.adservices.topics;

import Y61.k;
import Y61.l;
import android.adservices.topics.GetTopicsRequest;
import android.annotation.SuppressLint;
import androidx.annotation.RestrictTo;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import j.InterfaceC42164u;
import j.Y;
import j.a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;

/* compiled from: TopicsManagerImplCommon.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/g;", "Landroidx/privacysandbox/ads/adservices/topics/d;", "Landroidx/privacysandbox/ads/adservices/topics/a;", "request", "Landroidx/privacysandbox/ads/adservices/topics/b;", "b", "(Landroidx/privacysandbox/ads/adservices/topics/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"NewApi"})
@Y
@RestrictTo
/* loaded from: classes.dex */
public class g extends d {

    /* compiled from: TopicsManagerImplCommon.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon", f = "TopicsManagerImplCommon.kt", i = {}, l = {22}, m = "getTopics$suspendImpl", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public g f53594q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f53595r;

        /* renamed from: t, reason: collision with root package name */
        public int f53597t;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f53595r = obj;
            this.f53597t |= BeduinInputModel.MIN_TEXT_VERSION;
            return g.c(g.this, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @j.InterfaceC42164u
    @j.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(androidx.privacysandbox.ads.adservices.topics.g r7, androidx.privacysandbox.ads.adservices.topics.a r8, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.topics.b> r9) {
        /*
            boolean r0 = r9 instanceof androidx.privacysandbox.ads.adservices.topics.g.a
            if (r0 == 0) goto L13
            r0 = r9
            androidx.privacysandbox.ads.adservices.topics.g$a r0 = (androidx.privacysandbox.ads.adservices.topics.g.a) r0
            int r1 = r0.f53597t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53597t = r1
            goto L18
        L13:
            androidx.privacysandbox.ads.adservices.topics.g$a r0 = new androidx.privacysandbox.ads.adservices.topics.g$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f53595r
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.f53597t
            r2 = 1
            if (r1 == 0) goto L6f
            if (r1 != r2) goto L67
            androidx.privacysandbox.ads.adservices.topics.g r7 = r0.f53594q
            kotlin.C42729a0.b(r9)
            android.adservices.topics.GetTopicsResponse r8 = androidx.privacysandbox.ads.adservices.measurement.b.n(r9)
            r7.getClass()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List r8 = androidx.privacysandbox.ads.adservices.measurement.b.s(r8)
            java.util.Iterator r8 = r8.iterator()
        L3d:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L61
            java.lang.Object r9 = r8.next()
            android.adservices.topics.Topic r9 = androidx.privacysandbox.ads.adservices.measurement.b.o(r9)
            androidx.privacysandbox.ads.adservices.topics.c r6 = new androidx.privacysandbox.ads.adservices.topics.c
            long r1 = androidx.privacysandbox.ads.adservices.measurement.b.b(r9)
            long r3 = androidx.privacysandbox.ads.adservices.measurement.b.B(r9)
            int r5 = androidx.privacysandbox.ads.adservices.measurement.b.a(r9)
            r0 = r6
            r0.<init>(r1, r3, r5)
            r7.add(r6)
            goto L3d
        L61:
            androidx.privacysandbox.ads.adservices.topics.b r8 = new androidx.privacysandbox.ads.adservices.topics.b
            r8.<init>(r7)
            return r8
        L67:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L6f:
            kotlin.C42729a0.b(r9)
            r7.a(r8)
            r0.f53594q = r7
            r0.f53597t = r2
            kotlinx.coroutines.r r7 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r7.<init>(r2, r8)
            r7.p()
            androidx.arch.core.executor.a r8 = new androidx.arch.core.executor.a
            r9 = 1
            r8.<init>(r9)
            androidx.core.os.v.a(r7)
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.topics.g.c(androidx.privacysandbox.ads.adservices.topics.g, androidx.privacysandbox.ads.adservices.topics.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @k
    public GetTopicsRequest a(@k androidx.privacysandbox.ads.adservices.topics.a aVar) {
        return androidx.privacysandbox.ads.adservices.measurement.b.j().setAdsSdkName(aVar.f53588a).build();
    }

    @InterfaceC42164u
    @l
    @a0
    public Object b(@k androidx.privacysandbox.ads.adservices.topics.a aVar, @k Continuation<? super b> continuation) {
        return c(this, aVar, continuation);
    }
}

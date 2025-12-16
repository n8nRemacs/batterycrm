package com.avito.android.lib.beduin_v2.component.map;

import Y41.p;
import android.content.Context;
import android.net.Uri;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.r;
import uS.C48945c;

/* compiled from: MapPinsLoader.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/T;", "", "", "Lcom/avito/android/lib/beduin_v2/component/map/k;", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/util/Map;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.lib.beduin_v2.component.map.MapPinsLoader$loadPins$newRemoteImagesCache$1", f = "MapPinsLoader.kt", i = {0}, l = {60}, m = "invokeSuspend", n = {"destination$iv$iv"}, s = {"L$0"})
/* loaded from: classes14.dex */
final class g extends SuspendLambda implements p<T, Continuation<? super Map<String, ? extends k>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Iterator f175834q;

    /* renamed from: r, reason: collision with root package name */
    public Map f175835r;

    /* renamed from: s, reason: collision with root package name */
    public Object f175836s;

    /* renamed from: t, reason: collision with root package name */
    public int f175837t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f175838u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Set<C48945c> f175839v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f175840w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Context f175841x;

    /* compiled from: MapPinsLoader.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/lib/beduin_v2/component/map/k;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/lib/beduin_v2/component/map/k;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.lib.beduin_v2.component.map.MapPinsLoader$loadPins$newRemoteImagesCache$1$1$1", f = "MapPinsLoader.kt", i = {0}, l = {162, 57}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super k>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public kotlinx.coroutines.sync.d f175842q;

        /* renamed from: r, reason: collision with root package name */
        public h f175843r;

        /* renamed from: s, reason: collision with root package name */
        public C48945c f175844s;

        /* renamed from: t, reason: collision with root package name */
        public int f175845t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ h f175846u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Context f175847v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ C48945c f175848w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, Context context, C48945c c48945c, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f175846u = hVar;
            this.f175847v = context;
            this.f175848w = c48945c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f175846u, this.f175847v, this.f175848w, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super k> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            kotlinx.coroutines.sync.d dVar;
            C48945c c48945c;
            h hVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f175845t;
            C48945c c48945c2 = this.f175848w;
            h hVar2 = this.f175846u;
            try {
                if (i12 == 0) {
                    C42729a0.b(obj);
                    dVar = hVar2.f175851c;
                    this.f175842q = dVar;
                    this.f175843r = hVar2;
                    this.f175844s = c48945c2;
                    this.f175845t = 1;
                    if (dVar.b(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c48945c = c48945c2;
                    hVar = hVar2;
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                        return (k) obj;
                    }
                    c48945c = this.f175844s;
                    hVar = this.f175843r;
                    dVar = this.f175842q;
                    C42729a0.b(obj);
                }
                k kVar = hVar.f175850b.get(c48945c.f439966a);
                if (kVar != null) {
                    return kVar;
                }
                this.f175842q = null;
                this.f175843r = null;
                this.f175844s = null;
                this.f175845t = 2;
                hVar2.getClass();
                r rVar = new r(1, IntrinsicsKt.intercepted(this));
                rVar.p();
                Context context = this.f175847v;
                com.bumptech.glide.util.k.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
                com.bumptech.glide.b.b(context).f338687g.d(context).l(Uri.parse(c48945c2.f439966a)).g(com.bumptech.glide.load.engine.l.f339087a).B(new e(rVar, c48945c2, context));
                obj = rVar.o();
                if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return (k) obj;
            } finally {
                dVar.d(null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Set<C48945c> set, h hVar, Context context, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f175839v = set;
        this.f175840w = hVar;
        this.f175841x = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f175839v, this.f175840w, this.f175841x, continuation);
        gVar.f175838u = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super Map<String, ? extends k>> continuation) {
        return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00ab -> B:22:0x00ac). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f175837t
            r2 = 1
            if (r1 == 0) goto L24
            if (r1 != r2) goto L1c
            java.lang.Object r1 = r10.f175836s
            java.util.Map r3 = r10.f175835r
            java.util.Map r3 = (java.util.Map) r3
            java.util.Iterator r4 = r10.f175834q
            java.lang.Object r5 = r10.f175838u
            java.util.Map r5 = (java.util.Map) r5
            kotlin.C42729a0.b(r11)
            goto Lac
        L1c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L24:
            kotlin.C42729a0.b(r11)
            java.lang.Object r11 = r10.f175838u
            kotlinx.coroutines.T r11 = (kotlinx.coroutines.T) r11
            java.util.Set<uS.c> r1 = r10.f175839v
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r3 = 10
            int r3 = kotlin.collections.C42745f0.q(r1, r3)
            int r3 = kotlin.collections.P0.f(r3)
            r4 = 16
            if (r3 >= r4) goto L3e
            r3 = r4
        L3e:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L47:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L68
            java.lang.Object r3 = r1.next()
            uS.c r3 = (uS.C48945c) r3
            java.lang.String r5 = r3.f439966a
            com.avito.android.lib.beduin_v2.component.map.g$a r6 = new com.avito.android.lib.beduin_v2.component.map.g$a
            com.avito.android.lib.beduin_v2.component.map.h r7 = r10.f175840w
            android.content.Context r8 = r10.f175841x
            r9 = 0
            r6.<init>(r7, r8, r3, r9)
            r3 = 3
            kotlinx.coroutines.a0 r3 = kotlinx.coroutines.C43259k.b(r11, r9, r6, r3)
            r4.put(r5, r3)
            goto L47
        L68:
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            int r1 = r4.size()
            int r1 = kotlin.collections.P0.f(r1)
            r11.<init>(r1)
            java.util.Set r1 = r4.entrySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r3 = r11
            r4 = r1
        L81:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto Lb3
            java.lang.Object r11 = r4.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r1 = r11.getKey()
            java.lang.Object r11 = r11.getValue()
            kotlinx.coroutines.a0 r11 = (kotlinx.coroutines.InterfaceC43076a0) r11
            r10.f175838u = r3
            r10.f175834q = r4
            r5 = r3
            java.util.Map r5 = (java.util.Map) r5
            r10.f175835r = r5
            r10.f175836s = r1
            r10.f175837t = r2
            java.lang.Object r11 = r11.F(r10)
            if (r11 != r0) goto Lab
            return r0
        Lab:
            r5 = r3
        Lac:
            com.avito.android.lib.beduin_v2.component.map.k r11 = (com.avito.android.lib.beduin_v2.component.map.k) r11
            r3.put(r1, r11)
            r3 = r5
            goto L81
        Lb3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.beduin_v2.component.map.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

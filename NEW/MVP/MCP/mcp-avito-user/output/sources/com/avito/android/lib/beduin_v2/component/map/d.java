package com.avito.android.lib.beduin_v2.component.map;

import Y41.p;
import android.content.Context;
import com.avito.android.lib.design.map.state.MapState;
import com.avito.beduin.v2.avito.component.map.state.C;
import com.avito.beduin.v2.avito.component.map.state.Pin;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: MapPinsLoader.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "", "Lcom/avito/android/lib/design/map/state/MapState$a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.lib.beduin_v2.component.map.MapPinsLoader$createMarkers$markers$1", f = "MapPinsLoader.kt", i = {0}, l = {103}, m = "invokeSuspend", n = {"destination$iv$iv"}, s = {"L$0"})
/* loaded from: classes14.dex */
final class d extends SuspendLambda implements p<T, Continuation<? super List<? extends MapState.a>>, Object> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Map<String, k> f175806A;

    /* renamed from: q, reason: collision with root package name */
    public Iterator f175807q;

    /* renamed from: r, reason: collision with root package name */
    public Map f175808r;

    /* renamed from: s, reason: collision with root package name */
    public Object f175809s;

    /* renamed from: t, reason: collision with root package name */
    public int f175810t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f175811u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Set<C> f175812v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List<Pin> f175813w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f175814x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.theme.k f175815y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Context f175816z;

    /* compiled from: MapPinsLoader.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/lib/beduin_v2/component/map/j;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/lib/beduin_v2/component/map/j;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.lib.beduin_v2.component.map.MapPinsLoader$createMarkers$markers$1$pinViews$1$1", f = "MapPinsLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super j>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ h f175817q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C f175818r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.theme.k f175819s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Context f175820t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Map<String, k> f175821u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(h hVar, C c12, com.avito.beduin.v2.theme.k kVar, Context context, Map<String, ? extends k> map, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f175817q = hVar;
            this.f175818r = c12;
            this.f175819s = kVar;
            this.f175820t = context;
            this.f175821u = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f175817q, this.f175818r, this.f175819s, this.f175820t, this.f175821u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super j> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x0229  */
        /* JADX WARN: Removed duplicated region for block: B:102:0x022c  */
        /* JADX WARN: Removed duplicated region for block: B:103:0x0233  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x0240  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x0313  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x019f  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01ad  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01af  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x01b4  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x01c1  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x01c6  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x01c8  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x01cb  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x01d8  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01dd  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01df  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01e2  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x01ef  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01f4  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01f6  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x01f9  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0206  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x020e  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0215  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0218  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x021f  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0222  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r31) {
            /*
                Method dump skipped, instructions count: 925
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.beduin_v2.component.map.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(Set<? extends C> set, List<Pin> list, h hVar, com.avito.beduin.v2.theme.k kVar, Context context, Map<String, ? extends k> map, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f175812v = set;
        this.f175813w = list;
        this.f175814x = hVar;
        this.f175815y = kVar;
        this.f175816z = context;
        this.f175806A = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f175812v, this.f175813w, this.f175814x, this.f175815y, this.f175816z, this.f175806A, continuation);
        dVar.f175811u = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super List<? extends MapState.a>> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00bb -> B:22:0x00bc). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.beduin_v2.component.map.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package androidx.compose.material;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Swipeable.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "", AdvertDetailsBlockIdKt.BLOCK_ID_ITEM_ANCHOR_TRUST_FACTORS, "Lkotlin/G0;", "emit", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.material.ra, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21328ra<T> implements InterfaceC43172j {

    /* compiled from: Swipeable.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.SwipeableState$snapTo$2", f = "Swipeable.kt", i = {0}, l = {310}, m = "emit", n = {"this"}, s = {"L$0"})
    /* renamed from: androidx.compose.material.ra$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public Object f34034q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f34035r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C21328ra<T> f34036s;

        /* renamed from: t, reason: collision with root package name */
        public int f34037t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C21328ra<? super T> c21328ra, Continuation<? super a> continuation) {
            super(continuation);
            this.f34036s = c21328ra;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34035r = obj;
            this.f34037t |= BeduinInputModel.MIN_TEXT_VERSION;
            this.f34036s.a(null, this);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.Map<java.lang.Float, ? extends T> r5, kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.material.C21328ra.a
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.material.ra$a r0 = (androidx.compose.material.C21328ra.a) r0
            int r1 = r0.f34037t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34037t = r1
            goto L18
        L13:
            androidx.compose.material.ra$a r0 = new androidx.compose.material.ra$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f34035r
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.f34037t
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L3a
            if (r1 == r2) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            java.lang.Object r5 = r0.f34034q
            androidx.compose.material.ra r5 = (androidx.compose.material.C21328ra) r5
            kotlin.C42729a0.b(r6)
            r5.getClass()
            int r5 = androidx.compose.material.C21238ka.f33751q
            throw r3
        L3a:
            kotlin.C42729a0.b(r6)
            java.lang.Float r5 = androidx.compose.material.C21225ja.a(r5, r3)
            if (r5 != 0) goto L4b
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "The target value must have an associated anchor."
            r5.<init>(r6)
            throw r5
        L4b:
            r0.f34034q = r4
            r0.f34037t = r2
            int r5 = androidx.compose.material.C21238ka.f33751q
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.C21328ra.a(java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        a((Map) obj, continuation);
        throw null;
    }
}

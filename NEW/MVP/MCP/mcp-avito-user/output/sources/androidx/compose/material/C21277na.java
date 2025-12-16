package androidx.compose.material;

import androidx.compose.animation.core.InterfaceC20307p;
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
/* renamed from: androidx.compose.material.na, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21277na<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f33832b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C21238ka<T> f33833c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20307p<Float> f33834d;

    /* compiled from: Swipeable.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.SwipeableState$animateTo$2", f = "Swipeable.kt", i = {0, 0}, l = {327}, m = "emit", n = {"this", AdvertDetailsBlockIdKt.BLOCK_ID_ITEM_ANCHOR_TRUST_FACTORS}, s = {"L$0", "L$1"})
    /* renamed from: androidx.compose.material.na$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public Object f33835q;

        /* renamed from: r, reason: collision with root package name */
        public Map f33836r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f33837s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C21277na<T> f33838t;

        /* renamed from: u, reason: collision with root package name */
        public int f33839u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C21277na<? super T> c21277na, Continuation<? super a> continuation) {
            super(continuation);
            this.f33838t = c21277na;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f33837s = obj;
            this.f33839u |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.f33838t.emit(null, this);
        }
    }

    public C21277na(T t12, C21238ka<T> c21238ka, InterfaceC20307p<Float> interfaceC20307p) {
        this.f33832b = t12;
        this.f33833c = c21238ka;
        this.f33834d = interfaceC20307p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.util.Map<java.lang.Float, ? extends T> r9, kotlin.coroutines.Continuation<? super kotlin.G0> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.C21277na.emit(java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

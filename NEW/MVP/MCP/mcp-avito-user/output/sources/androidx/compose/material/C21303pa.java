package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Swipeable.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.SwipeableState", f = "Swipeable.kt", i = {1, 1, 1, 2, 2, 2}, l = {154, 179, 182}, m = "processNewAnchors$material_release", n = {"this", "newAnchors", "targetOffset", "this", "newAnchors", "targetOffset"}, s = {"L$0", "L$1", "F$0", "L$0", "L$1", "F$0"})
/* renamed from: androidx.compose.material.pa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21303pa extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C21238ka f33904q;

    /* renamed from: r, reason: collision with root package name */
    public Map f33905r;

    /* renamed from: s, reason: collision with root package name */
    public float f33906s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f33907t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C21238ka<Object> f33908u;

    /* renamed from: v, reason: collision with root package name */
    public int f33909v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21303pa(C21238ka c21238ka, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f33908u = c21238ka;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws Throwable {
        C21303pa c21303pa;
        float f12;
        Map map;
        C21238ka c21238ka;
        this.f33907t = obj;
        this.f33909v |= BeduinInputModel.MIN_TEXT_VERSION;
        C21238ka<Object> c21238ka2 = this.f33908u;
        c21238ka2.getClass();
        int i12 = this.f33909v;
        if ((i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0) {
            this.f33909v = i12 - BeduinInputModel.MIN_TEXT_VERSION;
            c21303pa = this;
        } else {
            c21303pa = new C21303pa(c21238ka2, this);
        }
        Object obj2 = c21303pa.f33907t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c21303pa.f33909v;
        if (i13 == 0) {
            C42729a0.b(obj2);
            throw null;
        }
        if (i13 == 1) {
            C42729a0.b(obj2);
        } else if (i13 == 2) {
            float f13 = c21303pa.f33906s;
            Map map2 = c21303pa.f33905r;
            C21238ka c21238ka3 = c21303pa.f33904q;
            try {
                try {
                    C42729a0.b(obj2);
                    c21238ka3.a(kotlin.collections.P0.d(map2, Boxing.boxFloat(f13)));
                    c21238ka3.f33762k = C42745f0.b0(map2.keySet()).floatValue();
                    c21238ka3.f33763l = C42745f0.X(map2.keySet()).floatValue();
                } catch (CancellationException unused) {
                    c21303pa.f33904q = c21238ka3;
                    c21303pa.f33905r = map2;
                    c21303pa.f33906s = f13;
                    c21303pa.f33909v = 3;
                    Object objA = c21238ka3.f33767p.a(MutatePriority.f26797b, new C21316qa(f13, c21238ka3, null), c21303pa);
                    if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objA = kotlin.G0.f406611a;
                    }
                    if (objA == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    f12 = f13;
                    map = map2;
                    c21238ka = c21238ka3;
                }
            } catch (Throwable th2) {
                th = th2;
                f12 = f13;
                map = map2;
                c21238ka = c21238ka3;
                c21238ka.a(kotlin.collections.P0.d(map, Boxing.boxFloat(f12)));
                c21238ka.f33762k = C42745f0.b0(map.keySet()).floatValue();
                c21238ka.f33763l = C42745f0.X(map.keySet()).floatValue();
                throw th;
            }
        } else {
            if (i13 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f12 = c21303pa.f33906s;
            map = c21303pa.f33905r;
            c21238ka = c21303pa.f33904q;
            try {
                C42729a0.b(obj2);
                c21238ka.a(kotlin.collections.P0.d(map, Boxing.boxFloat(f12)));
                c21238ka.f33762k = C42745f0.b0(map.keySet()).floatValue();
                c21238ka.f33763l = C42745f0.X(map.keySet()).floatValue();
            } catch (Throwable th3) {
                th = th3;
                c21238ka.a(kotlin.collections.P0.d(map, Boxing.boxFloat(f12)));
                c21238ka.f33762k = C42745f0.b0(map.keySet()).floatValue();
                c21238ka.f33763l = C42745f0.X(map.keySet()).floatValue();
                throw th;
            }
        }
        return kotlin.G0.f406611a;
    }
}

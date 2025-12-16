package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.AbstractC20735o.a;
import androidx.compose.foundation.lazy.layout.InterfaceC20717f;
import kotlin.Metadata;

/* compiled from: LazyLayoutIntervalContent.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/lazy/layout/o;", "Landroidx/compose/foundation/lazy/layout/o$a;", "Interval", "", "<init>", "()V", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.lazy.layout.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC20735o<Interval extends a> {

    /* compiled from: LazyLayoutIntervalContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/o$a;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.o$a */
    public interface a {

        /* compiled from: LazyLayoutIntervalContent.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/foundation/lazy/layout/o$a;", "Interval", "", "it", "", "invoke", "(I)Ljava/lang/Void;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.lazy.layout.o$a$a, reason: collision with other inner class name */
        public static final class C1595a extends kotlin.jvm.internal.N implements Y41.l {

            /* renamed from: l, reason: collision with root package name */
            public static final C1595a f29467l = new C1595a();

            public C1595a() {
                super(1);
            }

            @Override // Y41.l
            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                ((Number) obj).intValue();
                return null;
            }
        }

        @Y61.l
        default Y41.l<Integer, Object> getKey() {
            return null;
        }

        @Y61.k
        default Y41.l<Integer, Object> getType() {
            return C1595a.f29467l;
        }
    }

    @Y61.l
    public final Object g(int i12) {
        InterfaceC20717f.a aVarB = h().b(i12);
        return ((a) aVarB.f29413c).getType().invoke(Integer.valueOf(i12 - aVarB.f29411a));
    }

    @Y61.k
    public abstract C0 h();

    @Y61.k
    public final Object i(int i12) {
        Object objInvoke;
        InterfaceC20717f.a aVarB = h().b(i12);
        int i13 = i12 - aVarB.f29411a;
        Y41.l<Integer, Object> key = ((a) aVarB.f29413c).getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i13))) == null) ? new DefaultLazyKey(i12) : objInvoke;
    }
}

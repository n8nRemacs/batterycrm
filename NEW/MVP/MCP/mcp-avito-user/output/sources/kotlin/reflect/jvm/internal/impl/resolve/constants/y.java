package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.descriptors.E;
import kotlin.reflect.jvm.internal.impl.types.O;

/* compiled from: constantValues.kt */
/* loaded from: classes8.dex */
public final class y extends C42939b {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final O f409606c;

    /* compiled from: constantValues.kt */
    public static final class a extends N implements Y41.l<E, O> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ O f409607l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(O o12) {
            super(1);
            this.f409607l = o12;
        }

        @Override // Y41.l
        public final O invoke(E e12) {
            return this.f409607l;
        }
    }

    public y(@Y61.k List<? extends g<?>> list, @Y61.k O o12) {
        super(new a(o12), list);
        this.f409606c = o12;
    }
}

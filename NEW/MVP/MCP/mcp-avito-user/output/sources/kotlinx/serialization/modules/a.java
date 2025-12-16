package kotlinx.serialization.modules;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;

/* compiled from: SerializersModule.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/modules/a;", "", "<init>", "()V", "a", "b", "Lkotlinx/serialization/modules/a$a;", "Lkotlinx/serialization/modules/a$b;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class a {

    /* compiled from: SerializersModule.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/modules/a$a;", "Lkotlinx/serialization/modules/a;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.serialization.modules.a$a, reason: collision with other inner class name */
    public static final class C11759a extends a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final KSerializer<?> f413153a;

        public C11759a(@Y61.k KSerializer<?> kSerializer) {
            super(null);
            this.f413153a = kSerializer;
        }

        @Override // kotlinx.serialization.modules.a
        @Y61.k
        public final KSerializer<?> a(@Y61.k List<? extends KSerializer<?>> list) {
            return this.f413153a;
        }

        public final boolean equals(@Y61.l Object obj) {
            return (obj instanceof C11759a) && L.f(((C11759a) obj).f413153a, this.f413153a);
        }

        public final int hashCode() {
            return this.f413153a.hashCode();
        }
    }

    /* compiled from: SerializersModule.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/modules/a$b;", "Lkotlinx/serialization/modules/a;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends a {
        @Override // kotlinx.serialization.modules.a
        @Y61.k
        public final KSerializer<?> a(@Y61.k List<? extends KSerializer<?>> list) {
            throw null;
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    @Y61.k
    public abstract KSerializer<?> a(@Y61.k List<? extends KSerializer<?>> list);

    public a() {
    }
}

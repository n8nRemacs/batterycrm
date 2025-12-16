package ru.cyberity.cbr.core.data.source.dynamic;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DataKeeper.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u0007*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004\u0007\t\f\u0005B\t\b\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0013\u0010\r\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lru/cyberity/cbr/core/data/source/dynamic/a;", "T", "", "e", "()Ljava/lang/Object;", "d", "", "a", "", "b", "()Z", "hasValue", "c", "latestValue", "<init>", "()V", "Lru/cyberity/cbr/core/data/source/dynamic/a$b;", "Lru/cyberity/cbr/core/data/source/dynamic/a$c;", "Lru/cyberity/cbr/core/data/source/dynamic/a$d;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public abstract class a<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: DataKeeper.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0001\u0010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\u000e"}, d2 = {"Lru/cyberity/cbr/core/data/source/dynamic/a$a;", "", "T", "value", "Lru/cyberity/cbr/core/data/source/dynamic/a$d;", "a", "(Ljava/lang/Object;)Lru/cyberity/cbr/core/data/source/dynamic/a$d;", "lastValue", "", "throwable", "Lru/cyberity/cbr/core/data/source/dynamic/a$c;", "(Ljava/lang/Object;Ljava/lang/Throwable;)Lru/cyberity/cbr/core/data/source/dynamic/a$c;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.source.dynamic.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final <T> d<T> a(T value) {
            return new d<>(value);
        }

        private Companion() {
        }

        @k
        public final <T> c<T> a(@l T lastValue, @k Throwable throwable) {
            return new c<>(throwable, lastValue);
        }
    }

    /* compiled from: DataKeeper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/cyberity/cbr/core/data/source/dynamic/a$b;", "T", "Lru/cyberity/cbr/core/data/source/dynamic/a;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class b<T> extends a<T> {
        public b() {
            super(null);
        }
    }

    /* compiled from: DataKeeper.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00018\u00018\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/core/data/source/dynamic/a$c;", "T", "Lru/cyberity/cbr/core/data/source/dynamic/a;", "", "throwable", "lastValue", "<init>", "(Ljava/lang/Throwable;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/Throwable;", "i", "()Ljava/lang/Throwable;", "c", "Ljava/lang/Object;", "h", "()Ljava/lang/Object;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class c<T> extends a<T> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @k
        private final Throwable throwable;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @l
        private final T lastValue;

        public c(@k Throwable th2, @l T t12) {
            super(null);
            this.throwable = th2;
            this.lastValue = t12;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return L.f(this.throwable, cVar.throwable) && L.f(this.lastValue, cVar.lastValue);
        }

        @l
        public final T h() {
            return this.lastValue;
        }

        public int hashCode() {
            int iHashCode = this.throwable.hashCode() * 31;
            T t12 = this.lastValue;
            return iHashCode + (t12 == null ? 0 : t12.hashCode());
        }

        @k
        /* renamed from: i, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Failure(throwable=");
            sb2.append(this.throwable);
            sb2.append(", lastValue=");
            return H.n(sb2, this.lastValue, ')');
        }
    }

    /* compiled from: DataKeeper.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00018\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/core/data/source/dynamic/a$d;", "T", "Lru/cyberity/cbr/core/data/source/dynamic/a;", "value", "<init>", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/Object;", "g", "()Ljava/lang/Object;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class d<T> extends a<T> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final T value;

        public d(@l T t12) {
            super(null);
            this.value = t12;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && L.f(this.value, ((d) other).value);
        }

        @l
        public final T g() {
            return this.value;
        }

        public int hashCode() {
            T t12 = this.value;
            if (t12 == null) {
                return 0;
            }
            return t12.hashCode();
        }

        @k
        public String toString() {
            return H.n(new StringBuilder("Success(value="), this.value, ')');
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    @l
    public final Throwable a() {
        c cVar = this instanceof c ? (c) this : null;
        if (cVar != null) {
            return cVar.getThrowable();
        }
        return null;
    }

    public final boolean b() {
        return c() != null;
    }

    @l
    public final T c() {
        if (this instanceof d) {
            return (T) ((d) this).g();
        }
        if (this instanceof c) {
            return (T) ((c) this).h();
        }
        if (this instanceof b) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @l
    public final T d() {
        d dVar = this instanceof d ? (d) this : null;
        if (dVar != null) {
            return (T) dVar.g();
        }
        return null;
    }

    public final T e() throws Throwable {
        if (this instanceof c) {
            throw ((c) this).getThrowable();
        }
        T tC2 = c();
        if (tC2 != null) {
            return tC2;
        }
        throw new IllegalStateException("Required value was null.");
    }

    private a() {
    }
}

package ru.cyberity.cbr.core.domain.model;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Either.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003:\u0002\f\u0006B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0006\u001a\u00028\u0002¢\u0006\u0004\b\u0006\u0010\bR\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\nR\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\f\u0010\n\u0082\u0001\u0002\u000e\u0007¨\u0006\u000f"}, d2 = {"Lru/cyberity/cbr/core/domain/model/a;", "L", "R", "", "<init>", "()V", "b", "Lru/cyberity/cbr/core/domain/model/a$b;", "(Ljava/lang/Object;)Lru/cyberity/cbr/core/domain/model/a$b;", "", "()Z", "isRight", "a", "isLeft", "Lru/cyberity/cbr/core/domain/model/a$a;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public abstract class a<L, R> {

    /* compiled from: Either.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\u0006\b\u0002\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/core/domain/model/a$a;", "L", "Lru/cyberity/cbr/core/domain/model/a;", "", "a", "<init>", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.domain.model.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12482a<L> extends a {
        private final L a;

        public C12482a(L l12) {
            super(null);
            this.a = l12;
        }

        public final L d() {
            return this.a;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof C12482a) && L.f(this.a, ((C12482a) other).a);
        }

        public int hashCode() {
            L l12 = this.a;
            if (l12 == null) {
                return 0;
            }
            return l12.hashCode();
        }

        @k
        public String toString() {
            return H.n(new StringBuilder("Left(a="), this.a, ')');
        }
    }

    /* compiled from: Either.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0006\b\u0002\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/cyberity/cbr/core/domain/model/a$b;", "R", "Lru/cyberity/cbr/core/domain/model/a;", "", "b", "<init>", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class b<R> extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final R b;

        public b(R r12) {
            super(null);
            this.b = r12;
        }

        public final R d() {
            return this.b;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && L.f(this.b, ((b) other).b);
        }

        public int hashCode() {
            R r12 = this.b;
            if (r12 == null) {
                return 0;
            }
            return r12.hashCode();
        }

        @k
        public String toString() {
            return H.n(new StringBuilder("Right(b="), this.b, ')');
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    public final boolean a() {
        return this instanceof C12482a;
    }

    public final boolean b() {
        return this instanceof b;
    }

    private a() {
    }

    @k
    public final <R> b<R> b(R b12) {
        return new b<>(b12);
    }
}

package org.funktionale.option;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Option.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lorg/funktionale/option/a;", "T", "", "<init>", "()V", "a", "b", "c", "Lorg/funktionale/option/a$b;", "Lorg/funktionale/option/a$c;", "funktionale-option"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public abstract class a<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final C12200a f420400a = new C12200a(null);

    /* compiled from: Option.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/funktionale/option/a$a;", "", "<init>", "()V", "funktionale-option"}, k = 1, mv = {1, 4, 0})
    /* renamed from: org.funktionale.option.a$a, reason: collision with other inner class name */
    public static final class C12200a {
        public C12200a() {
        }

        public /* synthetic */ C12200a(C42822w c42822w) {
            this();
        }
    }

    /* compiled from: Option.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lorg/funktionale/option/a$b;", "Lorg/funktionale/option/a;", "", "<init>", "()V", "funktionale-option"}, k = 1, mv = {1, 4, 0})
    public static final class b extends a {

        /* renamed from: b, reason: collision with root package name */
        public static final b f420401b = new b();

        public b() {
            super(null);
        }

        @Override // org.funktionale.option.a
        public final Object a() {
            throw new NoSuchElementException("None.get");
        }

        @Override // org.funktionale.option.a
        public final boolean b() {
            return true;
        }

        public final boolean equals(@l Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return Integer.MAX_VALUE;
        }
    }

    /* compiled from: Option.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Lorg/funktionale/option/a$c;", "T", "Lorg/funktionale/option/a;", "funktionale-option"}, k = 1, mv = {1, 4, 0})
    public static final class c<T> extends a<T> {

        /* renamed from: b, reason: collision with root package name */
        public final T f420402b;

        public c(T t12) {
            super(null);
            this.f420402b = t12;
        }

        @Override // org.funktionale.option.a
        public final T a() {
            return this.f420402b;
        }

        @Override // org.funktionale.option.a
        public final boolean b() {
            return false;
        }

        public final boolean equals(@l Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            return L.f(this.f420402b, ((c) obj).f420402b);
        }

        public final int hashCode() {
            T t12 = this.f420402b;
            if (t12 == null) {
                return 17;
            }
            return 17 + t12.hashCode();
        }

        @k
        public final String toString() {
            return H.n(new StringBuilder("Some<"), this.f420402b, '>');
        }
    }

    public a() {
    }

    public abstract T a();

    public abstract boolean b();

    @l
    public final T c() {
        if (b()) {
            return null;
        }
        return a();
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }
}

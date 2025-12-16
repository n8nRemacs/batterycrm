package androidx.view;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import androidx.view.AbstractC23292H0;
import java.io.Serializable;
import kotlin.Metadata;

/* compiled from: NavArgument.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/r;", "", "a", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23389r {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AbstractC23292H0<Object> f53171a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f53172b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f53173c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Object f53174d;

    /* compiled from: NavArgument.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/r$a;", "", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.r$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public AbstractC23292H0<Object> f53175a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f53176b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public Object f53177c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f53178d;

        @k
        public final C23389r a() {
            AbstractC23292H0 qVar = this.f53175a;
            if (qVar == null) {
                AbstractC23292H0.l lVar = AbstractC23292H0.f52782b;
                Object obj = this.f53177c;
                lVar.getClass();
                if (obj instanceof Integer) {
                    qVar = AbstractC23292H0.f52783c;
                } else if (obj instanceof int[]) {
                    qVar = AbstractC23292H0.f52785e;
                } else if (obj instanceof Long) {
                    qVar = AbstractC23292H0.f52786f;
                } else if (obj instanceof long[]) {
                    qVar = AbstractC23292H0.f52787g;
                } else if (obj instanceof Float) {
                    qVar = AbstractC23292H0.f52788h;
                } else if (obj instanceof float[]) {
                    qVar = AbstractC23292H0.f52789i;
                } else if (obj instanceof Boolean) {
                    qVar = AbstractC23292H0.f52790j;
                } else if (obj instanceof boolean[]) {
                    qVar = AbstractC23292H0.f52791k;
                } else if ((obj instanceof String) || obj == null) {
                    qVar = AbstractC23292H0.f52792l;
                } else if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                    qVar = AbstractC23292H0.f52793m;
                } else if (obj.getClass().isArray() && Parcelable.class.isAssignableFrom(obj.getClass().getComponentType())) {
                    qVar = new AbstractC23292H0.n(obj.getClass().getComponentType());
                } else if (obj.getClass().isArray() && Serializable.class.isAssignableFrom(obj.getClass().getComponentType())) {
                    qVar = new AbstractC23292H0.p(obj.getClass().getComponentType());
                } else if (obj instanceof Parcelable) {
                    qVar = new AbstractC23292H0.o(obj.getClass());
                } else if (obj instanceof Enum) {
                    qVar = new AbstractC23292H0.m(obj.getClass());
                } else {
                    if (!(obj instanceof Serializable)) {
                        throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                    }
                    qVar = new AbstractC23292H0.q(obj.getClass());
                }
            }
            return new C23389r(qVar, this.f53176b, this.f53177c, this.f53178d);
        }
    }

    public C23389r(@k AbstractC23292H0<Object> abstractC23292H0, boolean z12, @l Object obj, boolean z13) {
        if (!abstractC23292H0.f52794a && z12) {
            throw new IllegalArgumentException((abstractC23292H0.b() + " does not allow nullable values").toString());
        }
        if (!z12 && z13 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + abstractC23292H0.b() + " has null value but is not nullable.").toString());
        }
        this.f53171a = abstractC23292H0;
        this.f53172b = z12;
        this.f53174d = obj;
        this.f53173c = z13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C23389r.class.equals(obj.getClass())) {
            return false;
        }
        C23389r c23389r = (C23389r) obj;
        if (this.f53172b != c23389r.f53172b || this.f53173c != c23389r.f53173c || !this.f53171a.equals(c23389r.f53171a)) {
            return false;
        }
        Object obj2 = c23389r.f53174d;
        Object obj3 = this.f53174d;
        return obj3 != null ? obj3.equals(obj2) : obj2 == null;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f53171a.hashCode() * 31) + (this.f53172b ? 1 : 0)) * 31) + (this.f53173c ? 1 : 0)) * 31;
        Object obj = this.f53174d;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C23389r.class.getSimpleName());
        sb2.append(" Type: " + this.f53171a);
        sb2.append(" Nullable: " + this.f53172b);
        if (this.f53173c) {
            sb2.append(" DefaultValue: " + this.f53174d);
        }
        return sb2.toString();
    }
}

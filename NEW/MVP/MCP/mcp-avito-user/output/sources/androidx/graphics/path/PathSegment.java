package androidx.graphics.path;

import Y61.k;
import Y61.l;
import android.graphics.PointF;
import androidx.appcompat.app.r;
import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: PathSegment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/graphics/path/PathSegment;", "", "Type", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PathSegment {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Type f46623a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PointF[] f46624b;

    /* renamed from: c, reason: collision with root package name */
    public final float f46625c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PathSegment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/graphics/path/PathSegment$Type;", "", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f46626b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f46627c;

        /* renamed from: d, reason: collision with root package name */
        public static final Type f46628d;

        /* renamed from: e, reason: collision with root package name */
        public static final Type f46629e;

        /* renamed from: f, reason: collision with root package name */
        public static final Type f46630f;

        /* renamed from: g, reason: collision with root package name */
        public static final Type f46631g;

        /* renamed from: h, reason: collision with root package name */
        public static final Type f46632h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ Type[] f46633i;

        static {
            Type type = new Type("Move", 0);
            f46626b = type;
            Type type2 = new Type("Line", 1);
            f46627c = type2;
            Type type3 = new Type("Quadratic", 2);
            f46628d = type3;
            Type type4 = new Type("Conic", 3);
            f46629e = type4;
            Type type5 = new Type("Cubic", 4);
            f46630f = type5;
            Type type6 = new Type("Close", 5);
            f46631g = type6;
            Type type7 = new Type("Done", 6);
            f46632h = type7;
            f46633i = new Type[]{type, type2, type3, type4, type5, type6, type7};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f46633i.clone();
        }
    }

    public PathSegment(@k Type type, @k PointF[] pointFArr, float f12) {
        this.f46623a = type;
        this.f46624b = pointFArr;
        this.f46625c = f12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!PathSegment.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        PathSegment pathSegment = (PathSegment) obj;
        return this.f46623a == pathSegment.f46623a && Arrays.equals(this.f46624b, pathSegment.f46624b) && this.f46625c == pathSegment.f46625c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f46625c) + (((this.f46623a.hashCode() * 31) + Arrays.hashCode(this.f46624b)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PathSegment(type=");
        sb2.append(this.f46623a);
        sb2.append(", points=");
        sb2.append(Arrays.toString(this.f46624b));
        sb2.append(", weight=");
        return r.k(')', this.f46625c, sb2);
    }
}

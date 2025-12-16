package androidx.compose.ui.graphics;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: PathSegment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/PathSegment;", "", "Type", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PathSegment {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Type f39309a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final float[] f39310b;

    /* renamed from: c, reason: collision with root package name */
    public final float f39311c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PathSegment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/PathSegment$Type;", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f39312b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f39313c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Type[] f39314d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f39315e;

        static {
            Type type = new Type("Move", 0);
            Type type2 = new Type("Line", 1);
            Type type3 = new Type("Quadratic", 2);
            Type type4 = new Type("Conic", 3);
            Type type5 = new Type("Cubic", 4);
            Type type6 = new Type("Close", 5);
            f39312b = type6;
            Type type7 = new Type("Done", 6);
            f39313c = type7;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7};
            f39314d = typeArr;
            f39315e = kotlin.enums.c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f39314d.clone();
        }
    }

    public PathSegment(@Y61.k Type type, @Y61.k float[] fArr, float f12) {
        this.f39309a = type;
        this.f39310b = fArr;
        this.f39311c = f12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PathSegment.class == obj.getClass()) {
            PathSegment pathSegment = (PathSegment) obj;
            if (this.f39309a == pathSegment.f39309a && Arrays.equals(this.f39310b, pathSegment.f39310b) && this.f39311c == pathSegment.f39311c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f39311c) + ((Arrays.hashCode(this.f39310b) + (this.f39309a.hashCode() * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PathSegment(type=");
        sb2.append(this.f39309a);
        sb2.append(", points=");
        sb2.append(Arrays.toString(this.f39310b));
        sb2.append(", weight=");
        return androidx.appcompat.app.r.k(')', this.f39311c, sb2);
    }
}

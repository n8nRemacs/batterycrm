package com.google.common.graph;

import com.google.common.base.D;
import java.util.Arrays;

@D
@XY0.a
@aZ0.j
/* loaded from: classes6.dex */
public final class ElementOrder<T> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f360175b = {new Type("UNORDERED", 0), new Type("STABLE", 1), new Type("INSERTION", 2), new Type("SORTED", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        Type EF5;

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f360175b.clone();
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f360176a;

        static {
            int[] iArr = new int[Type.values().length];
            f360176a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f360176a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f360176a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f360176a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public final boolean equals(@I41.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ElementOrder)) {
            return false;
        }
        ((ElementOrder) obj).getClass();
        return com.google.common.base.F.a(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, null});
    }

    public final String toString() {
        D.b bVarB = com.google.common.base.D.b(this);
        bVarB.b(null, "type");
        return bVarB.toString();
    }
}

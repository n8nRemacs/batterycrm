package net.bytebuddy.description.modifier;

import net.bytebuddy.description.modifier.a;

/* loaded from: classes8.dex */
public enum Visibility implements a.d, a.b, a.InterfaceC11985a {
    PUBLIC(1),
    PACKAGE_PRIVATE(0),
    PROTECTED(4),
    PRIVATE(2);


    /* renamed from: b, reason: collision with root package name */
    public final int f416304b;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f416305a;

        static {
            int[] iArr = new int[Visibility.values().length];
            f416305a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f416305a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f416305a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f416305a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    Visibility(int i12) {
        this.f416304b = i12;
    }

    @Override // net.bytebuddy.description.modifier.a
    public final int a() {
        return this.f416304b;
    }

    @Override // net.bytebuddy.description.modifier.a
    public final int b() {
        return 7;
    }

    public final Visibility c(Visibility visibility) {
        int iOrdinal = visibility.ordinal();
        Visibility visibility2 = PUBLIC;
        if (iOrdinal == 0) {
            return visibility2;
        }
        if (iOrdinal == 1) {
            return this == PRIVATE ? PACKAGE_PRIVATE : this;
        }
        if (iOrdinal == 2) {
            return this == visibility2 ? visibility2 : visibility;
        }
        if (iOrdinal == 3) {
            return this;
        }
        throw new IllegalStateException("Unexpected visibility: " + visibility);
    }
}

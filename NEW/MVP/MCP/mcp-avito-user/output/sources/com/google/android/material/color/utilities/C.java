package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* compiled from: QuantizerWu.java */
@RestrictTo
/* loaded from: classes6.dex */
public final class C implements x {

    /* compiled from: QuantizerWu.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f356331a;

        static {
            int[] iArr = new int[d.values().length];
            f356331a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f356331a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f356331a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: QuantizerWu.java */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* compiled from: QuantizerWu.java */
    public static final class c {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: QuantizerWu.java */
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ d[] f356332b = {new d("RED", 0), new d("GREEN", 1), new d("BLUE", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        d EF5;

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f356332b.clone();
        }
    }

    /* compiled from: QuantizerWu.java */
    public static final class e {
    }
}

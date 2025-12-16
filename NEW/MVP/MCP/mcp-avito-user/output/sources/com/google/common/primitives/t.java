package com.google.common.primitives;

import java.util.Comparator;

/* compiled from: SignedBytes.java */
@XY0.b
@f
/* loaded from: classes6.dex */
public final class t {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SignedBytes.java */
    public static final class a implements Comparator<byte[]> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ a[] f360413b = {new a("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        a EF5;

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f360413b.clone();
        }

        @Override // java.util.Comparator
        public final int compare(byte[] bArr, byte[] bArr2) {
            byte[] bArr3 = bArr;
            byte[] bArr4 = bArr2;
            int iMin = Math.min(bArr3.length, bArr4.length);
            for (int i12 = 0; i12 < iMin; i12++) {
                int i13 = bArr3[i12] - bArr4[i12];
                if (i13 != 0) {
                    return i13;
                }
            }
            return bArr3.length - bArr4.length;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "SignedBytes.lexicographicalComparator()";
        }
    }
}

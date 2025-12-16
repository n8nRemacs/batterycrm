package com.google.common.primitives;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Comparator;

/* compiled from: UnsignedInts.java */
@XY0.b
@f
/* loaded from: classes6.dex */
public final class w {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UnsignedInts.java */
    public static final class a implements Comparator<int[]> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ a[] f360422b = {new a("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        a EF5;

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f360422b.clone();
        }

        @Override // java.util.Comparator
        public final int compare(int[] iArr, int[] iArr2) {
            int[] iArr3 = iArr;
            int[] iArr4 = iArr2;
            int iMin = Math.min(iArr3.length, iArr4.length);
            for (int i12 = 0; i12 < iMin; i12++) {
                int i13 = iArr3[i12];
                int i14 = iArr4[i12];
                if (i13 != i14) {
                    int i15 = i13 ^ BeduinInputModel.MIN_TEXT_VERSION;
                    int i16 = Integer.MIN_VALUE ^ i14;
                    if (i15 < i16) {
                        return -1;
                    }
                    return i15 > i16 ? 1 : 0;
                }
            }
            return iArr3.length - iArr4.length;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "UnsignedInts.lexicographicalComparator()";
        }
    }
}

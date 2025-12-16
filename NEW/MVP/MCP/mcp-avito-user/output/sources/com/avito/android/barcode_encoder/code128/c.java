package com.avito.android.barcode_encoder.code128;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.C43066x;

/* compiled from: MinimalEncoder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/avito/android/barcode_encoder/code128/c;", "", "<init>", "()V", "a", "b", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final c f98779a = new c();

    /* renamed from: b, reason: collision with root package name */
    @l
    public static int[][] f98780b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public static b[][] f98781c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MinimalEncoder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/barcode_encoder/code128/c$a;", "", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f98782b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f98783c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f98784d;

        /* renamed from: e, reason: collision with root package name */
        public static final a f98785e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ a[] f98786f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f98787g;

        static {
            a aVar = new a("A", 0);
            f98782b = aVar;
            a aVar2 = new a("B", 1);
            f98783c = aVar2;
            a aVar3 = new a("C", 2);
            f98784d = aVar3;
            a aVar4 = new a("NONE", 3);
            f98785e = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            f98786f = aVarArr;
            f98787g = kotlin.enums.c.a(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f98786f.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MinimalEncoder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/barcode_encoder/code128/c$b;", "", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f98788b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f98789c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f98790d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ b[] f98791e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f98792f;

        static {
            b bVar = new b("A", 0);
            b bVar2 = new b("B", 1);
            b bVar3 = new b("C", 2);
            f98788b = bVar3;
            b bVar4 = new b("SHIFT", 3);
            f98789c = bVar4;
            b bVar5 = new b("NONE", 4);
            f98790d = bVar5;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
            f98791e = bVarArr;
            f98792f = kotlin.enums.c.a(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f98791e.clone();
        }
    }

    /* compiled from: MinimalEncoder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.barcode_encoder.code128.c$c, reason: collision with other inner class name */
    public /* synthetic */ class C2973c {
        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b bVar = b.f98788b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b bVar2 = b.f98788b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b bVar3 = b.f98788b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b bVar4 = b.f98788b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[a.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a aVar = a.f98782b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a aVar2 = a.f98782b;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a aVar3 = a.f98782b;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static void a(ArrayList arrayList, int i12, int[] iArr, int[] iArr2, int i13) {
        arrayList.add(com.avito.android.barcode_encoder.code128.a.f98771a[i12]);
        if (i13 != 0) {
            iArr2[0] = iArr2[0] + 1;
        }
        iArr[0] = (i12 * iArr2[0]) + iArr[0];
    }

    public static boolean b(String str, a aVar, int i12) {
        int i13;
        char cCharAt;
        char cCharAt2 = str.charAt(i12);
        int iOrdinal = aVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        return false;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (cCharAt2 != 241 && ((i13 = i12 + 1) >= str.length() || '0' > cCharAt2 || cCharAt2 >= ':' || '0' > (cCharAt = str.charAt(i13)) || cCharAt >= ':')) {
                    return false;
                }
            } else if (cCharAt2 != 241 && cCharAt2 != 242 && cCharAt2 != 243 && cCharAt2 != 244 && C43066x.H(cCharAt2, 0, 6, " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007fÿ") < 0) {
                return false;
            }
        } else if (cCharAt2 != 241 && cCharAt2 != 242 && cCharAt2 != 243 && cCharAt2 != 244 && C43066x.H(cCharAt2, 0, 6, " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fÿ") < 0) {
            return false;
        }
        return true;
    }

    public static int c(String str, a aVar, int i12) {
        int iC2;
        int iC3;
        str.getClass();
        int i13 = f98780b[aVar.ordinal()][i12];
        if (i13 > 0) {
            return i13;
        }
        b bVar = b.f98790d;
        int i14 = i12 + 1;
        int i15 = 0;
        boolean z12 = i14 >= str.length();
        a[] aVarArr = {a.f98782b, a.f98783c};
        int i16 = Integer.MAX_VALUE;
        while (true) {
            if (i15 >= 2) {
                break;
            }
            if (b(str, aVarArr[i15], i12)) {
                b bVarValueOf = b.f98790d;
                a aVar2 = aVarArr[i15];
                if (aVar != aVar2) {
                    bVarValueOf = b.valueOf(aVar2.toString());
                    iC3 = 2;
                } else {
                    iC3 = 1;
                }
                if (!z12) {
                    iC3 += c(str, aVarArr[i15], i14);
                }
                if (iC3 < i16) {
                    bVar = bVarValueOf;
                    i16 = iC3;
                }
                if (aVar == aVarArr[(i15 + 1) % 2]) {
                    b bVar2 = b.f98789c;
                    int iC4 = z12 ? 2 : c(str, aVar, i14) + 2;
                    if (iC4 < i16) {
                        i16 = iC4;
                        bVar = bVar2;
                    }
                }
            }
            i15++;
        }
        a aVar3 = a.f98784d;
        if (b(str, aVar3, i12)) {
            b bVar3 = b.f98790d;
            if (aVar != aVar3) {
                bVar3 = b.f98788b;
                iC2 = 2;
            } else {
                iC2 = 1;
            }
            int i17 = (str.charAt(i12) != 241 ? 2 : 1) + i12;
            if (i17 < str.length()) {
                iC2 += c(str, aVar3, i17);
            }
            if (iC2 < i16) {
                bVar = bVar3;
                i16 = iC2;
            }
        }
        if (i16 != Integer.MAX_VALUE) {
            f98780b[aVar.ordinal()][i12] = i16;
            f98781c[aVar.ordinal()][i12] = bVar;
            return i16;
        }
        throw new IllegalArgumentException("Bad character in input: ASCII value= " + ((int) str.charAt(i12)));
    }
}

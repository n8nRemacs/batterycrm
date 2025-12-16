package Tg;

import Y61.k;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: UPCEANPatterns.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTg/b;", "", "<init>", "()V", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f15819a = new b();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final int[] f15820b = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final int[] f15821c = {1, 1, 1};

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final int[] f15822d = {1, 1, 1, 1, 1};

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final int[][] f15823e = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final int[][] f15824f;

    static {
        int[][] iArr = new int[20][];
        for (int i12 = 0; i12 < 20; i12++) {
            iArr[i12] = new int[0];
        }
        f15824f = iArr;
        C42756l.o(f15823e, 0, iArr, 0, 10);
        for (int i13 = 10; i13 < 20; i13++) {
            int[] iArr2 = f15823e[i13 - 10];
            int[] iArr3 = new int[iArr2.length];
            int length = iArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                iArr3[i14] = iArr2[(iArr2.length - i14) - 1];
            }
            f15824f[i13] = iArr3;
        }
    }
}

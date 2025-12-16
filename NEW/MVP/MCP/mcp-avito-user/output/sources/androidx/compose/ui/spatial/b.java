package androidx.compose.ui.spatial;

import Y41.r;
import androidx.compose.runtime.internal.P;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RectList.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/spatial/b;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public long[] f41863a = new long[192];

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public long[] f41864b = new long[192];

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    public int f41865c;

    public static void a(b bVar, int i12, int i13, int i14, int i15, int i16, int i17) {
        long[] jArr = bVar.f41863a;
        int i18 = bVar.f41865c;
        int i19 = i18 + 3;
        bVar.f41865c = i19;
        int length = jArr.length;
        if (length <= i19) {
            int iMax = Math.max(length * 2, i19);
            bVar.f41863a = Arrays.copyOf(jArr, iMax);
            bVar.f41864b = Arrays.copyOf(bVar.f41864b, iMax);
        }
        long[] jArr2 = bVar.f41863a;
        jArr2[i18] = (i13 << 32) | (i14 & 4294967295L);
        jArr2[i18 + 1] = (i16 & 4294967295L) | (i15 << 32);
        int i22 = i17 & 67108863;
        jArr2[i18 + 2] = (0 << 63) | (0 << 62) | (1 << 61) | (0 << 52) | (i22 << 26) | (i12 & 67108863);
        if (i17 < 0) {
            return;
        }
        for (int i23 = i18 - 3; i23 >= 0; i23 -= 3) {
            int i24 = i23 + 2;
            long j12 = jArr2[i24];
            if ((((int) j12) & 67108863) == i22) {
                jArr2[i24] = (j12 & (-2301339409586323457L)) | (((i18 - i23) & 511) << 52);
                return;
            }
        }
    }

    public final void b(int i12, @Y61.k r rVar) {
        int i13 = i12 & 67108863;
        long[] jArr = this.f41863a;
        int i14 = this.f41865c;
        for (int i15 = 0; i15 < jArr.length - 2 && i15 < i14; i15 += 3) {
            if ((((int) jArr[i15 + 2]) & 67108863) == i13) {
                long j12 = jArr[i15];
                long j13 = jArr[i15 + 1];
                rVar.invoke(Integer.valueOf((int) (j12 >> 32)), Integer.valueOf((int) j12), Integer.valueOf((int) (j13 >> 32)), Integer.valueOf((int) j13));
                return;
            }
        }
    }
}

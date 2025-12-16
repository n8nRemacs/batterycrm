package Pg;

import Y61.k;
import Y61.l;
import com.avito.android.barcode_encoder.BarcodeFormat;
import com.avito.android.barcode_encoder.EncodeHintType;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: OneDimensionalCodeWriter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LPg/e;", "LPg/g;", "<init>", "()V", "a", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class e implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f13231a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f13232b = Pattern.compile("[0-9]+");

    /* compiled from: OneDimensionalCodeWriter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LPg/e$a;", "", "<init>", "()V", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "NUMERIC", "Ljava/util/regex/Pattern;", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static int a(@k boolean[] zArr, int i12, @k int[] iArr, boolean z12) {
            int i13 = 0;
            for (int i14 : iArr) {
                int i15 = 0;
                while (i15 < i14) {
                    zArr[i12] = z12;
                    i15++;
                    i12++;
                }
                i13 += i14;
                z12 = !z12;
            }
            return i13;
        }

        public a() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    @Override // Pg.g
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Rg.b a(@Y61.k java.lang.String r11, @Y61.k com.avito.android.barcode_encoder.BarcodeFormat r12, int r13, int r14, @Y61.l java.util.Map<com.avito.android.barcode_encoder.EncodeHintType, ?> r15) throws java.lang.NumberFormatException {
        /*
            r10 = this;
            int r0 = r11.length()
            if (r0 == 0) goto Lc2
            if (r13 < 0) goto Lb4
            if (r14 < 0) goto Lb4
            java.util.Collection r0 = r10.e()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L37
            boolean r1 = r0.contains(r12)
            if (r1 == 0) goto L1b
            goto L37
        L1b:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Unsupported format: "
            r13.<init>(r14)
            r13.append(r12)
            java.lang.String r12 = ". Can only encode "
            r13.append(r12)
            r13.append(r0)
            java.lang.String r12 = r13.toString()
            r11.<init>(r12)
            throw r11
        L37:
            if (r15 == 0) goto L55
            boolean r12 = r15.isEmpty()
            if (r12 == 0) goto L40
            goto L55
        L40:
            com.avito.android.barcode_encoder.EncodeHintType r12 = com.avito.android.barcode_encoder.EncodeHintType.f98764h
            boolean r0 = r15.containsKey(r12)
            if (r0 == 0) goto L55
            java.lang.Object r12 = r15.get(r12)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r12 = java.lang.Integer.parseInt(r12)
            goto L59
        L55:
            int r12 = r10.d()
        L59:
            r0 = 0
            if (r15 == 0) goto L78
            boolean r1 = r15.isEmpty()
            if (r1 == 0) goto L63
            goto L78
        L63:
            com.avito.android.barcode_encoder.EncodeHintType r1 = com.avito.android.barcode_encoder.EncodeHintType.f98765i
            boolean r2 = r15.containsKey(r1)
            if (r2 == 0) goto L78
            java.lang.Object r1 = r15.get(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r1 = java.lang.Integer.parseInt(r1)
            goto L79
        L78:
            r1 = r0
        L79:
            boolean[] r11 = r10.c(r11, r15)
            Pg.e$a r15 = Pg.e.f13231a
            r15.getClass()
            int r15 = r11.length
            int r12 = r12 + r15
            int r3 = java.lang.Math.max(r13, r12)
            int r14 = r14 + r1
            r13 = 1
            int r13 = java.lang.Math.max(r13, r14)
            int r12 = r3 / r12
            int r14 = r15 * r12
            int r14 = r3 - r14
            int r14 = r14 / 2
            Rg.b r9 = new Rg.b
            r5 = 0
            r6 = 0
            r7 = 12
            r8 = 0
            r2 = r9
            r4 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8)
        La2:
            if (r0 >= r15) goto Lb3
            boolean r2 = r11[r0]
            if (r2 == 0) goto Laf
            int r2 = r1 / 2
            int r3 = r13 - r1
            r9.a(r14, r2, r12, r3)
        Laf:
            int r0 = r0 + 1
            int r14 = r14 + r12
            goto La2
        Lb3:
            return r9
        Lb4:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Negative sizes are not allowed. Input: "
            java.lang.String r15 = " x "
            java.lang.String r12 = androidx.compose.foundation.H.j(r13, r14, r12, r15)
            r11.<init>(r12)
            throw r11
        Lc2:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Contents are empty"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Pg.e.a(java.lang.String, com.avito.android.barcode_encoder.BarcodeFormat, int, int, java.util.Map):Rg.b");
    }

    @k
    public abstract boolean[] b(@k String str);

    @k
    public boolean[] c(@k String str, @l Map<EncodeHintType, ?> map) {
        return b(str);
    }

    public int d() {
        return 10;
    }

    @k
    public Collection<BarcodeFormat> e() {
        return C42784z0.f406748b;
    }
}

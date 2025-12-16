package Tg;

import Y61.k;
import com.avito.android.barcode_encoder.BarcodeFormat;
import java.util.Collection;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: EAN13Writer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LTg/a;", "LTg/c;", "<init>", "()V", "a", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Tg.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15362a extends c {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final C1080a f15818c = new C1080a(null);

    /* compiled from: EAN13Writer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LTg/a$a;", "", "<init>", "()V", "", "CODE_WIDTH", "I", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Tg.a$a, reason: collision with other inner class name */
    public static final class C1080a {
        public /* synthetic */ C1080a(C42822w c42822w) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        
            throw new java.lang.IllegalArgumentException("digit must be in range [0,9]");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int a(java.lang.CharSequence r9) {
            /*
                int r0 = r9.length()
                int r1 = r0 + (-1)
                r2 = 0
                r3 = -2
                int r4 = kotlin.internal.n.a(r1, r2, r3)
                java.lang.String r5 = "digit must be in range [0,9]"
                r6 = 9
                r7 = r2
                if (r4 > r1) goto L29
            L13:
                char r8 = r9.charAt(r1)
                int r8 = r8 + (-48)
                if (r8 < 0) goto L23
                if (r8 > r6) goto L23
                int r7 = r7 + r8
                if (r1 == r4) goto L29
                int r1 = r1 + (-2)
                goto L13
            L23:
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                r9.<init>(r5)
                throw r9
            L29:
                int r7 = r7 * 3
                int r0 = r0 + (-2)
                int r1 = kotlin.internal.n.a(r0, r2, r3)
                if (r1 > r0) goto L49
            L33:
                char r2 = r9.charAt(r0)
                int r2 = r2 + (-48)
                if (r2 < 0) goto L43
                if (r2 > r6) goto L43
                int r7 = r7 + r2
                if (r0 == r1) goto L49
                int r0 = r0 + (-2)
                goto L33
            L43:
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                r9.<init>(r5)
                throw r9
            L49:
                int r9 = 1000 - r7
                int r9 = r9 % 10
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: Tg.C15362a.C1080a.a(java.lang.CharSequence):int");
        }

        public C1080a() {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (Tg.C15362a.C1080a.a(r10.subSequence(0, r0)) == kotlin.text.C43044a.b(r10.charAt(r0))) goto L15;
     */
    @Override // Pg.e
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean[] b(@Y61.k java.lang.String r10) {
        /*
            r9 = this;
            int r0 = r10.length()
            r1 = 1
            r2 = 12
            Tg.a$a r3 = Tg.C15362a.f15818c
            r4 = 13
            r5 = 0
            if (r0 == r2) goto L41
            if (r0 != r4) goto L35
            r3.getClass()
            int r0 = r10.length()
            if (r0 == 0) goto L2d
            int r0 = r0 - r1
            char r2 = r10.charAt(r0)
            int r2 = kotlin.text.C43044a.b(r2)
            java.lang.CharSequence r0 = r10.subSequence(r5, r0)
            int r0 = Tg.C15362a.C1080a.a(r0)
            if (r0 != r2) goto L2d
            goto L57
        L2d:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Contents do not pass checksum"
            r10.<init>(r0)
            throw r10
        L35:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Requested contents should be 12 or 13 digits long, but got "
            java.lang.String r0 = AK.c.g(r0, r1)
            r10.<init>(r0)
            throw r10
        L41:
            r3.getClass()
            int r0 = Tg.C15362a.C1080a.a(r10)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r0)
            java.lang.String r10 = r2.toString()
        L57:
            Pg.e$a r0 = Pg.e.f13231a
            r0.getClass()
            java.util.regex.Pattern r0 = Pg.e.f13232b
            java.util.regex.Matcher r0 = r0.matcher(r10)
            boolean r0 = r0.matches()
            if (r0 == 0) goto Ldb
            char r0 = r10.charAt(r5)
            int r0 = kotlin.text.C43044a.b(r0)
            Tg.b r2 = Tg.b.f15819a
            r2.getClass()
            int[] r2 = Tg.b.f15820b
            r0 = r2[r0]
            r2 = 95
            boolean[] r2 = new boolean[r2]
            int[] r3 = Tg.b.f15821c
            int r3 = Pg.e.a.a(r2, r5, r3, r1)
            r6 = r1
        L84:
            r7 = 7
            if (r6 >= r7) goto La9
            char r7 = r10.charAt(r6)
            int r7 = kotlin.text.C43044a.b(r7)
            int r8 = 6 - r6
            int r8 = r0 >> r8
            r8 = r8 & r1
            if (r8 != r1) goto L98
            int r7 = r7 + 10
        L98:
            Tg.b r8 = Tg.b.f15819a
            r8.getClass()
            int[][] r8 = Tg.b.f15824f
            r7 = r8[r7]
            int r7 = Pg.e.a.a(r2, r3, r7, r5)
            int r3 = r3 + r7
            int r6 = r6 + 1
            goto L84
        La9:
            Tg.b r0 = Tg.b.f15819a
            r0.getClass()
            int[] r0 = Tg.b.f15822d
            int r0 = Pg.e.a.a(r2, r3, r0, r5)
            int r0 = r0 + r3
        Lb5:
            if (r7 >= r4) goto Ld0
            char r3 = r10.charAt(r7)
            int r3 = kotlin.text.C43044a.b(r3)
            Tg.b r5 = Tg.b.f15819a
            r5.getClass()
            int[][] r5 = Tg.b.f15823e
            r3 = r5[r3]
            int r3 = Pg.e.a.a(r2, r0, r3, r1)
            int r0 = r0 + r3
            int r7 = r7 + 1
            goto Lb5
        Ld0:
            Tg.b r10 = Tg.b.f15819a
            r10.getClass()
            int[] r10 = Tg.b.f15821c
            Pg.e.a.a(r2, r0, r10, r1)
            return r2
        Ldb:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Input should only contain digits 0-9"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Tg.C15362a.b(java.lang.String):boolean[]");
    }

    @Override // Pg.e
    @k
    public final Collection<BarcodeFormat> e() {
        return Collections.singletonList(BarcodeFormat.EAN13);
    }
}

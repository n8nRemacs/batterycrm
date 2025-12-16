package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.layout.K0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: LazyStaggeredGridMeasure.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.lazy.staggeredgrid.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20760d0 {

    /* compiled from: LazyStaggeredGridMeasure.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.d0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f29610l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke(K0.a aVar) {
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: LazyStaggeredGridMeasure.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/l0;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/l0;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.d0$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<l0, CharSequence> {
        static {
            new b();
        }

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final CharSequence invoke(l0 l0Var) {
            return String.valueOf(l0Var.f29645a);
        }
    }

    /* compiled from: LazyStaggeredGridMeasure.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/l0;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/l0;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.d0$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<l0, CharSequence> {
        static {
            new c();
        }

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final CharSequence invoke(l0 l0Var) {
            return String.valueOf(l0Var.f29645a);
        }
    }

    /* compiled from: LazyStaggeredGridMeasure.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.d0$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C20758c0 f29611l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ArrayList f29612m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.lazy.layout.Q f29613n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(androidx.compose.foundation.lazy.layout.Q q12, C20758c0 c20758c0, ArrayList arrayList) {
            super(1);
            this.f29611l = c20758c0;
            this.f29612m = arrayList;
            this.f29613n = q12;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            K0.a aVar2 = aVar;
            ArrayList arrayList = this.f29612m;
            C20758c0 c20758c0 = this.f29611l;
            C20762e0 c20762e0 = new C20762e0(this.f29613n, c20758c0, arrayList);
            aVar2.f40350a = true;
            c20762e0.invoke(aVar2);
            aVar2.f40350a = false;
            c20758c0.f29590a.f29699t.getF42167b();
            return kotlin.G0.f406611a;
        }
    }

    public static final int a(int[] iArr) {
        int length = iArr.length;
        int i12 = -1;
        int i13 = BeduinInputModel.MIN_TEXT_VERSION;
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = iArr[i14];
            if (i13 < i15) {
                i12 = i14;
                i13 = i15;
            }
        }
        return i12;
    }

    public static int b(int[] iArr) {
        int length = iArr.length;
        int i12 = -1;
        int i13 = Integer.MAX_VALUE;
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = iArr[i14];
            if (-2147483647 <= i15 && i15 < i13) {
                i12 = i14;
                i13 = i15;
            }
        }
        return i12;
    }

    public static final int c(int[] iArr, long j12) {
        int i12 = (int) (j12 & 4294967295L);
        int iMax = BeduinInputModel.MIN_TEXT_VERSION;
        for (int i13 = (int) (j12 >> 32); i13 < i12; i13++) {
            iMax = Math.max(iMax, iArr[i13]);
        }
        return iMax;
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x0392, code lost:
    
        r0 = b(r1);
        r2 = a(r40);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x039a, code lost:
    
        if (r0 == r2) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03a2, code lost:
    
        if (r1[r0] != r1[r2]) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03a4, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03a5, code lost:
    
        r2 = r62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03a8, code lost:
    
        r0 = r0;
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03af, code lost:
    
        r14 = r40[r0];
        r29 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03b4, code lost:
    
        if (r14 != (-1)) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03b6, code lost:
    
        r14 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03b7, code lost:
    
        r7 = r5.d(r14, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03bb, code lost:
    
        if (r7 >= 0) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03bd, code lost:
    
        r7 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x03c1, code lost:
    
        if (r2 != false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03c7, code lost:
    
        if (e(r7, r60, r1, r0) == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03ca, code lost:
    
        r0 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03cd, code lost:
    
        if (r64 == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03cf, code lost:
    
        r5.g();
        r2 = r7.length;
        r3 = new int[r2];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03d6, code lost:
    
        if (r4 >= r2) goto L687;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03d8, code lost:
    
        r3[r4] = -1;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03de, code lost:
    
        r2 = r1.length;
        r4 = new int[r2];
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03e3, code lost:
    
        if (r6 >= r2) goto L688;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03e5, code lost:
    
        r4[r6] = r1[r0];
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03f2, code lost:
    
        return d(r60, r37, r3, r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03f3, code lost:
    
        r39 = r3;
        r31 = r6;
        r38 = r9;
        r37 = r10;
        r33 = r13;
        r13 = r60;
        r9 = r63;
        r6 = r0;
        r0 = r2;
        r10 = r4;
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0406, code lost:
    
        r62 = r2;
        r31 = r6;
        r33 = r13;
        r6 = r37;
        r2 = r40;
        r13 = androidx.compose.foundation.lazy.staggeredgrid.C20758c0.a(r10, r7, r0);
        r38 = r9;
        r37 = r10;
        r0 = (int) (r13 & 4294967295L);
        r39 = r3;
        r10 = r4;
        r3 = (int) (r13 >> 32);
        r4 = r0 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x042b, code lost:
    
        if (r4 == 1) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x042d, code lost:
    
        r9 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x042f, code lost:
    
        r9 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0430, code lost:
    
        r5.h(r7, r9);
        r3 = r63.c(r7, r13);
        r13 = c(r1, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0440, code lost:
    
        if (r4 == 1) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0442, code lost:
    
        r4 = r5.e(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0447, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0448, code lost:
    
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x044a, code lost:
    
        if (r14 >= r0) goto L684;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x044c, code lost:
    
        r40 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0450, code lost:
    
        if (r1[r14] == r13) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0452, code lost:
    
        r62 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0454, code lost:
    
        r32[r14].addFirst(r3);
        r2[r14] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x045b, code lost:
    
        if (r4 != null) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x045d, code lost:
    
        r63 = r4;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0461, code lost:
    
        r0 = r4[r14];
        r63 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0465, code lost:
    
        r1[r14] = (r3.f29658n + r13) + r0;
        r14 = r14 + 1;
        r4 = r63;
        r0 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x06bf, code lost:
    
        r0 = Integer.MAX_VALUE;
        r7 = 0;
        r14 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x06c3, code lost:
    
        if (r7 >= r10) goto L654;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x06c5, code lost:
    
        r44 = r10;
        r10 = (androidx.compose.foundation.lazy.staggeredgrid.l0) r32[r7].e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x06d1, code lost:
    
        if (r10 == null) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x06d3, code lost:
    
        r10 = r10.f29645a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x06d6, code lost:
    
        r10 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x06d8, code lost:
    
        if (r0 <= r10) goto L656;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x06da, code lost:
    
        r14 = r7;
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x06dc, code lost:
    
        r7 = r7 + 1;
        r10 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x06e1, code lost:
    
        r44 = r10;
        r0 = (androidx.compose.foundation.lazy.staggeredgrid.l0) r32[r14].removeFirst();
        r7 = r0.f29649e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x06ed, code lost:
    
        if (r7 == r14) goto L648;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x06ef, code lost:
    
        r0 = r26;
        r10 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x06f4, code lost:
    
        r58 = r11;
        r57 = r12;
        r59 = r4;
        r43 = r5;
        r4 = ((r0.f29650f + r7) & 4294967295L) | (r7 << 32);
        r7 = c(r3, r4);
        r8 = r8.f29676a[r14];
        r12 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0719, code lost:
    
        if ((r0.f29657m + r7) < r12) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x071b, code lost:
    
        r11 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x071d, code lost:
    
        if (r7 > r11) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x071f, code lost:
    
        r0.p(r7, r8, r15);
        r6.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0725, code lost:
    
        r39 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0727, code lost:
    
        r8 = (int) (r4 >> 32);
        r4 = (int) (r4 & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0733, code lost:
    
        if (r8 >= r4) goto L657;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0735, code lost:
    
        r3[r8] = r0.f29658n + r7;
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x073d, code lost:
    
        r35 = r12;
        r0 = r26;
        r5 = r43;
        r10 = r44;
        r12 = r57;
        r11 = r58;
        r4 = r59;
     */
    /* JADX WARN: Removed duplicated region for block: B:402:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0874  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0a02  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0a46  */
    /* JADX WARN: Removed duplicated region for block: B:668:0x091f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.lazy.staggeredgrid.C20770i0 d(androidx.compose.foundation.lazy.staggeredgrid.C20758c0 r60, int r61, int[] r62, int[] r63, boolean r64) {
        /*
            Method dump skipped, instructions count: 3176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.C20760d0.d(androidx.compose.foundation.lazy.staggeredgrid.c0, int, int[], int[], boolean):androidx.compose.foundation.lazy.staggeredgrid.i0");
    }

    public static final boolean e(int[] iArr, C20758c0 c20758c0, int[] iArr2, int i12) {
        int length = iArr.length;
        int i13 = 0;
        while (true) {
            Y y12 = c20758c0.f29608s;
            if (i13 >= length) {
                int length2 = iArr.length;
                for (int i14 = 0; i14 < length2; i14++) {
                    if (y12.d(iArr[i14], i14) != -1 && iArr2[i14] >= iArr2[i12]) {
                        return true;
                    }
                }
                int iF2 = y12.f(0);
                return (iF2 == 0 || iF2 == -1 || iF2 == -2) ? false : true;
            }
            if (y12.d(iArr[i13], i13) == -1 && iArr2[i13] != iArr2[i12]) {
                return true;
            }
            i13++;
        }
    }

    public static final void f(int i12, int[] iArr) {
        int length = iArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            iArr[i13] = iArr[i13] + i12;
        }
    }
}

package androidx.compose.ui.text;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import androidx.compose.ui.graphics.C22245c;
import androidx.compose.ui.graphics.C22247d;
import androidx.compose.ui.graphics.C22277p;
import androidx.compose.ui.graphics.X0;
import androidx.compose.ui.graphics.f1;
import androidx.compose.ui.text.font.E;
import androidx.compose.ui.text.platform.f;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.C22712b;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import l0.n;
import y0.C50028a;

/* compiled from: AndroidParagraph.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBk\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0014\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u00110\u0010\u0012\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00110\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\n\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/text/b;", "Landroidx/compose/ui/text/L;", "Landroidx/compose/ui/text/platform/g;", "paragraphIntrinsics", "", "maxLines", "Landroidx/compose/ui/text/style/s;", "overflow", "Landroidx/compose/ui/unit/b;", "constraints", "<init>", "(Landroidx/compose/ui/text/platform/g;IIJLkotlin/jvm/internal/w;)V", "", "text", "Landroidx/compose/ui/text/x0;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "Landroidx/compose/ui/text/e$e;", "Landroidx/compose/ui/text/e$a;", "annotations", "Landroidx/compose/ui/text/U;", "placeholders", "Landroidx/compose/ui/text/font/E$b;", "fontFamilyResolver", "Landroidx/compose/ui/unit/d;", "density", "(Ljava/lang/String;Landroidx/compose/ui/text/x0;Ljava/util/List;Ljava/util/List;IIJLandroidx/compose/ui/text/font/E$b;Landroidx/compose/ui/unit/d;Lkotlin/jvm/internal/w;)V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22578b implements L {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.text.platform.g f42039a;

    /* renamed from: b, reason: collision with root package name */
    public final int f42040b;

    /* renamed from: c, reason: collision with root package name */
    public final long f42041c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.text.android.M f42042d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final CharSequence f42043e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Object f42044f;

    /* compiled from: AndroidParagraph.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.b$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ResolvedTextDirection.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ResolvedTextDirection resolvedTextDirection = ResolvedTextDirection.f42625b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: AndroidParagraph.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "segmentBounds", "Landroid/graphics/RectF;", "area", "invoke", "(Landroid/graphics/RectF;Landroid/graphics/RectF;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.b$b, reason: collision with other inner class name */
    public static final class C1682b extends kotlin.jvm.internal.N implements Y41.p<RectF, RectF, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0 f42045l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1682b(l0 l0Var) {
            super(2);
            this.f42045l = l0Var;
        }

        @Override // Y41.p
        public final Boolean invoke(RectF rectF, RectF rectF2) {
            return Boolean.valueOf(this.f42045l.b(X0.e(rectF), X0.e(rectF2)));
        }
    }

    public C22578b() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e6  */
    /* JADX WARN: Type inference failed for: r10v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4, types: [androidx.compose.ui.text.b] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C22578b(androidx.compose.ui.text.platform.g r26, int r27, int r28, long r29, kotlin.jvm.internal.C42822w r31) {
        /*
            Method dump skipped, instructions count: 1142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.C22578b.<init>(androidx.compose.ui.text.platform.g, int, int, long, kotlin.jvm.internal.w):void");
    }

    public final void A(androidx.compose.ui.graphics.M m12) {
        Canvas canvas = C22247d.f39473a;
        Canvas canvas2 = ((C22245c) m12).f39351a;
        androidx.compose.ui.text.android.M m13 = this.f42042d;
        if (m13.f41987e) {
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        if (canvas2.getClipBounds(m13.f41999q)) {
            int i12 = m13.f41991i;
            if (i12 != 0) {
                canvas2.translate(0.0f, i12);
            }
            androidx.compose.ui.text.android.L l12 = androidx.compose.ui.text.android.O.f42001a;
            l12.f41982a = canvas2;
            m13.f41989g.draw(l12);
            if (i12 != 0) {
                canvas2.translate(0.0f, (-1) * i12);
            }
        }
        if (m13.f41987e) {
            canvas2.restore();
        }
    }

    @Override // androidx.compose.ui.text.L
    public final float a(int i12) {
        androidx.compose.ui.text.android.M m12 = this.f42042d;
        return m12.f41989g.getLineLeft(i12) + (i12 == m12.f41990h + (-1) ? m12.f41993k : 0.0f);
    }

    @Override // androidx.compose.ui.text.L
    public final float b(int i12) {
        androidx.compose.ui.text.android.M m12 = this.f42042d;
        return m12.f41989g.getLineRight(i12) + (i12 == m12.f41990h + (-1) ? m12.f41994l : 0.0f);
    }

    @Override // androidx.compose.ui.text.L
    @Y61.k
    public final ResolvedTextDirection c(int i12) {
        androidx.compose.ui.text.android.M m12 = this.f42042d;
        return m12.f41989g.getParagraphDirection(m12.f41989g.getLineForOffset(i12)) == 1 ? ResolvedTextDirection.f42625b : ResolvedTextDirection.f42626c;
    }

    @Override // androidx.compose.ui.text.L
    public final float d(int i12) {
        return this.f42042d.h(i12);
    }

    @Override // androidx.compose.ui.text.L
    public final float e() {
        return this.f42042d.e(0);
    }

    @Override // androidx.compose.ui.text.L
    public final int f(int i12) {
        return this.f42042d.f41989g.getLineStart(i12);
    }

    @Override // androidx.compose.ui.text.L
    @Y61.k
    public final l0.j g(int i12) {
        CharSequence charSequence = this.f42043e;
        if (i12 < 0 || i12 > charSequence.length()) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "offset(", ") is out of bounds [0,");
            sbJ.append(charSequence.length());
            sbJ.append(']');
            C50028a.a(sbJ.toString());
        }
        androidx.compose.ui.text.android.M m12 = this.f42042d;
        float fI2 = m12.i(i12, false);
        int lineForOffset = m12.f41989g.getLineForOffset(i12);
        return new l0.j(fI2, m12.h(lineForOffset), fI2, m12.f(lineForOffset));
    }

    @Override // androidx.compose.ui.text.L
    public final float getHeight() {
        return this.f42042d.b();
    }

    @Override // androidx.compose.ui.text.L
    public final float getWidth() {
        return C22712b.j(this.f42041c);
    }

    @Override // androidx.compose.ui.text.L
    public final float h() {
        return this.f42042d.e(r0.f41990h - 1);
    }

    @Override // androidx.compose.ui.text.L
    public final int i(int i12) {
        return this.f42042d.f41989g.getLineForOffset(i12);
    }

    @Override // androidx.compose.ui.text.L
    @Y61.k
    public final l0.j j(int i12) {
        float fJ2;
        float fJ3;
        float fI2;
        float fI3;
        CharSequence charSequence = this.f42043e;
        if (!(i12 >= 0 && i12 < charSequence.length())) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "offset(", ") is out of bounds [0,");
            sbJ.append(charSequence.length());
            sbJ.append(')');
            C50028a.a(sbJ.toString());
        }
        androidx.compose.ui.text.android.M m12 = this.f42042d;
        Layout layout = m12.f41989g;
        int lineForOffset = layout.getLineForOffset(i12);
        float fH2 = m12.h(lineForOffset);
        float f12 = m12.f(lineForOffset);
        boolean z12 = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(i12);
        if (!z12 || zIsRtlCharAt) {
            if (z12 && zIsRtlCharAt) {
                fI2 = m12.j(i12, false);
                fI3 = m12.j(i12 + 1, true);
            } else if (zIsRtlCharAt) {
                fI2 = m12.i(i12, false);
                fI3 = m12.i(i12 + 1, true);
            } else {
                fJ2 = m12.j(i12, false);
                fJ3 = m12.j(i12 + 1, true);
            }
            float f13 = fI2;
            fJ2 = fI3;
            fJ3 = f13;
        } else {
            fJ2 = m12.i(i12, false);
            fJ3 = m12.i(i12 + 1, true);
        }
        RectF rectF = new RectF(fJ2, fH2, fJ3, f12);
        return new l0.j(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // androidx.compose.ui.text.L
    public final long k(int i12) {
        int i13;
        int iH2;
        int iH3;
        w0.i iVarK = this.f42042d.k();
        if (iVarK.g(iVarK.i(i12))) {
            iVarK.a(i12);
            i13 = i12;
            while (i13 != -1 && (!iVarK.g(i13) || iVarK.c(i13))) {
                i13 = iVarK.i(i13);
            }
        } else {
            iVarK.a(i12);
            i13 = iVarK.f(i12) ? (!iVarK.d(i12) || iVarK.b(i12)) ? iVarK.i(i12) : i12 : iVarK.b(i12) ? iVarK.i(i12) : -1;
        }
        if (i13 == -1) {
            i13 = i12;
        }
        if (iVarK.c(iVarK.h(i12))) {
            iVarK.a(i12);
            iH2 = i12;
            while (iH2 != -1 && (iVarK.g(iH2) || !iVarK.c(iH2))) {
                iH2 = iVarK.h(iH2);
            }
        } else {
            iVarK.a(i12);
            if (iVarK.b(i12)) {
                iH3 = (!iVarK.d(i12) || iVarK.f(i12)) ? iVarK.h(i12) : i12;
            } else if (iVarK.f(i12)) {
                iH3 = iVarK.h(i12);
            } else {
                iH2 = -1;
            }
            iH2 = iH3;
        }
        if (iH2 != -1) {
            i12 = iH2;
        }
        return w0.a(i13, i12);
    }

    @Override // androidx.compose.ui.text.L
    public final int l(long j12) {
        int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (4294967295L & j12));
        androidx.compose.ui.text.android.M m12 = this.f42042d;
        int i12 = iIntBitsToFloat - m12.f41991i;
        Layout layout = m12.f41989g;
        int lineForVertical = layout.getLineForVertical(i12);
        return layout.getOffsetForHorizontal(lineForVertical, (m12.c(lineForVertical) * (-1)) + Float.intBitsToFloat((int) (j12 >> 32)));
    }

    @Override // androidx.compose.ui.text.L
    public final int m(int i12, boolean z12) {
        androidx.compose.ui.text.android.M m12 = this.f42042d;
        if (!z12) {
            return m12.g(i12);
        }
        Layout layout = m12.f41989g;
        androidx.compose.ui.text.android.L l12 = androidx.compose.ui.text.android.O.f42001a;
        if (layout.getEllipsisCount(i12) > 0 && m12.f41984b == TextUtils.TruncateAt.END) {
            return layout.getEllipsisStart(i12) + layout.getLineStart(i12);
        }
        androidx.compose.ui.text.android.r rVarD = m12.d();
        Layout layout2 = rVarD.f42022a;
        return rVarD.f(layout2.getLineEnd(i12), layout2.getLineStart(i12));
    }

    @Override // androidx.compose.ui.text.L
    public final float n(int i12) {
        androidx.compose.ui.text.android.M m12 = this.f42042d;
        return m12.f(i12) - m12.h(i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Type inference failed for: r1v21, types: [androidx.compose.ui.text.android.a] */
    @Override // androidx.compose.ui.text.L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long o(@Y61.k l0.j r22, int r23, @Y61.k androidx.compose.ui.text.l0 r24) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.C22578b.o(l0.j, int, androidx.compose.ui.text.l0):long");
    }

    @Override // androidx.compose.ui.text.L
    public final int p(float f12) {
        androidx.compose.ui.text.android.M m12 = this.f42042d;
        return m12.f41989g.getLineForVertical(((int) f12) - m12.f41991i);
    }

    @Override // androidx.compose.ui.text.L
    public final void q(long j12, @Y61.k float[] fArr, @j.F int i12) {
        this.f42042d.a(v0.g(j12), v0.f(j12), i12, fArr);
    }

    @Override // androidx.compose.ui.text.L
    public final float r(int i12) {
        return this.f42042d.f(i12);
    }

    @Override // androidx.compose.ui.text.L
    public final void s(@Y61.k androidx.compose.ui.graphics.M m12, long j12, @Y61.l f1 f1Var, @Y61.l androidx.compose.ui.text.style.j jVar, @Y61.l androidx.compose.ui.graphics.drawscope.j jVar2, int i12) {
        androidx.compose.ui.text.platform.g gVar = this.f42039a;
        androidx.compose.ui.text.platform.m mVar = gVar.f42561g;
        int i13 = mVar.f42571c;
        mVar.d(j12);
        mVar.f(f1Var);
        mVar.g(jVar);
        mVar.e(jVar2);
        mVar.b(i12);
        A(m12);
        gVar.f42561g.b(i13);
    }

    @Override // androidx.compose.ui.text.L
    public final boolean t(int i12) {
        Layout layout = this.f42042d.f41989g;
        androidx.compose.ui.text.android.L l12 = androidx.compose.ui.text.android.O.f42001a;
        return layout.getEllipsisCount(i12) > 0;
    }

    @Override // androidx.compose.ui.text.L
    @Y61.k
    public final C22277p u(int i12, int i13) {
        CharSequence charSequence = this.f42043e;
        if (i12 < 0 || i12 > i13 || i13 > charSequence.length()) {
            StringBuilder sbY = androidx.appcompat.app.r.y(i12, i13, "start(", ") or end(", ") is out of range [0..");
            sbY.append(charSequence.length());
            sbY.append("], or start > end!");
            C50028a.a(sbY.toString());
        }
        Path path = new Path();
        androidx.compose.ui.text.android.M m12 = this.f42042d;
        m12.f41989g.getSelectionPath(i12, i13, path);
        int i14 = m12.f41991i;
        if (i14 != 0 && !path.isEmpty()) {
            path.offset(0.0f, i14);
        }
        return new C22277p(path);
    }

    @Override // androidx.compose.ui.text.L
    public final float v(int i12, boolean z12) {
        androidx.compose.ui.text.android.M m12 = this.f42042d;
        return z12 ? m12.i(i12, false) : m12.j(i12, false);
    }

    @Override // androidx.compose.ui.text.L
    public final void w(@Y61.k androidx.compose.ui.graphics.M m12, @Y61.k androidx.compose.ui.graphics.J j12, float f12, @Y61.l f1 f1Var, @Y61.l androidx.compose.ui.text.style.j jVar, @Y61.l androidx.compose.ui.graphics.drawscope.j jVar2, int i12) {
        androidx.compose.ui.text.platform.g gVar = this.f42039a;
        androidx.compose.ui.text.platform.m mVar = gVar.f42561g;
        int i13 = mVar.f42571c;
        float width = getWidth();
        float height = getHeight();
        long jFloatToRawIntBits = (Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        n.a aVar = l0.n.f413402b;
        mVar.c(j12, jFloatToRawIntBits, f12);
        mVar.f(f1Var);
        mVar.g(jVar);
        mVar.e(jVar2);
        mVar.b(i12);
        A(m12);
        gVar.f42561g.b(i13);
    }

    @Override // androidx.compose.ui.text.L
    @Y61.k
    public final ResolvedTextDirection x(int i12) {
        return this.f42042d.f41989g.isRtlCharAt(i12) ? ResolvedTextDirection.f42626c : ResolvedTextDirection.f42625b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<l0.j>] */
    @Override // androidx.compose.ui.text.L
    @Y61.k
    public final List<l0.j> y() {
        return this.f42044f;
    }

    public final androidx.compose.ui.text.android.M z(int i12, int i13, TextUtils.TruncateAt truncateAt, int i14, int i15, int i16, int i17, int i18, CharSequence charSequence) {
        W w12;
        float width = getWidth();
        androidx.compose.ui.text.platform.g gVar = this.f42039a;
        androidx.compose.ui.text.platform.m mVar = gVar.f42561g;
        f.a aVar = androidx.compose.ui.text.platform.f.f42554a;
        Z z12 = gVar.f42556b.platformStyle;
        return new androidx.compose.ui.text.android.M(charSequence, width, mVar, i12, truncateAt, gVar.f42566l, 1.0f, 0.0f, (z12 == null || (w12 = z12.f41972b) == null) ? false : w12.f41967a, true, i14, i16, i17, i18, i15, i13, null, null, gVar.f42563i, 196736, null);
    }

    public C22578b(String str, x0 x0Var, List list, List list2, int i12, int i13, long j12, E.b bVar, androidx.compose.ui.unit.d dVar, C42822w c42822w) {
        this(new androidx.compose.ui.text.platform.g(str, x0Var, list, list2, bVar, dVar), i12, i13, j12, null);
    }
}

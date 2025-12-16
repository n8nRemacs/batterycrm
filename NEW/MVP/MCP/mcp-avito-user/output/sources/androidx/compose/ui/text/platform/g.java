package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import androidx.camera.core.impl.r0;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.O;
import androidx.compose.ui.text.U;
import androidx.compose.ui.text.android.C22573l;
import androidx.compose.ui.text.font.C0;
import androidx.compose.ui.text.font.C22605a0;
import androidx.compose.ui.text.font.E;
import androidx.compose.ui.text.font.Z;
import androidx.compose.ui.text.font.e0;
import androidx.compose.ui.text.x0;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AndroidParagraphIntrinsics.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/platform/g;", "Landroidx/compose/ui/text/O;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g implements O {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f42555a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final x0 f42556b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<C22602e.C1684e<? extends C22602e.a>> f42557c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<C22602e.C1684e<U>> f42558d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final E.b f42559e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.unit.d f42560f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final m f42561g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final CharSequence f42562h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.text.android.t f42563i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public B f42564j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f42565k;

    /* renamed from: l, reason: collision with root package name */
    public final int f42566l;

    /* compiled from: AndroidParagraphIntrinsics.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/text/font/E;", "fontFamily", "Landroidx/compose/ui/text/font/e0;", "fontWeight", "Landroidx/compose/ui/text/font/Z;", "fontStyle", "Landroidx/compose/ui/text/font/a0;", "fontSynthesis", "Landroid/graphics/Typeface;", "invoke-DPcqOEQ", "(Landroidx/compose/ui/text/font/E;Landroidx/compose/ui/text/font/e0;II)Landroid/graphics/Typeface;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.r<E, e0, Z, C22605a0, Typeface> {
        public a() {
            super(4);
        }

        @Override // Y41.r
        public final Typeface invoke(E e12, e0 e0Var, Z z12, C22605a0 c22605a0) {
            int i12 = z12.f42219a;
            int i13 = c22605a0.f42227a;
            g gVar = g.this;
            C0 c0A = gVar.f42559e.a(e12, e0Var, i12, i13);
            if (c0A instanceof C0.b) {
                return (Typeface) ((C0.b) c0A).f42167b;
            }
            B b12 = new B(c0A, gVar.f42564j);
            gVar.f42564j = b12;
            return (Typeface) b12.f42544c;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05b6  */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List<androidx.compose.ui.text.e$e<? extends androidx.compose.ui.text.e$a>>] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r40v0, types: [java.util.List, java.util.List<? extends androidx.compose.ui.text.e$e<? extends androidx.compose.ui.text.e$a>>, java.util.List<androidx.compose.ui.text.e$e<? extends androidx.compose.ui.text.e$a>>] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28, types: [android.text.Spannable, android.text.Spanned, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v30, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v63 */
    /* JADX WARN: Type inference failed for: r8v64 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(@Y61.k java.lang.String r38, @Y61.k androidx.compose.ui.text.x0 r39, @Y61.k java.util.List<? extends androidx.compose.ui.text.C22602e.C1684e<? extends androidx.compose.ui.text.C22602e.a>> r40, @Y61.k java.util.List<androidx.compose.ui.text.C22602e.C1684e<androidx.compose.ui.text.U>> r41, @Y61.k androidx.compose.ui.text.font.E.b r42, @Y61.k androidx.compose.ui.unit.d r43) {
        /*
            Method dump skipped, instructions count: 1770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.g.<init>(java.lang.String, androidx.compose.ui.text.x0, java.util.List, java.util.List, androidx.compose.ui.text.font.E$b, androidx.compose.ui.unit.d):void");
    }

    @Override // androidx.compose.ui.text.O
    public final float a() {
        return this.f42563i.c();
    }

    @Override // androidx.compose.ui.text.O
    public final boolean b() {
        B b12 = this.f42564j;
        if (!(b12 != null ? b12.a() : false)) {
            if (this.f42565k || !h.a(this.f42556b)) {
                return false;
            }
            v.f42611a.getClass();
            t tVar = (t) v.f42612b;
            I3<Boolean> i3A = tVar.f42607a;
            if (i3A == null) {
                if (androidx.emoji2.text.e.g()) {
                    i3A = tVar.a();
                    tVar.f42607a = i3A;
                } else {
                    i3A = x.f42613a;
                }
            }
            if (!i3A.getF42167b().booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.text.O
    public final float c() {
        float f12;
        androidx.compose.ui.text.android.t tVar = this.f42563i;
        if (!Float.isNaN(tVar.f42034e)) {
            return tVar.f42034e;
        }
        TextPaint textPaint = tVar.f42031b;
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = tVar.f42030a;
        lineInstance.setText(new C22573l(charSequence.length(), charSequence));
        PriorityQueue priorityQueue = new PriorityQueue(10, new r0(3));
        int i12 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Q(Integer.valueOf(i12), Integer.valueOf(next)));
            } else {
                Q q12 = (Q) priorityQueue.peek();
                if (q12 != null && ((Number) q12.f406620c).intValue() - ((Number) q12.f406619b).intValue() < next - i12) {
                    priorityQueue.poll();
                    priorityQueue.add(new Q(Integer.valueOf(i12), Integer.valueOf(next)));
                }
            }
            i12 = next;
        }
        if (priorityQueue.isEmpty()) {
            f12 = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Q q13 = (Q) it.next();
            float desiredWidth = Layout.getDesiredWidth(tVar.b(), ((Number) q13.f406619b).intValue(), ((Number) q13.f406620c).intValue(), textPaint);
            while (it.hasNext()) {
                Q q14 = (Q) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(tVar.b(), ((Number) q14.f406619b).intValue(), ((Number) q14.f406620c).intValue(), textPaint));
            }
            f12 = desiredWidth;
        }
        tVar.f42034e = f12;
        return f12;
    }
}

package I21;

import J21.d;
import J21.e;
import K21.c;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.yandex.div.internal.widget.indicator.IndicatorParams;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;

/* compiled from: PagerIndicatorView.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LI21/b;", "Landroid/view/View;", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$d;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lkotlin/G0;", "setStyle", "(Lcom/yandex/div/internal/widget/indicator/IndicatorParams$d;)V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class b extends View {

    /* renamed from: b, reason: collision with root package name */
    @l
    public I21.a f7897b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public ViewPager2 f7898c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public IndicatorParams.d f7899d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a f7900e;

    /* compiled from: PagerIndicatorView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"I21/b$a", "Landroidx/viewpager2/widget/ViewPager2$i;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a extends ViewPager2.i {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x000c A[PHI: r1
  0x000c: PHI (r1v3 float) = (r1v0 float), (r1v1 float) binds: [B:6:0x000a, B:9:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // androidx.viewpager2.widget.ViewPager2.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onPageScrolled(int r4, float r5, int r6) {
            /*
                r3 = this;
                I21.b r6 = I21.b.this
                I21.a r0 = r6.f7897b
                if (r0 != 0) goto L7
                goto L24
            L7:
                r1 = 0
                int r2 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r2 >= 0) goto Le
            Lc:
                r5 = r1
                goto L15
            Le:
                r1 = 1065353216(0x3f800000, float:1.0)
                int r2 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r2 <= 0) goto L15
                goto Lc
            L15:
                r0.f7892l = r4
                r0.f7893m = r5
                J21.a r1 = r0.f7883c
                r1.i(r5, r4)
                r0.a(r5, r4)
                r6.invalidate()
            L24:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: I21.b.a.onPageScrolled(int, float, int):void");
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public final void onPageSelected(int i12) {
            b bVar = b.this;
            I21.a aVar = bVar.f7897b;
            if (aVar == null) {
                return;
            }
            aVar.f7892l = i12;
            aVar.f7893m = 0.0f;
            aVar.f7883c.b(i12);
            aVar.a(0.0f, i12);
            bVar.invalidate();
        }
    }

    public /* synthetic */ b(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
    }

    public final void a(I21.a aVar) {
        ViewPager2 viewPager2 = this.f7898c;
        if (viewPager2 == null) {
            return;
        }
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            aVar.f7884d = itemCount;
            aVar.f7883c.h(itemCount);
            aVar.b();
            aVar.f7887g = (aVar.f7890j - (aVar.f7888h * (aVar.f7885e - 1))) / 2.0f;
            aVar.f7886f = aVar.f7891k / 2.0f;
        }
        int currentItem = viewPager2.getCurrentItem();
        aVar.f7892l = currentItem;
        aVar.f7893m = 0.0f;
        aVar.f7883c.b(currentItem);
        aVar.a(0.0f, currentItem);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(@k Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate(getPaddingLeft(), getPaddingTop());
        I21.a aVar = this.f7897b;
        if (aVar == null) {
            return;
        }
        int i12 = aVar.f7895o;
        int i13 = aVar.f7896p;
        J21.a aVar2 = aVar.f7883c;
        c cVar = aVar.f7882b;
        if (i12 <= i13) {
            while (true) {
                int i14 = i12 + 1;
                float f12 = ((aVar.f7888h * i12) + aVar.f7887g) - aVar.f7894n;
                if (0.0f <= f12 && f12 <= aVar.f7890j) {
                    IndicatorParams.b bVarF = aVar2.f(i12);
                    float f13 = aVar.f7889i;
                    if (f13 != 1.0f && (bVarF instanceof IndicatorParams.b.C10931b)) {
                        IndicatorParams.b.C10931b c10931b = (IndicatorParams.b.C10931b) bVarF;
                        IndicatorParams.b.C10931b c10931b2 = new IndicatorParams.b.C10931b(c10931b.f370290a * f13, c10931b.f370291b, c10931b.f370292c);
                        aVar2.d(c10931b2.f370290a);
                        bVarF = c10931b2;
                    }
                    if (aVar.f7884d > aVar.f7885e) {
                        float f14 = aVar.f7888h * 1.3f;
                        IndicatorParams.d dVar = aVar.f7881a;
                        float fB2 = dVar.f370301c.b().b() / 2;
                        if (i12 == 0 || i12 == aVar.f7884d - 1) {
                            f14 = fB2;
                        }
                        int i15 = aVar.f7890j;
                        IndicatorParams.c cVar2 = dVar.f370302d;
                        if (f12 < f14) {
                            float fB3 = (bVarF.b() * f12) / f14;
                            if (fB3 <= cVar2.b().b()) {
                                bVarF = cVar2.b();
                            } else if (fB3 < bVarF.b()) {
                                if (bVarF instanceof IndicatorParams.b.C10931b) {
                                    IndicatorParams.b.C10931b c10931b3 = (IndicatorParams.b.C10931b) bVarF;
                                    c10931b3.f370290a = fB3;
                                    c10931b3.f370291b = (c10931b3.f370291b * f12) / f14;
                                } else if (bVarF instanceof IndicatorParams.b.a) {
                                    ((IndicatorParams.b.a) bVarF).f370289a = fB3;
                                }
                            }
                        } else {
                            float f15 = i15;
                            if (f12 > f15 - f14) {
                                float f16 = (-f12) + f15;
                                float fB4 = (bVarF.b() * f16) / f14;
                                if (fB4 <= cVar2.b().b()) {
                                    bVarF = cVar2.b();
                                } else if (fB4 < bVarF.b()) {
                                    if (bVarF instanceof IndicatorParams.b.C10931b) {
                                        IndicatorParams.b.C10931b c10931b4 = (IndicatorParams.b.C10931b) bVarF;
                                        c10931b4.f370290a = fB4;
                                        c10931b4.f370291b = (c10931b4.f370291b * f16) / f14;
                                    } else if (bVarF instanceof IndicatorParams.b.a) {
                                        ((IndicatorParams.b.a) bVarF).f370289a = fB4;
                                    }
                                }
                            }
                        }
                    }
                    cVar.b(canvas, f12, aVar.f7886f, bVarF, aVar2.k(i12), aVar2.e(i12), aVar2.g(i12));
                }
                if (i12 == i13) {
                    break;
                } else {
                    i12 = i14;
                }
            }
        }
        RectF rectFJ = aVar2.j(((aVar.f7888h * aVar.f7892l) + aVar.f7887g) - aVar.f7894n, aVar.f7886f);
        if (rectFJ != null) {
            cVar.a(canvas, rectFJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            int r9 = android.view.View.MeasureSpec.getSize(r9)
            com.yandex.div.internal.widget.indicator.IndicatorParams$d r1 = r7.f7899d
            r2 = 0
            if (r1 != 0) goto Lf
        Ld:
            r1 = r2
            goto L1c
        Lf:
            com.yandex.div.internal.widget.indicator.IndicatorParams$c r1 = r1.f370300b
            com.yandex.div.internal.widget.indicator.IndicatorParams$b r1 = r1.b()
            if (r1 != 0) goto L18
            goto Ld
        L18:
            float r1 = r1.a()
        L1c:
            int r3 = r7.getPaddingTop()
            float r3 = (float) r3
            float r1 = r1 + r3
            int r3 = r7.getPaddingBottom()
            float r3 = (float) r3
            float r1 = r1 + r3
            int r1 = (int) r1
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r4) goto L33
            if (r0 == r3) goto L37
            r9 = r1
            goto L37
        L33:
            int r9 = java.lang.Math.min(r1, r9)
        L37:
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            int r8 = android.view.View.MeasureSpec.getSize(r8)
            com.yandex.div.internal.widget.indicator.IndicatorParams$d r1 = r7.f7899d
            if (r1 != 0) goto L44
            goto L51
        L44:
            com.yandex.div.internal.widget.indicator.IndicatorParams$c r1 = r1.f370300b
            com.yandex.div.internal.widget.indicator.IndicatorParams$b r1 = r1.b()
            if (r1 != 0) goto L4d
            goto L51
        L4d:
            float r2 = r1.b()
        L51:
            com.yandex.div.internal.widget.indicator.IndicatorParams$d r1 = r7.f7899d
            if (r1 != 0) goto L57
            r1 = 0
            goto L59
        L57:
            com.yandex.div.internal.widget.indicator.IndicatorParams$a r1 = r1.f370303e
        L59:
            boolean r5 = r1 instanceof com.yandex.div.internal.widget.indicator.IndicatorParams.a.C10930a
            if (r5 == 0) goto L81
            com.yandex.div.internal.widget.indicator.IndicatorParams$a$a r1 = (com.yandex.div.internal.widget.indicator.IndicatorParams.a.C10930a) r1
            float r1 = r1.f370286a
            androidx.viewpager2.widget.ViewPager2 r5 = r7.f7898c
            r6 = 0
            if (r5 != 0) goto L67
            goto L72
        L67:
            androidx.recyclerview.widget.RecyclerView$Adapter r5 = r5.getAdapter()
            if (r5 != 0) goto L6e
            goto L72
        L6e:
            int r6 = r5.getItemCount()
        L72:
            float r5 = (float) r6
            float r1 = r1 * r5
            float r1 = r1 + r2
            int r1 = (int) r1
            int r2 = r7.getPaddingLeft()
            int r2 = r2 + r1
            int r1 = r7.getPaddingRight()
        L7f:
            int r1 = r1 + r2
            goto L94
        L81:
            boolean r5 = r1 instanceof com.yandex.div.internal.widget.indicator.IndicatorParams.a.b
            if (r5 == 0) goto L87
            r1 = r8
            goto L94
        L87:
            if (r1 != 0) goto Lbe
            int r1 = (int) r2
            int r2 = r7.getPaddingLeft()
            int r2 = r2 + r1
            int r1 = r7.getPaddingRight()
            goto L7f
        L94:
            if (r0 == r4) goto L9a
            if (r0 == r3) goto L9e
            r8 = r1
            goto L9e
        L9a:
            int r8 = java.lang.Math.min(r1, r8)
        L9e:
            r7.setMeasuredDimension(r8, r9)
            I21.a r0 = r7.f7897b
            if (r0 != 0) goto La6
            goto Lbd
        La6:
            int r1 = r7.getPaddingLeft()
            int r8 = r8 - r1
            int r1 = r7.getPaddingRight()
            int r8 = r8 - r1
            int r1 = r7.getPaddingTop()
            int r9 = r9 - r1
            int r1 = r7.getPaddingBottom()
            int r9 = r9 - r1
            r0.c(r8, r9)
        Lbd:
            return
        Lbe:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: I21.b.onMeasure(int, int):void");
    }

    public final void setStyle(@k IndicatorParams.d style) {
        c aVar;
        J21.a cVar;
        this.f7899d = style;
        IndicatorParams.c cVar2 = style.f370300b;
        if (cVar2 instanceof IndicatorParams.c.b) {
            aVar = new K21.b(style);
        } else {
            if (!(cVar2 instanceof IndicatorParams.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = new K21.a(style);
        }
        int iOrdinal = style.f370299a.ordinal();
        if (iOrdinal == 0) {
            cVar = new J21.c(style);
        } else if (iOrdinal == 1) {
            cVar = new e(style);
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = new d(style);
        }
        I21.a aVar2 = new I21.a(style, aVar, cVar);
        aVar2.c((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        a(aVar2);
        this.f7897b = aVar2;
        requestLayout();
    }

    @j
    public b(@k Context context, @l AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        this.f7900e = new a();
    }
}

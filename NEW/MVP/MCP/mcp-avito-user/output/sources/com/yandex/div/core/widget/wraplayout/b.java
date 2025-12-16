package com.yandex.div.core.widget.wraplayout;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.core.view.C22829k0;
import androidx.core.view.C22833m0;
import com.yandex.div.core.widget.D;
import com.yandex.div.core.widget.F;
import com.yandex.div.core.widget.InterfaceC38049e;
import com.yandex.div.internal.widget.d;
import j.U;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.properties.h;
import kotlin.ranges.s;
import kotlin.reflect.n;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: WrapLayout.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0001LJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R0\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00038\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010\b\u0012\u0004\b\f\u0010\r\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u000bR*\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\u0005\"\u0004\b\u0011\u0010\u000bR0\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00038\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\b\u0013\u0010\b\u0012\u0004\b\u0016\u0010\r\u001a\u0004\b\u0014\u0010\u0005\"\u0004\b\u0015\u0010\u000bR0\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00038\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\b\u0018\u0010\b\u0012\u0004\b\u001b\u0010\r\u001a\u0004\b\u0019\u0010\u0005\"\u0004\b\u001a\u0010\u000bR.\u0010$\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0006\u001a\u0004\u0018\u00010\u001d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R.\u0010(\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0006\u001a\u0004\u0018\u00010\u001d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R+\u00101\u001a\u00020)2\u0006\u0010*\u001a\u00020)8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00103\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0005R\u0014\u00105\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0005R\u0014\u00107\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0005R\u0014\u00109\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0005R\u0014\u0010;\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0005R\u0014\u0010=\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0005R\u0014\u0010?\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u0005R\u0014\u0010A\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u0005R\u0014\u0010C\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0005R\u0014\u0010E\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u0005R\u0014\u0010G\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u0005R\u0016\u0010K\u001a\u0004\u0018\u00010H8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006M"}, d2 = {"Lcom/yandex/div/core/widget/wraplayout/b;", "Lcom/yandex/div/internal/widget/d;", "Lcom/yandex/div/core/widget/e;", "", "getBaseline", "()I", "value", "c", "I", "getWrapDirection", "setWrapDirection", "(I)V", "getWrapDirection$annotations", "()V", "wrapDirection", "d", "getGravity", "setGravity", "gravity", "e", "getShowSeparators", "setShowSeparators", "getShowSeparators$annotations", "showSeparators", "f", "getShowLineSeparators", "setShowLineSeparators", "getShowLineSeparators$annotations", "showLineSeparators", "Landroid/graphics/drawable/Drawable;", "g", "Landroid/graphics/drawable/Drawable;", "getSeparatorDrawable", "()Landroid/graphics/drawable/Drawable;", "setSeparatorDrawable", "(Landroid/graphics/drawable/Drawable;)V", "separatorDrawable", "h", "getLineSeparatorDrawable", "setLineSeparatorDrawable", "lineSeparatorDrawable", "", "<set-?>", "o", "Lkotlin/properties/h;", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "aspectRatio", "getEdgeSeparatorsLength", "edgeSeparatorsLength", "getEdgeLineSeparatorsLength", "edgeLineSeparatorsLength", "getStartSeparatorLength", "startSeparatorLength", "getMiddleSeparatorLength", "middleSeparatorLength", "getEndSeparatorLength", "endSeparatorLength", "getStartLineSeparatorLength", "startLineSeparatorLength", "getMiddleLineSeparatorLength", "middleLineSeparatorLength", "getEndLineSeparatorLength", "endLineSeparatorLength", "getVisibleLinesCount", "visibleLinesCount", "getLargestMainSize", "largestMainSize", "getSumOfCrossSize", "sumOfCrossSize", "Lcom/yandex/div/core/widget/wraplayout/b$a;", "getFirstVisibleLine", "()Lcom/yandex/div/core/widget/wraplayout/b$a;", "firstVisibleLine", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class b extends com.yandex.div.internal.widget.d implements InterfaceC38049e {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f369332p = {m0.f406844a.e(new Y(b.class, "aspectRatio", "getAspectRatio()F", 0))};

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int wrapDirection;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int gravity;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int showSeparators;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int showLineSeparators;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    public Drawable separatorDrawable;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    public Drawable lineSeparatorDrawable;

    /* renamed from: i, reason: collision with root package name */
    public boolean f369339i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final ArrayList f369340j;

    /* renamed from: k, reason: collision with root package name */
    public int f369341k;

    /* renamed from: l, reason: collision with root package name */
    @U
    public int f369342l;

    /* renamed from: m, reason: collision with root package name */
    @U
    public int f369343m;

    /* renamed from: n, reason: collision with root package name */
    public int f369344n;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @k
    public final h aspectRatio;

    /* compiled from: WrapLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/widget/wraplayout/b$a;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f369346a;

        /* renamed from: b, reason: collision with root package name */
        public int f369347b;

        /* renamed from: c, reason: collision with root package name */
        public int f369348c;

        /* renamed from: d, reason: collision with root package name */
        public int f369349d;

        /* renamed from: e, reason: collision with root package name */
        public int f369350e;

        /* renamed from: f, reason: collision with root package name */
        public int f369351f;

        /* renamed from: g, reason: collision with root package name */
        public int f369352g;

        /* renamed from: h, reason: collision with root package name */
        public int f369353h;

        /* renamed from: i, reason: collision with root package name */
        public int f369354i;

        public a() {
            this(0, 0, 0, 0, 0, 0, 0, 0, 0, 511, null);
        }

        public final int a() {
            return this.f369353h - this.f369354i;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f369346a == aVar.f369346a && this.f369347b == aVar.f369347b && this.f369348c == aVar.f369348c && this.f369349d == aVar.f369349d && this.f369350e == aVar.f369350e && this.f369351f == aVar.f369351f && this.f369352g == aVar.f369352g && this.f369353h == aVar.f369353h && this.f369354i == aVar.f369354i;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f369354i) + r.e(this.f369353h, r.e(this.f369352g, r.e(this.f369351f, r.e(this.f369350e, r.e(this.f369349d, r.e(this.f369348c, r.e(this.f369347b, Integer.hashCode(this.f369346a) * 31, 31), 31), 31), 31), 31), 31), 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("WrapLine(firstIndex=");
            sb2.append(this.f369346a);
            sb2.append(", mainSize=");
            sb2.append(this.f369347b);
            sb2.append(", crossSize=");
            sb2.append(this.f369348c);
            sb2.append(", maxBaseline=");
            sb2.append(this.f369349d);
            sb2.append(", maxHeightUnderBaseline=");
            sb2.append(this.f369350e);
            sb2.append(", right=");
            sb2.append(this.f369351f);
            sb2.append(", bottom=");
            sb2.append(this.f369352g);
            sb2.append(", itemCount=");
            sb2.append(this.f369353h);
            sb2.append(", goneItemCount=");
            return r.t(sb2, this.f369354i, ')');
        }

        public a(int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i22, int i23, C42822w c42822w) {
            i12 = (i23 & 1) != 0 ? 0 : i12;
            i13 = (i23 & 2) != 0 ? 0 : i13;
            i14 = (i23 & 4) != 0 ? 0 : i14;
            i15 = (i23 & 8) != 0 ? -1 : i15;
            i16 = (i23 & 16) != 0 ? 0 : i16;
            i17 = (i23 & 32) != 0 ? 0 : i17;
            i18 = (i23 & 64) != 0 ? 0 : i18;
            i19 = (i23 & 128) != 0 ? 0 : i19;
            i22 = (i23 & 256) != 0 ? 0 : i22;
            this.f369346a = i12;
            this.f369347b = i13;
            this.f369348c = i14;
            this.f369349d = i15;
            this.f369350e = i16;
            this.f369351f = i17;
            this.f369352g = i18;
            this.f369353h = i19;
            this.f369354i = i22;
        }
    }

    /* compiled from: WrapLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.widget.wraplayout.b$b, reason: collision with other inner class name */
    public static final class C10890b extends N implements Y41.l<Float, Float> {

        /* renamed from: l, reason: collision with root package name */
        public static final C10890b f369355l = new C10890b();

        public C10890b() {
            super(1);
        }

        @Override // Y41.l
        public final Float invoke(Float f12) {
            return Float.valueOf(s.a(f12.floatValue(), 0.0f));
        }
    }

    public b(@k Context context) {
        super(context, null, 0, 6, null);
        this.gravity = 51;
        this.f369339i = true;
        this.f369340j = new ArrayList();
        this.aspectRatio = F.b(C10890b.f369355l);
    }

    private final int getEdgeLineSeparatorsLength() {
        return getStartLineSeparatorLength() + getEndLineSeparatorLength();
    }

    private final int getEdgeSeparatorsLength() {
        return getStartSeparatorLength() + getEndSeparatorLength();
    }

    private final int getEndLineSeparatorLength() {
        if (n(this.showLineSeparators)) {
            return this.f369343m;
        }
        return 0;
    }

    private final int getEndSeparatorLength() {
        if (n(this.showSeparators)) {
            return this.f369342l;
        }
        return 0;
    }

    private final a getFirstVisibleLine() {
        Object next;
        Iterator it = this.f369340j.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((a) next).a() > 0) {
                break;
            }
        }
        return (a) next;
    }

    private final int getLargestMainSize() {
        Integer num;
        Iterator it = this.f369340j.iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(((a) it.next()).f369347b);
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((a) it.next()).f369347b);
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private final int getMiddleLineSeparatorLength() {
        if (p(this.showLineSeparators)) {
            return this.f369343m;
        }
        return 0;
    }

    private final int getMiddleSeparatorLength() {
        if (p(this.showSeparators)) {
            return this.f369342l;
        }
        return 0;
    }

    private final int getStartLineSeparatorLength() {
        if (o(this.showLineSeparators)) {
            return this.f369343m;
        }
        return 0;
    }

    private final int getStartSeparatorLength() {
        if (o(this.showSeparators)) {
            return this.f369342l;
        }
        return 0;
    }

    private final int getSumOfCrossSize() {
        Iterator it = this.f369340j.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            i12 += ((a) it.next()).f369348c;
        }
        int edgeLineSeparatorsLength = i12 + getEdgeLineSeparatorsLength();
        return H.b(getVisibleLinesCount(), 1, getMiddleLineSeparatorLength(), edgeLineSeparatorsLength);
    }

    private final int getVisibleLinesCount() {
        ArrayList arrayList = this.f369340j;
        int i12 = 0;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((a) it.next()).a() > 0 && (i12 = i12 + 1) < 0) {
                    C42745f0.G0();
                    throw null;
                }
            }
        }
        return i12;
    }

    public static G0 i(Drawable drawable, Canvas canvas, int i12, int i13, int i14, int i15) {
        if (drawable == null) {
            return null;
        }
        float f12 = (i12 + i14) / 2.0f;
        float f13 = (i13 + i15) / 2.0f;
        float intrinsicWidth = drawable.getIntrinsicWidth() / 2.0f;
        float intrinsicHeight = drawable.getIntrinsicHeight() / 2.0f;
        drawable.setBounds((int) (f12 - intrinsicWidth), (int) (f13 - intrinsicHeight), (int) (f12 + intrinsicWidth), (int) (f13 + intrinsicHeight));
        drawable.draw(canvas);
        return G0.f406611a;
    }

    public static boolean n(@D int i12) {
        return (i12 & 4) != 0;
    }

    public static boolean o(@D int i12) {
        return (i12 & 1) != 0;
    }

    public static boolean p(@D int i12) {
        return (i12 & 2) != 0;
    }

    public final void f(a aVar) {
        this.f369340j.add(aVar);
        int i12 = aVar.f369349d;
        if (i12 > 0) {
            aVar.f369348c = Math.max(aVar.f369348c, i12 + aVar.f369350e);
        }
        this.f369344n += aVar.f369348c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public float getAspectRatio() {
        return ((Number) this.aspectRatio.getValue(this, f369332p[0])).floatValue();
    }

    @Override // android.view.View
    public int getBaseline() {
        a firstVisibleLine = getFirstVisibleLine();
        Integer numValueOf = firstVisibleLine == null ? null : Integer.valueOf(getPaddingTop() + firstVisibleLine.f369349d);
        return numValueOf == null ? super.getBaseline() : numValueOf.intValue();
    }

    public final int getGravity() {
        return this.gravity;
    }

    @l
    public final Drawable getLineSeparatorDrawable() {
        return this.lineSeparatorDrawable;
    }

    @l
    public final Drawable getSeparatorDrawable() {
        return this.separatorDrawable;
    }

    public final int getShowLineSeparators() {
        return this.showLineSeparators;
    }

    public final int getShowSeparators() {
        return this.showSeparators;
    }

    public final int getWrapDirection() {
        return this.wrapDirection;
    }

    public final void h(int i12, int i13, int i14) {
        ArrayList arrayList = this.f369340j;
        if (arrayList.size() != 0 && View.MeasureSpec.getMode(i12) == 1073741824) {
            int size = View.MeasureSpec.getSize(i12);
            if (arrayList.size() == 1) {
                ((a) arrayList.get(0)).f369348c = size - i14;
                return;
            }
            int sumOfCrossSize = getSumOfCrossSize() + i14;
            if (i13 != 1) {
                if (i13 != 5) {
                    if (i13 != 16) {
                        if (i13 != 80) {
                            return;
                        }
                    }
                }
                a aVar = new a(0, 0, 0, 0, 0, 0, 0, 0, 0, 511, null);
                aVar.f369348c = size - sumOfCrossSize;
                arrayList.add(0, aVar);
                return;
            }
            a aVar2 = new a(0, 0, 0, 0, 0, 0, 0, 0, 0, 511, null);
            aVar2.f369348c = (size - sumOfCrossSize) / 2;
            arrayList.add(0, aVar2);
            arrayList.add(aVar2);
        }
    }

    public final boolean k(View view) {
        Integer numValueOf;
        if (this.f369339i) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            numValueOf = layoutParams != null ? Integer.valueOf(layoutParams.height) : null;
            if (numValueOf != null && numValueOf.intValue() == -1) {
                return true;
            }
            if (numValueOf != null && numValueOf.intValue() == -3) {
                return true;
            }
        } else {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            numValueOf = layoutParams2 != null ? Integer.valueOf(layoutParams2.width) : null;
            if (numValueOf != null && numValueOf.intValue() == -1) {
                return true;
            }
            if (numValueOf != null && numValueOf.intValue() == -3) {
                return true;
            }
        }
        return false;
    }

    public final int l(int i12, int i13, int i14, boolean z12) {
        if (i12 != Integer.MIN_VALUE) {
            if (i12 != 0) {
                if (i12 == 1073741824) {
                    return i13;
                }
                throw new IllegalStateException(L.j(Integer.valueOf(i12), "Unknown size mode is set: "));
            }
        } else {
            if (z12) {
                return Math.min(i13, i14);
            }
            if (i14 < i13 || getVisibleLinesCount() > 1) {
                return i13;
            }
        }
        return i14;
    }

    public final boolean m(View view) {
        return view.getVisibility() == 8 || k(view);
    }

    @Override // android.view.View
    public final void onDraw(@k Canvas canvas) {
        int i12;
        int i13;
        if (this.separatorDrawable == null && this.lineSeparatorDrawable == null) {
            return;
        }
        if (this.showSeparators == 0 && this.showLineSeparators == 0) {
            return;
        }
        boolean z12 = this.f369339i;
        ArrayList arrayList = this.f369340j;
        if (z12) {
            c cVar = new c(this, canvas);
            if (arrayList.size() > 0 && o(this.showLineSeparators)) {
                a firstVisibleLine = getFirstVisibleLine();
                cVar.invoke(Integer.valueOf(firstVisibleLine == null ? 0 : firstVisibleLine.f369352g - firstVisibleLine.f369348c));
            }
            Iterator it = arrayList.iterator();
            int i14 = 0;
            boolean z13 = false;
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (aVar.a() != 0) {
                    int i15 = aVar.f369352g;
                    int i16 = i15 - aVar.f369348c;
                    if (z13 && p(getShowLineSeparators())) {
                        cVar.invoke(Integer.valueOf(i16));
                    }
                    int i17 = aVar.f369353h;
                    boolean z14 = true;
                    int i18 = 0;
                    int i19 = 0;
                    while (i18 < i17) {
                        int i22 = i18 + 1;
                        View childAt = getChildAt(aVar.f369346a + i18);
                        if (childAt == null || m(childAt)) {
                            i13 = i17;
                            i18 = i22;
                        } else {
                            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                            if (layoutParams == null) {
                                throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                            }
                            com.yandex.div.internal.widget.c cVar2 = (com.yandex.div.internal.widget.c) layoutParams;
                            int left = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) cVar2).leftMargin;
                            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) cVar2).rightMargin;
                            if (z14) {
                                if (o(getShowSeparators())) {
                                    i13 = i17;
                                    i(getSeparatorDrawable(), canvas, left - this.f369342l, i16, left, i15);
                                } else {
                                    i13 = i17;
                                }
                                z14 = false;
                            } else {
                                i13 = i17;
                                if (p(getShowSeparators())) {
                                    i(getSeparatorDrawable(), canvas, left - this.f369342l, i16, left, i15);
                                }
                            }
                            i18 = i22;
                            i19 = right;
                        }
                        i17 = i13;
                    }
                    if (i19 > 0 && n(getShowSeparators())) {
                        i(getSeparatorDrawable(), canvas, i19, i16, i19 + this.f369342l, i15);
                    }
                    z13 = true;
                    i14 = i15;
                }
            }
            if (i14 <= 0 || !n(this.showLineSeparators)) {
                return;
            }
            cVar.invoke(Integer.valueOf(i14 + this.f369343m));
            return;
        }
        d dVar = new d(this, canvas);
        if (arrayList.size() > 0 && o(this.showLineSeparators)) {
            a firstVisibleLine2 = getFirstVisibleLine();
            dVar.invoke(Integer.valueOf(firstVisibleLine2 == null ? 0 : firstVisibleLine2.f369351f - firstVisibleLine2.f369348c));
        }
        Iterator it2 = arrayList.iterator();
        int i23 = 0;
        boolean z15 = false;
        while (it2.hasNext()) {
            a aVar2 = (a) it2.next();
            if (aVar2.a() != 0) {
                int i24 = aVar2.f369351f;
                int i25 = i24 - aVar2.f369348c;
                if (z15 && p(getShowLineSeparators())) {
                    dVar.invoke(Integer.valueOf(i25));
                }
                boolean z16 = getLineSeparatorDrawable() != null;
                int i26 = aVar2.f369353h;
                boolean z17 = true;
                int i27 = 0;
                int i28 = 0;
                while (i27 < i26) {
                    int i29 = i27 + 1;
                    View childAt2 = getChildAt(aVar2.f369346a + i27);
                    if (childAt2 == null || m(childAt2)) {
                        i12 = i26;
                        i27 = i29;
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                        if (layoutParams2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        }
                        com.yandex.div.internal.widget.c cVar3 = (com.yandex.div.internal.widget.c) layoutParams2;
                        int top = childAt2.getTop() - ((ViewGroup.MarginLayoutParams) cVar3).topMargin;
                        int bottom = childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) cVar3).bottomMargin;
                        if (z17) {
                            if (o(getShowSeparators())) {
                                i12 = i26;
                                i(getSeparatorDrawable(), canvas, i25, top - this.f369342l, i24, top);
                            } else {
                                i12 = i26;
                            }
                            z17 = false;
                        } else {
                            i12 = i26;
                            if (p(getShowSeparators())) {
                                i(getSeparatorDrawable(), canvas, i25, top - this.f369342l, i24, top);
                            }
                        }
                        i27 = i29;
                        i28 = bottom;
                    }
                    i26 = i12;
                }
                if (i28 > 0 && n(getShowSeparators())) {
                    i(getSeparatorDrawable(), canvas, i25, i28, i24, i28 + this.f369342l);
                }
                i23 = i24;
                z15 = z16;
            }
        }
        if (i23 <= 0 || !n(this.showLineSeparators)) {
            return;
        }
        dVar.invoke(Integer.valueOf(i23 + this.f369343m));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int iF2;
        int i16;
        int measuredWidth;
        int iF3;
        boolean z13 = this.f369339i;
        ArrayList arrayList = this.f369340j;
        int i17 = 80;
        int i18 = 16;
        int i19 = 5;
        int i22 = 2;
        int i23 = 1;
        if (z13) {
            int i24 = i14 - i12;
            int paddingTop = getPaddingTop() + getStartLineSeparatorLength();
            Iterator it = arrayList.iterator();
            int i25 = 0;
            while (it.hasNext()) {
                a aVar = (a) it.next();
                int startSeparatorLength = getStartSeparatorLength();
                int gravity = getGravity() & 7;
                if (gravity == i23) {
                    iF3 = r.f(i24, aVar.f369347b, 2, getPaddingLeft());
                } else if (gravity == 3) {
                    iF3 = getPaddingLeft();
                } else {
                    if (gravity != i19) {
                        throw new IllegalStateException(L.j(Integer.valueOf(gravity), "Invalid horizontal gravity is set: "));
                    }
                    iF3 = (i24 - aVar.f369347b) - getPaddingRight();
                }
                int measuredWidth2 = startSeparatorLength + iF3;
                if (aVar.a() > 0) {
                    if (i25 != 0) {
                        paddingTop += getMiddleLineSeparatorLength();
                    }
                    i25 = i23;
                }
                int i26 = aVar.f369353h;
                int i27 = 0;
                boolean z14 = false;
                while (i27 < i26) {
                    int i28 = i27 + 1;
                    View childAt = getChildAt(aVar.f369346a + i27);
                    if (childAt == null || m(childAt)) {
                        if (k(childAt)) {
                            childAt.layout(0, 0, 0, 0);
                        }
                        i27 = i28;
                        i17 = 80;
                    } else {
                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        }
                        com.yandex.div.internal.widget.c cVar = (com.yandex.div.internal.widget.c) layoutParams;
                        int middleSeparatorLength = measuredWidth2 + ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                        if (z14) {
                            middleSeparatorLength += getMiddleSeparatorLength();
                        }
                        ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                        if (layoutParams2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        }
                        com.yandex.div.internal.widget.c cVar2 = (com.yandex.div.internal.widget.c) layoutParams2;
                        int i29 = cVar2.f370243a & 112;
                        int iMax = (i29 != 16 ? i29 != i17 ? cVar2.f370244b ? Math.max(aVar.f369349d - childAt.getBaseline(), ((ViewGroup.MarginLayoutParams) cVar2).topMargin) : ((ViewGroup.MarginLayoutParams) cVar2).topMargin : (aVar.f369348c - childAt.getMeasuredHeight()) - ((ViewGroup.MarginLayoutParams) cVar2).bottomMargin : (((aVar.f369348c - childAt.getMeasuredHeight()) + ((ViewGroup.MarginLayoutParams) cVar2).topMargin) - ((ViewGroup.MarginLayoutParams) cVar2).bottomMargin) / 2) + paddingTop;
                        childAt.layout(middleSeparatorLength, iMax, childAt.getMeasuredWidth() + middleSeparatorLength, childAt.getMeasuredHeight() + iMax);
                        measuredWidth2 = middleSeparatorLength + childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                        i27 = i28;
                        i17 = 80;
                        z14 = true;
                    }
                }
                paddingTop += aVar.f369348c;
                aVar.f369351f = measuredWidth2;
                aVar.f369352g = paddingTop;
                i17 = 80;
                i19 = 5;
                i23 = 1;
            }
            return;
        }
        int i32 = i15 - i13;
        int paddingLeft = getPaddingLeft() + getStartLineSeparatorLength();
        Iterator it2 = arrayList.iterator();
        int middleLineSeparatorLength = paddingLeft;
        boolean z15 = false;
        while (it2.hasNext()) {
            a aVar2 = (a) it2.next();
            int startSeparatorLength2 = getStartSeparatorLength();
            int gravity2 = getGravity() & 112;
            if (gravity2 == i18) {
                iF2 = r.f(i32, aVar2.f369347b, i22, getPaddingTop());
            } else if (gravity2 == 48) {
                iF2 = getPaddingTop();
            } else {
                if (gravity2 != 80) {
                    throw new IllegalStateException(L.j(Integer.valueOf(gravity2), "Invalid vertical gravity is set: "));
                }
                iF2 = getPaddingBottom() + (i32 - aVar2.f369347b);
            }
            int i33 = startSeparatorLength2 + iF2;
            if (aVar2.a() > 0) {
                if (z15) {
                    middleLineSeparatorLength += getMiddleLineSeparatorLength();
                }
                z15 = true;
            }
            int i34 = aVar2.f369353h;
            int measuredHeight = i33;
            int i35 = 0;
            boolean z16 = false;
            while (i35 < i34) {
                int i36 = i35 + 1;
                View childAt2 = getChildAt(aVar2.f369346a + i35);
                if (childAt2 == null || m(childAt2)) {
                    int i37 = i22;
                    if (k(childAt2)) {
                        childAt2.layout(0, 0, 0, 0);
                    }
                    i22 = i37;
                    i35 = i36;
                } else {
                    ViewGroup.LayoutParams layoutParams3 = childAt2.getLayoutParams();
                    if (layoutParams3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    }
                    com.yandex.div.internal.widget.c cVar3 = (com.yandex.div.internal.widget.c) layoutParams3;
                    int middleSeparatorLength2 = measuredHeight + ((ViewGroup.MarginLayoutParams) cVar3).topMargin;
                    if (z16) {
                        middleSeparatorLength2 += getMiddleSeparatorLength();
                    }
                    int i38 = aVar2.f369348c;
                    ViewGroup.LayoutParams layoutParams4 = childAt2.getLayoutParams();
                    if (layoutParams4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    }
                    com.yandex.div.internal.widget.c cVar4 = (com.yandex.div.internal.widget.c) layoutParams4;
                    int i39 = cVar4.f370243a & 7;
                    if (i39 != 1) {
                        measuredWidth = i39 != 5 ? ((ViewGroup.MarginLayoutParams) cVar4).leftMargin : (i38 - childAt2.getMeasuredWidth()) - ((ViewGroup.MarginLayoutParams) cVar4).rightMargin;
                        i16 = 2;
                    } else {
                        i16 = 2;
                        measuredWidth = (((i38 - childAt2.getMeasuredWidth()) + ((ViewGroup.MarginLayoutParams) cVar4).leftMargin) - ((ViewGroup.MarginLayoutParams) cVar4).rightMargin) / 2;
                    }
                    int i42 = measuredWidth + middleLineSeparatorLength;
                    childAt2.layout(i42, middleSeparatorLength2, childAt2.getMeasuredWidth() + i42, childAt2.getMeasuredHeight() + middleSeparatorLength2);
                    measuredHeight = middleSeparatorLength2 + childAt2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) cVar3).bottomMargin;
                    i22 = i16;
                    i35 = i36;
                    z16 = true;
                }
            }
            middleLineSeparatorLength += aVar2.f369348c;
            aVar2.f369351f = middleLineSeparatorLength;
            aVar2.f369352g = measuredHeight;
            i22 = i22;
            i18 = 16;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int mode;
        int size;
        int iMakeMeasureSpec;
        int i14;
        int i15;
        int iB2;
        int edgeSeparatorsLength;
        int edgeSeparatorsLength2;
        int i16;
        int i17;
        this.f369340j.clear();
        this.f369341k = 0;
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (getAspectRatio() != 0.0f && mode2 == 1073741824) {
            int iB3 = kotlin.math.b.b(size2 / getAspectRatio());
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iB3, 1073741824);
            size = iB3;
            mode = 1073741824;
        } else {
            mode = View.MeasureSpec.getMode(i13);
            size = View.MeasureSpec.getSize(i13);
            iMakeMeasureSpec = i13;
        }
        this.f369344n = getEdgeLineSeparatorsLength();
        int i18 = this.f369339i ? i12 : iMakeMeasureSpec;
        int mode3 = View.MeasureSpec.getMode(i18);
        int size3 = View.MeasureSpec.getSize(i18);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int edgeSeparatorsLength3 = getEdgeSeparatorsLength() + (this.f369339i ? paddingRight : paddingBottom);
        a aVar = new a(0, edgeSeparatorsLength3, 0, 0, 0, 0, 0, 0, 0, 509, null);
        Iterator<View> it = new C22829k0(this).iterator();
        int i19 = Integer.MIN_VALUE;
        int i22 = 0;
        while (true) {
            C22833m0 c22833m0 = (C22833m0) it;
            if (!c22833m0.hasNext()) {
                int i23 = size2;
                int i24 = mode;
                int i25 = size;
                if (this.f369339i) {
                    h(iMakeMeasureSpec, this.gravity & 112, getPaddingBottom() + getPaddingTop());
                } else {
                    h(i12, this.gravity & 7, getPaddingRight() + getPaddingLeft());
                }
                int largestMainSize = this.f369339i ? getLargestMainSize() : getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
                int paddingBottom2 = this.f369339i ? getPaddingBottom() + getPaddingTop() + getSumOfCrossSize() : getLargestMainSize();
                int iCombineMeasuredStates = this.f369341k;
                if (mode2 == 0) {
                    i14 = i23;
                } else {
                    i14 = i23;
                    if (i14 < largestMainSize) {
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                    }
                }
                this.f369341k = iCombineMeasuredStates;
                int iResolveSizeAndState = View.resolveSizeAndState(l(mode2, i14, largestMainSize, !this.f369339i), i12, this.f369341k);
                if (!this.f369339i || getAspectRatio() == 0.0f || mode2 == 1073741824) {
                    i15 = i24;
                    iB2 = i25;
                } else {
                    iB2 = kotlin.math.b.b((16777215 & iResolveSizeAndState) / getAspectRatio());
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iB2, 1073741824);
                    i15 = 1073741824;
                }
                int iCombineMeasuredStates2 = this.f369341k;
                if (i15 != 0 && iB2 < paddingBottom2) {
                    iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, 256);
                }
                this.f369341k = iCombineMeasuredStates2;
                setMeasuredDimension(iResolveSizeAndState, View.resolveSizeAndState(l(i15, iB2, paddingBottom2, this.f369339i), iMakeMeasureSpec, this.f369341k));
                return;
            }
            Object next = c22833m0.next();
            int i26 = i22 + 1;
            if (i22 < 0) {
                C42745f0.H0();
                throw null;
            }
            View view = (View) next;
            if (m(view)) {
                aVar.f369354i++;
                aVar.f369353h++;
                if (i22 == getChildCount() - 1 && aVar.a() != 0) {
                    f(aVar);
                }
                i22 = i26;
            } else {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                }
                Iterator<View> it2 = it;
                com.yandex.div.internal.widget.c cVar = (com.yandex.div.internal.widget.c) layoutParams;
                int iA2 = cVar.a() + paddingRight;
                int iB4 = cVar.b() + paddingBottom;
                int i27 = mode;
                if (this.f369339i) {
                    edgeSeparatorsLength = iA2 + getEdgeSeparatorsLength();
                    edgeSeparatorsLength2 = this.f369344n;
                } else {
                    edgeSeparatorsLength = iA2 + this.f369344n;
                    edgeSeparatorsLength2 = getEdgeSeparatorsLength();
                }
                int i28 = iB4 + edgeSeparatorsLength2;
                int i29 = size;
                int i32 = paddingRight;
                int i33 = edgeSeparatorsLength;
                int i34 = ((ViewGroup.MarginLayoutParams) cVar).width;
                int i35 = paddingBottom;
                int minimumWidth = view.getMinimumWidth();
                int i36 = size2;
                int i37 = cVar.f370250h;
                com.yandex.div.internal.widget.d.f370251b.getClass();
                view.measure(d.a.a(i12, i33, i34, minimumWidth, i37), d.a.a(iMakeMeasureSpec, i28, ((ViewGroup.MarginLayoutParams) cVar).height, view.getMinimumHeight(), cVar.f370249g));
                this.f369341k = View.combineMeasuredStates(this.f369341k, view.getMeasuredState());
                int iA3 = cVar.a() + view.getMeasuredWidth();
                int iB5 = cVar.b() + view.getMeasuredHeight();
                if (!this.f369339i) {
                    iB5 = iA3;
                    iA3 = iB5;
                }
                int middleSeparatorLength = aVar.f369347b + iA3 + (aVar.f369353h != 0 ? getMiddleSeparatorLength() : 0);
                if (mode3 == 0 || size3 >= middleSeparatorLength) {
                    if (aVar.f369353h > 0) {
                        aVar.f369347b += getMiddleSeparatorLength();
                    }
                    aVar.f369353h++;
                    i16 = i19;
                } else {
                    if (aVar.a() > 0) {
                        f(aVar);
                    }
                    aVar = new a(i22, edgeSeparatorsLength3, 0, 0, 0, 0, 0, 1, 0, 380, null);
                    i16 = Integer.MIN_VALUE;
                }
                if (this.f369339i && cVar.f370244b) {
                    i17 = size3;
                    aVar.f369349d = Math.max(aVar.f369349d, view.getBaseline() + ((ViewGroup.MarginLayoutParams) cVar).topMargin);
                    aVar.f369350e = Math.max(aVar.f369350e, (view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) cVar).bottomMargin) - view.getBaseline());
                } else {
                    i17 = size3;
                }
                aVar.f369347b += iA3;
                int iMax = Math.max(i16, iB5);
                aVar.f369348c = Math.max(aVar.f369348c, iMax);
                if (i22 == getChildCount() - 1 && aVar.a() != 0) {
                    f(aVar);
                }
                size3 = i17;
                i22 = i26;
                mode = i27;
                size = i29;
                paddingRight = i32;
                paddingBottom = i35;
                size2 = i36;
                i19 = iMax;
                it = it2;
            }
        }
    }

    @Override // com.yandex.div.core.widget.InterfaceC38049e
    public void setAspectRatio(float f12) {
        this.aspectRatio.setValue(this, f369332p[0], Float.valueOf(f12));
    }

    public final void setGravity(int i12) {
        if (this.gravity == i12) {
            return;
        }
        if ((i12 & 7) == 0) {
            i12 |= 3;
        }
        if ((i12 & 112) == 0) {
            i12 |= 48;
        }
        this.gravity = i12;
        requestLayout();
    }

    public final void setLineSeparatorDrawable(@l Drawable drawable) {
        if (L.f(this.lineSeparatorDrawable, drawable)) {
            return;
        }
        this.lineSeparatorDrawable = drawable;
        this.f369343m = drawable == null ? 0 : this.f369339i ? drawable.getIntrinsicHeight() : drawable.getIntrinsicWidth();
        requestLayout();
    }

    public final void setSeparatorDrawable(@l Drawable drawable) {
        if (L.f(this.separatorDrawable, drawable)) {
            return;
        }
        this.separatorDrawable = drawable;
        this.f369342l = drawable == null ? 0 : this.f369339i ? drawable.getIntrinsicWidth() : drawable.getIntrinsicHeight();
        requestLayout();
    }

    public final void setShowLineSeparators(int i12) {
        if (this.showLineSeparators != i12) {
            this.showLineSeparators = i12;
            requestLayout();
        }
    }

    public final void setShowSeparators(int i12) {
        if (this.showSeparators != i12) {
            this.showSeparators = i12;
            requestLayout();
        }
    }

    public final void setWrapDirection(int i12) {
        if (this.wrapDirection != i12) {
            this.wrapDirection = i12;
            if (i12 == 0) {
                this.f369339i = true;
                Drawable drawable = this.separatorDrawable;
                this.f369342l = drawable == null ? 0 : drawable.getIntrinsicWidth();
                Drawable drawable2 = this.lineSeparatorDrawable;
                this.f369343m = drawable2 != null ? drawable2.getIntrinsicHeight() : 0;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException(L.j(Integer.valueOf(this.wrapDirection), "Invalid value for the wrap direction is set: "));
                }
                this.f369339i = false;
                Drawable drawable3 = this.separatorDrawable;
                this.f369342l = drawable3 == null ? 0 : drawable3.getIntrinsicHeight();
                Drawable drawable4 = this.lineSeparatorDrawable;
                this.f369343m = drawable4 != null ? drawable4.getIntrinsicWidth() : 0;
            }
            requestLayout();
        }
    }

    @D
    public static /* synthetic */ void getShowLineSeparators$annotations() {
    }

    @D
    public static /* synthetic */ void getShowSeparators$annotations() {
    }

    public static /* synthetic */ void getWrapDirection$annotations() {
    }
}

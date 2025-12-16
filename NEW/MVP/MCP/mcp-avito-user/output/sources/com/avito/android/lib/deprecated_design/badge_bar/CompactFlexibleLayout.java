package com.avito.android.lib.deprecated_design.badge_bar;

import JU.e;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.r;
import com.avito.android.R;
import fw.C40487a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CompactFlexibleLayout.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001R*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/avito/android/lib/deprecated_design/badge_bar/CompactFlexibleLayout;", "Landroid/view/ViewGroup;", "", "value", "b", "I", "getMaxLines", "()I", "setMaxLines", "(I)V", "maxLines", "c", "getMaxViews", "setMaxViews", "maxViews", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CompactFlexibleLayout extends ViewGroup {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int maxLines;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int maxViews;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f177815d;

    /* renamed from: e, reason: collision with root package name */
    public final int f177816e;

    /* renamed from: f, reason: collision with root package name */
    public final int f177817f;

    /* renamed from: g, reason: collision with root package name */
    public final int f177818g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public ArrayList f177819h;

    @j
    public CompactFlexibleLayout(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final void a(e eVar, int i12, View view) {
        if (!eVar.f9010c.isEmpty()) {
            eVar.f9008a += this.f177817f;
        }
        eVar.f9008a = view.getMeasuredWidth() + eVar.f9008a;
        eVar.f9009b = Math.max(eVar.f9009b, view.getMeasuredHeight());
        eVar.f9010c.add(Integer.valueOf(i12));
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final int getMaxViews() {
        return this.maxViews;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int childCount = getChildCount() - 1;
        if (childCount >= 0) {
            int i16 = 0;
            while (true) {
                getChildAt(i16).layout(0, 0, 0, 0);
                if (i16 == childCount) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        int i17 = 0;
        for (e eVar : this.f177819h) {
            Iterator<T> it = eVar.f9010c.iterator();
            int i18 = 0;
            while (it.hasNext()) {
                View childAt = getChildAt(((Number) it.next()).intValue());
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int iF2 = r.f(eVar.f9009b, measuredHeight, 2, i17);
                childAt.layout(i18, iF2, i18 + measuredWidth, measuredHeight + iF2);
                i18 += measuredWidth + this.f177817f;
            }
            i17 += eVar.f9009b + this.f177816e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ea, code lost:
    
        r3 = r16.f177819h;
        r4 = new java.util.ArrayList(kotlin.collections.C42745f0.q(r3, 10));
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ff, code lost:
    
        if (r3.hasNext() == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0101, code lost:
    
        r4.add(java.lang.Integer.valueOf(((JU.e) r3.next()).f9008a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0111, code lost:
    
        r3 = (java.lang.Integer) kotlin.collections.C42745f0.W(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0117, code lost:
    
        if (r3 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0119, code lost:
    
        r3 = r3.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011e, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011f, code lost:
    
        r4 = r16.f177819h;
        r6 = new java.util.ArrayList(kotlin.collections.C42745f0.q(r4, 10));
        r4 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0132, code lost:
    
        if (r4.hasNext() == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0134, code lost:
    
        r6.add(java.lang.Integer.valueOf(((JU.e) r4.next()).f9008a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0148, code lost:
    
        if (r6.isEmpty() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014a, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014c, code lost:
    
        r4 = r6.iterator();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0155, code lost:
    
        if (r4.hasNext() == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0161, code lost:
    
        if (((java.lang.Number) r4.next()).intValue() == 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0163, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0165, code lost:
    
        if (r5 < 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0168, code lost:
    
        kotlin.collections.C42745f0.G0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x016b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x016c, code lost:
    
        r4 = java.lang.Integer.valueOf((r5 - 1) * r16.f177816e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0175, code lost:
    
        if (r5 <= 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0177, code lost:
    
        r10 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0178, code lost:
    
        if (r10 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x017a, code lost:
    
        r4 = r10.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x017f, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0180, code lost:
    
        r5 = r16.f177819h.iterator();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x018b, code lost:
    
        if (r5.hasNext() == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x018d, code lost:
    
        r6 = r6 + ((JU.e) r5.next()).f9009b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0197, code lost:
    
        setMeasuredDimension(android.view.View.resolveSizeAndState(r3, r17, 0), android.view.View.resolveSizeAndState(r6 + r4, r18, 0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a4, code lost:
    
        return;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.deprecated_design.badge_bar.CompactFlexibleLayout.onMeasure(int, int):void");
    }

    public final void setMaxLines(int i12) {
        if (this.maxLines != i12) {
            this.maxLines = i12;
            e[] eVarArr = new e[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                eVarArr[i13] = new e(0, 0, null, 7, null);
            }
            this.f177819h = C42756l.i0(eVarArr);
            requestLayout();
        }
    }

    public final void setMaxViews(int i12) {
        if (this.maxViews != i12) {
            this.maxViews = i12;
            requestLayout();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CompactFlexibleLayout(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.compactFlexibleLayout : i12;
        i13 = (i14 & 8) != 0 ? R.style.Design_Widget_CompactFlexibleLayout : i13;
        super(context, attributeSet, i12);
        this.maxViews = Integer.MAX_VALUE;
        this.f177815d = true;
        this.f177819h = new ArrayList(C42784z0.f406748b);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C40487a.l.f396188c, i12, i13);
        this.f177816e = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, this.f177816e);
        this.f177817f = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, this.f177817f);
        setMaxLines(typedArrayObtainStyledAttributes.getInteger(2, this.maxLines));
        setMaxViews(typedArrayObtainStyledAttributes.getInteger(3, this.maxViews));
        this.f177818g = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, this.f177818g);
        this.f177815d = typedArrayObtainStyledAttributes.getBoolean(0, this.f177815d);
        typedArrayObtainStyledAttributes.recycle();
    }
}

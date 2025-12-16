package com.avito.android.lib.design.docking_badge;

import J11.c;
import PK0.n;
import X41.j;
import Y61.k;
import Y61.l;
import aV.C19820c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.r;
import bV.C25568a;
import com.avito.android.R;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import com.avito.android.lib.design.docking_badge.a;
import com.avito.android.lib.design.text_view.d;
import com.avito.android.lib.design.text_view.e;
import com.avito.android.lib.util.f;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import j.U;
import j.f0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DockingBadge.kt */
@s0
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0001(J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0019\u001a\u00020\u00048\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u000bR\"\u0010\u001f\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\bR\"\u0010'\u001a\u00020 8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/avito/android/lib/design/docking_badge/DockingBadge;", "Landroid/view/ViewGroup;", "LLV/a;", "LaV/c;", "LbV/a;", "newState", "Lkotlin/G0;", "setState", "(LaV/c;)V", "newStyle", "setStyle", "(LbV/a;)V", "", "color", "setBadgeColor", "(I)V", "", "text", "setText", "(Ljava/lang/CharSequence;)V", "b", "LbV/a;", "getStyle$_design_modules_components", "()LbV/a;", "setStyle$_design_modules_components", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "c", "LaV/c;", "getState$_design_modules_components", "()LaV/c;", "setState$_design_modules_components", VoiceInfo.STATE, "Lcom/avito/android/lib/design/docking_badge/DockingBadge$a;", "e", "Lcom/avito/android/lib/design/docking_badge/DockingBadge$a;", "getEndEdgeStyle$_design_modules_components", "()Lcom/avito/android/lib/design/docking_badge/DockingBadge$a;", "setEndEdgeStyle$_design_modules_components", "(Lcom/avito/android/lib/design/docking_badge/DockingBadge$a;)V", "endEdgeStyle", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DockingBadge extends ViewGroup implements LV.a<C19820c, C25568a> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f179108i = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public C25568a style;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    public C19820c state;

    /* renamed from: d, reason: collision with root package name */
    public a f179111d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public a endEdgeStyle;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.text_view.a f179113f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final View f179114g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final View f179115h;

    /* compiled from: DockingBadge.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/docking_badge/DockingBadge$a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DockingBadgeEdgeType f179116a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Drawable f179117b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Drawable f179118c;

        /* renamed from: d, reason: collision with root package name */
        public final int f179119d;

        public a(@k DockingBadgeEdgeType dockingBadgeEdgeType, @k Drawable drawable, @k Drawable drawable2, @U int i12) {
            this.f179116a = dockingBadgeEdgeType;
            this.f179117b = drawable;
            this.f179118c = drawable2;
            this.f179119d = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f179116a == aVar.f179116a && L.f(this.f179117b, aVar.f179117b) && L.f(this.f179118c, aVar.f179118c) && this.f179119d == aVar.f179119d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f179119d) + ((this.f179118c.hashCode() + ((this.f179117b.hashCode() + (this.f179116a.hashCode() * 31)) * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BadgeEdgeStyle(type=");
            sb2.append(this.f179116a);
            sb2.append(", start=");
            sb2.append(this.f179117b);
            sb2.append(", end=");
            sb2.append(this.f179118c);
            sb2.append(", spacing=");
            return r.t(sb2, this.f179119d, ')');
        }
    }

    @j
    public DockingBadge(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, (C42822w) null);
    }

    public final void a(TypedArray typedArray, @f0 Integer num, @U Integer num2) throws Resources.NotFoundException {
        n nVarA;
        C25568a.C2002a c2002a = C25568a.f57090g;
        Context context = getContext();
        c2002a.getClass();
        C25568a c25568aC = C25568a.C2002a.c(typedArray, context);
        if (num != null) {
            int iIntValue = num.intValue();
            d dVar = d.f180938a;
            Context context2 = getContext();
            dVar.getClass();
            nVarA = d.a(iIntValue, context2);
        } else {
            nVarA = c25568aC.f57091a;
        }
        setStyle$_design_modules_components(C25568a.a(c25568aC, nVarA, 0, 0, 0, num2 != null ? num2.intValue() : c25568aC.f57095e, 46));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        com.avito.android.lib.design.text_view.a aVar = this.f179113f;
        aVar.setEllipsize(truncateAt);
        aVar.setMaxLines(1);
        aVar.setGravity(17);
        aVar.setBackgroundColor(getStyle$_design_modules_components().f57093c);
        aVar.post(new c(5, this, aVar));
    }

    public final void b(@f0 int i12, @f0 Integer num) {
        setEndEdgeStyle$_design_modules_components(c(i12));
        Drawable drawable = getEndEdgeStyle$_design_modules_components().f179118c;
        View view = this.f179115h;
        view.setBackground(drawable);
        view.setBackgroundTintList(ColorStateList.valueOf(getStyle$_design_modules_components().f57093c));
        a aVarC = num != null ? c(num.intValue()) : getEndEdgeStyle$_design_modules_components();
        this.f179111d = aVarC;
        if (aVarC == null) {
            aVarC = null;
        }
        Drawable drawable2 = aVarC.f179117b;
        View view2 = this.f179114g;
        view2.setBackground(drawable2);
        view2.setBackgroundTintList(ColorStateList.valueOf(getStyle$_design_modules_components().f57093c));
    }

    @SuppressLint({"CustomViewStyleable"})
    public final a c(@f0 int i12) throws Resources.NotFoundException {
        DockingBadgeEdgeType dockingBadgeEdgeType;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(i12, d.n.f178929K);
        int i13 = typedArrayObtainStyledAttributes.getInt(3, 0);
        DockingBadgeEdgeType.f179123c.getClass();
        DockingBadgeEdgeType[] dockingBadgeEdgeTypeArrValues = DockingBadgeEdgeType.values();
        int length = dockingBadgeEdgeTypeArrValues.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                dockingBadgeEdgeType = null;
                break;
            }
            dockingBadgeEdgeType = dockingBadgeEdgeTypeArrValues[i14];
            if (dockingBadgeEdgeType.f179126b == i13) {
                break;
            }
            i14++;
        }
        if (dockingBadgeEdgeType == null) {
            dockingBadgeEdgeType = DockingBadgeEdgeType.Square;
        }
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            throw new IllegalArgumentException("undefined badgeEdge_leftDrawable attr");
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(1);
        if (drawable2 == null) {
            throw new IllegalArgumentException("undefined badgeEdge_rightDrawable attr");
        }
        a aVar = new a(dockingBadgeEdgeType, drawable, drawable2, typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0));
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public final void d(DockingBadgeType dockingBadgeType, DockingBadgeSize dockingBadgeSize, DockingBadgeEdgeType dockingBadgeEdgeType, DockingBadgeEdgeType dockingBadgeEdgeType2) {
        int iS2;
        Integer num;
        int i12;
        if (dockingBadgeType instanceof DockingBadgeType.Predefined) {
            Context context = getContext();
            DockingBadgeType.Predefined predefined = (DockingBadgeType.Predefined) dockingBadgeType;
            int i13 = a.C5268a.f179144a[dockingBadgeSize.ordinal()];
            if (i13 == 1) {
                switch (a.C5268a.f179146c[predefined.ordinal()]) {
                    case 1:
                        i12 = R.attr.dockingBadgeGreenSmall;
                        break;
                    case 2:
                        i12 = R.attr.dockingBadgeVioletSmall;
                        break;
                    case 3:
                        i12 = R.attr.dockingBadgeBlueSmall;
                        break;
                    case 4:
                        i12 = R.attr.dockingBadgeGraySmall;
                        break;
                    case 5:
                        i12 = R.attr.dockingBadgeRedSmall;
                        break;
                    case 6:
                        i12 = R.attr.dockingBadgeBlackSmall;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                switch (a.C5268a.f179146c[predefined.ordinal()]) {
                    case 1:
                        i12 = R.attr.dockingBadgeGreenMedium;
                        break;
                    case 2:
                        i12 = R.attr.dockingBadgeVioletMedium;
                        break;
                    case 3:
                        i12 = R.attr.dockingBadgeBlueMedium;
                        break;
                    case 4:
                        i12 = R.attr.dockingBadgeGrayMedium;
                        break;
                    case 5:
                        i12 = R.attr.dockingBadgeRedMedium;
                        break;
                    case 6:
                        i12 = R.attr.dockingBadgeBlackMedium;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            iS2 = f.s(i12, context);
        } else if (dockingBadgeType instanceof DockingBadgeType.Custom) {
            iS2 = ((DockingBadgeType.Custom) dockingBadgeType).f179136b;
        } else {
            if (!(dockingBadgeType instanceof DockingBadgeType.CustomColors)) {
                throw new NoWhenBranchMatchedException();
            }
            iS2 = ((DockingBadgeType.CustomColors) dockingBadgeType).f179137b;
        }
        Integer numValueOf = dockingBadgeEdgeType != null ? Integer.valueOf(com.avito.android.lib.design.docking_badge.a.a(this, dockingBadgeEdgeType, dockingBadgeSize)) : null;
        int iA2 = com.avito.android.lib.design.docking_badge.a.a(this, dockingBadgeEdgeType2, dockingBadgeSize);
        boolean z12 = dockingBadgeType instanceof DockingBadgeType.CustomColors;
        Integer numValueOf2 = (!z12 || (num = ((DockingBadgeType.CustomColors) dockingBadgeType).f179140e) == null) ? null : Integer.valueOf(f.s(num.intValue(), getContext()));
        Integer num2 = z12 ? ((DockingBadgeType.CustomColors) dockingBadgeType).f179141f : null;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(iS2, d.n.f178925I);
        a(typedArrayObtainStyledAttributes, numValueOf2, num2);
        typedArrayObtainStyledAttributes.recycle();
        n nVar = getStyle$_design_modules_components().f57091a;
        com.avito.android.lib.design.text_view.a aVar = this.f179113f;
        e.a(aVar, nVar);
        if (getStyle$_design_modules_components().f57092b != 0) {
            aVar.setTextColor(getStyle$_design_modules_components().f57092b);
        }
        b(iA2, numValueOf);
        if (z12) {
            DockingBadgeType.CustomColors customColors = (DockingBadgeType.CustomColors) dockingBadgeType;
            Integer num3 = customColors.f179138c;
            if (num3 != null) {
                setBadgeColor(num3.intValue());
            }
            Integer num4 = customColors.f179139d;
            if (num4 != null) {
                aVar.setTextColor(num4.intValue());
            }
        }
    }

    public final void e(DockingBadgeEdgeType dockingBadgeEdgeType, DockingBadgeEdgeType dockingBadgeEdgeType2) {
        b(com.avito.android.lib.design.docking_badge.a.a(this, dockingBadgeEdgeType2, getStyle$_design_modules_components().f57096f), dockingBadgeEdgeType != null ? Integer.valueOf(com.avito.android.lib.design.docking_badge.a.a(this, dockingBadgeEdgeType, getStyle$_design_modules_components().f57096f)) : null);
    }

    public final void f(@l DockingBadgeEdgeType dockingBadgeEdgeType, @k DockingBadgeEdgeType dockingBadgeEdgeType2) {
        a aVar = this.f179111d;
        if (aVar == null || this.endEdgeStyle == null) {
            e(dockingBadgeEdgeType, dockingBadgeEdgeType2);
            return;
        }
        if (aVar == null) {
            aVar = null;
        }
        if (aVar.f179116a == dockingBadgeEdgeType && getEndEdgeStyle$_design_modules_components().f179116a == dockingBadgeEdgeType2) {
            return;
        }
        e(dockingBadgeEdgeType, dockingBadgeEdgeType2);
    }

    @k
    public final a getEndEdgeStyle$_design_modules_components() {
        a aVar = this.endEdgeStyle;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    @k
    /* renamed from: getState$_design_modules_components, reason: from getter */
    public final C19820c getState() {
        return this.state;
    }

    @k
    public final C25568a getStyle$_design_modules_components() {
        C25568a c25568a = this.style;
        if (c25568a != null) {
            return c25568a;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        View childAt = getChildAt(0);
        View childAt2 = getChildAt(1);
        View childAt3 = getChildAt(2);
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        childAt.layout(getPaddingLeft(), paddingTop, childAt.getMeasuredWidth() + getPaddingLeft(), height);
        childAt2.layout(childAt.getRight(), paddingTop, childAt2.getMeasuredWidth() + childAt.getRight(), height);
        childAt3.layout(childAt2.getRight(), paddingTop, childAt3.getMeasuredWidth() + childAt2.getRight(), height);
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int iMin;
        int size = View.MeasureSpec.getSize(i12);
        int mode = View.MeasureSpec.getMode(i13);
        if (mode == Integer.MIN_VALUE) {
            iMin = Integer.min(getPaddingBottom() + getPaddingTop() + getStyle$_design_modules_components().f57094d, View.MeasureSpec.getSize(i13));
        } else if (mode == 0) {
            iMin = getPaddingBottom() + getPaddingTop() + getStyle$_design_modules_components().f57094d;
        } else {
            if (mode != 1073741824) {
                throw new IllegalArgumentException("unknown spec mode");
            }
            iMin = View.MeasureSpec.getSize(i13);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((iMin - getPaddingTop()) - getPaddingBottom(), 1073741824);
        View view = this.f179114g;
        view.measure(0, iMakeMeasureSpec);
        View view2 = this.f179115h;
        view2.measure(0, iMakeMeasureSpec);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((((size - view.getMeasuredWidth()) - view2.getMeasuredWidth()) - getPaddingStart()) - getPaddingEnd(), BeduinInputModel.MIN_TEXT_VERSION);
        com.avito.android.lib.design.text_view.a aVar = this.f179113f;
        aVar.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        setMeasuredDimension(aVar.getMeasuredWidth() + view2.getMeasuredWidth() + view.getMeasuredWidth() + getPaddingEnd() + getPaddingStart(), iMin);
    }

    public final void setBadgeColor(int color) {
        this.f179113f.setBackgroundColor(color);
        this.f179115h.setBackgroundTintList(ColorStateList.valueOf(color));
        this.f179114g.setBackgroundTintList(ColorStateList.valueOf(color));
    }

    public final void setEndEdgeStyle$_design_modules_components(@k a aVar) {
        this.endEdgeStyle = aVar;
    }

    public final void setState$_design_modules_components(@k C19820c c19820c) {
        this.state = c19820c;
    }

    public final void setStyle$_design_modules_components(@k C25568a c25568a) {
        this.style = c25568a;
    }

    public final void setText(@k CharSequence text) {
        this.f179113f.setText(text);
    }

    public DockingBadge(@k Context context, @k CharSequence charSequence, @k DockingBadgeType dockingBadgeType, @k DockingBadgeSize dockingBadgeSize, @l DockingBadgeEdgeType dockingBadgeEdgeType, @k DockingBadgeEdgeType dockingBadgeEdgeType2) {
        super(context, null, R.attr.dockingBadge, R.style.Design_Widget_DockingBadge);
        this.state = new C19820c(null, null, null, 7, null);
        setWillNotDraw(true);
        com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(context, null, R.attr.dockingBadge, R.style.Design_Widget_DockingBadge);
        this.f179113f = aVar;
        View view = new View(context);
        this.f179114g = view;
        View view2 = new View(context);
        this.f179115h = view2;
        addView(view);
        addView(aVar);
        addView(view2);
        d(dockingBadgeType, dockingBadgeSize, dockingBadgeEdgeType, dockingBadgeEdgeType2);
        setText(charSequence);
    }

    @Override // LV.b
    public void setState(@k C19820c newState) {
        C19820c c19820c = this.state;
        if (c19820c == null) {
            c19820c = null;
        }
        if (new com.avito.android.lib.util.c(newState, c19820c).f181333c) {
            return;
        }
        this.state = newState;
        CharSequence charSequence = c19820c != null ? c19820c.f20904a : null;
        CharSequence charSequence2 = newState.f20904a;
        if (!new com.avito.android.lib.util.c(charSequence2, charSequence).f181333c && charSequence2 != null) {
            this.f179113f.setText(charSequence2);
        }
        if (L.f(newState.f20905b, c19820c != null ? c19820c.f20905b : null)) {
            if (L.f(newState.f20906c, c19820c != null ? c19820c.f20906c : null)) {
                return;
            }
        }
        C19820c c19820c2 = this.state;
        DockingBadgeEdgeType dockingBadgeEdgeType = c19820c2.f20905b;
        if (dockingBadgeEdgeType != null) {
            f(c19820c2.f20906c, dockingBadgeEdgeType);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    @Override // LV.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStyle(@Y61.k bV.C25568a r7) {
        /*
            r6 = this;
            bV.a r0 = r6.getStyle$_design_modules_components()
            r1 = 0
            if (r0 == 0) goto L8
            goto L9
        L8:
            r0 = r1
        L9:
            com.avito.android.lib.util.c r2 = new com.avito.android.lib.util.c
            r2.<init>(r7, r0)
            boolean r2 = r2.f181333c
            if (r2 != 0) goto Ld5
            r6.setStyle$_design_modules_components(r7)
            int r2 = r7.f57093c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            if (r0 == 0) goto L24
            int r3 = r0.f57093c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L25
        L24:
            r3 = r1
        L25:
            com.avito.android.lib.util.c r4 = new com.avito.android.lib.util.c
            r4.<init>(r2, r3)
            boolean r2 = r4.f181333c
            if (r2 != 0) goto L37
            bV.a r2 = r6.getStyle$_design_modules_components()
            int r2 = r2.f57093c
            r6.setBadgeColor(r2)
        L37:
            if (r0 == 0) goto L3c
            PK0.n r2 = r0.f57091a
            goto L3d
        L3c:
            r2 = r1
        L3d:
            PK0.n r3 = r7.f57091a
            boolean r2 = kotlin.jvm.internal.L.f(r3, r2)
            com.avito.android.lib.design.text_view.a r3 = r6.f179113f
            if (r2 == 0) goto L5d
            int r2 = r7.f57092b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            if (r0 == 0) goto L56
            int r4 = r0.f57092b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L57
        L56:
            r4 = r1
        L57:
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L77
        L5d:
            bV.a r2 = r6.getStyle$_design_modules_components()
            PK0.n r2 = r2.f57091a
            com.avito.android.lib.design.text_view.e.a(r3, r2)
            bV.a r2 = r6.getStyle$_design_modules_components()
            int r2 = r2.f57092b
            if (r2 == 0) goto L77
            bV.a r2 = r6.getStyle$_design_modules_components()
            int r2 = r2.f57092b
            r3.setTextColor(r2)
        L77:
            if (r0 == 0) goto L7c
            com.avito.android.lib.design.docking_badge.DockingBadgeSize r2 = r0.f57096f
            goto L7d
        L7c:
            r2 = r1
        L7d:
            com.avito.android.lib.design.docking_badge.DockingBadgeSize r4 = r7.f57096f
            boolean r2 = kotlin.jvm.internal.L.f(r4, r2)
            if (r2 != 0) goto L98
            com.avito.android.lib.design.docking_badge.DockingBadge$a r2 = r6.f179111d
            if (r2 == 0) goto L98
            com.avito.android.lib.design.docking_badge.DockingBadge$a r4 = r6.endEdgeStyle
            if (r4 == 0) goto L98
            com.avito.android.lib.design.docking_badge.DockingBadge$a r4 = r6.getEndEdgeStyle$_design_modules_components()
            com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType r4 = r4.f179116a
            com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType r2 = r2.f179116a
            r6.e(r2, r4)
        L98:
            int r2 = r7.f57095e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            if (r0 == 0) goto La7
            int r4 = r0.f57095e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto La8
        La7:
            r4 = r1
        La8:
            com.avito.android.lib.util.c r5 = new com.avito.android.lib.util.c
            r5.<init>(r2, r4)
            boolean r2 = r5.f181333c
            if (r2 != 0) goto Lbb
            bV.a r2 = r6.getStyle$_design_modules_components()
            int r2 = r2.f57095e
            r4 = 0
            r3.setPadding(r4, r2, r4, r4)
        Lbb:
            int r7 = r7.f57094d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            if (r0 == 0) goto Lc9
            int r0 = r0.f57094d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        Lc9:
            com.avito.android.lib.util.c r0 = new com.avito.android.lib.util.c
            r0.<init>(r7, r1)
            boolean r7 = r0.f181333c
            if (r7 != 0) goto Ld5
            r6.requestLayout()
        Ld5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.docking_badge.DockingBadge.setStyle(bV.a):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DockingBadge(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) throws Resources.NotFoundException {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.dockingBadge : i12;
        i13 = (i14 & 8) != 0 ? R.style.Design_Widget_DockingBadge : i13;
        super(context, attributeSet, i12, i13);
        this.state = new C19820c(null, null, null, 7, null);
        setWillNotDraw(true);
        com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(context, attributeSet, i12, i13);
        this.f179113f = aVar;
        View view = new View(context, attributeSet, i12);
        this.f179114g = view;
        View view2 = new View(context, attributeSet, i12);
        this.f179115h = view2;
        addView(view);
        addView(aVar);
        addView(view2);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.n.f178925I, i12, i13);
        a(typedArrayObtainStyledAttributes, null, null);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            b(resourceId, Integer.valueOf(typedArrayObtainStyledAttributes.getResourceId(6, resourceId)));
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("dockingBadge_end является обязательным параметром");
    }
}

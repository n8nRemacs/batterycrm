package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import defpackage.eri;
import defpackage.f0;
import defpackage.fcg;
import defpackage.fvc;
import defpackage.gcg;
import defpackage.h7;
import defpackage.hfd;
import defpackage.hfh;
import defpackage.jdc;
import defpackage.ka5;
import defpackage.ki6;
import defpackage.mrf;
import defpackage.n4e;
import defpackage.o6d;
import defpackage.os0;
import defpackage.r6;
import defpackage.r98;
import defpackage.vbg;
import defpackage.vf9;
import defpackage.vud;
import defpackage.wbg;
import defpackage.whh;
import defpackage.xbg;
import defpackage.xh4;
import defpackage.ybg;
import defpackage.zbg;
import defpackage.zf9;
import defpackage.zid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public final int A0;
    public final int B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public vud G0;
    public int H0;
    public int I0;
    public final int J0;
    public CharSequence K0;
    public CharSequence L0;
    public ColorStateList M0;
    public ColorStateList N0;
    public boolean O0;
    public boolean P0;
    public final ArrayList Q0;
    public final ArrayList R0;
    public final int[] S0;
    public final ka5 T0;
    public ArrayList U0;
    public zbg V0;
    public final n4e W0;
    public fcg X0;
    public h7 Y0;
    public xbg Z0;
    public ActionMenuView a;
    public os0 a1;
    public AppCompatTextView b;
    public hfd b1;
    public AppCompatTextView c;
    public boolean c1;
    public AppCompatImageButton d;
    public OnBackInvokedCallback d1;
    public OnBackInvokedDispatcher e1;
    public boolean f1;
    public final r98 g1;
    public AppCompatImageView o;
    public Drawable s0;
    public final CharSequence t0;
    public AppCompatImageButton u0;
    public View v0;
    public Context w0;
    public int x0;
    public int y0;
    public int z0;

    public static class a extends f0 {
        public static final Parcelable.Creator<a> CREATOR = new f();
        public int c;
        public boolean d;

        public a(Parcel parcel) {
            this(parcel, null);
        }

        @Override // defpackage.f0, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d ? 1 : 0);
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.d = parcel.readInt() != 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fvc.toolbarStyle);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new mrf(getContext());
    }

    public static ybg h() {
        ybg ybgVar = new ybg(-2, -2);
        ybgVar.b = 0;
        ybgVar.a = 8388627;
        return ybgVar;
    }

    public static ybg i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof ybg;
        if (z) {
            ybg ybgVar = (ybg) layoutParams;
            ybg ybgVar2 = new ybg(ybgVar);
            ybgVar2.b = 0;
            ybgVar2.b = ybgVar.b;
            return ybgVar2;
        }
        if (z) {
            ybg ybgVar3 = new ybg((ybg) layoutParams);
            ybgVar3.b = 0;
            return ybgVar3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ybg ybgVar4 = new ybg(layoutParams);
            ybgVar4.b = 0;
            return ybgVar4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        ybg ybgVar5 = new ybg(marginLayoutParams);
        ybgVar5.b = 0;
        ((ViewGroup.MarginLayoutParams) ybgVar5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) ybgVar5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) ybgVar5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) ybgVar5).bottomMargin = marginLayoutParams.bottomMargin;
        return ybgVar5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                ybg ybgVar = (ybg) childAt.getLayoutParams();
                if (ybgVar.b == 0 && v(childAt)) {
                    int i3 = ybgVar.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            ybg ybgVar2 = (ybg) childAt2.getLayoutParams();
            if (ybgVar2.b == 0 && v(childAt2)) {
                int i5 = ybgVar2.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ybg ybgVarH = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (ybg) layoutParams;
        ybgVarH.b = 1;
        if (!z || this.v0 == null) {
            addView(view, ybgVarH);
        } else {
            view.setLayoutParams(ybgVarH);
            this.R0.add(view);
        }
    }

    public final void c() {
        if (this.u0 == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, fvc.toolbarNavigationButtonStyle);
            this.u0 = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.s0);
            this.u0.setContentDescription(this.t0);
            ybg ybgVarH = h();
            ybgVarH.a = (this.A0 & 112) | 8388611;
            ybgVarH.b = 2;
            this.u0.setLayoutParams(ybgVarH);
            this.u0.setOnClickListener(new r6(12, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof ybg);
    }

    public final void d() {
        if (this.G0 == null) {
            vud vudVar = new vud();
            vudVar.a = 0;
            vudVar.b = 0;
            vudVar.c = Integer.MIN_VALUE;
            vudVar.d = Integer.MIN_VALUE;
            vudVar.e = 0;
            vudVar.f = 0;
            vudVar.g = false;
            vudVar.h = false;
            this.G0 = vudVar;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.a == null) {
            vf9 vf9Var = (vf9) actionMenuView.getMenu();
            if (this.Z0 == null) {
                this.Z0 = new xbg(this);
            }
            this.a.setExpandedActionViewsExclusive(true);
            vf9Var.b(this.Z0, this.w0);
            x();
        }
    }

    public final void f() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.a = actionMenuView;
            actionMenuView.setPopupTheme(this.x0);
            this.a.setOnMenuItemClickListener(this.W0);
            ActionMenuView actionMenuView2 = this.a;
            os0 os0Var = this.a1;
            zid zidVar = new zid(this);
            actionMenuView2.s0 = os0Var;
            actionMenuView2.t0 = zidVar;
            ybg ybgVarH = h();
            ybgVarH.a = (this.A0 & 112) | 8388613;
            this.a.setLayoutParams(ybgVarH);
            b(this.a, false);
        }
    }

    public final void g() {
        if (this.d == null) {
            this.d = new AppCompatImageButton(getContext(), null, fvc.toolbarNavigationButtonStyle);
            ybg ybgVarH = h();
            ybgVarH.a = (this.A0 & 112) | 8388611;
            this.d.setLayoutParams(ybgVarH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        AppCompatImageButton appCompatImageButton = this.u0;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        AppCompatImageButton appCompatImageButton = this.u0;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        vud vudVar = this.G0;
        if (vudVar != null) {
            return vudVar.g ? vudVar.a : vudVar.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.I0;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        vud vudVar = this.G0;
        if (vudVar != null) {
            return vudVar.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        vud vudVar = this.G0;
        if (vudVar != null) {
            return vudVar.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        vud vudVar = this.G0;
        if (vudVar != null) {
            return vudVar.g ? vudVar.b : vudVar.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.H0;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        vf9 vf9Var;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (vf9Var = actionMenuView.a) == null || !vf9Var.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.I0, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.H0, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.o;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.o;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.a.getMenu();
    }

    public View getNavButtonView() {
        return this.d;
    }

    public CharSequence getNavigationContentDescription() {
        AppCompatImageButton appCompatImageButton = this.d;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.d;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public h7 getOuterActionMenuPresenter() {
        return this.Y0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.w0;
    }

    public int getPopupTheme() {
        return this.x0;
    }

    public CharSequence getSubtitle() {
        return this.L0;
    }

    public final TextView getSubtitleTextView() {
        return this.c;
    }

    public CharSequence getTitle() {
        return this.K0;
    }

    public int getTitleMarginBottom() {
        return this.F0;
    }

    public int getTitleMarginEnd() {
        return this.D0;
    }

    public int getTitleMarginStart() {
        return this.C0;
    }

    public int getTitleMarginTop() {
        return this.E0;
    }

    public final TextView getTitleTextView() {
        return this.b;
    }

    public xh4 getWrapper() {
        if (this.X0 == null) {
            this.X0 = new fcg(this, true);
        }
        return this.X0;
    }

    public final int j(View view, int i) {
        ybg ybgVar = (ybg) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = ybgVar.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.J0 & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) ybgVar).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) ybgVar).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) ybgVar).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public void m(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final void n() {
        Iterator it = this.U0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.T0.b).iterator();
        while (it2.hasNext()) {
            ((ki6) it2.next()).a.k(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.U0 = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.R0.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        x();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.g1);
        x();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.P0 = false;
        }
        if (!this.P0) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.P0 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.P0 = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x028f A[LOOP:0: B:102:0x028d->B:103:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a7 A[LOOP:1: B:105:0x02a5->B:106:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c7 A[LOOP:2: B:108:0x02c5->B:109:0x02c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x031a A[LOOP:3: B:117:0x0318->B:118:0x031a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z = whh.a;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (v(this.d)) {
            t(this.d, i, 0, i2, this.B0);
            iK = k(this.d) + this.d.getMeasuredWidth();
            iMax = Math.max(0, l(this.d) + this.d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (v(this.u0)) {
            t(this.u0, i, 0, i2, this.B0);
            iK = k(this.u0) + this.u0.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.u0) + this.u0.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.u0.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        Object[] objArr2 = objArr;
        int[] iArr = this.S0;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (v(this.a)) {
            t(this.a, i, iMax3, i2, this.B0);
            iK2 = k(this.a) + this.a.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.a) + this.a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.a.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[c] = Math.max(0, currentContentInsetEnd - iK2);
        if (v(this.v0)) {
            iMax5 += s(this.v0, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.v0) + this.v0.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.v0.getMeasuredState());
        }
        if (v(this.o)) {
            iMax5 += s(this.o, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.o) + this.o.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.o.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((ybg) childAt.getLayoutParams()).b == 0 && v(childAt)) {
                iMax5 += s(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i5 = iMax5;
        int i6 = this.E0 + this.F0;
        int i7 = this.C0 + this.D0;
        if (v(this.b)) {
            s(this.b, i, i5 + i7, i2, i6, iArr);
            int iK3 = k(this.b) + this.b.getMeasuredWidth();
            iL = l(this.b) + this.b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.b.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (v(this.c)) {
            iMax2 = Math.max(iMax2, s(this.c, i, i5 + i7, i2, i6 + iL, iArr));
            iL += l(this.c) + this.c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.c.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.c1) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (v(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.a);
        ActionMenuView actionMenuView = this.a;
        vf9 vf9Var = actionMenuView != null ? actionMenuView.a : null;
        int i = aVar.c;
        if (i != 0 && this.Z0 != null && vf9Var != null && (menuItemFindItem = vf9Var.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (aVar.d) {
            r98 r98Var = this.g1;
            removeCallbacks(r98Var);
            post(r98Var);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        vud vudVar = this.G0;
        boolean z = i == 1;
        if (z == vudVar.g) {
            return;
        }
        vudVar.g = z;
        if (!vudVar.h) {
            vudVar.a = vudVar.e;
            vudVar.b = vudVar.f;
            return;
        }
        if (z) {
            int i2 = vudVar.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = vudVar.e;
            }
            vudVar.a = i2;
            int i3 = vudVar.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = vudVar.f;
            }
            vudVar.b = i3;
            return;
        }
        int i4 = vudVar.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = vudVar.e;
        }
        vudVar.a = i4;
        int i5 = vudVar.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = vudVar.f;
        }
        vudVar.b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        zf9 zf9Var;
        a aVar = new a(super.onSaveInstanceState());
        xbg xbgVar = this.Z0;
        if (xbgVar != null && (zf9Var = xbgVar.b) != null) {
            aVar.c = zf9Var.a;
        }
        aVar.d = p();
        return aVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.O0 = false;
        }
        if (!this.O0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.O0 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.O0 = false;
        return true;
    }

    public final boolean p() {
        h7 h7Var;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (h7Var = actionMenuView.o) == null || !h7Var.j()) ? false : true;
    }

    public final int q(View view, int i, int i2, int[] iArr) {
        ybg ybgVar = (ybg) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) ybgVar).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) ybgVar).rightMargin + iMax;
    }

    public final int r(View view, int i, int i2, int[] iArr) {
        ybg ybgVar = (ybg) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) ybgVar).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) ybgVar).leftMargin);
    }

    public final int s(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.f1 != z) {
            this.f1 = z;
            x();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(eri.a(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.c1 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.I0) {
            this.I0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.H0) {
            this.H0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(eri.a(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(eri.a(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(zbg zbgVar) {
        this.V0 = zbgVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.x0 != i) {
            this.x0 = i;
            if (i == 0) {
                this.w0 = getContext();
            } else {
                this.w0 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.F0 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.D0 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.C0 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.E0 = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public final void t(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void u(int i, int i2) {
        d();
        this.G0.a(i, i2);
    }

    public final boolean v(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean w() {
        h7 h7Var;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (h7Var = actionMenuView.o) == null || !h7Var.l()) ? false : true;
    }

    public final void x() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = wbg.a(this);
            xbg xbgVar = this.Z0;
            boolean z = (xbgVar == null || xbgVar.b == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.f1) ? false : true;
            if (z && this.e1 == null) {
                if (this.d1 == null) {
                    this.d1 = wbg.b(new vbg(this, 0));
                }
                wbg.c(onBackInvokedDispatcherA, this.d1);
                this.e1 = onBackInvokedDispatcherA;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.e1) == null) {
                return;
            }
            wbg.d(onBackInvokedDispatcher, this.d1);
            this.e1 = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.J0 = 8388627;
        this.Q0 = new ArrayList();
        this.R0 = new ArrayList();
        this.S0 = new int[2];
        this.T0 = new ka5(new vbg(this, 1));
        this.U0 = new ArrayList();
        this.W0 = new n4e(this);
        this.g1 = new r98(28, this);
        jdc jdcVarX = jdc.x(getContext(), attributeSet, o6d.Toolbar, i);
        hfh.m(this, context, o6d.Toolbar, attributeSet, (TypedArray) jdcVarX.c, i, 0);
        int i2 = o6d.Toolbar_titleTextAppearance;
        TypedArray typedArray = (TypedArray) jdcVarX.c;
        this.y0 = typedArray.getResourceId(i2, 0);
        this.z0 = typedArray.getResourceId(o6d.Toolbar_subtitleTextAppearance, 0);
        this.J0 = typedArray.getInteger(o6d.Toolbar_android_gravity, 8388627);
        this.A0 = typedArray.getInteger(o6d.Toolbar_buttonGravity, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(o6d.Toolbar_titleMargin, 0);
        dimensionPixelOffset = typedArray.hasValue(o6d.Toolbar_titleMargins) ? typedArray.getDimensionPixelOffset(o6d.Toolbar_titleMargins, dimensionPixelOffset) : dimensionPixelOffset;
        this.F0 = dimensionPixelOffset;
        this.E0 = dimensionPixelOffset;
        this.D0 = dimensionPixelOffset;
        this.C0 = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(o6d.Toolbar_titleMarginStart, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.C0 = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(o6d.Toolbar_titleMarginEnd, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.D0 = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(o6d.Toolbar_titleMarginTop, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.E0 = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(o6d.Toolbar_titleMarginBottom, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.F0 = dimensionPixelOffset5;
        }
        this.B0 = typedArray.getDimensionPixelSize(o6d.Toolbar_maxButtonHeight, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(o6d.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(o6d.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(o6d.Toolbar_contentInsetLeft, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(o6d.Toolbar_contentInsetRight, 0);
        d();
        vud vudVar = this.G0;
        vudVar.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            vudVar.e = dimensionPixelSize;
            vudVar.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            vudVar.f = dimensionPixelSize2;
            vudVar.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            vudVar.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.H0 = typedArray.getDimensionPixelOffset(o6d.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.I0 = typedArray.getDimensionPixelOffset(o6d.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.s0 = jdcVarX.t(o6d.Toolbar_collapseIcon);
        this.t0 = typedArray.getText(o6d.Toolbar_collapseContentDescription);
        CharSequence text = typedArray.getText(o6d.Toolbar_title);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(o6d.Toolbar_subtitle);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.w0 = getContext();
        setPopupTheme(typedArray.getResourceId(o6d.Toolbar_popupTheme, 0));
        Drawable drawableT = jdcVarX.t(o6d.Toolbar_navigationIcon);
        if (drawableT != null) {
            setNavigationIcon(drawableT);
        }
        CharSequence text3 = typedArray.getText(o6d.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableT2 = jdcVarX.t(o6d.Toolbar_logo);
        if (drawableT2 != null) {
            setLogo(drawableT2);
        }
        CharSequence text4 = typedArray.getText(o6d.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(o6d.Toolbar_titleTextColor)) {
            setTitleTextColor(jdcVarX.s(o6d.Toolbar_titleTextColor));
        }
        if (typedArray.hasValue(o6d.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(jdcVarX.s(o6d.Toolbar_subtitleTextColor));
        }
        if (typedArray.hasValue(o6d.Toolbar_menu)) {
            m(typedArray.getResourceId(o6d.Toolbar_menu, 0));
        }
        jdcVarX.B();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ybg ybgVar = new ybg(context, attributeSet);
        ybgVar.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o6d.ActionBarLayout);
        ybgVar.a = typedArrayObtainStyledAttributes.getInt(o6d.ActionBarLayout_android_layout_gravity, 0);
        typedArrayObtainStyledAttributes.recycle();
        ybgVar.b = 0;
        return ybgVar;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        AppCompatImageButton appCompatImageButton = this.u0;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.u0.setImageDrawable(drawable);
        } else {
            AppCompatImageButton appCompatImageButton = this.u0;
            if (appCompatImageButton != null) {
                appCompatImageButton.setImageDrawable(this.s0);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.o == null) {
                this.o = new AppCompatImageView(getContext(), null);
            }
            if (!o(this.o)) {
                b(this.o, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.o;
            if (appCompatImageView != null && o(appCompatImageView)) {
                removeView(this.o);
                this.R0.remove(this.o);
            }
        }
        AppCompatImageView appCompatImageView2 = this.o;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.o == null) {
            this.o = new AppCompatImageView(getContext(), null);
        }
        AppCompatImageView appCompatImageView = this.o;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        AppCompatImageButton appCompatImageButton = this.d;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            gcg.a(this.d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.d)) {
                b(this.d, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.d;
            if (appCompatImageButton != null && o(appCompatImageButton)) {
                removeView(this.d);
                this.R0.remove(this.d);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.d;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.c;
            if (appCompatTextView != null && o(appCompatTextView)) {
                removeView(this.c);
                this.R0.remove(this.c);
            }
        } else {
            if (this.c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.c = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.z0;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.N0;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!o(this.c)) {
                b(this.c, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.c;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.L0 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.N0 = colorStateList;
        AppCompatTextView appCompatTextView = this.c;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.b;
            if (appCompatTextView != null && o(appCompatTextView)) {
                removeView(this.b);
                this.R0.remove(this.b);
            }
        } else {
            if (this.b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.b = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.y0;
                if (i != 0) {
                    this.b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.M0;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!o(this.b)) {
                b(this.b, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.b;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.K0 = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.M0 = colorStateList;
        AppCompatTextView appCompatTextView = this.b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }
}

package com.avito.android.user_adverts.tab_actions.host;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UserAdvertsActionsBottomSheetView.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/UserAdvertsActionsBottomSheetView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;", "", "titleText", "Lkotlin/G0;", "setTitle", "(Ljava/lang/CharSequence;)V", "Landroid/view/View$OnClickListener;", "listener", "setOnCloseClickListener", "(Landroid/view/View$OnClickListener;)V", "", "peekHeight", "setPeekHeight", "(I)V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;", "getBehavior", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserAdvertsActionsBottomSheetView extends ConstraintLayout implements CoordinatorLayout.b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f314218b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f314219c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f314220d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f314221e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final BottomSheetBehavior<UserAdvertsActionsBottomSheetView> f314222f;

    /* renamed from: g, reason: collision with root package name */
    public final int f314223g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public View.OnClickListener f314224h;

    @X41.j
    public UserAdvertsActionsBottomSheetView(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @Y61.k
    public CoordinatorLayout.c<?> getBehavior() {
        return this.f314222f;
    }

    public final void setOnCloseClickListener(@Y61.l View.OnClickListener listener) {
        this.f314220d.setOnClickListener(listener);
        this.f314224h = listener;
    }

    public final void setPeekHeight(int peekHeight) {
        this.f314222f.N(peekHeight, false);
    }

    public final void setTitle(@Y61.l CharSequence titleText) {
        this.f314219c.setText(titleText);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UserAdvertsActionsBottomSheetView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.bottomSheet_style : i12;
        i13 = (i14 & 8) != 0 ? R.style.Design_Widget_BottomSheetDialog_Modal : i13;
        int iJ2 = C35835l0.j(R.attr.bottomSheetDefault, context);
        super(((context instanceof androidx.appcompat.view.d) && ((androidx.appcompat.view.d) context).f21657a == iJ2) ? context : new androidx.appcompat.view.d(context, iJ2), attributeSet, i12, i13);
        LayoutInflater.from(getContext()).inflate(R.layout.user_adverts_actions_bottom_sheet_view, this);
        this.f314218b = findViewById(R.id.user_adverts_bs_actions_thumb);
        this.f314219c = (TextView) findViewById(R.id.user_adverts_bs_actions_title);
        this.f314220d = findViewById(R.id.user_adverts_bs_actions_close);
        this.f314221e = (ViewGroup) findViewById(R.id.user_adverts_bs_actions_content);
        this.f314222f = new BottomSheetBehavior<>(getContext(), attributeSet);
        this.f314223g = C35835l0.f(R.attr.bottomSheet_cornerRadius, getContext());
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.getPaint().setColor(C35835l0.d(R.attr.bottomSheet_thumbColor, getContext()));
        float[] fArr = new float[8];
        for (int i15 = 0; i15 < 8; i15++) {
            fArr[i15] = y6.b(4);
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        this.f314218b.setBackground(shapeDrawable);
        setClipToOutline(true);
        setOutlineProvider(new a(this));
        this.f314222f.v(new b(this));
        setFocusable(true);
        setClickable(true);
    }
}

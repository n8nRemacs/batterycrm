package one.me.sdk.uikit.common.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.a93;
import defpackage.cm6;
import defpackage.dpg;
import defpackage.f8j;
import defpackage.gza;
import defpackage.iza;
import defpackage.jza;
import defpackage.kti;
import defpackage.r34;
import defpackage.t75;
import defpackage.u6g;
import defpackage.v1a;
import defpackage.vw4;
import defpackage.x6;
import defpackage.yeb;
import defpackage.z7;
import kotlin.Metadata;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0011\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000b2\b\b\u0001\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\rJ\u001b\u0010\u0019\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lone/me/sdk/uikit/common/views/EmptySearchView;", "Landroid/widget/LinearLayout;", "Lu6g;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "drawableRes", "Lqqg;", "setImage", "(I)V", "titleRes", "setTitle", "descriptionRes", "setDescription", "", "description", "(Ljava/lang/String;)V", "buttonTitle", "setButtonTitle", "Lkotlin/Function0;", "action", "setButtonAction", "(Lcm6;)V", "", "visible", "setIsButtonVisible", "(Z)V", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EmptySearchView extends LinearLayout implements u6g {
    public static final /* synthetic */ int o = 0;
    public final AppCompatImageView a;
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final OneMeButton d;

    public EmptySearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        float f = 188;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        layoutParams.setMargins(0, 0, 0, kti.d(16 * vw4.d().getDisplayMetrics().density));
        appCompatImageView.setLayoutParams(layoutParams);
        setGravity(17);
        v1a v1aVar = a93.s0;
        appCompatImageView.setImageTintList(ColorStateList.valueOf(v1aVar.y(appCompatImageView).getIcon().h));
        this.a = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, 0, kti.d(2 * vw4.d().getDisplayMetrics().density));
        appCompatTextView.setLayoutParams(layoutParams2);
        dpg.d.b(appCompatTextView, t75.b);
        appCompatTextView.setTextColor(v1aVar.y(appCompatTextView).getText().e);
        appCompatTextView.setGravity(17);
        this.b = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(0, 0, 0, kti.d(24 * vw4.d().getDisplayMetrics().density));
        appCompatTextView2.setLayoutParams(layoutParams3);
        dpg.j.b(appCompatTextView2, t75.b);
        appCompatTextView2.setTextColor(v1aVar.y(appCompatTextView2).getText().g);
        appCompatTextView2.setGravity(17);
        this.c = appCompatTextView2;
        OneMeButton oneMeButton = new OneMeButton(context, null);
        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        oneMeButton.setSize(jza.b);
        oneMeButton.setMode(iza.a);
        oneMeButton.setAppearance(gza.a);
        setGravity(17);
        this.d = oneMeButton;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setOrientation(1);
        setPaddingRelative(kti.c(vw4.d().getDisplayMetrics().density * 21.5d), 0, kti.c(vw4.d().getDisplayMetrics().density * 21.5d), 0);
        addView(appCompatTextView);
        addView(appCompatTextView2);
        addView(oneMeButton);
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.a.setImageTintList(ColorStateList.valueOf(yebVar.getIcon().h));
        this.b.setTextColor(yebVar.getText().e);
        this.c.setTextColor(yebVar.getText().g);
    }

    public final void setButtonAction(cm6 action) {
        f8j.d(this.d, 300L, new x6(4, action));
    }

    public final void setButtonTitle(int buttonTitle) {
        this.d.setText(buttonTitle);
    }

    public final void setDescription(String description) {
        this.c.setText(description);
    }

    public final void setImage(int drawableRes) {
        this.a.setImageDrawable(r34.b(getContext(), drawableRes).mutate());
    }

    public final void setIsButtonVisible(boolean visible) {
        this.d.setVisibility(visible ? 0 : 8);
    }

    public final void setTitle(int titleRes) {
        this.b.setText(z7.e(getContext(), titleRes));
    }

    public final void setDescription(int descriptionRes) {
        this.c.setText(z7.e(getContext(), descriptionRes));
    }
}

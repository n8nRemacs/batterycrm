package ru.avito.component.toolbar;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import hw.InterfaceC41178c;
import j.InterfaceC42156l;
import j.f0;
import kG0.C42580a;
import kotlin.Metadata;
import n11.RunnableC44167a;

/* compiled from: AppBarLayoutWithTextAction.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\fR(\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/avito/component/toolbar/AppBarLayoutWithTextAction;", "Lru/avito/component/toolbar/CollapsingTitleAppBarLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "color", "Lkotlin/G0;", "setActionTextColor", "(I)V", "resId", "setActionTextStyle", "", "actionTitle", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "action", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AppBarLayoutWithTextAction extends CollapsingTitleAppBarLayout {
    public AppBarLayoutWithTextAction(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C42580a.o.f406214d, 0, 0);
        setActionView(layoutInflater.inflate(typedArrayObtainStyledAttributes.getResourceId(0, R.layout.collapsing_title_appbar_text_action), (ViewGroup) getActionViewContainer(), false));
        setAction(typedArrayObtainStyledAttributes.getString(1));
        typedArrayObtainStyledAttributes.recycle();
    }

    @l
    public final String getAction() {
        return ((TextView) getActionView()).getText().toString();
    }

    public final void setAction(@l String str) {
        TextView textView = (TextView) getActionView();
        if (str == null || str.length() == 0) {
            textView.setText("");
            getActionViewContainer().setVisibility(4);
        } else {
            textView.setText(str);
            getActionViewContainer().setVisibility(0);
        }
        getActionViewContainer().post(new RunnableC44167a(this, 4));
    }

    public final void setActionTextColor(@InterfaceC42156l int color) {
        ((TextView) getActionView()).setTextColor(color);
    }

    public final void setActionTextStyle(@f0 int resId) {
        ((TextView) getActionView()).setTextAppearance(resId);
    }
}

package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class vc extends jo implements DialogInterface {
    public final tc X;

    public vc(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, f(contextThemeWrapper, i));
        this.X = new tc(getContext(), this, getWindow());
    }

    public static int f(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(fvc.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.jo, defpackage.pl3, android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        tc tcVar = this.X;
        tcVar.b.setContentView(tcVar.z);
        Context context = tcVar.a;
        Window window = tcVar.c;
        View viewFindViewById2 = window.findViewById(zxc.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(zxc.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(zxc.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(zxc.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(zxc.customPanel);
        View view = tcVar.g;
        if (view == null) {
            view = null;
        }
        boolean z = view != null;
        if (!z || !tc.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(zxc.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (tcVar.h) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (tcVar.f != null) {
                ((LinearLayout.LayoutParams) ((v48) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(zxc.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(zxc.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(zxc.buttonPanel);
        ViewGroup viewGroupB = tc.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = tc.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = tc.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(zxc.scrollView);
        tcVar.r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        tcVar.r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(R.id.message);
        tcVar.v = textView;
        if (textView != null) {
            CharSequence charSequence = tcVar.e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                tcVar.r.removeView(tcVar.v);
                if (tcVar.f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) tcVar.r.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(tcVar.r);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(tcVar.f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupB2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupB3.findViewById(R.id.button1);
        tcVar.i = button;
        r6 r6Var = tcVar.F;
        button.setOnClickListener(r6Var);
        if (TextUtils.isEmpty(tcVar.j)) {
            tcVar.i.setVisibility(8);
            i = 0;
        } else {
            tcVar.i.setText(tcVar.j);
            tcVar.i.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroupB3.findViewById(R.id.button2);
        tcVar.l = button2;
        button2.setOnClickListener(r6Var);
        if (TextUtils.isEmpty(tcVar.m)) {
            tcVar.l.setVisibility(8);
        } else {
            tcVar.l.setText(tcVar.m);
            tcVar.l.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroupB3.findViewById(R.id.button3);
        tcVar.o = button3;
        button3.setOnClickListener(r6Var);
        if (TextUtils.isEmpty(tcVar.p)) {
            tcVar.o.setVisibility(8);
        } else {
            tcVar.o.setText(tcVar.p);
            tcVar.o.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(fvc.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = tcVar.i;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = tcVar.l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = tcVar.o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (tcVar.w != null) {
            viewGroupB.addView(tcVar.w, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(zxc.title_template).setVisibility(8);
        } else {
            tcVar.t = (ImageView) window.findViewById(R.id.icon);
            if (TextUtils.isEmpty(tcVar.d) || !tcVar.D) {
                window.findViewById(zxc.title_template).setVisibility(8);
                tcVar.t.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(zxc.alertTitle);
                tcVar.u = textView2;
                textView2.setText(tcVar.d);
                Drawable drawable = tcVar.s;
                if (drawable != null) {
                    tcVar.t.setImageDrawable(drawable);
                } else {
                    tcVar.u.setPadding(tcVar.t.getPaddingLeft(), tcVar.t.getPaddingTop(), tcVar.t.getPaddingRight(), tcVar.t.getPaddingBottom());
                    tcVar.t.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i2 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupB3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupB2.findViewById(zxc.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = tcVar.r;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (tcVar.e == null && tcVar.f == null) ? null : viewGroupB.findViewById(zxc.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(zxc.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = tcVar.f;
        if (alertController$RecycleListView != null && (!z3 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.b);
        }
        if (!z2) {
            View view2 = tcVar.f;
            if (view2 == null) {
                view2 = tcVar.r;
            }
            if (view2 != null) {
                int i3 = z3 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(zxc.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(zxc.scrollIndicatorDown);
                WeakHashMap weakHashMap = hfh.a;
                weh.d(view2, i2 | i3, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = tcVar.f;
        if (alertController$RecycleListView2 == null || (listAdapter = tcVar.x) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = tcVar.y;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.X.r;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.X.r;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.jo, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        tc tcVar = this.X;
        tcVar.d = charSequence;
        TextView textView = tcVar.u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}

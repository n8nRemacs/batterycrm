package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import defpackage.fvc;
import defpackage.jdc;
import defpackage.ng9;
import defpackage.o6d;
import defpackage.p1d;
import defpackage.vf9;
import defpackage.zf9;
import defpackage.zxc;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements ng9, AbsListView.SelectionBoundsAdjuster {
    public final Drawable A0;
    public final boolean B0;
    public LayoutInflater C0;
    public boolean D0;
    public zf9 a;
    public ImageView b;
    public RadioButton c;
    public TextView d;
    public CheckBox o;
    public TextView s0;
    public ImageView t0;
    public ImageView u0;
    public LinearLayout v0;
    public final Drawable w0;
    public final int x0;
    public final Context y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = fvc.listMenuViewStyle;
        jdc jdcVarX = jdc.x(getContext(), attributeSet, o6d.MenuView, i);
        this.w0 = jdcVarX.t(o6d.MenuView_android_itemBackground);
        int i2 = o6d.MenuView_android_itemTextAppearance;
        TypedArray typedArray = (TypedArray) jdcVarX.c;
        this.x0 = typedArray.getResourceId(i2, -1);
        this.z0 = typedArray.getBoolean(o6d.MenuView_preserveIconSpacing, false);
        this.y0 = context;
        this.A0 = jdcVarX.t(o6d.MenuView_subMenuArrow);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, fvc.dropDownListViewStyle, 0);
        this.B0 = typedArrayObtainStyledAttributes.hasValue(0);
        jdcVarX.B();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.C0 == null) {
            this.C0 = LayoutInflater.from(getContext());
        }
        return this.C0;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.t0;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.u0;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.u0.getLayoutParams();
        rect.top = this.u0.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    @Override // defpackage.ng9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.zf9 r11) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.c(zf9):void");
    }

    @Override // defpackage.ng9
    public zf9 getItemData() {
        return this.a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.w0);
        TextView textView = (TextView) findViewById(zxc.title);
        this.d = textView;
        int i = this.x0;
        if (i != -1) {
            textView.setTextAppearance(this.y0, i);
        }
        this.s0 = (TextView) findViewById(zxc.shortcut);
        ImageView imageView = (ImageView) findViewById(zxc.submenuarrow);
        this.t0 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.A0);
        }
        this.u0 = (ImageView) findViewById(zxc.group_divider);
        this.v0 = (LinearLayout) findViewById(zxc.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.b != null && this.z0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.c == null && this.o == null) {
            return;
        }
        if ((this.a.H0 & 4) != 0) {
            if (this.c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(p1d.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.c = radioButton;
                LinearLayout linearLayout = this.v0;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.c;
            view = this.o;
        } else {
            if (this.o == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(p1d.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.o = checkBox;
                LinearLayout linearLayout2 = this.v0;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.o;
            view = this.c;
        }
        if (z) {
            compoundButton.setChecked(this.a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.o;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.a.H0 & 4) != 0) {
            if (this.c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(p1d.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.c = radioButton;
                LinearLayout linearLayout = this.v0;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.c;
        } else {
            if (this.o == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(p1d.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.o = checkBox;
                LinearLayout linearLayout2 = this.v0;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.o;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.D0 = z;
        this.z0 = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.u0;
        if (imageView != null) {
            imageView.setVisibility((this.B0 || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        vf9 vf9Var = this.a.x0;
        boolean z = this.D0;
        if (z || this.z0) {
            ImageView imageView = this.b;
            if (imageView == null && drawable == null && !this.z0) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(p1d.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.b = imageView2;
                LinearLayout linearLayout = this.v0;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.z0) {
                this.b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.b;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.b.getVisibility() != 0) {
                this.b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.d.getVisibility() != 8) {
                this.d.setVisibility(8);
            }
        } else {
            this.d.setText(charSequence);
            if (this.d.getVisibility() != 0) {
                this.d.setVisibility(0);
            }
        }
    }
}

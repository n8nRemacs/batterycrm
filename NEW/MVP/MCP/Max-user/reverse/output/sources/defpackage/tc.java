package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class tc {
    public final int A;
    public final int B;
    public final int C;
    public final boolean D;
    public final rc E;
    public final Context a;
    public final vc b;
    public final Window c;
    public CharSequence d;
    public CharSequence e;
    public AlertController$RecycleListView f;
    public View g;
    public Button i;
    public CharSequence j;
    public Message k;
    public Button l;
    public CharSequence m;
    public Message n;
    public Button o;
    public CharSequence p;
    public Message q;
    public NestedScrollView r;
    public Drawable s;
    public ImageView t;
    public TextView u;
    public TextView v;
    public View w;
    public ListAdapter x;
    public final int z;
    public boolean h = false;
    public int y = -1;
    public final r6 F = new r6(1, this);

    public tc(Context context, vc vcVar, Window window) {
        this.a = context;
        this.b = vcVar;
        this.c = window;
        rc rcVar = new rc();
        rcVar.b = new WeakReference(vcVar);
        this.E = rcVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, o6d.AlertDialog, fvc.alertDialogStyle, 0);
        this.z = typedArrayObtainStyledAttributes.getResourceId(o6d.AlertDialog_android_layout, 0);
        typedArrayObtainStyledAttributes.getResourceId(o6d.AlertDialog_buttonPanelSideLayout, 0);
        this.A = typedArrayObtainStyledAttributes.getResourceId(o6d.AlertDialog_listLayout, 0);
        typedArrayObtainStyledAttributes.getResourceId(o6d.AlertDialog_multiChoiceItemLayout, 0);
        this.B = typedArrayObtainStyledAttributes.getResourceId(o6d.AlertDialog_singleChoiceItemLayout, 0);
        this.C = typedArrayObtainStyledAttributes.getResourceId(o6d.AlertDialog_listItemLayout, 0);
        this.D = typedArrayObtainStyledAttributes.getBoolean(o6d.AlertDialog_showTitle, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(o6d.AlertDialog_buttonIconDimen, 0);
        typedArrayObtainStyledAttributes.recycle();
        vcVar.c().i(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void c(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.E.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.p = charSequence;
            this.q = messageObtainMessage;
        } else if (i == -2) {
            this.m = charSequence;
            this.n = messageObtainMessage;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.j = charSequence;
            this.k = messageObtainMessage;
        }
    }
}

package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.mediarouter.app.e;
import androidx.mediarouter.app.f;
import androidx.mediarouter.app.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class v59 extends phd {
    public final Drawable X;
    public final Drawable Y;
    public final Drawable Z;
    public final ArrayList d = new ArrayList();
    public final LayoutInflater o;
    public final Drawable s0;
    public u59 t0;
    public final int u0;
    public final AccelerateDecelerateInterpolator v0;
    public final /* synthetic */ x59 w0;

    public v59(x59 x59Var) {
        this.w0 = x59Var;
        this.o = LayoutInflater.from(x59Var.x0);
        Context context = x59Var.x0;
        this.X = r69.d(context, avc.mediaRouteDefaultIconDrawable);
        this.Y = r69.d(context, avc.mediaRouteTvIconDrawable);
        this.Z = r69.d(context, avc.mediaRouteSpeakerIconDrawable);
        this.s0 = r69.d(context, avc.mediaRouteSpeakerGroupIconDrawable);
        this.u0 = context.getResources().getInteger(z0d.mr_cast_volume_slider_layout_animation_duration_ms);
        this.v0 = new AccelerateDecelerateInterpolator();
        F();
    }

    public final void C(View view, int i) {
        c59 c59Var = new c59(view, i, view.getLayoutParams().height, 1);
        c59Var.setAnimationListener(new y49(1, this));
        c59Var.setDuration(this.u0);
        c59Var.setInterpolator(this.v0);
        view.startAnimation(c59Var);
    }

    public final Drawable D(k69 k69Var) {
        Uri uri = k69Var.f;
        if (uri != null) {
            try {
                Drawable drawableCreateFromStream = Drawable.createFromStream(this.w0.x0.getContentResolver().openInputStream(uri), null);
                if (drawableCreateFromStream != null) {
                    return drawableCreateFromStream;
                }
            } catch (IOException e) {
                Log.w("MediaRouteCtrlDialog", "Failed to load " + uri, e);
            }
        }
        int i = k69Var.m;
        return i != 1 ? i != 2 ? k69Var.e() ? this.s0 : this.X : this.Z : this.Y;
    }

    public final void E() {
        y59 y59Var;
        x59 x59Var = this.w0;
        ArrayList arrayList = x59Var.w0;
        arrayList.clear();
        ArrayList arrayList2 = x59Var.u0;
        ArrayList arrayList3 = new ArrayList();
        j69 j69Var = x59Var.s0.a;
        j69Var.getClass();
        l69.b();
        for (k69 k69Var : Collections.unmodifiableList(j69Var.b)) {
            y6i y6iVarB = x59Var.s0.b(k69Var);
            if (y6iVarB != null && (y59Var = (y59) y6iVarB.b) != null && y59Var.d) {
                arrayList3.add(k69Var);
            }
        }
        HashSet hashSet = new HashSet(arrayList2);
        hashSet.removeAll(arrayList3);
        arrayList.addAll(hashSet);
        m();
    }

    public final void F() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        x59 x59Var = this.w0;
        ArrayList arrayList2 = x59Var.v0;
        ArrayList arrayList3 = x59Var.u0;
        this.t0 = new u59(1, x59Var.s0);
        ArrayList arrayList4 = x59Var.t0;
        if (arrayList4.isEmpty()) {
            arrayList.add(new u59(3, x59Var.s0));
        } else {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                arrayList.add(new u59(3, (k69) it.next()));
            }
        }
        boolean z = false;
        if (!arrayList3.isEmpty()) {
            Iterator it2 = arrayList3.iterator();
            boolean z2 = false;
            while (it2.hasNext()) {
                k69 k69Var = (k69) it2.next();
                if (!arrayList4.contains(k69Var)) {
                    if (!z2) {
                        x59Var.s0.getClass();
                        z59 z59VarA = k69.a();
                        String strJ = z59VarA != null ? z59VarA.j() : null;
                        if (TextUtils.isEmpty(strJ)) {
                            strJ = x59Var.x0.getString(j4d.mr_dialog_groupable_header);
                        }
                        arrayList.add(new u59(2, strJ));
                        z2 = true;
                    }
                    arrayList.add(new u59(3, k69Var));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                k69 k69Var2 = (k69) it3.next();
                k69 k69Var3 = x59Var.s0;
                if (k69Var3 != k69Var2) {
                    if (!z) {
                        k69Var3.getClass();
                        z59 z59VarA2 = k69.a();
                        String strK = z59VarA2 != null ? z59VarA2.k() : null;
                        if (TextUtils.isEmpty(strK)) {
                            strK = x59Var.x0.getString(j4d.mr_dialog_transferable_header);
                        }
                        arrayList.add(new u59(2, strK));
                        z = true;
                    }
                    arrayList.add(new u59(4, k69Var2));
                }
            }
        }
        E();
    }

    @Override // defpackage.phd
    public final int j() {
        return this.d.size() + 1;
    }

    @Override // defpackage.phd
    public final int l(int i) {
        u59 u59Var;
        if (i == 0) {
            u59Var = this.t0;
        } else {
            u59Var = (u59) this.d.get(i - 1);
        }
        return u59Var.b;
    }

    @Override // defpackage.phd
    public final void r(mid midVar, int i) {
        y6i y6iVarB;
        y59 y59Var;
        ArrayList arrayList = this.d;
        int i2 = (i == 0 ? this.t0 : (u59) arrayList.get(i - 1)).b;
        u59 u59Var = i == 0 ? this.t0 : (u59) arrayList.get(i - 1);
        x59 x59Var = this.w0;
        int i3 = 0;
        if (i2 == 1) {
            x59Var.F0.put(((k69) u59Var.a).c, (e) midVar);
            f fVar = (f) midVar;
            View view = fVar.a;
            x59 x59Var2 = fVar.K0.w0;
            if (x59Var2.c1 && Collections.unmodifiableList(x59Var2.s0.u).size() > 1) {
                i3 = fVar.J0;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i3;
            view.setLayoutParams(layoutParams);
            k69 k69Var = (k69) u59Var.a;
            fVar.z(k69Var);
            fVar.I0.setText(k69Var.d);
            return;
        }
        if (i2 == 2) {
            ((t59) midVar).E0.setText(u59Var.a.toString());
            return;
        }
        if (i2 != 3) {
            if (i2 != 4) {
                Log.w("MediaRouteCtrlDialog", "Cannot bind item to ViewHolder because of wrong view type");
                return;
            }
            s59 s59Var = (s59) midVar;
            View view2 = s59Var.E0;
            k69 k69Var2 = (k69) u59Var.a;
            s59Var.J0 = k69Var2;
            ImageView imageView = s59Var.F0;
            imageView.setVisibility(0);
            s59Var.G0.setVisibility(4);
            v59 v59Var = s59Var.K0;
            List listUnmodifiableList = Collections.unmodifiableList(v59Var.w0.s0.u);
            view2.setAlpha((listUnmodifiableList.size() == 1 && listUnmodifiableList.get(0) == k69Var2) ? s59Var.I0 : 1.0f);
            view2.setOnClickListener(new r6(8, s59Var));
            imageView.setImageDrawable(v59Var.D(k69Var2));
            s59Var.H0.setText(k69Var2.d);
            return;
        }
        x59Var.F0.put(((k69) u59Var.a).c, (e) midVar);
        g gVar = (g) midVar;
        float f = gVar.O0;
        r6 r6Var = gVar.Q0;
        ImageView imageView2 = gVar.J0;
        View view3 = gVar.I0;
        CheckBox checkBox = gVar.N0;
        k69 k69Var3 = (k69) u59Var.a;
        v59 v59Var2 = gVar.R0;
        x59 x59Var3 = v59Var2.w0;
        if (k69Var3 == x59Var3.s0 && Collections.unmodifiableList(k69Var3.u).size() > 0) {
            Iterator it = Collections.unmodifiableList(k69Var3.u).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                k69 k69Var4 = (k69) it.next();
                if (!x59Var3.u0.contains(k69Var4)) {
                    k69Var3 = k69Var4;
                    break;
                }
            }
        }
        gVar.z(k69Var3);
        imageView2.setImageDrawable(v59Var2.D(k69Var3));
        gVar.L0.setText(k69Var3.d);
        checkBox.setVisibility(0);
        boolean zC = gVar.C(k69Var3);
        boolean z = !x59Var3.w0.contains(k69Var3) && (!gVar.C(k69Var3) || Collections.unmodifiableList(x59Var3.s0.u).size() >= 2) && (!gVar.C(k69Var3) || ((y6iVarB = x59Var3.s0.b(k69Var3)) != null && ((y59Var = (y59) y6iVarB.b) == null || y59Var.c)));
        checkBox.setChecked(zC);
        gVar.K0.setVisibility(4);
        imageView2.setVisibility(0);
        view3.setEnabled(z);
        checkBox.setEnabled(z);
        gVar.F0.setEnabled(z || zC);
        gVar.G0.setEnabled(z || zC);
        view3.setOnClickListener(r6Var);
        checkBox.setOnClickListener(r6Var);
        RelativeLayout relativeLayout = gVar.M0;
        if (zC && !gVar.E0.e()) {
            i3 = gVar.P0;
        }
        ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
        layoutParams2.height = i3;
        relativeLayout.setLayoutParams(layoutParams2);
        view3.setAlpha((z || zC) ? 1.0f : f);
        checkBox.setAlpha((z || !zC) ? 1.0f : f);
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.o;
        if (i == 1) {
            return new f(this, layoutInflater.inflate(h1d.mr_cast_group_volume_item, viewGroup, false));
        }
        if (i == 2) {
            return new t59(layoutInflater.inflate(h1d.mr_cast_header_item, viewGroup, false));
        }
        if (i == 3) {
            return new g(this, layoutInflater.inflate(h1d.mr_cast_route_item, viewGroup, false));
        }
        if (i == 4) {
            return new s59(this, layoutInflater.inflate(h1d.mr_cast_group_item, viewGroup, false));
        }
        Log.w("MediaRouteCtrlDialog", "Cannot create ViewHolder because of wrong view type");
        return null;
    }

    @Override // defpackage.phd
    public final void y(mid midVar) {
        this.w0.F0.values().remove(midVar);
    }
}

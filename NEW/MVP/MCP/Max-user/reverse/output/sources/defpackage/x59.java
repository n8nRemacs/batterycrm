package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class x59 extends jo {
    public static final boolean d1 = Log.isLoggable("MediaRouteCtrlDialog", 3);
    public long A0;
    public final ey B0;
    public RecyclerView C0;
    public v59 D0;
    public w59 E0;
    public HashMap F0;
    public k69 G0;
    public HashMap H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public ImageButton L0;
    public Button M0;
    public ImageView N0;
    public View O0;
    public ImageView P0;
    public TextView Q0;
    public TextView R0;
    public String S0;
    public MediaControllerCompat T0;
    public final r59 U0;
    public MediaDescriptionCompat V0;
    public q59 W0;
    public final l69 X;
    public Bitmap X0;
    public final t49 Y;
    public Uri Y0;
    public d69 Z;
    public boolean Z0;
    public Bitmap a1;
    public int b1;
    public final boolean c1;
    public k69 s0;
    public final ArrayList t0;
    public final ArrayList u0;
    public final ArrayList v0;
    public final ArrayList w0;
    public final Context x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public x59(Context context) {
        boolean z = false;
        ContextThemeWrapper contextThemeWrapperA = r69.a(context, false);
        int iG = r69.g(contextThemeWrapperA, avc.mediaRouteTheme);
        super(contextThemeWrapperA, iG == 0 ? r69.e(contextThemeWrapperA) : iG);
        this.Z = d69.c;
        this.t0 = new ArrayList();
        this.u0 = new ArrayList();
        this.v0 = new ArrayList();
        this.w0 = new ArrayList();
        this.B0 = new ey(8, this);
        Context context2 = getContext();
        this.x0 = context2;
        this.X = l69.d(context2);
        if (l69.d != null) {
            l69.c().getClass();
            z = true;
        }
        this.c1 = z;
        this.Y = new t49(this, 4);
        l69.b();
        this.s0 = l69.c().e();
        this.U0 = new r59(this);
        h();
    }

    public final void f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            k69 k69Var = (k69) list.get(size);
            if (k69Var.d() || !k69Var.g || !k69Var.h(this.Z) || this.s0 == k69Var) {
                list.remove(size);
            }
        }
    }

    public final void g() {
        MediaDescriptionCompat mediaDescriptionCompat = this.V0;
        Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.V0;
        Uri iconUri = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getIconUri() : null;
        q59 q59Var = this.W0;
        Bitmap bitmap = q59Var == null ? this.X0 : q59Var.a;
        Uri uri = q59Var == null ? this.Y0 : q59Var.b;
        if (bitmap != iconBitmap || (bitmap == null && !Objects.equals(uri, iconUri))) {
            q59 q59Var2 = this.W0;
            if (q59Var2 != null) {
                q59Var2.cancel(true);
            }
            q59 q59Var3 = new q59(this);
            this.W0 = q59Var3;
            q59Var3.execute(new Void[0]);
        }
    }

    public final void h() {
        MediaControllerCompat mediaControllerCompat = this.T0;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(this.U0);
            this.T0 = null;
        }
    }

    public final void i(d69 d69Var) {
        if (d69Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.Z.equals(d69Var)) {
            return;
        }
        this.Z = d69Var;
        if (this.z0) {
            l69 l69Var = this.X;
            t49 t49Var = this.Y;
            l69Var.f(t49Var);
            l69Var.a(d69Var, t49Var, 1);
            m();
        }
    }

    public final void j() {
        Context context = this.x0;
        getWindow().setLayout(!context.getResources().getBoolean(gvc.is_tablet) ? -1 : dvi.a(context), context.getResources().getBoolean(gvc.is_tablet) ? -2 : -1);
        this.X0 = null;
        this.Y0 = null;
        g();
        k();
        n();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x59.k():void");
    }

    public final void m() {
        ArrayList arrayList = this.t0;
        arrayList.clear();
        ArrayList arrayList2 = this.u0;
        arrayList2.clear();
        ArrayList arrayList3 = this.v0;
        arrayList3.clear();
        arrayList.addAll(Collections.unmodifiableList(this.s0.u));
        j69 j69Var = this.s0.a;
        j69Var.getClass();
        l69.b();
        for (k69 k69Var : Collections.unmodifiableList(j69Var.b)) {
            y6i y6iVarB = this.s0.b(k69Var);
            if (y6iVarB != null) {
                y59 y59Var = (y59) y6iVarB.b;
                if (y59Var != null && y59Var.d) {
                    arrayList2.add(k69Var);
                }
                if (y59Var != null && y59Var.e) {
                    arrayList3.add(k69Var);
                }
            }
        }
        f(arrayList2);
        f(arrayList3);
        s55 s55Var = s55.o;
        Collections.sort(arrayList, s55Var);
        Collections.sort(arrayList2, s55Var);
        Collections.sort(arrayList3, s55Var);
        this.D0.F();
    }

    public final void n() {
        if (this.z0) {
            if (SystemClock.uptimeMillis() - this.A0 < 300) {
                ey eyVar = this.B0;
                eyVar.removeMessages(1);
                eyVar.sendEmptyMessageAtTime(1, this.A0 + 300);
                return;
            }
            if ((this.G0 != null || this.I0) ? true : !this.y0) {
                this.J0 = true;
                return;
            }
            this.J0 = false;
            if (!this.s0.g() || this.s0.d()) {
                dismiss();
            }
            this.A0 = SystemClock.uptimeMillis();
            this.D0.E();
        }
    }

    public final void o() {
        if (this.J0) {
            n();
        }
        if (this.K0) {
            k();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.z0 = true;
        this.X.a(this.Z, this.Y, 1);
        m();
        boolean z = l69.c;
        h();
    }

    @Override // defpackage.jo, defpackage.pl3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(h1d.mr_cast_dialog);
        int i = r69.a;
        View decorView = getWindow().getDecorView();
        Context context = this.x0;
        decorView.setBackgroundColor(s34.a(context, r69.h(context) ? nvc.mr_dynamic_dialog_background_light : nvc.mr_dynamic_dialog_background_dark));
        ImageButton imageButton = (ImageButton) findViewById(pxc.mr_cast_close_button);
        this.L0 = imageButton;
        imageButton.setColorFilter(-1);
        int i2 = 0;
        this.L0.setOnClickListener(new p59(this, i2));
        Button button = (Button) findViewById(pxc.mr_cast_stop_button);
        this.M0 = button;
        button.setTextColor(-1);
        this.M0.setOnClickListener(new p59(this, 1));
        this.D0 = new v59(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(pxc.mr_cast_list);
        this.C0 = recyclerView;
        recyclerView.setAdapter(this.D0);
        this.C0.setLayoutManager(new LinearLayoutManager());
        this.E0 = new w59(this, i2);
        this.F0 = new HashMap();
        this.H0 = new HashMap();
        this.N0 = (ImageView) findViewById(pxc.mr_cast_meta_background);
        this.O0 = findViewById(pxc.mr_cast_meta_black_scrim);
        this.P0 = (ImageView) findViewById(pxc.mr_cast_meta_art);
        TextView textView = (TextView) findViewById(pxc.mr_cast_meta_title);
        this.Q0 = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(pxc.mr_cast_meta_subtitle);
        this.R0 = textView2;
        textView2.setTextColor(-1);
        this.S0 = context.getResources().getString(j4d.mr_cast_dialog_title_view_placeholder);
        this.y0 = true;
        j();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.z0 = false;
        this.X.f(this.Y);
        this.B0.removeCallbacksAndMessages(null);
        h();
    }
}

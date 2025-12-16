package ru.ok.messages.photoeditor;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import defpackage.bvb;
import defpackage.bwd;
import defpackage.bwf;
import defpackage.cvb;
import defpackage.d6;
import defpackage.efi;
import defpackage.fa9;
import defpackage.g6;
import defpackage.god;
import defpackage.hf0;
import defpackage.i6;
import defpackage.ivd;
import defpackage.k95;
import defpackage.l5c;
import defpackage.l95;
import defpackage.lod;
import defpackage.m0g;
import defpackage.mvd;
import defpackage.n1d;
import defpackage.n95;
import defpackage.q0d;
import defpackage.q1g;
import defpackage.qm3;
import defpackage.qu1;
import defpackage.r1g;
import defpackage.r95;
import defpackage.rw4;
import defpackage.ss4;
import defpackage.sxg;
import defpackage.t1b;
import defpackage.tfi;
import defpackage.uaj;
import defpackage.vq3;
import defpackage.vw4;
import defpackage.xa6;
import defpackage.yub;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.apache.http.HttpStatus;
import ru.ok.messages.views.dialogs.ConfirmationDialog;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.tamtam.photoeditor.view.EditorSurfaceViewContainer;

/* loaded from: classes2.dex */
public class ActPhotoEditor extends d6 implements vq3 {
    public static final /* synthetic */ int W0 = 0;
    public yub S0;
    public fa9 T0;
    public boolean U0;
    public final bwf V0 = new bwf(new i6(1, this));

    @Override // defpackage.d6
    public final String G() {
        return "EDIT_IMAGE";
    }

    public final void O() {
        if (!this.S0.b.h) {
            setResult(0);
            finish();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("photo_editor:cancel_dialog", true);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("ru.ok.tamtam.extra.CONTENT_RES_ID", mvd.p1);
        bundle2.putInt("ru.ok.tamtam.extra.POSITIVE_TEXT_RES_ID", mvd.o1);
        bundle2.putInt("ru.ok.tamtam.extra.NEGATIVE_TEXT_RES_ID", mvd.p);
        bundle2.putBundle("oneme:share:data", bundle);
        ConfirmationDialog confirmationDialog = new ConfirmationDialog();
        confirmationDialog.n0(bundle2);
        confirmationDialog.x0(z(), "ru.ok.messages.views.dialogs.ConfirmationDialog");
    }

    public final void P(ss4 ss4Var) {
        int iHeight;
        l95 l95VarA = this.S0.b.a();
        if (l95VarA.a.isEmpty()) {
            l95VarA = null;
        }
        boolean z = l95VarA != null && l95VarA.d;
        yub yubVar = this.S0;
        boolean z2 = this.U0 && !z;
        r95 r95Var = yubVar.b.a;
        Rect bounds = r95Var.getBounds();
        int iWidth = 2000;
        if (bounds.width() > bounds.height()) {
            iHeight = (int) ((bounds.height() / bounds.width()) * 2000);
        } else {
            iWidth = (int) ((bounds.width() / bounds.height()) * 2000);
            iHeight = 2000;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iWidth, iHeight, Bitmap.Config.ARGB_8888);
        Rect resultBounds = r95Var.getResultBounds();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        for (k95 k95Var : r95Var.getLayers()) {
            if (k95Var instanceof hf0) {
                if (z2) {
                    Drawable drawable = ((hf0) k95Var).a;
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawable.draw(canvas);
                }
                canvas.scale(iWidth / resultBounds.width(), iHeight / resultBounds.height());
                canvas.translate(-resultBounds.left, -resultBounds.top);
            } else {
                k95Var.draw(canvas);
            }
        }
        if (z) {
            l5c l5cVar = ((t1b) ((qm3) this.J0.b)).j().b;
            l5cVar.getClass();
            bitmapCreateBitmap = tfi.l((int) l5cVar.m(PmsKey.f100minstickersize, 432), (int) l5cVar.m(PmsKey.f88maxstickersize, 512), bitmapCreateBitmap);
        }
        Intent intent = new Intent();
        File fileP = ((t1b) ((qm3) this.J0.b)).f().p(UUID.randomUUID().toString() + ".png");
        try {
            tfi.m(fileP.getPath(), bitmapCreateBitmap, 100, Bitmap.CompressFormat.PNG);
            intent.putExtra("photo_editor:result_uri", Uri.fromFile(fileP));
            intent.putExtra("photo_editor:editor_state", l95VarA);
            intent.putExtra("photo_editor:delayed_attrs", ss4Var);
            setResult(-1, intent);
            finish();
        } catch (Exception unused) {
            efi.r(this, getString(mvd.D), 0);
            setResult(0);
            finish();
        }
    }

    @Override // defpackage.d6, defpackage.i7g
    public final q1g f() {
        if (this.T0 == null) {
            this.T0 = fa9.e0;
        }
        return this.T0;
    }

    @Override // defpackage.d6, defpackage.nl3, android.app.Activity
    public final void onBackPressed() {
        if (this.S0.b.h) {
            O();
        } else {
            super.onBackPressed();
        }
    }

    @Override // defpackage.d6, androidx.fragment.app.b, defpackage.nl3, android.app.Activity
    public final void onCreate(Bundle bundle) throws Exception {
        super.onCreate(bundle);
        K(this.T0.L);
        setContentView(n1d.act_photo_editor);
        this.U0 = getIntent().getBooleanExtra("photo_editor:is_drawing", false);
        q1g q1gVarC = ((r1g) ((t1b) ((qm3) this.J0.b)).getAccessor().c(647)).c();
        r95 editorSurfaceView = ((EditorSurfaceViewContainer) findViewById(q0d.act_photo_editor__editor)).getEditorSurfaceView();
        if (!this.U0) {
            editorSurfaceView.setBackgroundColor(this.T0.m);
        } else if (q1gVarC.c) {
            editorSurfaceView.setBackgroundColor(q1gVarC.m);
        } else {
            editorSurfaceView.setBackgroundColor(-1);
        }
        cvb cvbVar = new cvb(findViewById(q0d.act_photo_editor__root), ((t1b) ((qm3) this.J0.b)).j().c);
        Uri uri = (Uri) getIntent().getParcelableExtra("photo_editor:background_uri");
        uaj uajVar = uri != null ? new uaj(uri) : new uaj(5);
        int i = q1gVarC.c ? ivd.q : ivd.r;
        Resources resources = getResources();
        ThreadLocal threadLocal = lod.a;
        Drawable drawableA = god.a(resources, i, null);
        if (drawableA == null) {
            throw new IllegalStateException("backgroundDrawable cannot be null");
        }
        uaj uajVar2 = new uaj(drawableA);
        Resources resources2 = getResources();
        m0g m0gVar = (m0g) ((t1b) ((qm3) this.J0.b)).getAccessor().c(HttpStatus.SC_FORBIDDEN);
        xa6 xa6Var = new xa6();
        xa6Var.a = resources2;
        xa6Var.b = m0gVar;
        xa6Var.c = uajVar;
        xa6Var.d = uajVar2;
        l95 l95Var = getIntent().hasExtra("photo_editor:editor_state") ? (l95) getIntent().getParcelableExtra("photo_editor:editor_state") : null;
        boolean booleanExtra = getIntent().getBooleanExtra("photo_editor:start_from_draw_sticker", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("photo_editor:draw_sticker_enabled", false);
        n95 n95Var = new n95(editorSurfaceView);
        bwf bwfVar = this.V0;
        this.S0 = new yub(cvbVar, n95Var, this, xa6Var, l95Var, booleanExtra2, booleanExtra, ((Boolean) bwfVar.getValue()).booleanValue());
        int i2 = cvb.w0[6];
        sxg sxgVar = cvbVar.c;
        cvbVar.c(sxgVar.g.getInt("app.editor.color", i2));
        cvbVar.b.getContext();
        rw4.a();
        int i3 = sxgVar.g.getInt("app.editor.width", vw4.b((int) 8.0f));
        if (i3 > 0) {
            float f = i3;
            cvbVar.s0.setBrushWidth(f);
            Iterator it = cvbVar.a.iterator();
            while (it.hasNext()) {
                ((yub) it.next()).b.g = f;
            }
            sxgVar.g((int) f, "app.editor.width");
        }
        int i4 = 1;
        if (bundle != null) {
            yub yubVar = this.S0;
            yubVar.getClass();
            if (bundle.containsKey("ru.ok.tamtam.extra.EDITOR_STATE")) {
                yubVar.d.a(yubVar.b, (l95) bundle.getParcelable("ru.ok.tamtam.extra.EDITOR_STATE"), true);
            }
            if (bundle.containsKey("ru.ok.tamtam.extra.EDITOR_VIEW_STATE")) {
                bvb bvbVar = (bvb) bundle.getParcelable("ru.ok.tamtam.extra.EDITOR_VIEW_STATE");
                yubVar.e = bvbVar;
                yubVar.a.a(bvbVar);
            }
        }
        if (((Boolean) bwfVar.getValue()).booleanValue()) {
            return;
        }
        ScheduledSendPickerDialogFragment.C0("ru.ok.messages.photoeditor.ActPhotoEditor", z(), this, new g6(i4, this));
    }

    @Override // defpackage.d6, defpackage.ln, androidx.fragment.app.b, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        bwd.b((qu1) this.S0.d.o);
    }

    @Override // defpackage.d6, defpackage.nl3, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        yub yubVar = this.S0;
        bundle.putParcelable("ru.ok.tamtam.extra.EDITOR_STATE", yubVar.b.a());
        bundle.putParcelable("ru.ok.tamtam.extra.EDITOR_VIEW_STATE", yubVar.e);
    }

    @Override // defpackage.vq3
    public final void q(Bundle bundle) {
        if (bundle != null && bundle.getBoolean("photo_editor:cancel_dialog")) {
            setResult(0);
            finish();
            return;
        }
        yub yubVar = this.S0;
        n95 n95Var = yubVar.b;
        r95 r95Var = n95Var.a;
        List<k95> layers = r95Var.getLayers();
        for (int size = layers.size() - 1; size >= 0; size--) {
            k95 k95Var = layers.get(size);
            if (!(k95Var instanceof hf0)) {
                r95Var.a.remove(k95Var);
                r95Var.invalidate();
            }
        }
        n95Var.b();
        bvb bvbVar = yubVar.e;
        bvbVar.getClass();
        bvb bvbVar2 = new bvb(false, false, false, bvbVar.d, bvbVar.o, true, bvbVar.Y);
        yubVar.e = bvbVar2;
        yubVar.a.a(bvbVar2);
    }
}

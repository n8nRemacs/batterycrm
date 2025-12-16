package ru.ok.messages.media.crop;

import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import defpackage.d6;
import defpackage.da4;
import defpackage.efi;
import defpackage.fp0;
import defpackage.mvd;
import defpackage.n1d;
import defpackage.q0d;
import defpackage.q1g;
import defpackage.qm3;
import defpackage.rl6;
import defpackage.rr6;
import defpackage.s6b;
import defpackage.t1b;
import defpackage.u8j;
import defpackage.uga;
import defpackage.wqi;
import one.me.image.crop.view.ImageCropView;
import ru.ok.messages.views.fragments.base.FrgBase;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public class FrgTamCropImage extends FrgBase {
    public ImageCropView u1;
    public ImageButton v1;
    public ImageButton w1;
    public ImageButton x1;
    public ImageButton y1;
    public TextView z1;

    @Override // androidx.fragment.app.a
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(n1d.frg_tam_crop_image, viewGroup, false);
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void b0(Bundle bundle) {
        super.b0(bundle);
        bundle.putParcelable("ru.ok.tamtam.extra.CROP_STATE", this.u1.getCropState());
    }

    @Override // androidx.fragment.app.a
    public final void e0(View view, Bundle bundle) {
        ImageCropView imageCropView = (ImageCropView) view.findViewById(q0d.frg_tam_crop_image__iv_crop);
        this.u1 = imageCropView;
        int i = 1;
        imageCropView.setFreestyleCropMode(1);
        int i2 = 0;
        this.u1.setRotateEnabled(false);
        this.u1.setMaxScaleMultiplier(4.0f);
        ImageCropView imageCropView2 = this.u1;
        ((t1b) ((qm3) this.l1.b)).j().b.getClass();
        imageCropView2.setMinImageSize((int) r3.m(PmsKey.f97minimagesidesize, 64));
        this.v1 = (ImageButton) view.findViewById(q0d.frg_tam_crop_image__rotate);
        this.w1 = (ImageButton) view.findViewById(q0d.frg_tam_crop_image__flip);
        this.z1 = (TextView) view.findViewById(q0d.frg_tam_crop_image__btn_clear);
        this.x1 = (ImageButton) view.findViewById(q0d.frg_tam_crop_image__btn_done);
        this.y1 = (ImageButton) view.findViewById(q0d.frg_tam_crop_image__btn_close);
        Uri uri = (Uri) this.X.getParcelable("ru.ok.tamtam.extra.SOURCE_URI");
        Uri uri2 = (Uri) this.X.getParcelable("ru.ok.tamtam.extra.RESULT_URI");
        wqi.c("ru.ok.messages.media.crop.FrgTamCropImage", "onViewCreated:\nsourceUri: %s\nresultUri: %s", uri.toString(), uri2.toString());
        da4 da4Var = bundle != null ? (da4) bundle.getParcelable("ru.ok.tamtam.extra.CROP_STATE") : this.X.containsKey("ru.ok.tamtam.extra.CROP_STATE") ? (da4) this.X.getParcelable("ru.ok.tamtam.extra.CROP_STATE") : null;
        try {
            rr6 rr6Var = this.u1.a;
            int maxBitmapSize = rr6Var.getMaxBitmapSize();
            new fp0(rr6Var.getContext(), uri, uri2, maxBitmapSize, maxBitmapSize, new s6b(rr6Var)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            rr6Var.G0 = da4Var;
        } catch (Exception e) {
            wqi.e("ru.ok.messages.media.crop.FrgTamCropImage", "fail to setImageUri", e);
            d6 d6VarU0 = u0();
            if (d6VarU0 != null) {
                d6VarU0.setResult(0);
                efi.r(d6VarU0, d6VarU0.getString(mvd.D), 0);
                s0();
            }
        }
        u8j.a(this.v1, new rl6(this, i2));
        u8j.a(this.w1, new rl6(this, i));
        u8j.a(this.z1, new rl6(this, 2));
        u8j.a(this.y1, new rl6(this, 3));
        u8j.a(this.x1, new rl6(this, 4));
        this.v1.setBackground(this.n1.a());
        this.w1.setBackground(this.n1.a());
        this.z1.setBackground(uga.c(0, this.n1.i));
        this.x1.setBackground(this.n1.a());
        this.y1.setBackground(this.n1.a());
        this.v1.setColorFilter(this.n1.w);
        this.w1.setColorFilter(this.n1.w);
        this.x1.setColorFilter(this.n1.k);
        this.y1.setColorFilter(this.n1.w);
        TextView textView = this.z1;
        q1g q1gVar = this.n1;
        textView.setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{q1gVar.M, q1gVar.w}));
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final String t0() {
        return "CROP_IMAGE";
    }
}

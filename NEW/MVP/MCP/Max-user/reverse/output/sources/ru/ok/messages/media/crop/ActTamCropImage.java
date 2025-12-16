package ru.ok.messages.media.crop;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import defpackage.cn8;
import defpackage.d6;
import defpackage.da4;
import defpackage.fa9;
import defpackage.hfh;
import defpackage.n1d;
import defpackage.q0d;
import defpackage.q1g;
import defpackage.teh;
import defpackage.uy0;
import defpackage.veh;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class ActTamCropImage extends d6 {
    public static final /* synthetic */ int T0 = 0;
    public fa9 S0;

    @Override // defpackage.d6
    public final String G() {
        return null;
    }

    @Override // defpackage.d6, defpackage.i7g
    public final q1g f() {
        if (this.S0 == null) {
            this.S0 = fa9.e0;
        }
        return this.S0;
    }

    @Override // defpackage.d6, androidx.fragment.app.b, defpackage.nl3, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(n1d.act_tam_crop_image);
        K(this.S0.L);
        findViewById(q0d.act_tam_crop_image__root).setBackgroundColor(f().m);
        View viewFindViewById = findViewById(q0d.act_tam_crop_image__root);
        uy0 uy0Var = new uy0(10);
        WeakHashMap weakHashMap = hfh.a;
        veh.u(viewFindViewById, uy0Var);
        teh.c(viewFindViewById);
        if (bundle == null) {
            Uri uri = (Uri) getIntent().getParcelableExtra("ru.ok.tamtam.extra.SOURCE_URI");
            Uri uri2 = (Uri) getIntent().getParcelableExtra("ru.ok.tamtam.extra.RESULT_URI");
            da4 da4Var = (da4) getIntent().getParcelableExtra("ru.ok.tamtam.extra.CROP_STATE");
            boolean booleanExtra = getIntent().getBooleanExtra("ru.ok.tamtam.extra.SAVE_AS_PNG", false);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("ru.ok.tamtam.extra.SOURCE_URI", uri);
            bundle2.putParcelable("ru.ok.tamtam.extra.RESULT_URI", uri2);
            bundle2.putParcelable("ru.ok.tamtam.extra.CROP_STATE", da4Var);
            bundle2.putBoolean("ru.ok.tamtam.extra.SAVE_AS_PNG", booleanExtra);
            FrgTamCropImage frgTamCropImage = new FrgTamCropImage();
            frgTamCropImage.n0(bundle2);
            cn8.a(z(), q0d.act_tam_crop_image__container, frgTamCropImage, "ru.ok.messages.media.crop.FrgTamCropImage");
        }
    }
}

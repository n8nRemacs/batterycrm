package ru.mts.biometry.sdk.feature.selfie.ui.uploadselfie;

import B91.C13112e;
import Ba1.i;
import Ba1.k;
import C91.a;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.view.C22984Q;
import androidx.view.N0;
import com.avito.android.R;
import g2.c;
import g2.d;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import ru.mts.biometry.sdk.base.b;
import ru.mts.biometry.sdk.view.SdkBioSelfieFrame;
import ru.mts.biometry.sdk.view.SdkBioToolbar;
import sG0.ViewOnClickListenerC48048b;
import va1.C49291a;
import va1.e;
import va1.f;
import va1.m;

/* loaded from: classes9.dex */
public final class g extends b {

    /* renamed from: h0, reason: collision with root package name */
    public final k f436529h0;

    /* renamed from: j0, reason: collision with root package name */
    public static final /* synthetic */ n[] f436528j0 = {m0.f406844a.i(new h0(g.class, "viewModel", "getViewModel()Lru/mts/biometry/sdk/feature/selfie/ui/uploadselfie/SelfieUploadViewModel;", 0))};

    /* renamed from: i0, reason: collision with root package name */
    public static final C49291a f436527i0 = new C49291a();

    public g() {
        super(0);
        this.f436529h0 = new k(m.class, new f(this));
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final c b5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.sdk_bio_fragment_selfie_upload, (ViewGroup) null, false);
        int i12 = R.id.progressBar;
        ProgressBar progressBar = (ProgressBar) d.a(viewInflate, R.id.progressBar);
        if (progressBar != null) {
            i12 = R.id.selfie;
            AppCompatImageView appCompatImageView = (AppCompatImageView) d.a(viewInflate, R.id.selfie);
            if (appCompatImageView != null) {
                i12 = R.id.selfieFrame;
                SdkBioSelfieFrame sdkBioSelfieFrame = (SdkBioSelfieFrame) d.a(viewInflate, R.id.selfieFrame);
                if (sdkBioSelfieFrame != null) {
                    i12 = R.id.statusbar;
                    if (d.a(viewInflate, R.id.statusbar) != null) {
                        i12 = R.id.successIcon;
                        ImageView imageView = (ImageView) d.a(viewInflate, R.id.successIcon);
                        if (imageView != null) {
                            i12 = R.id.toolbar;
                            SdkBioToolbar sdkBioToolbar = (SdkBioToolbar) d.a(viewInflate, R.id.toolbar);
                            if (sdkBioToolbar != null) {
                                return new C13112e((ConstraintLayout) viewInflate, progressBar, appCompatImageView, sdkBioSelfieFrame, imageView, sdkBioToolbar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final void c5(int i12, int i13) {
        SdkBioToolbar sdkBioToolbar;
        C13112e c13112e = (C13112e) this.f436376g0;
        if (c13112e == null || (sdkBioToolbar = c13112e.f1109f) == null) {
            return;
        }
        H91.g.a(i12, 0, 13, sdkBioToolbar);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        n nVar = f436528j0[0];
        m mVar = (m) this.f436529h0.a(this);
        Bitmap bitmap = a.f2015b;
        if (bitmap == null) {
            return;
        }
        Context contextRequireContext = requireContext();
        mVar.f440864J.f17823e = true;
        mVar.f440867M.setValue(va1.g.f440852a);
        mVar.f440866L = C43259k.d(N0.a(mVar), C43262l0.f411947c, null, new va1.k(bitmap, contextRequireContext, mVar, null), 2);
    }

    @Override // ru.mts.biometry.sdk.base.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new e(this, null), 3);
        C13112e c13112e = (C13112e) this.f436376g0;
        if (c13112e != null) {
            AppCompatImageView appCompatImageView = c13112e.f1106c;
            Bitmap bitmap = a.f2015b;
            appCompatImageView.setImageBitmap(bitmap != null ? i.a(bitmap) : null);
        }
        C13112e c13112e2 = (C13112e) this.f436376g0;
        SdkBioSelfieFrame sdkBioSelfieFrame = c13112e2 != null ? c13112e2.f1107d : null;
        if (sdkBioSelfieFrame != null) {
            sdkBioSelfieFrame.setActive(true);
        }
        C13112e c13112e3 = (C13112e) this.f436376g0;
        if (c13112e3 != null) {
            String string = getString(R.string.sdk_bio_selfie_toolbar_text);
            SdkBioToolbar sdkBioToolbar = c13112e3.f1109f;
            sdkBioToolbar.setText(string);
            sdkBioToolbar.setOnHintListener(new ViewOnClickListenerC48048b(this, 2));
        }
        H91.e.a(this, false);
    }
}

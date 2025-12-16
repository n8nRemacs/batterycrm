package ru.mts.biometry.sdk.feature.registration.ui.gallery;

import B91.L;
import Ba1.k;
import W91.h;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.m;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.a;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.C22984Q;
import androidx.view.N0;
import com.avito.android.R;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import g2.c;
import java.io.IOException;
import java.io.InputStream;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import pa1.C47042a;
import pa1.C47044c;
import pa1.d;
import pa1.f;
import pa1.l;
import ru.mts.biometry.sdk.base.b;
import z91.e;
import z91.s;

@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lru/mts/biometry/sdk/feature/registration/ui/gallery/g;", "Lru/mts/biometry/sdk/base/b;", "LB91/L;", "<init>", "()V", "ru/mts/biometry/sdk/feature/registration/ui/gallery/a", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class g extends b<L> {

    /* renamed from: h0, reason: collision with root package name */
    public final k f436515h0;

    /* renamed from: i0, reason: collision with root package name */
    public h f436516i0;

    /* renamed from: j0, reason: collision with root package name */
    public final InterfaceC42726C f436517j0;

    /* renamed from: k0, reason: collision with root package name */
    public Snackbar f436518k0;

    /* renamed from: l0, reason: collision with root package name */
    public final InterfaceC42726C f436519l0;

    /* renamed from: n0, reason: collision with root package name */
    public static final /* synthetic */ n[] f436514n0 = {m0.f406844a.i(new h0(g.class, "viewModel", "getViewModel()Lru/mts/biometry/sdk/feature/registration/ui/gallery/RegistrationGalleryViewModel;", 0))};

    /* renamed from: m0, reason: collision with root package name */
    public static final C47042a f436513m0 = new C47042a();

    public g() {
        super((Object) null);
        this.f436515h0 = new k(l.class, new pa1.g(this));
        this.f436517j0 = C42727D.c(new d(this));
        this.f436519l0 = C42727D.c(new C47044c(this));
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final c b5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.sdk_bio_fragment_registration_gallery, viewGroup, false);
        int i12 = R.id.passportPreview;
        ImageView imageView = (ImageView) g2.d.a(viewInflate, R.id.passportPreview);
        if (imageView != null) {
            i12 = R.id.subtitle;
            if (((TextView) g2.d.a(viewInflate, R.id.subtitle)) != null) {
                i12 = R.id.title;
                if (((TextView) g2.d.a(viewInflate, R.id.title)) != null) {
                    i12 = R.id.toolbar;
                    Toolbar toolbar = (Toolbar) g2.d.a(viewInflate, R.id.toolbar);
                    if (toolbar != null) {
                        return new L((ConstraintLayout) viewInflate, imageView, toolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final void c5(int i12, int i13) {
        BaseTransientBottomBar.j jVar;
        Toolbar toolbar;
        L l12 = (L) this.f436376g0;
        if (l12 != null && (toolbar = l12.f1080c) != null) {
            H91.g.a(i12, 0, 13, toolbar);
        }
        Snackbar snackbar = this.f436518k0;
        if (snackbar == null || (jVar = snackbar.f357285i) == null) {
            return;
        }
        H91.g.a(0, i13, 7, jVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        requireContext();
        s sVar = e.f443908b;
        if (sVar == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        this.f436516i0 = sVar.b();
    }

    @Override // ru.mts.biometry.sdk.base.b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Snackbar snackbar = this.f436518k0;
        if (snackbar != null) {
            snackbar.b(3);
        }
        this.f436518k0 = null;
        super.onDestroyView();
    }

    @Override // ru.mts.biometry.sdk.base.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws IOException {
        Bitmap bitmapCreateBitmap;
        super.onViewCreated(view, bundle);
        L l12 = (L) this.f436376g0;
        if (l12 == null) {
            return;
        }
        Toolbar toolbar = l12.f1080c;
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        m mVar = activityC22955mRequireActivity instanceof m ? (m) activityC22955mRequireActivity : null;
        if (mVar != null) {
            mVar.setSupportActionBar(toolbar);
        }
        H91.e.a(this, false);
        L l13 = (L) this.f436376g0;
        if (l13 != null) {
            this.f436518k0 = Ca1.e.a(l13.f1078a, getString(R.string.sdk_bio_title_registration_saving), getString(R.string.sdk_bio_message_registration_saving));
        }
        int color = androidx.core.content.d.getColor(requireContext(), R.color.imageMask);
        ImageView imageView = l12.f1079b;
        imageView.setColorFilter(color);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new f(this, null), 3);
        ContentResolver contentResolver = requireActivity().getContentResolver();
        Uri uri = (Uri) this.f436517j0.getValue();
        if (Build.VERSION.SDK_INT >= 28) {
            bitmapCreateBitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(contentResolver, uri));
        } else {
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(contentResolver, uri);
            Matrix matrix = new Matrix();
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            int iE2 = 1;
            if (inputStreamOpenInputStream != null) {
                try {
                    iE2 = new a(inputStreamOpenInputStream).e(1, "Orientation");
                    G0 g02 = G0.f406611a;
                    kotlin.io.c.a(inputStreamOpenInputStream, null);
                } finally {
                }
            }
            int i12 = iE2 != 3 ? iE2 != 6 ? iE2 != 8 ? 0 : 270 : 90 : 180;
            if (i12 != 0) {
                matrix.preRotate(i12);
            }
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        }
        imageView.setImageBitmap(bitmapCreateBitmap);
        n nVar = f436514n0[0];
        l lVar = (l) this.f436515h0.a(this);
        C43259k.d(N0.a(lVar), null, null, new pa1.k(lVar, bitmapCreateBitmap, null), 3);
    }
}

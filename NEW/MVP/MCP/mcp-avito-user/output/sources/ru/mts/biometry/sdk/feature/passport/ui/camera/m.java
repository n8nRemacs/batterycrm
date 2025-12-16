package ru.mts.biometry.sdk.feature.passport.ui.camera;

import A91.r;
import B91.F;
import Ba1.k;
import Ca1.u;
import H91.g;
import L91.p;
import L91.z;
import aa1.C19854d;
import aa1.e;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.view.AbstractC22991Y;
import androidx.view.C22981N;
import androidx.view.result.h;
import com.avito.android.R;
import com.avito.android.str_seller_orders.orders_seller.a;
import da1.C39689a;
import da1.C39691c;
import da1.C39692d;
import da1.C39694f;
import da1.i;
import da1.l;
import g2.c;
import g2.d;
import i.b;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.reflect.n;
import ru.mts.biometry.sdk.base.b;
import ru.mts.biometry.sdk.view.SdkBioPassportFrameView;
import ru.mts.biometry.sdk.view.SdkBioToolbar;
import z91.s;

/* loaded from: classes9.dex */
public final class m extends b {

    /* renamed from: h0, reason: collision with root package name */
    public final k f436488h0;

    /* renamed from: i0, reason: collision with root package name */
    public String f436489i0;

    /* renamed from: j0, reason: collision with root package name */
    public final InterfaceC42726C f436490j0;

    /* renamed from: k0, reason: collision with root package name */
    public final InterfaceC42726C f436491k0;

    /* renamed from: l0, reason: collision with root package name */
    public final h f436492l0;

    /* renamed from: n0, reason: collision with root package name */
    public static final /* synthetic */ n[] f436487n0 = {m0.f406844a.i(new h0(m.class, "viewModel", "getViewModel()Lru/mts/biometry/sdk/feature/document/camera/ui/DocumentCameraViewModel;", 0))};

    /* renamed from: m0, reason: collision with root package name */
    public static final C39689a f436486m0 = new C39689a();

    public m() {
        super((Object) null);
        this.f436488h0 = new k(z.class, new l(this));
        this.f436490j0 = C42727D.c(new C39691c(this));
        this.f436491k0 = C42727D.c(new C39692d(this));
        this.f436492l0 = registerForActivityResult(new b.l(), new a(this, 7));
    }

    public static final void e5(m mVar, F f12) {
        SdkBioPassportFrameView sdkBioPassportFrameView = f12.f1030c;
        int i12 = SdkBioPassportFrameView.f436567e;
        sdkBioPassportFrameView.b("", "");
        sdkBioPassportFrameView.setState(u.f2276a);
        f12.f1030c.setActive(false);
        f12.f1031d.setVisibility(0);
        AppCompatImageView appCompatImageView = f12.f1029b;
        appCompatImageView.setVisibility(8);
        appCompatImageView.setImageBitmap(null);
        mVar.f5().f20965j = true;
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final c b5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.sdk_bio_fragment_passport_camera, viewGroup, false);
        int i12 = R.id.iv_preview;
        AppCompatImageView appCompatImageView = (AppCompatImageView) d.a(viewInflate, R.id.iv_preview);
        if (appCompatImageView != null) {
            i12 = R.id.photoFrame;
            SdkBioPassportFrameView sdkBioPassportFrameView = (SdkBioPassportFrameView) d.a(viewInflate, R.id.photoFrame);
            if (sdkBioPassportFrameView != null) {
                i12 = R.id.pvCameraPreview;
                PreviewView previewView = (PreviewView) d.a(viewInflate, R.id.pvCameraPreview);
                if (previewView != null) {
                    i12 = R.id.toolbar;
                    SdkBioToolbar sdkBioToolbar = (SdkBioToolbar) d.a(viewInflate, R.id.toolbar);
                    if (sdkBioToolbar != null) {
                        return new F((ConstraintLayout) viewInflate, appCompatImageView, sdkBioPassportFrameView, previewView, sdkBioToolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final void c5(int i12, int i13) {
        F f12 = (F) this.f436376g0;
        if (f12 != null) {
            g.a(i12, 0, 13, f12.f1032e);
        }
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final void d5(c cVar) {
        F f12 = (F) cVar;
        requireActivity().getWindow().setFlags(128, 128);
        f12.f1031d.setOnTouchListener(new p(5, this, f12));
        final int i12 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: da1.m

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ru.mts.biometry.sdk.feature.passport.ui.camera.m f393934c;

            {
                this.f393934c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.mts.biometry.sdk.feature.passport.ui.camera.m mVar = this.f393934c;
                switch (i12) {
                    case 0:
                        C39689a c39689a = ru.mts.biometry.sdk.feature.passport.ui.camera.m.f436486m0;
                        mVar.requireContext();
                        s sVar = z91.e.f443908b;
                        if (sVar == null) {
                            throw new IllegalArgumentException("DI delegate is null");
                        }
                        sVar.b().a();
                        return;
                    default:
                        C39689a c39689a2 = ru.mts.biometry.sdk.feature.passport.ui.camera.m.f436486m0;
                        A91.b.a(r.a(mVar.getResources().getStringArray(R.array.sdk_bio_passport_intro_list_full)), mVar.getResources().getString(R.string.sdk_bio_passport_recommendation_dialog_title)).show(mVar.getParentFragmentManager(), "BottomSheetContainer");
                        return;
                }
            }
        };
        SdkBioToolbar sdkBioToolbar = f12.f1032e;
        sdkBioToolbar.setOnBackListener(onClickListener);
        final int i13 = 1;
        sdkBioToolbar.setOnHintListener(new View.OnClickListener(this) { // from class: da1.m

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ru.mts.biometry.sdk.feature.passport.ui.camera.m f393934c;

            {
                this.f393934c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.mts.biometry.sdk.feature.passport.ui.camera.m mVar = this.f393934c;
                switch (i13) {
                    case 0:
                        C39689a c39689a = ru.mts.biometry.sdk.feature.passport.ui.camera.m.f436486m0;
                        mVar.requireContext();
                        s sVar = z91.e.f443908b;
                        if (sVar == null) {
                            throw new IllegalArgumentException("DI delegate is null");
                        }
                        sVar.b().a();
                        return;
                    default:
                        C39689a c39689a2 = ru.mts.biometry.sdk.feature.passport.ui.camera.m.f436486m0;
                        A91.b.a(r.a(mVar.getResources().getStringArray(R.array.sdk_bio_passport_intro_list_full)), mVar.getResources().getString(R.string.sdk_bio_passport_recommendation_dialog_title)).show(mVar.getParentFragmentManager(), "BottomSheetContainer");
                        return;
                }
            }
        });
        f12.f1030c.setFramePadding((int) getResources().getDimension(R.dimen.sdk_bio_passport_frame_padding));
    }

    public final aa1.n f5() {
        return (aa1.n) this.f436490j0.getValue();
    }

    public final e g5() {
        return (e) this.f436491k0.getValue();
    }

    @Override // ru.mts.biometry.sdk.base.b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        f5().f20965j = false;
        super.onDestroyView();
    }

    @Override // ru.mts.biometry.sdk.base.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC22991Y<Rect> frameRect;
        super.onViewCreated(view, bundle);
        H91.e.a(this, false);
        e eVarG5 = g5();
        eVarG5.f20928b.f1521i.observe(getViewLifecycleOwner(), new L91.e(new C19854d(eVarG5), 3));
        C22981N.a(getLifecycle()).e(new C39694f(this, null));
        C22981N.a(getLifecycle()).e(new da1.h(this, null));
        F f12 = (F) this.f436376g0;
        if (f12 == null || (frameRect = f12.f1030c.getFrameRect()) == null) {
            return;
        }
        frameRect.observe(getViewLifecycleOwner(), new L91.e(new i(this), 11));
    }
}

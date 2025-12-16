package ru.mts.biometry.sdk.feature.registration.ui.camera;

import A91.r;
import B91.K;
import Ba1.k;
import Ba1.o;
import H91.e;
import H91.g;
import L91.p;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.view.C22981N;
import com.avito.android.R;
import com.avito.android.str_seller_orders.orders_seller.a;
import g2.c;
import g2.d;
import i.b;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import oa1.C44723b;
import oa1.C44724c;
import oa1.C44726e;
import oa1.C44728g;
import oa1.C44736o;
import ru.mts.biometry.sdk.base.b;
import ru.mts.biometry.sdk.view.SdkBioButton;
import ru.mts.biometry.sdk.view.SdkBioPassportFrameView;
import ru.mts.biometry.sdk.view.SdkBioToolbar;
import z91.s;

@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/mts/biometry/sdk/feature/registration/ui/camera/h;", "Lru/mts/biometry/sdk/base/b;", "LB91/K;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class h extends b<K> {

    /* renamed from: m0, reason: collision with root package name */
    public static final /* synthetic */ n[] f436507m0 = {m0.f406844a.i(new h0(h.class, "viewModel", "getViewModel()Lru/mts/biometry/sdk/feature/registration/ui/camera/RegistrationCameraViewModel;", 0))};

    /* renamed from: h0, reason: collision with root package name */
    public W91.h f436508h0;

    /* renamed from: i0, reason: collision with root package name */
    public final k f436509i0;

    /* renamed from: j0, reason: collision with root package name */
    public final androidx.view.result.h f436510j0;

    /* renamed from: k0, reason: collision with root package name */
    public final InterfaceC42726C f436511k0;

    /* renamed from: l0, reason: collision with root package name */
    public final o f436512l0;

    public h() {
        super((Object) null);
        this.f436509i0 = new k(C44736o.class, new C44728g(this));
        this.f436510j0 = registerForActivityResult(new b.l(), new a(this, 9));
        this.f436511k0 = C42727D.c(new C44723b(this));
        this.f436512l0 = new o(1);
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final c b5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.sdk_bio_fragment_registration_camera, viewGroup, false);
        int i12 = R.id.btnTakePhoto;
        SdkBioButton sdkBioButton = (SdkBioButton) d.a(viewInflate, R.id.btnTakePhoto);
        if (sdkBioButton != null) {
            i12 = R.id.iv_preview;
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
                            return new K((ConstraintLayout) viewInflate, sdkBioButton, appCompatImageView, sdkBioPassportFrameView, previewView, sdkBioToolbar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final void c5(int i12, int i13) {
        K k12 = (K) this.f436376g0;
        if (k12 != null) {
            g.a(0, H91.c.a(12) + i13, 7, k12.f1073b);
            g.a(i12, 0, 13, k12.f1077f);
        }
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final void d5(c cVar) {
        K k12 = (K) cVar;
        requireActivity().getWindow().setFlags(128, 128);
        k12.f1076e.setOnTouchListener(new p(7, this, k12));
        e.a(this, false);
        final int i12 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: oa1.h

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ru.mts.biometry.sdk.feature.registration.ui.camera.h f419921c;

            {
                this.f419921c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.mts.biometry.sdk.feature.registration.ui.camera.h hVar = this.f419921c;
                switch (i12) {
                    case 0:
                        W91.h hVar2 = hVar.f436508h0;
                        if (hVar2 == null) {
                            hVar2 = null;
                        }
                        hVar2.a();
                        break;
                    case 1:
                        kotlin.reflect.n[] nVarArr = ru.mts.biometry.sdk.feature.registration.ui.camera.h.f436507m0;
                        A91.b.a(r.a(hVar.getResources().getStringArray(R.array.sdk_bio_registration_intro_list_full)), hVar.getResources().getString(R.string.sdk_bio_registration_recommendation_dialog_title)).show(hVar.getParentFragmentManager(), "BottomSheetContainer");
                        break;
                    default:
                        hVar.f436512l0.a();
                        break;
                }
            }
        };
        SdkBioToolbar sdkBioToolbar = k12.f1077f;
        sdkBioToolbar.setOnBackListener(onClickListener);
        final int i13 = 1;
        sdkBioToolbar.setOnHintListener(new View.OnClickListener(this) { // from class: oa1.h

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ru.mts.biometry.sdk.feature.registration.ui.camera.h f419921c;

            {
                this.f419921c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.mts.biometry.sdk.feature.registration.ui.camera.h hVar = this.f419921c;
                switch (i13) {
                    case 0:
                        W91.h hVar2 = hVar.f436508h0;
                        if (hVar2 == null) {
                            hVar2 = null;
                        }
                        hVar2.a();
                        break;
                    case 1:
                        kotlin.reflect.n[] nVarArr = ru.mts.biometry.sdk.feature.registration.ui.camera.h.f436507m0;
                        A91.b.a(r.a(hVar.getResources().getStringArray(R.array.sdk_bio_registration_intro_list_full)), hVar.getResources().getString(R.string.sdk_bio_registration_recommendation_dialog_title)).show(hVar.getParentFragmentManager(), "BottomSheetContainer");
                        break;
                    default:
                        hVar.f436512l0.a();
                        break;
                }
            }
        });
        final int i14 = 2;
        Ca1.d.a(new View.OnClickListener(this) { // from class: oa1.h

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ru.mts.biometry.sdk.feature.registration.ui.camera.h f419921c;

            {
                this.f419921c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.mts.biometry.sdk.feature.registration.ui.camera.h hVar = this.f419921c;
                switch (i14) {
                    case 0:
                        W91.h hVar2 = hVar.f436508h0;
                        if (hVar2 == null) {
                            hVar2 = null;
                        }
                        hVar2.a();
                        break;
                    case 1:
                        kotlin.reflect.n[] nVarArr = ru.mts.biometry.sdk.feature.registration.ui.camera.h.f436507m0;
                        A91.b.a(r.a(hVar.getResources().getStringArray(R.array.sdk_bio_registration_intro_list_full)), hVar.getResources().getString(R.string.sdk_bio_registration_recommendation_dialog_title)).show(hVar.getParentFragmentManager(), "BottomSheetContainer");
                        break;
                    default:
                        hVar.f436512l0.a();
                        break;
                }
            }
        }, k12.f1073b);
        this.f436512l0.f1521i.observe(getViewLifecycleOwner(), new L91.e(new C44724c(this), 15));
        C22981N.a(getLifecycle()).e(new C44726e(this, null));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        requireContext();
        s sVar = z91.e.f443908b;
        if (sVar == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        this.f436508h0 = sVar.b();
    }

    @Override // ru.mts.biometry.sdk.base.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f436510j0.b("android.permission.CAMERA");
    }
}

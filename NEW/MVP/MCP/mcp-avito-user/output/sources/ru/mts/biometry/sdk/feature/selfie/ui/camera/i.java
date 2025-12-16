package ru.mts.biometry.sdk.feature.selfie.ui.camera;

import A91.r;
import B91.C13108a;
import Ba1.o;
import L91.p;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.view.result.h;
import com.avito.android.R;
import com.avito.android.str_seller_orders.orders_seller.a;
import g2.c;
import g2.d;
import i.b;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N0;
import ru.mts.biometry.sdk.base.b;
import ru.mts.biometry.sdk.view.SdkBioSelfieFrame;
import ru.mts.biometry.sdk.view.SdkBioToolbar;
import ta1.e;
import ta1.f;
import ta1.g;
import z91.s;

@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/mts/biometry/sdk/feature/selfie/ui/camera/i;", "Lru/mts/biometry/sdk/base/b;", "LB91/a;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class i extends b<C13108a> {

    /* renamed from: h0, reason: collision with root package name */
    public final h f436521h0;

    /* renamed from: i0, reason: collision with root package name */
    public final o f436522i0;

    /* renamed from: j0, reason: collision with root package name */
    public final InterfaceC42726C f436523j0;

    /* renamed from: k0, reason: collision with root package name */
    public N0 f436524k0;

    public i() {
        super(0);
        this.f436521h0 = registerForActivityResult(new b.l(), new a(this, 14));
        this.f436522i0 = new o(0);
        this.f436523j0 = C42727D.c(new e(this));
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final c b5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.sdk_bio_fragment_selfie_camera, viewGroup, false);
        int i12 = R.id.anchor;
        if (d.a(viewInflate, R.id.anchor) != null) {
            i12 = R.id.pvCameraPreview;
            PreviewView previewView = (PreviewView) d.a(viewInflate, R.id.pvCameraPreview);
            if (previewView != null) {
                i12 = R.id.selfieFrame;
                SdkBioSelfieFrame sdkBioSelfieFrame = (SdkBioSelfieFrame) d.a(viewInflate, R.id.selfieFrame);
                if (sdkBioSelfieFrame != null) {
                    i12 = R.id.toolbar;
                    SdkBioToolbar sdkBioToolbar = (SdkBioToolbar) d.a(viewInflate, R.id.toolbar);
                    if (sdkBioToolbar != null) {
                        return new C13108a((ConstraintLayout) viewInflate, previewView, sdkBioSelfieFrame, sdkBioToolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final void d5(c cVar) {
        C13108a c13108a = (C13108a) cVar;
        requireActivity().getWindow().setFlags(128, 128);
        c13108a.f1088b.setOnTouchListener(new p(8, this, c13108a));
        String string = getString(R.string.sdk_bio_selfie_toolbar_text);
        SdkBioToolbar sdkBioToolbar = c13108a.f1090d;
        sdkBioToolbar.setText(string);
        final int i12 = 0;
        sdkBioToolbar.setOnBackListener(new View.OnClickListener(this) { // from class: ta1.j

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ru.mts.biometry.sdk.feature.selfie.ui.camera.i f439295c;

            {
                this.f439295c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.f439295c.requireContext();
                        s sVar = z91.e.f443908b;
                        if (sVar == null) {
                            throw new IllegalArgumentException("DI delegate is null");
                        }
                        sVar.b().a();
                        return;
                    default:
                        ru.mts.biometry.sdk.feature.selfie.ui.camera.i iVar = this.f439295c;
                        A91.b.a(r.a(iVar.getResources().getStringArray(R.array.sdk_bio_selfie_intro_list_full)), iVar.getResources().getString(R.string.sdk_bio_selfie_recommendation_dialog_title)).show(iVar.getParentFragmentManager(), "BottomSheetContainer");
                        return;
                }
            }
        });
        final int i13 = 1;
        sdkBioToolbar.setOnHintListener(new View.OnClickListener(this) { // from class: ta1.j

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ru.mts.biometry.sdk.feature.selfie.ui.camera.i f439295c;

            {
                this.f439295c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.f439295c.requireContext();
                        s sVar = z91.e.f443908b;
                        if (sVar == null) {
                            throw new IllegalArgumentException("DI delegate is null");
                        }
                        sVar.b().a();
                        return;
                    default:
                        ru.mts.biometry.sdk.feature.selfie.ui.camera.i iVar = this.f439295c;
                        A91.b.a(r.a(iVar.getResources().getStringArray(R.array.sdk_bio_selfie_intro_list_full)), iVar.getResources().getString(R.string.sdk_bio_selfie_recommendation_dialog_title)).show(iVar.getParentFragmentManager(), "BottomSheetContainer");
                        return;
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f436521h0.b("android.permission.CAMERA");
    }

    @Override // ru.mts.biometry.sdk.base.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        H91.e.a(this, false);
        C13108a c13108a = (C13108a) this.f436376g0;
        if (c13108a != null) {
            this.f436522i0.f1521i.observe(getViewLifecycleOwner(), new L91.e(new f(this), 17));
            c13108a.f1089c.getFramePathLive().observe(getViewLifecycleOwner(), new L91.e(new g(this), 18));
        }
    }
}

package ru.mts.biometry.sdk.feature.document.camera.ui;

import B91.z;
import Ba1.k;
import H91.e;
import H91.g;
import L91.c;
import L91.o;
import L91.p;
import L91.q;
import R91.j;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.view.AbstractC22991Y;
import androidx.view.C22981N;
import androidx.view.result.h;
import com.avito.android.R;
import i.b;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import ru.mts.biometry.sdk.base.b;
import ru.mts.biometry.sdk.view.SdkBioPassportFrameView;
import ru.mts.biometry.sdk.view.SdkBioToolbar;

@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/mts/biometry/sdk/feature/document/camera/ui/n;", "Lru/mts/biometry/sdk/base/b;", "LB91/z;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"SetTextI18n"})
/* loaded from: classes9.dex */
public final class n extends b<z> {

    /* renamed from: m0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n[] f436424m0 = {m0.f406844a.i(new h0(n.class, "viewModel", "getViewModel()Lru/mts/biometry/sdk/feature/document/camera/ui/DocumentCameraViewModel;", 0))};

    /* renamed from: h0, reason: collision with root package name */
    public final h f436425h0;

    /* renamed from: i0, reason: collision with root package name */
    public final k f436426i0;

    /* renamed from: j0, reason: collision with root package name */
    public final InterfaceC42726C f436427j0;

    /* renamed from: k0, reason: collision with root package name */
    public N0 f436428k0;

    /* renamed from: l0, reason: collision with root package name */
    public final InterfaceC42726C f436429l0;

    public n() {
        super((Object) null);
        this.f436425h0 = registerForActivityResult(new b.l(), new o(this, 0));
        this.f436426i0 = new k(L91.z.class, L91.n.f9838l);
        this.f436427j0 = C42727D.c(c.f9818l);
        this.f436429l0 = C42727D.c(new L91.b(this));
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final g2.c b5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return z.a(layoutInflater, viewGroup);
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final void c5(int i12, int i13) {
        z zVar = (z) this.f436376g0;
        if (zVar != null) {
            g.a(0, H91.c.a(12) + i13, 7, zVar.f1200c);
            g.a(i12, 0, 13, zVar.f1206i);
        }
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final void d5(g2.c cVar) {
        int i12;
        z zVar = (z) cVar;
        requireActivity().getWindow().setFlags(128, 128);
        zVar.f1204g.setOnTouchListener(new p(0, this, zVar));
        q qVar = new q(0);
        SdkBioToolbar sdkBioToolbar = zVar.f1206i;
        sdkBioToolbar.setOnBackListener(qVar);
        sdkBioToolbar.setOnHintListener(new A91.p(this, 4));
        f5();
        int iOrdinal = L91.z.ke().ordinal();
        SdkBioPassportFrameView sdkBioPassportFrameView = zVar.f1203f;
        if (iOrdinal == 0) {
            i12 = R.drawable.sdk_bio_horizontal_frame;
        } else {
            if (iOrdinal != 1) {
                return;
            }
            sdkBioPassportFrameView.setFramePadding((int) getResources().getDimension(R.dimen.sdk_bio_passport_frame_padding));
            i12 = R.drawable.sdk_bio_passport_frame;
        }
        sdkBioPassportFrameView.setDrawable(i12);
    }

    public final j e5() {
        return (j) this.f436429l0.getValue();
    }

    public final L91.z f5() {
        kotlin.reflect.n nVar = f436424m0[0];
        return (L91.z) this.f436426i0.a(this);
    }

    @Override // ru.mts.biometry.sdk.base.b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        e5().f14152k = false;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f436425h0.b("android.permission.CAMERA");
    }

    @Override // ru.mts.biometry.sdk.base.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC22991Y<Rect> frameRect;
        super.onViewCreated(view, bundle);
        e.a(this, false);
        C43259k.d(C22981N.a(getLifecycle()), null, null, new L91.g(this, null), 3);
        C43259k.d(C22981N.a(getLifecycle()), null, null, new L91.j(this, null), 3);
        z zVar = (z) this.f436376g0;
        if (zVar == null || (frameRect = zVar.f1203f.getFrameRect()) == null) {
            return;
        }
        frameRect.observe(getViewLifecycleOwner(), new L91.e(new L91.k(this), 1));
    }
}

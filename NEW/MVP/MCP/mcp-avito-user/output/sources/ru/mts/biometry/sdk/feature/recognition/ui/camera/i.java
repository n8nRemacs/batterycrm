package ru.mts.biometry.sdk.feature.recognition.ui.camera;

import Ba1.C13128f;
import Ba1.k;
import Ba1.o;
import Ba1.z;
import Ca1.d;
import Ca1.u;
import Ca1.v;
import H91.e;
import H91.g;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.view.C22981N;
import androidx.view.result.h;
import com.avito.android.R;
import com.avito.android.str_seller_orders.orders_seller.a;
import g2.c;
import ha1.C40903a;
import ha1.f;
import ha1.q;
import ha1.w;
import i.b;
import java.util.List;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import ru.mts.biometry.sdk.base.b;
import ru.mts.biometry.sdk.view.SdkBioPassportFrameView;
import ru.mts.biometry.sdk.view.SdkBioToolbar;

@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/mts/biometry/sdk/feature/recognition/ui/camera/i;", "Lru/mts/biometry/sdk/base/b;", "LB91/z;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public abstract class i extends b<B91.z> {

    /* renamed from: l0, reason: collision with root package name */
    public static final /* synthetic */ n[] f436493l0 = {m0.f406844a.i(new h0(i.class, "viewModel", "getViewModel()Lru/mts/biometry/sdk/feature/recognition/ui/camera/RecognitionCameraViewModel;", 0))};

    /* renamed from: h0, reason: collision with root package name */
    public final h f436494h0;

    /* renamed from: i0, reason: collision with root package name */
    public final InterfaceC42726C f436495i0;

    /* renamed from: j0, reason: collision with root package name */
    public C13128f f436496j0;

    /* renamed from: k0, reason: collision with root package name */
    public final k f436497k0;

    public i() {
        super(0);
        this.f436494h0 = registerForActivityResult(new b.l(), new a(this, 8));
        this.f436495i0 = C42727D.c(C40903a.f397226l);
        this.f436497k0 = new k(w.class, new ha1.h(this));
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final c b5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return B91.z.a(layoutInflater, null);
    }

    public abstract void c();

    @Override // ru.mts.biometry.sdk.base.b
    public final void c5(int i12, int i13) {
        SdkBioToolbar sdkBioToolbar;
        SwitchCompat switchCompat;
        B91.z zVar = (B91.z) this.f436376g0;
        if (zVar != null && (switchCompat = zVar.f1200c) != null) {
            g.a(0, H91.c.a(12) + i13, 7, switchCompat);
        }
        B91.z zVar2 = (B91.z) this.f436376g0;
        if (zVar2 == null || (sdkBioToolbar = zVar2.f1206i) == null) {
            return;
        }
        g.a(i12, 0, 13, sdkBioToolbar);
    }

    public void d() {
        C43259k.d(C22981N.a(getLifecycle()), null, null, new ha1.g(this, null), 3);
    }

    public final o e5() {
        return (o) this.f436495i0.getValue();
    }

    @Override // ru.mts.biometry.sdk.base.b
    /* renamed from: f5, reason: merged with bridge method [inline-methods] */
    public void d5(B91.z zVar) {
        SwitchCompat switchCompat = zVar.f1200c;
        g.c(switchCompat);
        requireActivity().getWindow().setFlags(128, 128);
        zVar.f1204g.setOnTouchListener(new L91.p(6, this, zVar));
        final int i12 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: ha1.i

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ru.mts.biometry.sdk.feature.recognition.ui.camera.i f397242c;

            {
                this.f397242c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String[] strArr;
                ru.mts.biometry.sdk.feature.recognition.ui.camera.i iVar = this.f397242c;
                switch (i12) {
                    case 0:
                        kotlin.reflect.n[] nVarArr = ru.mts.biometry.sdk.feature.recognition.ui.camera.i.f436493l0;
                        iVar.requireContext();
                        z91.s sVar = z91.e.f443908b;
                        if (sVar == null) {
                            throw new IllegalArgumentException("DI delegate is null");
                        }
                        sVar.b().a();
                        return;
                    case 1:
                        kotlin.reflect.n[] nVarArr2 = ru.mts.biometry.sdk.feature.recognition.ui.camera.i.f436493l0;
                        iVar.requireContext();
                        z91.e eVar = z91.e.f443907a;
                        E91.h hVar = C91.a.f2018e.f3817c;
                        List list = hVar != null ? hVar.f3859i : null;
                        if (list == null || (strArr = (String[]) list.toArray(new String[0])) == null) {
                            return;
                        }
                        z.a(iVar, strArr);
                        return;
                    default:
                        kotlin.reflect.n[] nVarArr3 = ru.mts.biometry.sdk.feature.recognition.ui.camera.i.f436493l0;
                        iVar.d();
                        return;
                }
            }
        };
        SdkBioToolbar sdkBioToolbar = zVar.f1206i;
        sdkBioToolbar.setOnBackListener(onClickListener);
        final int i13 = 1;
        sdkBioToolbar.setOnHintListener(new View.OnClickListener(this) { // from class: ha1.i

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ru.mts.biometry.sdk.feature.recognition.ui.camera.i f397242c;

            {
                this.f397242c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String[] strArr;
                ru.mts.biometry.sdk.feature.recognition.ui.camera.i iVar = this.f397242c;
                switch (i13) {
                    case 0:
                        kotlin.reflect.n[] nVarArr = ru.mts.biometry.sdk.feature.recognition.ui.camera.i.f436493l0;
                        iVar.requireContext();
                        z91.s sVar = z91.e.f443908b;
                        if (sVar == null) {
                            throw new IllegalArgumentException("DI delegate is null");
                        }
                        sVar.b().a();
                        return;
                    case 1:
                        kotlin.reflect.n[] nVarArr2 = ru.mts.biometry.sdk.feature.recognition.ui.camera.i.f436493l0;
                        iVar.requireContext();
                        z91.e eVar = z91.e.f443907a;
                        E91.h hVar = C91.a.f2018e.f3817c;
                        List list = hVar != null ? hVar.f3859i : null;
                        if (list == null || (strArr = (String[]) list.toArray(new String[0])) == null) {
                            return;
                        }
                        z.a(iVar, strArr);
                        return;
                    default:
                        kotlin.reflect.n[] nVarArr3 = ru.mts.biometry.sdk.feature.recognition.ui.camera.i.f436493l0;
                        iVar.d();
                        return;
                }
            }
        });
        final int i14 = 2;
        d.a(new View.OnClickListener(this) { // from class: ha1.i

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ru.mts.biometry.sdk.feature.recognition.ui.camera.i f397242c;

            {
                this.f397242c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String[] strArr;
                ru.mts.biometry.sdk.feature.recognition.ui.camera.i iVar = this.f397242c;
                switch (i14) {
                    case 0:
                        kotlin.reflect.n[] nVarArr = ru.mts.biometry.sdk.feature.recognition.ui.camera.i.f436493l0;
                        iVar.requireContext();
                        z91.s sVar = z91.e.f443908b;
                        if (sVar == null) {
                            throw new IllegalArgumentException("DI delegate is null");
                        }
                        sVar.b().a();
                        return;
                    case 1:
                        kotlin.reflect.n[] nVarArr2 = ru.mts.biometry.sdk.feature.recognition.ui.camera.i.f436493l0;
                        iVar.requireContext();
                        z91.e eVar = z91.e.f443907a;
                        E91.h hVar = C91.a.f2018e.f3817c;
                        List list = hVar != null ? hVar.f3859i : null;
                        if (list == null || (strArr = (String[]) list.toArray(new String[0])) == null) {
                            return;
                        }
                        z.a(iVar, strArr);
                        return;
                    default:
                        kotlin.reflect.n[] nVarArr3 = ru.mts.biometry.sdk.feature.recognition.ui.camera.i.f436493l0;
                        iVar.d();
                        return;
                }
            }
        }, switchCompat);
    }

    public void g5(Bitmap bitmap, String str) {
        B91.z zVar = (B91.z) this.f436376g0;
        if (zVar != null) {
            zVar.f1206i.f436591b.f1185b.setVisibility(4);
            zVar.f1204g.setVisibility(8);
            AppCompatImageView appCompatImageView = zVar.f1201d;
            appCompatImageView.setVisibility(0);
            appCompatImageView.setImageBitmap(bitmap);
            v vVar = v.f2277a;
            SdkBioPassportFrameView sdkBioPassportFrameView = zVar.f1203f;
            sdkBioPassportFrameView.setState(vVar);
            if (str == null) {
                str = getString(R.string.sdk_bio_passport_upload_progress_message);
            }
            sdkBioPassportFrameView.b(str, "");
        }
    }

    public void h5(q qVar) {
        B91.z zVar = (B91.z) this.f436376g0;
        if (zVar != null) {
            u uVar = u.f2276a;
            SdkBioPassportFrameView sdkBioPassportFrameView = zVar.f1203f;
            sdkBioPassportFrameView.setState(uVar);
            sdkBioPassportFrameView.setActive(false);
            zVar.f1204g.setVisibility(0);
            AppCompatImageView appCompatImageView = zVar.f1201d;
            appCompatImageView.setVisibility(8);
            zVar.f1206i.setText(qVar.f397254b);
            appCompatImageView.setImageBitmap(null);
        }
    }

    public final w i5() {
        n nVar = f436493l0[0];
        return (w) this.f436497k0.a(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f436494h0.b("android.permission.CAMERA");
    }

    @Override // ru.mts.biometry.sdk.base.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f436496j0 = new C13128f(requireContext());
        e.a(this, false);
        C43259k.d(C22981N.a(getLifecycle()), null, null, new f(this, null), 3);
    }
}

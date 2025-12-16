package ru.mts.biometry.sdk.feature.address.ui;

import Au.ViewOnClickListenerC13080b;
import B91.C13114g;
import B91.C13119l;
import H91.f;
import K91.A;
import K91.j;
import K91.l;
import K91.m;
import K91.n;
import K91.q;
import W91.h;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.H;
import androidx.fragment.app.k0;
import androidx.view.C22984Q;
import androidx.view.O0;
import com.avito.android.R;
import g2.c;
import g2.d;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import ru.mts.biometry.sdk.base.b;
import ru.mts.biometry.sdk.view.SdkBioButton;
import ru.mts.biometry.sdk.view.SdkBioEditText;
import ru.mts.biometry.sdk.view.SdkBioToolbar;
import z91.e;
import z91.s;

@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/mts/biometry/sdk/feature/address/ui/o;", "Lru/mts/biometry/sdk/base/b;", "LB91/l;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class o extends b<C13119l> {

    /* renamed from: h0, reason: collision with root package name */
    public h f436422h0;

    /* renamed from: i0, reason: collision with root package name */
    public final O0 f436423i0;

    public o() {
        super((Object) null);
        this.f436423i0 = k0.a(this, m0.f406844a.b(A.class), new n(this), new K91.o(this));
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final c b5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.sdk_bio_fragment_address_intro, viewGroup, false);
        int i12 = R.id.addressBlock;
        View viewA = d.a(viewInflate, R.id.addressBlock);
        if (viewA != null) {
            int i13 = R.id.addressTextEdit;
            SdkBioEditText sdkBioEditText = (SdkBioEditText) d.a(viewA, R.id.addressTextEdit);
            if (sdkBioEditText != null) {
                i13 = R.id.addressTitle;
                if (((TextView) d.a(viewA, R.id.addressTitle)) != null) {
                    C13114g c13114g = new C13114g((ConstraintLayout) viewA, sdkBioEditText);
                    i12 = R.id.addressHeadline;
                    TextView textView = (TextView) d.a(viewInflate, R.id.addressHeadline);
                    if (textView != null) {
                        i12 = R.id.btnNext;
                        SdkBioButton sdkBioButton = (SdkBioButton) d.a(viewInflate, R.id.btnNext);
                        if (sdkBioButton != null) {
                            i12 = R.id.toolbar;
                            SdkBioToolbar sdkBioToolbar = (SdkBioToolbar) d.a(viewInflate, R.id.toolbar);
                            if (sdkBioToolbar != null) {
                                return new C13119l((ConstraintLayout) viewInflate, c13114g, textView, sdkBioButton, sdkBioToolbar);
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i13)));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final void c5(int i12, int i13) {
        C13119l c13119l = (C13119l) this.f436376g0;
        if (c13119l != null) {
            H91.g.a(i12, 0, 13, c13119l.f1146e);
            H91.g.a(0, H91.c.a(12) + i13, 7, c13119l.f1145d);
        }
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final void d5(c cVar) {
        boolean z12;
        C13119l c13119l = (C13119l) cVar;
        final int i12 = 1;
        c13119l.f1146e.setOnCloseListener(new View.OnClickListener(this) { // from class: K91.p

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ru.mts.biometry.sdk.feature.address.ui.o f9324c;

            {
                this.f9324c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        H hE2 = this.f9324c.getParentFragmentManager().e();
                        hE2.n(R.id.sdk_root_container, new ru.mts.biometry.sdk.feature.address.ui.g(), null);
                        hE2.f46457p = true;
                        hE2.f();
                        break;
                    default:
                        W91.h hVar = this.f9324c.f436422h0;
                        if (hVar == null) {
                            hVar = null;
                        }
                        hVar.d(true);
                        break;
                }
            }
        });
        C22984Q.a(getViewLifecycleOwner()).e(new j(this, null));
        C22984Q.a(getViewLifecycleOwner()).e(new l(this, null));
        Object value = ((A) this.f436423i0.getValue()).f9300L.getValue();
        q qVar = value instanceof q ? (q) value : null;
        I91.d dVar = qVar != null ? qVar.f9325a : null;
        C13114g c13114g = c13119l.f1143b;
        SdkBioButton sdkBioButton = c13119l.f1145d;
        SdkBioEditText sdkBioEditText = c13114g.f1115b;
        if (dVar != null) {
            sdkBioEditText.setText(dVar.f8028a);
            z12 = true;
        } else {
            z12 = false;
        }
        sdkBioButton.setEnabled(z12);
        Ca1.d.a(new ViewOnClickListenerC13080b(7, c13119l, this), sdkBioEditText);
        final int i13 = 0;
        Ca1.d.a(new View.OnClickListener(this) { // from class: K91.p

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ru.mts.biometry.sdk.feature.address.ui.o f9324c;

            {
                this.f9324c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        H hE2 = this.f9324c.getParentFragmentManager().e();
                        hE2.n(R.id.sdk_root_container, new ru.mts.biometry.sdk.feature.address.ui.g(), null);
                        hE2.f46457p = true;
                        hE2.f();
                        break;
                    default:
                        W91.h hVar = this.f9324c.f436422h0;
                        if (hVar == null) {
                            hVar = null;
                        }
                        hVar.d(true);
                        break;
                }
            }
        }, sdkBioButton);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        requireContext();
        s sVar = e.f443908b;
        if (sVar == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        this.f436422h0 = sVar.b();
    }

    @Override // ru.mts.biometry.sdk.base.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C22960s.b(this, "request_address", new m(this));
    }

    @Override // ru.mts.biometry.sdk.base.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        H91.e.a(this, !f.b(this));
    }
}

package ru.mts.biometry.sdk.feature.document.chooseDocument.searchCountry;

import A91.p;
import Au.ViewOnClickListenerC13080b;
import B91.v;
import Ca1.d;
import H91.g;
import N91.c;
import N91.m;
import N91.n;
import N91.r;
import N91.s;
import N91.t;
import O91.o;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.fragment.app.k0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import androidx.view.O0;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import ru.mts.biometry.sdk.base.b;
import ru.mts.biometry.sdk.view.SdkBioButton;
import ru.mts.biometry.sdk.view.SdkBioToolbar;

@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/mts/biometry/sdk/feature/document/chooseDocument/searchCountry/u;", "Lru/mts/biometry/sdk/base/b;", "LB91/v;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class u extends b<v> {

    /* renamed from: h0, reason: collision with root package name */
    public final c f436434h0;

    /* renamed from: i0, reason: collision with root package name */
    public final O0 f436435i0;

    public u() {
        super(0);
        this.f436434h0 = new c(new m(this));
        this.f436435i0 = k0.a(this, m0.f406844a.b(o.class), new s(this), new t(this));
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final g2.c b5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return v.a(layoutInflater.inflate(R.layout.sdk_bio_fragment_country_search, (ViewGroup) null, false));
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final void c5(int i12, int i13) {
        SdkBioButton sdkBioButton;
        SdkBioToolbar sdkBioToolbar;
        v vVar = (v) this.f436376g0;
        if (vVar != null && (sdkBioToolbar = vVar.f1182e) != null) {
            g.a(i12, 0, 13, sdkBioToolbar);
        }
        v vVar2 = (v) this.f436376g0;
        if (vVar2 == null || (sdkBioButton = vVar2.f1181d) == null) {
            return;
        }
        g.a(0, i13, 7, sdkBioButton);
    }

    @Override // ru.mts.biometry.sdk.base.b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((o) this.f436435i0.getValue()).a("");
    }

    @Override // ru.mts.biometry.sdk.base.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final v vVarA = v.a(view);
        this.f436376g0 = vVarA;
        vVarA.f1178a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: N91.u
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                View decorView;
                Rect rect = new Rect();
                Window window = this.f11290b.requireActivity().getWindow();
                if (window != null && (decorView = window.getDecorView()) != null) {
                    decorView.getWindowVisibleDisplayFrame(rect);
                }
                vVarA.f1183f.setY(rect.centerY());
            }
        });
        vVarA.f1182e.setOnBackListener(new p(this, 8));
        d.a(new ViewOnClickListenerC13080b(10, this, vVarA), vVarA.f1181d);
        RecyclerView recyclerView = vVarA.f1180c;
        recyclerView.setAdapter(this.f436434h0);
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        g.c(recyclerView);
        vVarA.f1179b.getEditText().addTextChangedListener(new n(this, vVarA));
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new r(this, null), 3);
    }
}

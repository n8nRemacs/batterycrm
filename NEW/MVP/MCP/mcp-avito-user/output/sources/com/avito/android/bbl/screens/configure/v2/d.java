package com.avito.android.bbl.screens.configure.v2;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.bbl.screens.configure.v2.BblConfigureV2Fragment;
import com.avito.android.screens.bbip.ui.BbipFragment;
import com.avito.android.screens.bbip_private.BbipPrivateFragment;
import com.avito.android.util.D6;
import com.avito.android.vas_performance.ui.competitive.CompetitiveVasFragment;
import xZ.C49899a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class d implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f99297b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f99298c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f99299d;

    public /* synthetic */ d(int i12, Object obj, Object obj2) {
        this.f99297b = i12;
        this.f99298c = obj;
        this.f99299d = obj2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        BbipFragment bbipFragment;
        RecyclerView recyclerView;
        BbipPrivateFragment bbipPrivateFragment;
        RecyclerView recyclerView2;
        Object obj = this.f99299d;
        Object obj2 = this.f99298c;
        switch (this.f99297b) {
            case 0:
                if (view.getHeight() > 0) {
                    BblConfigureV2Fragment.a aVar = BblConfigureV2Fragment.f99264C0;
                    ((InterfaceC22196w1) obj2).L3(D6.v(((BblConfigureV2Fragment) obj).r5()));
                    break;
                }
                break;
            case 1:
                BbipFragment.a aVar2 = BbipFragment.f260259H0;
                if (view.getHeight() > 0 && (recyclerView = (bbipFragment = (BbipFragment) obj2).f260279z0) != null) {
                    C49899a c49899a = bbipFragment.f260266G0;
                    if (c49899a != null) {
                        recyclerView.r0(c49899a);
                    }
                    C49899a c49899a2 = new C49899a(((ViewGroup) obj).getHeight());
                    recyclerView.l(c49899a2, -1);
                    bbipFragment.f260266G0 = c49899a2;
                    break;
                }
                break;
            case 2:
                BbipPrivateFragment.a aVar3 = BbipPrivateFragment.f260443G0;
                if (view.getHeight() > 0 && (recyclerView2 = (bbipPrivateFragment = (BbipPrivateFragment) obj2).f260446C0) != null) {
                    C49899a c49899a3 = bbipPrivateFragment.f260449F0;
                    if (c49899a3 != null) {
                        recyclerView2.r0(c49899a3);
                    }
                    C49899a c49899a4 = new C49899a(((ViewGroup) obj).getHeight());
                    recyclerView2.l(c49899a4, -1);
                    bbipPrivateFragment.f260449F0 = c49899a4;
                    break;
                }
                break;
            default:
                CompetitiveVasFragment.a aVar4 = CompetitiveVasFragment.f321463C0;
                if (view.getHeight() > 0) {
                    CompetitiveVasFragment competitiveVasFragment = (CompetitiveVasFragment) obj2;
                    RecyclerView recyclerView3 = competitiveVasFragment.f321474v0;
                    if (recyclerView3 == null) {
                        recyclerView3 = null;
                    }
                    C49899a c49899a5 = competitiveVasFragment.f321478z0;
                    if (c49899a5 != null) {
                        recyclerView3.r0(c49899a5);
                    }
                    C49899a c49899a6 = new C49899a(D6.v((ViewGroup) obj));
                    recyclerView3.l(c49899a6, -1);
                    competitiveVasFragment.f321478z0 = c49899a6;
                    break;
                }
                break;
        }
    }
}

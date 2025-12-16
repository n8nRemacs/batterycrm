package com.avito.android.progress_overlay;

import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.C35835l0;
import j.D;
import j.I;
import j.InterfaceC42156l;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LoadingProgressOverlay.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/progress_overlay/c;", "Lcom/avito/android/progress_overlay/b;", "_avito_progress-overlay_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f231582a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h f231583b;

    /* renamed from: c, reason: collision with root package name */
    public l f231584c;

    @Inject
    public c(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k h hVar) {
        this.f231582a = interfaceC28373a;
        this.f231583b = hVar;
    }

    @Override // com.avito.android.progress_overlay.b
    public final void C0() {
        h hVar = this.f231583b;
        DialogFragment dialogFragment = hVar.f231588b;
        if (dialogFragment == null) {
            l lVar = this.f231584c;
            if (lVar == null) {
                lVar = null;
            }
            lVar.j();
            return;
        }
        dialogFragment.dismiss();
        H hE2 = hVar.f231587a.getSupportFragmentManager().e();
        hE2.m(dialogFragment);
        hE2.e();
    }

    @Override // com.avito.android.progress_overlay.b
    public final void a() {
        l lVar = this.f231584c;
        if (lVar == null) {
            lVar = null;
        }
        lVar.k(null);
    }

    @Override // com.avito.android.progress_overlay.b
    public final void b(@Y61.k String str) {
        l lVar = this.f231584c;
        if (lVar == null) {
            lVar = null;
        }
        lVar.a(str);
    }

    @Override // com.avito.android.progress_overlay.b
    public final void c(@Y61.k Y41.a<G0> aVar) {
        l lVar = this.f231584c;
        if (lVar == null) {
            lVar = null;
        }
        lVar.f231600j = aVar;
    }

    @Override // com.avito.android.progress_overlay.b
    public final void d(@Y61.k ViewGroup viewGroup, @D int i12, @I int i13, @Y61.l @InterfaceC42156l Integer num, boolean z12) {
        int iIntValue = num != null ? num.intValue() : C35835l0.d(R.attr.white, viewGroup.getContext());
        if (!z12) {
            i12 = -1;
        }
        this.f231584c = new l(viewGroup, i12, this.f231582a, i13, iIntValue);
    }
}

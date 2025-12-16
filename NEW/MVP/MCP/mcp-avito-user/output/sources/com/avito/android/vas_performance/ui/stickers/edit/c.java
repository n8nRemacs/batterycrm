package com.avito.android.vas_performance.ui.stickers.edit;

import com.avito.android.R;
import com.avito.android.lib.design.progress_bar.ProgressBar;
import com.avito.android.util.D6;
import com.avito.android.vas_performance.ui.stickers.edit.StickersEditVasFragment;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: StickersEditVasFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/vas_performance/ui/stickers/edit/u;", "kotlin.jvm.PlatformType", "viewState", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/vas_performance/ui/stickers/edit/u;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class c extends N implements Y41.l<u, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ StickersEditVasFragment f322023l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(StickersEditVasFragment stickersEditVasFragment) {
        super(1);
        this.f322023l = stickersEditVasFragment;
    }

    @Override // Y41.l
    public final G0 invoke(u uVar) {
        G0 g02;
        int i12;
        u uVar2 = uVar;
        Float f12 = uVar2.f322061a;
        StickersEditVasFragment stickersEditVasFragment = this.f322023l;
        if (f12 != null) {
            float fFloatValue = f12.floatValue();
            ProgressBar progressBar = stickersEditVasFragment.f322018y0;
            if (progressBar != null) {
                progressBar.setProgress(fFloatValue);
            }
            D6.H(stickersEditVasFragment.f322018y0);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            D6.w(stickersEditVasFragment.f322018y0);
        }
        List<com.avito.conveyor_item.a> list = uVar2.f322062b;
        if (list != null) {
            com.avito.konveyor.adapter.a aVar = stickersEditVasFragment.f322007n0;
            if (aVar == null) {
                aVar = null;
            }
            com.avito.android.authorization.auto_recovery.phone_confirm.b.p(aVar, list);
            com.avito.konveyor.adapter.j jVar = stickersEditVasFragment.f322010q0;
            (jVar != null ? jVar : null).notifyDataSetChanged();
        }
        com.avito.android.vas_performance.ui.a aVar2 = uVar2.f322066f;
        if (aVar2 != null) {
            StickersEditVasFragment.a aVar3 = StickersEditVasFragment.f322004B0;
            com.avito.android.lib.design.button.b.a(stickersEditVasFragment.q5(), aVar2.f321403a, false);
            boolean z12 = aVar2.f321404b;
            if (z12) {
                i12 = R.attr.buttonPrimaryLarge;
            } else {
                if (z12) {
                    throw new NoWhenBranchMatchedException();
                }
                i12 = R.attr.buttonSecondaryLarge;
            }
            stickersEditVasFragment.q5().setAppearanceFromAttr(i12);
        }
        return G0.f406611a;
    }
}

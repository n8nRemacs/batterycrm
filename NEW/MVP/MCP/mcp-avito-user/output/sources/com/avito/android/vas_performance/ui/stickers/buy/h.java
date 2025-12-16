package com.avito.android.vas_performance.ui.stickers.buy;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.progress_bar.ProgressBar;
import com.avito.android.mnz_common.data.MnzFloatingFooter;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.vas_performance.remote.model.stickers.buy.InfoIconName;
import com.avito.android.vas_performance.ui.stickers.buy.StickersBuyVasFragment;
import com.avito.android.vas_performance.ui.stickers.buy.a;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import qK0.C47313c;

/* compiled from: StickersBuyVasFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/vas_performance/ui/stickers/buy/z;", "kotlin.jvm.PlatformType", "viewState", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/vas_performance/ui/stickers/buy/z;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class h extends N implements Y41.l<z, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ StickersBuyVasFragment f321953l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(StickersBuyVasFragment stickersBuyVasFragment) {
        super(1);
        this.f321953l = stickersBuyVasFragment;
    }

    @Override // Y41.l
    public final G0 invoke(z zVar) {
        G0 g02;
        G0 g03;
        int i12;
        G0 g04;
        z zVar2 = zVar;
        Float f12 = zVar2.f321997a;
        StickersBuyVasFragment stickersBuyVasFragment = this.f321953l;
        if (f12 != null) {
            float fFloatValue = f12.floatValue();
            ProgressBar progressBar = stickersBuyVasFragment.f321926F0;
            if (progressBar != null) {
                progressBar.setProgress(fFloatValue);
            }
            D6.H(stickersBuyVasFragment.f321926F0);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            D6.w(stickersBuyVasFragment.f321926F0);
        }
        List<com.avito.conveyor_item.a> list = zVar2.f321998b;
        if (list != null) {
            com.avito.konveyor.adapter.a aVar = stickersBuyVasFragment.f321931n0;
            if (aVar == null) {
                aVar = null;
            }
            com.avito.android.authorization.auto_recovery.phone_confirm.b.p(aVar, list);
            com.avito.konveyor.adapter.j jVar = stickersBuyVasFragment.f321934q0;
            if (jVar == null) {
                jVar = null;
            }
            jVar.notifyDataSetChanged();
        }
        StickersBuyVasFragment.a aVar2 = StickersBuyVasFragment.f321919K0;
        C47313c c47313c = stickersBuyVasFragment.f321943z0;
        FL0.b bVar = zVar2.f322000d;
        if (bVar != null) {
            kotlin.reflect.n<Object>[] nVarArr = StickersBuyVasFragment.f321920L0;
            kotlin.reflect.n<Object> nVar = nVarArr[2];
            D6.G((View) c47313c.a(), true);
            AttributedText description = bVar.getDescription();
            if (description != null) {
                C47313c c47313c2 = stickersBuyVasFragment.f321923C0;
                kotlin.reflect.n<Object> nVar2 = nVarArr[5];
                com.avito.android.util.text.j.c((TextView) c47313c2.a(), description, null);
            }
            InfoIconName iconName = bVar.getIconName();
            if (iconName != null) {
                D6.G(stickersBuyVasFragment.s5(), true);
                ImageView imageViewS5 = stickersBuyVasFragment.s5();
                Context context = stickersBuyVasFragment.s5().getContext();
                if (a.C9957a.f321946a[iconName.ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                imageViewS5.setImageDrawable(C35835l0.h(R.attr.ic_info24, context));
                g04 = G0.f406611a;
            } else {
                g04 = null;
            }
            if (g04 == null) {
                D6.w(stickersBuyVasFragment.s5());
            }
            D6.D(stickersBuyVasFragment.r5(), R.drawable.bg_avito_bottom_sheet);
            g03 = G0.f406611a;
        } else {
            g03 = null;
        }
        if (g03 == null) {
            kotlin.reflect.n<Object> nVar3 = StickersBuyVasFragment.f321920L0[2];
            D6.w((View) c47313c.a());
            D6.D(stickersBuyVasFragment.r5(), R.drawable.bg_white_gradient);
        }
        com.avito.android.vas_performance.ui.a aVar3 = zVar2.f322001e;
        if (aVar3 != null) {
            com.avito.android.lib.design.button.b.a(stickersBuyVasFragment.q5(), aVar3.f321403a, false);
            boolean z12 = aVar3.f321404b;
            if (z12) {
                i12 = R.attr.buttonPrimaryLarge;
            } else {
                if (z12) {
                    throw new NoWhenBranchMatchedException();
                }
                i12 = R.attr.buttonSecondaryLarge;
            }
            stickersBuyVasFragment.q5().setAppearanceFromAttr(i12);
        }
        MnzFloatingFooter mnzFloatingFooter = zVar2.f322002f;
        if (mnzFloatingFooter != null) {
            C47313c c47313c3 = stickersBuyVasFragment.f321922B0;
            kotlin.reflect.n<Object> nVar4 = StickersBuyVasFragment.f321920L0[4];
            com.avito.android.mnz_common.ui.MnzFloatingFooter mnzFloatingFooter2 = (com.avito.android.mnz_common.ui.MnzFloatingFooter) c47313c3.a();
            com.avito.android.util.text.a aVar4 = stickersBuyVasFragment.f321939v0;
            mnzFloatingFooter2.d(mnzFloatingFooter, aVar4 != null ? aVar4 : null, new f(stickersBuyVasFragment), new g(stickersBuyVasFragment));
        }
        return G0.f406611a;
    }
}

package com.avito.android.beduin.common.actionhandler.tooltip;

import Y41.l;
import android.view.View;
import com.avito.android.beduin.common.action.BeduinTooltipAction;
import com.avito.android.lib.design.tooltip.k;
import com.avito.android.lib.design.tooltip.o;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinTooltipObserverImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class f extends N implements l<o, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BeduinTooltipAction f100461l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f100462m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k f100463n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BeduinTooltipAction beduinTooltipAction, d dVar, k kVar) {
        super(1);
        this.f100461l = beduinTooltipAction;
        this.f100462m = dVar;
        this.f100463n = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(o oVar) {
        o oVar2 = oVar;
        BeduinTooltipAction beduinTooltipAction = this.f100461l;
        String text = beduinTooltipAction.getText();
        if (text != null) {
            oVar2.b(text);
        }
        String title = beduinTooltipAction.getTitle();
        if (title != null) {
            oVar2.i(title);
        }
        final BeduinTooltipAction.Button button = beduinTooltipAction.getButton();
        final k kVar = this.f100463n;
        final d dVar = this.f100462m;
        if (button != null) {
            oVar2.d(button.getTitle());
            final int i12 = 0;
            oVar2.c(new View.OnClickListener() { // from class: com.avito.android.beduin.common.actionhandler.tooltip.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            com.avito.android.beduin_shared.model.utils.a.a(dVar.f100443a, button.c());
                            kVar.dismiss();
                            break;
                        default:
                            com.avito.android.beduin_shared.model.utils.a.a(dVar.f100443a, button.c());
                            kVar.dismiss();
                            break;
                    }
                }
            });
        }
        final BeduinTooltipAction.Button closeButton = beduinTooltipAction.getCloseButton();
        if (closeButton != null) {
            oVar2.f(true);
            final int i13 = 1;
            oVar2.e(new View.OnClickListener() { // from class: com.avito.android.beduin.common.actionhandler.tooltip.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            com.avito.android.beduin_shared.model.utils.a.a(dVar.f100443a, closeButton.c());
                            kVar.dismiss();
                            break;
                        default:
                            com.avito.android.beduin_shared.model.utils.a.a(dVar.f100443a, closeButton.c());
                            kVar.dismiss();
                            break;
                    }
                }
            });
        }
        return G0.f406611a;
    }
}

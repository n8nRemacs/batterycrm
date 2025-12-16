package com.avito.android.beduin.common.actionhandler.option_selector;

import Ui.InterfaceC15522a;
import Ui.InterfaceC15523b;
import android.view.View;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.R;
import com.avito.android.beduin.common.action.OpenOptionSelectorAction;
import com.avito.android.beduin.common.actionhandler.option_selector.m;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.top_toolbar.BeduinTopToolbarModel;
import com.avito.android.beduin.common.component.top_toolbar.h;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;

/* compiled from: OpenOptionSelectorActionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/option_selector/i;", "LUi/b;", "Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements InterfaceC15523b<OpenOptionSelectorAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15522a f100315a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final lj.c f100316b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final m f100317c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC15523b<BeduinAction>> f100318d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.common.form.store.b f100319e;

    @Inject
    public i(@Y61.k InterfaceC15522a interfaceC15522a, @Y61.k lj.c cVar, @Y61.k m mVar, @Y61.k h31.e<InterfaceC15523b<BeduinAction>> eVar, @Y61.k com.avito.android.beduin.common.form.store.b bVar) {
        this.f100315a = interfaceC15522a;
        this.f100316b = cVar;
        this.f100317c = mVar;
        this.f100318d = eVar;
        this.f100319e = bVar;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        final OpenOptionSelectorAction openOptionSelectorAction = (OpenOptionSelectorAction) beduinAction;
        this.f100315a.b(new InterfaceC15522a.InterfaceC1136a() { // from class: com.avito.android.beduin.common.actionhandler.option_selector.e
            @Override // Ui.InterfaceC15522a.InterfaceC1136a
            public final void g(ActivityC22955m activityC22955m) {
                String str;
                BeduinTopToolbarModel.Style style;
                List<? extends String> listC;
                OpenOptionSelectorAction openOptionSelectorAction2 = openOptionSelectorAction;
                OpenOptionSelectorAction.PreselectedOptionIdProvider preselectedOptionIdProvider = openOptionSelectorAction2.getPreselectedOptionIdProvider();
                i iVar = this;
                if (preselectedOptionIdProvider == null || (listC = preselectedOptionIdProvider.c()) == null) {
                    str = null;
                } else {
                    str = (String) (!listC.isEmpty() ? com.avito.android.beduin.common.component.model.e.a(C42745f0.E0(listC, listC.size() - 1).iterator(), (String) C42745f0.Q(listC), iVar.f100316b.b(), f.f100310l) : null);
                }
                OpenOptionSelectorAction.ScreenSettings screenSettings = openOptionSelectorAction2.getScreenSettings();
                OpenOptionSelectorAction.ClearSelected clearSelected = openOptionSelectorAction2.getScreenSettings().getClearSelected();
                String title = clearSelected != null ? clearSelected.getTitle() : null;
                List<OpenOptionSelectorAction.Option> listD = openOptionSelectorAction2.d();
                g gVar = new g(openOptionSelectorAction2, iVar);
                final h hVar = new h(openOptionSelectorAction2, iVar);
                iVar.f100317c.getClass();
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(activityC22955m, com.avito.android.beduin.common.component.a.a(screenSettings.getTheme()));
                InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new n(dVar, str, listD, gVar));
                String title2 = screenSettings.getTitle();
                OpenOptionSelectorAction.ScreenSettings.SelectorStyle selectorStyle = screenSettings.getSelectorStyle();
                int[] iArr = m.a.f100337a;
                int i12 = iArr[selectorStyle.ordinal()];
                if (i12 != 1 && i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                d dVar2 = (d) interfaceC42726CB.getValue();
                com.avito.android.lib.design.bottom_sheet.d.M(dVar2, null, false, true, 7);
                BeduinComponentTheme theme = screenSettings.getTheme();
                if (theme == null) {
                    theme = BeduinComponentTheme.AVITO;
                }
                int i13 = iArr[screenSettings.getSelectorStyle().ordinal()];
                if (i13 == 1) {
                    style = BeduinTopToolbarModel.Style.LARGE;
                } else {
                    if (i13 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    style = BeduinTopToolbarModel.Style.SMALL;
                }
                h.a aVarA = com.avito.android.beduin.common.component.top_toolbar.i.a(theme, style, true);
                final com.avito.android.autoteka.presentation.reportGeneration.a aVar = new com.avito.android.autoteka.presentation.reportGeneration.a(dVar2, 3);
                com.avito.android.beduin.common.component.top_toolbar.h hVar2 = new com.avito.android.beduin.common.component.top_toolbar.h(dVar, null, 0, 6, null);
                if (screenSettings.getSelectorStyle() == OpenOptionSelectorAction.ScreenSettings.SelectorStyle.COMPACT) {
                    hVar2.setRightText(title);
                    hVar2.setRightTextClickListener(new View.OnClickListener() { // from class: com.avito.android.beduin.common.actionhandler.option_selector.l
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ((h) hVar).invoke();
                            aVar.onClick(view);
                        }
                    });
                }
                hVar2.setTitle(title2);
                hVar2.g(aVarA);
                hVar2.setRightIconClickedListener(aVar);
                hVar2.setLeftIconClickedListener(aVar);
                int iF2 = C35835l0.f(R.attr.horizontalOffset, dVar);
                hVar2.setPadding(iF2, y6.b(6), iF2, hVar2.getPaddingBottom());
                dVar2.H(hVar2);
                dVar2.show();
            }
        });
    }
}

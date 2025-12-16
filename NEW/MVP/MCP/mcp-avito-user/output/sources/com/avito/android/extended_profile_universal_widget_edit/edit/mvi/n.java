package com.avito.android.extended_profile_universal_widget_edit.edit.mvi;

import android.annotation.SuppressLint;
import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.extended_profile_ui_components.ActionsBottomMenuData;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel;
import com.avito.android.extended_profile_universal_widget_edit.UniversalWidgetEditArguments;
import com.avito.android.remote.model.extended.UniversalWidget;
import com.avito.android.remote.model.text.AttributedText;
import iB.InterfaceC41263a;
import jB.InterfaceC42227a;
import jB.InterfaceC42228b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: UniversalWidgetEditReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/edit/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "LjB/b;", "LjB/d;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class n implements u<InterfaceC42228b, jB.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final UniversalWidgetEditArguments f153954b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_ui_components.universal_widget.a f153955c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_universal_widget_edit.f f153956d;

    @Inject
    public n(@Y61.k UniversalWidgetEditArguments universalWidgetEditArguments, @Y61.k com.avito.android.extended_profile_ui_components.universal_widget.a aVar, @Y61.k com.avito.android.extended_profile_universal_widget_edit.f fVar) {
        this.f153954b = universalWidgetEditArguments;
        this.f153955c = aVar;
        this.f153956d = fVar;
    }

    public static List b(List list, int i12, Y41.l lVar) {
        if (i12 == -1) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.set(i12, lVar.invoke(arrayList.get(i12)));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    @android.annotation.SuppressLint({"HardcodeStringDetector"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.Section d(com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.a r10, com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.Section r11) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_universal_widget_edit.edit.mvi.n.d(com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel$a, com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel$Section):com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel$Section");
    }

    @SuppressLint({"HardcodeStringDetector"})
    public static UniversalWidgetSectionModel.Section e(InterfaceC41263a interfaceC41263a, UniversalWidgetSectionModel.Section section) {
        if (interfaceC41263a instanceof InterfaceC41263a.c) {
            if (section instanceof UniversalWidgetSectionModel.FactoidSection) {
                return UniversalWidgetSectionModel.FactoidSection.d((UniversalWidgetSectionModel.FactoidSection) section, null, ((InterfaceC41263a.c) interfaceC41263a).f398424a, null, 61);
            }
            if (section instanceof UniversalWidgetSectionModel.ImageWithTextSection) {
                return UniversalWidgetSectionModel.ImageWithTextSection.d((UniversalWidgetSectionModel.ImageWithTextSection) section, null, null, null, ((InterfaceC41263a.c) interfaceC41263a).f398424a, null, 495);
            }
            if (section instanceof UniversalWidgetSectionModel.TextSection) {
                throw new IllegalStateException("TextSection can't set title");
            }
            throw new NoWhenBranchMatchedException();
        }
        if (interfaceC41263a instanceof InterfaceC41263a.C11369a) {
            InterfaceC41263a.C11369a c11369a = (InterfaceC41263a.C11369a) interfaceC41263a;
            return d(((InterfaceC41263a.b) c11369a.f398418a.get(c11369a.f398419b)).f398421a, section);
        }
        if (!(interfaceC41263a instanceof InterfaceC41263a.d)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC41263a.d dVar = (InterfaceC41263a.d) interfaceC41263a;
        return d(((InterfaceC41263a.e) dVar.f398428a.get(dVar.f398429b)).f398430a, section);
    }

    @Override // com.avito.android.arch.mvi.u
    public final jB.d a(InterfaceC42228b interfaceC42228b, jB.d dVar) {
        UniversalWidgetSectionModel.Section sectionD;
        ActionsBottomMenuData actionsBottomMenuData;
        UniversalWidgetSectionModel.Section sectionD2;
        InterfaceC42228b interfaceC42228b2 = interfaceC42228b;
        jB.d dVar2 = dVar;
        boolean z12 = interfaceC42228b2 instanceof InterfaceC42228b.g;
        UniversalWidgetEditArguments universalWidgetEditArguments = this.f153954b;
        if (z12) {
            return c(universalWidgetEditArguments.f153654d, dVar2);
        }
        boolean z13 = interfaceC42228b2 instanceof InterfaceC42228b.i;
        UniversalWidgetSectionModel.Section section = dVar2.f405503d;
        if (z13) {
            return c(e(((InterfaceC42228b.i) interfaceC42228b2).f405479a, section), dVar2);
        }
        if (interfaceC42228b2 instanceof InterfaceC42228b.q) {
            InterfaceC41263a.C11369a<?> c11369a = ((InterfaceC42228b.q) interfaceC42228b2).f405489a;
            Iterable iterable = c11369a.f398418a;
            ArrayList arrayList = new ArrayList(C42745f0.q(iterable, 10));
            int i12 = 0;
            for (Object obj : iterable) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                InterfaceC41263a.b bVar = (InterfaceC41263a.b) obj;
                arrayList.add(new ActionsBottomMenuData.a(bVar.f398422b, null, null, new InterfaceC42227a.g(c11369a, i12), bVar.f398423c, i12 == c11369a.f398419b, 6, null));
                i12 = i13;
            }
            return jB.d.a(dVar2, false, null, null, false, null, null, null, null, new ActionsBottomMenuData(c11369a.f398420c, null, arrayList, null, null, 24, null), 255);
        }
        if (interfaceC42228b2 instanceof InterfaceC42228b.a) {
            return jB.d.a(c(e(((InterfaceC42228b.a) interfaceC42228b2).f405471a, section), dVar2), false, null, null, false, null, null, null, null, null, 255);
        }
        if (interfaceC42228b2 instanceof InterfaceC42228b.k) {
            boolean z14 = section instanceof UniversalWidgetSectionModel.FactoidSection;
            int i14 = ((InterfaceC42228b.k) interfaceC42228b2).f405481a;
            if (z14) {
                UniversalWidgetSectionModel.FactoidSection factoidSection = (UniversalWidgetSectionModel.FactoidSection) section;
                sectionD2 = UniversalWidgetSectionModel.FactoidSection.d(factoidSection, null, null, b(factoidSection.f153562h, i14, k.f153951l), 31);
            } else if (section instanceof UniversalWidgetSectionModel.ImageWithTextSection) {
                UniversalWidgetSectionModel.ImageWithTextSection imageWithTextSection = (UniversalWidgetSectionModel.ImageWithTextSection) section;
                sectionD2 = UniversalWidgetSectionModel.ImageWithTextSection.d(imageWithTextSection, null, null, null, null, b(imageWithTextSection.f153598k, i14, l.f153952l), 255);
            } else {
                if (!(section instanceof UniversalWidgetSectionModel.TextSection)) {
                    throw new NoWhenBranchMatchedException();
                }
                UniversalWidgetSectionModel.TextSection textSection = (UniversalWidgetSectionModel.TextSection) section;
                sectionD2 = UniversalWidgetSectionModel.TextSection.d(textSection, null, b(textSection.f153629e, i14, m.f153953l), 3);
            }
            return c(sectionD2, dVar2);
        }
        if (interfaceC42228b2 instanceof InterfaceC42228b.r) {
            String title = universalWidgetEditArguments.f153657g.getFinishEditingDialog().getTitle();
            UniversalWidget.Config config = universalWidgetEditArguments.f153657g;
            String description = config.getFinishEditingDialog().getDescription();
            C42784z0 c42784z0 = C42784z0.f406748b;
            return jB.d.a(dVar2, false, null, null, false, null, null, null, null, new ActionsBottomMenuData(title, new AttributedText(description, c42784z0, 0, 4, null), c42784z0, new ActionsBottomMenuData.b(config.getFinishEditingDialog().getSaveButton(), InterfaceC42227a.j.f405465a), new ActionsBottomMenuData.b(config.getFinishEditingDialog().getDontSaveButton(), InterfaceC42227a.i.f405464a)), 255);
        }
        if (interfaceC42228b2 instanceof InterfaceC42228b.e) {
            return jB.d.a(dVar2, false, null, null, false, null, null, null, null, null, 255);
        }
        if (interfaceC42228b2 instanceof InterfaceC42228b.h) {
            return jB.d.a(dVar2, true, null, null, false, null, null, null, null, null, 510);
        }
        if (interfaceC42228b2 instanceof InterfaceC42228b.s) {
            String title2 = universalWidgetEditArguments.f153657g.getDeleteSectionDialog().getTitle();
            UniversalWidget.Config config2 = universalWidgetEditArguments.f153657g;
            String description2 = config2.getDeleteSectionDialog().getDescription();
            C42784z0 c42784z02 = C42784z0.f406748b;
            return jB.d.a(dVar2, false, null, null, false, null, null, null, null, new ActionsBottomMenuData(title2, new AttributedText(description2, c42784z02, 0, 4, null), c42784z02, new ActionsBottomMenuData.b(config2.getDeleteSectionDialog().getConfirmButton(), InterfaceC42227a.k.f405466a), new ActionsBottomMenuData.b(config2.getDeleteSectionDialog().getDismissButton(), InterfaceC42227a.b.f405455a)), 255);
        }
        if (interfaceC42228b2 instanceof InterfaceC42228b.t) {
            boolean requiredFilling = universalWidgetEditArguments.f153656f.getRequiredFilling();
            UniversalWidget.UniversalWidgetSectionVisibilityStatus universalWidgetSectionVisibilityStatus = universalWidgetEditArguments.f153656f;
            if (requiredFilling || !universalWidgetSectionVisibilityStatus.getCanChangeVisibility()) {
                String title3 = universalWidgetSectionVisibilityStatus.getTitle();
                String description3 = universalWidgetSectionVisibilityStatus.getDescription();
                actionsBottomMenuData = new ActionsBottomMenuData(title3, description3 != null ? new AttributedText(description3, C42784z0.f406748b, 0, 4, null) : null, C42784z0.f406748b, null, null, 24, null);
            } else {
                UniversalWidget.Config config3 = universalWidgetEditArguments.f153657g;
                List listU = C42745f0.U(new ActionsBottomMenuData.a(config3.getChangeVisibilityDialog().getSectionShown(), null, null, new InterfaceC42227a.C11550a(true), R.drawable.ic_universal_widget_edit_visible_20, dVar2.f405504e, 6, null), new ActionsBottomMenuData.a(config3.getChangeVisibilityDialog().getSectionHidden(), null, null, new InterfaceC42227a.C11550a(false), R.drawable.ic_universal_widget_edit_invisible_20, !dVar2.f405504e, 6, null));
                String title4 = config3.getChangeVisibilityDialog().getTitle();
                String description4 = universalWidgetSectionVisibilityStatus.getDescription();
                actionsBottomMenuData = new ActionsBottomMenuData(title4, description4 != null ? new AttributedText(description4, C42784z0.f406748b, 0, 4, null) : null, listU, null, null, 24, null);
            }
            return jB.d.a(dVar2, false, null, null, false, null, null, null, null, actionsBottomMenuData, 255);
        }
        if (interfaceC42228b2 instanceof InterfaceC42228b.c) {
            return jB.d.a(dVar2, false, null, null, ((InterfaceC42228b.c) interfaceC42228b2).f405474a, null, null, null, null, null, 502);
        }
        if (!(interfaceC42228b2 instanceof InterfaceC42228b.u)) {
            if (interfaceC42228b2 instanceof InterfaceC42228b.p) {
                return jB.d.a(dVar2, false, null, ((InterfaceC42228b.p) interfaceC42228b2).f405488a, false, null, null, null, null, null, 507);
            }
            if (interfaceC42228b2 instanceof InterfaceC42228b.o ? true : interfaceC42228b2 instanceof InterfaceC42228b.n ? true : interfaceC42228b2 instanceof InterfaceC42228b.m ? true : interfaceC42228b2 instanceof InterfaceC42228b.l ? true : interfaceC42228b2 instanceof InterfaceC42228b.j ? true : interfaceC42228b2 instanceof InterfaceC42228b.C11551b ? true : interfaceC42228b2 instanceof InterfaceC42228b.f) {
                return jB.d.a(dVar2, false, null, null, false, null, null, null, null, null, 510);
            }
            if (interfaceC42228b2 instanceof InterfaceC42228b.d) {
                return dVar2;
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC42228b.u uVar = (InterfaceC42228b.u) interfaceC42228b2;
        boolean z15 = section instanceof UniversalWidgetSectionModel.FactoidSection;
        UniversalWidgetSectionModel.Block block = uVar.f405493a;
        int i15 = uVar.f405494b;
        if (z15) {
            if (!(block instanceof UniversalWidgetSectionModel.FactoidBlock)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            UniversalWidgetSectionModel.FactoidSection factoidSection2 = (UniversalWidgetSectionModel.FactoidSection) section;
            ArrayList arrayList2 = new ArrayList(factoidSection2.f153562h);
            arrayList2.set(i15, block);
            G0 g02 = G0.f406611a;
            sectionD = UniversalWidgetSectionModel.FactoidSection.d(factoidSection2, null, null, arrayList2, 31);
        } else if (section instanceof UniversalWidgetSectionModel.ImageWithTextSection) {
            if (!(block instanceof UniversalWidgetSectionModel.ImageWithTextBlock)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            UniversalWidgetSectionModel.ImageWithTextSection imageWithTextSection2 = (UniversalWidgetSectionModel.ImageWithTextSection) section;
            ArrayList arrayList3 = new ArrayList(imageWithTextSection2.f153598k);
            arrayList3.set(i15, block);
            G0 g03 = G0.f406611a;
            sectionD = UniversalWidgetSectionModel.ImageWithTextSection.d(imageWithTextSection2, null, null, null, null, arrayList3, 255);
        } else {
            if (!(section instanceof UniversalWidgetSectionModel.TextSection)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!(block instanceof UniversalWidgetSectionModel.TextBlock)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            UniversalWidgetSectionModel.TextSection textSection2 = (UniversalWidgetSectionModel.TextSection) section;
            ArrayList arrayList4 = new ArrayList(textSection2.f153629e);
            arrayList4.set(i15, block);
            G0 g04 = G0.f406611a;
            sectionD = UniversalWidgetSectionModel.TextSection.d(textSection2, null, arrayList4, 3);
        }
        return c(sectionD, dVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jB.d c(com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.Section r12, jB.d r13) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.FactoidSection
            if (r0 == 0) goto L17
            r0 = r12
            com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel$FactoidSection r0 = (com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.FactoidSection) r0
            com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel$FactoidItemsCountType r1 = r0.f153557c
            com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel$FactoidItemsCountType r2 = com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.FactoidItemsCountType.f153553b
            if (r1 != r2) goto L17
            java.util.List<com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel$FactoidBlock> r0 = r0.f153562h
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 3
            java.util.List r0 = kotlin.collections.C42745f0.E0(r0, r1)
            goto L1b
        L17:
            java.util.List r0 = r12.c()
        L1b:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.C42745f0.q(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L2c:
            boolean r2 = r0.hasNext()
            com.avito.android.extended_profile_ui_components.universal_widget.a r4 = r11.f153955c
            if (r2 == 0) goto L42
            java.lang.Object r2 = r0.next()
            com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel$Block r2 = (com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.Block) r2
            com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView$UniversalWidgetBlockState r2 = r4.a(r12, r2)
            r1.add(r2)
            goto L2c
        L42:
            int r0 = r1.size()
            com.avito.android.extended_profile_universal_widget_edit.UniversalWidgetEditArguments r2 = r11.f153954b
            com.avito.android.remote.model.extended.UniversalWidget$Config r2 = r2.f153657g
            com.avito.android.remote.model.extended.UniversalWidget$SectionsConfig r2 = r2.getSectionsConfig()
            com.avito.android.extended_profile_universal_widget_edit.f r5 = r11.f153956d
            java.lang.String r2 = r5.a(r12, r2)
            r5 = 4
            if (r0 != r5) goto L6a
            com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetFourBlocksView$UniversalWidgetFourBlocksState r8 = r4.b(r12)
            r7 = 0
            r9 = 0
            r1 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r10 = 265(0x109, float:3.71E-43)
            r0 = r13
            r3 = r12
            jB.d r0 = jB.d.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L8e
        L6a:
            r0 = 0
            java.lang.Object r0 = kotlin.collections.C42745f0.K(r0, r1)
            r5 = r0
            com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView$UniversalWidgetBlockState r5 = (com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView.UniversalWidgetBlockState) r5
            r0 = 1
            java.lang.Object r0 = kotlin.collections.C42745f0.K(r0, r1)
            r6 = r0
            com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView$UniversalWidgetBlockState r6 = (com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView.UniversalWidgetBlockState) r6
            r0 = 2
            java.lang.Object r0 = kotlin.collections.C42745f0.K(r0, r1)
            r7 = r0
            com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView$UniversalWidgetBlockState r7 = (com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView.UniversalWidgetBlockState) r7
            r8 = 0
            r9 = 0
            r1 = 0
            r4 = 0
            r10 = 265(0x109, float:3.71E-43)
            r0 = r13
            r3 = r12
            jB.d r0 = jB.d.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L8e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_universal_widget_edit.edit.mvi.n.c(com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel$Section, jB.d):jB.d");
    }
}

package com.avito.android.extended_profile_universal_widget_edit.edit;

import Cd.C13243a;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.extended_profile_ui_components.ActionsBottomMenuData;
import com.avito.android.extended_profile_ui_components.p;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetFourBlocksView;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel;
import com.avito.android.extended_profile_universal_widget_edit.UniversalWidgetEditArguments;
import com.avito.android.extended_profile_universal_widget_edit.edit.di.b;
import com.avito.android.extended_profile_universal_widget_edit.edit_block.UniversalWidgetEditBlockArguments;
import com.avito.android.extended_profile_universal_widget_edit.edit_block.UniversalWidgetEditBlockFragment;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.extended.UniversalWidget;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.ui.status_bar.a;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import iB.InterfaceC41263a;
import iB.InterfaceC41264b;
import jB.InterfaceC42227a;
import jB.InterfaceC42229c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: UniversalWidgetEditFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/edit/UniversalWidgetEditFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/ui/status_bar/a;", "Lcom/avito/android/ui/fragments/c;", "<init>", "()V", "a", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UniversalWidgetEditFragment extends BaseFragment implements InterfaceC28477j.b, com.avito.android.ui.status_bar.a, com.avito.android.ui.fragments.c {

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public static final a f153776u0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public m f153777n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f153778o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f153779p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public n f153780q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f153781r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f153782s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.extended_profile_universal_widget_edit.edit.g f153783t0;

    /* compiled from: UniversalWidgetEditFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/edit/UniversalWidgetEditFragment$a;", "", "<init>", "()V", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: UniversalWidgetEditFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.extended_profile_universal_widget_edit.edit.UniversalWidgetEditFragment$a$a, reason: collision with other inner class name */
        public static final class C4487a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ UniversalWidgetEditArguments f153784l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4487a(UniversalWidgetEditArguments universalWidgetEditArguments) {
                super(1);
                this.f153784l = universalWidgetEditArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("universal_widget_edit_arguments", this.f153784l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static UniversalWidgetEditFragment a(@Y61.k UniversalWidgetEditArguments universalWidgetEditArguments) {
            UniversalWidgetEditFragment universalWidgetEditFragment = new UniversalWidgetEditFragment();
            C35966w1.a(universalWidgetEditFragment, -1, new C4487a(universalWidgetEditArguments));
            return universalWidgetEditFragment;
        }

        public a() {
        }
    }

    /* compiled from: UniversalWidgetEditFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/extended_profile_universal_widget_edit/UniversalWidgetEditArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<UniversalWidgetEditArguments> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final UniversalWidgetEditArguments invoke() {
            return (UniversalWidgetEditArguments) UniversalWidgetEditFragment.this.requireArguments().getParcelable("universal_widget_edit_arguments");
        }
    }

    /* compiled from: UniversalWidgetEditFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC42229c, G0> {
        /* JADX WARN: Multi-variable type inference failed */
        public final void f(@Y61.k InterfaceC42229c interfaceC42229c) {
            com.avito.android.extended_profile_universal_widget_edit.edit.g gVar;
            InterfaceC41263a.C11369a<?> c11369a;
            List<InterfaceC41263a.b<T>> list;
            Object next;
            UniversalWidgetEditFragment universalWidgetEditFragment = (UniversalWidgetEditFragment) this.receiver;
            a aVar = UniversalWidgetEditFragment.f153776u0;
            universalWidgetEditFragment.getClass();
            if (interfaceC42229c instanceof InterfaceC42229c.b) {
                ActivityC22955m activityC22955mRequireActivity = universalWidgetEditFragment.requireActivity();
                if (((InterfaceC42229c.b) interfaceC42229c).f405496a) {
                    activityC22955mRequireActivity.setResult(-1, activityC22955mRequireActivity.getIntent());
                }
                activityC22955mRequireActivity.finish();
                return;
            }
            if (interfaceC42229c instanceof InterfaceC42229c.e) {
                com.avito.android.extended_profile_universal_widget_edit.edit.g gVar2 = universalWidgetEditFragment.f153783t0;
                if (gVar2 != null) {
                    InterfaceC42229c.e eVar = (InterfaceC42229c.e) interfaceC42229c;
                    p.c(p.f153373a, gVar2.f153828a, eVar.f405499a, gVar2.f153829b, new com.avito.android.extended_profile_universal_widget_edit.edit.j(gVar2, eVar.f405500b));
                    return;
                }
                return;
            }
            if (interfaceC42229c instanceof InterfaceC42229c.f) {
                com.avito.android.extended_profile_universal_widget_edit.edit.g gVar3 = universalWidgetEditFragment.f153783t0;
                if (gVar3 != null) {
                    com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                    ((InterfaceC42229c.f) interfaceC42229c).getClass();
                    PrintableText printableTextF = com.avito.android.printable_text.b.f(null);
                    f.c.f125255c.getClass();
                    com.avito.android.component.toast.c.b(cVar, gVar3.f153828a, printableTextF, null, null, null, f.c.a.b(), 0, ToastBarPosition.f181046d, null, false, false, null, null, 4014);
                    return;
                }
                return;
            }
            if (!(interfaceC42229c instanceof InterfaceC42229c.a)) {
                if (!(interfaceC42229c instanceof InterfaceC42229c.C11552c)) {
                    if (!(interfaceC42229c instanceof InterfaceC42229c.d) || (gVar = universalWidgetEditFragment.f153783t0) == null) {
                        return;
                    }
                    gVar.f153840m.smoothScrollTo(0, 0);
                    return;
                }
                androidx.fragment.app.H hE2 = universalWidgetEditFragment.getParentFragmentManager().e();
                UniversalWidgetEditBlockFragment.a aVar2 = UniversalWidgetEditBlockFragment.f153966s0;
                UniversalWidgetEditBlockArguments universalWidgetEditBlockArguments = ((InterfaceC42229c.C11552c) interfaceC42229c).f405497a;
                aVar2.getClass();
                hE2.n(R.id.fragment_container, UniversalWidgetEditBlockFragment.a.a(universalWidgetEditBlockArguments), null);
                hE2.c(null);
                hE2.e();
                return;
            }
            com.avito.android.extended_profile_universal_widget_edit.edit.g gVar4 = universalWidgetEditFragment.f153783t0;
            if (gVar4 != null) {
                InterfaceC42229c.a aVar3 = (InterfaceC42229c.a) interfaceC42229c;
                Iterator it = gVar4.f153841n.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    c11369a = aVar3.f405495a;
                    list = c11369a.f398418a;
                    if (!zHasNext) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    InterfaceC41263a interfaceC41263a = (InterfaceC41263a) ((Q) next).f406619b;
                    if ((interfaceC41263a instanceof InterfaceC41263a.C11369a) && L.f(((InterfaceC41263a.C11369a) interfaceC41263a).f398418a, list)) {
                        break;
                    }
                }
                Q q12 = (Q) next;
                InterfaceC41263a.b bVar = (InterfaceC41263a.b) list.get(c11369a.f398419b);
                KeyEvent.Callback callback = q12 != null ? (View) q12.f406620c : null;
                Input input = callback instanceof Input ? (Input) callback : null;
                if (input != null) {
                    Input.t(input, gVar4.a(Integer.valueOf(bVar.f398423c), bVar.f398422b), false, 6);
                    input.setOnClickListener(new com.avito.android.extended_profile_universal_widget_edit.edit.e(gVar4, c11369a, 0));
                }
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC42229c interfaceC42229c) {
            f(interfaceC42229c);
            return G0.f406611a;
        }
    }

    /* compiled from: UniversalWidgetEditFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<jB.d, G0> {
        @Override // Y41.l
        public final G0 invoke(jB.d dVar) throws Resources.NotFoundException {
            List listU;
            ViewGroup viewGroupB;
            jB.d dVar2 = dVar;
            com.avito.android.extended_profile_universal_widget_edit.edit.g gVar = (com.avito.android.extended_profile_universal_widget_edit.edit.g) this.receiver;
            boolean z12 = gVar.f153844q;
            UniversalWidgetEditArguments universalWidgetEditArguments = gVar.f153830c;
            if (!z12) {
                UniversalWidget.SectionsConfig sectionsConfig = universalWidgetEditArguments.f153657g.getSectionsConfig();
                n nVar = gVar.f153831d;
                nVar.getClass();
                UniversalWidgetSectionModel.Section section = dVar2.f405503d;
                if (section instanceof UniversalWidgetSectionModel.FactoidSection) {
                    UniversalWidgetSectionModel.FactoidSection factoidSection = (UniversalWidgetSectionModel.FactoidSection) section;
                    String str = factoidSection.f153558d;
                    if (str == null) {
                        str = "";
                    }
                    InterfaceC41264b.C11370b c11370b = new InterfaceC41264b.C11370b(new InterfaceC41263a.c(str, sectionsConfig.getFactoid().getCommonFactoid().getSectionTitleHint(), sectionsConfig.getFactoid().getCommonFactoid().getSectionTitleLimit(), factoidSection.f153559e));
                    UniversalWidgetSectionModel.FactoidItemsCountType factoidItemsCountType = UniversalWidgetSectionModel.FactoidItemsCountType.f153553b;
                    String threeItemsCountName = sectionsConfig.getFactoid().getCommonFactoid().getThreeItemsCountName();
                    if (threeItemsCountName == null) {
                        threeItemsCountName = "";
                    }
                    InterfaceC41263a.e eVar = new InterfaceC41263a.e(factoidItemsCountType, threeItemsCountName, null);
                    UniversalWidgetSectionModel.FactoidItemsCountType factoidItemsCountType2 = UniversalWidgetSectionModel.FactoidItemsCountType.f153554c;
                    String fourItemsCountName = sectionsConfig.getFactoid().getCommonFactoid().getFourItemsCountName();
                    listU = C42745f0.U(c11370b, new InterfaceC41264b.C11370b(n.a(factoidSection.f153557c, C42745f0.U(eVar, new InterfaceC41263a.e(factoidItemsCountType2, fourItemsCountName != null ? fourItemsCountName : "", null)))));
                } else if (section instanceof UniversalWidgetSectionModel.TextSection) {
                    UniversalWidgetSectionModel.TextTitlePosition textTitlePosition = ((UniversalWidgetSectionModel.TextSection) section).f153627c;
                    if (textTitlePosition == null) {
                        textTitlePosition = UniversalWidgetSectionModel.TextTitlePosition.f153630b;
                    }
                    List listU2 = C42745f0.U(new InterfaceC41263a.b(UniversalWidgetSectionModel.TextTitlePosition.f153631c, sectionsConfig.getText().getFullWidth().getTextPositionLeft(), R.drawable.ic_text_section_title_left), new InterfaceC41263a.b(UniversalWidgetSectionModel.TextTitlePosition.f153632d, sectionsConfig.getText().getFullWidth().getTextPositionRight(), R.drawable.ic_text_section_title_right), new InterfaceC41263a.b(UniversalWidgetSectionModel.TextTitlePosition.f153630b, sectionsConfig.getText().getFullWidth().getTextPositionUp(), R.drawable.ic_text_section_title_up));
                    String textPositionSelectorTitle = sectionsConfig.getText().getFullWidth().getTextPositionSelectorTitle();
                    Iterator it = listU2.iterator();
                    int i12 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i12 = -1;
                            break;
                        }
                        if (((InterfaceC41263a.b) it.next()).f398421a.equals(textTitlePosition)) {
                            break;
                        }
                        i12++;
                    }
                    if (i12 == -1) {
                        i12 = 0;
                    }
                    listU = Collections.singletonList(new InterfaceC41264b.C11370b(new InterfaceC41263a.C11369a(i12, textPositionSelectorTitle, listU2)));
                } else {
                    if (!(section instanceof UniversalWidgetSectionModel.ImageWithTextSection)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    UniversalWidgetSectionModel.ImageWithTextSection imageWithTextSection = (UniversalWidgetSectionModel.ImageWithTextSection) section;
                    int iOrdinal = imageWithTextSection.f153590c.ordinal();
                    UniversalWidgetSectionModel.TextPosition textPosition = imageWithTextSection.f153592e;
                    String str2 = imageWithTextSection.f153595h;
                    String str3 = imageWithTextSection.f153594g;
                    if (iOrdinal == 0) {
                        listU = C42745f0.U(new InterfaceC41264b.C11370b(new InterfaceC41263a.c(str3 != null ? str3 : "", sectionsConfig.getImageWithText().getFullWidth().getSectionTitleHint(), sectionsConfig.getImageWithText().getFullWidth().getSectionTitleLimit(), str2)), new InterfaceC41264b.C11370b(n.a(textPosition, C42745f0.U(new InterfaceC41263a.e(UniversalWidgetSectionModel.TextPosition.f153619b, sectionsConfig.getImageWithText().getFullWidth().getTextPositionIn(), Integer.valueOf(R.drawable.ic_text_inside)), new InterfaceC41263a.e(UniversalWidgetSectionModel.TextPosition.f153620c, sectionsConfig.getImageWithText().getFullWidth().getTextPositionOut(), Integer.valueOf(R.drawable.ic_text_outside))))));
                    } else if (iOrdinal != 1) {
                        Resources resources = nVar.f153960a;
                        UniversalWidgetSectionModel.ImageWithTextImageRatio imageWithTextImageRatio = imageWithTextSection.f153591d;
                        if (iOrdinal == 2) {
                            if (str3 == null) {
                                str3 = "";
                            }
                            listU = C42745f0.U(new InterfaceC41264b.C11370b(new InterfaceC41263a.c(str3, sectionsConfig.getImageWithText().getTwoColumns().getSectionTitleHint(), sectionsConfig.getImageWithText().getTwoColumns().getSectionTitleLimit(), str2)), new InterfaceC41264b.a(n.a(textPosition, C42745f0.U(new InterfaceC41263a.e(UniversalWidgetSectionModel.TextPosition.f153619b, "", Integer.valueOf(R.drawable.ic_text_inside)), new InterfaceC41263a.e(UniversalWidgetSectionModel.TextPosition.f153620c, "", Integer.valueOf(R.drawable.ic_text_outside)))), n.a(imageWithTextImageRatio, C42745f0.U(new InterfaceC41263a.e(UniversalWidgetSectionModel.ImageWithTextImageRatio.f153585c, resources.getString(R.string.extended_profile_settings_universal_widget_image_ratio_4_3), null, 4, null), new InterfaceC41263a.e(UniversalWidgetSectionModel.ImageWithTextImageRatio.f153584b, resources.getString(R.string.extended_profile_settings_universal_widget_image_ratio_1_1), null, 4, null)))));
                        } else if (iOrdinal == 3) {
                            if (str3 == null) {
                                str3 = "";
                            }
                            listU = C42745f0.U(new InterfaceC41264b.C11370b(new InterfaceC41263a.c(str3, sectionsConfig.getImageWithText().getThreeColumns().getSectionTitleHint(), sectionsConfig.getImageWithText().getThreeColumns().getSectionTitleLimit(), str2)), new InterfaceC41264b.a(n.a(textPosition, C42745f0.U(new InterfaceC41263a.e(UniversalWidgetSectionModel.TextPosition.f153619b, "", Integer.valueOf(R.drawable.ic_text_inside)), new InterfaceC41263a.e(UniversalWidgetSectionModel.TextPosition.f153620c, "", Integer.valueOf(R.drawable.ic_text_outside)))), n.a(imageWithTextImageRatio, C42745f0.U(new InterfaceC41263a.e(UniversalWidgetSectionModel.ImageWithTextImageRatio.f153585c, resources.getString(R.string.extended_profile_settings_universal_widget_image_ratio_4_3), null, 4, null), new InterfaceC41263a.e(UniversalWidgetSectionModel.ImageWithTextImageRatio.f153584b, resources.getString(R.string.extended_profile_settings_universal_widget_image_ratio_1_1), null, 4, null), new InterfaceC41263a.e(UniversalWidgetSectionModel.ImageWithTextImageRatio.f153586d, resources.getString(R.string.extended_profile_settings_universal_widget_image_ratio_3_4), null, 4, null)))));
                        } else {
                            if (iOrdinal != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (str3 == null) {
                                str3 = "";
                            }
                            listU = C42745f0.U(new InterfaceC41264b.C11370b(new InterfaceC41263a.c(str3, sectionsConfig.getImageWithText().getFourColumns().getSectionTitleHint(), sectionsConfig.getImageWithText().getFourColumns().getSectionTitleLimit(), str2)), new InterfaceC41264b.a(n.a(textPosition, C42745f0.U(new InterfaceC41263a.e(UniversalWidgetSectionModel.TextPosition.f153619b, "", Integer.valueOf(R.drawable.ic_text_inside)), new InterfaceC41263a.e(UniversalWidgetSectionModel.TextPosition.f153620c, "", Integer.valueOf(R.drawable.ic_text_outside)))), n.a(imageWithTextImageRatio, C42745f0.U(new InterfaceC41263a.e(UniversalWidgetSectionModel.ImageWithTextImageRatio.f153584b, resources.getString(R.string.extended_profile_settings_universal_widget_image_ratio_1_1), null, 4, null), new InterfaceC41263a.e(UniversalWidgetSectionModel.ImageWithTextImageRatio.f153586d, resources.getString(R.string.extended_profile_settings_universal_widget_image_ratio_3_4), null, 4, null)))));
                        }
                    } else {
                        UniversalWidgetSectionModel.TextPositionImageWithText textPositionImageWithText = imageWithTextSection.f153593f;
                        if (textPositionImageWithText == null) {
                            textPositionImageWithText = UniversalWidgetSectionModel.TextPositionImageWithText.f153623b;
                        }
                        listU = Collections.singletonList(new InterfaceC41264b.C11370b(n.a(textPositionImageWithText, C42745f0.U(new InterfaceC41263a.e(UniversalWidgetSectionModel.TextPositionImageWithText.f153623b, sectionsConfig.getImageWithText().getImgWithText().getImageLeftShort(), Integer.valueOf(R.drawable.ic_img_with_text_img_start)), new InterfaceC41263a.e(UniversalWidgetSectionModel.TextPositionImageWithText.f153624c, sectionsConfig.getImageWithText().getImgWithText().getImageRightShort(), Integer.valueOf(R.drawable.ic_img_with_text_text_start))))));
                    }
                }
                LinearLayout linearLayout = gVar.f153839l;
                linearLayout.removeAllViews();
                ArrayList arrayList = gVar.f153841n;
                arrayList.clear();
                int i13 = 0;
                for (Object obj : listU) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    InterfaceC41264b interfaceC41264b = (InterfaceC41264b) obj;
                    if (interfaceC41264b instanceof InterfaceC41264b.C11370b) {
                        InterfaceC41264b.C11370b c11370b2 = (InterfaceC41264b.C11370b) interfaceC41264b;
                        viewGroupB = gVar.b(c11370b2.f398435a);
                        viewGroupB.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        arrayList.add(new Q(c11370b2.f398435a, viewGroupB));
                    } else {
                        if (!(interfaceC41264b instanceof InterfaceC41264b.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        InterfaceC41264b.a aVar = (InterfaceC41264b.a) interfaceC41264b;
                        ViewGroup viewGroupB2 = gVar.b(aVar.f398433a);
                        viewGroupB2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 1.0f));
                        D6.c(viewGroupB2, null, null, Integer.valueOf(y6.b(2)), null, 11);
                        arrayList.add(new Q(aVar.f398433a, viewGroupB2));
                        InterfaceC41263a.d dVar3 = aVar.f398434b;
                        ViewGroup viewGroupB3 = gVar.b(dVar3);
                        viewGroupB3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 1.0f));
                        D6.c(viewGroupB3, Integer.valueOf(y6.b(2)), null, null, null, 14);
                        arrayList.add(new Q(dVar3, viewGroupB3));
                        LinearLayout linearLayout2 = new LinearLayout(gVar.f153828a.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        linearLayout2.addView(viewGroupB2);
                        linearLayout2.addView(viewGroupB3);
                        viewGroupB = linearLayout2;
                    }
                    if (i13 > 0) {
                        D6.c(viewGroupB, null, Integer.valueOf(y6.b(8)), null, null, 13);
                    }
                    linearLayout.addView(viewGroupB);
                    i13 = i14;
                }
                gVar.f153844q = true;
            }
            D6.G(gVar.f153834g, dVar2.f405501b);
            NavBar.e(gVar.f153833f, dVar2.f405502c, R.attr.textH50, 4);
            UniversalWidgetBlockView universalWidgetBlockView = gVar.f153835h;
            UniversalWidgetBlockView.UniversalWidgetBlockState universalWidgetBlockState = dVar2.f405505f;
            if (universalWidgetBlockState != null) {
                universalWidgetBlockView.g(universalWidgetBlockState);
                D6.H(universalWidgetBlockView);
            } else {
                D6.w(universalWidgetBlockView);
            }
            UniversalWidgetBlockView universalWidgetBlockView2 = gVar.f153836i;
            UniversalWidgetBlockView.UniversalWidgetBlockState universalWidgetBlockState2 = dVar2.f405506g;
            if (universalWidgetBlockState2 != null) {
                universalWidgetBlockView2.g(universalWidgetBlockState2);
                D6.H(universalWidgetBlockView2);
            } else {
                D6.w(universalWidgetBlockView2);
            }
            UniversalWidgetBlockView universalWidgetBlockView3 = gVar.f153837j;
            UniversalWidgetBlockView.UniversalWidgetBlockState universalWidgetBlockState3 = dVar2.f405507h;
            if (universalWidgetBlockState3 != null) {
                universalWidgetBlockView3.g(universalWidgetBlockState3);
                D6.H(universalWidgetBlockView3);
            } else {
                D6.w(universalWidgetBlockView3);
            }
            UniversalWidgetFourBlocksView universalWidgetFourBlocksView = gVar.f153838k;
            UniversalWidgetFourBlocksView.UniversalWidgetFourBlocksState universalWidgetFourBlocksState = dVar2.f405508i;
            if (universalWidgetFourBlocksState != null) {
                universalWidgetFourBlocksView.a(universalWidgetFourBlocksState);
                D6.H(universalWidgetFourBlocksView);
            } else {
                D6.w(universalWidgetFourBlocksView);
            }
            com.avito.android.extended_profile_ui_components.d dVar4 = gVar.f153842o;
            ActionsBottomMenuData<InterfaceC42227a> actionsBottomMenuData = dVar2.f405509j;
            if (actionsBottomMenuData != null) {
                dVar4.c(actionsBottomMenuData);
            } else {
                dVar4.a();
            }
            ImageView imageView = gVar.f153843p;
            if (universalWidgetEditArguments.f153658h) {
                D6.w(imageView);
            } else {
                D6.H(imageView);
                UniversalWidget.UniversalWidgetSectionVisibilityStatus universalWidgetSectionVisibilityStatus = universalWidgetEditArguments.f153656f;
                imageView.setImageResource(universalWidgetSectionVisibilityStatus.getRequiredFilling() ? R.drawable.ic_visibility_requires_filling : !universalWidgetSectionVisibilityStatus.getCanChangeVisibility() ? R.drawable.ic_universal_widget_invisible_blocked : dVar2.f405504e ? R.drawable.ic_universal_widget_edit_visible_24 : R.drawable.ic_universal_widget_edit_invisible_24);
                imageView.setOnClickListener(new com.avito.android.extended_profile_universal_widget_edit.edit.f(gVar, 5));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: UniversalWidgetEditFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<InterfaceC42227a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC42227a interfaceC42227a) {
            ((com.avito.android.extended_profile_universal_widget_edit.edit.l) this.receiver).accept(interfaceC42227a);
            return G0.f406611a;
        }
    }

    /* compiled from: UniversalWidgetEditFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LjB/a;", "it", "Lkotlin/G0;", "invoke", "(LjB/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<InterfaceC42227a, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC42227a interfaceC42227a) {
            a aVar = UniversalWidgetEditFragment.f153776u0;
            ((com.avito.android.extended_profile_universal_widget_edit.edit.l) UniversalWidgetEditFragment.this.f153778o0.getValue()).accept(interfaceC42227a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f153787l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f153787l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f153787l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<Fragment> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return UniversalWidgetEditFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f153789l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f153789l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f153789l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f153790l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f153790l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f153790l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f153791l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f153791l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f153791l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: UniversalWidgetEditFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/edit/l;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/extended_profile_universal_widget_edit/edit/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<com.avito.android.extended_profile_universal_widget_edit.edit.l> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.extended_profile_universal_widget_edit.edit.l invoke() {
            m mVar = UniversalWidgetEditFragment.this.f153777n0;
            if (mVar == null) {
                mVar = null;
            }
            return (com.avito.android.extended_profile_universal_widget_edit.edit.l) mVar.get();
        }
    }

    public UniversalWidgetEditFragment() {
        super(0, 1, null);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f153778o0 = new O0(m0.f406844a.b(com.avito.android.extended_profile_universal_widget_edit.edit.l.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f153782s0 = C42727D.c(new b());
    }

    @Override // com.avito.android.ui.status_bar.a
    public final boolean S3() {
        return false;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    /* renamed from: h5 */
    public final boolean getF304598h0() {
        return false;
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        ((com.avito.android.extended_profile_universal_widget_edit.edit.l) this.f153778o0.getValue()).accept(InterfaceC42227a.h.f405463a);
        return true;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        getParentFragmentManager().p0("edit_universal_widget_block_result_key", this, new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(this, 17));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f153779p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.universal_widget_edit_fragment, viewGroup, false);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f153779p0;
        ScreenPerformanceTracker screenPerformanceTracker3 = screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null;
        UniversalWidgetEditArguments universalWidgetEditArguments = (UniversalWidgetEditArguments) this.f153782s0.getValue();
        O0 o02 = this.f153778o0;
        e eVar = new e(1, (com.avito.android.extended_profile_universal_widget_edit.edit.l) o02.getValue(), com.avito.android.extended_profile_universal_widget_edit.edit.l.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        n nVar = this.f153780q0;
        n nVar2 = nVar != null ? nVar : null;
        com.avito.android.util.text.a aVar = this.f153781r0;
        com.avito.android.extended_profile_universal_widget_edit.edit.g gVar = new com.avito.android.extended_profile_universal_widget_edit.edit.g(viewInflate, screenPerformanceTracker3, universalWidgetEditArguments, nVar2, aVar != null ? aVar : null, eVar);
        this.f153783t0 = gVar;
        com.avito.android.arch.mvi.android.f.a((com.avito.android.extended_profile_universal_widget_edit.edit.l) o02.getValue(), getViewLifecycleOwner(), Lifecycle.State.f46682e, new c(1, this, UniversalWidgetEditFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/extended_profile_universal_widget_edit/edit/mvi/entity/UniversalWidgetEditOneTimeEvent;)V", 0), new d(1, gVar, com.avito.android.extended_profile_universal_widget_edit.edit.g.class, "render", "render(Lcom/avito/android/extended_profile_universal_widget_edit/edit/mvi/entity/UniversalWidgetEditState;)V", 0));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f153783t0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        a.b.c(this, true);
        ScreenPerformanceTracker screenPerformanceTracker = this.f153779p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        b.a aVarA = com.avito.android.extended_profile_universal_widget_edit.edit.di.a.a();
        UniversalWidgetEditArguments universalWidgetEditArguments = (UniversalWidgetEditArguments) this.f153782s0.getValue();
        Resources resources = getResources();
        aVarA.a(universalWidgetEditArguments, new C28478k(ProfileManagementUniversalWidgetEditScreen.f153775d, s.c(this), null, 4, null), this, resources, new f(), (com.avito.android.extended_profile_universal_widget_edit.edit.di.c) C29972i.a(C29972i.b(this), com.avito.android.extended_profile_universal_widget_edit.edit.di.c.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f153779p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }
}

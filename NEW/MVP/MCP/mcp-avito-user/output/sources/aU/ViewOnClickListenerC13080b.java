package Au;

import Av0.C13088d;
import Av0.C13089e;
import B91.C;
import B91.C13119l;
import B91.p;
import B91.t;
import B91.v;
import C40.a;
import O91.n;
import O91.q;
import O91.r;
import Ob0.C14669b;
import Qa.InterfaceC14873a;
import T91.C15344b;
import VO0.b;
import Vo0.InterfaceC15701b;
import Vo0.i;
import XO0.e;
import Y41.l;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.view.N0;
import ca1.C27141g;
import ca1.C27143i;
import com.avito.android.ab_groups.p;
import com.avito.android.ab_groups.x;
import com.avito.android.beduin.common.component.attributed_text_pair.BeduinAttributedTextPairModel;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.BottomNavigationLayout;
import com.avito.android.bottom_navigation.ui.GlobalBottomNavigationLayout;
import com.avito.android.bottom_navigation.ui.RedesignBottomNavigationLayout;
import com.avito.android.deep_linking.action_select_link.ActionSelectMenu;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.floating_buy_block.FloatingBuyBlockItem;
import com.avito.android.lib.design.toggle.Checkbox;
import com.avito.android.lib.design.toggle.Toggle;
import com.avito.android.lib.design.toggle.ToggleState;
import com.avito.android.onboarding.dialog.view.preview.OnboardingPreviewItem;
import com.avito.android.photo_gallery.teaser.GalleryTeaserFragment;
import com.avito.android.profile_settings_basic.adapter.basic_info.BasicInfoItem;
import com.avito.android.rating_ui.review_text_section.RatingReviewTextSectionView;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.model_card.GalleryTeaser;
import com.avito.android.remote.model.model_card.LinkInfo;
import com.avito.android.remote.model.search.MapEntryAction;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.LinkAttribute;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.Z1;
import q3.C47189a;
import q3.h;
import ru.mts.biometry.sdk.feature.address.ui.o;
import ru.mts.biometry.sdk.feature.document.chooseDocument.searchCountry.u;
import ru.mts.biometry.sdk.feature.document.chooseDocument.ui.j;
import ru.mts.biometry.sdk.feature.documentResult.ui.a0;
import ru.mts.biometry.sdk.feature.main.ui.m;
import ru.mts.biometry.sdk.feature.passport.ui.address.f;

/* compiled from: R8$$SyntheticClass */
/* renamed from: Au.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class ViewOnClickListenerC13080b implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f668b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f669c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f670d;

    public /* synthetic */ ViewOnClickListenerC13080b(int i12, Object obj, Object obj2) {
        this.f668b = i12;
        this.f669c = obj;
        this.f670d = obj2;
    }

    /* JADX WARN: Type inference failed for: r10v21, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r10v23, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r7v18, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Resources.NotFoundException {
        int i12;
        String str;
        DeepLink deeplink;
        Object value;
        DeepLink deeplink2;
        G0 g02 = null;
        Object obj = this.f670d;
        Object obj2 = this.f669c;
        switch (this.f668b) {
            case 0:
                DialogC13081c dialogC13081c = (DialogC13081c) obj2;
                dialogC13081c.f672E.invoke(((ActionSelectMenu.Action) obj).getDeepLink());
                dialogC13081c.dismiss();
                break;
            case 1:
                ((C13089e) obj2).f686c.invoke((C13088d) obj);
                break;
            case 2:
                int i13 = RatingReviewTextSectionView.f250126i;
                ((RatingReviewTextSectionView) obj2).g();
                ((Y41.a) obj).invoke();
                break;
            case 3:
                l<C40.a, G0> lVar = ((E40.b) obj).f3744c;
                OnboardingPreviewItem onboardingPreviewItem = (OnboardingPreviewItem) obj2;
                Uri uri = onboardingPreviewItem.f209026e;
                if (uri != null) {
                    AttributedText attributedText = onboardingPreviewItem.f209025d;
                    lVar.invoke(new a.e(uri, attributedText != null ? attributedText.getText() : null));
                    g02 = G0.f406611a;
                }
                if (g02 == null) {
                    lVar.invoke(a.d.f1912a);
                    break;
                }
                break;
            case 4:
                int i14 = Checkbox.f181139r;
                Checkbox checkbox = (Checkbox) obj2;
                ToggleState state$_design_modules_components = checkbox.getCom.avito.android.remote.model.messenger.voice.VoiceInfo.STATE java.lang.String();
                ToggleState.ToggleValue toggleValue = state$_design_modules_components != null ? state$_design_modules_components.f181167e : null;
                i12 = toggleValue != null ? Checkbox.a.f181146a[toggleValue.ordinal()] : -1;
                l lVar2 = (l) obj;
                if (i12 == 1) {
                    lVar2.invoke(Boolean.FALSE);
                } else if (i12 == 2) {
                    lVar2.invoke(Boolean.TRUE);
                } else if (i12 == 3) {
                    lVar2.invoke(Boolean.FALSE);
                }
                com.avito.android.lib.design.toggle.a style$_design_modules_components = checkbox.getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String();
                if (style$_design_modules_components != null && style$_design_modules_components.f181185l) {
                    checkbox.performHapticFeedback(0);
                    break;
                }
                break;
            case 5:
                Toggle toggle = (Toggle) obj2;
                ToggleState toggleState = toggle.com.avito.android.remote.model.messenger.voice.VoiceInfo.STATE java.lang.String;
                ToggleState.ToggleValue toggleValue2 = toggleState != null ? toggleState.f181167e : null;
                i12 = toggleValue2 != null ? Toggle.b.f181162a[toggleValue2.ordinal()] : -1;
                l lVar3 = (l) obj;
                if (i12 == 1) {
                    lVar3.invoke(Boolean.FALSE);
                } else if (i12 == 2) {
                    lVar3.invoke(Boolean.TRUE);
                }
                com.avito.android.lib.design.toggle.a aVar = toggle.com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String;
                if (aVar != null && aVar.f181185l) {
                    toggle.performHapticFeedback(0);
                    break;
                }
                break;
            case 6:
                BeduinAttributedTextPairModel.AttributedTextPairIcon attributedTextPairIcon = (BeduinAttributedTextPairModel.AttributedTextPairIcon) obj;
                com.avito.android.beduin_shared.model.utils.a.a(((com.avito.android.beduin.common.component.attributed_text_pair.a) obj2).f100665e, attributedTextPairIcon != null ? attributedTextPairIcon.getActions() : null);
                break;
            case 7:
                int i15 = f.f436482i0;
                String text = ((C13119l) obj2).f1143b.f1115b.getText();
                str = text != null ? text : "";
                f fVar = new f();
                Bundle bundle = new Bundle();
                bundle.putString("previous_selected_address", str);
                fVar.setArguments(bundle);
                fVar.show(((o) obj).getParentFragmentManager(), "AddressSelectBottomSheet");
                break;
            case 8:
                ((KE.a) obj2).f9369a.invoke(((FloatingBuyBlockItem) obj).f158440e);
                break;
            case 9:
                int i16 = N91.b.f11264d;
                ((N91.c) obj2).f11268e.invoke((M91.b) obj);
                break;
            case 10:
                O91.o oVar = (O91.o) ((u) obj2).f436435i0.getValue();
                C43259k.d(N0.a(oVar), null, null, new n(oVar, null), 3);
                ((v) obj).f1181d.enableLoader();
                break;
            case 11:
                O91.o oVar2 = (O91.o) ((j) obj2).f436437i0.getValue();
                C43259k.d(N0.a(oVar2), null, null, new n(oVar2, null), 3);
                ((t) obj).f1168b.enableLoader();
                break;
            case 12:
                int i17 = q.f12067d;
                ((r) obj2).f12071e.invoke((M91.c) obj);
                break;
            case 13:
                ((C14669b) obj2).f12407c.invoke(((BasicInfoItem.AvatarAction) obj).f228595c);
                break;
            case 14:
                ((l) obj2).invoke(((AdvertAction) obj).getDeepLink());
                break;
            case 15:
                MapEntryAction mapEntryAction = (MapEntryAction) obj2;
                if (mapEntryAction != null && (deeplink = mapEntryAction.getDeeplink()) != null) {
                    ((l) obj).invoke(deeplink);
                    break;
                }
                break;
            case 16:
                ((InterfaceC14873a) obj2).d((DeepLink) obj);
                break;
            case 17:
                ((N) obj2).invoke();
                ((com.avito.android.lib.design.bottom_sheet.d) obj).r();
                break;
            case 18:
                ru.mts.biometry.sdk.feature.documentResult.ui.o oVar3 = ((a0) obj2).f436449g0;
                if (oVar3 != null) {
                    String text2 = ((C) obj).f1010d.getText();
                    str = text2 != null ? text2 : "";
                    Z1 z12 = oVar3.e5().f15493L;
                    do {
                        value = z12.getValue();
                    } while (!z12.N3(value, new C15344b(str, ((C15344b) value).f15442c, str.length() != 12)));
                    ru.mts.biometry.sdk.base.f fVar2 = oVar3.f436461k0;
                    if (fVar2 != null) {
                        fVar2.dismiss();
                        break;
                    }
                }
                break;
            case 19:
                GalleryTeaserFragment.a aVar2 = GalleryTeaserFragment.f217659p0;
                LinkInfo button = ((GalleryTeaser) obj2).getButton();
                if (button != null && (deeplink2 = button.getDeeplink()) != null) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar3 = ((GalleryTeaserFragment) obj).f217662o0;
                    if (aVar3 == null) {
                        aVar3 = null;
                    }
                    b.a.a(aVar3, deeplink2, null, null, 6);
                    break;
                }
                break;
            case 20:
                ((i) obj2).f17398b.invoke((InterfaceC15701b) obj);
                break;
            case 21:
                kotlin.reflect.n[] nVarArr = m.f436474l0;
                ((p) obj2).f1157e.enableLoader();
                kotlin.reflect.n nVar = m.f436474l0[0];
                m mVar = (m) obj;
                X91.o oVar4 = (X91.o) mVar.f436478j0.a(mVar);
                C43259k.d(N0.a(oVar4), null, null, new X91.n(oVar4, null), 3);
                break;
            case 22:
                ((e) obj2).f18875c.invoke((b.d) obj);
                break;
            case 23:
                Xj.c cVar = ((BottomNavigationLayout) obj2).f107089r;
                if (cVar != null) {
                    cVar.a((NavigationTabSetItem) obj);
                    break;
                }
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                Xj.c cVar2 = ((GlobalBottomNavigationLayout) obj2).f107096r;
                if (cVar2 != null) {
                    cVar2.a((NavigationTabSetItem) obj);
                    break;
                }
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Xj.c cVar3 = ((RedesignBottomNavigationLayout) obj2).f107107r;
                if (cVar3 != null) {
                    cVar3.a((NavigationTabSetItem) obj);
                    break;
                }
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Y41.r) obj2).invoke(kotlin.c.d(((LinkAttribute) obj).getUrl()), null, null, null);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int i18 = C27141g.f57943d;
                ((C27143i) obj2).f57947e.invoke((I91.d) obj);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int i19 = p.a.f67671e;
                ((l) obj2).invoke((C47189a) obj);
                break;
            default:
                int i22 = x.a.f67699c;
                ((l) obj2).invoke((h) obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ViewOnClickListenerC13080b(Y41.a aVar, com.avito.android.lib.design.bottom_sheet.d dVar) {
        this.f668b = 17;
        this.f669c = (N) aVar;
        this.f670d = dVar;
    }
}

package L91;

import BI0.a;
import Cw.InterfaceC13362a;
import Gy0.InterfaceC13931a;
import Hf.InterfaceC13983a;
import J70.a;
import ME.a;
import Nf.InterfaceC14568a;
import OE.a;
import Pf.InterfaceC14780a;
import Q30.a;
import Qb0.InterfaceC14878a;
import Rf.InterfaceC15035a;
import Uf.InterfaceC15514a;
import Uo0.e;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.camera.view.PreviewView;
import androidx.core.app.C22744b;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.view.O0;
import androidx.view.dynamicfeatures.fragment.ui.AbstractProgressFragment;
import androidx.view.dynamicfeatures.fragment.ui.DefaultProgressFragment;
import androidx.view.result.ActivityResult;
import bh.InterfaceC25648a;
import ch.InterfaceC27193a;
import com.avito.android.R;
import com.avito.android.autoteka.presentation.choosingPurchase.AutotekaChoosingPurchaseActivity;
import com.avito.android.autoteka.presentation.choosingPurchase.AutotekaFullscreenChoosingPurchaseActivity;
import com.avito.android.autoteka.presentation.payment.AutotekaPaymentActivity;
import com.avito.android.autoteka.presentation.report.AutotekaReportActivity;
import com.avito.android.autoteka.presentation.reportGeneration.AutotekaReportGenerationActivity;
import com.avito.android.autoteka.presentation.waitingForPayment.AutotekaWaitingForPaymentActivity;
import com.avito.android.barcode_scanner_impl.presentation.barcodescanner.BarcodeScannerFragment;
import com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.entity.PermissionDenialType;
import com.avito.android.beduin.common.component.photo_picker.C28795a;
import com.avito.android.beduin.common.component.select_calendar.BeduinSelectCalendarModel;
import com.avito.android.beduin.common.component.select_calendar.a;
import com.avito.android.beduin.common.component.select_calendar.e;
import com.avito.android.code_confirmation.code_confirmation.CodeConfirmationActivity;
import com.avito.android.code_confirmation.code_confirmation.CodeConfirmationPresenter;
import com.avito.android.developments_agency_search.screen.deal_room.DealRoomFragment;
import com.avito.android.edit_basic_info.u;
import com.avito.android.forceupdate.screens.forceupdaterequired.ForceUpdateRequiredActivity;
import com.avito.android.forceupdate.screens.forceupdateroot.ForceUpdateRootActivity;
import com.avito.android.notifications_permission.presentation.NotificationPermissionInfoDialogActivity;
import com.avito.android.permissions.H;
import com.avito.android.permissions.t;
import com.avito.android.photo_gallery.PhotoGalleryActivity;
import com.avito.android.profile_settings_basic.C;
import com.avito.android.profile_settings_basic.K;
import com.avito.android.rating.details.RatingDetailsFragment;
import com.avito.android.rating.details.answer.photo.RatingAddAnswerPhotoFragment;
import com.avito.android.rating.details.answer.upload.ReviewReplyState;
import com.avito.android.rating.details.mvi.entity.a;
import com.avito.android.recall_me.presentation.RecallMeFragment;
import com.avito.android.safety.safety_settings.SafetySettingsFragment;
import com.avito.android.safety.safety_settings.mvi.entity.a;
import com.avito.android.sbc.create.mvi.CreateDiscountDispatchFragment;
import com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment;
import com.avito.android.user_adverts.root_screen.adverts_host.C35564b;
import com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.F;
import com.avito.android.user_adverts_filters.host.d;
import com.avito.android.util.L5;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import kotlin.G0;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlinx.coroutines.channels.I0;
import ky.InterfaceC43512a;
import lj.d;
import zI0.InterfaceC50474d;
import zi0.InterfaceC50571a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class o implements androidx.view.result.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9839b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9840c;

    public /* synthetic */ o(Object obj, int i12) {
        this.f9839b = i12;
        this.f9840c = obj;
    }

    @Override // androidx.view.result.a
    public final void a(Object obj) throws ExecutionException, InterruptedException {
        String str;
        String strO;
        List listG0;
        LocalDate localDate;
        Intent intent;
        String stringExtra;
        Object obj2 = this.f9840c;
        switch (this.f9839b) {
            case 0:
                kotlin.reflect.n[] nVarArr = ru.mts.biometry.sdk.feature.document.camera.ui.n.f436424m0;
                if (!((Boolean) obj).booleanValue()) {
                    z91.s sVar = z91.e.f443908b;
                    if (sVar == null) {
                        throw new IllegalArgumentException("DI delegate is null");
                    }
                    Aa1.b.a(sVar.b(), A91.q.a());
                    return;
                }
                ru.mts.biometry.sdk.feature.document.camera.ui.n nVar = (ru.mts.biometry.sdk.feature.document.camera.ui.n) obj2;
                B91.z zVar = (B91.z) nVar.f436376g0;
                if (zVar != null) {
                    WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                    PreviewView previewView = zVar.f1204g;
                    if (!previewView.isLaidOut() || previewView.isLayoutRequested()) {
                        previewView.addOnLayoutChangeListener(new m(nVar, zVar));
                        return;
                    }
                    ((Ba1.o) nVar.f436427j0.getValue()).c(nVar.getViewLifecycleOwner(), previewView, nVar.e5());
                    z zVarF5 = nVar.f5();
                    zVarF5.f9862L = new r(zVarF5.f9862L.f9845a, C42784z0.f406748b);
                    zVarF5.f9865O.setValue(s.f9847a);
                    return;
                }
                return;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    InterfaceC50474d.a.a((InterfaceC50474d) ((C35564b) obj2).get(), false, false, null, null, false, null, 1523);
                    return;
                }
                return;
            case 2:
                d.b bVar = (d.b) obj;
                if (!(bVar instanceof d.b.a)) {
                    boolean z12 = bVar instanceof d.b.C9797b;
                    return;
                } else {
                    d.b.a aVar = (d.b.a) bVar;
                    ((F) ((C35564b) obj2).get()).accept(new a.C0050a(aVar.f315960a, aVar.f315961b));
                    return;
                }
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    ((InterfaceC50474d) ((C35564b) obj2).get()).p0();
                    return;
                }
                return;
            case 4:
                DefaultProgressFragment defaultProgressFragment = (DefaultProgressFragment) obj2;
                int i12 = AbstractProgressFragment.f53061k0;
                if (((ActivityResult) obj).f21242b == 0) {
                    defaultProgressFragment.c5();
                    return;
                }
                return;
            case 5:
                AbstractProgressFragment abstractProgressFragment = (AbstractProgressFragment) obj2;
                int i13 = AbstractProgressFragment.f53061k0;
                if (((ActivityResult) obj).f21242b == 0) {
                    abstractProgressFragment.c5();
                    return;
                }
                return;
            case 6:
                int i14 = ((ActivityResult) obj).f21242b;
                I0 i02 = (I0) obj2;
                if (i14 == 102) {
                    i02.w(G0.f406611a);
                    i02.h(null);
                    return;
                }
                switch (i14) {
                    case UpdateStatusCode.DialogButton.CONFIRM /* 101 */:
                        str = "The app has not been released on AppGallery";
                        break;
                    case 102:
                    default:
                        str = "Unknown error";
                        break;
                    case 103:
                        str = "Comment submitted";
                        break;
                    case 104:
                        str = "The HUAWEI ID sign-in status is invalid";
                        break;
                    case 105:
                        str = "The user does not meet the conditions for displaying the comment pop-up";
                        break;
                    case 106:
                        str = "The commenting function is disabled";
                        break;
                    case 107:
                        str = "The in-app commenting service is not supported. (Apps released in the Chinese mainland do not support this service";
                        break;
                    case 108:
                        str = "The user canceled the comment";
                        break;
                }
                i02.h(new Exception(str));
                return;
            case 7:
                int i15 = AutotekaChoosingPurchaseActivity.f97072x;
                if (((ActivityResult) obj).f21242b == -1) {
                    ((com.avito.android.autoteka.presentation.choosingPurchase.mvi.q) ((AutotekaChoosingPurchaseActivity) obj2).f97074n.getValue()).accept(new InterfaceC13983a.i(false));
                    return;
                }
                return;
            case 8:
                int i16 = AutotekaFullscreenChoosingPurchaseActivity.f97091y;
                if (((ActivityResult) obj).f21242b == -1) {
                    ((com.avito.android.autoteka.presentation.choosingPurchase.mvi.q) ((AutotekaFullscreenChoosingPurchaseActivity) obj2).f97093n.getValue()).accept(new InterfaceC13983a.i(false));
                    return;
                }
                return;
            case 9:
                AutotekaPaymentActivity.a aVar2 = AutotekaPaymentActivity.f97386y;
                if (((ActivityResult) obj).f21242b == -1) {
                    ((AutotekaPaymentActivity) obj2).b2().accept(new InterfaceC14568a.h(false));
                    return;
                }
                return;
            case 10:
                int i17 = AutotekaReportActivity.f97671y;
                if (((ActivityResult) obj).f21242b == -1) {
                    ((com.avito.android.autoteka.presentation.report.e) ((AutotekaReportActivity) obj2).f97673n.getValue()).accept(new InterfaceC14780a.c(false));
                    return;
                }
                return;
            case 11:
                int i18 = AutotekaReportGenerationActivity.f97756t;
                if (((ActivityResult) obj).f21242b == -1) {
                    ((com.avito.android.autoteka.presentation.reportGeneration.d) ((AutotekaReportGenerationActivity) obj2).f97758n.getValue()).accept(new InterfaceC15035a.c(false));
                    return;
                }
                return;
            case 12:
                int i19 = AutotekaWaitingForPaymentActivity.f97837u;
                if (((ActivityResult) obj).f21242b == -1) {
                    ((com.avito.android.autoteka.presentation.waitingForPayment.c) ((AutotekaWaitingForPaymentActivity) obj2).f97839n.getValue()).accept(new InterfaceC15514a.c(false));
                    return;
                }
                return;
            case 13:
                BarcodeScannerFragment.a aVar3 = BarcodeScannerFragment.f98915I0;
                BarcodeScannerFragment barcodeScannerFragment = (BarcodeScannerFragment) obj2;
                if (((Boolean) obj).booleanValue()) {
                    barcodeScannerFragment.q5().accept(InterfaceC25648a.d.f57371a);
                    return;
                }
                InterfaceC27193a interfaceC27193a = barcodeScannerFragment.f98928q0;
                (interfaceC27193a != null ? interfaceC27193a : null).getClass();
                if (barcodeScannerFragment.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                    barcodeScannerFragment.q5().accept(new InterfaceC25648a.c(PermissionDenialType.f98997b));
                    return;
                } else {
                    barcodeScannerFragment.q5().accept(new InterfaceC25648a.c(PermissionDenialType.f98998c));
                    return;
                }
            case 14:
                C28795a c28795a = (C28795a) obj2;
                c28795a.f101950j.d(c28795a.f101947g.getF103350r(), c28795a.f101951k.getId());
                return;
            case 15:
                e.b bVar2 = (e.b) obj;
                int i22 = com.avito.android.beduin.common.component.select_calendar.a.f102436i;
                if ((bVar2 instanceof e.b.a) || !(bVar2 instanceof e.b.C3069b)) {
                    return;
                }
                List<LocalDate> list = ((e.b.C3069b) bVar2).f102459a;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                Iterator<T> it = list.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    com.avito.android.beduin.common.component.select_calendar.a aVar4 = (com.avito.android.beduin.common.component.select_calendar.a) obj2;
                    BeduinSelectCalendarModel beduinSelectCalendarModel = aVar4.f102437e;
                    if (!zHasNext) {
                        if (arrayList.isEmpty()) {
                            strO = "";
                        } else {
                            BeduinSelectCalendarModel.BeduinCalendarSelectionType selectionType = beduinSelectCalendarModel.getSelectionType();
                            int i23 = selectionType != null ? a.c.f102444a[selectionType.ordinal()] : -1;
                            if (i23 == 1) {
                                strO = C42745f0.O(arrayList, ", ", null, null, null, 62);
                            } else if (i23 != 2) {
                                strO = (String) C42745f0.E(arrayList);
                            } else {
                                strO = ((String) C42745f0.E(arrayList)) + " - " + ((String) C42745f0.Q(arrayList));
                            }
                        }
                        String str2 = strO;
                        ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
                        for (LocalDate localDate2 : list) {
                            BeduinSelectCalendarModel.INSTANCE.getClass();
                            arrayList2.add(BeduinSelectCalendarModel.Companion.a(localDate2, BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT));
                        }
                        aVar4.f102438f.h(new d.h(beduinSelectCalendarModel, BeduinSelectCalendarModel.copy$default(aVar4.f102437e, null, null, null, str2, arrayList2, null, null, null, null, null, null, null, null, null, 16103, null)));
                        return;
                    }
                    LocalDate localDate3 = (LocalDate) it.next();
                    BeduinSelectCalendarModel.Companion companion = BeduinSelectCalendarModel.INSTANCE;
                    String dateFormat = beduinSelectCalendarModel.getDateFormat();
                    if (dateFormat == null) {
                        dateFormat = "dd.MM.YYYY";
                    }
                    companion.getClass();
                    arrayList.add(BeduinSelectCalendarModel.Companion.a(localDate3, dateFormat));
                }
                break;
            case 16:
                int i24 = CodeConfirmationActivity.f119396u;
                if (((Boolean) obj).booleanValue()) {
                    CodeConfirmationPresenter codeConfirmationPresenter = ((CodeConfirmationActivity) obj2).f119397m;
                    (codeConfirmationPresenter != null ? codeConfirmationPresenter : null).e();
                    return;
                }
                return;
            case 17:
                Uri uri = (Uri) obj;
                DealRoomFragment.a aVar5 = DealRoomFragment.f137222z0;
                if (uri == null) {
                    return;
                }
                DealRoomFragment dealRoomFragment = (DealRoomFragment) obj2;
                String str3 = dealRoomFragment.q5().getState().getValue().f2782e;
                if (str3 == null) {
                    return;
                }
                dealRoomFragment.q5().accept(new InterfaceC13362a.i(uri, str3));
                return;
            case 18:
                u.a aVar6 = (u.a) obj;
                if (aVar6 != null) {
                    ((com.avito.android.edit_basic_info.c) obj2).f146037c.invoke(new InterfaceC43512a.C11765a(aVar6.f146205a));
                    return;
                }
                return;
            case 19:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ForceUpdateRequiredActivity.a aVar7 = ForceUpdateRequiredActivity.f158468w;
                ForceUpdateRequiredActivity forceUpdateRequiredActivity = (ForceUpdateRequiredActivity) obj2;
                O0 o02 = forceUpdateRequiredActivity.f158470n;
                if (zBooleanValue) {
                    ((com.avito.android.forceupdate.screens.forceupdaterequired.c) o02.getValue()).accept(a.d.f10485a);
                    return;
                }
                com.avito.android.permissions.t.f215141z.getClass();
                if (!C22744b.b(forceUpdateRequiredActivity, t.a.f215143b)) {
                    H h12 = forceUpdateRequiredActivity.f158476t;
                    (h12 != null ? h12 : null).e(true);
                }
                ((com.avito.android.forceupdate.screens.forceupdaterequired.c) o02.getValue()).accept(a.c.f10484a);
                return;
            case 20:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                ForceUpdateRootActivity.a aVar8 = ForceUpdateRootActivity.f158538x;
                ForceUpdateRootActivity forceUpdateRootActivity = (ForceUpdateRootActivity) obj2;
                if (zBooleanValue2) {
                    forceUpdateRootActivity.a2().accept(a.d.f12081a);
                    return;
                }
                com.avito.android.permissions.t.f215141z.getClass();
                if (!C22744b.b(forceUpdateRootActivity, t.a.f215143b)) {
                    H h13 = forceUpdateRootActivity.f158547u;
                    (h13 != null ? h13 : null).e(true);
                }
                forceUpdateRootActivity.a2().accept(a.c.f12080a);
                return;
            case 21:
                Boolean bool = (Boolean) obj;
                int i25 = NotificationPermissionInfoDialogActivity.f207841s;
                NotificationPermissionInfoDialogActivity notificationPermissionInfoDialogActivity = (NotificationPermissionInfoDialogActivity) obj2;
                notificationPermissionInfoDialogActivity.a2().accept(new a.c(bool.booleanValue()));
                if (bool.booleanValue() || C22744b.b(notificationPermissionInfoDialogActivity, "android.permission.POST_NOTIFICATIONS")) {
                    return;
                }
                H h14 = notificationPermissionInfoDialogActivity.f207845p;
                (h14 != null ? h14 : null).f215102a.putBoolean("was_notification_permission_forever_denied", true);
                return;
            case 22:
                int i26 = PhotoGalleryActivity.f216648B;
                PhotoGalleryActivity photoGalleryActivity = (PhotoGalleryActivity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    L5.a(photoGalleryActivity, R.string.photo_download_photo_download_permission_denied, 0);
                    return;
                }
                String str4 = photoGalleryActivity.f216662y;
                if (str4 != null) {
                    ((com.avito.android.photo_download.feature.mvi.j) photoGalleryActivity.f216657t.getValue()).accept(new a.C0506a(str4));
                    return;
                }
                return;
            case 23:
                K.b bVar3 = (K.b) obj;
                if (bVar3 != null) {
                    ((C) obj2).f228536d.invoke(new InterfaceC14878a.b(bVar3.f228571a));
                    return;
                }
                return;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                ReviewReplyState.Result result = (ReviewReplyState.Result) obj;
                RatingDetailsFragment.C34165a c34165a = RatingDetailsFragment.f246422S0;
                if (result != null) {
                    ((RatingDetailsFragment) obj2).E5().accept(new a.C7421a(result));
                    return;
                }
                return;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Integer num = (Integer) obj;
                com.avito.android.photo_list_view.s sVar2 = ((RatingAddAnswerPhotoFragment) obj2).f246626p0;
                (sVar2 != null ? sVar2 : null).l(num != null && num.intValue() == -1);
                return;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                String str5 = (String) obj;
                if (str5 == null) {
                    RecallMeFragment.a aVar9 = RecallMeFragment.f251899v0;
                    return;
                } else {
                    com.avito.android.recall_me.presentation.q qVar = ((RecallMeFragment) obj2).f251901n0;
                    (qVar != null ? qVar : null).m1().accept(new InterfaceC50571a.b(str5));
                    return;
                }
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                SafetySettingsFragment.a aVar10 = SafetySettingsFragment.f257523w0;
                ((SafetySettingsFragment) obj2).q5().accept(a.l.f257736a);
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ActivityResult activityResult = (ActivityResult) obj;
                CreateDiscountDispatchFragment.a aVar11 = CreateDiscountDispatchFragment.f259243G0;
                if (activityResult.f21242b == -1) {
                    Intent intent2 = activityResult.f21243c;
                    Object serializableExtra = intent2 != null ? intent2.getSerializableExtra("selectedDates") : null;
                    LocalDate[] localDateArr = serializableExtra instanceof LocalDate[] ? (LocalDate[]) serializableExtra : null;
                    if (localDateArr == null || (listG0 = C42756l.g0(localDateArr)) == null || (localDate = (LocalDate) C42745f0.E(listG0)) == null) {
                        return;
                    }
                    ((CreateDiscountDispatchFragment) obj2).q5().accept(new e.v(localDate));
                    return;
                }
                return;
            default:
                ActivityResult activityResult2 = (ActivityResult) obj;
                StrCalendarParametersFragment.a aVar12 = StrCalendarParametersFragment.f286684D0;
                if (activityResult2.f21242b != -1 || (intent = activityResult2.f21243c) == null || (stringExtra = intent.getStringExtra("newParameterTitle")) == null) {
                    return;
                }
                ((StrCalendarParametersFragment) obj2).r5().accept(new InterfaceC13931a.d(stringExtra));
                return;
        }
    }
}

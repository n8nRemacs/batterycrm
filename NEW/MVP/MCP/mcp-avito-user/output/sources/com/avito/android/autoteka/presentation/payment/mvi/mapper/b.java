package com.avito.android.autoteka.presentation.payment.mvi.mapper;

import Bj0.C13156a;
import Bj0.c;
import Bj0.d;
import Bj0.e;
import Bj0.f;
import Y61.k;
import com.avito.android.autoteka.items.payment.PaymentItem;
import com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentInternalAction;
import com.avito.android.remote.autoteka.generated.api.get_step_order_v_4.PriceDetailsV2PromocodeWidget;
import com.avito.android.remote.autoteka.model.ContestAgreement;
import com.avito.android.remote.autoteka.model.DiscountWidget;
import com.avito.android.remote.autoteka.model.EmailForm;
import com.avito.android.remote.autoteka.model.PriceDetails;
import com.avito.android.remote.autoteka.model.PriceWidget;
import com.avito.android.remote.autoteka.model.PromoCodeStatus;
import com.avito.android.remote.autoteka.model.PromoCodeWidget;
import com.avito.android.remote.autoteka.model.TotalWidget;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.autotekateaser.AutotekaPaymentInfoAnalytic;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PaymentResultToActionMapper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/payment/mvi/mapper/b;", "", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b {

    /* compiled from: PaymentResultToActionMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97502a;

        static {
            int[] iArr = new int[PriceDetailsV2PromocodeWidget.Status.values().length];
            try {
                iArr[PriceDetailsV2PromocodeWidget.Status.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PriceDetailsV2PromocodeWidget.Status.Success.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PriceDetailsV2PromocodeWidget.Status.Error.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f97502a = iArr;
        }
    }

    @k
    public static AutotekaPaymentInternalAction a(@k TypedResult typedResult) {
        AutotekaPaymentInternalAction error;
        PromoCodeWidget promoCodeWidget;
        PromoCodeStatus promoCodeStatus;
        if (typedResult instanceof TypedResult.Success) {
            c cVar = (c) ((TypedResult.Success) typedResult).getResult();
            if (cVar instanceof c.a) {
                c.a aVar = (c.a) cVar;
                if (L.f(aVar.getCode(), "previewBySearchKeyNotAvailable")) {
                    return AutotekaPaymentInternalAction.OpenPreviewSearch.f97448b;
                }
                error = new AutotekaPaymentInternalAction.Error(new ApiError.UnknownError(aVar.getCode(), null, null, 6, null));
            } else {
                if (!(cVar instanceof c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                c.b bVar = (c.b) cVar;
                String title = bVar.getTitle();
                AttributedText description = bVar.getDescription();
                Image image = bVar.getImage();
                PaymentItem.LoadingVariant loadingVariant = PaymentItem.LoadingVariant.f96850d;
                AttributedText licenseAgreement = bVar.getLicenseAgreement();
                Bj0.b emailForm = bVar.getEmailForm();
                EmailForm emailForm2 = emailForm != null ? new EmailForm(emailForm.getAlreadyRegisteredMessage()) : null;
                AutotekaPaymentInfoAnalytic autotekaPaymentInfoAnalytic = new AutotekaPaymentInfoAnalytic(bVar.getAnalytics().getSearchType().f253278b, bVar.getAnalytics().getReportCount(), bVar.getAnalytics().getTotalPrice());
                d priceDetails = bVar.getPriceDetails();
                PriceDetailsV2PromocodeWidget promocodeWidget = priceDetails.getPromocodeWidget();
                if (promocodeWidget != null) {
                    String title2 = promocodeWidget.getTitle();
                    String placeholder = promocodeWidget.getPlaceholder();
                    String promocode = promocodeWidget.getPromocode();
                    int i12 = a.f97502a[promocodeWidget.getStatus().ordinal()];
                    if (i12 == 1) {
                        promoCodeStatus = PromoCodeStatus.INITIAL;
                    } else if (i12 == 2) {
                        promoCodeStatus = PromoCodeStatus.SUCCESS;
                    } else {
                        if (i12 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        promoCodeStatus = PromoCodeStatus.ERROR;
                    }
                    promoCodeWidget = new PromoCodeWidget(title2, placeholder, promocode, promoCodeStatus, promocodeWidget.getHint());
                } else {
                    promoCodeWidget = null;
                }
                PriceWidget priceWidget = new PriceWidget(priceDetails.getPrice().getLabel(), priceDetails.getPrice().getValue());
                List<e> listA = priceDetails.a();
                ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
                for (e eVar : listA) {
                    arrayList.add(new DiscountWidget(eVar.getLabel(), eVar.getValue()));
                }
                List<f> listB = priceDetails.b();
                ArrayList arrayList2 = new ArrayList(C42745f0.q(listB, 10));
                for (f fVar : listB) {
                    arrayList2.add(new DiscountWidget(fVar.getLabel(), fVar.getValue()));
                }
                PriceDetails priceDetails2 = new PriceDetails(promoCodeWidget, priceWidget, arrayList, arrayList2, new TotalWidget(priceDetails.getTotal().getLabel(), priceDetails.getTotal().getValue(), priceDetails.getTotal().getStrikeThrough()));
                PriceDetailsV2PromocodeWidget promocodeWidget2 = bVar.getPriceDetails().getPromocodeWidget();
                String promocode2 = promocodeWidget2 != null ? promocodeWidget2.getPromocode() : null;
                if (promocode2 == null) {
                    promocode2 = "";
                }
                PriceDetailsV2PromocodeWidget promocodeWidget3 = bVar.getPriceDetails().getPromocodeWidget();
                String hint = promocodeWidget3 != null ? promocodeWidget3.getHint() : null;
                PaymentItem.PromoCodeState promoCodeState = new PaymentItem.PromoCodeState(promocode2, hint != null ? hint : "");
                Boolean isPromocodeLessProfitable = bVar.getIsPromocodeLessProfitable();
                boolean zBooleanValue = isPromocodeLessProfitable != null ? isPromocodeLessProfitable.booleanValue() : false;
                C13156a contestAgreement = bVar.getContestAgreement();
                error = new AutotekaPaymentInternalAction.Success(new PaymentItem(null, title, description, image, loadingVariant, licenseAgreement, emailForm2, autotekaPaymentInfoAnalytic, promoCodeState, priceDetails2, zBooleanValue, contestAgreement != null ? new ContestAgreement(contestAgreement.getText(), contestAgreement.getIsChecked()) : null, 1, null));
            }
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            error = new AutotekaPaymentInternalAction.Error(((TypedResult.Error) typedResult).getError());
        }
        return error;
    }
}

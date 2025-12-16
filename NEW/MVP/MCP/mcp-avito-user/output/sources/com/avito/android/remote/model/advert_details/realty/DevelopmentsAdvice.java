package com.avito.android.remote.model.advert_details.realty;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DevelopmentsAdvice.kt */
@d
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b&\u0010#J\u0012\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b'\u0010 J\u0012\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b(\u0010 J\u0012\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b)\u0010 J\u0012\u0010*\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b*\u0010+Jª\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b.\u0010 J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u00020\u00062\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020/HÖ\u0001¢\u0006\u0004\b6\u00101J \u0010;\u001a\u00020:2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020/HÖ\u0001¢\u0006\u0004\b;\u0010<R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\b@\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bB\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bC\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010D\u001a\u0004\bE\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\bF\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010G\u001a\u0004\bH\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010I\u001a\u0004\bJ\u0010%R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010G\u001a\u0004\bK\u0010#R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010D\u001a\u0004\bL\u0010 R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010D\u001a\u0004\bM\u0010 R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010D\u001a\u0004\bN\u0010 R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010O\u001a\u0004\bP\u0010+¨\u0006Q"}, d2 = {"Lcom/avito/android/remote/model/advert_details/realty/DevelopmentsAdvice;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/advert_details/realty/ConsultationAfterIceBreaker;", "consultationAfterIceBreaker", "Lcom/avito/android/remote/model/advert_details/realty/NonNdForm;", "nonNdForm", "", "shouldShowInBody", "shouldShowInContactBar", "", "requestType", "contactBarButtonTitle", "Lcom/avito/android/remote/model/advert_details/realty/DevelopmentsAdviceView;", "teaser", "Lcom/avito/android/remote/model/advert_details/realty/TeaserBanner;", "teaserBanner", "form", SearchParamsConverterKt.LOCATION_ID, "from_page", "nodeType", "Lcom/avito/android/remote/model/advert_details/realty/QiuzPromo;", "quizPromo", "<init>", "(Lcom/avito/android/remote/model/advert_details/realty/ConsultationAfterIceBreaker;Lcom/avito/android/remote/model/advert_details/realty/NonNdForm;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/advert_details/realty/DevelopmentsAdviceView;Lcom/avito/android/remote/model/advert_details/realty/TeaserBanner;Lcom/avito/android/remote/model/advert_details/realty/DevelopmentsAdviceView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/advert_details/realty/QiuzPromo;)V", "component1", "()Lcom/avito/android/remote/model/advert_details/realty/ConsultationAfterIceBreaker;", "component2", "()Lcom/avito/android/remote/model/advert_details/realty/NonNdForm;", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "()Ljava/lang/String;", "component6", "component7", "()Lcom/avito/android/remote/model/advert_details/realty/DevelopmentsAdviceView;", "component8", "()Lcom/avito/android/remote/model/advert_details/realty/TeaserBanner;", "component9", "component10", "component11", "component12", "component13", "()Lcom/avito/android/remote/model/advert_details/realty/QiuzPromo;", "copy", "(Lcom/avito/android/remote/model/advert_details/realty/ConsultationAfterIceBreaker;Lcom/avito/android/remote/model/advert_details/realty/NonNdForm;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/advert_details/realty/DevelopmentsAdviceView;Lcom/avito/android/remote/model/advert_details/realty/TeaserBanner;Lcom/avito/android/remote/model/advert_details/realty/DevelopmentsAdviceView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/advert_details/realty/QiuzPromo;)Lcom/avito/android/remote/model/advert_details/realty/DevelopmentsAdvice;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/advert_details/realty/ConsultationAfterIceBreaker;", "getConsultationAfterIceBreaker", "Lcom/avito/android/remote/model/advert_details/realty/NonNdForm;", "getNonNdForm", "Ljava/lang/Boolean;", "getShouldShowInBody", "getShouldShowInContactBar", "Ljava/lang/String;", "getRequestType", "getContactBarButtonTitle", "Lcom/avito/android/remote/model/advert_details/realty/DevelopmentsAdviceView;", "getTeaser", "Lcom/avito/android/remote/model/advert_details/realty/TeaserBanner;", "getTeaserBanner", "getForm", "getLocationId", "getFrom_page", "getNodeType", "Lcom/avito/android/remote/model/advert_details/realty/QiuzPromo;", "getQuizPromo", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DevelopmentsAdvice implements Parcelable {

    @k
    public static final Parcelable.Creator<DevelopmentsAdvice> CREATOR = new Creator();

    @c("consultationAfterIcebreaker")
    @k
    private final ConsultationAfterIceBreaker consultationAfterIceBreaker;

    @c("contactBarButtonTitle")
    @l
    private final String contactBarButtonTitle;

    @c("form")
    @l
    private final DevelopmentsAdviceView form;

    @c("from_page")
    @l
    private final String from_page;

    @c(SearchParamsConverterKt.LOCATION_ID)
    @l
    private final String locationId;

    @c("nodeType")
    @l
    private final String nodeType;

    @c("nonNdForm")
    @l
    private final NonNdForm nonNdForm;

    @c("quizPromo")
    @l
    private final QiuzPromo quizPromo;

    @c("requestType")
    @l
    private final String requestType;

    @c("shouldShowInBody")
    @l
    private final Boolean shouldShowInBody;

    @c("shouldShowInContactBar")
    @l
    private final Boolean shouldShowInContactBar;

    @c("teaser")
    @l
    private final DevelopmentsAdviceView teaser;

    @c("teaserBanner")
    @l
    private final TeaserBanner teaserBanner;

    /* compiled from: DevelopmentsAdvice.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DevelopmentsAdvice> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DevelopmentsAdvice createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            ConsultationAfterIceBreaker consultationAfterIceBreakerCreateFromParcel = ConsultationAfterIceBreaker.CREATOR.createFromParcel(parcel);
            NonNdForm nonNdFormCreateFromParcel = parcel.readInt() == 0 ? null : NonNdForm.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DevelopmentsAdvice(consultationAfterIceBreakerCreateFromParcel, nonNdFormCreateFromParcel, boolValueOf, boolValueOf2, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : DevelopmentsAdviceView.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TeaserBanner.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DevelopmentsAdviceView.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? QiuzPromo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DevelopmentsAdvice[] newArray(int i12) {
            return new DevelopmentsAdvice[i12];
        }
    }

    public DevelopmentsAdvice(@k ConsultationAfterIceBreaker consultationAfterIceBreaker, @l NonNdForm nonNdForm, @l Boolean bool, @l Boolean bool2, @l String str, @l String str2, @l DevelopmentsAdviceView developmentsAdviceView, @l TeaserBanner teaserBanner, @l DevelopmentsAdviceView developmentsAdviceView2, @l String str3, @l String str4, @l String str5, @l QiuzPromo qiuzPromo) {
        this.consultationAfterIceBreaker = consultationAfterIceBreaker;
        this.nonNdForm = nonNdForm;
        this.shouldShowInBody = bool;
        this.shouldShowInContactBar = bool2;
        this.requestType = str;
        this.contactBarButtonTitle = str2;
        this.teaser = developmentsAdviceView;
        this.teaserBanner = teaserBanner;
        this.form = developmentsAdviceView2;
        this.locationId = str3;
        this.from_page = str4;
        this.nodeType = str5;
        this.quizPromo = qiuzPromo;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final ConsultationAfterIceBreaker getConsultationAfterIceBreaker() {
        return this.consultationAfterIceBreaker;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final String getLocationId() {
        return this.locationId;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final String getFrom_page() {
        return this.from_page;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final String getNodeType() {
        return this.nodeType;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final QiuzPromo getQuizPromo() {
        return this.quizPromo;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final NonNdForm getNonNdForm() {
        return this.nonNdForm;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Boolean getShouldShowInBody() {
        return this.shouldShowInBody;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Boolean getShouldShowInContactBar() {
        return this.shouldShowInContactBar;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getRequestType() {
        return this.requestType;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getContactBarButtonTitle() {
        return this.contactBarButtonTitle;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final DevelopmentsAdviceView getTeaser() {
        return this.teaser;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final TeaserBanner getTeaserBanner() {
        return this.teaserBanner;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final DevelopmentsAdviceView getForm() {
        return this.form;
    }

    @k
    public final DevelopmentsAdvice copy(@k ConsultationAfterIceBreaker consultationAfterIceBreaker, @l NonNdForm nonNdForm, @l Boolean shouldShowInBody, @l Boolean shouldShowInContactBar, @l String requestType, @l String contactBarButtonTitle, @l DevelopmentsAdviceView teaser, @l TeaserBanner teaserBanner, @l DevelopmentsAdviceView form, @l String locationId, @l String from_page, @l String nodeType, @l QiuzPromo quizPromo) {
        return new DevelopmentsAdvice(consultationAfterIceBreaker, nonNdForm, shouldShowInBody, shouldShowInContactBar, requestType, contactBarButtonTitle, teaser, teaserBanner, form, locationId, from_page, nodeType, quizPromo);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DevelopmentsAdvice)) {
            return false;
        }
        DevelopmentsAdvice developmentsAdvice = (DevelopmentsAdvice) other;
        return L.f(this.consultationAfterIceBreaker, developmentsAdvice.consultationAfterIceBreaker) && L.f(this.nonNdForm, developmentsAdvice.nonNdForm) && L.f(this.shouldShowInBody, developmentsAdvice.shouldShowInBody) && L.f(this.shouldShowInContactBar, developmentsAdvice.shouldShowInContactBar) && L.f(this.requestType, developmentsAdvice.requestType) && L.f(this.contactBarButtonTitle, developmentsAdvice.contactBarButtonTitle) && L.f(this.teaser, developmentsAdvice.teaser) && L.f(this.teaserBanner, developmentsAdvice.teaserBanner) && L.f(this.form, developmentsAdvice.form) && L.f(this.locationId, developmentsAdvice.locationId) && L.f(this.from_page, developmentsAdvice.from_page) && L.f(this.nodeType, developmentsAdvice.nodeType) && L.f(this.quizPromo, developmentsAdvice.quizPromo);
    }

    @k
    public final ConsultationAfterIceBreaker getConsultationAfterIceBreaker() {
        return this.consultationAfterIceBreaker;
    }

    @l
    public final String getContactBarButtonTitle() {
        return this.contactBarButtonTitle;
    }

    @l
    public final DevelopmentsAdviceView getForm() {
        return this.form;
    }

    @l
    public final String getFrom_page() {
        return this.from_page;
    }

    @l
    public final String getLocationId() {
        return this.locationId;
    }

    @l
    public final String getNodeType() {
        return this.nodeType;
    }

    @l
    public final NonNdForm getNonNdForm() {
        return this.nonNdForm;
    }

    @l
    public final QiuzPromo getQuizPromo() {
        return this.quizPromo;
    }

    @l
    public final String getRequestType() {
        return this.requestType;
    }

    @l
    public final Boolean getShouldShowInBody() {
        return this.shouldShowInBody;
    }

    @l
    public final Boolean getShouldShowInContactBar() {
        return this.shouldShowInContactBar;
    }

    @l
    public final DevelopmentsAdviceView getTeaser() {
        return this.teaser;
    }

    @l
    public final TeaserBanner getTeaserBanner() {
        return this.teaserBanner;
    }

    public int hashCode() {
        int iHashCode = this.consultationAfterIceBreaker.hashCode() * 31;
        NonNdForm nonNdForm = this.nonNdForm;
        int iHashCode2 = (iHashCode + (nonNdForm == null ? 0 : nonNdForm.hashCode())) * 31;
        Boolean bool = this.shouldShowInBody;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.shouldShowInContactBar;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.requestType;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.contactBarButtonTitle;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DevelopmentsAdviceView developmentsAdviceView = this.teaser;
        int iHashCode7 = (iHashCode6 + (developmentsAdviceView == null ? 0 : developmentsAdviceView.hashCode())) * 31;
        TeaserBanner teaserBanner = this.teaserBanner;
        int iHashCode8 = (iHashCode7 + (teaserBanner == null ? 0 : teaserBanner.hashCode())) * 31;
        DevelopmentsAdviceView developmentsAdviceView2 = this.form;
        int iHashCode9 = (iHashCode8 + (developmentsAdviceView2 == null ? 0 : developmentsAdviceView2.hashCode())) * 31;
        String str3 = this.locationId;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.from_page;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.nodeType;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        QiuzPromo qiuzPromo = this.quizPromo;
        return iHashCode12 + (qiuzPromo != null ? qiuzPromo.hashCode() : 0);
    }

    @k
    public String toString() {
        return "DevelopmentsAdvice(consultationAfterIceBreaker=" + this.consultationAfterIceBreaker + ", nonNdForm=" + this.nonNdForm + ", shouldShowInBody=" + this.shouldShowInBody + ", shouldShowInContactBar=" + this.shouldShowInContactBar + ", requestType=" + this.requestType + ", contactBarButtonTitle=" + this.contactBarButtonTitle + ", teaser=" + this.teaser + ", teaserBanner=" + this.teaserBanner + ", form=" + this.form + ", locationId=" + this.locationId + ", from_page=" + this.from_page + ", nodeType=" + this.nodeType + ", quizPromo=" + this.quizPromo + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.consultationAfterIceBreaker.writeToParcel(parcel, flags);
        NonNdForm nonNdForm = this.nonNdForm;
        if (nonNdForm == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nonNdForm.writeToParcel(parcel, flags);
        }
        Boolean bool = this.shouldShowInBody;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.shouldShowInContactBar;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        parcel.writeString(this.requestType);
        parcel.writeString(this.contactBarButtonTitle);
        DevelopmentsAdviceView developmentsAdviceView = this.teaser;
        if (developmentsAdviceView == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            developmentsAdviceView.writeToParcel(parcel, flags);
        }
        TeaserBanner teaserBanner = this.teaserBanner;
        if (teaserBanner == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            teaserBanner.writeToParcel(parcel, flags);
        }
        DevelopmentsAdviceView developmentsAdviceView2 = this.form;
        if (developmentsAdviceView2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            developmentsAdviceView2.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.locationId);
        parcel.writeString(this.from_page);
        parcel.writeString(this.nodeType);
        QiuzPromo qiuzPromo = this.quizPromo;
        if (qiuzPromo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            qiuzPromo.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ DevelopmentsAdvice(ConsultationAfterIceBreaker consultationAfterIceBreaker, NonNdForm nonNdForm, Boolean bool, Boolean bool2, String str, String str2, DevelopmentsAdviceView developmentsAdviceView, TeaserBanner teaserBanner, DevelopmentsAdviceView developmentsAdviceView2, String str3, String str4, String str5, QiuzPromo qiuzPromo, int i12, C42822w c42822w) {
        this(consultationAfterIceBreaker, (i12 & 2) != 0 ? null : nonNdForm, (i12 & 4) != 0 ? null : bool, (i12 & 8) != 0 ? null : bool2, (i12 & 16) != 0 ? null : str, (i12 & 32) != 0 ? null : str2, (i12 & 64) != 0 ? null : developmentsAdviceView, (i12 & 128) != 0 ? null : teaserBanner, (i12 & 256) != 0 ? null : developmentsAdviceView2, (i12 & 512) != 0 ? null : str3, (i12 & 1024) != 0 ? null : str4, (i12 & 2048) != 0 ? null : str5, (i12 & 4096) == 0 ? qiuzPromo : null);
    }
}

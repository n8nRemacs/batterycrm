package com.avito.android.remote.model.autotekateaser;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.teaser.TeaserInsightIcon;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaTeaserItemResponse.kt */
@d
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b0\u0010'J\u0012\u00101\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b3\u0010%J\u0012\u00104\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\b:\u0010;JÔ\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÆ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b>\u0010\"J\u0010\u0010@\u001a\u00020?HÖ\u0001¢\u0006\u0004\b@\u0010AJ\u001a\u0010E\u001a\u00020D2\b\u0010C\u001a\u0004\u0018\u00010BHÖ\u0003¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020?HÖ\u0001¢\u0006\u0004\bG\u0010AJ \u0010L\u001a\u00020K2\u0006\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020?HÖ\u0001¢\u0006\u0004\bL\u0010MJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\bN\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010O\u001a\u0004\bP\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010O\u001a\u0004\bQ\u0010\"R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010R\u001a\u0004\bS\u0010%R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010T\u001a\u0004\bU\u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010V\u001a\u0004\bW\u0010)R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010X\u001a\u0004\bY\u0010+R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010Z\u001a\u0004\b[\u0010-R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010OR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\\\u001a\u0004\b]\u0010/R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010T\u001a\u0004\b^\u0010'R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010_\u001a\u0004\b`\u00102R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010R\u001a\u0004\ba\u0010%R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010b\u001a\u0004\bc\u00105R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010d\u001a\u0004\be\u00107R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010f\u001a\u0004\bg\u00109R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010h\u001a\u0004\bi\u0010;R\u0019\u0010o\u001a\u0004\u0018\u00010j8F¢\u0006\f\u0012\u0004\bm\u0010n\u001a\u0004\bk\u0010l¨\u0006p"}, d2 = {"Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserResult;", "Landroid/os/Parcelable;", "", "title", "subTitle", "", "Lcom/avito/android/remote/model/teaser/TeaserInsightIcon;", "insights", "Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;", "reportLink", "Lcom/avito/android/remote/model/autotekateaser/AutotekaCpoTeaser;", "cpo", "Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserGalleryInsight;", "galleryInsight", "Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserGallery;", AdvertDetailsBlockIdKt.GALLERY_BLOCK, "_galleryTeaserType", "Lcom/avito/android/remote/model/autotekateaser/MileageParamInsight;", "mileageParamInsight", "exampleReportLink", "Lcom/avito/android/remote/model/autotekateaser/StandaloneAutotekaLink;", "standaloneAutotekaLink", "abs", "Lcom/avito/android/remote/model/autotekateaser/ShowProductsAction;", "showProductsAction", "Lcom/avito/android/remote/model/autotekateaser/ShowReportAction;", "showReportAction", "Lcom/avito/android/remote/model/autotekateaser/AutotekaDiscount;", "discount", "Lcom/avito/android/remote/model/autotekateaser/PromoBanner;", "promoBanner", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;Lcom/avito/android/remote/model/autotekateaser/AutotekaCpoTeaser;Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserGalleryInsight;Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserGallery;Ljava/lang/String;Lcom/avito/android/remote/model/autotekateaser/MileageParamInsight;Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;Lcom/avito/android/remote/model/autotekateaser/StandaloneAutotekaLink;Ljava/util/List;Lcom/avito/android/remote/model/autotekateaser/ShowProductsAction;Lcom/avito/android/remote/model/autotekateaser/ShowReportAction;Lcom/avito/android/remote/model/autotekateaser/AutotekaDiscount;Lcom/avito/android/remote/model/autotekateaser/PromoBanner;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;", "component5", "()Lcom/avito/android/remote/model/autotekateaser/AutotekaCpoTeaser;", "component6", "()Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserGalleryInsight;", "component7", "()Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserGallery;", "component9", "()Lcom/avito/android/remote/model/autotekateaser/MileageParamInsight;", "component10", "component11", "()Lcom/avito/android/remote/model/autotekateaser/StandaloneAutotekaLink;", "component12", "component13", "()Lcom/avito/android/remote/model/autotekateaser/ShowProductsAction;", "component14", "()Lcom/avito/android/remote/model/autotekateaser/ShowReportAction;", "component15", "()Lcom/avito/android/remote/model/autotekateaser/AutotekaDiscount;", "component16", "()Lcom/avito/android/remote/model/autotekateaser/PromoBanner;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;Lcom/avito/android/remote/model/autotekateaser/AutotekaCpoTeaser;Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserGalleryInsight;Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserGallery;Ljava/lang/String;Lcom/avito/android/remote/model/autotekateaser/MileageParamInsight;Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;Lcom/avito/android/remote/model/autotekateaser/StandaloneAutotekaLink;Ljava/util/List;Lcom/avito/android/remote/model/autotekateaser/ShowProductsAction;Lcom/avito/android/remote/model/autotekateaser/ShowReportAction;Lcom/avito/android/remote/model/autotekateaser/AutotekaDiscount;Lcom/avito/android/remote/model/autotekateaser/PromoBanner;)Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserResult;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component8", "Ljava/lang/String;", "getTitle", "getSubTitle", "Ljava/util/List;", "getInsights", "Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;", "getReportLink", "Lcom/avito/android/remote/model/autotekateaser/AutotekaCpoTeaser;", "getCpo", "Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserGalleryInsight;", "getGalleryInsight", "Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserGallery;", "getGallery", "Lcom/avito/android/remote/model/autotekateaser/MileageParamInsight;", "getMileageParamInsight", "getExampleReportLink", "Lcom/avito/android/remote/model/autotekateaser/StandaloneAutotekaLink;", "getStandaloneAutotekaLink", "getAbs", "Lcom/avito/android/remote/model/autotekateaser/ShowProductsAction;", "getShowProductsAction", "Lcom/avito/android/remote/model/autotekateaser/ShowReportAction;", "getShowReportAction", "Lcom/avito/android/remote/model/autotekateaser/AutotekaDiscount;", "getDiscount", "Lcom/avito/android/remote/model/autotekateaser/PromoBanner;", "getPromoBanner", "Lcom/avito/android/remote/model/autotekateaser/GalleryTeaserType;", "getGalleryTeaserTypeValue", "()Lcom/avito/android/remote/model/autotekateaser/GalleryTeaserType;", "getGalleryTeaserTypeValue$annotations", "()V", "galleryTeaserTypeValue", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutotekaTeaserResult implements Parcelable {

    @k
    public static final Parcelable.Creator<AutotekaTeaserResult> CREATOR = new Creator();

    @c("galleryTeaserType")
    @l
    private final String _galleryTeaserType;

    @c("abs")
    @l
    private final List<String> abs;

    @c("cpo")
    @l
    private final AutotekaCpoTeaser cpo;

    @c("discount")
    @l
    private final AutotekaDiscount discount;

    @c("reportExampleLink")
    @l
    private final AutotekaReportLink exampleReportLink;

    @c(AdvertDetailsBlockIdKt.GALLERY_BLOCK)
    @l
    private final AutotekaTeaserGallery gallery;

    @c("galleryInsight")
    @l
    private final AutotekaTeaserGalleryInsight galleryInsight;

    @c("insights")
    @k
    private final List<TeaserInsightIcon> insights;

    @c("mileageParamInsight")
    @l
    private final MileageParamInsight mileageParamInsight;

    @c("promoBanner")
    @l
    private final PromoBanner promoBanner;

    @c("reportLink")
    @k
    private final AutotekaReportLink reportLink;

    @c("showProductsAction")
    @l
    private final ShowProductsAction showProductsAction;

    @c("toReportAction")
    @l
    private final ShowReportAction showReportAction;

    @c("toStandalone")
    @l
    private final StandaloneAutotekaLink standaloneAutotekaLink;

    @c("subtitle")
    @k
    private final String subTitle;

    @c("title")
    @k
    private final String title;

    /* compiled from: AutotekaTeaserItemResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutotekaTeaserResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutotekaTeaserResult createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(TeaserInsightIcon.CREATOR, parcel, arrayList, iC2, 1);
            }
            Parcelable.Creator<AutotekaReportLink> creator = AutotekaReportLink.CREATOR;
            return new AutotekaTeaserResult(string, string2, arrayList, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : AutotekaCpoTeaser.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AutotekaTeaserGalleryInsight.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AutotekaTeaserGallery.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : MileageParamInsight.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : StandaloneAutotekaLink.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : ShowProductsAction.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ShowReportAction.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AutotekaDiscount.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PromoBanner.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutotekaTeaserResult[] newArray(int i12) {
            return new AutotekaTeaserResult[i12];
        }
    }

    public AutotekaTeaserResult(@k String str, @k String str2, @k List<TeaserInsightIcon> list, @k AutotekaReportLink autotekaReportLink, @l AutotekaCpoTeaser autotekaCpoTeaser, @l AutotekaTeaserGalleryInsight autotekaTeaserGalleryInsight, @l AutotekaTeaserGallery autotekaTeaserGallery, @l String str3, @l MileageParamInsight mileageParamInsight, @l AutotekaReportLink autotekaReportLink2, @l StandaloneAutotekaLink standaloneAutotekaLink, @l List<String> list2, @l ShowProductsAction showProductsAction, @l ShowReportAction showReportAction, @l AutotekaDiscount autotekaDiscount, @l PromoBanner promoBanner) {
        this.title = str;
        this.subTitle = str2;
        this.insights = list;
        this.reportLink = autotekaReportLink;
        this.cpo = autotekaCpoTeaser;
        this.galleryInsight = autotekaTeaserGalleryInsight;
        this.gallery = autotekaTeaserGallery;
        this._galleryTeaserType = str3;
        this.mileageParamInsight = mileageParamInsight;
        this.exampleReportLink = autotekaReportLink2;
        this.standaloneAutotekaLink = standaloneAutotekaLink;
        this.abs = list2;
        this.showProductsAction = showProductsAction;
        this.showReportAction = showReportAction;
        this.discount = autotekaDiscount;
        this.promoBanner = promoBanner;
    }

    /* renamed from: component8, reason: from getter */
    private final String get_galleryTeaserType() {
        return this._galleryTeaserType;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final AutotekaReportLink getExampleReportLink() {
        return this.exampleReportLink;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final StandaloneAutotekaLink getStandaloneAutotekaLink() {
        return this.standaloneAutotekaLink;
    }

    @l
    public final List<String> component12() {
        return this.abs;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final ShowProductsAction getShowProductsAction() {
        return this.showProductsAction;
    }

    @l
    /* renamed from: component14, reason: from getter */
    public final ShowReportAction getShowReportAction() {
        return this.showReportAction;
    }

    @l
    /* renamed from: component15, reason: from getter */
    public final AutotekaDiscount getDiscount() {
        return this.discount;
    }

    @l
    /* renamed from: component16, reason: from getter */
    public final PromoBanner getPromoBanner() {
        return this.promoBanner;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    @k
    public final List<TeaserInsightIcon> component3() {
        return this.insights;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final AutotekaReportLink getReportLink() {
        return this.reportLink;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final AutotekaCpoTeaser getCpo() {
        return this.cpo;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final AutotekaTeaserGalleryInsight getGalleryInsight() {
        return this.galleryInsight;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final AutotekaTeaserGallery getGallery() {
        return this.gallery;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final MileageParamInsight getMileageParamInsight() {
        return this.mileageParamInsight;
    }

    @k
    public final AutotekaTeaserResult copy(@k String title, @k String subTitle, @k List<TeaserInsightIcon> insights, @k AutotekaReportLink reportLink, @l AutotekaCpoTeaser cpo, @l AutotekaTeaserGalleryInsight galleryInsight, @l AutotekaTeaserGallery gallery, @l String _galleryTeaserType, @l MileageParamInsight mileageParamInsight, @l AutotekaReportLink exampleReportLink, @l StandaloneAutotekaLink standaloneAutotekaLink, @l List<String> abs, @l ShowProductsAction showProductsAction, @l ShowReportAction showReportAction, @l AutotekaDiscount discount, @l PromoBanner promoBanner) {
        return new AutotekaTeaserResult(title, subTitle, insights, reportLink, cpo, galleryInsight, gallery, _galleryTeaserType, mileageParamInsight, exampleReportLink, standaloneAutotekaLink, abs, showProductsAction, showReportAction, discount, promoBanner);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutotekaTeaserResult)) {
            return false;
        }
        AutotekaTeaserResult autotekaTeaserResult = (AutotekaTeaserResult) other;
        return L.f(this.title, autotekaTeaserResult.title) && L.f(this.subTitle, autotekaTeaserResult.subTitle) && L.f(this.insights, autotekaTeaserResult.insights) && L.f(this.reportLink, autotekaTeaserResult.reportLink) && L.f(this.cpo, autotekaTeaserResult.cpo) && L.f(this.galleryInsight, autotekaTeaserResult.galleryInsight) && L.f(this.gallery, autotekaTeaserResult.gallery) && L.f(this._galleryTeaserType, autotekaTeaserResult._galleryTeaserType) && L.f(this.mileageParamInsight, autotekaTeaserResult.mileageParamInsight) && L.f(this.exampleReportLink, autotekaTeaserResult.exampleReportLink) && L.f(this.standaloneAutotekaLink, autotekaTeaserResult.standaloneAutotekaLink) && L.f(this.abs, autotekaTeaserResult.abs) && L.f(this.showProductsAction, autotekaTeaserResult.showProductsAction) && L.f(this.showReportAction, autotekaTeaserResult.showReportAction) && L.f(this.discount, autotekaTeaserResult.discount) && L.f(this.promoBanner, autotekaTeaserResult.promoBanner);
    }

    @l
    public final List<String> getAbs() {
        return this.abs;
    }

    @l
    public final AutotekaCpoTeaser getCpo() {
        return this.cpo;
    }

    @l
    public final AutotekaDiscount getDiscount() {
        return this.discount;
    }

    @l
    public final AutotekaReportLink getExampleReportLink() {
        return this.exampleReportLink;
    }

    @l
    public final AutotekaTeaserGallery getGallery() {
        return this.gallery;
    }

    @l
    public final AutotekaTeaserGalleryInsight getGalleryInsight() {
        return this.galleryInsight;
    }

    @l
    public final GalleryTeaserType getGalleryTeaserTypeValue() {
        String str = this._galleryTeaserType;
        GalleryTeaserType galleryTeaserType = GalleryTeaserType.SINGLE_INSIGHT;
        if (L.f(str, galleryTeaserType.getValue())) {
            return galleryTeaserType;
        }
        GalleryTeaserType galleryTeaserType2 = GalleryTeaserType.INSIGHT_LIST;
        if (L.f(str, galleryTeaserType2.getValue())) {
            return galleryTeaserType2;
        }
        if (str == null) {
            return null;
        }
        return GalleryTeaserType.UNKNOWN;
    }

    @k
    public final List<TeaserInsightIcon> getInsights() {
        return this.insights;
    }

    @l
    public final MileageParamInsight getMileageParamInsight() {
        return this.mileageParamInsight;
    }

    @l
    public final PromoBanner getPromoBanner() {
        return this.promoBanner;
    }

    @k
    public final AutotekaReportLink getReportLink() {
        return this.reportLink;
    }

    @l
    public final ShowProductsAction getShowProductsAction() {
        return this.showProductsAction;
    }

    @l
    public final ShowReportAction getShowReportAction() {
        return this.showReportAction;
    }

    @l
    public final StandaloneAutotekaLink getStandaloneAutotekaLink() {
        return this.standaloneAutotekaLink;
    }

    @k
    public final String getSubTitle() {
        return this.subTitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = (this.reportLink.hashCode() + H.e(H.d(this.title.hashCode() * 31, 31, this.subTitle), 31, this.insights)) * 31;
        AutotekaCpoTeaser autotekaCpoTeaser = this.cpo;
        int iHashCode2 = (iHashCode + (autotekaCpoTeaser == null ? 0 : autotekaCpoTeaser.hashCode())) * 31;
        AutotekaTeaserGalleryInsight autotekaTeaserGalleryInsight = this.galleryInsight;
        int iHashCode3 = (iHashCode2 + (autotekaTeaserGalleryInsight == null ? 0 : autotekaTeaserGalleryInsight.hashCode())) * 31;
        AutotekaTeaserGallery autotekaTeaserGallery = this.gallery;
        int iHashCode4 = (iHashCode3 + (autotekaTeaserGallery == null ? 0 : autotekaTeaserGallery.hashCode())) * 31;
        String str = this._galleryTeaserType;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        MileageParamInsight mileageParamInsight = this.mileageParamInsight;
        int iHashCode6 = (iHashCode5 + (mileageParamInsight == null ? 0 : mileageParamInsight.hashCode())) * 31;
        AutotekaReportLink autotekaReportLink = this.exampleReportLink;
        int iHashCode7 = (iHashCode6 + (autotekaReportLink == null ? 0 : autotekaReportLink.hashCode())) * 31;
        StandaloneAutotekaLink standaloneAutotekaLink = this.standaloneAutotekaLink;
        int iHashCode8 = (iHashCode7 + (standaloneAutotekaLink == null ? 0 : standaloneAutotekaLink.hashCode())) * 31;
        List<String> list = this.abs;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        ShowProductsAction showProductsAction = this.showProductsAction;
        int iHashCode10 = (iHashCode9 + (showProductsAction == null ? 0 : showProductsAction.hashCode())) * 31;
        ShowReportAction showReportAction = this.showReportAction;
        int iHashCode11 = (iHashCode10 + (showReportAction == null ? 0 : showReportAction.hashCode())) * 31;
        AutotekaDiscount autotekaDiscount = this.discount;
        int iHashCode12 = (iHashCode11 + (autotekaDiscount == null ? 0 : autotekaDiscount.hashCode())) * 31;
        PromoBanner promoBanner = this.promoBanner;
        return iHashCode12 + (promoBanner != null ? promoBanner.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AutotekaTeaserResult(title=" + this.title + ", subTitle=" + this.subTitle + ", insights=" + this.insights + ", reportLink=" + this.reportLink + ", cpo=" + this.cpo + ", galleryInsight=" + this.galleryInsight + ", gallery=" + this.gallery + ", _galleryTeaserType=" + this._galleryTeaserType + ", mileageParamInsight=" + this.mileageParamInsight + ", exampleReportLink=" + this.exampleReportLink + ", standaloneAutotekaLink=" + this.standaloneAutotekaLink + ", abs=" + this.abs + ", showProductsAction=" + this.showProductsAction + ", showReportAction=" + this.showReportAction + ", discount=" + this.discount + ", promoBanner=" + this.promoBanner + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
        Iterator itJ = C0.j(this.insights, parcel);
        while (itJ.hasNext()) {
            ((TeaserInsightIcon) itJ.next()).writeToParcel(parcel, flags);
        }
        this.reportLink.writeToParcel(parcel, flags);
        AutotekaCpoTeaser autotekaCpoTeaser = this.cpo;
        if (autotekaCpoTeaser == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autotekaCpoTeaser.writeToParcel(parcel, flags);
        }
        AutotekaTeaserGalleryInsight autotekaTeaserGalleryInsight = this.galleryInsight;
        if (autotekaTeaserGalleryInsight == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autotekaTeaserGalleryInsight.writeToParcel(parcel, flags);
        }
        AutotekaTeaserGallery autotekaTeaserGallery = this.gallery;
        if (autotekaTeaserGallery == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autotekaTeaserGallery.writeToParcel(parcel, flags);
        }
        parcel.writeString(this._galleryTeaserType);
        MileageParamInsight mileageParamInsight = this.mileageParamInsight;
        if (mileageParamInsight == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mileageParamInsight.writeToParcel(parcel, flags);
        }
        AutotekaReportLink autotekaReportLink = this.exampleReportLink;
        if (autotekaReportLink == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autotekaReportLink.writeToParcel(parcel, flags);
        }
        StandaloneAutotekaLink standaloneAutotekaLink = this.standaloneAutotekaLink;
        if (standaloneAutotekaLink == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            standaloneAutotekaLink.writeToParcel(parcel, flags);
        }
        parcel.writeStringList(this.abs);
        ShowProductsAction showProductsAction = this.showProductsAction;
        if (showProductsAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            showProductsAction.writeToParcel(parcel, flags);
        }
        ShowReportAction showReportAction = this.showReportAction;
        if (showReportAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            showReportAction.writeToParcel(parcel, flags);
        }
        AutotekaDiscount autotekaDiscount = this.discount;
        if (autotekaDiscount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autotekaDiscount.writeToParcel(parcel, flags);
        }
        PromoBanner promoBanner = this.promoBanner;
        if (promoBanner == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promoBanner.writeToParcel(parcel, flags);
        }
    }

    public static /* synthetic */ void getGalleryTeaserTypeValue$annotations() {
    }

    public /* synthetic */ AutotekaTeaserResult(String str, String str2, List list, AutotekaReportLink autotekaReportLink, AutotekaCpoTeaser autotekaCpoTeaser, AutotekaTeaserGalleryInsight autotekaTeaserGalleryInsight, AutotekaTeaserGallery autotekaTeaserGallery, String str3, MileageParamInsight mileageParamInsight, AutotekaReportLink autotekaReportLink2, StandaloneAutotekaLink standaloneAutotekaLink, List list2, ShowProductsAction showProductsAction, ShowReportAction showReportAction, AutotekaDiscount autotekaDiscount, PromoBanner promoBanner, int i12, C42822w c42822w) {
        this(str, str2, list, autotekaReportLink, (i12 & 16) != 0 ? null : autotekaCpoTeaser, autotekaTeaserGalleryInsight, autotekaTeaserGallery, str3, mileageParamInsight, autotekaReportLink2, standaloneAutotekaLink, list2, showProductsAction, showReportAction, autotekaDiscount, promoBanner);
    }
}

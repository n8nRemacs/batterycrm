package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.price_list.AdvertPriceListPreviewResponse;
import com.avito.android.remote.model.price_list.PriceList;
import com.avito.android.remote.model.service_education.ServiceEducation;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertParameters.kt */
@d
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0007\u0018\u00002\u00020\u0001:\u0005<=>?@B\u009b\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\"R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b&\u0010%R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b'\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b+\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b3\u00104R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\b6\u00107R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00108\u001a\u0004\b9\u0010:R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010#\u001a\u0004\b;\u0010%¨\u0006A"}, d2 = {"Lcom/avito/android/remote/model/AdvertParameters;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/AdvertParameters$Parameter;", "flat", "Lcom/avito/android/remote/model/AdvertParameters$Group;", "groups", "Lcom/avito/android/remote/model/AdvertParameters$FlatSection;", "flatSections", "Lcom/avito/android/remote/model/text/AttributedText;", "flatTitle", "flatsDisclaimer", "Lcom/avito/android/remote/model/AdvertEquipments;", "equipments", "Lcom/avito/android/remote/model/price_list/PriceList;", "priceList", "Lcom/avito/android/remote/model/service_education/ServiceEducation;", "serviceEducation", "Lcom/avito/android/remote/model/price_list/AdvertPriceListPreviewResponse;", "priceListPreview", "Lcom/avito/android/remote/model/ExpandItemsButton;", "expandParamsButton", "Lcom/avito/android/remote/model/AdvertParameters$WorkingCondition;", "workingConditions", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/AdvertEquipments;Lcom/avito/android/remote/model/price_list/PriceList;Lcom/avito/android/remote/model/service_education/ServiceEducation;Lcom/avito/android/remote/model/price_list/AdvertPriceListPreviewResponse;Lcom/avito/android/remote/model/ExpandItemsButton;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getFlat", "()Ljava/util/List;", "getGroups", "getFlatSections", "Lcom/avito/android/remote/model/text/AttributedText;", "getFlatTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getFlatsDisclaimer", "Lcom/avito/android/remote/model/AdvertEquipments;", "getEquipments", "()Lcom/avito/android/remote/model/AdvertEquipments;", "Lcom/avito/android/remote/model/price_list/PriceList;", "getPriceList", "()Lcom/avito/android/remote/model/price_list/PriceList;", "Lcom/avito/android/remote/model/service_education/ServiceEducation;", "getServiceEducation", "()Lcom/avito/android/remote/model/service_education/ServiceEducation;", "Lcom/avito/android/remote/model/price_list/AdvertPriceListPreviewResponse;", "getPriceListPreview", "()Lcom/avito/android/remote/model/price_list/AdvertPriceListPreviewResponse;", "Lcom/avito/android/remote/model/ExpandItemsButton;", "getExpandParamsButton", "()Lcom/avito/android/remote/model/ExpandItemsButton;", "getWorkingConditions", "Button", "FlatSection", "Group", "Parameter", "WorkingCondition", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdvertParameters implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertParameters> CREATOR = new Creator();

    @c("equipments")
    @l
    private final AdvertEquipments equipments;

    @c("expandButton")
    @l
    private final ExpandItemsButton expandParamsButton;

    @c("flat")
    @k
    private final List<Parameter> flat;

    @c("flatSections")
    @l
    private final List<FlatSection> flatSections;

    @c("flatTitle")
    @l
    private final AttributedText flatTitle;

    @c(ServiceTransportationWidget.DisclaimerField.TYPE)
    @l
    private final AttributedText flatsDisclaimer;

    @c("groups")
    @k
    private final List<Group> groups;

    @c("priceList")
    @l
    private final PriceList priceList;

    @c("priceListPreview")
    @l
    private final AdvertPriceListPreviewResponse priceListPreview;

    @c("serviceEducation")
    @l
    private final ServiceEducation serviceEducation;

    @c("workingConditions")
    @l
    private final List<WorkingCondition> workingConditions;

    /* compiled from: AdvertParameters.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u00040123B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0013¨\u00064"}, d2 = {"Lcom/avito/android/remote/model/AdvertParameters$Button;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/remote/model/AdvertParameters$Button$Description;", "description", "Lcom/avito/android/remote/model/AdvertParameters$Button$ButtonIcon;", "icon", "Lcom/avito/android/remote/model/AdvertParameters$Button$OwnershipDiscrepancy;", "ownershipDiscrepancy", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/AdvertParameters$Button$Description;Lcom/avito/android/remote/model/AdvertParameters$Button$ButtonIcon;Lcom/avito/android/remote/model/AdvertParameters$Button$OwnershipDiscrepancy;)V", "component1", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component2", "()Lcom/avito/android/remote/model/AdvertParameters$Button$Description;", "component3", "()Lcom/avito/android/remote/model/AdvertParameters$Button$ButtonIcon;", "component4", "()Lcom/avito/android/remote/model/AdvertParameters$Button$OwnershipDiscrepancy;", "copy", "(Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/AdvertParameters$Button$Description;Lcom/avito/android/remote/model/AdvertParameters$Button$ButtonIcon;Lcom/avito/android/remote/model/AdvertParameters$Button$OwnershipDiscrepancy;)Lcom/avito/android/remote/model/AdvertParameters$Button;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "Lcom/avito/android/remote/model/AdvertParameters$Button$Description;", "getDescription", "Lcom/avito/android/remote/model/AdvertParameters$Button$ButtonIcon;", "getIcon", "Lcom/avito/android/remote/model/AdvertParameters$Button$OwnershipDiscrepancy;", "getOwnershipDiscrepancy", "ButtonIcon", "Description", "IconPosition", "OwnershipDiscrepancy", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Button implements Parcelable {

        @k
        public static final Parcelable.Creator<Button> CREATOR = new Creator();

        @c(ContextActionHandler.Link.DEEPLINK)
        @l
        private final DeepLink deepLink;

        @c("description")
        @l
        private final Description description;

        @c("icon")
        @l
        private final ButtonIcon icon;

        @c("ownershipDiscrepancy")
        @l
        private final OwnershipDiscrepancy ownershipDiscrepancy;

        /* compiled from: AdvertParameters.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Button> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Button createFromParcel(@k Parcel parcel) {
                return new Button((DeepLink) parcel.readParcelable(Button.class.getClassLoader()), parcel.readInt() == 0 ? null : Description.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ButtonIcon.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? OwnershipDiscrepancy.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        /* compiled from: AdvertParameters.kt */
        @d
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/AdvertParameters$Button$Description;", "Landroid/os/Parcelable;", "", "header", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/AdvertParameters$Button$Description;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getHeader", "getText", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Description implements Parcelable {

            @k
            public static final Parcelable.Creator<Description> CREATOR = new Creator();

            @c("header")
            @k
            private final String header;

            @c("text")
            @k
            private final String text;

            /* compiled from: AdvertParameters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Description> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Description createFromParcel(@k Parcel parcel) {
                    return new Description(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Description[] newArray(int i12) {
                    return new Description[i12];
                }
            }

            public Description(@k String str, @k String str2) {
                this.header = str;
                this.text = str2;
            }

            public static /* synthetic */ Description copy$default(Description description, String str, String str2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = description.header;
                }
                if ((i12 & 2) != 0) {
                    str2 = description.text;
                }
                return description.copy(str, str2);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getHeader() {
                return this.header;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getText() {
                return this.text;
            }

            @k
            public final Description copy(@k String header, @k String text) {
                return new Description(header, text);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Description)) {
                    return false;
                }
                Description description = (Description) other;
                return L.f(this.header, description.header) && L.f(this.text, description.text);
            }

            @k
            public final String getHeader() {
                return this.header;
            }

            @k
            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode() + (this.header.hashCode() * 31);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Description(header=");
                sb2.append(this.header);
                sb2.append(", text=");
                return C22026a.c(sb2, this.text, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.header);
                parcel.writeString(this.text);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AdvertParameters.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/AdvertParameters$Button$IconPosition;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "LEADING", "TRAILING", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final class IconPosition implements Parcelable {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ IconPosition[] $VALUES;

            @k
            public static final Parcelable.Creator<IconPosition> CREATOR;

            @c("leading")
            public static final IconPosition LEADING = new IconPosition("LEADING", 0);

            @c("trailing")
            public static final IconPosition TRAILING = new IconPosition("TRAILING", 1);

            /* compiled from: AdvertParameters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<IconPosition> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final IconPosition createFromParcel(@k Parcel parcel) {
                    return IconPosition.valueOf(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final IconPosition[] newArray(int i12) {
                    return new IconPosition[i12];
                }
            }

            private static final /* synthetic */ IconPosition[] $values() {
                return new IconPosition[]{LEADING, TRAILING};
            }

            static {
                IconPosition[] iconPositionArr$values = $values();
                $VALUES = iconPositionArr$values;
                $ENTRIES = kotlin.enums.c.a(iconPositionArr$values);
                CREATOR = new Creator();
            }

            private IconPosition(String str, int i12) {
            }

            @k
            public static a<IconPosition> getEntries() {
                return $ENTRIES;
            }

            public static IconPosition valueOf(String str) {
                return (IconPosition) Enum.valueOf(IconPosition.class, str);
            }

            public static IconPosition[] values() {
                return (IconPosition[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(name());
            }
        }

        /* compiled from: AdvertParameters.kt */
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0002,-B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J@\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\rR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b)\u0010\rR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0012¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/AdvertParameters$Button$OwnershipDiscrepancy;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/remote/model/AdvertParameters$Button$OwnershipDiscrepancy$KeyValue;", "values", "description", "Lcom/avito/android/remote/model/AdvertParameters$Button$OwnershipDiscrepancy$OwnershipDiscrepancyButton;", "reportLink", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/AdvertParameters$Button$OwnershipDiscrepancy$OwnershipDiscrepancyButton;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "()Lcom/avito/android/remote/model/AdvertParameters$Button$OwnershipDiscrepancy$OwnershipDiscrepancyButton;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/AdvertParameters$Button$OwnershipDiscrepancy$OwnershipDiscrepancyButton;)Lcom/avito/android/remote/model/AdvertParameters$Button$OwnershipDiscrepancy;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getValues", "getDescription", "Lcom/avito/android/remote/model/AdvertParameters$Button$OwnershipDiscrepancy$OwnershipDiscrepancyButton;", "getReportLink", "KeyValue", "OwnershipDiscrepancyButton", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class OwnershipDiscrepancy implements Parcelable {

            @k
            public static final Parcelable.Creator<OwnershipDiscrepancy> CREATOR = new Creator();

            @c("description")
            @k
            private final String description;

            @c("reportLink")
            @k
            private final OwnershipDiscrepancyButton reportLink;

            @c("title")
            @k
            private final String title;

            @c("values")
            @l
            private final List<KeyValue> values;

            /* compiled from: AdvertParameters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<OwnershipDiscrepancy> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final OwnershipDiscrepancy createFromParcel(@k Parcel parcel) {
                    ArrayList arrayList;
                    String string = parcel.readString();
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i12 = parcel.readInt();
                        ArrayList arrayList2 = new ArrayList(i12);
                        int iC2 = 0;
                        while (iC2 != i12) {
                            iC2 = com.avito.android.actions_sheet.a.c(KeyValue.CREATOR, parcel, arrayList2, iC2, 1);
                        }
                        arrayList = arrayList2;
                    }
                    return new OwnershipDiscrepancy(string, arrayList, parcel.readString(), OwnershipDiscrepancyButton.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final OwnershipDiscrepancy[] newArray(int i12) {
                    return new OwnershipDiscrepancy[i12];
                }
            }

            /* compiled from: AdvertParameters.kt */
            @d
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/AdvertParameters$Button$OwnershipDiscrepancy$KeyValue;", "Landroid/os/Parcelable;", "", "key", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/AdvertParameters$Button$OwnershipDiscrepancy$KeyValue;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getKey", "getValue", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class KeyValue implements Parcelable {

                @k
                public static final Parcelable.Creator<KeyValue> CREATOR = new Creator();

                @c("key")
                @k
                private final String key;

                @c("value")
                @k
                private final String value;

                /* compiled from: AdvertParameters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<KeyValue> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final KeyValue createFromParcel(@k Parcel parcel) {
                        return new KeyValue(parcel.readString(), parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final KeyValue[] newArray(int i12) {
                        return new KeyValue[i12];
                    }
                }

                public KeyValue(@k String str, @k String str2) {
                    this.key = str;
                    this.value = str2;
                }

                public static /* synthetic */ KeyValue copy$default(KeyValue keyValue, String str, String str2, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = keyValue.key;
                    }
                    if ((i12 & 2) != 0) {
                        str2 = keyValue.value;
                    }
                    return keyValue.copy(str, str2);
                }

                @k
                /* renamed from: component1, reason: from getter */
                public final String getKey() {
                    return this.key;
                }

                @k
                /* renamed from: component2, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                @k
                public final KeyValue copy(@k String key, @k String value) {
                    return new KeyValue(key, value);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof KeyValue)) {
                        return false;
                    }
                    KeyValue keyValue = (KeyValue) other;
                    return L.f(this.key, keyValue.key) && L.f(this.value, keyValue.value);
                }

                @k
                public final String getKey() {
                    return this.key;
                }

                @k
                public final String getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode() + (this.key.hashCode() * 31);
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("KeyValue(key=");
                    sb2.append(this.key);
                    sb2.append(", value=");
                    return C22026a.c(sb2, this.value, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.key);
                    parcel.writeString(this.value);
                }
            }

            /* compiled from: AdvertParameters.kt */
            @d
            @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\n¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/AdvertParameters$Button$OwnershipDiscrepancy$OwnershipDiscrepancyButton;", "Landroid/os/Parcelable;", "", "title", "Landroid/net/Uri;", ContextActionHandler.Link.URL, "eventType", "<init>", "(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Landroid/net/Uri;", "component3", "copy", "(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)Lcom/avito/android/remote/model/AdvertParameters$Button$OwnershipDiscrepancy$OwnershipDiscrepancyButton;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Landroid/net/Uri;", "getUrl", "getEventType", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class OwnershipDiscrepancyButton implements Parcelable {

                @k
                public static final Parcelable.Creator<OwnershipDiscrepancyButton> CREATOR = new Creator();

                @c("eventType")
                @l
                private final String eventType;

                @c("text")
                @k
                private final String title;

                @c(ContextActionHandler.Link.URL)
                @l
                private final Uri url;

                /* compiled from: AdvertParameters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<OwnershipDiscrepancyButton> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final OwnershipDiscrepancyButton createFromParcel(@k Parcel parcel) {
                        return new OwnershipDiscrepancyButton(parcel.readString(), (Uri) parcel.readParcelable(OwnershipDiscrepancyButton.class.getClassLoader()), parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final OwnershipDiscrepancyButton[] newArray(int i12) {
                        return new OwnershipDiscrepancyButton[i12];
                    }
                }

                public OwnershipDiscrepancyButton(@k String str, @l Uri uri, @l String str2) {
                    this.title = str;
                    this.url = uri;
                    this.eventType = str2;
                }

                public static /* synthetic */ OwnershipDiscrepancyButton copy$default(OwnershipDiscrepancyButton ownershipDiscrepancyButton, String str, Uri uri, String str2, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = ownershipDiscrepancyButton.title;
                    }
                    if ((i12 & 2) != 0) {
                        uri = ownershipDiscrepancyButton.url;
                    }
                    if ((i12 & 4) != 0) {
                        str2 = ownershipDiscrepancyButton.eventType;
                    }
                    return ownershipDiscrepancyButton.copy(str, uri, str2);
                }

                @k
                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                @l
                /* renamed from: component2, reason: from getter */
                public final Uri getUrl() {
                    return this.url;
                }

                @l
                /* renamed from: component3, reason: from getter */
                public final String getEventType() {
                    return this.eventType;
                }

                @k
                public final OwnershipDiscrepancyButton copy(@k String title, @l Uri url, @l String eventType) {
                    return new OwnershipDiscrepancyButton(title, url, eventType);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof OwnershipDiscrepancyButton)) {
                        return false;
                    }
                    OwnershipDiscrepancyButton ownershipDiscrepancyButton = (OwnershipDiscrepancyButton) other;
                    return L.f(this.title, ownershipDiscrepancyButton.title) && L.f(this.url, ownershipDiscrepancyButton.url) && L.f(this.eventType, ownershipDiscrepancyButton.eventType);
                }

                @l
                public final String getEventType() {
                    return this.eventType;
                }

                @k
                public final String getTitle() {
                    return this.title;
                }

                @l
                public final Uri getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    int iHashCode = this.title.hashCode() * 31;
                    Uri uri = this.url;
                    int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
                    String str = this.eventType;
                    return iHashCode2 + (str != null ? str.hashCode() : 0);
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("OwnershipDiscrepancyButton(title=");
                    sb2.append(this.title);
                    sb2.append(", url=");
                    sb2.append(this.url);
                    sb2.append(", eventType=");
                    return C22026a.c(sb2, this.eventType, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.title);
                    parcel.writeParcelable(this.url, flags);
                    parcel.writeString(this.eventType);
                }
            }

            public OwnershipDiscrepancy(@k String str, @l List<KeyValue> list, @k String str2, @k OwnershipDiscrepancyButton ownershipDiscrepancyButton) {
                this.title = str;
                this.values = list;
                this.description = str2;
                this.reportLink = ownershipDiscrepancyButton;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ OwnershipDiscrepancy copy$default(OwnershipDiscrepancy ownershipDiscrepancy, String str, List list, String str2, OwnershipDiscrepancyButton ownershipDiscrepancyButton, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = ownershipDiscrepancy.title;
                }
                if ((i12 & 2) != 0) {
                    list = ownershipDiscrepancy.values;
                }
                if ((i12 & 4) != 0) {
                    str2 = ownershipDiscrepancy.description;
                }
                if ((i12 & 8) != 0) {
                    ownershipDiscrepancyButton = ownershipDiscrepancy.reportLink;
                }
                return ownershipDiscrepancy.copy(str, list, str2, ownershipDiscrepancyButton);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @l
            public final List<KeyValue> component2() {
                return this.values;
            }

            @k
            /* renamed from: component3, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            @k
            /* renamed from: component4, reason: from getter */
            public final OwnershipDiscrepancyButton getReportLink() {
                return this.reportLink;
            }

            @k
            public final OwnershipDiscrepancy copy(@k String title, @l List<KeyValue> values, @k String description, @k OwnershipDiscrepancyButton reportLink) {
                return new OwnershipDiscrepancy(title, values, description, reportLink);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OwnershipDiscrepancy)) {
                    return false;
                }
                OwnershipDiscrepancy ownershipDiscrepancy = (OwnershipDiscrepancy) other;
                return L.f(this.title, ownershipDiscrepancy.title) && L.f(this.values, ownershipDiscrepancy.values) && L.f(this.description, ownershipDiscrepancy.description) && L.f(this.reportLink, ownershipDiscrepancy.reportLink);
            }

            @k
            public final String getDescription() {
                return this.description;
            }

            @k
            public final OwnershipDiscrepancyButton getReportLink() {
                return this.reportLink;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            @l
            public final List<KeyValue> getValues() {
                return this.values;
            }

            public int hashCode() {
                int iHashCode = this.title.hashCode() * 31;
                List<KeyValue> list = this.values;
                return this.reportLink.hashCode() + H.d((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.description);
            }

            @k
            public String toString() {
                return "OwnershipDiscrepancy(title=" + this.title + ", values=" + this.values + ", description=" + this.description + ", reportLink=" + this.reportLink + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                List<KeyValue> list = this.values;
                if (list == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                    while (itA.hasNext()) {
                        ((KeyValue) itA.next()).writeToParcel(parcel, flags);
                    }
                }
                parcel.writeString(this.description);
                this.reportLink.writeToParcel(parcel, flags);
            }
        }

        public Button() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ Button copy$default(Button button, DeepLink deepLink, Description description, ButtonIcon buttonIcon, OwnershipDiscrepancy ownershipDiscrepancy, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                deepLink = button.deepLink;
            }
            if ((i12 & 2) != 0) {
                description = button.description;
            }
            if ((i12 & 4) != 0) {
                buttonIcon = button.icon;
            }
            if ((i12 & 8) != 0) {
                ownershipDiscrepancy = button.ownershipDiscrepancy;
            }
            return button.copy(deepLink, description, buttonIcon, ownershipDiscrepancy);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Description getDescription() {
            return this.description;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final ButtonIcon getIcon() {
            return this.icon;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final OwnershipDiscrepancy getOwnershipDiscrepancy() {
            return this.ownershipDiscrepancy;
        }

        @k
        public final Button copy(@l DeepLink deepLink, @l Description description, @l ButtonIcon icon, @l OwnershipDiscrepancy ownershipDiscrepancy) {
            return new Button(deepLink, description, icon, ownershipDiscrepancy);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return L.f(this.deepLink, button.deepLink) && L.f(this.description, button.description) && L.f(this.icon, button.icon) && L.f(this.ownershipDiscrepancy, button.ownershipDiscrepancy);
        }

        @l
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        public final Description getDescription() {
            return this.description;
        }

        @l
        public final ButtonIcon getIcon() {
            return this.icon;
        }

        @l
        public final OwnershipDiscrepancy getOwnershipDiscrepancy() {
            return this.ownershipDiscrepancy;
        }

        public int hashCode() {
            DeepLink deepLink = this.deepLink;
            int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
            Description description = this.description;
            int iHashCode2 = (iHashCode + (description == null ? 0 : description.hashCode())) * 31;
            ButtonIcon buttonIcon = this.icon;
            int iHashCode3 = (iHashCode2 + (buttonIcon == null ? 0 : buttonIcon.hashCode())) * 31;
            OwnershipDiscrepancy ownershipDiscrepancy = this.ownershipDiscrepancy;
            return iHashCode3 + (ownershipDiscrepancy != null ? ownershipDiscrepancy.hashCode() : 0);
        }

        @k
        public String toString() {
            return "Button(deepLink=" + this.deepLink + ", description=" + this.description + ", icon=" + this.icon + ", ownershipDiscrepancy=" + this.ownershipDiscrepancy + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.deepLink, flags);
            Description description = this.description;
            if (description == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                description.writeToParcel(parcel, flags);
            }
            ButtonIcon buttonIcon = this.icon;
            if (buttonIcon == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                buttonIcon.writeToParcel(parcel, flags);
            }
            OwnershipDiscrepancy ownershipDiscrepancy = this.ownershipDiscrepancy;
            if (ownershipDiscrepancy == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                ownershipDiscrepancy.writeToParcel(parcel, flags);
            }
        }

        public Button(@l DeepLink deepLink, @l Description description, @l ButtonIcon buttonIcon, @l OwnershipDiscrepancy ownershipDiscrepancy) {
            this.deepLink = deepLink;
            this.description = description;
            this.icon = buttonIcon;
            this.ownershipDiscrepancy = ownershipDiscrepancy;
        }

        /* compiled from: AdvertParameters.kt */
        @d
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/AdvertParameters$Button$ButtonIcon;", "Landroid/os/Parcelable;", "", "color", "name", "Lcom/avito/android/remote/model/AdvertParameters$Button$IconPosition;", "position", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/AdvertParameters$Button$IconPosition;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/AdvertParameters$Button$IconPosition;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/AdvertParameters$Button$IconPosition;)Lcom/avito/android/remote/model/AdvertParameters$Button$ButtonIcon;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getColor", "getName", "Lcom/avito/android/remote/model/AdvertParameters$Button$IconPosition;", "getPosition", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ButtonIcon implements Parcelable {

            @k
            public static final Parcelable.Creator<ButtonIcon> CREATOR = new Creator();

            @c("color")
            @k
            private final String color;

            @c("name")
            @k
            private final String name;

            @c("position")
            @l
            private final IconPosition position;

            /* compiled from: AdvertParameters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ButtonIcon> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ButtonIcon createFromParcel(@k Parcel parcel) {
                    return new ButtonIcon(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : IconPosition.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ButtonIcon[] newArray(int i12) {
                    return new ButtonIcon[i12];
                }
            }

            public ButtonIcon(@k String str, @k String str2, @l IconPosition iconPosition) {
                this.color = str;
                this.name = str2;
                this.position = iconPosition;
            }

            public static /* synthetic */ ButtonIcon copy$default(ButtonIcon buttonIcon, String str, String str2, IconPosition iconPosition, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = buttonIcon.color;
                }
                if ((i12 & 2) != 0) {
                    str2 = buttonIcon.name;
                }
                if ((i12 & 4) != 0) {
                    iconPosition = buttonIcon.position;
                }
                return buttonIcon.copy(str, str2, iconPosition);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getColor() {
                return this.color;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getName() {
                return this.name;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final IconPosition getPosition() {
                return this.position;
            }

            @k
            public final ButtonIcon copy(@k String color, @k String name, @l IconPosition position) {
                return new ButtonIcon(color, name, position);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ButtonIcon)) {
                    return false;
                }
                ButtonIcon buttonIcon = (ButtonIcon) other;
                return L.f(this.color, buttonIcon.color) && L.f(this.name, buttonIcon.name) && this.position == buttonIcon.position;
            }

            @k
            public final String getColor() {
                return this.color;
            }

            @k
            public final String getName() {
                return this.name;
            }

            @l
            public final IconPosition getPosition() {
                return this.position;
            }

            public int hashCode() {
                int iD2 = H.d(this.color.hashCode() * 31, 31, this.name);
                IconPosition iconPosition = this.position;
                return iD2 + (iconPosition == null ? 0 : iconPosition.hashCode());
            }

            @k
            public String toString() {
                return "ButtonIcon(color=" + this.color + ", name=" + this.name + ", position=" + this.position + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.color);
                parcel.writeString(this.name);
                IconPosition iconPosition = this.position;
                if (iconPosition == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    iconPosition.writeToParcel(parcel, flags);
                }
            }

            public /* synthetic */ ButtonIcon(String str, String str2, IconPosition iconPosition, int i12, C42822w c42822w) {
                this(str, str2, (i12 & 4) != 0 ? null : iconPosition);
            }
        }

        public /* synthetic */ Button(DeepLink deepLink, Description description, ButtonIcon buttonIcon, OwnershipDiscrepancy ownershipDiscrepancy, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : deepLink, (i12 & 2) != 0 ? null : description, (i12 & 4) != 0 ? null : buttonIcon, (i12 & 8) != 0 ? null : ownershipDiscrepancy);
        }
    }

    /* compiled from: AdvertParameters.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertParameters> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertParameters createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int i12 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i12);
            int iC2 = 0;
            int iC3 = 0;
            while (iC3 != i12) {
                iC3 = com.avito.android.actions_sheet.a.c(Parameter.CREATOR, parcel, arrayList3, iC3, 1);
            }
            int i13 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i13);
            int iC4 = 0;
            while (iC4 != i13) {
                iC4 = com.avito.android.actions_sheet.a.c(Group.CREATOR, parcel, arrayList4, iC4, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iC5 = 0;
                while (iC5 != i14) {
                    iC5 = com.avito.android.actions_sheet.a.c(FlatSection.CREATOR, parcel, arrayList, iC5, 1);
                }
            }
            AttributedText attributedText = (AttributedText) parcel.readParcelable(AdvertParameters.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(AdvertParameters.class.getClassLoader());
            AdvertEquipments advertEquipmentsCreateFromParcel = parcel.readInt() == 0 ? null : AdvertEquipments.CREATOR.createFromParcel(parcel);
            PriceList priceListCreateFromParcel = parcel.readInt() == 0 ? null : PriceList.CREATOR.createFromParcel(parcel);
            ServiceEducation serviceEducationCreateFromParcel = parcel.readInt() == 0 ? null : ServiceEducation.CREATOR.createFromParcel(parcel);
            AdvertPriceListPreviewResponse advertPriceListPreviewResponseCreateFromParcel = parcel.readInt() == 0 ? null : AdvertPriceListPreviewResponse.CREATOR.createFromParcel(parcel);
            ExpandItemsButton expandItemsButtonCreateFromParcel = parcel.readInt() == 0 ? null : ExpandItemsButton.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i15 = parcel.readInt();
                arrayList2 = new ArrayList(i15);
                while (iC2 != i15) {
                    iC2 = com.avito.android.actions_sheet.a.c(WorkingCondition.CREATOR, parcel, arrayList2, iC2, 1);
                }
            }
            return new AdvertParameters(arrayList3, arrayList4, arrayList, attributedText, attributedText2, advertEquipmentsCreateFromParcel, priceListCreateFromParcel, serviceEducationCreateFromParcel, advertPriceListPreviewResponseCreateFromParcel, expandItemsButtonCreateFromParcel, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertParameters[] newArray(int i12) {
            return new AdvertParameters[i12];
        }
    }

    /* compiled from: AdvertParameters.kt */
    @d
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/model/AdvertParameters$Group;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/remote/model/AdvertParameters$Parameter;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "getParameters", "()Ljava/util/List;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Group implements Parcelable {

        @k
        public static final Parcelable.Creator<Group> CREATOR = new Creator();

        @c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
        @k
        private final List<Parameter> parameters;

        @c("title")
        @k
        private final String title;

        /* compiled from: AdvertParameters.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Group> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Group createFromParcel(@k Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Parameter.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new Group(string, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Group[] newArray(int i12) {
                return new Group[i12];
            }
        }

        public Group(@k String str, @k List<Parameter> list) {
            this.title = str;
            this.parameters = list;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final List<Parameter> getParameters() {
            return this.parameters;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            Iterator itJ = C0.j(this.parameters, parcel);
            while (itJ.hasNext()) {
                ((Parameter) itJ.next()).writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: AdvertParameters.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/AdvertParameters$WorkingCondition;", "Landroid/os/Parcelable;", "", "iconName", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/AdvertParameters$WorkingCondition;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getIconName", "getText", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class WorkingCondition implements Parcelable {

        @k
        public static final Parcelable.Creator<WorkingCondition> CREATOR = new Creator();

        @c("iconName")
        @k
        private final String iconName;

        @c("text")
        @k
        private final String text;

        /* compiled from: AdvertParameters.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<WorkingCondition> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final WorkingCondition createFromParcel(@k Parcel parcel) {
                return new WorkingCondition(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final WorkingCondition[] newArray(int i12) {
                return new WorkingCondition[i12];
            }
        }

        public WorkingCondition(@k String str, @k String str2) {
            this.iconName = str;
            this.text = str2;
        }

        public static /* synthetic */ WorkingCondition copy$default(WorkingCondition workingCondition, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = workingCondition.iconName;
            }
            if ((i12 & 2) != 0) {
                str2 = workingCondition.text;
            }
            return workingCondition.copy(str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getIconName() {
            return this.iconName;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        public final WorkingCondition copy(@k String iconName, @k String text) {
            return new WorkingCondition(iconName, text);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WorkingCondition)) {
                return false;
            }
            WorkingCondition workingCondition = (WorkingCondition) other;
            return L.f(this.iconName, workingCondition.iconName) && L.f(this.text, workingCondition.text);
        }

        @k
        public final String getIconName() {
            return this.iconName;
        }

        @k
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + (this.iconName.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("WorkingCondition(iconName=");
            sb2.append(this.iconName);
            sb2.append(", text=");
            return C22026a.c(sb2, this.text, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.iconName);
            parcel.writeString(this.text);
        }
    }

    public AdvertParameters(@k List<Parameter> list, @k List<Group> list2, @l List<FlatSection> list3, @l AttributedText attributedText, @l AttributedText attributedText2, @l AdvertEquipments advertEquipments, @l PriceList priceList, @l ServiceEducation serviceEducation, @l AdvertPriceListPreviewResponse advertPriceListPreviewResponse, @l ExpandItemsButton expandItemsButton, @l List<WorkingCondition> list4) {
        this.flat = list;
        this.groups = list2;
        this.flatSections = list3;
        this.flatTitle = attributedText;
        this.flatsDisclaimer = attributedText2;
        this.equipments = advertEquipments;
        this.priceList = priceList;
        this.serviceEducation = serviceEducation;
        this.priceListPreview = advertPriceListPreviewResponse;
        this.expandParamsButton = expandItemsButton;
        this.workingConditions = list4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final AdvertEquipments getEquipments() {
        return this.equipments;
    }

    @l
    public final ExpandItemsButton getExpandParamsButton() {
        return this.expandParamsButton;
    }

    @k
    public final List<Parameter> getFlat() {
        return this.flat;
    }

    @l
    public final List<FlatSection> getFlatSections() {
        return this.flatSections;
    }

    @l
    public final AttributedText getFlatTitle() {
        return this.flatTitle;
    }

    @l
    public final AttributedText getFlatsDisclaimer() {
        return this.flatsDisclaimer;
    }

    @k
    public final List<Group> getGroups() {
        return this.groups;
    }

    @l
    public final PriceList getPriceList() {
        return this.priceList;
    }

    @l
    public final AdvertPriceListPreviewResponse getPriceListPreview() {
        return this.priceListPreview;
    }

    @l
    public final ServiceEducation getServiceEducation() {
        return this.serviceEducation;
    }

    @l
    public final List<WorkingCondition> getWorkingConditions() {
        return this.workingConditions;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.flat, parcel);
        while (itJ.hasNext()) {
            ((Parameter) itJ.next()).writeToParcel(parcel, flags);
        }
        Iterator itJ2 = C0.j(this.groups, parcel);
        while (itJ2.hasNext()) {
            ((Group) itJ2.next()).writeToParcel(parcel, flags);
        }
        List<FlatSection> list = this.flatSections;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((FlatSection) itA.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeParcelable(this.flatTitle, flags);
        parcel.writeParcelable(this.flatsDisclaimer, flags);
        AdvertEquipments advertEquipments = this.equipments;
        if (advertEquipments == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            advertEquipments.writeToParcel(parcel, flags);
        }
        PriceList priceList = this.priceList;
        if (priceList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            priceList.writeToParcel(parcel, flags);
        }
        ServiceEducation serviceEducation = this.serviceEducation;
        if (serviceEducation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serviceEducation.writeToParcel(parcel, flags);
        }
        AdvertPriceListPreviewResponse advertPriceListPreviewResponse = this.priceListPreview;
        if (advertPriceListPreviewResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            advertPriceListPreviewResponse.writeToParcel(parcel, flags);
        }
        ExpandItemsButton expandItemsButton = this.expandParamsButton;
        if (expandItemsButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            expandItemsButton.writeToParcel(parcel, flags);
        }
        List<WorkingCondition> list2 = this.workingConditions;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            ((WorkingCondition) itA2.next()).writeToParcel(parcel, flags);
        }
    }

    /* compiled from: AdvertParameters.kt */
    @d
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0010¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/AdvertParameters$FlatSection;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "", "", Navigation.ATTRIBUTES, "Lcom/avito/android/remote/model/ExpandItemsButton;", "expandParamsButton", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/ExpandItemsButton;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "()Ljava/util/List;", "component3", "()Lcom/avito/android/remote/model/ExpandItemsButton;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/ExpandItemsButton;)Lcom/avito/android/remote/model/AdvertParameters$FlatSection;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "Ljava/util/List;", "getAttributes", "Lcom/avito/android/remote/model/ExpandItemsButton;", "getExpandParamsButton", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FlatSection implements Parcelable {

        @k
        public static final Parcelable.Creator<FlatSection> CREATOR = new Creator();

        @c(Navigation.ATTRIBUTES)
        @k
        private final List<String> attributes;

        @c("expandButton")
        @l
        private final ExpandItemsButton expandParamsButton;

        @c("title")
        @k
        private final AttributedText title;

        /* compiled from: AdvertParameters.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FlatSection> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FlatSection createFromParcel(@k Parcel parcel) {
                return new FlatSection((AttributedText) parcel.readParcelable(FlatSection.class.getClassLoader()), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : ExpandItemsButton.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FlatSection[] newArray(int i12) {
                return new FlatSection[i12];
            }
        }

        public FlatSection(@k AttributedText attributedText, @k List<String> list, @l ExpandItemsButton expandItemsButton) {
            this.title = attributedText;
            this.attributes = list;
            this.expandParamsButton = expandItemsButton;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FlatSection copy$default(FlatSection flatSection, AttributedText attributedText, List list, ExpandItemsButton expandItemsButton, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                attributedText = flatSection.title;
            }
            if ((i12 & 2) != 0) {
                list = flatSection.attributes;
            }
            if ((i12 & 4) != 0) {
                expandItemsButton = flatSection.expandParamsButton;
            }
            return flatSection.copy(attributedText, list, expandItemsButton);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final AttributedText getTitle() {
            return this.title;
        }

        @k
        public final List<String> component2() {
            return this.attributes;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final ExpandItemsButton getExpandParamsButton() {
            return this.expandParamsButton;
        }

        @k
        public final FlatSection copy(@k AttributedText title, @k List<String> attributes, @l ExpandItemsButton expandParamsButton) {
            return new FlatSection(title, attributes, expandParamsButton);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FlatSection)) {
                return false;
            }
            FlatSection flatSection = (FlatSection) other;
            return L.f(this.title, flatSection.title) && L.f(this.attributes, flatSection.attributes) && L.f(this.expandParamsButton, flatSection.expandParamsButton);
        }

        @k
        public final List<String> getAttributes() {
            return this.attributes;
        }

        @l
        public final ExpandItemsButton getExpandParamsButton() {
            return this.expandParamsButton;
        }

        @k
        public final AttributedText getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iE2 = H.e(this.title.hashCode() * 31, 31, this.attributes);
            ExpandItemsButton expandItemsButton = this.expandParamsButton;
            return iE2 + (expandItemsButton == null ? 0 : expandItemsButton.hashCode());
        }

        @k
        public String toString() {
            return "FlatSection(title=" + this.title + ", attributes=" + this.attributes + ", expandParamsButton=" + this.expandParamsButton + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.title, flags);
            parcel.writeStringList(this.attributes);
            ExpandItemsButton expandItemsButton = this.expandParamsButton;
            if (expandItemsButton == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                expandItemsButton.writeToParcel(parcel, flags);
            }
        }

        public /* synthetic */ FlatSection(AttributedText attributedText, List list, ExpandItemsButton expandItemsButton, int i12, C42822w c42822w) {
            this(attributedText, list, (i12 & 4) != 0 ? null : expandItemsButton);
        }
    }

    /* compiled from: AdvertParameters.kt */
    @d
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010Jf\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0010R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b1\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b6\u0010\u0010¨\u00067"}, d2 = {"Lcom/avito/android/remote/model/AdvertParameters$Parameter;", "Landroid/os/Parcelable;", "", "title", "", "subtitles", "description", "descriptionColor", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/remote/model/AdvertParameters$Button;", "button", "attributeId", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/AdvertParameters$Button;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component6", "()Lcom/avito/android/remote/model/AdvertParameters$Button;", "component7", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/AdvertParameters$Button;Ljava/lang/String;)Lcom/avito/android/remote/model/AdvertParameters$Parameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getSubtitles", "getDescription", "getDescriptionColor", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "Lcom/avito/android/remote/model/AdvertParameters$Button;", "getButton", "getAttributeId", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Parameter implements Parcelable {

        @k
        public static final Parcelable.Creator<Parameter> CREATOR = new Creator();

        @c("attributeId")
        @l
        private final String attributeId;

        @c("button")
        @l
        private final Button button;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink deepLink;

        @c("description")
        @l
        private final String description;

        @c("descriptionColor")
        @l
        private final String descriptionColor;

        @com.avito.android.gson.c
        @c("subtitles")
        @k
        private final List<String> subtitles;

        @com.avito.android.gson.c
        @c("title")
        @k
        private final String title;

        /* compiled from: AdvertParameters.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Parameter> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Parameter createFromParcel(@k Parcel parcel) {
                return new Parameter(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(Parameter.class.getClassLoader()), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Parameter[] newArray(int i12) {
                return new Parameter[i12];
            }
        }

        public Parameter(@k String str, @k List<String> list, @l String str2, @l String str3, @l DeepLink deepLink, @l Button button, @l String str4) {
            this.title = str;
            this.subtitles = list;
            this.description = str2;
            this.descriptionColor = str3;
            this.deepLink = deepLink;
            this.button = button;
            this.attributeId = str4;
        }

        public static /* synthetic */ Parameter copy$default(Parameter parameter, String str, List list, String str2, String str3, DeepLink deepLink, Button button, String str4, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = parameter.title;
            }
            if ((i12 & 2) != 0) {
                list = parameter.subtitles;
            }
            List list2 = list;
            if ((i12 & 4) != 0) {
                str2 = parameter.description;
            }
            String str5 = str2;
            if ((i12 & 8) != 0) {
                str3 = parameter.descriptionColor;
            }
            String str6 = str3;
            if ((i12 & 16) != 0) {
                deepLink = parameter.deepLink;
            }
            DeepLink deepLink2 = deepLink;
            if ((i12 & 32) != 0) {
                button = parameter.button;
            }
            Button button2 = button;
            if ((i12 & 64) != 0) {
                str4 = parameter.attributeId;
            }
            return parameter.copy(str, list2, str5, str6, deepLink2, button2, str4);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        public final List<String> component2() {
            return this.subtitles;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getDescriptionColor() {
            return this.descriptionColor;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final Button getButton() {
            return this.button;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final String getAttributeId() {
            return this.attributeId;
        }

        @k
        public final Parameter copy(@k String title, @k List<String> subtitles, @l String description, @l String descriptionColor, @l DeepLink deepLink, @l Button button, @l String attributeId) {
            return new Parameter(title, subtitles, description, descriptionColor, deepLink, button, attributeId);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Parameter)) {
                return false;
            }
            Parameter parameter = (Parameter) other;
            return L.f(this.title, parameter.title) && L.f(this.subtitles, parameter.subtitles) && L.f(this.description, parameter.description) && L.f(this.descriptionColor, parameter.descriptionColor) && L.f(this.deepLink, parameter.deepLink) && L.f(this.button, parameter.button) && L.f(this.attributeId, parameter.attributeId);
        }

        @l
        public final String getAttributeId() {
            return this.attributeId;
        }

        @l
        public final Button getButton() {
            return this.button;
        }

        @l
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        public final String getDescription() {
            return this.description;
        }

        @l
        public final String getDescriptionColor() {
            return this.descriptionColor;
        }

        @k
        public final List<String> getSubtitles() {
            return this.subtitles;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iE2 = H.e(this.title.hashCode() * 31, 31, this.subtitles);
            String str = this.description;
            int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.descriptionColor;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            DeepLink deepLink = this.deepLink;
            int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            Button button = this.button;
            int iHashCode4 = (iHashCode3 + (button == null ? 0 : button.hashCode())) * 31;
            String str3 = this.attributeId;
            return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Parameter(title=");
            sb2.append(this.title);
            sb2.append(", subtitles=");
            sb2.append(this.subtitles);
            sb2.append(", description=");
            sb2.append(this.description);
            sb2.append(", descriptionColor=");
            sb2.append(this.descriptionColor);
            sb2.append(", deepLink=");
            sb2.append(this.deepLink);
            sb2.append(", button=");
            sb2.append(this.button);
            sb2.append(", attributeId=");
            return C22026a.c(sb2, this.attributeId, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeStringList(this.subtitles);
            parcel.writeString(this.description);
            parcel.writeString(this.descriptionColor);
            parcel.writeParcelable(this.deepLink, flags);
            Button button = this.button;
            if (button == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                button.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.attributeId);
        }

        public /* synthetic */ Parameter(String str, List list, String str2, String str3, DeepLink deepLink, Button button, String str4, int i12, C42822w c42822w) {
            this(str, list, str2, (i12 & 8) != 0 ? null : str3, deepLink, (i12 & 32) != 0 ? null : button, (i12 & 64) != 0 ? null : str4);
        }
    }

    public /* synthetic */ AdvertParameters(List list, List list2, List list3, AttributedText attributedText, AttributedText attributedText2, AdvertEquipments advertEquipments, PriceList priceList, ServiceEducation serviceEducation, AdvertPriceListPreviewResponse advertPriceListPreviewResponse, ExpandItemsButton expandItemsButton, List list4, int i12, C42822w c42822w) {
        this(list, list2, (i12 & 4) != 0 ? null : list3, (i12 & 8) != 0 ? null : attributedText, (i12 & 16) != 0 ? null : attributedText2, (i12 & 32) != 0 ? null : advertEquipments, (i12 & 64) != 0 ? null : priceList, (i12 & 128) != 0 ? null : serviceEducation, (i12 & 256) != 0 ? null : advertPriceListPreviewResponse, (i12 & 512) != 0 ? null : expandItemsButton, (i12 & 1024) != 0 ? null : list4);
    }
}

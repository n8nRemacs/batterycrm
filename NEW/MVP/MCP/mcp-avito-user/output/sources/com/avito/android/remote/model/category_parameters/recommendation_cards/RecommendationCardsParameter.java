package com.avito.android.remote.model.category_parameters.recommendation_cards;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19824b;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.Phantom;
import com.avito.android.remote.model.category_parameters.base.Visibility;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: RecommendationCardsParameter.kt */
@d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\b\u0007\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0003?@ABe\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\"\u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\n\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b,\u0010%R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b-\u0010%R\u001a\u0010\u000f\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b.\u0010(R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b0\u00101R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00102\u001a\u0004\b3\u00104R*\u00105\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b5\u00106\u0012\u0004\b;\u0010<\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010!¨\u0006B"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/recommendation_cards/RecommendationCardsParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "Lkotlin/G0;", "Lcom/avito/android/remote/model/category_parameters/base/Visibility;", "Lcom/avito/android/remote/model/category_parameters/base/Phantom;", "", "id", "title", "", "updatesForm", "immutable", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "visible", "phantom", "required", "Lcom/avito/android/remote/model/category_parameters/recommendation_cards/RecommendationCardsParameter$Displaying;", Navigation.DISPLAYING, "", "Lcom/avito/android/remote/model/category_parameters/recommendation_cards/RecommendationCardsParameter$ParameterCard;", "values", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLcom/avito/android/remote/model/text/AttributedText;ZLjava/lang/Boolean;ZLcom/avito/android/remote/model/category_parameters/recommendation_cards/RecommendationCardsParameter$Displaying;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTitle", "Ljava/lang/Boolean;", "getUpdatesForm", "()Ljava/lang/Boolean;", "Z", "getImmutable", "()Z", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "()Lcom/avito/android/remote/model/text/AttributedText;", "getVisible", "getPhantom", "getRequired", "Lcom/avito/android/remote/model/category_parameters/recommendation_cards/RecommendationCardsParameter$Displaying;", "getDisplaying", "()Lcom/avito/android/remote/model/category_parameters/recommendation_cards/RecommendationCardsParameter$Displaying;", "Ljava/util/List;", "getValues", "()Ljava/util/List;", "_value", "Lkotlin/G0;", "get_value", "()Lkotlin/G0;", "set_value", "(Lkotlin/G0;)V", "get_value$annotations", "()V", "getType", "type", "Companion", "Displaying", "ParameterCard", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RecommendationCardsParameter extends EditableParameter<G0> implements Visibility, Phantom {

    @k
    public static final String TYPE = "parameterCards";

    @l
    private G0 _value = G0.f406611a;

    @c(Navigation.DISPLAYING)
    @l
    private final Displaying displaying;

    @c("id")
    @k
    private final String id;

    @c("immutable")
    private final boolean immutable;

    @c("motivation")
    @l
    private final AttributedText motivation;

    @c("phantom")
    @l
    private final Boolean phantom;

    @c("required")
    private final boolean required;

    @c("title")
    @k
    private final String title;

    @c("updatesForm")
    @l
    private final Boolean updatesForm;

    @c("values")
    @k
    private final List<ParameterCard> values;

    @c("visible")
    private final boolean visible;

    @k
    public static final Parcelable.Creator<RecommendationCardsParameter> CREATOR = new Creator();

    /* compiled from: RecommendationCardsParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RecommendationCardsParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RecommendationCardsParameter createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            boolean z12 = parcel.readInt() != 0;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(RecommendationCardsParameter.class.getClassLoader());
            boolean z13 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            boolean z14 = parcel.readInt() != 0;
            Displaying displayingCreateFromParcel = parcel.readInt() != 0 ? Displaying.CREATOR.createFromParcel(parcel) : null;
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            while (iL2 != i12) {
                iL2 = a.l(RecommendationCardsParameter.class, parcel, arrayList, iL2, 1);
            }
            return new RecommendationCardsParameter(string, string2, boolValueOf, z12, attributedText, z13, boolValueOf2, z14, displayingCreateFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RecommendationCardsParameter[] newArray(int i12) {
            return new RecommendationCardsParameter[i12];
        }
    }

    /* compiled from: RecommendationCardsParameter.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/recommendation_cards/RecommendationCardsParameter$Displaying;", "Landroid/os/Parcelable;", "", "itemsStyle", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getItemsStyle", "()Ljava/lang/String;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Displaying implements Parcelable {

        @k
        public static final Parcelable.Creator<Displaying> CREATOR = new Creator();

        @c("itemsStyle")
        @l
        private final String itemsStyle;

        /* compiled from: RecommendationCardsParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Displaying> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Displaying createFromParcel(@k Parcel parcel) {
                return new Displaying(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Displaying[] newArray(int i12) {
                return new Displaying[i12];
            }
        }

        public Displaying(@l String str) {
            this.itemsStyle = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final String getItemsStyle() {
            return this.itemsStyle;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.itemsStyle);
        }
    }

    /* compiled from: RecommendationCardsParameter.kt */
    @InterfaceC19824b
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0017\u0018R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u00020\rX¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0005R\u0012\u0010\u0013\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0005R\u0012\u0010\u0015\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0005\u0082\u0001\u0002\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/recommendation_cards/RecommendationCardsParameter$ParameterCard;", "Landroid/os/Parcelable;", "formParameterId", "", "getFormParameterId", "()Ljava/lang/String;", "icon", "getIcon", "iconColor", "Lcom/avito/android/remote/model/UniversalColor;", "getIconColor", "()Lcom/avito/android/remote/model/UniversalColor;", "isSelected", "", "()Z", "setSelected", "(Z)V", "parameterId", "getParameterId", "title", "getTitle", "type", "getType", "MultiSelect", "Select", "Lcom/avito/android/remote/model/category_parameters/recommendation_cards/RecommendationCardsParameter$ParameterCard$MultiSelect;", "Lcom/avito/android/remote/model/category_parameters/recommendation_cards/RecommendationCardsParameter$ParameterCard$Select;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ParameterCard extends Parcelable {

        /* compiled from: RecommendationCardsParameter.kt */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\"\u0010\n\u001a\u00020\t8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\n\u0010 \u001a\u0004\b\n\u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b$\u0010\u0019R\u0014\u0010&\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0019¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/category_parameters/recommendation_cards/RecommendationCardsParameter$ParameterCard$MultiSelect;", "Lcom/avito/android/remote/model/category_parameters/recommendation_cards/RecommendationCardsParameter$ParameterCard;", "", "formParameterId", "parameterId", "icon", "Lcom/avito/android/remote/model/UniversalColor;", "iconColor", "title", "", "isSelected", "values", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;ZLjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFormParameterId", "()Ljava/lang/String;", "getParameterId", "getIcon", "Lcom/avito/android/remote/model/UniversalColor;", "getIconColor", "()Lcom/avito/android/remote/model/UniversalColor;", "getTitle", "Z", "()Z", "setSelected", "(Z)V", "getValues", "getType", "type", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final class MultiSelect implements ParameterCard {

            @k
            public static final String TYPE = "multiselect";

            @c("formParameterId")
            @k
            private final String formParameterId;

            @c("icon")
            @k
            private final String icon;

            @c("iconColor")
            @l
            private final UniversalColor iconColor;

            @c("selected")
            private boolean isSelected;

            @c("parameterId")
            @l
            private final String parameterId;

            @c("title")
            @k
            private final String title;

            @c("id")
            @k
            private final String values;

            @k
            public static final Parcelable.Creator<MultiSelect> CREATOR = new Creator();

            /* compiled from: RecommendationCardsParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<MultiSelect> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final MultiSelect createFromParcel(@k Parcel parcel) {
                    return new MultiSelect(parcel.readString(), parcel.readString(), parcel.readString(), (UniversalColor) parcel.readParcelable(MultiSelect.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final MultiSelect[] newArray(int i12) {
                    return new MultiSelect[i12];
                }
            }

            public MultiSelect(@k String str, @l String str2, @k String str3, @l UniversalColor universalColor, @k String str4, boolean z12, @k String str5) {
                this.formParameterId = str;
                this.parameterId = str2;
                this.icon = str3;
                this.iconColor = universalColor;
                this.title = str4;
                this.isSelected = z12;
                this.values = str5;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.avito.android.remote.model.category_parameters.recommendation_cards.RecommendationCardsParameter.ParameterCard
            @k
            public String getFormParameterId() {
                return this.formParameterId;
            }

            @Override // com.avito.android.remote.model.category_parameters.recommendation_cards.RecommendationCardsParameter.ParameterCard
            @k
            public String getIcon() {
                return this.icon;
            }

            @Override // com.avito.android.remote.model.category_parameters.recommendation_cards.RecommendationCardsParameter.ParameterCard
            @l
            public UniversalColor getIconColor() {
                return this.iconColor;
            }

            @Override // com.avito.android.remote.model.category_parameters.recommendation_cards.RecommendationCardsParameter.ParameterCard
            @l
            public String getParameterId() {
                return this.parameterId;
            }

            @Override // com.avito.android.remote.model.category_parameters.recommendation_cards.RecommendationCardsParameter.ParameterCard
            @k
            public String getTitle() {
                return this.title;
            }

            @Override // com.avito.android.remote.model.category_parameters.recommendation_cards.RecommendationCardsParameter.ParameterCard
            @k
            public String getType() {
                return "multiselect";
            }

            @k
            public final String getValues() {
                return this.values;
            }

            @Override // com.avito.android.remote.model.category_parameters.recommendation_cards.RecommendationCardsParameter.ParameterCard
            /* renamed from: isSelected, reason: from getter */
            public boolean getIsSelected() {
                return this.isSelected;
            }

            @Override // com.avito.android.remote.model.category_parameters.recommendation_cards.RecommendationCardsParameter.ParameterCard
            public void setSelected(boolean z12) {
                this.isSelected = z12;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.formParameterId);
                parcel.writeString(this.parameterId);
                parcel.writeString(this.icon);
                parcel.writeParcelable(this.iconColor, flags);
                parcel.writeString(this.title);
                parcel.writeInt(this.isSelected ? 1 : 0);
                parcel.writeString(this.values);
            }
        }

        /* compiled from: RecommendationCardsParameter.kt */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\"\u0010\n\u001a\u00020\t8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\n\u0010 \u001a\u0004\b\n\u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b$\u0010\u0019R\u0014\u0010&\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0019¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/category_parameters/recommendation_cards/RecommendationCardsParameter$ParameterCard$Select;", "Lcom/avito/android/remote/model/category_parameters/recommendation_cards/RecommendationCardsParameter$ParameterCard;", "", "formParameterId", "parameterId", "icon", "Lcom/avito/android/remote/model/UniversalColor;", "iconColor", "title", "", "isSelected", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;ZLjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFormParameterId", "()Ljava/lang/String;", "getParameterId", "getIcon", "Lcom/avito/android/remote/model/UniversalColor;", "getIconColor", "()Lcom/avito/android/remote/model/UniversalColor;", "getTitle", "Z", "()Z", "setSelected", "(Z)V", "getValue", "getType", "type", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final class Select implements ParameterCard {

            @k
            public static final String TYPE = "select";

            @c("formParameterId")
            @k
            private final String formParameterId;

            @c("icon")
            @k
            private final String icon;

            @c("iconColor")
            @l
            private final UniversalColor iconColor;

            @c("selected")
            private boolean isSelected;

            @c("parameterId")
            @l
            private final String parameterId;

            @c("title")
            @k
            private final String title;

            @c("id")
            @k
            private final String value;

            @k
            public static final Parcelable.Creator<Select> CREATOR = new Creator();

            /* compiled from: RecommendationCardsParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Select> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Select createFromParcel(@k Parcel parcel) {
                    return new Select(parcel.readString(), parcel.readString(), parcel.readString(), (UniversalColor) parcel.readParcelable(Select.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Select[] newArray(int i12) {
                    return new Select[i12];
                }
            }

            public Select(@k String str, @l String str2, @k String str3, @l UniversalColor universalColor, @k String str4, boolean z12, @k String str5) {
                this.formParameterId = str;
                this.parameterId = str2;
                this.icon = str3;
                this.iconColor = universalColor;
                this.title = str4;
                this.isSelected = z12;
                this.value = str5;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.avito.android.remote.model.category_parameters.recommendation_cards.RecommendationCardsParameter.ParameterCard
            @k
            public String getFormParameterId() {
                return this.formParameterId;
            }

            @Override // com.avito.android.remote.model.category_parameters.recommendation_cards.RecommendationCardsParameter.ParameterCard
            @k
            public String getIcon() {
                return this.icon;
            }

            @Override // com.avito.android.remote.model.category_parameters.recommendation_cards.RecommendationCardsParameter.ParameterCard
            @l
            public UniversalColor getIconColor() {
                return this.iconColor;
            }

            @Override // com.avito.android.remote.model.category_parameters.recommendation_cards.RecommendationCardsParameter.ParameterCard
            @l
            public String getParameterId() {
                return this.parameterId;
            }

            @Override // com.avito.android.remote.model.category_parameters.recommendation_cards.RecommendationCardsParameter.ParameterCard
            @k
            public String getTitle() {
                return this.title;
            }

            @Override // com.avito.android.remote.model.category_parameters.recommendation_cards.RecommendationCardsParameter.ParameterCard
            @k
            public String getType() {
                return "select";
            }

            @k
            public final String getValue() {
                return this.value;
            }

            @Override // com.avito.android.remote.model.category_parameters.recommendation_cards.RecommendationCardsParameter.ParameterCard
            /* renamed from: isSelected, reason: from getter */
            public boolean getIsSelected() {
                return this.isSelected;
            }

            @Override // com.avito.android.remote.model.category_parameters.recommendation_cards.RecommendationCardsParameter.ParameterCard
            public void setSelected(boolean z12) {
                this.isSelected = z12;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.formParameterId);
                parcel.writeString(this.parameterId);
                parcel.writeString(this.icon);
                parcel.writeParcelable(this.iconColor, flags);
                parcel.writeString(this.title);
                parcel.writeInt(this.isSelected ? 1 : 0);
                parcel.writeString(this.value);
            }
        }

        @k
        String getFormParameterId();

        @k
        String getIcon();

        @l
        UniversalColor getIconColor();

        @l
        String getParameterId();

        @k
        String getTitle();

        @k
        String getType();

        /* renamed from: isSelected */
        boolean getIsSelected();

        void setSelected(boolean z12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendationCardsParameter(@k String str, @k String str2, @l Boolean bool, boolean z12, @l AttributedText attributedText, boolean z13, @l Boolean bool2, boolean z14, @l Displaying displaying, @k List<? extends ParameterCard> list) {
        this.id = str;
        this.title = str2;
        this.updatesForm = bool;
        this.immutable = z12;
        this.motivation = attributedText;
        this.visible = z13;
        this.phantom = bool2;
        this.required = z14;
        this.displaying = displaying;
        this.values = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Displaying getDisplaying() {
        return this.displaying;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.ParameterSlot
    @k
    public String getId() {
        return this.id;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    public boolean getImmutable() {
        return this.immutable;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @l
    public AttributedText getMotivation() {
        return this.motivation;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.Phantom
    @l
    public Boolean getPhantom() {
        return this.phantom;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    public boolean getRequired() {
        return this.required;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @k
    public String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @k
    public String getType() {
        return TYPE;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseEditableParameter
    @l
    public Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    @k
    public final List<ParameterCard> getValues() {
        return this.values;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.Visibility
    @k
    public Boolean getVisible() {
        return Boolean.valueOf(this.visible);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        Boolean bool = this.updatesForm;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeInt(this.immutable ? 1 : 0);
        parcel.writeParcelable(this.motivation, flags);
        parcel.writeInt(this.visible ? 1 : 0);
        Boolean bool2 = this.phantom;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        parcel.writeInt(this.required ? 1 : 0);
        Displaying displaying = this.displaying;
        if (displaying == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            displaying.writeToParcel(parcel, flags);
        }
        Iterator itJ = C0.j(this.values, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    @l
    public G0 get_value() {
        return this._value;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public void set_value(@l G0 g02) {
        this._value = g02;
    }

    public static /* synthetic */ void get_value$annotations() {
    }
}

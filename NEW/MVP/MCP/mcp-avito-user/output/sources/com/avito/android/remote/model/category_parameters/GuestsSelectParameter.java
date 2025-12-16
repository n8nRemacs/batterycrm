package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GuestsSelectParameter.kt */
@d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 P2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005PQRSTBw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0017J\u0012\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ\u0010\u0010$\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0098\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u0017J\u0010\u0010,\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b2\u0010-J \u00107\u001a\u0002062\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b7\u00108R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b;\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b=\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\b?\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b@\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bB\u0010\u001fR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\f\u00109\u001a\u0004\bC\u0010\u0017\"\u0004\bD\u0010ER\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010F\u001a\u0004\bG\u0010\"R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\bH\u0010\u001cR\u001a\u0010\u0010\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010I\u001a\u0004\bJ\u0010%R\u001a\u0010\u0011\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010I\u001a\u0004\bK\u0010%R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010L\u001a\u0004\bM\u0010(R\u0014\u0010O\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010\u0017¨\u0006U"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/GuestsSelectParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "", "id", "title", "", "attrId", "", "visible", "hasSuggest", "Lcom/avito/android/remote/model/category_parameters/GuestsSelectParameter$Displaying;", Navigation.DISPLAYING, "_value", "Lcom/avito/android/remote/model/category_parameters/GuestsSelectParameter$Widget;", "widget", "updatesForm", "required", "immutable", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/GuestsSelectParameter$Displaying;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/GuestsSelectParameter$Widget;Ljava/lang/Boolean;ZZLcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "()Lcom/avito/android/remote/model/category_parameters/GuestsSelectParameter$Displaying;", "component7", "component8", "()Lcom/avito/android/remote/model/category_parameters/GuestsSelectParameter$Widget;", "component9", "component10", "()Z", "component11", "component12", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/GuestsSelectParameter$Displaying;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/GuestsSelectParameter$Widget;Ljava/lang/Boolean;ZZLcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/category_parameters/GuestsSelectParameter;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Ljava/lang/Integer;", "getAttrId", "Ljava/lang/Boolean;", "getVisible", "getHasSuggest", "Lcom/avito/android/remote/model/category_parameters/GuestsSelectParameter$Displaying;", "getDisplaying", "get_value", "set_value", "(Ljava/lang/String;)V", "Lcom/avito/android/remote/model/category_parameters/GuestsSelectParameter$Widget;", "getWidget", "getUpdatesForm", "Z", "getRequired", "getImmutable", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "getType", "type", "Companion", "Config", "Displaying", "Field", "Widget", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GuestsSelectParameter extends EditableParameter<String> {

    @k
    public static final String TYPE = "guestsSelect";

    @c("value")
    @l
    private String _value;

    @c("attrId")
    @l
    private final Integer attrId;

    @c(Navigation.DISPLAYING)
    @l
    private final Displaying displaying;

    @c("hasSuggest")
    @l
    private final Boolean hasSuggest;

    @c("id")
    @k
    private final String id;

    @c("immutable")
    private final boolean immutable;

    @c("motivation")
    @l
    private final AttributedText motivation;

    @c("required")
    private final boolean required;

    @c("title")
    @k
    private final String title;

    @c("updatesForm")
    @l
    private final Boolean updatesForm;

    @c("visible")
    @l
    private final Boolean visible;

    @c("widget")
    @l
    private final Widget widget;

    @k
    public static final Parcelable.Creator<GuestsSelectParameter> CREATOR = new Creator();

    /* compiled from: GuestsSelectParameter.kt */
    @d
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJj\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0011J\u0010\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b)\u0010*R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0011R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b1\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b2\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b3\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u0010\u001a¨\u00066"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/GuestsSelectParameter$Config;", "Landroid/os/Parcelable;", "", "buttonTitle", "", "Lcom/avito/android/remote/model/category_parameters/GuestsSelectParameter$Field;", LocalPublishState.FIELDS, "", "maxGuests", "minGuests", "maxAdultsCount", "maxChildrenCount", "", "visible", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "component7", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/category_parameters/GuestsSelectParameter$Config;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getButtonTitle", "Ljava/util/List;", "getFields", "Ljava/lang/Integer;", "getMaxGuests", "getMinGuests", "getMaxAdultsCount", "getMaxChildrenCount", "Ljava/lang/Boolean;", "getVisible", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Config implements Parcelable {

        @k
        public static final Parcelable.Creator<Config> CREATOR = new Creator();

        @c("buttonTitle")
        @l
        private final String buttonTitle;

        @c(LocalPublishState.FIELDS)
        @l
        private final List<Field> fields;

        @c("maxAdultsCount")
        @l
        private final Integer maxAdultsCount;

        @c("maxChildrenCount")
        @l
        private final Integer maxChildrenCount;

        @c("maxGuests")
        @l
        private final Integer maxGuests;

        @c("minGuests")
        @l
        private final Integer minGuests;

        @c("visible")
        @l
        private final Boolean visible;

        /* compiled from: GuestsSelectParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Config> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Config createFromParcel(@k Parcel parcel) {
                ArrayList arrayList;
                Boolean boolValueOf;
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = a.c(Field.CREATOR, parcel, arrayList, iC2, 1);
                    }
                }
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Config(string, arrayList, numValueOf, numValueOf2, numValueOf3, numValueOf4, boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Config[] newArray(int i12) {
                return new Config[i12];
            }
        }

        public Config(@l String str, @l List<Field> list, @l Integer num, @l Integer num2, @l Integer num3, @l Integer num4, @l Boolean bool) {
            this.buttonTitle = str;
            this.fields = list;
            this.maxGuests = num;
            this.minGuests = num2;
            this.maxAdultsCount = num3;
            this.maxChildrenCount = num4;
            this.visible = bool;
        }

        public static /* synthetic */ Config copy$default(Config config, String str, List list, Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = config.buttonTitle;
            }
            if ((i12 & 2) != 0) {
                list = config.fields;
            }
            List list2 = list;
            if ((i12 & 4) != 0) {
                num = config.maxGuests;
            }
            Integer num5 = num;
            if ((i12 & 8) != 0) {
                num2 = config.minGuests;
            }
            Integer num6 = num2;
            if ((i12 & 16) != 0) {
                num3 = config.maxAdultsCount;
            }
            Integer num7 = num3;
            if ((i12 & 32) != 0) {
                num4 = config.maxChildrenCount;
            }
            Integer num8 = num4;
            if ((i12 & 64) != 0) {
                bool = config.visible;
            }
            return config.copy(str, list2, num5, num6, num7, num8, bool);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @l
        public final List<Field> component2() {
            return this.fields;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Integer getMaxGuests() {
            return this.maxGuests;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Integer getMinGuests() {
            return this.minGuests;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final Integer getMaxAdultsCount() {
            return this.maxAdultsCount;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final Integer getMaxChildrenCount() {
            return this.maxChildrenCount;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final Boolean getVisible() {
            return this.visible;
        }

        @k
        public final Config copy(@l String buttonTitle, @l List<Field> fields, @l Integer maxGuests, @l Integer minGuests, @l Integer maxAdultsCount, @l Integer maxChildrenCount, @l Boolean visible) {
            return new Config(buttonTitle, fields, maxGuests, minGuests, maxAdultsCount, maxChildrenCount, visible);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return L.f(this.buttonTitle, config.buttonTitle) && L.f(this.fields, config.fields) && L.f(this.maxGuests, config.maxGuests) && L.f(this.minGuests, config.minGuests) && L.f(this.maxAdultsCount, config.maxAdultsCount) && L.f(this.maxChildrenCount, config.maxChildrenCount) && L.f(this.visible, config.visible);
        }

        @l
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @l
        public final List<Field> getFields() {
            return this.fields;
        }

        @l
        public final Integer getMaxAdultsCount() {
            return this.maxAdultsCount;
        }

        @l
        public final Integer getMaxChildrenCount() {
            return this.maxChildrenCount;
        }

        @l
        public final Integer getMaxGuests() {
            return this.maxGuests;
        }

        @l
        public final Integer getMinGuests() {
            return this.minGuests;
        }

        @l
        public final Boolean getVisible() {
            return this.visible;
        }

        public int hashCode() {
            String str = this.buttonTitle;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<Field> list = this.fields;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            Integer num = this.maxGuests;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.minGuests;
            int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.maxAdultsCount;
            int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.maxChildrenCount;
            int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Boolean bool = this.visible;
            return iHashCode6 + (bool != null ? bool.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Config(buttonTitle=");
            sb2.append(this.buttonTitle);
            sb2.append(", fields=");
            sb2.append(this.fields);
            sb2.append(", maxGuests=");
            sb2.append(this.maxGuests);
            sb2.append(", minGuests=");
            sb2.append(this.minGuests);
            sb2.append(", maxAdultsCount=");
            sb2.append(this.maxAdultsCount);
            sb2.append(", maxChildrenCount=");
            sb2.append(this.maxChildrenCount);
            sb2.append(", visible=");
            return C0.g(sb2, this.visible, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.buttonTitle);
            List<Field> list = this.fields;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    ((Field) itA.next()).writeToParcel(parcel, flags);
                }
            }
            Integer num = this.maxGuests;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
            Integer num2 = this.minGuests;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num2);
            }
            Integer num3 = this.maxAdultsCount;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num3);
            }
            Integer num4 = this.maxChildrenCount;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num4);
            }
            Boolean bool = this.visible;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }
    }

    /* compiled from: GuestsSelectParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GuestsSelectParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GuestsSelectParameter createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Boolean boolValueOf3 = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
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
            Displaying displayingCreateFromParcel = parcel.readInt() == 0 ? null : Displaying.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            Widget widgetCreateFromParcel = parcel.readInt() == 0 ? null : Widget.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GuestsSelectParameter(string, string2, numValueOf, boolValueOf, boolValueOf2, displayingCreateFromParcel, string3, widgetCreateFromParcel, boolValueOf3, parcel.readInt() != 0, parcel.readInt() != 0, (AttributedText) parcel.readParcelable(GuestsSelectParameter.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GuestsSelectParameter[] newArray(int i12) {
            return new GuestsSelectParameter[i12];
        }
    }

    /* compiled from: GuestsSelectParameter.kt */
    @d
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/GuestsSelectParameter$Displaying;", "Landroid/os/Parcelable;", "", "visible", "<init>", "(Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Boolean;)Lcom/avito/android/remote/model/category_parameters/GuestsSelectParameter$Displaying;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "getVisible", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Displaying implements Parcelable {

        @k
        public static final Parcelable.Creator<Displaying> CREATOR = new Creator();

        @c("visible")
        @l
        private final Boolean visible;

        /* compiled from: GuestsSelectParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Displaying> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Displaying createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Displaying(boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Displaying[] newArray(int i12) {
                return new Displaying[i12];
            }
        }

        public Displaying(@l Boolean bool) {
            this.visible = bool;
        }

        public static /* synthetic */ Displaying copy$default(Displaying displaying, Boolean bool, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                bool = displaying.visible;
            }
            return displaying.copy(bool);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Boolean getVisible() {
            return this.visible;
        }

        @k
        public final Displaying copy(@l Boolean visible) {
            return new Displaying(visible);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Displaying) && L.f(this.visible, ((Displaying) other).visible);
        }

        @l
        public final Boolean getVisible() {
            return this.visible;
        }

        public int hashCode() {
            Boolean bool = this.visible;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        @k
        public String toString() {
            return C0.g(new StringBuilder("Displaying(visible="), this.visible, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Boolean bool = this.visible;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }
    }

    /* compiled from: GuestsSelectParameter.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/GuestsSelectParameter$Field;", "Landroid/os/Parcelable;", "", "id", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/GuestsSelectParameter$Field;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getValue", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Field implements Parcelable {

        @k
        public static final Parcelable.Creator<Field> CREATOR = new Creator();

        @c("id")
        @l
        private final String id;

        @c("value")
        @l
        private final String value;

        /* compiled from: GuestsSelectParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Field> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Field createFromParcel(@k Parcel parcel) {
                return new Field(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Field[] newArray(int i12) {
                return new Field[i12];
            }
        }

        public Field(@l String str, @l String str2) {
            this.id = str;
            this.value = str2;
        }

        public static /* synthetic */ Field copy$default(Field field, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = field.id;
            }
            if ((i12 & 2) != 0) {
                str2 = field.value;
            }
            return field.copy(str, str2);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @k
        public final Field copy(@l String id2, @l String value) {
            return new Field(id2, value);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Field)) {
                return false;
            }
            Field field = (Field) other;
            return L.f(this.id, field.id) && L.f(this.value, field.value);
        }

        @l
        public final String getId() {
            return this.id;
        }

        @l
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.value;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Field(id=");
            sb2.append(this.id);
            sb2.append(", value=");
            return C22026a.c(sb2, this.value, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.value);
        }
    }

    /* compiled from: GuestsSelectParameter.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/category_parameters/GuestsSelectParameter$Widget;", "Landroid/os/Parcelable;", "", "type", "Lcom/avito/android/remote/model/category_parameters/GuestsSelectParameter$Config;", Navigation.CONFIG, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/GuestsSelectParameter$Config;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/category_parameters/GuestsSelectParameter$Config;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/GuestsSelectParameter$Config;)Lcom/avito/android/remote/model/category_parameters/GuestsSelectParameter$Widget;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "Lcom/avito/android/remote/model/category_parameters/GuestsSelectParameter$Config;", "getConfig", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Widget implements Parcelable {

        @k
        public static final Parcelable.Creator<Widget> CREATOR = new Creator();

        @c(Navigation.CONFIG)
        @l
        private final Config config;

        @c("type")
        @l
        private final String type;

        /* compiled from: GuestsSelectParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Widget> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Widget createFromParcel(@k Parcel parcel) {
                return new Widget(parcel.readString(), parcel.readInt() == 0 ? null : Config.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Widget[] newArray(int i12) {
                return new Widget[i12];
            }
        }

        public Widget(@l String str, @l Config config) {
            this.type = str;
            this.config = config;
        }

        public static /* synthetic */ Widget copy$default(Widget widget, String str, Config config, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = widget.type;
            }
            if ((i12 & 2) != 0) {
                config = widget.config;
            }
            return widget.copy(str, config);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Config getConfig() {
            return this.config;
        }

        @k
        public final Widget copy(@l String type, @l Config config) {
            return new Widget(type, config);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Widget)) {
                return false;
            }
            Widget widget = (Widget) other;
            return L.f(this.type, widget.type) && L.f(this.config, widget.config);
        }

        @l
        public final Config getConfig() {
            return this.config;
        }

        @l
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.type;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Config config = this.config;
            return iHashCode + (config != null ? config.hashCode() : 0);
        }

        @k
        public String toString() {
            return "Widget(type=" + this.type + ", config=" + this.config + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.type);
            Config config = this.config;
            if (config == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                config.writeToParcel(parcel, flags);
            }
        }
    }

    public GuestsSelectParameter(@k String str, @k String str2, @l Integer num, @l Boolean bool, @l Boolean bool2, @l Displaying displaying, @l String str3, @l Widget widget, @l Boolean bool3, boolean z12, boolean z13, @l AttributedText attributedText) {
        this.id = str;
        this.title = str2;
        this.attrId = num;
        this.visible = bool;
        this.hasSuggest = bool2;
        this.displaying = displaying;
        this._value = str3;
        this.widget = widget;
        this.updatesForm = bool3;
        this.required = z12;
        this.immutable = z13;
        this.motivation = attributedText;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getImmutable() {
        return this.immutable;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final AttributedText getMotivation() {
        return this.motivation;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Integer getAttrId() {
        return this.attrId;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Boolean getVisible() {
        return this.visible;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Boolean getHasSuggest() {
        return this.hasSuggest;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Displaying getDisplaying() {
        return this.displaying;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String get_value() {
        return this._value;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Widget getWidget() {
        return this.widget;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    @k
    public final GuestsSelectParameter copy(@k String id2, @k String title, @l Integer attrId, @l Boolean visible, @l Boolean hasSuggest, @l Displaying displaying, @l String _value, @l Widget widget, @l Boolean updatesForm, boolean required, boolean immutable, @l AttributedText motivation) {
        return new GuestsSelectParameter(id2, title, attrId, visible, hasSuggest, displaying, _value, widget, updatesForm, required, immutable, motivation);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuestsSelectParameter)) {
            return false;
        }
        GuestsSelectParameter guestsSelectParameter = (GuestsSelectParameter) other;
        return L.f(this.id, guestsSelectParameter.id) && L.f(this.title, guestsSelectParameter.title) && L.f(this.attrId, guestsSelectParameter.attrId) && L.f(this.visible, guestsSelectParameter.visible) && L.f(this.hasSuggest, guestsSelectParameter.hasSuggest) && L.f(this.displaying, guestsSelectParameter.displaying) && L.f(this._value, guestsSelectParameter._value) && L.f(this.widget, guestsSelectParameter.widget) && L.f(this.updatesForm, guestsSelectParameter.updatesForm) && this.required == guestsSelectParameter.required && this.immutable == guestsSelectParameter.immutable && L.f(this.motivation, guestsSelectParameter.motivation);
    }

    @l
    public final Integer getAttrId() {
        return this.attrId;
    }

    @l
    public final Displaying getDisplaying() {
        return this.displaying;
    }

    @l
    public final Boolean getHasSuggest() {
        return this.hasSuggest;
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

    @l
    public final Boolean getVisible() {
        return this.visible;
    }

    @l
    public final Widget getWidget() {
        return this.widget;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public int hashCode() {
        int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
        Integer num = this.attrId;
        int iHashCode = (iD2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.visible;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasSuggest;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Displaying displaying = this.displaying;
        int iHashCode4 = (iHashCode3 + (displaying == null ? 0 : displaying.hashCode())) * 31;
        String str = this._value;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Widget widget = this.widget;
        int iHashCode6 = (iHashCode5 + (widget == null ? 0 : widget.hashCode())) * 31;
        Boolean bool3 = this.updatesForm;
        int i12 = r.i(r.i((iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31, 31, this.required), 31, this.immutable);
        AttributedText attributedText = this.motivation;
        return i12 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("GuestsSelectParameter(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", attrId=");
        sb2.append(this.attrId);
        sb2.append(", visible=");
        sb2.append(this.visible);
        sb2.append(", hasSuggest=");
        sb2.append(this.hasSuggest);
        sb2.append(", displaying=");
        sb2.append(this.displaying);
        sb2.append(", _value=");
        sb2.append(this._value);
        sb2.append(", widget=");
        sb2.append(this.widget);
        sb2.append(", updatesForm=");
        sb2.append(this.updatesForm);
        sb2.append(", required=");
        sb2.append(this.required);
        sb2.append(", immutable=");
        sb2.append(this.immutable);
        sb2.append(", motivation=");
        return a.w(sb2, this.motivation, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        Integer num = this.attrId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        Boolean bool = this.visible;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.hasSuggest;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        Displaying displaying = this.displaying;
        if (displaying == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            displaying.writeToParcel(parcel, flags);
        }
        parcel.writeString(this._value);
        Widget widget = this.widget;
        if (widget == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            widget.writeToParcel(parcel, flags);
        }
        Boolean bool3 = this.updatesForm;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        parcel.writeInt(this.required ? 1 : 0);
        parcel.writeInt(this.immutable ? 1 : 0);
        parcel.writeParcelable(this.motivation, flags);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    @l
    public String get_value() {
        return this._value;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public void set_value(@l String str) {
        this._value = str;
    }
}

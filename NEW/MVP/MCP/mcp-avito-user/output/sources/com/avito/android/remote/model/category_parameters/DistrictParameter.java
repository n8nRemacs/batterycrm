package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.District;
import com.avito.android.remote.model.DistrictsWithRegions;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.HasConstraints;
import com.avito.android.remote.model.category_parameters.base.HasPlaceholder;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DistrictParameter.kt */
@d
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 ^2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u00020\u00042\u00020\u0005:\u0002^_B\u0085\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\f\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b)\u0010$J\u0018\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\"J\u0098\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\f2\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b-\u0010\u001aJ\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020.HÖ\u0001¢\u0006\u0004\b5\u00100J \u0010:\u001a\u0002092\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020.HÖ\u0001¢\u0006\u0004\b:\u0010;R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b=\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\b>\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b?\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bA\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bC\u0010 R*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010D\u001a\u0004\bE\u0010\"\"\u0004\bF\u0010GR\u001a\u0010\u000f\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010H\u001a\u0004\bI\u0010$R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010J\u001a\u0004\bK\u0010&R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010L\u001a\u0004\bM\u0010(R\u001a\u0010\u0014\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010H\u001a\u0004\bN\u0010$R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010D\u001a\u0004\bO\u0010\"R \u0010P\u001a\u00020\f8\u0016X\u0096D¢\u0006\u0012\n\u0004\bP\u0010H\u0012\u0004\bR\u0010S\u001a\u0004\bQ\u0010$R*\u0010U\u001a\u0004\u0018\u00010T8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bU\u0010V\u0012\u0004\b[\u0010S\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0014\u0010]\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010\u001a¨\u0006`"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/DistrictParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "", "Lcom/avito/android/remote/model/District;", "Lcom/avito/android/remote/model/category_parameters/base/HasPlaceholder;", "Lcom/avito/android/remote/model/category_parameters/base/HasConstraints;", "", "id", "title", ChannelContext.Item.PLACEHOLDER, "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "", "updatesForm", "_value", "required", "Lcom/avito/android/remote/model/category_parameters/DistrictParameter$Widget;", "widget", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "displayingOptions", "resetAreaOnChange", "Lcom/avito/android/remote/model/category_parameters/Constraint;", "constraints", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/util/List;ZLcom/avito/android/remote/model/category_parameters/DistrictParameter$Widget;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;ZLjava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/text/AttributedText;", "component5", "()Ljava/lang/Boolean;", "component6", "()Ljava/util/List;", "component7", "()Z", "component8", "()Lcom/avito/android/remote/model/category_parameters/DistrictParameter$Widget;", "component9", "()Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/util/List;ZLcom/avito/android/remote/model/category_parameters/DistrictParameter$Widget;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;ZLjava/util/List;)Lcom/avito/android/remote/model/category_parameters/DistrictParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "getPlaceholder", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "Ljava/lang/Boolean;", "getUpdatesForm", "Ljava/util/List;", "get_value", "set_value", "(Ljava/util/List;)V", "Z", "getRequired", "Lcom/avito/android/remote/model/category_parameters/DistrictParameter$Widget;", "getWidget", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "getDisplayingOptions", "getResetAreaOnChange", "getConstraints", "immutable", "getImmutable", "getImmutable$annotations", "()V", "Lcom/avito/android/remote/model/DistrictsWithRegions;", "values", "Lcom/avito/android/remote/model/DistrictsWithRegions;", "getValues", "()Lcom/avito/android/remote/model/DistrictsWithRegions;", "setValues", "(Lcom/avito/android/remote/model/DistrictsWithRegions;)V", "getValues$annotations", "getType", "type", "Companion", "Widget", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DistrictParameter extends EditableParameter<List<? extends District>> implements HasPlaceholder, HasConstraints {

    @k
    public static final String TYPE = "district";

    @c("value")
    @l
    private List<District> _value;

    @c("constraints")
    @l
    private final List<Constraint> constraints;

    @c(Navigation.DISPLAYING)
    @l
    private final DisplayingOptions displayingOptions;

    @c("id")
    @k
    private final String id;
    private final boolean immutable;

    @c("motivation")
    @l
    private final AttributedText motivation;

    @c(ChannelContext.Item.PLACEHOLDER)
    @l
    private final String placeholder;

    @c("required")
    private final boolean required;

    @c("resetAreaOnChange")
    private final boolean resetAreaOnChange;

    @c("title")
    @k
    private final String title;

    @c("updatesForm")
    @l
    private final Boolean updatesForm;

    @l
    private DistrictsWithRegions values;

    @c("widget")
    @l
    private final Widget widget;

    @k
    public static final Parcelable.Creator<DistrictParameter> CREATOR = new Creator();

    /* compiled from: DistrictParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DistrictParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DistrictParameter createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(DistrictParameter.class.getClassLoader());
            int iL2 = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(District.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            boolean z12 = parcel.readInt() != 0;
            Widget widgetCreateFromParcel = parcel.readInt() == 0 ? null : Widget.CREATOR.createFromParcel(parcel);
            DisplayingOptions displayingOptionsCreateFromParcel = parcel.readInt() == 0 ? null : DisplayingOptions.CREATOR.createFromParcel(parcel);
            boolean z13 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = a.l(DistrictParameter.class, parcel, arrayList2, iL2, 1);
                }
            }
            return new DistrictParameter(string, string2, string3, attributedText, boolValueOf, arrayList, z12, widgetCreateFromParcel, displayingOptionsCreateFromParcel, z13, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DistrictParameter[] newArray(int i12) {
            return new DistrictParameter[i12];
        }
    }

    /* compiled from: DistrictParameter.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/DistrictParameter$Widget;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/DistrictParameter$Widget$Config;", Navigation.CONFIG, "<init>", "(Lcom/avito/android/remote/model/category_parameters/DistrictParameter$Widget$Config;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/DistrictParameter$Widget$Config;", "copy", "(Lcom/avito/android/remote/model/category_parameters/DistrictParameter$Widget$Config;)Lcom/avito/android/remote/model/category_parameters/DistrictParameter$Widget;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/DistrictParameter$Widget$Config;", "getConfig", "Config", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Widget implements Parcelable {

        @k
        public static final Parcelable.Creator<Widget> CREATOR = new Creator();

        @c(Navigation.CONFIG)
        @l
        private final Config config;

        /* compiled from: DistrictParameter.kt */
        @d
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/DistrictParameter$Widget$Config;", "Landroid/os/Parcelable;", "", SearchParamsConverterKt.LOCATION_ID, "<init>", "(Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/Integer;)Lcom/avito/android/remote/model/category_parameters/DistrictParameter$Widget$Config;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getLocationId", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Config implements Parcelable {

            @k
            public static final Parcelable.Creator<Config> CREATOR = new Creator();

            @c(SearchParamsConverterKt.LOCATION_ID)
            @l
            private final Integer locationId;

            /* compiled from: DistrictParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Config> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Config createFromParcel(@k Parcel parcel) {
                    return new Config(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Config[] newArray(int i12) {
                    return new Config[i12];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Config() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Config copy$default(Config config, Integer num, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    num = config.locationId;
                }
                return config.copy(num);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final Integer getLocationId() {
                return this.locationId;
            }

            @k
            public final Config copy(@l Integer locationId) {
                return new Config(locationId);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Config) && L.f(this.locationId, ((Config) other).locationId);
            }

            @l
            public final Integer getLocationId() {
                return this.locationId;
            }

            public int hashCode() {
                Integer num = this.locationId;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            @k
            public String toString() {
                return s.j(new StringBuilder("Config(locationId="), this.locationId, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                Integer num = this.locationId;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    a.C(parcel, 1, num);
                }
            }

            public Config(@l Integer num) {
                this.locationId = num;
            }

            public /* synthetic */ Config(Integer num, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : num);
            }
        }

        /* compiled from: DistrictParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Widget> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Widget createFromParcel(@k Parcel parcel) {
                return new Widget(parcel.readInt() == 0 ? null : Config.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Widget[] newArray(int i12) {
                return new Widget[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Widget() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Widget copy$default(Widget widget, Config config, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                config = widget.config;
            }
            return widget.copy(config);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Config getConfig() {
            return this.config;
        }

        @k
        public final Widget copy(@l Config config) {
            return new Widget(config);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Widget) && L.f(this.config, ((Widget) other).config);
        }

        @l
        public final Config getConfig() {
            return this.config;
        }

        public int hashCode() {
            Config config = this.config;
            if (config == null) {
                return 0;
            }
            return config.hashCode();
        }

        @k
        public String toString() {
            return "Widget(config=" + this.config + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Config config = this.config;
            if (config == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                config.writeToParcel(parcel, flags);
            }
        }

        public Widget(@l Config config) {
            this.config = config;
        }

        public /* synthetic */ Widget(Config config, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : config);
        }
    }

    public /* synthetic */ DistrictParameter(String str, String str2, String str3, AttributedText attributedText, Boolean bool, List list, boolean z12, Widget widget, DisplayingOptions displayingOptions, boolean z13, List list2, int i12, C42822w c42822w) {
        this(str, str2, str3, attributedText, bool, (i12 & 32) != 0 ? null : list, (i12 & 64) != 0 ? true : z12, (i12 & 128) != 0 ? null : widget, (i12 & 256) != 0 ? null : displayingOptions, (i12 & 512) != 0 ? false : z13, (i12 & 1024) != 0 ? new ArrayList() : list2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getResetAreaOnChange() {
        return this.resetAreaOnChange;
    }

    @l
    public final List<Constraint> component11() {
        return this.constraints;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final AttributedText getMotivation() {
        return this.motivation;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    @l
    public final List<District> component6() {
        return this._value;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Widget getWidget() {
        return this.widget;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final DisplayingOptions getDisplayingOptions() {
        return this.displayingOptions;
    }

    @k
    public final DistrictParameter copy(@k String id2, @k String title, @l String placeholder, @l AttributedText motivation, @l Boolean updatesForm, @l List<District> _value, boolean required, @l Widget widget, @l DisplayingOptions displayingOptions, boolean resetAreaOnChange, @l List<? extends Constraint> constraints) {
        return new DistrictParameter(id2, title, placeholder, motivation, updatesForm, _value, required, widget, displayingOptions, resetAreaOnChange, constraints);
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
        if (!(other instanceof DistrictParameter)) {
            return false;
        }
        DistrictParameter districtParameter = (DistrictParameter) other;
        return L.f(this.id, districtParameter.id) && L.f(this.title, districtParameter.title) && L.f(this.placeholder, districtParameter.placeholder) && L.f(this.motivation, districtParameter.motivation) && L.f(this.updatesForm, districtParameter.updatesForm) && L.f(this._value, districtParameter._value) && this.required == districtParameter.required && L.f(this.widget, districtParameter.widget) && L.f(this.displayingOptions, districtParameter.displayingOptions) && this.resetAreaOnChange == districtParameter.resetAreaOnChange && L.f(this.constraints, districtParameter.constraints);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasConstraints
    @l
    public List<Constraint> getConstraints() {
        return this.constraints;
    }

    @l
    public final DisplayingOptions getDisplayingOptions() {
        return this.displayingOptions;
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

    @Override // com.avito.android.remote.model.category_parameters.base.HasPlaceholder
    @l
    public String getPlaceholder() {
        return this.placeholder;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    public boolean getRequired() {
        return this.required;
    }

    public final boolean getResetAreaOnChange() {
        return this.resetAreaOnChange;
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
    public final DistrictsWithRegions getValues() {
        return this.values;
    }

    @l
    public final Widget getWidget() {
        return this.widget;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public int hashCode() {
        int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
        String str = this.placeholder;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.motivation;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Boolean bool = this.updatesForm;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<District> list = this._value;
        int i12 = r.i((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31, this.required);
        Widget widget = this.widget;
        int iHashCode4 = (i12 + (widget == null ? 0 : widget.hashCode())) * 31;
        DisplayingOptions displayingOptions = this.displayingOptions;
        int i13 = r.i((iHashCode4 + (displayingOptions == null ? 0 : displayingOptions.hashCode())) * 31, 31, this.resetAreaOnChange);
        List<Constraint> list2 = this.constraints;
        return i13 + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setValues(@l DistrictsWithRegions districtsWithRegions) {
        this.values = districtsWithRegions;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public /* bridge */ /* synthetic */ void set_value(List<? extends District> list) {
        set_value2((List<District>) list);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DistrictParameter(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", placeholder=");
        sb2.append(this.placeholder);
        sb2.append(", motivation=");
        sb2.append(this.motivation);
        sb2.append(", updatesForm=");
        sb2.append(this.updatesForm);
        sb2.append(", _value=");
        sb2.append(this._value);
        sb2.append(", required=");
        sb2.append(this.required);
        sb2.append(", widget=");
        sb2.append(this.widget);
        sb2.append(", displayingOptions=");
        sb2.append(this.displayingOptions);
        sb2.append(", resetAreaOnChange=");
        sb2.append(this.resetAreaOnChange);
        sb2.append(", constraints=");
        return H.p(sb2, this.constraints, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.placeholder);
        parcel.writeParcelable(this.motivation, flags);
        Boolean bool = this.updatesForm;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        List<District> list = this._value;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((District) itA.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeInt(this.required ? 1 : 0);
        Widget widget = this.widget;
        if (widget == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            widget.writeToParcel(parcel, flags);
        }
        DisplayingOptions displayingOptions = this.displayingOptions;
        if (displayingOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            displayingOptions.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.resetAreaOnChange ? 1 : 0);
        List<Constraint> list2 = this.constraints;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            parcel.writeParcelable((Parcelable) itA2.next(), flags);
        }
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    @l
    public List<? extends District> get_value() {
        return this._value;
    }

    /* renamed from: set_value, reason: avoid collision after fix types in other method */
    public void set_value2(@l List<District> list) {
        this._value = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DistrictParameter(@k String str, @k String str2, @l String str3, @l AttributedText attributedText, @l Boolean bool, @l List<District> list, boolean z12, @l Widget widget, @l DisplayingOptions displayingOptions, boolean z13, @l List<? extends Constraint> list2) {
        this.id = str;
        this.title = str2;
        this.placeholder = str3;
        this.motivation = attributedText;
        this.updatesForm = bool;
        this._value = list;
        this.required = z12;
        this.widget = widget;
        this.displayingOptions = displayingOptions;
        this.resetAreaOnChange = z13;
        this.constraints = list2;
    }

    public static /* synthetic */ void getImmutable$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }
}

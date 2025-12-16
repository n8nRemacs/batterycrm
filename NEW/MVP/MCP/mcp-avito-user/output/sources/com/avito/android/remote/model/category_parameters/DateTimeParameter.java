package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.HasConstraints;
import com.avito.android.remote.model.category_parameters.base.HasPlaceholder;
import com.avito.android.remote.model.category_parameters.base.Phantom;
import com.avito.android.remote.model.category_parameters.base.TextParameter;
import com.avito.android.remote.model.category_parameters.base.Visibility;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;

/* compiled from: DateTimeParameter.kt */
@s0
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\b\u0087\b\u0018\u0000 t2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0003tuvB£\u0001\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u000b¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b,\u0010+J\u0010\u0010-\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b-\u0010&J\u0010\u0010.\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b.\u0010&J\u0012\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0018\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b=\u0010+J\u0012\u0010>\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b>\u00102J\u0012\u0010?\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b?\u00102J\u0012\u0010@\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\b@\u0010AJÂ\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÆ\u0001¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\bHÖ\u0001¢\u0006\u0004\bD\u0010+J\u0010\u0010F\u001a\u00020EHÖ\u0001¢\u0006\u0004\bF\u0010GJ\u001a\u0010J\u001a\u00020\u000b2\b\u0010I\u001a\u0004\u0018\u00010HHÖ\u0003¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020EHÖ\u0001¢\u0006\u0004\bL\u0010GJ \u0010Q\u001a\u00020P2\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020EHÖ\u0001¢\u0006\u0004\bQ\u0010RR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010S\u001a\u0004\bT\u0010+R\u001a\u0010\n\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010S\u001a\u0004\bU\u0010+R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010V\u001a\u0004\bW\u0010&R\u001a\u0010\r\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010V\u001a\u0004\bX\u0010&R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010Y\u001a\u0004\bZ\u00100R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010[\u001a\u0004\b\\\u00102R$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010]\u001a\u0004\b^\u00104\"\u0004\b_\u0010`R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010a\u001a\u0004\bb\u00106R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010c\u001a\u0004\bd\u00108R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010e\u001a\u0004\bf\u0010:R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010g\u001a\u0004\bh\u0010<R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010S\u001a\u0004\bi\u0010+R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001c\u0010[\u001a\u0004\bj\u00102R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010[\u001a\u0004\bk\u00102R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001f\u0010l\u001a\u0004\bm\u0010AR\u0014\u0010o\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010+R\u001c\u0010s\u001a\u0004\u0018\u00010\b8VX\u0097\u0004¢\u0006\f\u0012\u0004\bq\u0010r\u001a\u0004\bp\u0010+¨\u0006w"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/DateTimeParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$Value;", "Lcom/avito/android/remote/model/category_parameters/base/HasConstraints;", "Lcom/avito/android/remote/model/category_parameters/base/HasPlaceholder;", "Lcom/avito/android/remote/model/category_parameters/base/Visibility;", "Lcom/avito/android/remote/model/category_parameters/base/Phantom;", "Lcom/avito/android/remote/model/category_parameters/base/TextParameter;", "", "id", "title", "", "required", "immutable", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "updatesForm", "_value", "Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$PresentTimeOptions;", "presentTime", "Lcom/avito/android/remote/model/category_parameters/SelectionType;", "selectionType", "Lcom/avito/android/remote/model/category_parameters/Restrictions;", "restrictions", "", "Lcom/avito/android/remote/model/category_parameters/Constraint;", "constraints", ChannelContext.Item.PLACEHOLDER, "visible", "phantom", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "displayingOptions", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$Value;Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$PresentTimeOptions;Lcom/avito/android/remote/model/category_parameters/SelectionType;Lcom/avito/android/remote/model/category_parameters/Restrictions;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;)V", "isParentForced", "hasValue", "(Z)Z", "isPresentTime", "()Z", "", "getTimestamp", "()Ljava/lang/Long;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/avito/android/remote/model/text/AttributedText;", "component6", "()Ljava/lang/Boolean;", "component7", "()Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$Value;", "component8", "()Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$PresentTimeOptions;", "component9", "()Lcom/avito/android/remote/model/category_parameters/SelectionType;", "component10", "()Lcom/avito/android/remote/model/category_parameters/Restrictions;", "component11", "()Ljava/util/List;", "component12", "component13", "component14", "component15", "()Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$Value;Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$PresentTimeOptions;Lcom/avito/android/remote/model/category_parameters/SelectionType;Lcom/avito/android/remote/model/category_parameters/Restrictions;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;)Lcom/avito/android/remote/model/category_parameters/DateTimeParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Z", "getRequired", "getImmutable", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "Ljava/lang/Boolean;", "getUpdatesForm", "Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$Value;", "get_value", "set_value", "(Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$Value;)V", "Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$PresentTimeOptions;", "getPresentTime", "Lcom/avito/android/remote/model/category_parameters/SelectionType;", "getSelectionType", "Lcom/avito/android/remote/model/category_parameters/Restrictions;", "getRestrictions", "Ljava/util/List;", "getConstraints", "getPlaceholder", "getVisible", "getPhantom", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "getDisplayingOptions", "getType", "type", "getHint", "getHint$annotations", "()V", "hint", "Companion", "PresentTimeOptions", "Value", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes17.dex */
public final /* data */ class DateTimeParameter extends EditableParameter<Value> implements HasConstraints, HasPlaceholder, Visibility, Phantom, TextParameter {

    @k
    public static final String TYPE = "date";

    @c("value")
    @l
    private Value _value;

    @c("constraints")
    @l
    private final List<Constraint> constraints;

    @c(Navigation.DISPLAYING)
    @l
    private final DisplayingOptions displayingOptions;

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

    @c(ChannelContext.Item.PLACEHOLDER)
    @l
    private final String placeholder;

    @c("presentTimeOptions")
    @l
    private final PresentTimeOptions presentTime;

    @c("required")
    private final boolean required;

    @c("restrictions")
    @l
    private final Restrictions restrictions;

    @c("selectionType")
    @l
    private final SelectionType selectionType;

    @c("title")
    @k
    private final String title;

    @c("updatesForm")
    @l
    private final Boolean updatesForm;

    @c("visible")
    @l
    private final Boolean visible;

    @k
    public static final Parcelable.Creator<DateTimeParameter> CREATOR = new Creator();

    /* compiled from: DateTimeParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DateTimeParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DateTimeParameter createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(DateTimeParameter.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Value value = (Value) parcel.readParcelable(DateTimeParameter.class.getClassLoader());
            PresentTimeOptions presentTimeOptionsCreateFromParcel = parcel.readInt() == 0 ? null : PresentTimeOptions.CREATOR.createFromParcel(parcel);
            SelectionType selectionTypeCreateFromParcel = parcel.readInt() == 0 ? null : SelectionType.CREATOR.createFromParcel(parcel);
            Restrictions restrictionsCreateFromParcel = parcel.readInt() == 0 ? null : Restrictions.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(DateTimeParameter.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DateTimeParameter(string, string2, z12, z13, attributedText, boolValueOf, value, presentTimeOptionsCreateFromParcel, selectionTypeCreateFromParcel, restrictionsCreateFromParcel, arrayList, string3, boolValueOf2, boolValueOf3, parcel.readInt() == 0 ? null : DisplayingOptions.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DateTimeParameter[] newArray(int i12) {
            return new DateTimeParameter[i12];
        }
    }

    /* compiled from: DateTimeParameter.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$PresentTimeOptions;", "Landroid/os/Parcelable;", "", "title", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PresentTimeOptions implements Parcelable {

        @k
        public static final Parcelable.Creator<PresentTimeOptions> CREATOR = new Creator();

        @c("title")
        @k
        private final String title;

        /* compiled from: DateTimeParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PresentTimeOptions> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final PresentTimeOptions createFromParcel(@k Parcel parcel) {
                return new PresentTimeOptions(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final PresentTimeOptions[] newArray(int i12) {
                return new PresentTimeOptions[i12];
            }
        }

        public PresentTimeOptions(@k String str) {
            this.title = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
        }
    }

    /* compiled from: DateTimeParameter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$Value;", "Landroid/os/Parcelable;", "()V", "PresentTime", "Timestamp", "Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$Value$PresentTime;", "Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$Value$Timestamp;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Value implements Parcelable {

        /* compiled from: DateTimeParameter.kt */
        @d
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$Value$PresentTime;", "Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$Value;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PresentTime extends Value {

            @k
            public static final PresentTime INSTANCE = new PresentTime();

            @k
            public static final Parcelable.Creator<PresentTime> CREATOR = new Creator();

            /* compiled from: DateTimeParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PresentTime> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final PresentTime createFromParcel(@k Parcel parcel) {
                    parcel.readInt();
                    return PresentTime.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final PresentTime[] newArray(int i12) {
                    return new PresentTime[i12];
                }
            }

            private PresentTime() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: DateTimeParameter.kt */
        @d
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$Value$Timestamp;", "Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$Value;", "", "timestamp", "<init>", "(J)V", "toSeconds", "()J", "component1", "copy", "(J)Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$Value$Timestamp;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getTimestamp", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Timestamp extends Value {

            @k
            public static final Parcelable.Creator<Timestamp> CREATOR = new Creator();
            private final long timestamp;

            /* compiled from: DateTimeParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Timestamp> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Timestamp createFromParcel(@k Parcel parcel) {
                    return new Timestamp(parcel.readLong());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Timestamp[] newArray(int i12) {
                    return new Timestamp[i12];
                }
            }

            public Timestamp(long j12) {
                super(null);
                this.timestamp = j12;
            }

            public static /* synthetic */ Timestamp copy$default(Timestamp timestamp, long j12, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    j12 = timestamp.timestamp;
                }
                return timestamp.copy(j12);
            }

            /* renamed from: component1, reason: from getter */
            public final long getTimestamp() {
                return this.timestamp;
            }

            @k
            public final Timestamp copy(long timestamp) {
                return new Timestamp(timestamp);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Timestamp) && this.timestamp == ((Timestamp) other).timestamp;
            }

            public final long getTimestamp() {
                return this.timestamp;
            }

            public int hashCode() {
                return Long.hashCode(this.timestamp);
            }

            public final long toSeconds() {
                return TimeUnit.MILLISECONDS.toSeconds(this.timestamp);
            }

            @k
            public String toString() {
                return r.u(new StringBuilder("Timestamp(timestamp="), this.timestamp, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeLong(this.timestamp);
            }
        }

        public /* synthetic */ Value(C42822w c42822w) {
            this();
        }

        private Value() {
        }
    }

    public /* synthetic */ DateTimeParameter(String str, String str2, boolean z12, boolean z13, AttributedText attributedText, Boolean bool, Value value, PresentTimeOptions presentTimeOptions, SelectionType selectionType, Restrictions restrictions, List list, String str3, Boolean bool2, Boolean bool3, DisplayingOptions displayingOptions, int i12, C42822w c42822w) {
        this(str, str2, z12, z13, attributedText, bool, value, presentTimeOptions, selectionType, restrictions, list, (i12 & 2048) != 0 ? null : str3, (i12 & 4096) != 0 ? Boolean.FALSE : bool2, (i12 & 8192) != 0 ? Boolean.FALSE : bool3, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : displayingOptions);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final Restrictions getRestrictions() {
        return this.restrictions;
    }

    @l
    public final List<Constraint> component11() {
        return this.constraints;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final Boolean getVisible() {
        return this.visible;
    }

    @l
    /* renamed from: component14, reason: from getter */
    public final Boolean getPhantom() {
        return this.phantom;
    }

    @l
    /* renamed from: component15, reason: from getter */
    public final DisplayingOptions getDisplayingOptions() {
        return this.displayingOptions;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getImmutable() {
        return this.immutable;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final AttributedText getMotivation() {
        return this.motivation;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Value get_value() {
        return this._value;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final PresentTimeOptions getPresentTime() {
        return this.presentTime;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final SelectionType getSelectionType() {
        return this.selectionType;
    }

    @k
    public final DateTimeParameter copy(@k String id2, @k String title, boolean required, boolean immutable, @l AttributedText motivation, @l Boolean updatesForm, @l Value _value, @l PresentTimeOptions presentTime, @l SelectionType selectionType, @l Restrictions restrictions, @l List<? extends Constraint> constraints, @l String placeholder, @l Boolean visible, @l Boolean phantom, @l DisplayingOptions displayingOptions) {
        return new DateTimeParameter(id2, title, required, immutable, motivation, updatesForm, _value, presentTime, selectionType, restrictions, constraints, placeholder, visible, phantom, displayingOptions);
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
        if (!(other instanceof DateTimeParameter)) {
            return false;
        }
        DateTimeParameter dateTimeParameter = (DateTimeParameter) other;
        return L.f(this.id, dateTimeParameter.id) && L.f(this.title, dateTimeParameter.title) && this.required == dateTimeParameter.required && this.immutable == dateTimeParameter.immutable && L.f(this.motivation, dateTimeParameter.motivation) && L.f(this.updatesForm, dateTimeParameter.updatesForm) && L.f(this._value, dateTimeParameter._value) && L.f(this.presentTime, dateTimeParameter.presentTime) && L.f(this.selectionType, dateTimeParameter.selectionType) && L.f(this.restrictions, dateTimeParameter.restrictions) && L.f(this.constraints, dateTimeParameter.constraints) && L.f(this.placeholder, dateTimeParameter.placeholder) && L.f(this.visible, dateTimeParameter.visible) && L.f(this.phantom, dateTimeParameter.phantom) && L.f(this.displayingOptions, dateTimeParameter.displayingOptions);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasConstraints
    @l
    public List<Constraint> getConstraints() {
        return this.constraints;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.TextParameter
    @l
    public DisplayingOptions getDisplayingOptions() {
        return this.displayingOptions;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.TextParameter
    @l
    public String getHint() {
        return getPlaceholder();
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

    @Override // com.avito.android.remote.model.category_parameters.base.HasPlaceholder
    @l
    public String getPlaceholder() {
        return this.placeholder;
    }

    @l
    public final PresentTimeOptions getPresentTime() {
        return this.presentTime;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    public boolean getRequired() {
        return this.required;
    }

    @l
    public final Restrictions getRestrictions() {
        return this.restrictions;
    }

    @l
    public final SelectionType getSelectionType() {
        return this.selectionType;
    }

    @l
    public final Long getTimestamp() {
        Value value = getValue();
        if (value == null || !(value instanceof Value.Timestamp)) {
            return null;
        }
        return Long.valueOf(((Value.Timestamp) value).getTimestamp());
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @k
    public String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @k
    public String getType() {
        return "date";
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseEditableParameter
    @l
    public Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.Visibility
    @l
    public Boolean getVisible() {
        return this.visible;
    }

    public final boolean hasValue(boolean isParentForced) {
        return ((getRequired() || isParentForced) && get_value() == null) ? false : true;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public int hashCode() {
        int i12 = r.i(r.i(H.d(this.id.hashCode() * 31, 31, this.title), 31, this.required), 31, this.immutable);
        AttributedText attributedText = this.motivation;
        int iHashCode = (i12 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Boolean bool = this.updatesForm;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Value value = this._value;
        int iHashCode3 = (iHashCode2 + (value == null ? 0 : value.hashCode())) * 31;
        PresentTimeOptions presentTimeOptions = this.presentTime;
        int iHashCode4 = (iHashCode3 + (presentTimeOptions == null ? 0 : presentTimeOptions.hashCode())) * 31;
        SelectionType selectionType = this.selectionType;
        int iHashCode5 = (iHashCode4 + (selectionType == null ? 0 : selectionType.hashCode())) * 31;
        Restrictions restrictions = this.restrictions;
        int iHashCode6 = (iHashCode5 + (restrictions == null ? 0 : restrictions.hashCode())) * 31;
        List<Constraint> list = this.constraints;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.placeholder;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.visible;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.phantom;
        int iHashCode10 = (iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        DisplayingOptions displayingOptions = this.displayingOptions;
        return iHashCode10 + (displayingOptions != null ? displayingOptions.hashCode() : 0);
    }

    public final boolean isPresentTime() {
        return getValue() instanceof Value.PresentTime;
    }

    @k
    public String toString() {
        return "DateTimeParameter(id=" + this.id + ", title=" + this.title + ", required=" + this.required + ", immutable=" + this.immutable + ", motivation=" + this.motivation + ", updatesForm=" + this.updatesForm + ", _value=" + this._value + ", presentTime=" + this.presentTime + ", selectionType=" + this.selectionType + ", restrictions=" + this.restrictions + ", constraints=" + this.constraints + ", placeholder=" + this.placeholder + ", visible=" + this.visible + ", phantom=" + this.phantom + ", displayingOptions=" + this.displayingOptions + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeInt(this.required ? 1 : 0);
        parcel.writeInt(this.immutable ? 1 : 0);
        parcel.writeParcelable(this.motivation, flags);
        Boolean bool = this.updatesForm;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this._value, flags);
        PresentTimeOptions presentTimeOptions = this.presentTime;
        if (presentTimeOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            presentTimeOptions.writeToParcel(parcel, flags);
        }
        SelectionType selectionType = this.selectionType;
        if (selectionType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            selectionType.writeToParcel(parcel, flags);
        }
        Restrictions restrictions = this.restrictions;
        if (restrictions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            restrictions.writeToParcel(parcel, flags);
        }
        List<Constraint> list = this.constraints;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeString(this.placeholder);
        Boolean bool2 = this.visible;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        Boolean bool3 = this.phantom;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        DisplayingOptions displayingOptions = this.displayingOptions;
        if (displayingOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            displayingOptions.writeToParcel(parcel, flags);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    @l
    public Value get_value() {
        return this._value;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public void set_value(@l Value value) {
        this._value = value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DateTimeParameter(@k String str, @k String str2, boolean z12, boolean z13, @l AttributedText attributedText, @l Boolean bool, @l Value value, @l PresentTimeOptions presentTimeOptions, @l SelectionType selectionType, @l Restrictions restrictions, @l List<? extends Constraint> list, @l String str3, @l Boolean bool2, @l Boolean bool3, @l DisplayingOptions displayingOptions) {
        this.id = str;
        this.title = str2;
        this.required = z12;
        this.immutable = z13;
        this.motivation = attributedText;
        this.updatesForm = bool;
        this._value = value;
        this.presentTime = presentTimeOptions;
        this.selectionType = selectionType;
        this.restrictions = restrictions;
        this.constraints = list;
        this.placeholder = str3;
        this.visible = bool2;
        this.phantom = bool3;
        this.displayingOptions = displayingOptions;
    }

    @InterfaceC42830m
    public static /* synthetic */ void getHint$annotations() {
    }
}

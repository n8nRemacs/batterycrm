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
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.base.CanHaveTypeCorrection;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.HasPlaceholder;
import com.avito.android.remote.model.category_parameters.base.Phantom;
import com.avito.android.remote.model.category_parameters.base.Visibility;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: SectionedMultiselectParameter.kt */
@s0
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b3\b\u0087\b\u0018\u0000 z2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0006z{|}~\u007fBÉ\u0001\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0003H\u0016¢\u0006\u0004\b$\u0010%J\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b+\u0010%J\u0010\u0010,\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b,\u0010%J\u0010\u0010-\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b-\u0010*J\u0010\u0010.\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b.\u0010*J\u0012\u0010/\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b3\u00102J\u0012\u00104\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b4\u00102J\u0012\u00105\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b7\u00108J\u0016\u00109\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b;\u0010%J\u0012\u0010<\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b>\u0010=J\u0012\u0010?\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b?\u00100J\u0012\u0010@\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\bB\u00102J\u0012\u0010C\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\bC\u00102Jä\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\bF\u0010GJ\u001a\u0010J\u001a\u00020\n2\b\u0010I\u001a\u0004\u0018\u00010HHÖ\u0003¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\bL\u0010GJ \u0010P\u001a\u00020&2\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\bP\u0010QR\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010R\u001a\u0004\bS\u0010%R\u001a\u0010\t\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010R\u001a\u0004\bT\u0010%R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010U\u001a\u0004\bV\u0010*R\u001a\u0010\f\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010U\u001a\u0004\bW\u0010*R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010X\u001a\u0004\bY\u00100R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010Z\u001a\u0004\b[\u00102R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010Z\u001a\u0004\b\\\u00102R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010Z\u001a\u0004\b]\u00102R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010^\u001a\u0004\b_\u00106\"\u0004\b`\u0010aR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010b\u001a\u0004\bc\u00108R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010d\u001a\u0004\be\u0010:R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010R\u001a\u0004\bf\u0010%R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010g\u001a\u0004\bh\u0010=R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010g\u001a\u0004\bi\u0010=R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010X\u001a\u0004\bj\u00100R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010k\u001a\u0004\bl\u0010AR\u001c\u0010 \u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b \u0010Z\u001a\u0004\bm\u00102R\u001c\u0010!\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b!\u0010Z\u001a\u0004\bn\u00102R\"\u0010o\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bo\u0010Z\u0012\u0004\bq\u0010(\u001a\u0004\bp\u00102R\u0014\u0010s\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010%R4\u0010y\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bu\u0010v\"\u0004\bw\u0010x¨\u0006\u0080\u0001"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "", "", "Lcom/avito/android/remote/model/category_parameters/base/HasPlaceholder;", "Lcom/avito/android/remote/model/category_parameters/base/CanHaveTypeCorrection;", "Lcom/avito/android/remote/model/category_parameters/base/Visibility;", "Lcom/avito/android/remote/model/category_parameters/base/Phantom;", "id", "title", "", "required", "immutable", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "updatesForm", "updatesObjectForm", "hasSuggest", "Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$SectionedMultiselectValue;", "sectionedMultiselectValue", "Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$Displaying;", Navigation.DISPLAYING, "", "Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$Value;", "values", ChannelContext.Item.PLACEHOLDER, "", "attributeId", "maxSelected", "subtitle", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$FilterHint;", "hint", "visible", "phantom", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$SectionedMultiselectValue;Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$Displaying;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$FilterHint;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "toString", "()Ljava/lang/String;", "Lkotlin/G0;", "rollbackToOldValue", "()V", "hasValue", "()Z", "component1", "component2", "component3", "component4", "component5", "()Lcom/avito/android/remote/model/text/AttributedText;", "component6", "()Ljava/lang/Boolean;", "component7", "component8", "component9", "()Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$SectionedMultiselectValue;", "component10", "()Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$Displaying;", "component11", "()Ljava/util/List;", "component12", "component13", "()Ljava/lang/Integer;", "component14", "component15", "component16", "()Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$FilterHint;", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$SectionedMultiselectValue;Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$Displaying;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$FilterHint;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter;", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Z", "getRequired", "getImmutable", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "Ljava/lang/Boolean;", "getUpdatesForm", "getUpdatesObjectForm", "getHasSuggest", "Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$SectionedMultiselectValue;", "getSectionedMultiselectValue", "setSectionedMultiselectValue", "(Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$SectionedMultiselectValue;)V", "Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$Displaying;", "getDisplaying", "Ljava/util/List;", "getValues", "getPlaceholder", "Ljava/lang/Integer;", "getAttributeId", "getMaxSelected", "getSubtitle", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$FilterHint;", "getHint", "getVisible", "getPhantom", "typoCorrectionEnabled", "getTypoCorrectionEnabled", "getTypoCorrectionEnabled$annotations", "getType", "type", "value", "get_value", "()Ljava/util/Set;", "set_value", "(Ljava/util/Set;)V", "_value", "Companion", "Display", "Displaying", "SectionedMultiselectValue", "Tab", "Value", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes17.dex */
public final /* data */ class SectionedMultiselectParameter extends EditableParameter<Set<? extends String>> implements HasPlaceholder, CanHaveTypeCorrection, Visibility, Phantom {

    @k
    public static final String TYPE = "sectionedMultiselect";

    @c("attrId")
    @l
    private final Integer attributeId;

    @c(Navigation.DISPLAYING)
    @l
    private final Displaying displaying;

    @c("hasSuggest")
    @l
    private final Boolean hasSuggest;

    @c("hint")
    @l
    private final MultiselectParameter.FilterHint hint;

    @c("id")
    @k
    private final String id;

    @c("immutable")
    private final boolean immutable;

    @c("maxSelected")
    @l
    private final Integer maxSelected;

    @c("motivation")
    @l
    private final AttributedText motivation;

    @c("phantom")
    @l
    private final Boolean phantom;

    @c(ChannelContext.Item.PLACEHOLDER)
    @l
    private final String placeholder;

    @c("required")
    private final boolean required;

    @c("value")
    @l
    private SectionedMultiselectValue sectionedMultiselectValue;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("title")
    @k
    private final String title;

    @l
    private final Boolean typoCorrectionEnabled;

    @c("updatesForm")
    @l
    private final Boolean updatesForm;

    @c("updatesObjectForm")
    @l
    private final Boolean updatesObjectForm;

    @c("values")
    @k
    private final List<Value> values;

    @c("visible")
    @l
    private final Boolean visible;

    @k
    public static final Parcelable.Creator<SectionedMultiselectParameter> CREATOR = new Creator();

    /* compiled from: SectionedMultiselectParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SectionedMultiselectParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SectionedMultiselectParameter createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(SectionedMultiselectParameter.class.getClassLoader());
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
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            SectionedMultiselectValue sectionedMultiselectValueCreateFromParcel = parcel.readInt() == 0 ? null : SectionedMultiselectValue.CREATOR.createFromParcel(parcel);
            Displaying displayingCreateFromParcel = parcel.readInt() == 0 ? null : Displaying.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(Value.CREATOR, parcel, arrayList, iC2, 1);
                i12 = i12;
            }
            String string3 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(SectionedMultiselectParameter.class.getClassLoader());
            MultiselectParameter.FilterHint filterHintCreateFromParcel = parcel.readInt() == 0 ? null : MultiselectParameter.FilterHint.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SectionedMultiselectParameter(string, string2, z12, z13, attributedText, boolValueOf, boolValueOf2, boolValueOf3, sectionedMultiselectValueCreateFromParcel, displayingCreateFromParcel, arrayList, string3, numValueOf, numValueOf2, attributedText2, filterHintCreateFromParcel, boolValueOf4, boolValueOf5);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SectionedMultiselectParameter[] newArray(int i12) {
            return new SectionedMultiselectParameter[i12];
        }
    }

    /* compiled from: SectionedMultiselectParameter.kt */
    @d
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\b¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$SectionedMultiselectValue;", "Landroid/os/Parcelable;", "", "", "valueList", "<init>", "(Ljava/util/Set;)V", "component1", "()Ljava/util/Set;", "copy", "(Ljava/util/Set;)Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$SectionedMultiselectValue;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Set;", "getValueList", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SectionedMultiselectValue implements Parcelable {

        @k
        public static final Parcelable.Creator<SectionedMultiselectValue> CREATOR = new Creator();

        @l
        private final Set<String> valueList;

        /* compiled from: SectionedMultiselectParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SectionedMultiselectValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SectionedMultiselectValue createFromParcel(@k Parcel parcel) {
                LinkedHashSet linkedHashSet;
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int i12 = parcel.readInt();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(i12);
                    for (int i13 = 0; i13 != i12; i13++) {
                        linkedHashSet2.add(parcel.readString());
                    }
                    linkedHashSet = linkedHashSet2;
                }
                return new SectionedMultiselectValue(linkedHashSet);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SectionedMultiselectValue[] newArray(int i12) {
                return new SectionedMultiselectValue[i12];
            }
        }

        public SectionedMultiselectValue(@l Set<String> set) {
            this.valueList = set;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SectionedMultiselectValue copy$default(SectionedMultiselectValue sectionedMultiselectValue, Set set, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                set = sectionedMultiselectValue.valueList;
            }
            return sectionedMultiselectValue.copy(set);
        }

        @l
        public final Set<String> component1() {
            return this.valueList;
        }

        @k
        public final SectionedMultiselectValue copy(@l Set<String> valueList) {
            return new SectionedMultiselectValue(valueList);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SectionedMultiselectValue) && L.f(this.valueList, ((SectionedMultiselectValue) other).valueList);
        }

        @l
        public final Set<String> getValueList() {
            return this.valueList;
        }

        public int hashCode() {
            Set<String> set = this.valueList;
            if (set == null) {
                return 0;
            }
            return set.hashCode();
        }

        @k
        public String toString() {
            return AK.c.u(new StringBuilder("SectionedMultiselectValue(valueList="), this.valueList, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Set<String> set = this.valueList;
            if (set == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(set.size());
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next());
            }
        }
    }

    /* compiled from: SectionedMultiselectParameter.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$Tab;", "Landroid/os/Parcelable;", "", "id", "tabTitle", "", "groupIds", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$Tab;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTabTitle", "Ljava/util/List;", "getGroupIds", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Tab implements Parcelable {

        @k
        public static final Parcelable.Creator<Tab> CREATOR = new Creator();

        @c("groupIds")
        @k
        private final List<String> groupIds;

        @c("id")
        @k
        private final String id;

        @c("title")
        @k
        private final String tabTitle;

        /* compiled from: SectionedMultiselectParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Tab> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Tab createFromParcel(@k Parcel parcel) {
                return new Tab(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Tab[] newArray(int i12) {
                return new Tab[i12];
            }
        }

        public Tab(@k String str, @k String str2, @k List<String> list) {
            this.id = str;
            this.tabTitle = str2;
            this.groupIds = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Tab copy$default(Tab tab, String str, String str2, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = tab.id;
            }
            if ((i12 & 2) != 0) {
                str2 = tab.tabTitle;
            }
            if ((i12 & 4) != 0) {
                list = tab.groupIds;
            }
            return tab.copy(str, str2, list);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getTabTitle() {
            return this.tabTitle;
        }

        @k
        public final List<String> component3() {
            return this.groupIds;
        }

        @k
        public final Tab copy(@k String id2, @k String tabTitle, @k List<String> groupIds) {
            return new Tab(id2, tabTitle, groupIds);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tab)) {
                return false;
            }
            Tab tab = (Tab) other;
            return L.f(this.id, tab.id) && L.f(this.tabTitle, tab.tabTitle) && L.f(this.groupIds, tab.groupIds);
        }

        @k
        public final List<String> getGroupIds() {
            return this.groupIds;
        }

        @k
        public final String getId() {
            return this.id;
        }

        @k
        public final String getTabTitle() {
            return this.tabTitle;
        }

        public int hashCode() {
            return this.groupIds.hashCode() + H.d(this.id.hashCode() * 31, 31, this.tabTitle);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Tab(id=");
            sb2.append(this.id);
            sb2.append(", tabTitle=");
            sb2.append(this.tabTitle);
            sb2.append(", groupIds=");
            return H.p(sb2, this.groupIds, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.tabTitle);
            parcel.writeStringList(this.groupIds);
        }
    }

    /* compiled from: SectionedMultiselectParameter.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003BK\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJZ\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0011J\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b%\u0010 J \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b.\u0010\u0011R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u0014\"\u0004\b1\u00102R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\u0016R*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010\u0018\"\u0004\b7\u00108R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b\r\u0010\u001a¨\u0006:"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$Value;", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "Lcom/avito/android/remote/model/category_parameters/MultiselectValue;", "id", "name", "Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$Display;", "display", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget;", "widget", "", "options", "", "isDisabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$Display;Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget;Ljava/util/List;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$Display;", "component4", "()Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget;", "component5", "()Ljava/util/List;", "component6", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$Display;Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget;Ljava/util/List;Z)Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$Value;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getName", "Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$Display;", "getDisplay", "setDisplay", "(Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$Display;)V", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget;", "getWidget", "Ljava/util/List;", "getOptions", "setOptions", "(Ljava/util/List;)V", "Z", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Value implements ParcelableEntity<String>, MultiselectValue {

        @k
        public static final Parcelable.Creator<Value> CREATOR = new Creator();

        @c("display")
        @l
        private Display display;

        @c("id")
        @k
        private final String id;

        @c("isDisabled")
        private final boolean isDisabled;

        @c("title")
        @l
        private final String name;

        @c("options")
        @l
        private List<Value> options;

        @c("widget")
        @l
        private final MultiselectParameter.Value.Widget widget;

        /* compiled from: SectionedMultiselectParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Value> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Value createFromParcel(@k Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                ArrayList arrayList = null;
                Display displayCreateFromParcel = parcel.readInt() == 0 ? null : Display.CREATOR.createFromParcel(parcel);
                MultiselectParameter.Value.Widget widgetCreateFromParcel = parcel.readInt() == 0 ? null : MultiselectParameter.Value.Widget.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = a.c(Value.CREATOR, parcel, arrayList, iC2, 1);
                    }
                }
                return new Value(string, string2, displayCreateFromParcel, widgetCreateFromParcel, arrayList, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Value[] newArray(int i12) {
                return new Value[i12];
            }
        }

        public Value(@k String str, @l String str2, @l Display display, @l MultiselectParameter.Value.Widget widget, @l List<Value> list, boolean z12) {
            this.id = str;
            this.name = str2;
            this.display = display;
            this.widget = widget;
            this.options = list;
            this.isDisabled = z12;
        }

        public static /* synthetic */ Value copy$default(Value value, String str, String str2, Display display, MultiselectParameter.Value.Widget widget, List list, boolean z12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = value.id;
            }
            if ((i12 & 2) != 0) {
                str2 = value.name;
            }
            String str3 = str2;
            if ((i12 & 4) != 0) {
                display = value.display;
            }
            Display display2 = display;
            if ((i12 & 8) != 0) {
                widget = value.widget;
            }
            MultiselectParameter.Value.Widget widget2 = widget;
            if ((i12 & 16) != 0) {
                list = value.options;
            }
            List list2 = list;
            if ((i12 & 32) != 0) {
                z12 = value.isDisabled;
            }
            return value.copy(str, str3, display2, widget2, list2, z12);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Display getDisplay() {
            return this.display;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final MultiselectParameter.Value.Widget getWidget() {
            return this.widget;
        }

        @l
        public final List<Value> component5() {
            return this.options;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsDisabled() {
            return this.isDisabled;
        }

        @k
        public final Value copy(@k String id2, @l String name, @l Display display, @l MultiselectParameter.Value.Widget widget, @l List<Value> options, boolean isDisabled) {
            return new Value(id2, name, display, widget, options, isDisabled);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Value)) {
                return false;
            }
            Value value = (Value) other;
            return L.f(this.id, value.id) && L.f(this.name, value.name) && L.f(this.display, value.display) && L.f(this.widget, value.widget) && L.f(this.options, value.options) && this.isDisabled == value.isDisabled;
        }

        @Override // com.avito.android.remote.model.Entity
        @l
        /* renamed from: getName */
        public String getF156312c() {
            return this.name;
        }

        @l
        public final List<Value> getOptions() {
            return this.options;
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectValue
        @l
        public MultiselectParameter.Value.Widget getWidget() {
            return this.widget;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.name;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Display display = this.display;
            int iHashCode3 = (iHashCode2 + (display == null ? 0 : display.hashCode())) * 31;
            MultiselectParameter.Value.Widget widget = this.widget;
            int iHashCode4 = (iHashCode3 + (widget == null ? 0 : widget.hashCode())) * 31;
            List<Value> list = this.options;
            return Boolean.hashCode(this.isDisabled) + ((iHashCode4 + (list != null ? list.hashCode() : 0)) * 31);
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectValue
        public boolean isDisabled() {
            return this.isDisabled;
        }

        public void setDisplay(@l Display display) {
            this.display = display;
        }

        public final void setOptions(@l List<Value> list) {
            this.options = list;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Value(id=");
            sb2.append(this.id);
            sb2.append(", name=");
            sb2.append(this.name);
            sb2.append(", display=");
            sb2.append(this.display);
            sb2.append(", widget=");
            sb2.append(this.widget);
            sb2.append(", options=");
            sb2.append(this.options);
            sb2.append(", isDisabled=");
            return r.x(sb2, this.isDisabled, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.name);
            Display display = this.display;
            if (display == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                display.writeToParcel(parcel, flags);
            }
            MultiselectParameter.Value.Widget widget = this.widget;
            if (widget == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                widget.writeToParcel(parcel, flags);
            }
            List<Value> list = this.options;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    ((Value) itA.next()).writeToParcel(parcel, flags);
                }
            }
            parcel.writeInt(this.isDisabled ? 1 : 0);
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectValue
        @l
        public Display getDisplay() {
            return this.display;
        }

        @Override // com.avito.android.remote.model.Entity
        @k
        public String getId() {
            return this.id;
        }

        public /* synthetic */ Value(String str, String str2, Display display, MultiselectParameter.Value.Widget widget, List list, boolean z12, int i12, C42822w c42822w) {
            this(str, str2, display, (i12 & 8) != 0 ? null : widget, (i12 & 16) != 0 ? null : list, (i12 & 32) != 0 ? false : z12);
        }
    }

    public /* synthetic */ SectionedMultiselectParameter(String str, String str2, boolean z12, boolean z13, AttributedText attributedText, Boolean bool, Boolean bool2, Boolean bool3, SectionedMultiselectValue sectionedMultiselectValue, Displaying displaying, List list, String str3, Integer num, Integer num2, AttributedText attributedText2, MultiselectParameter.FilterHint filterHint, Boolean bool4, Boolean bool5, int i12, C42822w c42822w) {
        this(str, str2, z12, z13, attributedText, bool, (i12 & 64) != 0 ? null : bool2, (i12 & 128) != 0 ? null : bool3, sectionedMultiselectValue, displaying, list, (i12 & 2048) != 0 ? null : str3, (i12 & 4096) != 0 ? null : num, (i12 & 8192) != 0 ? null : num2, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : attributedText2, (32768 & i12) != 0 ? null : filterHint, (65536 & i12) != 0 ? Boolean.FALSE : bool4, (i12 & 131072) != 0 ? Boolean.FALSE : bool5);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final Displaying getDisplaying() {
        return this.displaying;
    }

    @k
    public final List<Value> component11() {
        return this.values;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final Integer getAttributeId() {
        return this.attributeId;
    }

    @l
    /* renamed from: component14, reason: from getter */
    public final Integer getMaxSelected() {
        return this.maxSelected;
    }

    @l
    /* renamed from: component15, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component16, reason: from getter */
    public final MultiselectParameter.FilterHint getHint() {
        return this.hint;
    }

    @l
    /* renamed from: component17, reason: from getter */
    public final Boolean getVisible() {
        return this.visible;
    }

    @l
    /* renamed from: component18, reason: from getter */
    public final Boolean getPhantom() {
        return this.phantom;
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
    public final Boolean getUpdatesObjectForm() {
        return this.updatesObjectForm;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Boolean getHasSuggest() {
        return this.hasSuggest;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final SectionedMultiselectValue getSectionedMultiselectValue() {
        return this.sectionedMultiselectValue;
    }

    @k
    public final SectionedMultiselectParameter copy(@k String id2, @k String title, boolean required, boolean immutable, @l AttributedText motivation, @l Boolean updatesForm, @l Boolean updatesObjectForm, @l Boolean hasSuggest, @l SectionedMultiselectValue sectionedMultiselectValue, @l Displaying displaying, @k List<Value> values, @l String placeholder, @l Integer attributeId, @l Integer maxSelected, @l AttributedText subtitle, @l MultiselectParameter.FilterHint hint, @l Boolean visible, @l Boolean phantom) {
        return new SectionedMultiselectParameter(id2, title, required, immutable, motivation, updatesForm, updatesObjectForm, hasSuggest, sectionedMultiselectValue, displaying, values, placeholder, attributeId, maxSelected, subtitle, hint, visible, phantom);
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
        if (!(other instanceof SectionedMultiselectParameter)) {
            return false;
        }
        SectionedMultiselectParameter sectionedMultiselectParameter = (SectionedMultiselectParameter) other;
        return L.f(this.id, sectionedMultiselectParameter.id) && L.f(this.title, sectionedMultiselectParameter.title) && this.required == sectionedMultiselectParameter.required && this.immutable == sectionedMultiselectParameter.immutable && L.f(this.motivation, sectionedMultiselectParameter.motivation) && L.f(this.updatesForm, sectionedMultiselectParameter.updatesForm) && L.f(this.updatesObjectForm, sectionedMultiselectParameter.updatesObjectForm) && L.f(this.hasSuggest, sectionedMultiselectParameter.hasSuggest) && L.f(this.sectionedMultiselectValue, sectionedMultiselectParameter.sectionedMultiselectValue) && L.f(this.displaying, sectionedMultiselectParameter.displaying) && L.f(this.values, sectionedMultiselectParameter.values) && L.f(this.placeholder, sectionedMultiselectParameter.placeholder) && L.f(this.attributeId, sectionedMultiselectParameter.attributeId) && L.f(this.maxSelected, sectionedMultiselectParameter.maxSelected) && L.f(this.subtitle, sectionedMultiselectParameter.subtitle) && L.f(this.hint, sectionedMultiselectParameter.hint) && L.f(this.visible, sectionedMultiselectParameter.visible) && L.f(this.phantom, sectionedMultiselectParameter.phantom);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CanHaveTypeCorrection
    @l
    public Integer getAttributeId() {
        return this.attributeId;
    }

    @l
    public final Displaying getDisplaying() {
        return this.displaying;
    }

    @l
    public final Boolean getHasSuggest() {
        return this.hasSuggest;
    }

    @l
    public final MultiselectParameter.FilterHint getHint() {
        return this.hint;
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

    @l
    public final Integer getMaxSelected() {
        return this.maxSelected;
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

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    public boolean getRequired() {
        return this.required;
    }

    @l
    public final SectionedMultiselectValue getSectionedMultiselectValue() {
        return this.sectionedMultiselectValue;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
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

    @Override // com.avito.android.remote.model.category_parameters.base.CanHaveTypeCorrection
    @l
    public Boolean getTypoCorrectionEnabled() {
        return this.typoCorrectionEnabled;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseEditableParameter
    @l
    public Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    @l
    public final Boolean getUpdatesObjectForm() {
        return this.updatesObjectForm;
    }

    @k
    public final List<Value> getValues() {
        return this.values;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.Visibility
    @l
    public Boolean getVisible() {
        return this.visible;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public boolean hasValue() {
        return !(getValue() != null ? r0.isEmpty() : true);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public int hashCode() {
        int i12 = r.i(r.i(H.d(this.id.hashCode() * 31, 31, this.title), 31, this.required), 31, this.immutable);
        AttributedText attributedText = this.motivation;
        int iHashCode = (i12 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Boolean bool = this.updatesForm;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.updatesObjectForm;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hasSuggest;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        SectionedMultiselectValue sectionedMultiselectValue = this.sectionedMultiselectValue;
        int iHashCode5 = (iHashCode4 + (sectionedMultiselectValue == null ? 0 : sectionedMultiselectValue.hashCode())) * 31;
        Displaying displaying = this.displaying;
        int iE2 = H.e((iHashCode5 + (displaying == null ? 0 : displaying.hashCode())) * 31, 31, this.values);
        String str = this.placeholder;
        int iHashCode6 = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.attributeId;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxSelected;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        AttributedText attributedText2 = this.subtitle;
        int iHashCode9 = (iHashCode8 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        MultiselectParameter.FilterHint filterHint = this.hint;
        int iHashCode10 = (iHashCode9 + (filterHint == null ? 0 : filterHint.hashCode())) * 31;
        Boolean bool4 = this.visible;
        int iHashCode11 = (iHashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.phantom;
        return iHashCode11 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final void rollbackToOldValue() {
        setValue(getOldValue());
    }

    public final void setSectionedMultiselectValue(@l SectionedMultiselectValue sectionedMultiselectValue) {
        this.sectionedMultiselectValue = sectionedMultiselectValue;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public /* bridge */ /* synthetic */ void set_value(Set<? extends String> set) {
        set_value2((Set<String>) set);
    }

    @k
    public String toString() {
        return "SectionedMultiselectParameter(id:" + getId() + ')';
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
        Boolean bool2 = this.updatesObjectForm;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        Boolean bool3 = this.hasSuggest;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        SectionedMultiselectValue sectionedMultiselectValue = this.sectionedMultiselectValue;
        if (sectionedMultiselectValue == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sectionedMultiselectValue.writeToParcel(parcel, flags);
        }
        Displaying displaying = this.displaying;
        if (displaying == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            displaying.writeToParcel(parcel, flags);
        }
        Iterator itJ = C0.j(this.values, parcel);
        while (itJ.hasNext()) {
            ((Value) itJ.next()).writeToParcel(parcel, flags);
        }
        parcel.writeString(this.placeholder);
        Integer num = this.attributeId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        Integer num2 = this.maxSelected;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num2);
        }
        parcel.writeParcelable(this.subtitle, flags);
        MultiselectParameter.FilterHint filterHint = this.hint;
        if (filterHint == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            filterHint.writeToParcel(parcel, flags);
        }
        Boolean bool4 = this.visible;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool4);
        }
        Boolean bool5 = this.phantom;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool5);
        }
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    @l
    public Set<? extends String> get_value() {
        SectionedMultiselectValue sectionedMultiselectValue = this.sectionedMultiselectValue;
        if (sectionedMultiselectValue != null) {
            return sectionedMultiselectValue.getValueList();
        }
        return null;
    }

    /* renamed from: set_value, reason: avoid collision after fix types in other method */
    public void set_value2(@l Set<String> set) {
        this.sectionedMultiselectValue = new SectionedMultiselectValue(set);
    }

    public SectionedMultiselectParameter(@k String str, @k String str2, boolean z12, boolean z13, @l AttributedText attributedText, @l Boolean bool, @l Boolean bool2, @l Boolean bool3, @l SectionedMultiselectValue sectionedMultiselectValue, @l Displaying displaying, @k List<Value> list, @l String str3, @l Integer num, @l Integer num2, @l AttributedText attributedText2, @l MultiselectParameter.FilterHint filterHint, @l Boolean bool4, @l Boolean bool5) {
        this.id = str;
        this.title = str2;
        this.required = z12;
        this.immutable = z13;
        this.motivation = attributedText;
        this.updatesForm = bool;
        this.updatesObjectForm = bool2;
        this.hasSuggest = bool3;
        this.sectionedMultiselectValue = sectionedMultiselectValue;
        this.displaying = displaying;
        this.values = list;
        this.placeholder = str3;
        this.attributeId = num;
        this.maxSelected = num2;
        this.subtitle = attributedText2;
        this.hint = filterHint;
        this.visible = bool4;
        this.phantom = bool5;
        this.typoCorrectionEnabled = displaying != null ? displaying.getTypoCorrectionEnabled() : null;
    }

    public static /* synthetic */ void getTypoCorrectionEnabled$annotations() {
    }

    /* compiled from: SectionedMultiselectParameter.kt */
    @d
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0083\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b&\u0010'J\u008e\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b*\u0010\u001aJ\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020+HÖ\u0001¢\u0006\u0004\b3\u0010-J \u00108\u001a\u0002072\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020+HÖ\u0001¢\u0006\u0004\b8\u00109R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b;\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b=\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b>\u0010\u001aR$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010?\u001a\u0004\b@\u0010\u001d\"\u0004\bA\u0010BR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\bC\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\bD\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bF\u0010!R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010G\u001a\u0004\bH\u0010#\"\u0004\bI\u0010JR\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010K\u001a\u0004\bL\u0010%R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010M\u001a\u0004\bN\u0010'¨\u0006O"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$Display;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/MultiselectDisplay;", "Lcom/avito/android/remote/model/Color;", "color", "", "title", "subtitle", "Lcom/avito/android/remote/model/Image;", "image", "sortParam", "icon", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Type;", "type", "Lcom/avito/android/remote/model/UniversalImage;", "multiThemeImage", "", "Lcom/avito/android/remote/model/UniversalColor;", "gradientColors", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Display$Link;", "link", "<init>", "(Lcom/avito/android/remote/model/Color;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Type;Lcom/avito/android/remote/model/UniversalImage;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Display$Link;)V", "component1", "()Lcom/avito/android/remote/model/Color;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/avito/android/remote/model/Image;", "component5", "component6", "component7", "()Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Type;", "component8", "()Lcom/avito/android/remote/model/UniversalImage;", "component9", "()Ljava/util/List;", "component10", "()Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Display$Link;", "copy", "(Lcom/avito/android/remote/model/Color;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Type;Lcom/avito/android/remote/model/UniversalImage;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Display$Link;)Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$Display;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Color;", "getColor", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/Image;", "getImage", "setImage", "(Lcom/avito/android/remote/model/Image;)V", "getSortParam", "getIcon", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Type;", "getType", "Lcom/avito/android/remote/model/UniversalImage;", "getMultiThemeImage", "setMultiThemeImage", "(Lcom/avito/android/remote/model/UniversalImage;)V", "Ljava/util/List;", "getGradientColors", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Display$Link;", "getLink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Display implements Parcelable, MultiselectDisplay {

        @k
        public static final Parcelable.Creator<Display> CREATOR = new Creator();

        @c("color")
        @l
        private final Color color;

        @c("gradientColors")
        @l
        private final List<UniversalColor> gradientColors;

        @c("icon")
        @l
        private final String icon;

        @c("images")
        @l
        private Image image;

        @c("link")
        @l
        private final MultiselectParameter.Value.Display.Link link;

        @c("multiThemeImages")
        @l
        private UniversalImage multiThemeImage;

        @c("sortParam")
        @l
        private final String sortParam;

        @c("subtitle")
        @l
        private final String subtitle;

        @c("title")
        @l
        private final String title;

        @c("type")
        @l
        private final MultiselectParameter.Type type;

        /* compiled from: SectionedMultiselectParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Display> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Display createFromParcel(@k Parcel parcel) {
                ArrayList arrayList;
                Color color = (Color) parcel.readParcelable(Display.class.getClassLoader());
                String string = parcel.readString();
                String string2 = parcel.readString();
                Image image = (Image) parcel.readParcelable(Display.class.getClassLoader());
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                MultiselectParameter.Type typeValueOf = parcel.readInt() == 0 ? null : MultiselectParameter.Type.valueOf(parcel.readString());
                UniversalImage universalImage = (UniversalImage) parcel.readParcelable(Display.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = a.l(Display.class, parcel, arrayList, iL2, 1);
                    }
                }
                return new Display(color, string, string2, image, string3, string4, typeValueOf, universalImage, arrayList, parcel.readInt() != 0 ? MultiselectParameter.Value.Display.Link.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Display[] newArray(int i12) {
                return new Display[i12];
            }
        }

        public Display(@l Color color, @l String str, @l String str2, @l Image image, @l String str3, @l String str4, @l MultiselectParameter.Type type, @l UniversalImage universalImage, @l List<UniversalColor> list, @l MultiselectParameter.Value.Display.Link link) {
            this.color = color;
            this.title = str;
            this.subtitle = str2;
            this.image = image;
            this.sortParam = str3;
            this.icon = str4;
            this.type = type;
            this.multiThemeImage = universalImage;
            this.gradientColors = list;
            this.link = link;
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Color getColor() {
            return this.color;
        }

        @l
        /* renamed from: component10, reason: from getter */
        public final MultiselectParameter.Value.Display.Link getLink() {
            return this.link;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getSortParam() {
            return this.sortParam;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final MultiselectParameter.Type getType() {
            return this.type;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final UniversalImage getMultiThemeImage() {
            return this.multiThemeImage;
        }

        @l
        public final List<UniversalColor> component9() {
            return this.gradientColors;
        }

        @k
        public final Display copy(@l Color color, @l String title, @l String subtitle, @l Image image, @l String sortParam, @l String icon, @l MultiselectParameter.Type type, @l UniversalImage multiThemeImage, @l List<UniversalColor> gradientColors, @l MultiselectParameter.Value.Display.Link link) {
            return new Display(color, title, subtitle, image, sortParam, icon, type, multiThemeImage, gradientColors, link);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Display)) {
                return false;
            }
            Display display = (Display) other;
            return L.f(this.color, display.color) && L.f(this.title, display.title) && L.f(this.subtitle, display.subtitle) && L.f(this.image, display.image) && L.f(this.sortParam, display.sortParam) && L.f(this.icon, display.icon) && this.type == display.type && L.f(this.multiThemeImage, display.multiThemeImage) && L.f(this.gradientColors, display.gradientColors) && L.f(this.link, display.link);
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplay
        @l
        public Color getColor() {
            return this.color;
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplay
        @l
        public List<UniversalColor> getGradientColors() {
            return this.gradientColors;
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplay
        @l
        public String getIcon() {
            return this.icon;
        }

        @l
        public final Image getImage() {
            return this.image;
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplay
        @l
        public MultiselectParameter.Value.Display.Link getLink() {
            return this.link;
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplay
        @l
        public UniversalImage getMultiThemeImage() {
            return this.multiThemeImage;
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplay
        @l
        public String getSortParam() {
            return this.sortParam;
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplay
        @l
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplay
        @l
        public String getTitle() {
            return this.title;
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplay
        @l
        public MultiselectParameter.Type getType() {
            return this.type;
        }

        public int hashCode() {
            Color color = this.color;
            int iHashCode = (color == null ? 0 : color.hashCode()) * 31;
            String str = this.title;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subtitle;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Image image = this.image;
            int iHashCode4 = (iHashCode3 + (image == null ? 0 : image.hashCode())) * 31;
            String str3 = this.sortParam;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.icon;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            MultiselectParameter.Type type = this.type;
            int iHashCode7 = (iHashCode6 + (type == null ? 0 : type.hashCode())) * 31;
            UniversalImage universalImage = this.multiThemeImage;
            int iHashCode8 = (iHashCode7 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
            List<UniversalColor> list = this.gradientColors;
            int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
            MultiselectParameter.Value.Display.Link link = this.link;
            return iHashCode9 + (link != null ? link.hashCode() : 0);
        }

        public final void setImage(@l Image image) {
            this.image = image;
        }

        public void setMultiThemeImage(@l UniversalImage universalImage) {
            this.multiThemeImage = universalImage;
        }

        @k
        public String toString() {
            return "Display(color=" + this.color + ", title=" + this.title + ", subtitle=" + this.subtitle + ", image=" + this.image + ", sortParam=" + this.sortParam + ", icon=" + this.icon + ", type=" + this.type + ", multiThemeImage=" + this.multiThemeImage + ", gradientColors=" + this.gradientColors + ", link=" + this.link + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.color, flags);
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeParcelable(this.image, flags);
            parcel.writeString(this.sortParam);
            parcel.writeString(this.icon);
            MultiselectParameter.Type type = this.type;
            if (type == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(type.name());
            }
            parcel.writeParcelable(this.multiThemeImage, flags);
            List<UniversalColor> list = this.gradientColors;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    parcel.writeParcelable((Parcelable) itA.next(), flags);
                }
            }
            MultiselectParameter.Value.Display.Link link = this.link;
            if (link == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                link.writeToParcel(parcel, flags);
            }
        }

        public /* synthetic */ Display(Color color, String str, String str2, Image image, String str3, String str4, MultiselectParameter.Type type, UniversalImage universalImage, List list, MultiselectParameter.Value.Display.Link link, int i12, C42822w c42822w) {
            this(color, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : image, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? null : str4, (i12 & 64) != 0 ? null : type, (i12 & 128) != 0 ? null : universalImage, (i12 & 256) != 0 ? null : list, (i12 & 512) == 0 ? link : null);
        }
    }

    /* compiled from: SectionedMultiselectParameter.kt */
    @d
    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b/\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001BÙ\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0014\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b0\u0010-J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010+J\u0012\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b4\u0010-J\u0012\u00105\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010+J\u0012\u0010:\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b:\u0010-J\u0012\u0010;\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b;\u0010-J\u0018\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b@\u0010+J\u0012\u0010A\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bA\u0010+J\u0012\u0010B\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bB\u0010-J\u0012\u0010C\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0018\u0010E\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bE\u0010=J\u0012\u0010F\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bF\u0010-J\u0018\u0010G\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bG\u0010=J\u0018\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bH\u0010=J\u0012\u0010I\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bK\u0010+J\u0018\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bL\u0010=J\u0012\u0010M\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bM\u0010-Jä\u0002\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00142\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00142\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00142\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00142\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bP\u0010+J\u0010\u0010Q\u001a\u00020#HÖ\u0001¢\u0006\u0004\bQ\u0010RJ\u001a\u0010U\u001a\u00020\u00042\b\u0010T\u001a\u0004\u0018\u00010SHÖ\u0003¢\u0006\u0004\bU\u0010VJ\u0010\u0010W\u001a\u00020#HÖ\u0001¢\u0006\u0004\bW\u0010RJ \u0010\\\u001a\u00020[2\u0006\u0010Y\u001a\u00020X2\u0006\u0010Z\u001a\u00020#HÖ\u0001¢\u0006\u0004\b\\\u0010]R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010^\u001a\u0004\b_\u0010+R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010`\u001a\u0004\ba\u0010-R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010b\u001a\u0004\bc\u0010/R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010`\u001a\u0004\bd\u0010-R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010^\u001a\u0004\be\u0010+R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010f\u001a\u0004\bg\u00103R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010`\u001a\u0004\bh\u0010-R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010i\u001a\u0004\bj\u00106R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010k\u001a\u0004\bl\u00108R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010^\u001a\u0004\bm\u0010+R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010`\u001a\u0004\bn\u0010-R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010`\u001a\u0004\bo\u0010-R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010p\u001a\u0004\bq\u0010=R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010r\u001a\u0004\bs\u0010?R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010^\u001a\u0004\bt\u0010+R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010^\u001a\u0004\bu\u0010+R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010`\u001a\u0004\bv\u0010-R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010w\u001a\u0004\bx\u0010DR\"\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010p\u001a\u0004\by\u0010=R\u001c\u0010 \u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010`\u001a\u0004\bz\u0010-R\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010p\u001a\u0004\b{\u0010=R\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010p\u001a\u0004\b|\u0010=R\u001c\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010}\u001a\u0004\b~\u0010JR\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010^\u001a\u0004\b\u007f\u0010+R#\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0016X\u0097\u0004¢\u0006\r\n\u0004\b&\u0010p\u001a\u0005\b\u0080\u0001\u0010=R\u001d\u0010'\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\r\n\u0004\b'\u0010`\u001a\u0005\b\u0081\u0001\u0010-¨\u0006\u0082\u0001"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$Displaying;", "Lcom/avito/android/remote/model/category_parameters/MultiselectDisplaying;", "", "type", "", "typoCorrectionEnabled", "Lcom/avito/android/remote/model/category_parameters/CustomPaddings;", "customPaddings", "withImages", "titlePattern", "Lcom/avito/android/remote/model/category_parameters/SortDirection;", "sortDirection", "hideTitle", "Lcom/avito/android/remote/model/category_parameters/TipIconParameters;", "tipIconParameters", "Lcom/avito/android/remote/model/category_parameters/DisplayingImageParams;", "imageParams", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "keepSelectedChip", "areGroupsCollapsible", "", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Displaying$Group;", "groups", "Lcom/avito/android/deep_linking/links/DeepLink;", "titleTipAction", "confirmButtonTitle", ChannelContext.Item.PLACEHOLDER, "hideShowMore", "Lcom/avito/android/remote/model/category_parameters/DialogDisplaying;", "dialogDisplaying", "Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$Tab;", "tabs", "hideCounterOnEmptyTabSelection", "radioIds", "titlePlural", "", "limit", "limitMessage", "topValues", "toFillIn", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/CustomPaddings;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/SortDirection;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/TipIconParameters;Lcom/avito/android/remote/model/category_parameters/DisplayingImageParams;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/DialogDisplaying;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Lcom/avito/android/remote/model/category_parameters/CustomPaddings;", "component4", "component5", "component6", "()Lcom/avito/android/remote/model/category_parameters/SortDirection;", "component7", "component8", "()Lcom/avito/android/remote/model/category_parameters/TipIconParameters;", "component9", "()Lcom/avito/android/remote/model/category_parameters/DisplayingImageParams;", "component10", "component11", "component12", "component13", "()Ljava/util/List;", "component14", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component15", "component16", "component17", "component18", "()Lcom/avito/android/remote/model/category_parameters/DialogDisplaying;", "component19", "component20", "component21", "component22", "component23", "()Ljava/lang/Integer;", "component24", "component25", "component26", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/CustomPaddings;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/SortDirection;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/TipIconParameters;Lcom/avito/android/remote/model/category_parameters/DisplayingImageParams;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/DialogDisplaying;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$Displaying;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "Ljava/lang/Boolean;", "getTypoCorrectionEnabled", "Lcom/avito/android/remote/model/category_parameters/CustomPaddings;", "getCustomPaddings", "getWithImages", "getTitlePattern", "Lcom/avito/android/remote/model/category_parameters/SortDirection;", "getSortDirection", "getHideTitle", "Lcom/avito/android/remote/model/category_parameters/TipIconParameters;", "getTipIconParameters", "Lcom/avito/android/remote/model/category_parameters/DisplayingImageParams;", "getImageParams", "getStyle", "getKeepSelectedChip", "getAreGroupsCollapsible", "Ljava/util/List;", "getGroups", "Lcom/avito/android/deep_linking/links/DeepLink;", "getTitleTipAction", "getConfirmButtonTitle", "getPlaceholder", "getHideShowMore", "Lcom/avito/android/remote/model/category_parameters/DialogDisplaying;", "getDialogDisplaying", "getTabs", "getHideCounterOnEmptyTabSelection", "getRadioIds", "getTitlePlural", "Ljava/lang/Integer;", "getLimit", "getLimitMessage", "getTopValues", "getToFillIn", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Displaying implements MultiselectDisplaying {

        @k
        public static final Parcelable.Creator<Displaying> CREATOR = new Creator();

        @c("areGroupsCollapsible")
        @l
        private final Boolean areGroupsCollapsible;

        @c("confirmButtonTitle")
        @l
        private final String confirmButtonTitle;

        @c("customPaddings")
        @l
        private final CustomPaddings customPaddings;

        @c("dialog")
        @l
        private final DialogDisplaying dialogDisplaying;

        @c("groups")
        @l
        private final List<MultiselectParameter.Displaying.Group> groups;

        @c("hideCounterOnEmptyTabSelection")
        @l
        private final Boolean hideCounterOnEmptyTabSelection;

        @c("hideShowMore")
        @l
        private final Boolean hideShowMore;

        @c("hideTitle")
        @l
        private final Boolean hideTitle;

        @c("imageParams")
        @l
        private final DisplayingImageParams imageParams;

        @c("keepSelected")
        @l
        private final Boolean keepSelectedChip;

        @c("limit")
        @l
        private final Integer limit;

        @c("limitMessage")
        @l
        private final String limitMessage;

        @c(ChannelContext.Item.PLACEHOLDER)
        @l
        private final String placeholder;

        @c("radioIds")
        @l
        private final List<String> radioIds;

        @c("sortDirection")
        @l
        private final SortDirection sortDirection;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final String style;

        @c("tabs")
        @l
        private final List<Tab> tabs;

        @c("tipIconParameters")
        @l
        private final TipIconParameters tipIconParameters;

        @c("titlePattern")
        @l
        private final String titlePattern;

        @c("titlePlural")
        @l
        private final List<String> titlePlural;

        @c("titleTipAction")
        @l
        private final DeepLink titleTipAction;

        @c("toFillIn")
        @l
        private final Boolean toFillIn;

        @c("topValues")
        @l
        private final List<String> topValues;

        @c("type")
        @k
        private final String type;

        @c("typoCorrectionEnabled")
        @l
        private final Boolean typoCorrectionEnabled;

        @c("withImages")
        @l
        private final Boolean withImages;

        /* compiled from: SectionedMultiselectParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Displaying> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Displaying createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                Boolean boolValueOf2;
                Boolean boolValueOf3;
                Boolean boolValueOf4;
                Boolean boolValueOf5;
                Boolean bool;
                ArrayList arrayList;
                Boolean boolValueOf6;
                ArrayList arrayList2;
                ArrayList arrayList3;
                Boolean boolValueOf7;
                Boolean boolValueOf8;
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                CustomPaddings customPaddingsCreateFromParcel = parcel.readInt() == 0 ? null : CustomPaddings.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String string2 = parcel.readString();
                SortDirection sortDirectionValueOf = parcel.readInt() == 0 ? null : SortDirection.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    boolValueOf3 = null;
                } else {
                    boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                TipIconParameters tipIconParametersCreateFromParcel = parcel.readInt() == 0 ? null : TipIconParameters.CREATOR.createFromParcel(parcel);
                DisplayingImageParams displayingImageParamsCreateFromParcel = parcel.readInt() == 0 ? null : DisplayingImageParams.CREATOR.createFromParcel(parcel);
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf4 = null;
                } else {
                    boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    boolValueOf5 = null;
                } else {
                    boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    bool = boolValueOf5;
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = a.c(MultiselectParameter.Displaying.Group.CREATOR, parcel, arrayList4, iC2, 1);
                        i12 = i12;
                        boolValueOf5 = boolValueOf5;
                    }
                    bool = boolValueOf5;
                    arrayList = arrayList4;
                }
                DeepLink deepLink = (DeepLink) parcel.readParcelable(Displaying.class.getClassLoader());
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf6 = null;
                } else {
                    boolValueOf6 = Boolean.valueOf(parcel.readInt() != 0);
                }
                DialogDisplaying dialogDisplayingCreateFromParcel = parcel.readInt() == 0 ? null : DialogDisplaying.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList2 = arrayList;
                    arrayList3 = null;
                } else {
                    int i13 = parcel.readInt();
                    ArrayList arrayList5 = new ArrayList(i13);
                    int iC3 = 0;
                    while (iC3 != i13) {
                        iC3 = a.c(Tab.CREATOR, parcel, arrayList5, iC3, 1);
                        i13 = i13;
                        arrayList = arrayList;
                    }
                    arrayList2 = arrayList;
                    arrayList3 = arrayList5;
                }
                if (parcel.readInt() == 0) {
                    boolValueOf7 = null;
                } else {
                    boolValueOf7 = Boolean.valueOf(parcel.readInt() != 0);
                }
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String string6 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
                if (parcel.readInt() == 0) {
                    boolValueOf8 = null;
                } else {
                    boolValueOf8 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Displaying(string, boolValueOf, customPaddingsCreateFromParcel, boolValueOf2, string2, sortDirectionValueOf, boolValueOf3, tipIconParametersCreateFromParcel, displayingImageParamsCreateFromParcel, string3, boolValueOf4, bool, arrayList2, deepLink, string4, string5, boolValueOf6, dialogDisplayingCreateFromParcel, arrayList3, boolValueOf7, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, numValueOf, string6, arrayListCreateStringArrayList3, boolValueOf8);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Displaying[] newArray(int i12) {
                return new Displaying[i12];
            }
        }

        public Displaying(@k String str, @l Boolean bool, @l CustomPaddings customPaddings, @l Boolean bool2, @l String str2, @l SortDirection sortDirection, @l Boolean bool3, @l TipIconParameters tipIconParameters, @l DisplayingImageParams displayingImageParams, @l String str3, @l Boolean bool4, @l Boolean bool5, @l List<MultiselectParameter.Displaying.Group> list, @l DeepLink deepLink, @l String str4, @l String str5, @l Boolean bool6, @l DialogDisplaying dialogDisplaying, @l List<Tab> list2, @l Boolean bool7, @l List<String> list3, @l List<String> list4, @l Integer num, @l String str6, @l List<String> list5, @l Boolean bool8) {
            this.type = str;
            this.typoCorrectionEnabled = bool;
            this.customPaddings = customPaddings;
            this.withImages = bool2;
            this.titlePattern = str2;
            this.sortDirection = sortDirection;
            this.hideTitle = bool3;
            this.tipIconParameters = tipIconParameters;
            this.imageParams = displayingImageParams;
            this.style = str3;
            this.keepSelectedChip = bool4;
            this.areGroupsCollapsible = bool5;
            this.groups = list;
            this.titleTipAction = deepLink;
            this.confirmButtonTitle = str4;
            this.placeholder = str5;
            this.hideShowMore = bool6;
            this.dialogDisplaying = dialogDisplaying;
            this.tabs = list2;
            this.hideCounterOnEmptyTabSelection = bool7;
            this.radioIds = list3;
            this.titlePlural = list4;
            this.limit = num;
            this.limitMessage = str6;
            this.topValues = list5;
            this.toFillIn = bool8;
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @l
        /* renamed from: component10, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @l
        /* renamed from: component11, reason: from getter */
        public final Boolean getKeepSelectedChip() {
            return this.keepSelectedChip;
        }

        @l
        /* renamed from: component12, reason: from getter */
        public final Boolean getAreGroupsCollapsible() {
            return this.areGroupsCollapsible;
        }

        @l
        public final List<MultiselectParameter.Displaying.Group> component13() {
            return this.groups;
        }

        @l
        /* renamed from: component14, reason: from getter */
        public final DeepLink getTitleTipAction() {
            return this.titleTipAction;
        }

        @l
        /* renamed from: component15, reason: from getter */
        public final String getConfirmButtonTitle() {
            return this.confirmButtonTitle;
        }

        @l
        /* renamed from: component16, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @l
        /* renamed from: component17, reason: from getter */
        public final Boolean getHideShowMore() {
            return this.hideShowMore;
        }

        @l
        /* renamed from: component18, reason: from getter */
        public final DialogDisplaying getDialogDisplaying() {
            return this.dialogDisplaying;
        }

        @l
        public final List<Tab> component19() {
            return this.tabs;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Boolean getTypoCorrectionEnabled() {
            return this.typoCorrectionEnabled;
        }

        @l
        /* renamed from: component20, reason: from getter */
        public final Boolean getHideCounterOnEmptyTabSelection() {
            return this.hideCounterOnEmptyTabSelection;
        }

        @l
        public final List<String> component21() {
            return this.radioIds;
        }

        @l
        public final List<String> component22() {
            return this.titlePlural;
        }

        @l
        /* renamed from: component23, reason: from getter */
        public final Integer getLimit() {
            return this.limit;
        }

        @l
        /* renamed from: component24, reason: from getter */
        public final String getLimitMessage() {
            return this.limitMessage;
        }

        @l
        public final List<String> component25() {
            return this.topValues;
        }

        @l
        /* renamed from: component26, reason: from getter */
        public final Boolean getToFillIn() {
            return this.toFillIn;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final CustomPaddings getCustomPaddings() {
            return this.customPaddings;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Boolean getWithImages() {
            return this.withImages;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getTitlePattern() {
            return this.titlePattern;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final SortDirection getSortDirection() {
            return this.sortDirection;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final Boolean getHideTitle() {
            return this.hideTitle;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final TipIconParameters getTipIconParameters() {
            return this.tipIconParameters;
        }

        @l
        /* renamed from: component9, reason: from getter */
        public final DisplayingImageParams getImageParams() {
            return this.imageParams;
        }

        @k
        public final Displaying copy(@k String type, @l Boolean typoCorrectionEnabled, @l CustomPaddings customPaddings, @l Boolean withImages, @l String titlePattern, @l SortDirection sortDirection, @l Boolean hideTitle, @l TipIconParameters tipIconParameters, @l DisplayingImageParams imageParams, @l String style, @l Boolean keepSelectedChip, @l Boolean areGroupsCollapsible, @l List<MultiselectParameter.Displaying.Group> groups, @l DeepLink titleTipAction, @l String confirmButtonTitle, @l String placeholder, @l Boolean hideShowMore, @l DialogDisplaying dialogDisplaying, @l List<Tab> tabs, @l Boolean hideCounterOnEmptyTabSelection, @l List<String> radioIds, @l List<String> titlePlural, @l Integer limit, @l String limitMessage, @l List<String> topValues, @l Boolean toFillIn) {
            return new Displaying(type, typoCorrectionEnabled, customPaddings, withImages, titlePattern, sortDirection, hideTitle, tipIconParameters, imageParams, style, keepSelectedChip, areGroupsCollapsible, groups, titleTipAction, confirmButtonTitle, placeholder, hideShowMore, dialogDisplaying, tabs, hideCounterOnEmptyTabSelection, radioIds, titlePlural, limit, limitMessage, topValues, toFillIn);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Displaying)) {
                return false;
            }
            Displaying displaying = (Displaying) other;
            return L.f(this.type, displaying.type) && L.f(this.typoCorrectionEnabled, displaying.typoCorrectionEnabled) && L.f(this.customPaddings, displaying.customPaddings) && L.f(this.withImages, displaying.withImages) && L.f(this.titlePattern, displaying.titlePattern) && this.sortDirection == displaying.sortDirection && L.f(this.hideTitle, displaying.hideTitle) && L.f(this.tipIconParameters, displaying.tipIconParameters) && L.f(this.imageParams, displaying.imageParams) && L.f(this.style, displaying.style) && L.f(this.keepSelectedChip, displaying.keepSelectedChip) && L.f(this.areGroupsCollapsible, displaying.areGroupsCollapsible) && L.f(this.groups, displaying.groups) && L.f(this.titleTipAction, displaying.titleTipAction) && L.f(this.confirmButtonTitle, displaying.confirmButtonTitle) && L.f(this.placeholder, displaying.placeholder) && L.f(this.hideShowMore, displaying.hideShowMore) && L.f(this.dialogDisplaying, displaying.dialogDisplaying) && L.f(this.tabs, displaying.tabs) && L.f(this.hideCounterOnEmptyTabSelection, displaying.hideCounterOnEmptyTabSelection) && L.f(this.radioIds, displaying.radioIds) && L.f(this.titlePlural, displaying.titlePlural) && L.f(this.limit, displaying.limit) && L.f(this.limitMessage, displaying.limitMessage) && L.f(this.topValues, displaying.topValues) && L.f(this.toFillIn, displaying.toFillIn);
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplaying
        @l
        public Boolean getAreGroupsCollapsible() {
            return this.areGroupsCollapsible;
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplaying
        @l
        public String getConfirmButtonTitle() {
            return this.confirmButtonTitle;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectDisplayingOptions
        @l
        public CustomPaddings getCustomPaddings() {
            return this.customPaddings;
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplaying
        @l
        public DialogDisplaying getDialogDisplaying() {
            return this.dialogDisplaying;
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplaying
        @l
        public List<MultiselectParameter.Displaying.Group> getGroups() {
            return this.groups;
        }

        @l
        public final Boolean getHideCounterOnEmptyTabSelection() {
            return this.hideCounterOnEmptyTabSelection;
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplaying
        @l
        public Boolean getHideShowMore() {
            return this.hideShowMore;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectDisplayingOptions
        @l
        public Boolean getHideTitle() {
            return this.hideTitle;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectDisplayingOptions
        @l
        public DisplayingImageParams getImageParams() {
            return this.imageParams;
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplaying
        @l
        public Boolean getKeepSelectedChip() {
            return this.keepSelectedChip;
        }

        @l
        public final Integer getLimit() {
            return this.limit;
        }

        @l
        public final String getLimitMessage() {
            return this.limitMessage;
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplaying
        @l
        public String getPlaceholder() {
            return this.placeholder;
        }

        @l
        public final List<String> getRadioIds() {
            return this.radioIds;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectDisplayingOptions
        @l
        public SortDirection getSortDirection() {
            return this.sortDirection;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectDisplayingOptions
        @l
        public String getStyle() {
            return this.style;
        }

        @l
        public final List<Tab> getTabs() {
            return this.tabs;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectDisplayingOptions
        @l
        public TipIconParameters getTipIconParameters() {
            return this.tipIconParameters;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectDisplayingOptions
        @l
        public String getTitlePattern() {
            return this.titlePattern;
        }

        @l
        public final List<String> getTitlePlural() {
            return this.titlePlural;
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplaying
        @l
        public DeepLink getTitleTipAction() {
            return this.titleTipAction;
        }

        @l
        public final Boolean getToFillIn() {
            return this.toFillIn;
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplaying
        @l
        public List<String> getTopValues() {
            return this.topValues;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectDisplayingOptions
        @k
        public String getType() {
            return this.type;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectDisplayingOptions
        @l
        public Boolean getTypoCorrectionEnabled() {
            return this.typoCorrectionEnabled;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectDisplayingOptions
        @l
        public Boolean getWithImages() {
            return this.withImages;
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            Boolean bool = this.typoCorrectionEnabled;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            CustomPaddings customPaddings = this.customPaddings;
            int iHashCode3 = (iHashCode2 + (customPaddings == null ? 0 : customPaddings.hashCode())) * 31;
            Boolean bool2 = this.withImages;
            int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this.titlePattern;
            int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            SortDirection sortDirection = this.sortDirection;
            int iHashCode6 = (iHashCode5 + (sortDirection == null ? 0 : sortDirection.hashCode())) * 31;
            Boolean bool3 = this.hideTitle;
            int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            TipIconParameters tipIconParameters = this.tipIconParameters;
            int iHashCode8 = (iHashCode7 + (tipIconParameters == null ? 0 : tipIconParameters.hashCode())) * 31;
            DisplayingImageParams displayingImageParams = this.imageParams;
            int iHashCode9 = (iHashCode8 + (displayingImageParams == null ? 0 : displayingImageParams.hashCode())) * 31;
            String str2 = this.style;
            int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool4 = this.keepSelectedChip;
            int iHashCode11 = (iHashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.areGroupsCollapsible;
            int iHashCode12 = (iHashCode11 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            List<MultiselectParameter.Displaying.Group> list = this.groups;
            int iHashCode13 = (iHashCode12 + (list == null ? 0 : list.hashCode())) * 31;
            DeepLink deepLink = this.titleTipAction;
            int iHashCode14 = (iHashCode13 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            String str3 = this.confirmButtonTitle;
            int iHashCode15 = (iHashCode14 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.placeholder;
            int iHashCode16 = (iHashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool6 = this.hideShowMore;
            int iHashCode17 = (iHashCode16 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            DialogDisplaying dialogDisplaying = this.dialogDisplaying;
            int iHashCode18 = (iHashCode17 + (dialogDisplaying == null ? 0 : dialogDisplaying.hashCode())) * 31;
            List<Tab> list2 = this.tabs;
            int iHashCode19 = (iHashCode18 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Boolean bool7 = this.hideCounterOnEmptyTabSelection;
            int iHashCode20 = (iHashCode19 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            List<String> list3 = this.radioIds;
            int iHashCode21 = (iHashCode20 + (list3 == null ? 0 : list3.hashCode())) * 31;
            List<String> list4 = this.titlePlural;
            int iHashCode22 = (iHashCode21 + (list4 == null ? 0 : list4.hashCode())) * 31;
            Integer num = this.limit;
            int iHashCode23 = (iHashCode22 + (num == null ? 0 : num.hashCode())) * 31;
            String str5 = this.limitMessage;
            int iHashCode24 = (iHashCode23 + (str5 == null ? 0 : str5.hashCode())) * 31;
            List<String> list5 = this.topValues;
            int iHashCode25 = (iHashCode24 + (list5 == null ? 0 : list5.hashCode())) * 31;
            Boolean bool8 = this.toFillIn;
            return iHashCode25 + (bool8 != null ? bool8.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Displaying(type=");
            sb2.append(this.type);
            sb2.append(", typoCorrectionEnabled=");
            sb2.append(this.typoCorrectionEnabled);
            sb2.append(", customPaddings=");
            sb2.append(this.customPaddings);
            sb2.append(", withImages=");
            sb2.append(this.withImages);
            sb2.append(", titlePattern=");
            sb2.append(this.titlePattern);
            sb2.append(", sortDirection=");
            sb2.append(this.sortDirection);
            sb2.append(", hideTitle=");
            sb2.append(this.hideTitle);
            sb2.append(", tipIconParameters=");
            sb2.append(this.tipIconParameters);
            sb2.append(", imageParams=");
            sb2.append(this.imageParams);
            sb2.append(", style=");
            sb2.append(this.style);
            sb2.append(", keepSelectedChip=");
            sb2.append(this.keepSelectedChip);
            sb2.append(", areGroupsCollapsible=");
            sb2.append(this.areGroupsCollapsible);
            sb2.append(", groups=");
            sb2.append(this.groups);
            sb2.append(", titleTipAction=");
            sb2.append(this.titleTipAction);
            sb2.append(", confirmButtonTitle=");
            sb2.append(this.confirmButtonTitle);
            sb2.append(", placeholder=");
            sb2.append(this.placeholder);
            sb2.append(", hideShowMore=");
            sb2.append(this.hideShowMore);
            sb2.append(", dialogDisplaying=");
            sb2.append(this.dialogDisplaying);
            sb2.append(", tabs=");
            sb2.append(this.tabs);
            sb2.append(", hideCounterOnEmptyTabSelection=");
            sb2.append(this.hideCounterOnEmptyTabSelection);
            sb2.append(", radioIds=");
            sb2.append(this.radioIds);
            sb2.append(", titlePlural=");
            sb2.append(this.titlePlural);
            sb2.append(", limit=");
            sb2.append(this.limit);
            sb2.append(", limitMessage=");
            sb2.append(this.limitMessage);
            sb2.append(", topValues=");
            sb2.append(this.topValues);
            sb2.append(", toFillIn=");
            return C0.g(sb2, this.toFillIn, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.type);
            Boolean bool = this.typoCorrectionEnabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            CustomPaddings customPaddings = this.customPaddings;
            if (customPaddings == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                customPaddings.writeToParcel(parcel, flags);
            }
            Boolean bool2 = this.withImages;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool2);
            }
            parcel.writeString(this.titlePattern);
            SortDirection sortDirection = this.sortDirection;
            if (sortDirection == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(sortDirection.name());
            }
            Boolean bool3 = this.hideTitle;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool3);
            }
            TipIconParameters tipIconParameters = this.tipIconParameters;
            if (tipIconParameters == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                tipIconParameters.writeToParcel(parcel, flags);
            }
            DisplayingImageParams displayingImageParams = this.imageParams;
            if (displayingImageParams == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                displayingImageParams.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.style);
            Boolean bool4 = this.keepSelectedChip;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool4);
            }
            Boolean bool5 = this.areGroupsCollapsible;
            if (bool5 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool5);
            }
            List<MultiselectParameter.Displaying.Group> list = this.groups;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    ((MultiselectParameter.Displaying.Group) itA.next()).writeToParcel(parcel, flags);
                }
            }
            parcel.writeParcelable(this.titleTipAction, flags);
            parcel.writeString(this.confirmButtonTitle);
            parcel.writeString(this.placeholder);
            Boolean bool6 = this.hideShowMore;
            if (bool6 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool6);
            }
            DialogDisplaying dialogDisplaying = this.dialogDisplaying;
            if (dialogDisplaying == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dialogDisplaying.writeToParcel(parcel, flags);
            }
            List<Tab> list2 = this.tabs;
            if (list2 == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA2 = a.A(list2, parcel, 1);
                while (itA2.hasNext()) {
                    ((Tab) itA2.next()).writeToParcel(parcel, flags);
                }
            }
            Boolean bool7 = this.hideCounterOnEmptyTabSelection;
            if (bool7 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool7);
            }
            parcel.writeStringList(this.radioIds);
            parcel.writeStringList(this.titlePlural);
            Integer num = this.limit;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
            parcel.writeString(this.limitMessage);
            parcel.writeStringList(this.topValues);
            Boolean bool8 = this.toFillIn;
            if (bool8 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool8);
            }
        }

        public /* synthetic */ Displaying(String str, Boolean bool, CustomPaddings customPaddings, Boolean bool2, String str2, SortDirection sortDirection, Boolean bool3, TipIconParameters tipIconParameters, DisplayingImageParams displayingImageParams, String str3, Boolean bool4, Boolean bool5, List list, DeepLink deepLink, String str4, String str5, Boolean bool6, DialogDisplaying dialogDisplaying, List list2, Boolean bool7, List list3, List list4, Integer num, String str6, List list5, Boolean bool8, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? Boolean.FALSE : bool, (i12 & 4) != 0 ? null : customPaddings, (i12 & 8) != 0 ? Boolean.FALSE : bool2, (i12 & 16) != 0 ? null : str2, (i12 & 32) != 0 ? null : sortDirection, (i12 & 64) != 0 ? Boolean.FALSE : bool3, (i12 & 128) != 0 ? null : tipIconParameters, (i12 & 256) != 0 ? null : displayingImageParams, (i12 & 512) != 0 ? null : str3, (i12 & 1024) != 0 ? null : bool4, (i12 & 2048) != 0 ? Boolean.FALSE : bool5, (i12 & 4096) != 0 ? null : list, (i12 & 8192) != 0 ? null : deepLink, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str4, (i12 & 32768) != 0 ? null : str5, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? Boolean.FALSE : bool6, (i12 & 131072) != 0 ? null : dialogDisplaying, (i12 & 262144) != 0 ? null : list2, (i12 & 524288) != 0 ? null : bool7, (i12 & 1048576) != 0 ? null : list3, (i12 & 2097152) != 0 ? null : list4, (i12 & 4194304) != 0 ? null : num, (i12 & 8388608) != 0 ? null : str6, (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : list5, (i12 & 33554432) == 0 ? bool8 : null);
        }
    }
}

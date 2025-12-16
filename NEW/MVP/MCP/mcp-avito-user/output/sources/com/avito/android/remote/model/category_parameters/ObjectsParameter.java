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
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.base.Phantom;
import com.avito.android.remote.model.category_parameters.base.Visibility;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ObjectsParameter.kt */
@s0
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 g2\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00020\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0003ghiB¯\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010 J#\u0010#\u001a\u00020\"2\u0014\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0002¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b(\u0010 J\u0010\u0010)\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b)\u0010 J\u0012\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u00101J\u001e\u00102\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u00101J\u0012\u00103\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b7\u00106J\u0012\u00108\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b8\u00109J\u0018\u0010:\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u00101JÈ\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b=\u0010&J\u0010\u0010?\u001a\u00020>HÖ\u0001¢\u0006\u0004\b?\u0010@J\u001a\u0010C\u001a\u00020\n2\b\u0010B\u001a\u0004\u0018\u00010AHÖ\u0003¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020>HÖ\u0001¢\u0006\u0004\bE\u0010@J \u0010I\u001a\u00020\"2\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020>HÖ\u0001¢\u0006\u0004\bI\u0010JR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010K\u001a\u0004\bL\u0010&R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010K\u001a\u0004\bM\u0010&R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010N\u001a\u0004\bO\u0010 R\u001a\u0010\f\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010N\u001a\u0004\bP\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010Q\u001a\u0004\bR\u0010+R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010S\u001a\u0004\bT\u0010-R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010U\u001a\u0004\bV\u0010/R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010W\u001a\u0004\bX\u00101R0\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010W\u001a\u0004\bY\u00101\"\u0004\bZ\u0010$R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010[\u001a\u0004\b\\\u00104R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010]\u001a\u0004\b^\u00106R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010]\u001a\u0004\b_\u00106R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010`\u001a\u0004\ba\u00109R\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001c\u0010W\u001a\u0004\bb\u00101R\u0014\u0010d\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010&R\u0016\u0010f\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u00106¨\u0006j"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/ObjectsParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "Lcom/avito/android/remote/model/category_parameters/base/Visibility;", "Lcom/avito/android/remote/model/category_parameters/base/HasConstraints;", "Lcom/avito/android/remote/model/category_parameters/base/Phantom;", "", "id", "title", "", "required", "immutable", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "Lcom/avito/android/remote/model/category_parameters/Restrictions;", "restrictions", "Lcom/avito/android/remote/model/category_parameters/ObjectsParameter$Summary;", "summary", "params", "_value", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "displayingOptions", "visible", "phantom", "Lcom/avito/android/remote/model/category_parameters/ObjectsParameter$Widget;", "widget", "Lcom/avito/android/remote/model/category_parameters/Constraint;", "constraints", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/category_parameters/Restrictions;Lcom/avito/android/remote/model/category_parameters/ObjectsParameter$Summary;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/ObjectsParameter$Widget;Ljava/util/List;)V", "hasValue", "()Z", "value", "Lkotlin/G0;", "applyChangedValue", "(Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/avito/android/remote/model/text/AttributedText;", "component6", "()Lcom/avito/android/remote/model/category_parameters/Restrictions;", "component7", "()Lcom/avito/android/remote/model/category_parameters/ObjectsParameter$Summary;", "component8", "()Ljava/util/List;", "component9", "component10", "()Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "component11", "()Ljava/lang/Boolean;", "component12", "component13", "()Lcom/avito/android/remote/model/category_parameters/ObjectsParameter$Widget;", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/category_parameters/Restrictions;Lcom/avito/android/remote/model/category_parameters/ObjectsParameter$Summary;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/ObjectsParameter$Widget;Ljava/util/List;)Lcom/avito/android/remote/model/category_parameters/ObjectsParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Z", "getRequired", "getImmutable", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "Lcom/avito/android/remote/model/category_parameters/Restrictions;", "getRestrictions", "Lcom/avito/android/remote/model/category_parameters/ObjectsParameter$Summary;", "getSummary", "Ljava/util/List;", "getParams", "get_value", "set_value", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "getDisplayingOptions", "Ljava/lang/Boolean;", "getVisible", "getPhantom", "Lcom/avito/android/remote/model/category_parameters/ObjectsParameter$Widget;", "getWidget", "getConstraints", "getType", "type", "getUpdatesForm", "updatesForm", "Companion", "Summary", "Widget", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes17.dex */
public final /* data */ class ObjectsParameter extends EditableParameter<List<? extends List<? extends ParameterSlot>>> implements Visibility, HasConstraints, Phantom {

    @k
    public static final String TYPE = "objects";

    @c("value")
    @l
    private List<? extends List<? extends ParameterSlot>> _value;

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

    @c("params")
    @l
    private final List<ParameterSlot> params;

    @c("phantom")
    @l
    private final Boolean phantom;

    @c("required")
    private final boolean required;

    @c("restrictions")
    @l
    private final Restrictions restrictions;

    @c("summary")
    @l
    private final Summary summary;

    @c("title")
    @k
    private final String title;

    @c("visible")
    @l
    private final Boolean visible;

    @c("widget")
    @l
    private final Widget widget;

    @k
    public static final Parcelable.Creator<ObjectsParameter> CREATOR = new Creator();

    /* compiled from: ObjectsParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ObjectsParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ObjectsParameter createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean bool;
            ArrayList arrayList3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(ObjectsParameter.class.getClassLoader());
            Restrictions restrictionsCreateFromParcel = parcel.readInt() == 0 ? null : Restrictions.CREATOR.createFromParcel(parcel);
            Summary summaryCreateFromParcel = parcel.readInt() == 0 ? null : Summary.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(ObjectsParameter.class, parcel, arrayList, iL2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    int i15 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(i15);
                    int iL3 = 0;
                    while (iL3 != i15) {
                        iL3 = a.l(ObjectsParameter.class, parcel, arrayList4, iL3, 1);
                        i15 = i15;
                    }
                    arrayList2.add(arrayList4);
                }
            }
            DisplayingOptions displayingOptionsCreateFromParcel = parcel.readInt() == 0 ? null : DisplayingOptions.CREATOR.createFromParcel(parcel);
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Widget widgetCreateFromParcel = parcel.readInt() == 0 ? null : Widget.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                bool = boolValueOf2;
                arrayList3 = null;
            } else {
                int i16 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i16);
                bool = boolValueOf2;
                int iL4 = 0;
                while (iL4 != i16) {
                    iL4 = a.l(ObjectsParameter.class, parcel, arrayList5, iL4, 1);
                    i16 = i16;
                }
                arrayList3 = arrayList5;
            }
            return new ObjectsParameter(string, string2, z12, z13, attributedText, restrictionsCreateFromParcel, summaryCreateFromParcel, arrayList, arrayList2, displayingOptionsCreateFromParcel, boolValueOf, bool, widgetCreateFromParcel, arrayList3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ObjectsParameter[] newArray(int i12) {
            return new ObjectsParameter[i12];
        }
    }

    /* compiled from: ObjectsParameter.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/ObjectsParameter$Widget;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/ObjectsParameter$Widget$Config;", Navigation.CONFIG, "<init>", "(Lcom/avito/android/remote/model/category_parameters/ObjectsParameter$Widget$Config;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/ObjectsParameter$Widget$Config;", "copy", "(Lcom/avito/android/remote/model/category_parameters/ObjectsParameter$Widget$Config;)Lcom/avito/android/remote/model/category_parameters/ObjectsParameter$Widget;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/ObjectsParameter$Widget$Config;", "getConfig", "Config", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Widget implements Parcelable {

        @k
        public static final Parcelable.Creator<Widget> CREATOR = new Creator();

        @c(Navigation.CONFIG)
        @l
        private final Config config;

        /* compiled from: ObjectsParameter.kt */
        @d
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000b¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/ObjectsParameter$Widget$Config;", "Landroid/os/Parcelable;", "", "errorText", "", "updatesForm", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/category_parameters/ObjectsParameter$Widget$Config;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getErrorText", "Ljava/lang/Boolean;", "getUpdatesForm", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Config implements Parcelable {

            @k
            public static final Parcelable.Creator<Config> CREATOR = new Creator();

            @c("errorText")
            @l
            private final String errorText;

            @c("updatesForm")
            @l
            private final Boolean updatesForm;

            /* compiled from: ObjectsParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Config> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Config createFromParcel(@k Parcel parcel) {
                    Boolean boolValueOf;
                    String string = parcel.readString();
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new Config(string, boolValueOf);
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
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Config copy$default(Config config, String str, Boolean bool, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = config.errorText;
                }
                if ((i12 & 2) != 0) {
                    bool = config.updatesForm;
                }
                return config.copy(str, bool);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final String getErrorText() {
                return this.errorText;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final Boolean getUpdatesForm() {
                return this.updatesForm;
            }

            @k
            public final Config copy(@l String errorText, @l Boolean updatesForm) {
                return new Config(errorText, updatesForm);
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
                return L.f(this.errorText, config.errorText) && L.f(this.updatesForm, config.updatesForm);
            }

            @l
            public final String getErrorText() {
                return this.errorText;
            }

            @l
            public final Boolean getUpdatesForm() {
                return this.updatesForm;
            }

            public int hashCode() {
                String str = this.errorText;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Boolean bool = this.updatesForm;
                return iHashCode + (bool != null ? bool.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Config(errorText=");
                sb2.append(this.errorText);
                sb2.append(", updatesForm=");
                return C0.g(sb2, this.updatesForm, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.errorText);
                Boolean bool = this.updatesForm;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool);
                }
            }

            public Config(@l String str, @l Boolean bool) {
                this.errorText = str;
                this.updatesForm = bool;
            }

            public /* synthetic */ Config(String str, Boolean bool, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : bool);
            }
        }

        /* compiled from: ObjectsParameter.kt */
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

    public /* synthetic */ ObjectsParameter(String str, String str2, boolean z12, boolean z13, AttributedText attributedText, Restrictions restrictions, Summary summary, List list, List list2, DisplayingOptions displayingOptions, Boolean bool, Boolean bool2, Widget widget, List list3, int i12, C42822w c42822w) {
        this(str, str2, z12, z13, attributedText, restrictions, summary, list, (i12 & 256) != 0 ? null : list2, (i12 & 512) != 0 ? null : displayingOptions, (i12 & 1024) != 0 ? Boolean.FALSE : bool, (i12 & 2048) != 0 ? Boolean.FALSE : bool2, (i12 & 4096) != 0 ? null : widget, (i12 & 8192) != 0 ? new ArrayList() : list3);
    }

    public final void applyChangedValue(@l List<? extends List<? extends ParameterSlot>> value) {
        if (L.f(getValue(), value)) {
            return;
        }
        setValue(value);
        List<? extends List<? extends ParameterSlot>> value2 = getValue();
        if (value2 != null) {
            List<? extends List<? extends ParameterSlot>> list = value2;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (ObjectsParameterKt.hasChildError((List) it.next())) {
                        return;
                    }
                }
            }
            setError(null);
        }
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final DisplayingOptions getDisplayingOptions() {
        return this.displayingOptions;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final Boolean getVisible() {
        return this.visible;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final Boolean getPhantom() {
        return this.phantom;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final Widget getWidget() {
        return this.widget;
    }

    @l
    public final List<Constraint> component14() {
        return this.constraints;
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
    public final Restrictions getRestrictions() {
        return this.restrictions;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Summary getSummary() {
        return this.summary;
    }

    @l
    public final List<ParameterSlot> component8() {
        return this.params;
    }

    @l
    public final List<List<ParameterSlot>> component9() {
        return this._value;
    }

    @k
    public final ObjectsParameter copy(@k String id2, @k String title, boolean required, boolean immutable, @l AttributedText motivation, @l Restrictions restrictions, @l Summary summary, @l List<? extends ParameterSlot> params, @l List<? extends List<? extends ParameterSlot>> _value, @l DisplayingOptions displayingOptions, @l Boolean visible, @l Boolean phantom, @l Widget widget, @l List<? extends Constraint> constraints) {
        return new ObjectsParameter(id2, title, required, immutable, motivation, restrictions, summary, params, _value, displayingOptions, visible, phantom, widget, constraints);
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
        if (!(other instanceof ObjectsParameter)) {
            return false;
        }
        ObjectsParameter objectsParameter = (ObjectsParameter) other;
        return L.f(this.id, objectsParameter.id) && L.f(this.title, objectsParameter.title) && this.required == objectsParameter.required && this.immutable == objectsParameter.immutable && L.f(this.motivation, objectsParameter.motivation) && L.f(this.restrictions, objectsParameter.restrictions) && L.f(this.summary, objectsParameter.summary) && L.f(this.params, objectsParameter.params) && L.f(this._value, objectsParameter._value) && L.f(this.displayingOptions, objectsParameter.displayingOptions) && L.f(this.visible, objectsParameter.visible) && L.f(this.phantom, objectsParameter.phantom) && L.f(this.widget, objectsParameter.widget) && L.f(this.constraints, objectsParameter.constraints);
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

    @l
    public final List<ParameterSlot> getParams() {
        return this.params;
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

    @l
    public final Restrictions getRestrictions() {
        return this.restrictions;
    }

    @l
    public final Summary getSummary() {
        return this.summary;
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
        Widget.Config config;
        Widget widget = this.widget;
        if (widget == null || (config = widget.getConfig()) == null) {
            return null;
        }
        return config.getUpdatesForm();
    }

    @Override // com.avito.android.remote.model.category_parameters.base.Visibility
    @l
    public Boolean getVisible() {
        return this.visible;
    }

    @l
    public final Widget getWidget() {
        return this.widget;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public boolean hasValue() {
        List<? extends List<? extends ParameterSlot>> value = getValue();
        return !(value == null || value.isEmpty());
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public int hashCode() {
        int i12 = r.i(r.i(H.d(this.id.hashCode() * 31, 31, this.title), 31, this.required), 31, this.immutable);
        AttributedText attributedText = this.motivation;
        int iHashCode = (i12 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Restrictions restrictions = this.restrictions;
        int iHashCode2 = (iHashCode + (restrictions == null ? 0 : restrictions.hashCode())) * 31;
        Summary summary = this.summary;
        int iHashCode3 = (iHashCode2 + (summary == null ? 0 : summary.hashCode())) * 31;
        List<ParameterSlot> list = this.params;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<? extends List<? extends ParameterSlot>> list2 = this._value;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        DisplayingOptions displayingOptions = this.displayingOptions;
        int iHashCode6 = (iHashCode5 + (displayingOptions == null ? 0 : displayingOptions.hashCode())) * 31;
        Boolean bool = this.visible;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.phantom;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Widget widget = this.widget;
        int iHashCode9 = (iHashCode8 + (widget == null ? 0 : widget.hashCode())) * 31;
        List<Constraint> list3 = this.constraints;
        return iHashCode9 + (list3 != null ? list3.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ObjectsParameter(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", required=");
        sb2.append(this.required);
        sb2.append(", immutable=");
        sb2.append(this.immutable);
        sb2.append(", motivation=");
        sb2.append(this.motivation);
        sb2.append(", restrictions=");
        sb2.append(this.restrictions);
        sb2.append(", summary=");
        sb2.append(this.summary);
        sb2.append(", params=");
        sb2.append(this.params);
        sb2.append(", _value=");
        sb2.append(this._value);
        sb2.append(", displayingOptions=");
        sb2.append(this.displayingOptions);
        sb2.append(", visible=");
        sb2.append(this.visible);
        sb2.append(", phantom=");
        sb2.append(this.phantom);
        sb2.append(", widget=");
        sb2.append(this.widget);
        sb2.append(", constraints=");
        return H.p(sb2, this.constraints, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeInt(this.required ? 1 : 0);
        parcel.writeInt(this.immutable ? 1 : 0);
        parcel.writeParcelable(this.motivation, flags);
        Restrictions restrictions = this.restrictions;
        if (restrictions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            restrictions.writeToParcel(parcel, flags);
        }
        Summary summary = this.summary;
        if (summary == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            summary.writeToParcel(parcel, flags);
        }
        List<ParameterSlot> list = this.params;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<? extends List<? extends ParameterSlot>> list2 = this._value;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                Iterator itJ = C0.j((List) itA2.next(), parcel);
                while (itJ.hasNext()) {
                    parcel.writeParcelable((Parcelable) itJ.next(), flags);
                }
            }
        }
        DisplayingOptions displayingOptions = this.displayingOptions;
        if (displayingOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            displayingOptions.writeToParcel(parcel, flags);
        }
        Boolean bool = this.visible;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.phantom;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        Widget widget = this.widget;
        if (widget == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            widget.writeToParcel(parcel, flags);
        }
        List<Constraint> list3 = this.constraints;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA3 = a.A(list3, parcel, 1);
        while (itA3.hasNext()) {
            parcel.writeParcelable((Parcelable) itA3.next(), flags);
        }
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    @l
    public List<? extends List<? extends ParameterSlot>> get_value() {
        return this._value;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public void set_value(@l List<? extends List<? extends ParameterSlot>> list) {
        this._value = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ObjectsParameter(@k String str, @k String str2, boolean z12, boolean z13, @l AttributedText attributedText, @l Restrictions restrictions, @l Summary summary, @l List<? extends ParameterSlot> list, @l List<? extends List<? extends ParameterSlot>> list2, @l DisplayingOptions displayingOptions, @l Boolean bool, @l Boolean bool2, @l Widget widget, @l List<? extends Constraint> list3) {
        this.id = str;
        this.title = str2;
        this.required = z12;
        this.immutable = z13;
        this.motivation = attributedText;
        this.restrictions = restrictions;
        this.summary = summary;
        this.params = list;
        this._value = list2;
        this.displayingOptions = displayingOptions;
        this.visible = bool;
        this.phantom = bool2;
        this.widget = widget;
        this.constraints = list3;
    }

    /* compiled from: ObjectsParameter.kt */
    @d
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ`\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\fR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b&\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b'\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b*\u0010\f¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/ObjectsParameter$Summary;", "Landroid/os/Parcelable;", "", "", "titles", "subtitles", "secondTitles", "emptyValueSummary", "skipValueIds", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "()Ljava/lang/String;", "component5", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/category_parameters/ObjectsParameter$Summary;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getTitles", "getSubtitles", "getSecondTitles", "Ljava/lang/String;", "getEmptyValueSummary", "getSkipValueIds", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Summary implements Parcelable {

        @k
        public static final Parcelable.Creator<Summary> CREATOR = new Creator();

        @c("emptyValueSummary")
        @l
        private final String emptyValueSummary;

        @c("secondTitles")
        @l
        private final List<String> secondTitles;

        @c("skipValueIds")
        @l
        private final List<String> skipValueIds;

        @c("subtitles")
        @k
        private final List<String> subtitles;

        @c("titles")
        @k
        private final List<String> titles;

        /* compiled from: ObjectsParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Summary> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Summary createFromParcel(@k Parcel parcel) {
                return new Summary(parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString(), parcel.createStringArrayList());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Summary[] newArray(int i12) {
                return new Summary[i12];
            }
        }

        public Summary(@k List<String> list, @k List<String> list2, @l List<String> list3, @l String str, @l List<String> list4) {
            this.titles = list;
            this.subtitles = list2;
            this.secondTitles = list3;
            this.emptyValueSummary = str;
            this.skipValueIds = list4;
        }

        public static /* synthetic */ Summary copy$default(Summary summary, List list, List list2, List list3, String str, List list4, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                list = summary.titles;
            }
            if ((i12 & 2) != 0) {
                list2 = summary.subtitles;
            }
            List list5 = list2;
            if ((i12 & 4) != 0) {
                list3 = summary.secondTitles;
            }
            List list6 = list3;
            if ((i12 & 8) != 0) {
                str = summary.emptyValueSummary;
            }
            String str2 = str;
            if ((i12 & 16) != 0) {
                list4 = summary.skipValueIds;
            }
            return summary.copy(list, list5, list6, str2, list4);
        }

        @k
        public final List<String> component1() {
            return this.titles;
        }

        @k
        public final List<String> component2() {
            return this.subtitles;
        }

        @l
        public final List<String> component3() {
            return this.secondTitles;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getEmptyValueSummary() {
            return this.emptyValueSummary;
        }

        @l
        public final List<String> component5() {
            return this.skipValueIds;
        }

        @k
        public final Summary copy(@k List<String> titles, @k List<String> subtitles, @l List<String> secondTitles, @l String emptyValueSummary, @l List<String> skipValueIds) {
            return new Summary(titles, subtitles, secondTitles, emptyValueSummary, skipValueIds);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Summary)) {
                return false;
            }
            Summary summary = (Summary) other;
            return L.f(this.titles, summary.titles) && L.f(this.subtitles, summary.subtitles) && L.f(this.secondTitles, summary.secondTitles) && L.f(this.emptyValueSummary, summary.emptyValueSummary) && L.f(this.skipValueIds, summary.skipValueIds);
        }

        @l
        public final String getEmptyValueSummary() {
            return this.emptyValueSummary;
        }

        @l
        public final List<String> getSecondTitles() {
            return this.secondTitles;
        }

        @l
        public final List<String> getSkipValueIds() {
            return this.skipValueIds;
        }

        @k
        public final List<String> getSubtitles() {
            return this.subtitles;
        }

        @k
        public final List<String> getTitles() {
            return this.titles;
        }

        public int hashCode() {
            int iE2 = H.e(this.titles.hashCode() * 31, 31, this.subtitles);
            List<String> list = this.secondTitles;
            int iHashCode = (iE2 + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.emptyValueSummary;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<String> list2 = this.skipValueIds;
            return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Summary(titles=");
            sb2.append(this.titles);
            sb2.append(", subtitles=");
            sb2.append(this.subtitles);
            sb2.append(", secondTitles=");
            sb2.append(this.secondTitles);
            sb2.append(", emptyValueSummary=");
            sb2.append(this.emptyValueSummary);
            sb2.append(", skipValueIds=");
            return H.p(sb2, this.skipValueIds, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeStringList(this.titles);
            parcel.writeStringList(this.subtitles);
            parcel.writeStringList(this.secondTitles);
            parcel.writeString(this.emptyValueSummary);
            parcel.writeStringList(this.skipValueIds);
        }

        public /* synthetic */ Summary(List list, List list2, List list3, String str, List list4, int i12, C42822w c42822w) {
            this(list, list2, (i12 & 4) != 0 ? null : list3, (i12 & 8) != 0 ? null : str, (i12 & 16) != 0 ? null : list4);
        }
    }
}

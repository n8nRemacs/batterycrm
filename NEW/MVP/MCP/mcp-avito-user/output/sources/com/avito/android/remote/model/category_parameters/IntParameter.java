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
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.HasAdditionalAction;
import com.avito.android.remote.model.category_parameters.base.Phantom;
import com.avito.android.remote.model.category_parameters.base.TextParameter;
import com.avito.android.remote.model.category_parameters.base.Visibility;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.parse.adapter.EmptyStringOnLongAdapter;
import com.google.gson.annotations.b;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: IntParameter.kt */
@d
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 k2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0003klmB±\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b*\u0010!J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b1\u0010!J\u0012\u00102\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b4\u0010)J\u0012\u00105\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b5\u0010)J\u0012\u00106\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b6\u00107JÂ\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÆ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b:\u0010!J\u0010\u0010<\u001a\u00020;HÖ\u0001¢\u0006\u0004\b<\u0010=J\u001a\u0010@\u001a\u00020\n2\b\u0010?\u001a\u0004\u0018\u00010>HÖ\u0003¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020;HÖ\u0001¢\u0006\u0004\bB\u0010=J \u0010G\u001a\u00020F2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020;HÖ\u0001¢\u0006\u0004\bG\u0010HR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010I\u001a\u0004\bJ\u0010!R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010I\u001a\u0004\bK\u0010!R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010L\u001a\u0004\bM\u0010$R\u001a\u0010\f\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010L\u001a\u0004\bN\u0010$R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010O\u001a\u0004\bP\u0010'R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010Q\u001a\u0004\bR\u0010)R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010I\u0012\u0004\bT\u0010U\u001a\u0004\bS\u0010!R$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010V\u001a\u0004\bW\u0010,\"\u0004\bX\u0010YR\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010Z\u001a\u0004\b[\u0010.R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\\\u001a\u0004\b]\u00100R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010I\u001a\u0004\b^\u0010!R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010_\u001a\u0004\b`\u00103R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010Q\u001a\u0004\ba\u0010)R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010Q\u001a\u0004\bb\u0010)R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010c\u001a\u0004\bd\u00107R\u0014\u0010f\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010!R\u0011\u0010j\u001a\u00020g8F¢\u0006\u0006\u001a\u0004\bh\u0010i¨\u0006n"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/IntParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "", "Lcom/avito/android/remote/model/category_parameters/base/TextParameter;", "Lcom/avito/android/remote/model/category_parameters/base/HasAdditionalAction;", "Lcom/avito/android/remote/model/category_parameters/base/Visibility;", "Lcom/avito/android/remote/model/category_parameters/base/Phantom;", "", "id", "title", "", "required", "immutable", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "updatesForm", "hint", "_value", "", "Lcom/avito/android/remote/model/category_parameters/Constraint;", "constraints", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "displayingOptions", ChannelContext.Item.PLACEHOLDER, "Lcom/avito/android/remote/model/category_parameters/ParamButton;", "button", "visible", "phantom", "Lcom/avito/android/remote/model/category_parameters/IntParameter$Widget;", "widget", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/ParamButton;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/IntParameter$Widget;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "()Lcom/avito/android/remote/model/text/AttributedText;", "component6", "()Ljava/lang/Boolean;", "component7", "component8", "()Ljava/lang/Long;", "component9", "()Ljava/util/List;", "component10", "()Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "component11", "component12", "()Lcom/avito/android/remote/model/category_parameters/ParamButton;", "component13", "component14", "component15", "()Lcom/avito/android/remote/model/category_parameters/IntParameter$Widget;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/ParamButton;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/IntParameter$Widget;)Lcom/avito/android/remote/model/category_parameters/IntParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Z", "getRequired", "getImmutable", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "Ljava/lang/Boolean;", "getUpdatesForm", "getHint", "getHint$annotations", "()V", "Ljava/lang/Long;", "get_value", "set_value", "(Ljava/lang/Long;)V", "Ljava/util/List;", "getConstraints", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "getDisplayingOptions", "getPlaceholder", "Lcom/avito/android/remote/model/category_parameters/ParamButton;", "getButton", "getVisible", "getPhantom", "Lcom/avito/android/remote/model/category_parameters/IntParameter$Widget;", "getWidget", "getType", "type", "Lcom/avito/android/remote/model/category_parameters/IntParameter$InputType;", "getInputType", "()Lcom/avito/android/remote/model/category_parameters/IntParameter$InputType;", "inputType", "Companion", "InputType", "Widget", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class IntParameter extends EditableParameter<Long> implements TextParameter, HasAdditionalAction, Visibility, Phantom {

    @k
    public static final String TYPE = "int";

    @c("value")
    @l
    @b(EmptyStringOnLongAdapter.class)
    private Long _value;

    @c("button")
    @l
    private final ParamButton button;

    @c("constraints")
    @l
    private final List<Constraint> constraints;

    @c(Navigation.DISPLAYING)
    @l
    private final DisplayingOptions displayingOptions;

    @c("hint")
    @l
    private final String hint;

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
    public static final Parcelable.Creator<IntParameter> CREATOR = new Creator();

    /* compiled from: IntParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IntParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final IntParameter createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(IntParameter.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string3 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(IntParameter.class, parcel, arrayList, iL2, 1);
                }
            }
            DisplayingOptions displayingOptionsCreateFromParcel = parcel.readInt() == 0 ? null : DisplayingOptions.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            ParamButton paramButtonCreateFromParcel = parcel.readInt() == 0 ? null : ParamButton.CREATOR.createFromParcel(parcel);
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
            return new IntParameter(string, string2, z12, z13, attributedText, boolValueOf, string3, lValueOf, arrayList, displayingOptionsCreateFromParcel, string4, paramButtonCreateFromParcel, boolValueOf2, boolValueOf3, parcel.readInt() != 0 ? Widget.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final IntParameter[] newArray(int i12) {
            return new IntParameter[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IntParameter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/IntParameter$InputType;", "", "(Ljava/lang/String;I)V", "NUMBER", "YEAR", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InputType {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ InputType[] $VALUES;

        @c("number")
        public static final InputType NUMBER = new InputType("NUMBER", 0);

        @c(SelectionType.TYPE_YEAR)
        public static final InputType YEAR = new InputType("YEAR", 1);

        private static final /* synthetic */ InputType[] $values() {
            return new InputType[]{NUMBER, YEAR};
        }

        static {
            InputType[] inputTypeArr$values = $values();
            $VALUES = inputTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(inputTypeArr$values);
        }

        private InputType(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<InputType> getEntries() {
            return $ENTRIES;
        }

        public static InputType valueOf(String str) {
            return (InputType) Enum.valueOf(InputType.class, str);
        }

        public static InputType[] values() {
            return (InputType[]) $VALUES.clone();
        }
    }

    /* compiled from: IntParameter.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/IntParameter$Widget;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/IntParameter$Widget$Config;", Navigation.CONFIG, "", "type", "<init>", "(Lcom/avito/android/remote/model/category_parameters/IntParameter$Widget$Config;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/IntParameter$Widget$Config;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/avito/android/remote/model/category_parameters/IntParameter$Widget$Config;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/IntParameter$Widget;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/IntParameter$Widget$Config;", "getConfig", "Ljava/lang/String;", "getType", "Config", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Widget implements Parcelable {

        @k
        public static final Parcelable.Creator<Widget> CREATOR = new Creator();

        @c(Navigation.CONFIG)
        @l
        private final Config config;

        @c("type")
        @l
        private final String type;

        /* compiled from: IntParameter.kt */
        @d
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/IntParameter$Widget$Config;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/IntParameter$InputType;", "inputType", "<init>", "(Lcom/avito/android/remote/model/category_parameters/IntParameter$InputType;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/IntParameter$InputType;", "copy", "(Lcom/avito/android/remote/model/category_parameters/IntParameter$InputType;)Lcom/avito/android/remote/model/category_parameters/IntParameter$Widget$Config;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/IntParameter$InputType;", "getInputType", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Config implements Parcelable {

            @k
            public static final Parcelable.Creator<Config> CREATOR = new Creator();

            @c("inputType")
            @l
            private final InputType inputType;

            /* compiled from: IntParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Config> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Config createFromParcel(@k Parcel parcel) {
                    return new Config(parcel.readInt() == 0 ? null : InputType.valueOf(parcel.readString()));
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

            public static /* synthetic */ Config copy$default(Config config, InputType inputType, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    inputType = config.inputType;
                }
                return config.copy(inputType);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final InputType getInputType() {
                return this.inputType;
            }

            @k
            public final Config copy(@l InputType inputType) {
                return new Config(inputType);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Config) && this.inputType == ((Config) other).inputType;
            }

            @l
            public final InputType getInputType() {
                return this.inputType;
            }

            public int hashCode() {
                InputType inputType = this.inputType;
                if (inputType == null) {
                    return 0;
                }
                return inputType.hashCode();
            }

            @k
            public String toString() {
                return "Config(inputType=" + this.inputType + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                InputType inputType = this.inputType;
                if (inputType == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(inputType.name());
                }
            }

            public Config(@l InputType inputType) {
                this.inputType = inputType;
            }

            public /* synthetic */ Config(InputType inputType, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : inputType);
            }
        }

        /* compiled from: IntParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Widget> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Widget createFromParcel(@k Parcel parcel) {
                return new Widget(parcel.readInt() == 0 ? null : Config.CREATOR.createFromParcel(parcel), parcel.readString());
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
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Widget copy$default(Widget widget, Config config, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                config = widget.config;
            }
            if ((i12 & 2) != 0) {
                str = widget.type;
            }
            return widget.copy(config, str);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Config getConfig() {
            return this.config;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @k
        public final Widget copy(@l Config config, @l String type) {
            return new Widget(config, type);
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
            return L.f(this.config, widget.config) && L.f(this.type, widget.type);
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
            Config config = this.config;
            int iHashCode = (config == null ? 0 : config.hashCode()) * 31;
            String str = this.type;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Widget(config=");
            sb2.append(this.config);
            sb2.append(", type=");
            return C22026a.c(sb2, this.type, ')');
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
            parcel.writeString(this.type);
        }

        public Widget(@l Config config, @l String str) {
            this.config = config;
            this.type = str;
        }

        public /* synthetic */ Widget(Config config, String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : config, (i12 & 2) != 0 ? null : str);
        }
    }

    public /* synthetic */ IntParameter(String str, String str2, boolean z12, boolean z13, AttributedText attributedText, Boolean bool, String str3, Long l12, List list, DisplayingOptions displayingOptions, String str4, ParamButton paramButton, Boolean bool2, Boolean bool3, Widget widget, int i12, C42822w c42822w) {
        this(str, str2, z12, z13, (i12 & 16) != 0 ? null : attributedText, (i12 & 32) != 0 ? null : bool, (i12 & 64) != 0 ? null : str3, (i12 & 128) != 0 ? null : l12, (i12 & 256) != 0 ? null : list, (i12 & 512) != 0 ? null : displayingOptions, (i12 & 1024) != 0 ? null : str4, (i12 & 2048) != 0 ? null : paramButton, (i12 & 4096) != 0 ? Boolean.FALSE : bool2, (i12 & 8192) != 0 ? Boolean.FALSE : bool3, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : widget);
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
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final ParamButton getButton() {
        return this.button;
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
    public final Widget getWidget() {
        return this.widget;
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
    public final String getHint() {
        return this.hint;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Long get_value() {
        return this._value;
    }

    @l
    public final List<Constraint> component9() {
        return this.constraints;
    }

    @k
    public final IntParameter copy(@k String id2, @k String title, boolean required, boolean immutable, @l AttributedText motivation, @l Boolean updatesForm, @l String hint, @l Long _value, @l List<? extends Constraint> constraints, @l DisplayingOptions displayingOptions, @l String placeholder, @l ParamButton button, @l Boolean visible, @l Boolean phantom, @l Widget widget) {
        return new IntParameter(id2, title, required, immutable, motivation, updatesForm, hint, _value, constraints, displayingOptions, placeholder, button, visible, phantom, widget);
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
        if (!(other instanceof IntParameter)) {
            return false;
        }
        IntParameter intParameter = (IntParameter) other;
        return L.f(this.id, intParameter.id) && L.f(this.title, intParameter.title) && this.required == intParameter.required && this.immutable == intParameter.immutable && L.f(this.motivation, intParameter.motivation) && L.f(this.updatesForm, intParameter.updatesForm) && L.f(this.hint, intParameter.hint) && L.f(this._value, intParameter._value) && L.f(this.constraints, intParameter.constraints) && L.f(this.displayingOptions, intParameter.displayingOptions) && L.f(this.placeholder, intParameter.placeholder) && L.f(this.button, intParameter.button) && L.f(this.visible, intParameter.visible) && L.f(this.phantom, intParameter.phantom) && L.f(this.widget, intParameter.widget);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasAdditionalAction
    @l
    public ParamButton getButton() {
        return this.button;
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

    @k
    public final InputType getInputType() {
        Widget.Config config;
        InputType inputType;
        Widget widget = this.widget;
        return (widget == null || (config = widget.getConfig()) == null || (inputType = config.getInputType()) == null) ? InputType.NUMBER : inputType;
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

    @Override // com.avito.android.remote.model.category_parameters.base.Visibility
    @l
    public Boolean getVisible() {
        return this.visible;
    }

    @l
    public final Widget getWidget() {
        return this.widget;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public int hashCode() {
        int i12 = r.i(r.i(H.d(this.id.hashCode() * 31, 31, this.title), 31, this.required), 31, this.immutable);
        AttributedText attributedText = this.motivation;
        int iHashCode = (i12 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Boolean bool = this.updatesForm;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.hint;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l12 = this._value;
        int iHashCode4 = (iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        List<Constraint> list = this.constraints;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        DisplayingOptions displayingOptions = this.displayingOptions;
        int iHashCode6 = (iHashCode5 + (displayingOptions == null ? 0 : displayingOptions.hashCode())) * 31;
        String str2 = this.placeholder;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ParamButton paramButton = this.button;
        int iHashCode8 = (iHashCode7 + (paramButton == null ? 0 : paramButton.hashCode())) * 31;
        Boolean bool2 = this.visible;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.phantom;
        int iHashCode10 = (iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Widget widget = this.widget;
        return iHashCode10 + (widget != null ? widget.hashCode() : 0);
    }

    @k
    public String toString() {
        return "IntParameter(id=" + this.id + ", title=" + this.title + ", required=" + this.required + ", immutable=" + this.immutable + ", motivation=" + this.motivation + ", updatesForm=" + this.updatesForm + ", hint=" + this.hint + ", _value=" + this._value + ", constraints=" + this.constraints + ", displayingOptions=" + this.displayingOptions + ", placeholder=" + this.placeholder + ", button=" + this.button + ", visible=" + this.visible + ", phantom=" + this.phantom + ", widget=" + this.widget + ')';
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
        parcel.writeString(this.hint);
        Long l12 = this._value;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
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
        DisplayingOptions displayingOptions = this.displayingOptions;
        if (displayingOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            displayingOptions.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.placeholder);
        ParamButton paramButton = this.button;
        if (paramButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paramButton.writeToParcel(parcel, flags);
        }
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
        Widget widget = this.widget;
        if (widget == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            widget.writeToParcel(parcel, flags);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    @l
    public Long get_value() {
        return this._value;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public void set_value(@l Long l12) {
        this._value = l12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IntParameter(@k String str, @k String str2, boolean z12, boolean z13, @l AttributedText attributedText, @l Boolean bool, @l String str3, @l Long l12, @l List<? extends Constraint> list, @l DisplayingOptions displayingOptions, @l String str4, @l ParamButton paramButton, @l Boolean bool2, @l Boolean bool3, @l Widget widget) {
        this.id = str;
        this.title = str2;
        this.required = z12;
        this.immutable = z13;
        this.motivation = attributedText;
        this.updatesForm = bool;
        this.hint = str3;
        this._value = l12;
        this.constraints = list;
        this.displayingOptions = displayingOptions;
        this.placeholder = str4;
        this.button = paramButton;
        this.visible = bool2;
        this.phantom = bool3;
        this.widget = widget;
    }

    @InterfaceC42830m
    public static /* synthetic */ void getHint$annotations() {
    }
}

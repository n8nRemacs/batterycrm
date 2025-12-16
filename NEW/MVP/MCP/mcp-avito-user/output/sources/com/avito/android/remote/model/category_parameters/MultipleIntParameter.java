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
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.HasAdditionalAction;
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
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: IntParameter.kt */
@d
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B·\u0001\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b*\u0010!J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010,J\u0012\u0010.\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b0\u0010!J\u0012\u00101\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b3\u0010)J\u0012\u00104\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b4\u0010)J\u0012\u00105\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b5\u00106JÈ\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b9\u0010!J\u0010\u0010;\u001a\u00020:HÖ\u0001¢\u0006\u0004\b;\u0010<J\u001a\u0010?\u001a\u00020\u000b2\b\u0010>\u001a\u0004\u0018\u00010=HÖ\u0003¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020:HÖ\u0001¢\u0006\u0004\bA\u0010<J \u0010F\u001a\u00020E2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020:HÖ\u0001¢\u0006\u0004\bF\u0010GR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010H\u001a\u0004\bI\u0010!R\u001a\u0010\n\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010H\u001a\u0004\bJ\u0010!R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010K\u001a\u0004\bL\u0010$R\u001a\u0010\r\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010K\u001a\u0004\bM\u0010$R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010N\u001a\u0004\bO\u0010'R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010P\u001a\u0004\bQ\u0010)R\"\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010H\u0012\u0004\bS\u0010T\u001a\u0004\bR\u0010!R*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010U\u001a\u0004\bV\u0010,\"\u0004\bW\u0010XR\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010U\u001a\u0004\bY\u0010,R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010Z\u001a\u0004\b[\u0010/R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010H\u001a\u0004\b\\\u0010!R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010]\u001a\u0004\b^\u00102R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010P\u001a\u0004\b_\u0010)R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010P\u001a\u0004\b`\u0010)R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010a\u001a\u0004\bb\u00106R\u0014\u0010d\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010!¨\u0006e"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/MultipleIntParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "", "", "Lcom/avito/android/remote/model/category_parameters/base/TextParameter;", "Lcom/avito/android/remote/model/category_parameters/base/HasAdditionalAction;", "Lcom/avito/android/remote/model/category_parameters/base/Visibility;", "Lcom/avito/android/remote/model/category_parameters/base/Phantom;", "", "id", "title", "", "required", "immutable", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "updatesForm", "hint", "_value", "Lcom/avito/android/remote/model/category_parameters/Constraint;", "constraints", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "displayingOptions", ChannelContext.Item.PLACEHOLDER, "Lcom/avito/android/remote/model/category_parameters/ParamButton;", "button", "visible", "phantom", "Lcom/avito/android/remote/model/category_parameters/IntParameter$Widget;", "widget", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/ParamButton;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/IntParameter$Widget;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "()Lcom/avito/android/remote/model/text/AttributedText;", "component6", "()Ljava/lang/Boolean;", "component7", "component8", "()Ljava/util/List;", "component9", "component10", "()Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "component11", "component12", "()Lcom/avito/android/remote/model/category_parameters/ParamButton;", "component13", "component14", "component15", "()Lcom/avito/android/remote/model/category_parameters/IntParameter$Widget;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/ParamButton;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/IntParameter$Widget;)Lcom/avito/android/remote/model/category_parameters/MultipleIntParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Z", "getRequired", "getImmutable", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "Ljava/lang/Boolean;", "getUpdatesForm", "getHint", "getHint$annotations", "()V", "Ljava/util/List;", "get_value", "set_value", "(Ljava/util/List;)V", "getConstraints", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "getDisplayingOptions", "getPlaceholder", "Lcom/avito/android/remote/model/category_parameters/ParamButton;", "getButton", "getVisible", "getPhantom", "Lcom/avito/android/remote/model/category_parameters/IntParameter$Widget;", "getWidget", "getType", "type", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class MultipleIntParameter extends EditableParameter<List<? extends Long>> implements TextParameter, HasAdditionalAction, Visibility, Phantom {

    @k
    public static final Parcelable.Creator<MultipleIntParameter> CREATOR = new Creator();

    @c("value")
    @l
    private List<Long> _value;

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
    private final IntParameter.Widget widget;

    /* compiled from: IntParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MultipleIntParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MultipleIntParameter createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(MultipleIntParameter.class.getClassLoader());
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i14 = parcel.readInt();
                arrayList2 = new ArrayList(i14);
                int iL2 = 0;
                while (iL2 != i14) {
                    iL2 = a.l(MultipleIntParameter.class, parcel, arrayList2, iL2, 1);
                }
            }
            return new MultipleIntParameter(string, string2, z12, z13, attributedText, boolValueOf, string3, arrayList, arrayList2, parcel.readInt() == 0 ? null : DisplayingOptions.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : ParamButton.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() != 0 ? IntParameter.Widget.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MultipleIntParameter[] newArray(int i12) {
            return new MultipleIntParameter[i12];
        }
    }

    public /* synthetic */ MultipleIntParameter(String str, String str2, boolean z12, boolean z13, AttributedText attributedText, Boolean bool, String str3, List list, List list2, DisplayingOptions displayingOptions, String str4, ParamButton paramButton, Boolean bool2, Boolean bool3, IntParameter.Widget widget, int i12, C42822w c42822w) {
        this(str, str2, z12, z13, (i12 & 16) != 0 ? null : attributedText, (i12 & 32) != 0 ? null : bool, (i12 & 64) != 0 ? null : str3, (i12 & 128) != 0 ? null : list, (i12 & 256) != 0 ? null : list2, (i12 & 512) != 0 ? null : displayingOptions, (i12 & 1024) != 0 ? null : str4, (i12 & 2048) != 0 ? null : paramButton, (i12 & 4096) != 0 ? Boolean.FALSE : bool2, (i12 & 8192) != 0 ? Boolean.FALSE : bool3, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : widget);
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
    public final IntParameter.Widget getWidget() {
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
    public final List<Long> component8() {
        return this._value;
    }

    @l
    public final List<Constraint> component9() {
        return this.constraints;
    }

    @k
    public final MultipleIntParameter copy(@k String id2, @k String title, boolean required, boolean immutable, @l AttributedText motivation, @l Boolean updatesForm, @l String hint, @l List<Long> _value, @l List<? extends Constraint> constraints, @l DisplayingOptions displayingOptions, @l String placeholder, @l ParamButton button, @l Boolean visible, @l Boolean phantom, @l IntParameter.Widget widget) {
        return new MultipleIntParameter(id2, title, required, immutable, motivation, updatesForm, hint, _value, constraints, displayingOptions, placeholder, button, visible, phantom, widget);
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
        if (!(other instanceof MultipleIntParameter)) {
            return false;
        }
        MultipleIntParameter multipleIntParameter = (MultipleIntParameter) other;
        return L.f(this.id, multipleIntParameter.id) && L.f(this.title, multipleIntParameter.title) && this.required == multipleIntParameter.required && this.immutable == multipleIntParameter.immutable && L.f(this.motivation, multipleIntParameter.motivation) && L.f(this.updatesForm, multipleIntParameter.updatesForm) && L.f(this.hint, multipleIntParameter.hint) && L.f(this._value, multipleIntParameter._value) && L.f(this.constraints, multipleIntParameter.constraints) && L.f(this.displayingOptions, multipleIntParameter.displayingOptions) && L.f(this.placeholder, multipleIntParameter.placeholder) && L.f(this.button, multipleIntParameter.button) && L.f(this.visible, multipleIntParameter.visible) && L.f(this.phantom, multipleIntParameter.phantom) && L.f(this.widget, multipleIntParameter.widget);
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
        return IntParameter.TYPE;
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
    public final IntParameter.Widget getWidget() {
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
        List<Long> list = this._value;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<Constraint> list2 = this.constraints;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
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
        IntParameter.Widget widget = this.widget;
        return iHashCode10 + (widget != null ? widget.hashCode() : 0);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public /* bridge */ /* synthetic */ void set_value(List<? extends Long> list) {
        set_value2((List<Long>) list);
    }

    @k
    public String toString() {
        return "MultipleIntParameter(id=" + this.id + ", title=" + this.title + ", required=" + this.required + ", immutable=" + this.immutable + ", motivation=" + this.motivation + ", updatesForm=" + this.updatesForm + ", hint=" + this.hint + ", _value=" + this._value + ", constraints=" + this.constraints + ", displayingOptions=" + this.displayingOptions + ", placeholder=" + this.placeholder + ", button=" + this.button + ", visible=" + this.visible + ", phantom=" + this.phantom + ", widget=" + this.widget + ')';
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
        List<Long> list = this._value;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeLong(((Number) itA.next()).longValue());
            }
        }
        List<Constraint> list2 = this.constraints;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
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
        IntParameter.Widget widget = this.widget;
        if (widget == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            widget.writeToParcel(parcel, flags);
        }
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    @l
    public List<? extends Long> get_value() {
        return this._value;
    }

    /* renamed from: set_value, reason: avoid collision after fix types in other method */
    public void set_value2(@l List<Long> list) {
        this._value = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MultipleIntParameter(@k String str, @k String str2, boolean z12, boolean z13, @l AttributedText attributedText, @l Boolean bool, @l String str3, @l List<Long> list, @l List<? extends Constraint> list2, @l DisplayingOptions displayingOptions, @l String str4, @l ParamButton paramButton, @l Boolean bool2, @l Boolean bool3, @l IntParameter.Widget widget) {
        this.id = str;
        this.title = str2;
        this.required = z12;
        this.immutable = z13;
        this.motivation = attributedText;
        this.updatesForm = bool;
        this.hint = str3;
        this._value = list;
        this.constraints = list2;
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

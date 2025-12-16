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

/* compiled from: VideoParameter.kt */
@d
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 _2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001_B\u0095\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0012\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010 J\u0012\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010 J\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010 J\u0012\u0010/\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b1\u0010*J\u0012\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b2\u0010*J¶\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u0010 J\u0010\u00107\u001a\u000206HÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010;\u001a\u00020\t2\b\u0010:\u001a\u0004\u0018\u000109HÖ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u000206HÖ\u0001¢\u0006\u0004\b=\u00108J \u0010B\u001a\u00020A2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u000206HÖ\u0001¢\u0006\u0004\bB\u0010CR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010D\u001a\u0004\bE\u0010 R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010D\u001a\u0004\bF\u0010 R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010G\u001a\u0004\bH\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010G\u001a\u0004\bI\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010J\u001a\u0004\bK\u0010%R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010D\u0012\u0004\bM\u0010N\u001a\u0004\bL\u0010 R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010O\u001a\u0004\bP\u0010(R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010Q\u001a\u0004\bR\u0010*R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010D\u001a\u0004\bS\u0010 R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010T\u001a\u0004\bU\u0010-R$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010D\u001a\u0004\bV\u0010 \"\u0004\bW\u0010XR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010Y\u001a\u0004\bZ\u00100R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010Q\u001a\u0004\b[\u0010*R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010Q\u001a\u0004\b\\\u0010*R\u0014\u0010^\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010 ¨\u0006`"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/VideoParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "", "Lcom/avito/android/remote/model/category_parameters/base/HasAdditionalAction;", "Lcom/avito/android/remote/model/category_parameters/base/TextParameter;", "Lcom/avito/android/remote/model/category_parameters/base/Visibility;", "Lcom/avito/android/remote/model/category_parameters/base/Phantom;", "id", "title", "", "required", "immutable", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "hint", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "displayingOptions", "updatesForm", ChannelContext.Item.PLACEHOLDER, "", "Lcom/avito/android/remote/model/category_parameters/Constraint;", "constraints", "_value", "Lcom/avito/android/remote/model/category_parameters/ParamButton;", "button", "visible", "phantom", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/ParamButton;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "hasValue", "()Z", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/avito/android/remote/model/text/AttributedText;", "component6", "component7", "()Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "component8", "()Ljava/lang/Boolean;", "component9", "component10", "()Ljava/util/List;", "component11", "component12", "()Lcom/avito/android/remote/model/category_parameters/ParamButton;", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/ParamButton;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/category_parameters/VideoParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Z", "getRequired", "getImmutable", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "getHint", "getHint$annotations", "()V", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "getDisplayingOptions", "Ljava/lang/Boolean;", "getUpdatesForm", "getPlaceholder", "Ljava/util/List;", "getConstraints", "get_value", "set_value", "(Ljava/lang/String;)V", "Lcom/avito/android/remote/model/category_parameters/ParamButton;", "getButton", "getVisible", "getPhantom", "getType", "type", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VideoParameter extends EditableParameter<String> implements HasAdditionalAction, TextParameter, Visibility, Phantom {

    @k
    public static final String TYPE = "video";

    @c("value")
    @l
    private String _value;

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

    @k
    public static final Parcelable.Creator<VideoParameter> CREATOR = new Creator();

    /* compiled from: VideoParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VideoParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VideoParameter createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(VideoParameter.class.getClassLoader());
            String string3 = parcel.readString();
            DisplayingOptions displayingOptionsCreateFromParcel = parcel.readInt() == 0 ? null : DisplayingOptions.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(VideoParameter.class, parcel, arrayList, iL2, 1);
                }
            }
            String string5 = parcel.readString();
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
            return new VideoParameter(string, string2, z12, z13, attributedText, string3, displayingOptionsCreateFromParcel, boolValueOf, string4, arrayList, string5, paramButtonCreateFromParcel, boolValueOf2, boolValueOf3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VideoParameter[] newArray(int i12) {
            return new VideoParameter[i12];
        }
    }

    public /* synthetic */ VideoParameter(String str, String str2, boolean z12, boolean z13, AttributedText attributedText, String str3, DisplayingOptions displayingOptions, Boolean bool, String str4, List list, String str5, ParamButton paramButton, Boolean bool2, Boolean bool3, int i12, C42822w c42822w) {
        this(str, str2, z12, z13, attributedText, str3, displayingOptions, bool, str4, list, str5, paramButton, (i12 & 4096) != 0 ? Boolean.FALSE : bool2, (i12 & 8192) != 0 ? Boolean.FALSE : bool3);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    public final List<Constraint> component10() {
        return this.constraints;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final String get_value() {
        return this._value;
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
    public final String getHint() {
        return this.hint;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final DisplayingOptions getDisplayingOptions() {
        return this.displayingOptions;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @k
    public final VideoParameter copy(@k String id2, @k String title, boolean required, boolean immutable, @l AttributedText motivation, @l String hint, @l DisplayingOptions displayingOptions, @l Boolean updatesForm, @l String placeholder, @l List<? extends Constraint> constraints, @l String _value, @l ParamButton button, @l Boolean visible, @l Boolean phantom) {
        return new VideoParameter(id2, title, required, immutable, motivation, hint, displayingOptions, updatesForm, placeholder, constraints, _value, button, visible, phantom);
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
        if (!(other instanceof VideoParameter)) {
            return false;
        }
        VideoParameter videoParameter = (VideoParameter) other;
        return L.f(this.id, videoParameter.id) && L.f(this.title, videoParameter.title) && this.required == videoParameter.required && this.immutable == videoParameter.immutable && L.f(this.motivation, videoParameter.motivation) && L.f(this.hint, videoParameter.hint) && L.f(this.displayingOptions, videoParameter.displayingOptions) && L.f(this.updatesForm, videoParameter.updatesForm) && L.f(this.placeholder, videoParameter.placeholder) && L.f(this.constraints, videoParameter.constraints) && L.f(this._value, videoParameter._value) && L.f(this.button, videoParameter.button) && L.f(this.visible, videoParameter.visible) && L.f(this.phantom, videoParameter.phantom);
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
        return "video";
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

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public boolean hasValue() {
        String value = getValue();
        return !(value == null || value.length() == 0);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public int hashCode() {
        int i12 = r.i(r.i(H.d(this.id.hashCode() * 31, 31, this.title), 31, this.required), 31, this.immutable);
        AttributedText attributedText = this.motivation;
        int iHashCode = (i12 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str = this.hint;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DisplayingOptions displayingOptions = this.displayingOptions;
        int iHashCode3 = (iHashCode2 + (displayingOptions == null ? 0 : displayingOptions.hashCode())) * 31;
        Boolean bool = this.updatesForm;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.placeholder;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Constraint> list = this.constraints;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this._value;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ParamButton paramButton = this.button;
        int iHashCode8 = (iHashCode7 + (paramButton == null ? 0 : paramButton.hashCode())) * 31;
        Boolean bool2 = this.visible;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.phantom;
        return iHashCode9 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("VideoParameter(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", required=");
        sb2.append(this.required);
        sb2.append(", immutable=");
        sb2.append(this.immutable);
        sb2.append(", motivation=");
        sb2.append(this.motivation);
        sb2.append(", hint=");
        sb2.append(this.hint);
        sb2.append(", displayingOptions=");
        sb2.append(this.displayingOptions);
        sb2.append(", updatesForm=");
        sb2.append(this.updatesForm);
        sb2.append(", placeholder=");
        sb2.append(this.placeholder);
        sb2.append(", constraints=");
        sb2.append(this.constraints);
        sb2.append(", _value=");
        sb2.append(this._value);
        sb2.append(", button=");
        sb2.append(this.button);
        sb2.append(", visible=");
        sb2.append(this.visible);
        sb2.append(", phantom=");
        return C0.g(sb2, this.phantom, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeInt(this.required ? 1 : 0);
        parcel.writeInt(this.immutable ? 1 : 0);
        parcel.writeParcelable(this.motivation, flags);
        parcel.writeString(this.hint);
        DisplayingOptions displayingOptions = this.displayingOptions;
        if (displayingOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            displayingOptions.writeToParcel(parcel, flags);
        }
        Boolean bool = this.updatesForm;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.placeholder);
        List<Constraint> list = this.constraints;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeString(this._value);
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

    /* JADX WARN: Multi-variable type inference failed */
    public VideoParameter(@k String str, @k String str2, boolean z12, boolean z13, @l AttributedText attributedText, @l String str3, @l DisplayingOptions displayingOptions, @l Boolean bool, @l String str4, @l List<? extends Constraint> list, @l String str5, @l ParamButton paramButton, @l Boolean bool2, @l Boolean bool3) {
        this.id = str;
        this.title = str2;
        this.required = z12;
        this.immutable = z13;
        this.motivation = attributedText;
        this.hint = str3;
        this.displayingOptions = displayingOptions;
        this.updatesForm = bool;
        this.placeholder = str4;
        this.constraints = list;
        this._value = str5;
        this.button = paramButton;
        this.visible = bool2;
        this.phantom = bool3;
    }

    @InterfaceC42830m
    public static /* synthetic */ void getHint$annotations() {
    }
}

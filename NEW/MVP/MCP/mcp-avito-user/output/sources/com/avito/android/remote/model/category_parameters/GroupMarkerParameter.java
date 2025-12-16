package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.GroupParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import com.avito.android.remote.model.category_parameters.base.Phantom;
import com.avito.android.remote.model.category_parameters.base.Visibility;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GroupMarkerParameter.kt */
@d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001@B\u0089\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b-\u0010,R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b.\u0010)R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b\u000e\u0010,R\u001a\u0010\u000f\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b/\u0010\"R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010$\u001a\u0004\b\u0014\u0010&R \u00106\u001a\u00020\u00078\u0016X\u0096D¢\u0006\u0012\n\u0004\b6\u0010$\u0012\u0004\b8\u00109\u001a\u0004\b7\u0010&R \u0010:\u001a\u00020\u00078\u0016X\u0096D¢\u0006\u0012\n\u0004\b:\u0010$\u0012\u0004\b<\u00109\u001a\u0004\b;\u0010&R\"\u0010=\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b=\u0010'\u0012\u0004\b?\u00109\u001a\u0004\b>\u0010)¨\u0006A"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/GroupMarkerParameter;", "Lcom/avito/android/remote/model/category_parameters/base/CategoryParameter;", "Lcom/avito/android/remote/model/category_parameters/base/Visibility;", "Lcom/avito/android/remote/model/category_parameters/base/Phantom;", "", "id", "title", "", "start", "Lcom/avito/android/remote/model/text/AttributedText;", "richTitle", "visible", "phantom", "description", "isNew", "type", "Lcom/avito/android/remote/model/category_parameters/GroupMarkerParameter$Payload;", "payload", "Lcom/avito/android/remote/model/category_parameters/GroupParameter$OnboardingTooltip;", "onboardingTooltip", "isClearance", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/GroupMarkerParameter$Payload;Lcom/avito/android/remote/model/category_parameters/GroupParameter$OnboardingTooltip;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTitle", "Z", "getStart", "()Z", "Lcom/avito/android/remote/model/text/AttributedText;", "getRichTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "getPhantom", "getDescription", "getType", "Lcom/avito/android/remote/model/category_parameters/GroupMarkerParameter$Payload;", "getPayload", "()Lcom/avito/android/remote/model/category_parameters/GroupMarkerParameter$Payload;", "Lcom/avito/android/remote/model/category_parameters/GroupParameter$OnboardingTooltip;", "getOnboardingTooltip", "()Lcom/avito/android/remote/model/category_parameters/GroupParameter$OnboardingTooltip;", "required", "getRequired", "getRequired$annotations", "()V", "immutable", "getImmutable", "getImmutable$annotations", "motivation", "getMotivation", "getMotivation$annotations", "Payload", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class GroupMarkerParameter extends CategoryParameter implements Visibility, Phantom {

    @k
    public static final Parcelable.Creator<GroupMarkerParameter> CREATOR = new Creator();

    @c("description")
    @l
    private final AttributedText description;

    @c("id")
    @k
    private final String id;
    private final boolean immutable;
    private final boolean isClearance;

    @c("isNew")
    @l
    private final Boolean isNew;

    @l
    private final AttributedText motivation;

    @l
    private final GroupParameter.OnboardingTooltip onboardingTooltip;

    @c("payload")
    @l
    private final Payload payload;

    @c("phantom")
    @l
    private final Boolean phantom;
    private final boolean required;

    @l
    private final AttributedText richTitle;
    private final boolean start;

    @c("title")
    @k
    private final String title;

    @c("type")
    @k
    private final String type;

    @c("visible")
    @l
    private final Boolean visible;

    /* compiled from: GroupMarkerParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GroupMarkerParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GroupMarkerParameter createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(GroupMarkerParameter.class.getClassLoader());
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
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(GroupMarkerParameter.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GroupMarkerParameter(string, string2, z12, attributedText, boolValueOf, boolValueOf2, attributedText2, boolValueOf3, parcel.readString(), parcel.readInt() == 0 ? null : Payload.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GroupParameter.OnboardingTooltip.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GroupMarkerParameter[] newArray(int i12) {
            return new GroupMarkerParameter[i12];
        }
    }

    /* compiled from: GroupMarkerParameter.kt */
    @d
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/GroupMarkerParameter$Payload;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Separator;", "separators", "Lcom/avito/android/remote/model/text/AttributedText;", TooltipAttribute.ATTRIBUTE_TYPE, "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/category_parameters/GroupMarkerParameter$Payload;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getSeparators", "Lcom/avito/android/remote/model/text/AttributedText;", "getTooltip", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Payload implements Parcelable {

        @k
        public static final Parcelable.Creator<Payload> CREATOR = new Creator();

        @c("separators")
        @k
        private final List<SelectParameter.Separator> separators;

        @c(TooltipAttribute.ATTRIBUTE_TYPE)
        @k
        private final AttributedText tooltip;

        /* compiled from: GroupMarkerParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Payload> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Payload createFromParcel(@k Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(SelectParameter.Separator.valueOf(parcel.readString()));
                }
                return new Payload(arrayList, (AttributedText) parcel.readParcelable(Payload.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Payload[] newArray(int i12) {
                return new Payload[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Payload(@k List<? extends SelectParameter.Separator> list, @k AttributedText attributedText) {
            this.separators = list;
            this.tooltip = attributedText;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Payload copy$default(Payload payload, List list, AttributedText attributedText, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                list = payload.separators;
            }
            if ((i12 & 2) != 0) {
                attributedText = payload.tooltip;
            }
            return payload.copy(list, attributedText);
        }

        @k
        public final List<SelectParameter.Separator> component1() {
            return this.separators;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final AttributedText getTooltip() {
            return this.tooltip;
        }

        @k
        public final Payload copy(@k List<? extends SelectParameter.Separator> separators, @k AttributedText tooltip) {
            return new Payload(separators, tooltip);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return L.f(this.separators, payload.separators) && L.f(this.tooltip, payload.tooltip);
        }

        @k
        public final List<SelectParameter.Separator> getSeparators() {
            return this.separators;
        }

        @k
        public final AttributedText getTooltip() {
            return this.tooltip;
        }

        public int hashCode() {
            return this.tooltip.hashCode() + (this.separators.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Payload(separators=");
            sb2.append(this.separators);
            sb2.append(", tooltip=");
            return a.w(sb2, this.tooltip, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Iterator itJ = C0.j(this.separators, parcel);
            while (itJ.hasNext()) {
                parcel.writeString(((SelectParameter.Separator) itJ.next()).name());
            }
            parcel.writeParcelable(this.tooltip, flags);
        }
    }

    public /* synthetic */ GroupMarkerParameter(String str, String str2, boolean z12, AttributedText attributedText, Boolean bool, Boolean bool2, AttributedText attributedText2, Boolean bool3, String str3, Payload payload, GroupParameter.OnboardingTooltip onboardingTooltip, boolean z13, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? "" : str2, z12, (i12 & 8) != 0 ? null : attributedText, (i12 & 16) != 0 ? Boolean.FALSE : bool, (i12 & 32) != 0 ? Boolean.FALSE : bool2, (i12 & 64) != 0 ? null : attributedText2, (i12 & 128) != 0 ? Boolean.FALSE : bool3, (i12 & 256) != 0 ? "" : str3, (i12 & 512) != 0 ? null : payload, (i12 & 1024) != 0 ? null : onboardingTooltip, (i12 & 2048) != 0 ? false : z13);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
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
    public final GroupParameter.OnboardingTooltip getOnboardingTooltip() {
        return this.onboardingTooltip;
    }

    @l
    public final Payload getPayload() {
        return this.payload;
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
    public final AttributedText getRichTitle() {
        return this.richTitle;
    }

    public final boolean getStart() {
        return this.start;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @k
    public String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @k
    public String getType() {
        return this.type;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.Visibility
    @l
    public Boolean getVisible() {
        return this.visible;
    }

    /* renamed from: isClearance, reason: from getter */
    public final boolean getIsClearance() {
        return this.isClearance;
    }

    @l
    /* renamed from: isNew, reason: from getter */
    public final Boolean getIsNew() {
        return this.isNew;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeInt(this.start ? 1 : 0);
        parcel.writeParcelable(this.richTitle, flags);
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
        parcel.writeParcelable(this.description, flags);
        Boolean bool3 = this.isNew;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        parcel.writeString(this.type);
        Payload payload = this.payload;
        if (payload == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            payload.writeToParcel(parcel, flags);
        }
        GroupParameter.OnboardingTooltip onboardingTooltip = this.onboardingTooltip;
        if (onboardingTooltip == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            onboardingTooltip.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.isClearance ? 1 : 0);
    }

    public GroupMarkerParameter(@k String str, @k String str2, boolean z12, @l AttributedText attributedText, @l Boolean bool, @l Boolean bool2, @l AttributedText attributedText2, @l Boolean bool3, @k String str3, @l Payload payload, @l GroupParameter.OnboardingTooltip onboardingTooltip, boolean z13) {
        this.id = str;
        this.title = str2;
        this.start = z12;
        this.richTitle = attributedText;
        this.visible = bool;
        this.phantom = bool2;
        this.description = attributedText2;
        this.isNew = bool3;
        this.type = str3;
        this.payload = payload;
        this.onboardingTooltip = onboardingTooltip;
        this.isClearance = z13;
    }

    public static /* synthetic */ void getImmutable$annotations() {
    }

    public static /* synthetic */ void getMotivation$annotations() {
    }

    public static /* synthetic */ void getRequired$annotations() {
    }
}

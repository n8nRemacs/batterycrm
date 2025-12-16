package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.category_parameters.GroupMarkerParameter;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.base.Phantom;
import com.avito.android.remote.model.category_parameters.base.Visibility;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GroupParameter.kt */
@d
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\b\u0007\u0018\u0000 D2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002DEB}\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b)\u0010(R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b-\u0010,R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b\u0010\u0010(R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00101\u001a\u0004\b2\u00103R \u00104\u001a\u00020\n8\u0016X\u0096D¢\u0006\u0012\n\u0004\b4\u00105\u0012\u0004\b8\u00109\u001a\u0004\b6\u00107R \u0010:\u001a\u00020\n8\u0016X\u0096D¢\u0006\u0012\n\u0004\b:\u00105\u0012\u0004\b<\u00109\u001a\u0004\b;\u00107R\"\u0010=\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b=\u0010*\u0012\u0004\b?\u00109\u001a\u0004\b>\u0010,R\u0014\u0010A\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\"R\u0014\u0010C\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\"¨\u0006F"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/GroupParameter;", "Lcom/avito/android/remote/model/category_parameters/base/CategoryParameter;", "Lcom/avito/android/remote/model/category_parameters/base/Visibility;", "Lcom/avito/android/remote/model/category_parameters/base/Phantom;", "", "id", "optionalTitle", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "", "visible", "phantom", "Lcom/avito/android/remote/model/text/AttributedText;", "richTitle", "description", "isNew", "Lcom/avito/android/remote/model/category_parameters/GroupMarkerParameter$Payload;", "payload", "Lcom/avito/android/remote/model/category_parameters/GroupParameter$OnboardingTooltip;", "onboardingTooltip", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/GroupMarkerParameter$Payload;Lcom/avito/android/remote/model/category_parameters/GroupParameter$OnboardingTooltip;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Ljava/util/List;", "getParameters", "()Ljava/util/List;", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "getPhantom", "Lcom/avito/android/remote/model/text/AttributedText;", "getRichTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "Lcom/avito/android/remote/model/category_parameters/GroupMarkerParameter$Payload;", "getPayload", "()Lcom/avito/android/remote/model/category_parameters/GroupMarkerParameter$Payload;", "Lcom/avito/android/remote/model/category_parameters/GroupParameter$OnboardingTooltip;", "getOnboardingTooltip", "()Lcom/avito/android/remote/model/category_parameters/GroupParameter$OnboardingTooltip;", "required", "Z", "getRequired", "()Z", "getRequired$annotations", "()V", "immutable", "getImmutable", "getImmutable$annotations", "motivation", "getMotivation", "getMotivation$annotations", "getType", "type", "getTitle", "title", "Companion", "OnboardingTooltip", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class GroupParameter extends CategoryParameter implements Visibility, Phantom {

    @k
    public static final String TYPE = "group";

    @c("description")
    @l
    private final AttributedText description;

    @c("id")
    @k
    private final String id;
    private final transient boolean immutable;

    @c("isNew")
    @l
    private final Boolean isNew;

    @l
    private final transient AttributedText motivation;

    @c("onboardingTooltip")
    @l
    private final OnboardingTooltip onboardingTooltip;

    @c("title")
    @l
    private final String optionalTitle;

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
    @l
    private final List<ParameterSlot> parameters;

    @c("payload")
    @l
    private final GroupMarkerParameter.Payload payload;

    @c("phantom")
    @l
    private final Boolean phantom;
    private final transient boolean required;

    @c("richTitle")
    @l
    private final AttributedText richTitle;

    @c("visible")
    @l
    private final Boolean visible;

    @k
    public static final Parcelable.Creator<GroupParameter> CREATOR = new Creator();

    /* compiled from: GroupParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GroupParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GroupParameter createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(GroupParameter.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
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
            AttributedText attributedText = (AttributedText) parcel.readParcelable(GroupParameter.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(GroupParameter.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GroupParameter(string, string2, arrayList, boolValueOf, boolValueOf2, attributedText, attributedText2, boolValueOf3, parcel.readInt() == 0 ? null : GroupMarkerParameter.Payload.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? OnboardingTooltip.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GroupParameter[] newArray(int i12) {
            return new GroupParameter[i12];
        }
    }

    /* compiled from: GroupParameter.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ2\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/category_parameters/GroupParameter$OnboardingTooltip;", "Landroid/os/Parcelable;", "", "id", "title", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/GroupParameter$OnboardingTooltip;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "getSubtitle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnboardingTooltip implements Parcelable {

        @k
        public static final Parcelable.Creator<OnboardingTooltip> CREATOR = new Creator();

        @c("id")
        @k
        private final String id;

        @c("subtitle")
        @l
        private final String subtitle;

        @c("title")
        @l
        private final String title;

        /* compiled from: GroupParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OnboardingTooltip> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final OnboardingTooltip createFromParcel(@k Parcel parcel) {
                return new OnboardingTooltip(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final OnboardingTooltip[] newArray(int i12) {
                return new OnboardingTooltip[i12];
            }
        }

        public OnboardingTooltip(@k String str, @l String str2, @l String str3) {
            this.id = str;
            this.title = str2;
            this.subtitle = str3;
        }

        public static /* synthetic */ OnboardingTooltip copy$default(OnboardingTooltip onboardingTooltip, String str, String str2, String str3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = onboardingTooltip.id;
            }
            if ((i12 & 2) != 0) {
                str2 = onboardingTooltip.title;
            }
            if ((i12 & 4) != 0) {
                str3 = onboardingTooltip.subtitle;
            }
            return onboardingTooltip.copy(str, str2, str3);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
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

        @k
        public final OnboardingTooltip copy(@k String id2, @l String title, @l String subtitle) {
            return new OnboardingTooltip(id2, title, subtitle);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnboardingTooltip)) {
                return false;
            }
            OnboardingTooltip onboardingTooltip = (OnboardingTooltip) other;
            return L.f(this.id, onboardingTooltip.id) && L.f(this.title, onboardingTooltip.title) && L.f(this.subtitle, onboardingTooltip.subtitle);
        }

        @k
        public final String getId() {
            return this.id;
        }

        @l
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.title;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subtitle;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("OnboardingTooltip(id=");
            sb2.append(this.id);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            return C22026a.c(sb2, this.subtitle, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
        }
    }

    public /* synthetic */ GroupParameter(String str, String str2, List list, Boolean bool, Boolean bool2, AttributedText attributedText, AttributedText attributedText2, Boolean bool3, GroupMarkerParameter.Payload payload, OnboardingTooltip onboardingTooltip, int i12, C42822w c42822w) {
        this(str, str2, list, (i12 & 8) != 0 ? Boolean.FALSE : bool, (i12 & 16) != 0 ? Boolean.FALSE : bool2, (i12 & 32) != 0 ? null : attributedText, (i12 & 64) != 0 ? null : attributedText2, (i12 & 128) != 0 ? Boolean.FALSE : bool3, (i12 & 256) != 0 ? null : payload, (i12 & 512) != 0 ? null : onboardingTooltip);
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
    public final OnboardingTooltip getOnboardingTooltip() {
        return this.onboardingTooltip;
    }

    @l
    public final List<ParameterSlot> getParameters() {
        return this.parameters;
    }

    @l
    public final GroupMarkerParameter.Payload getPayload() {
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

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @k
    public String getTitle() {
        String str = this.optionalTitle;
        return str == null ? "" : str;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @k
    public String getType() {
        return "group";
    }

    @Override // com.avito.android.remote.model.category_parameters.base.Visibility
    @l
    public Boolean getVisible() {
        return this.visible;
    }

    @l
    /* renamed from: isNew, reason: from getter */
    public final Boolean getIsNew() {
        return this.isNew;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.optionalTitle);
        List<ParameterSlot> list = this.parameters;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
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
        parcel.writeParcelable(this.richTitle, flags);
        parcel.writeParcelable(this.description, flags);
        Boolean bool3 = this.isNew;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        GroupMarkerParameter.Payload payload = this.payload;
        if (payload == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            payload.writeToParcel(parcel, flags);
        }
        OnboardingTooltip onboardingTooltip = this.onboardingTooltip;
        if (onboardingTooltip == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            onboardingTooltip.writeToParcel(parcel, flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupParameter(@k String str, @l String str2, @l List<? extends ParameterSlot> list, @l Boolean bool, @l Boolean bool2, @l AttributedText attributedText, @l AttributedText attributedText2, @l Boolean bool3, @l GroupMarkerParameter.Payload payload, @l OnboardingTooltip onboardingTooltip) {
        this.id = str;
        this.optionalTitle = str2;
        this.parameters = list;
        this.visible = bool;
        this.phantom = bool2;
        this.richTitle = attributedText;
        this.description = attributedText2;
        this.isNew = bool3;
        this.payload = payload;
        this.onboardingTooltip = onboardingTooltip;
    }

    public static /* synthetic */ void getImmutable$annotations() {
    }

    public static /* synthetic */ void getMotivation$annotations() {
    }

    public static /* synthetic */ void getRequired$annotations() {
    }
}

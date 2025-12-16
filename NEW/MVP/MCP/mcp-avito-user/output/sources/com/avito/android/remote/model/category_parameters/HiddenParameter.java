package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.component.accordion.s;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.LegacyRangeIntParameter;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;

/* compiled from: HiddenParameter.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000b2\u00020\u0001:\u0006\u000b\f\r\u000e\u000f\u0010B\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0004X\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007\u0082\u0001\u0005\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/HiddenParameter;", "Lcom/avito/android/remote/model/category_parameters/base/CategoryParameter;", "()V", "immutable", "", "getImmutable$annotations", "getImmutable", "()Z", "required", "getRequired$annotations", "getRequired", "Companion", "HiddenIntParameter", "HiddenMultiselectParameter", "HiddenRangeParameter", "HiddenRawParameter", "HiddenStringParameter", "Lcom/avito/android/remote/model/category_parameters/HiddenParameter$HiddenIntParameter;", "Lcom/avito/android/remote/model/category_parameters/HiddenParameter$HiddenMultiselectParameter;", "Lcom/avito/android/remote/model/category_parameters/HiddenParameter$HiddenRangeParameter;", "Lcom/avito/android/remote/model/category_parameters/HiddenParameter$HiddenRawParameter;", "Lcom/avito/android/remote/model/category_parameters/HiddenParameter$HiddenStringParameter;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class HiddenParameter extends CategoryParameter {

    @k
    public static final String TYPE = "hidden";
    private final boolean immutable;
    private final boolean required;

    /* compiled from: HiddenParameter.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JF\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b*\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0013R\u0014\u0010.\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\r¨\u0006/"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/HiddenParameter$HiddenIntParameter;", "Lcom/avito/android/remote/model/category_parameters/HiddenParameter;", "", "id", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "shadowType", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/text/AttributedText;", "component4", "component5", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/Integer;)Lcom/avito/android/remote/model/category_parameters/HiddenParameter$HiddenIntParameter;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "getShadowType", "Ljava/lang/Integer;", "getValue", "getType", "type", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HiddenIntParameter extends HiddenParameter {

        @k
        public static final Parcelable.Creator<HiddenIntParameter> CREATOR = new Creator();

        @c("id")
        @k
        private final String id;

        @c("motivation")
        @l
        private final AttributedText motivation;

        @c("shadowType")
        @k
        private final String shadowType;

        @c("title")
        @k
        private final String title;

        @c("value")
        @l
        private final Integer value;

        /* compiled from: HiddenParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HiddenIntParameter> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final HiddenIntParameter createFromParcel(@k Parcel parcel) {
                return new HiddenIntParameter(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(HiddenIntParameter.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final HiddenIntParameter[] newArray(int i12) {
                return new HiddenIntParameter[i12];
            }
        }

        public HiddenIntParameter(@k String str, @k String str2, @l AttributedText attributedText, @k String str3, @l Integer num) {
            super(null);
            this.id = str;
            this.title = str2;
            this.motivation = attributedText;
            this.shadowType = str3;
            this.value = num;
        }

        public static /* synthetic */ HiddenIntParameter copy$default(HiddenIntParameter hiddenIntParameter, String str, String str2, AttributedText attributedText, String str3, Integer num, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = hiddenIntParameter.id;
            }
            if ((i12 & 2) != 0) {
                str2 = hiddenIntParameter.title;
            }
            String str4 = str2;
            if ((i12 & 4) != 0) {
                attributedText = hiddenIntParameter.motivation;
            }
            AttributedText attributedText2 = attributedText;
            if ((i12 & 8) != 0) {
                str3 = hiddenIntParameter.shadowType;
            }
            String str5 = str3;
            if ((i12 & 16) != 0) {
                num = hiddenIntParameter.value;
            }
            return hiddenIntParameter.copy(str, str4, attributedText2, str5, num);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final AttributedText getMotivation() {
            return this.motivation;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final String getShadowType() {
            return this.shadowType;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final Integer getValue() {
            return this.value;
        }

        @k
        public final HiddenIntParameter copy(@k String id2, @k String title, @l AttributedText motivation, @k String shadowType, @l Integer value) {
            return new HiddenIntParameter(id2, title, motivation, shadowType, value);
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
            if (!(other instanceof HiddenIntParameter)) {
                return false;
            }
            HiddenIntParameter hiddenIntParameter = (HiddenIntParameter) other;
            return L.f(this.id, hiddenIntParameter.id) && L.f(this.title, hiddenIntParameter.title) && L.f(this.motivation, hiddenIntParameter.motivation) && L.f(this.shadowType, hiddenIntParameter.shadowType) && L.f(this.value, hiddenIntParameter.value);
        }

        @Override // com.avito.android.remote.model.category_parameters.base.ParameterSlot
        @k
        public String getId() {
            return this.id;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
        @l
        public AttributedText getMotivation() {
            return this.motivation;
        }

        @k
        public final String getShadowType() {
            return this.shadowType;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
        @k
        public String getTitle() {
            return this.title;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
        @k
        public String getType() {
            return HiddenParameter.TYPE;
        }

        @l
        public final Integer getValue() {
            return this.value;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
        public int hashCode() {
            int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
            AttributedText attributedText = this.motivation;
            int iD3 = H.d((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.shadowType);
            Integer num = this.value;
            return iD3 + (num != null ? num.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("HiddenIntParameter(id=");
            sb2.append(this.id);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", motivation=");
            sb2.append(this.motivation);
            sb2.append(", shadowType=");
            sb2.append(this.shadowType);
            sb2.append(", value=");
            return s.j(sb2, this.value, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.title);
            parcel.writeParcelable(this.motivation, flags);
            parcel.writeString(this.shadowType);
            Integer num = this.value;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
        }
    }

    /* compiled from: HiddenParameter.kt */
    @d
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JL\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b+\u0010\rR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0013R\u0014\u0010/\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\r¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/HiddenParameter$HiddenMultiselectParameter;", "Lcom/avito/android/remote/model/category_parameters/HiddenParameter;", "", "id", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "shadowType", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/text/AttributedText;", "component4", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/category_parameters/HiddenParameter$HiddenMultiselectParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "getShadowType", "Ljava/util/List;", "getValue", "getType", "type", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HiddenMultiselectParameter extends HiddenParameter {

        @k
        public static final Parcelable.Creator<HiddenMultiselectParameter> CREATOR = new Creator();

        @c("id")
        @k
        private final String id;

        @c("motivation")
        @l
        private final AttributedText motivation;

        @c("shadowType")
        @k
        private final String shadowType;

        @c("title")
        @k
        private final String title;

        @c("value")
        @l
        private final List<String> value;

        /* compiled from: HiddenParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HiddenMultiselectParameter> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final HiddenMultiselectParameter createFromParcel(@k Parcel parcel) {
                return new HiddenMultiselectParameter(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(HiddenMultiselectParameter.class.getClassLoader()), parcel.readString(), parcel.createStringArrayList());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final HiddenMultiselectParameter[] newArray(int i12) {
                return new HiddenMultiselectParameter[i12];
            }
        }

        public HiddenMultiselectParameter(@k String str, @k String str2, @l AttributedText attributedText, @k String str3, @l List<String> list) {
            super(null);
            this.id = str;
            this.title = str2;
            this.motivation = attributedText;
            this.shadowType = str3;
            this.value = list;
        }

        public static /* synthetic */ HiddenMultiselectParameter copy$default(HiddenMultiselectParameter hiddenMultiselectParameter, String str, String str2, AttributedText attributedText, String str3, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = hiddenMultiselectParameter.id;
            }
            if ((i12 & 2) != 0) {
                str2 = hiddenMultiselectParameter.title;
            }
            String str4 = str2;
            if ((i12 & 4) != 0) {
                attributedText = hiddenMultiselectParameter.motivation;
            }
            AttributedText attributedText2 = attributedText;
            if ((i12 & 8) != 0) {
                str3 = hiddenMultiselectParameter.shadowType;
            }
            String str5 = str3;
            if ((i12 & 16) != 0) {
                list = hiddenMultiselectParameter.value;
            }
            return hiddenMultiselectParameter.copy(str, str4, attributedText2, str5, list);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final AttributedText getMotivation() {
            return this.motivation;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final String getShadowType() {
            return this.shadowType;
        }

        @l
        public final List<String> component5() {
            return this.value;
        }

        @k
        public final HiddenMultiselectParameter copy(@k String id2, @k String title, @l AttributedText motivation, @k String shadowType, @l List<String> value) {
            return new HiddenMultiselectParameter(id2, title, motivation, shadowType, value);
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
            if (!(other instanceof HiddenMultiselectParameter)) {
                return false;
            }
            HiddenMultiselectParameter hiddenMultiselectParameter = (HiddenMultiselectParameter) other;
            return L.f(this.id, hiddenMultiselectParameter.id) && L.f(this.title, hiddenMultiselectParameter.title) && L.f(this.motivation, hiddenMultiselectParameter.motivation) && L.f(this.shadowType, hiddenMultiselectParameter.shadowType) && L.f(this.value, hiddenMultiselectParameter.value);
        }

        @Override // com.avito.android.remote.model.category_parameters.base.ParameterSlot
        @k
        public String getId() {
            return this.id;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
        @l
        public AttributedText getMotivation() {
            return this.motivation;
        }

        @k
        public final String getShadowType() {
            return this.shadowType;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
        @k
        public String getTitle() {
            return this.title;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
        @k
        public String getType() {
            return HiddenParameter.TYPE;
        }

        @l
        public final List<String> getValue() {
            return this.value;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
        public int hashCode() {
            int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
            AttributedText attributedText = this.motivation;
            int iD3 = H.d((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.shadowType);
            List<String> list = this.value;
            return iD3 + (list != null ? list.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("HiddenMultiselectParameter(id=");
            sb2.append(this.id);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", motivation=");
            sb2.append(this.motivation);
            sb2.append(", shadowType=");
            sb2.append(this.shadowType);
            sb2.append(", value=");
            return H.p(sb2, this.value, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.title);
            parcel.writeParcelable(this.motivation, flags);
            parcel.writeString(this.shadowType);
            parcel.writeStringList(this.value);
        }
    }

    /* compiled from: HiddenParameter.kt */
    @d
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JF\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b+\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0013R\u0014\u0010/\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\rR\u0011\u00101\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b0\u0010\r¨\u00062"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/HiddenParameter$HiddenRangeParameter;", "Lcom/avito/android/remote/model/category_parameters/HiddenParameter;", "", "id", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "shadowType", "Lcom/avito/android/remote/model/category_parameters/LegacyRangeIntParameter$RangeValue;", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/LegacyRangeIntParameter$RangeValue;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/text/AttributedText;", "component4", "component5", "()Lcom/avito/android/remote/model/category_parameters/LegacyRangeIntParameter$RangeValue;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/LegacyRangeIntParameter$RangeValue;)Lcom/avito/android/remote/model/category_parameters/HiddenParameter$HiddenRangeParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "getShadowType", "Lcom/avito/android/remote/model/category_parameters/LegacyRangeIntParameter$RangeValue;", "getValue", "getType", "type", "getCleanId", "cleanId", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HiddenRangeParameter extends HiddenParameter {

        @k
        public static final Parcelable.Creator<HiddenRangeParameter> CREATOR = new Creator();

        @c("id")
        @k
        private final String id;

        @c("motivation")
        @l
        private final AttributedText motivation;

        @c("shadowType")
        @k
        private final String shadowType;

        @c("title")
        @k
        private final String title;

        @c("value")
        @l
        private final LegacyRangeIntParameter.RangeValue value;

        /* compiled from: HiddenParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HiddenRangeParameter> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final HiddenRangeParameter createFromParcel(@k Parcel parcel) {
                return new HiddenRangeParameter(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(HiddenRangeParameter.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : LegacyRangeIntParameter.RangeValue.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final HiddenRangeParameter[] newArray(int i12) {
                return new HiddenRangeParameter[i12];
            }
        }

        public HiddenRangeParameter(@k String str, @k String str2, @l AttributedText attributedText, @k String str3, @l LegacyRangeIntParameter.RangeValue rangeValue) {
            super(null);
            this.id = str;
            this.title = str2;
            this.motivation = attributedText;
            this.shadowType = str3;
            this.value = rangeValue;
        }

        public static /* synthetic */ HiddenRangeParameter copy$default(HiddenRangeParameter hiddenRangeParameter, String str, String str2, AttributedText attributedText, String str3, LegacyRangeIntParameter.RangeValue rangeValue, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = hiddenRangeParameter.id;
            }
            if ((i12 & 2) != 0) {
                str2 = hiddenRangeParameter.title;
            }
            String str4 = str2;
            if ((i12 & 4) != 0) {
                attributedText = hiddenRangeParameter.motivation;
            }
            AttributedText attributedText2 = attributedText;
            if ((i12 & 8) != 0) {
                str3 = hiddenRangeParameter.shadowType;
            }
            String str5 = str3;
            if ((i12 & 16) != 0) {
                rangeValue = hiddenRangeParameter.value;
            }
            return hiddenRangeParameter.copy(str, str4, attributedText2, str5, rangeValue);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final AttributedText getMotivation() {
            return this.motivation;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final String getShadowType() {
            return this.shadowType;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final LegacyRangeIntParameter.RangeValue getValue() {
            return this.value;
        }

        @k
        public final HiddenRangeParameter copy(@k String id2, @k String title, @l AttributedText motivation, @k String shadowType, @l LegacyRangeIntParameter.RangeValue value) {
            return new HiddenRangeParameter(id2, title, motivation, shadowType, value);
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
            if (!(other instanceof HiddenRangeParameter)) {
                return false;
            }
            HiddenRangeParameter hiddenRangeParameter = (HiddenRangeParameter) other;
            return L.f(this.id, hiddenRangeParameter.id) && L.f(this.title, hiddenRangeParameter.title) && L.f(this.motivation, hiddenRangeParameter.motivation) && L.f(this.shadowType, hiddenRangeParameter.shadowType) && L.f(this.value, hiddenRangeParameter.value);
        }

        @k
        public final String getCleanId() {
            return C43066x.X("]", C43066x.U("params[", getId()));
        }

        @Override // com.avito.android.remote.model.category_parameters.base.ParameterSlot
        @k
        public String getId() {
            return this.id;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
        @l
        public AttributedText getMotivation() {
            return this.motivation;
        }

        @k
        public final String getShadowType() {
            return this.shadowType;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
        @k
        public String getTitle() {
            return this.title;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
        @k
        public String getType() {
            return HiddenParameter.TYPE;
        }

        @l
        public final LegacyRangeIntParameter.RangeValue getValue() {
            return this.value;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
        public int hashCode() {
            int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
            AttributedText attributedText = this.motivation;
            int iD3 = H.d((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.shadowType);
            LegacyRangeIntParameter.RangeValue rangeValue = this.value;
            return iD3 + (rangeValue != null ? rangeValue.hashCode() : 0);
        }

        @k
        public String toString() {
            return "HiddenRangeParameter(id=" + this.id + ", title=" + this.title + ", motivation=" + this.motivation + ", shadowType=" + this.shadowType + ", value=" + this.value + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.title);
            parcel.writeParcelable(this.motivation, flags);
            parcel.writeString(this.shadowType);
            LegacyRangeIntParameter.RangeValue rangeValue = this.value;
            if (rangeValue == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                rangeValue.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: HiddenParameter.kt */
    @d
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B8\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\r\u0010\n\u001a\t\u0018\u00010\b¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0013\u001a\t\u0018\u00010\b¢\u0006\u0002\b\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JK\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000f\b\u0002\u0010\n\u001a\t\u0018\u00010\b¢\u0006\u0002\b\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b+\u0010\u000eR!\u0010\n\u001a\t\u0018\u00010\b¢\u0006\u0002\b\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010\u0014R\u0014\u0010/\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u000e¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/HiddenParameter$HiddenRawParameter;", "Lcom/avito/android/remote/model/category_parameters/HiddenParameter;", "", "id", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "shadowType", "", "LK51/e;", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/text/AttributedText;", "component4", "component5", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/Object;)Lcom/avito/android/remote/model/category_parameters/HiddenParameter$HiddenRawParameter;", "toString", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "getShadowType", "Ljava/lang/Object;", "getValue", "getType", "type", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HiddenRawParameter extends HiddenParameter {

        @k
        public static final Parcelable.Creator<HiddenRawParameter> CREATOR = new Creator();

        @c("id")
        @k
        private final String id;

        @c("motivation")
        @l
        private final AttributedText motivation;

        @c("shadowType")
        @k
        private final String shadowType;

        @c("title")
        @k
        private final String title;

        @c("value")
        @l
        private final Object value;

        /* compiled from: HiddenParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HiddenRawParameter> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final HiddenRawParameter createFromParcel(@k Parcel parcel) {
                return new HiddenRawParameter(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(HiddenRawParameter.class.getClassLoader()), parcel.readString(), parcel.readValue(HiddenRawParameter.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final HiddenRawParameter[] newArray(int i12) {
                return new HiddenRawParameter[i12];
            }
        }

        public HiddenRawParameter(@k String str, @k String str2, @l AttributedText attributedText, @k String str3, @l Object obj) {
            super(null);
            this.id = str;
            this.title = str2;
            this.motivation = attributedText;
            this.shadowType = str3;
            this.value = obj;
        }

        public static /* synthetic */ HiddenRawParameter copy$default(HiddenRawParameter hiddenRawParameter, String str, String str2, AttributedText attributedText, String str3, Object obj, int i12, Object obj2) {
            if ((i12 & 1) != 0) {
                str = hiddenRawParameter.id;
            }
            if ((i12 & 2) != 0) {
                str2 = hiddenRawParameter.title;
            }
            String str4 = str2;
            if ((i12 & 4) != 0) {
                attributedText = hiddenRawParameter.motivation;
            }
            AttributedText attributedText2 = attributedText;
            if ((i12 & 8) != 0) {
                str3 = hiddenRawParameter.shadowType;
            }
            String str5 = str3;
            if ((i12 & 16) != 0) {
                obj = hiddenRawParameter.value;
            }
            return hiddenRawParameter.copy(str, str4, attributedText2, str5, obj);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final AttributedText getMotivation() {
            return this.motivation;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final String getShadowType() {
            return this.shadowType;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final Object getValue() {
            return this.value;
        }

        @k
        public final HiddenRawParameter copy(@k String id2, @k String title, @l AttributedText motivation, @k String shadowType, @l Object value) {
            return new HiddenRawParameter(id2, title, motivation, shadowType, value);
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
            if (!(other instanceof HiddenRawParameter)) {
                return false;
            }
            HiddenRawParameter hiddenRawParameter = (HiddenRawParameter) other;
            return L.f(this.id, hiddenRawParameter.id) && L.f(this.title, hiddenRawParameter.title) && L.f(this.motivation, hiddenRawParameter.motivation) && L.f(this.shadowType, hiddenRawParameter.shadowType) && L.f(this.value, hiddenRawParameter.value);
        }

        @Override // com.avito.android.remote.model.category_parameters.base.ParameterSlot
        @k
        public String getId() {
            return this.id;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
        @l
        public AttributedText getMotivation() {
            return this.motivation;
        }

        @k
        public final String getShadowType() {
            return this.shadowType;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
        @k
        public String getTitle() {
            return this.title;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
        @k
        public String getType() {
            return HiddenParameter.TYPE;
        }

        @l
        public final Object getValue() {
            return this.value;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
        public int hashCode() {
            int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
            AttributedText attributedText = this.motivation;
            int iD3 = H.d((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.shadowType);
            Object obj = this.value;
            return iD3 + (obj != null ? obj.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("HiddenRawParameter(id=");
            sb2.append(this.id);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", motivation=");
            sb2.append(this.motivation);
            sb2.append(", shadowType=");
            sb2.append(this.shadowType);
            sb2.append(", value=");
            return H.n(sb2, this.value, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.title);
            parcel.writeParcelable(this.motivation, flags);
            parcel.writeString(this.shadowType);
            parcel.writeValue(this.value);
        }
    }

    /* compiled from: HiddenParameter.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJF\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b)\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b*\u0010\fR\u0014\u0010,\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\f¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/HiddenParameter$HiddenStringParameter;", "Lcom/avito/android/remote/model/category_parameters/HiddenParameter;", "", "id", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "shadowType", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/text/AttributedText;", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/HiddenParameter$HiddenStringParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "getShadowType", "getValue", "getType", "type", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HiddenStringParameter extends HiddenParameter {

        @k
        public static final Parcelable.Creator<HiddenStringParameter> CREATOR = new Creator();

        @c("id")
        @k
        private final String id;

        @c("motivation")
        @l
        private final AttributedText motivation;

        @c("shadowType")
        @k
        private final String shadowType;

        @c("title")
        @k
        private final String title;

        @c("value")
        @l
        private final String value;

        /* compiled from: HiddenParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HiddenStringParameter> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final HiddenStringParameter createFromParcel(@k Parcel parcel) {
                return new HiddenStringParameter(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(HiddenStringParameter.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final HiddenStringParameter[] newArray(int i12) {
                return new HiddenStringParameter[i12];
            }
        }

        public HiddenStringParameter(@k String str, @k String str2, @l AttributedText attributedText, @k String str3, @l String str4) {
            super(null);
            this.id = str;
            this.title = str2;
            this.motivation = attributedText;
            this.shadowType = str3;
            this.value = str4;
        }

        public static /* synthetic */ HiddenStringParameter copy$default(HiddenStringParameter hiddenStringParameter, String str, String str2, AttributedText attributedText, String str3, String str4, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = hiddenStringParameter.id;
            }
            if ((i12 & 2) != 0) {
                str2 = hiddenStringParameter.title;
            }
            String str5 = str2;
            if ((i12 & 4) != 0) {
                attributedText = hiddenStringParameter.motivation;
            }
            AttributedText attributedText2 = attributedText;
            if ((i12 & 8) != 0) {
                str3 = hiddenStringParameter.shadowType;
            }
            String str6 = str3;
            if ((i12 & 16) != 0) {
                str4 = hiddenStringParameter.value;
            }
            return hiddenStringParameter.copy(str, str5, attributedText2, str6, str4);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final AttributedText getMotivation() {
            return this.motivation;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final String getShadowType() {
            return this.shadowType;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @k
        public final HiddenStringParameter copy(@k String id2, @k String title, @l AttributedText motivation, @k String shadowType, @l String value) {
            return new HiddenStringParameter(id2, title, motivation, shadowType, value);
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
            if (!(other instanceof HiddenStringParameter)) {
                return false;
            }
            HiddenStringParameter hiddenStringParameter = (HiddenStringParameter) other;
            return L.f(this.id, hiddenStringParameter.id) && L.f(this.title, hiddenStringParameter.title) && L.f(this.motivation, hiddenStringParameter.motivation) && L.f(this.shadowType, hiddenStringParameter.shadowType) && L.f(this.value, hiddenStringParameter.value);
        }

        @Override // com.avito.android.remote.model.category_parameters.base.ParameterSlot
        @k
        public String getId() {
            return this.id;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
        @l
        public AttributedText getMotivation() {
            return this.motivation;
        }

        @k
        public final String getShadowType() {
            return this.shadowType;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
        @k
        public String getTitle() {
            return this.title;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
        @k
        public String getType() {
            return HiddenParameter.TYPE;
        }

        @l
        public final String getValue() {
            return this.value;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
        public int hashCode() {
            int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
            AttributedText attributedText = this.motivation;
            int iD3 = H.d((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.shadowType);
            String str = this.value;
            return iD3 + (str != null ? str.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("HiddenStringParameter(id=");
            sb2.append(this.id);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", motivation=");
            sb2.append(this.motivation);
            sb2.append(", shadowType=");
            sb2.append(this.shadowType);
            sb2.append(", value=");
            return C22026a.c(sb2, this.value, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.title);
            parcel.writeParcelable(this.motivation, flags);
            parcel.writeString(this.shadowType);
            parcel.writeString(this.value);
        }
    }

    public /* synthetic */ HiddenParameter(C42822w c42822w) {
        this();
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    public boolean getImmutable() {
        return this.immutable;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    public boolean getRequired() {
        return this.required;
    }

    private HiddenParameter() {
        this.required = true;
    }

    public static /* synthetic */ void getImmutable$annotations() {
    }

    public static /* synthetic */ void getRequired$annotations() {
    }
}

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
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import com.avito.android.remote.model.category_parameters.base.Phantom;
import com.avito.android.remote.model.category_parameters.base.Visibility;
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

/* compiled from: BottomSheetGroupParameter.kt */
@d
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 F2\u00020\u00012\u00020\u00022\u00020\u0003:\u0004FGHIB_\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#Jx\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u0016J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020'HÖ\u0001¢\u0006\u0004\b.\u0010)J \u00103\u001a\u0002022\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020'HÖ\u0001¢\u0006\u0004\b3\u00104R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b7\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b9\u0010\u0019R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b:\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b@\u0010 R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\bA\u0010 R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010B\u001a\u0004\bC\u0010#R\u0014\u0010E\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u0016¨\u0006J"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/BottomSheetGroupParameter;", "Lcom/avito/android/remote/model/category_parameters/base/CategoryParameter;", "Lcom/avito/android/remote/model/category_parameters/base/Visibility;", "Lcom/avito/android/remote/model/category_parameters/base/Phantom;", "", "id", "title", "", "immutable", "required", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "Lcom/avito/android/remote/model/category_parameters/BottomSheetGroupParameter$Payload;", "payload", "visible", "phantom", "", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/category_parameters/BottomSheetGroupParameter$Payload;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "()Lcom/avito/android/remote/model/text/AttributedText;", "component6", "()Lcom/avito/android/remote/model/category_parameters/BottomSheetGroupParameter$Payload;", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/category_parameters/BottomSheetGroupParameter$Payload;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)Lcom/avito/android/remote/model/category_parameters/BottomSheetGroupParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Z", "getImmutable", "getRequired", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "Lcom/avito/android/remote/model/category_parameters/BottomSheetGroupParameter$Payload;", "getPayload", "Ljava/lang/Boolean;", "getVisible", "getPhantom", "Ljava/util/List;", "getParameters", "getType", "type", "Companion", "OutsideCheckbox", "Payload", "PluralString", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BottomSheetGroupParameter extends CategoryParameter implements Visibility, Phantom {

    @k
    public static final String TYPE = "bottomSheetGroup";

    @c("id")
    @k
    private final String id;

    @c("immutable")
    private final boolean immutable;

    @c("motivation")
    @l
    private final AttributedText motivation;

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
    @k
    private final List<MultiselectParameter> parameters;

    @c("payload")
    @l
    private final Payload payload;

    @c("phantom")
    @l
    private final Boolean phantom;

    @c("required")
    private final boolean required;

    @c("title")
    @k
    private final String title;

    @c("visible")
    @l
    private final Boolean visible;

    @k
    public static final Parcelable.Creator<BottomSheetGroupParameter> CREATOR = new Creator();

    /* compiled from: BottomSheetGroupParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BottomSheetGroupParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BottomSheetGroupParameter createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(BottomSheetGroupParameter.class.getClassLoader());
            Boolean boolValueOf2 = null;
            Payload payloadCreateFromParcel = parcel.readInt() == 0 ? null : Payload.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            while (iC2 != i12) {
                iC2 = a.c(MultiselectParameter.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new BottomSheetGroupParameter(string, string2, z12, z13, attributedText, payloadCreateFromParcel, boolValueOf, boolValueOf2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BottomSheetGroupParameter[] newArray(int i12) {
            return new BottomSheetGroupParameter[i12];
        }
    }

    /* compiled from: BottomSheetGroupParameter.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/category_parameters/BottomSheetGroupParameter$OutsideCheckbox;", "Landroid/os/Parcelable;", "", "title", "paramId", "valueId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/BottomSheetGroupParameter$OutsideCheckbox;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getParamId", "getValueId", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OutsideCheckbox implements Parcelable {

        @k
        public static final Parcelable.Creator<OutsideCheckbox> CREATOR = new Creator();

        @c("paramId")
        @k
        private final String paramId;

        @c("title")
        @k
        private final String title;

        @c("valueId")
        @k
        private final String valueId;

        /* compiled from: BottomSheetGroupParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OutsideCheckbox> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final OutsideCheckbox createFromParcel(@k Parcel parcel) {
                return new OutsideCheckbox(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final OutsideCheckbox[] newArray(int i12) {
                return new OutsideCheckbox[i12];
            }
        }

        public OutsideCheckbox(@k String str, @k String str2, @k String str3) {
            this.title = str;
            this.paramId = str2;
            this.valueId = str3;
        }

        public static /* synthetic */ OutsideCheckbox copy$default(OutsideCheckbox outsideCheckbox, String str, String str2, String str3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = outsideCheckbox.title;
            }
            if ((i12 & 2) != 0) {
                str2 = outsideCheckbox.paramId;
            }
            if ((i12 & 4) != 0) {
                str3 = outsideCheckbox.valueId;
            }
            return outsideCheckbox.copy(str, str2, str3);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getParamId() {
            return this.paramId;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getValueId() {
            return this.valueId;
        }

        @k
        public final OutsideCheckbox copy(@k String title, @k String paramId, @k String valueId) {
            return new OutsideCheckbox(title, paramId, valueId);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OutsideCheckbox)) {
                return false;
            }
            OutsideCheckbox outsideCheckbox = (OutsideCheckbox) other;
            return L.f(this.title, outsideCheckbox.title) && L.f(this.paramId, outsideCheckbox.paramId) && L.f(this.valueId, outsideCheckbox.valueId);
        }

        @k
        public final String getParamId() {
            return this.paramId;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @k
        public final String getValueId() {
            return this.valueId;
        }

        public int hashCode() {
            return this.valueId.hashCode() + H.d(this.title.hashCode() * 31, 31, this.paramId);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("OutsideCheckbox(title=");
            sb2.append(this.title);
            sb2.append(", paramId=");
            sb2.append(this.paramId);
            sb2.append(", valueId=");
            return C22026a.c(sb2, this.valueId, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.paramId);
            parcel.writeString(this.valueId);
        }
    }

    /* compiled from: BottomSheetGroupParameter.kt */
    @d
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015JR\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0011R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b0\u0010\u0015¨\u00061"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/BottomSheetGroupParameter$Payload;", "Landroid/os/Parcelable;", "", ChannelContext.Item.PLACEHOLDER, "", "onboardingEnabled", "", "Lcom/avito/android/remote/model/category_parameters/BottomSheetGroupParameter$OutsideCheckbox;", "outsideCheckboxes", "Lcom/avito/android/remote/model/category_parameters/BottomSheetGroupParameter$PluralString;", "titlePlurals", "titlePluralsMore", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/BottomSheetGroupParameter$PluralString;Lcom/avito/android/remote/model/category_parameters/BottomSheetGroupParameter$PluralString;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Ljava/util/List;", "component4", "()Lcom/avito/android/remote/model/category_parameters/BottomSheetGroupParameter$PluralString;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/BottomSheetGroupParameter$PluralString;Lcom/avito/android/remote/model/category_parameters/BottomSheetGroupParameter$PluralString;)Lcom/avito/android/remote/model/category_parameters/BottomSheetGroupParameter$Payload;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPlaceholder", "Ljava/lang/Boolean;", "getOnboardingEnabled", "Ljava/util/List;", "getOutsideCheckboxes", "Lcom/avito/android/remote/model/category_parameters/BottomSheetGroupParameter$PluralString;", "getTitlePlurals", "getTitlePluralsMore", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Payload implements Parcelable {

        @k
        public static final Parcelable.Creator<Payload> CREATOR = new Creator();

        @c("onboardingEnabled")
        @l
        private final Boolean onboardingEnabled;

        @c("outsideCheckboxes")
        @l
        private final List<OutsideCheckbox> outsideCheckboxes;

        @c(ChannelContext.Item.PLACEHOLDER)
        @l
        private final String placeholder;

        @c("titlePlurals")
        @l
        private final PluralString titlePlurals;

        @c("titlePluralsMore")
        @l
        private final PluralString titlePluralsMore;

        /* compiled from: BottomSheetGroupParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Payload> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Payload createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                ArrayList arrayList;
                String string = parcel.readString();
                int iC2 = 0;
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
                    while (iC2 != i12) {
                        iC2 = a.c(OutsideCheckbox.CREATOR, parcel, arrayList, iC2, 1);
                    }
                }
                return new Payload(string, boolValueOf, arrayList, parcel.readInt() == 0 ? null : PluralString.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PluralString.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Payload[] newArray(int i12) {
                return new Payload[i12];
            }
        }

        public Payload(@l String str, @l Boolean bool, @l List<OutsideCheckbox> list, @l PluralString pluralString, @l PluralString pluralString2) {
            this.placeholder = str;
            this.onboardingEnabled = bool;
            this.outsideCheckboxes = list;
            this.titlePlurals = pluralString;
            this.titlePluralsMore = pluralString2;
        }

        public static /* synthetic */ Payload copy$default(Payload payload, String str, Boolean bool, List list, PluralString pluralString, PluralString pluralString2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = payload.placeholder;
            }
            if ((i12 & 2) != 0) {
                bool = payload.onboardingEnabled;
            }
            Boolean bool2 = bool;
            if ((i12 & 4) != 0) {
                list = payload.outsideCheckboxes;
            }
            List list2 = list;
            if ((i12 & 8) != 0) {
                pluralString = payload.titlePlurals;
            }
            PluralString pluralString3 = pluralString;
            if ((i12 & 16) != 0) {
                pluralString2 = payload.titlePluralsMore;
            }
            return payload.copy(str, bool2, list2, pluralString3, pluralString2);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Boolean getOnboardingEnabled() {
            return this.onboardingEnabled;
        }

        @l
        public final List<OutsideCheckbox> component3() {
            return this.outsideCheckboxes;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final PluralString getTitlePlurals() {
            return this.titlePlurals;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final PluralString getTitlePluralsMore() {
            return this.titlePluralsMore;
        }

        @k
        public final Payload copy(@l String placeholder, @l Boolean onboardingEnabled, @l List<OutsideCheckbox> outsideCheckboxes, @l PluralString titlePlurals, @l PluralString titlePluralsMore) {
            return new Payload(placeholder, onboardingEnabled, outsideCheckboxes, titlePlurals, titlePluralsMore);
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
            return L.f(this.placeholder, payload.placeholder) && L.f(this.onboardingEnabled, payload.onboardingEnabled) && L.f(this.outsideCheckboxes, payload.outsideCheckboxes) && L.f(this.titlePlurals, payload.titlePlurals) && L.f(this.titlePluralsMore, payload.titlePluralsMore);
        }

        @l
        public final Boolean getOnboardingEnabled() {
            return this.onboardingEnabled;
        }

        @l
        public final List<OutsideCheckbox> getOutsideCheckboxes() {
            return this.outsideCheckboxes;
        }

        @l
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @l
        public final PluralString getTitlePlurals() {
            return this.titlePlurals;
        }

        @l
        public final PluralString getTitlePluralsMore() {
            return this.titlePluralsMore;
        }

        public int hashCode() {
            String str = this.placeholder;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.onboardingEnabled;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            List<OutsideCheckbox> list = this.outsideCheckboxes;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            PluralString pluralString = this.titlePlurals;
            int iHashCode4 = (iHashCode3 + (pluralString == null ? 0 : pluralString.hashCode())) * 31;
            PluralString pluralString2 = this.titlePluralsMore;
            return iHashCode4 + (pluralString2 != null ? pluralString2.hashCode() : 0);
        }

        @k
        public String toString() {
            return "Payload(placeholder=" + this.placeholder + ", onboardingEnabled=" + this.onboardingEnabled + ", outsideCheckboxes=" + this.outsideCheckboxes + ", titlePlurals=" + this.titlePlurals + ", titlePluralsMore=" + this.titlePluralsMore + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.placeholder);
            Boolean bool = this.onboardingEnabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            List<OutsideCheckbox> list = this.outsideCheckboxes;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    ((OutsideCheckbox) itA.next()).writeToParcel(parcel, flags);
                }
            }
            PluralString pluralString = this.titlePlurals;
            if (pluralString == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                pluralString.writeToParcel(parcel, flags);
            }
            PluralString pluralString2 = this.titlePluralsMore;
            if (pluralString2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                pluralString2.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: BottomSheetGroupParameter.kt */
    @d
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\t¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/BottomSheetGroupParameter$PluralString;", "Landroid/os/Parcelable;", "", PluralsKeys.ONE, PluralsKeys.FEW, PluralsKeys.OTHER, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/BottomSheetGroupParameter$PluralString;", "toString", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getOne", "getFew", "getOther", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PluralString implements Parcelable {

        @k
        public static final Parcelable.Creator<PluralString> CREATOR = new Creator();

        @c(PluralsKeys.FEW)
        @k
        private final String few;

        @c(PluralsKeys.ONE)
        @k
        private final String one;

        @c(PluralsKeys.OTHER)
        @k
        private final String other;

        /* compiled from: BottomSheetGroupParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PluralString> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final PluralString createFromParcel(@k Parcel parcel) {
                return new PluralString(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final PluralString[] newArray(int i12) {
                return new PluralString[i12];
            }
        }

        public PluralString(@k String str, @k String str2, @k String str3) {
            this.one = str;
            this.few = str2;
            this.other = str3;
        }

        public static /* synthetic */ PluralString copy$default(PluralString pluralString, String str, String str2, String str3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = pluralString.one;
            }
            if ((i12 & 2) != 0) {
                str2 = pluralString.few;
            }
            if ((i12 & 4) != 0) {
                str3 = pluralString.other;
            }
            return pluralString.copy(str, str2, str3);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getOne() {
            return this.one;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getFew() {
            return this.few;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getOther() {
            return this.other;
        }

        @k
        public final PluralString copy(@k String one, @k String few, @k String other) {
            return new PluralString(one, few, other);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PluralString)) {
                return false;
            }
            PluralString pluralString = (PluralString) other;
            return L.f(this.one, pluralString.one) && L.f(this.few, pluralString.few) && L.f(this.other, pluralString.other);
        }

        @k
        public final String getFew() {
            return this.few;
        }

        @k
        public final String getOne() {
            return this.one;
        }

        @k
        public final String getOther() {
            return this.other;
        }

        public int hashCode() {
            return this.other.hashCode() + H.d(this.one.hashCode() * 31, 31, this.few);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("PluralString(one=");
            sb2.append(this.one);
            sb2.append(", few=");
            sb2.append(this.few);
            sb2.append(", other=");
            return C22026a.c(sb2, this.other, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.one);
            parcel.writeString(this.few);
            parcel.writeString(this.other);
        }
    }

    public /* synthetic */ BottomSheetGroupParameter(String str, String str2, boolean z12, boolean z13, AttributedText attributedText, Payload payload, Boolean bool, Boolean bool2, List list, int i12, C42822w c42822w) {
        this(str, str2, z12, z13, attributedText, payload, bool, (i12 & 128) != 0 ? Boolean.FALSE : bool2, list);
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

    /* renamed from: component3, reason: from getter */
    public final boolean getImmutable() {
        return this.immutable;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final AttributedText getMotivation() {
        return this.motivation;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Payload getPayload() {
        return this.payload;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Boolean getVisible() {
        return this.visible;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Boolean getPhantom() {
        return this.phantom;
    }

    @k
    public final List<MultiselectParameter> component9() {
        return this.parameters;
    }

    @k
    public final BottomSheetGroupParameter copy(@k String id2, @k String title, boolean immutable, boolean required, @l AttributedText motivation, @l Payload payload, @l Boolean visible, @l Boolean phantom, @k List<MultiselectParameter> parameters) {
        return new BottomSheetGroupParameter(id2, title, immutable, required, motivation, payload, visible, phantom, parameters);
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
        if (!(other instanceof BottomSheetGroupParameter)) {
            return false;
        }
        BottomSheetGroupParameter bottomSheetGroupParameter = (BottomSheetGroupParameter) other;
        return L.f(this.id, bottomSheetGroupParameter.id) && L.f(this.title, bottomSheetGroupParameter.title) && this.immutable == bottomSheetGroupParameter.immutable && this.required == bottomSheetGroupParameter.required && L.f(this.motivation, bottomSheetGroupParameter.motivation) && L.f(this.payload, bottomSheetGroupParameter.payload) && L.f(this.visible, bottomSheetGroupParameter.visible) && L.f(this.phantom, bottomSheetGroupParameter.phantom) && L.f(this.parameters, bottomSheetGroupParameter.parameters);
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

    @k
    public final List<MultiselectParameter> getParameters() {
        return this.parameters;
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

    @Override // com.avito.android.remote.model.category_parameters.base.Visibility
    @l
    public Boolean getVisible() {
        return this.visible;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public int hashCode() {
        int i12 = r.i(r.i(H.d(this.id.hashCode() * 31, 31, this.title), 31, this.immutable), 31, this.required);
        AttributedText attributedText = this.motivation;
        int iHashCode = (i12 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Payload payload = this.payload;
        int iHashCode2 = (iHashCode + (payload == null ? 0 : payload.hashCode())) * 31;
        Boolean bool = this.visible;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.phantom;
        return this.parameters.hashCode() + ((iHashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BottomSheetGroupParameter(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", immutable=");
        sb2.append(this.immutable);
        sb2.append(", required=");
        sb2.append(this.required);
        sb2.append(", motivation=");
        sb2.append(this.motivation);
        sb2.append(", payload=");
        sb2.append(this.payload);
        sb2.append(", visible=");
        sb2.append(this.visible);
        sb2.append(", phantom=");
        sb2.append(this.phantom);
        sb2.append(", parameters=");
        return H.p(sb2, this.parameters, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeInt(this.immutable ? 1 : 0);
        parcel.writeInt(this.required ? 1 : 0);
        parcel.writeParcelable(this.motivation, flags);
        Payload payload = this.payload;
        if (payload == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            payload.writeToParcel(parcel, flags);
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
        Iterator itJ = C0.j(this.parameters, parcel);
        while (itJ.hasNext()) {
            ((MultiselectParameter) itJ.next()).writeToParcel(parcel, flags);
        }
    }

    public BottomSheetGroupParameter(@k String str, @k String str2, boolean z12, boolean z13, @l AttributedText attributedText, @l Payload payload, @l Boolean bool, @l Boolean bool2, @k List<MultiselectParameter> list) {
        this.id = str;
        this.title = str2;
        this.immutable = z12;
        this.required = z13;
        this.motivation = attributedText;
        this.payload = payload;
        this.visible = bool;
        this.phantom = bool2;
        this.parameters = list;
    }
}

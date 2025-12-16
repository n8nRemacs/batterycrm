package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RenderMetadata.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJj\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0010J\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0012J\u001a\u0010!\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u0012J \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b1\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b2\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b3\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b\f\u0010\u001a¨\u00065"}, d2 = {"Lcom/avito/android/remote/model/RenderMetadata;", "Landroid/os/Parcelable;", "", "requestId", "", "templateId", "templateSlug", "requestedNodeID", "requestedLayoutVersion", "targetNodeID", "targetLayoutVersion", "", "isDegraded", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "()Ljava/lang/Integer;", "component5", "component6", "component7", "component8", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/RenderMetadata;", "toString", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getRequestId", "I", "getTemplateId", "getTemplateSlug", "Ljava/lang/Integer;", "getRequestedNodeID", "getRequestedLayoutVersion", "getTargetNodeID", "getTargetLayoutVersion", "Ljava/lang/Boolean;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RenderMetadata implements Parcelable {

    @k
    public static final Parcelable.Creator<RenderMetadata> CREATOR = new Creator();

    @c("isDegraded")
    @l
    private final Boolean isDegraded;

    @c("requestId")
    @k
    private final String requestId;

    @c("requestedLayoutVersion")
    @l
    private final Integer requestedLayoutVersion;

    @c("requestedNodeID")
    @l
    private final Integer requestedNodeID;

    @c("targetLayoutVersion")
    @l
    private final Integer targetLayoutVersion;

    @c("targetNodeID")
    @l
    private final Integer targetNodeID;

    @c("templateId")
    private final int templateId;

    @c("templateSlug")
    @k
    private final String templateSlug;

    /* compiled from: RenderMetadata.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RenderMetadata> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RenderMetadata createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            int i12 = parcel.readInt();
            String string2 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new RenderMetadata(string, i12, string2, numValueOf, numValueOf2, numValueOf3, numValueOf4, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RenderMetadata[] newArray(int i12) {
            return new RenderMetadata[i12];
        }
    }

    public RenderMetadata(@k String str, int i12, @k String str2, @l Integer num, @l Integer num2, @l Integer num3, @l Integer num4, @l Boolean bool) {
        this.requestId = str;
        this.templateId = i12;
        this.templateSlug = str2;
        this.requestedNodeID = num;
        this.requestedLayoutVersion = num2;
        this.targetNodeID = num3;
        this.targetLayoutVersion = num4;
        this.isDegraded = bool;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTemplateId() {
        return this.templateId;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getTemplateSlug() {
        return this.templateSlug;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Integer getRequestedNodeID() {
        return this.requestedNodeID;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Integer getRequestedLayoutVersion() {
        return this.requestedLayoutVersion;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Integer getTargetNodeID() {
        return this.targetNodeID;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Integer getTargetLayoutVersion() {
        return this.targetLayoutVersion;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Boolean getIsDegraded() {
        return this.isDegraded;
    }

    @k
    public final RenderMetadata copy(@k String requestId, int templateId, @k String templateSlug, @l Integer requestedNodeID, @l Integer requestedLayoutVersion, @l Integer targetNodeID, @l Integer targetLayoutVersion, @l Boolean isDegraded) {
        return new RenderMetadata(requestId, templateId, templateSlug, requestedNodeID, requestedLayoutVersion, targetNodeID, targetLayoutVersion, isDegraded);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RenderMetadata)) {
            return false;
        }
        RenderMetadata renderMetadata = (RenderMetadata) other;
        return L.f(this.requestId, renderMetadata.requestId) && this.templateId == renderMetadata.templateId && L.f(this.templateSlug, renderMetadata.templateSlug) && L.f(this.requestedNodeID, renderMetadata.requestedNodeID) && L.f(this.requestedLayoutVersion, renderMetadata.requestedLayoutVersion) && L.f(this.targetNodeID, renderMetadata.targetNodeID) && L.f(this.targetLayoutVersion, renderMetadata.targetLayoutVersion) && L.f(this.isDegraded, renderMetadata.isDegraded);
    }

    @k
    public final String getRequestId() {
        return this.requestId;
    }

    @l
    public final Integer getRequestedLayoutVersion() {
        return this.requestedLayoutVersion;
    }

    @l
    public final Integer getRequestedNodeID() {
        return this.requestedNodeID;
    }

    @l
    public final Integer getTargetLayoutVersion() {
        return this.targetLayoutVersion;
    }

    @l
    public final Integer getTargetNodeID() {
        return this.targetNodeID;
    }

    public final int getTemplateId() {
        return this.templateId;
    }

    @k
    public final String getTemplateSlug() {
        return this.templateSlug;
    }

    public int hashCode() {
        int iD2 = H.d(r.e(this.templateId, this.requestId.hashCode() * 31, 31), 31, this.templateSlug);
        Integer num = this.requestedNodeID;
        int iHashCode = (iD2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.requestedLayoutVersion;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.targetNodeID;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.targetLayoutVersion;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool = this.isDegraded;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    @l
    public final Boolean isDegraded() {
        return this.isDegraded;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RenderMetadata(requestId=");
        sb2.append(this.requestId);
        sb2.append(", templateId=");
        sb2.append(this.templateId);
        sb2.append(", templateSlug=");
        sb2.append(this.templateSlug);
        sb2.append(", requestedNodeID=");
        sb2.append(this.requestedNodeID);
        sb2.append(", requestedLayoutVersion=");
        sb2.append(this.requestedLayoutVersion);
        sb2.append(", targetNodeID=");
        sb2.append(this.targetNodeID);
        sb2.append(", targetLayoutVersion=");
        sb2.append(this.targetLayoutVersion);
        sb2.append(", isDegraded=");
        return C0.g(sb2, this.isDegraded, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.requestId);
        parcel.writeInt(this.templateId);
        parcel.writeString(this.templateSlug);
        Integer num = this.requestedNodeID;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        Integer num2 = this.requestedLayoutVersion;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num2);
        }
        Integer num3 = this.targetNodeID;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num3);
        }
        Integer num4 = this.targetLayoutVersion;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num4);
        }
        Boolean bool = this.isDegraded;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}

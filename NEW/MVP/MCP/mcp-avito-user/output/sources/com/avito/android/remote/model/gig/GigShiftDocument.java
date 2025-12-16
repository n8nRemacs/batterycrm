package com.avito.android.remote.model.gig;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigShifts.kt */
@d
@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJT\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b3\u0010\u000f¨\u00064"}, d2 = {"Lcom/avito/android/remote/model/gig/GigShiftDocument;", "Landroid/os/Parcelable;", "", "title", "description", "Lcom/avito/android/remote/model/gig/Event;", "event", "Lcom/avito/android/remote/model/gig/GigShiftDocumentStatus;", "status", "Lcom/avito/android/remote/model/gig/GigShiftAction;", "action", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/gig/Event;Lcom/avito/android/remote/model/gig/GigShiftDocumentStatus;Lcom/avito/android/remote/model/gig/GigShiftAction;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/gig/Event;", "component4", "()Lcom/avito/android/remote/model/gig/GigShiftDocumentStatus;", "component5", "()Lcom/avito/android/remote/model/gig/GigShiftAction;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/gig/Event;Lcom/avito/android/remote/model/gig/GigShiftDocumentStatus;Lcom/avito/android/remote/model/gig/GigShiftAction;Ljava/lang/String;)Lcom/avito/android/remote/model/gig/GigShiftDocument;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getDescription", "Lcom/avito/android/remote/model/gig/Event;", "getEvent", "Lcom/avito/android/remote/model/gig/GigShiftDocumentStatus;", "getStatus", "Lcom/avito/android/remote/model/gig/GigShiftAction;", "getAction", "getType", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GigShiftDocument implements Parcelable {

    @k
    public static final Parcelable.Creator<GigShiftDocument> CREATOR = new Creator();

    @c("action")
    @l
    private final GigShiftAction action;

    @c("subtitle")
    @l
    private final String description;

    @c("event")
    @l
    private final Event event;

    @c("status")
    @l
    private final GigShiftDocumentStatus status;

    @c("title")
    @k
    private final String title;

    @c("type")
    @k
    private final String type;

    /* compiled from: GigShifts.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GigShiftDocument> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GigShiftDocument createFromParcel(@k Parcel parcel) {
            return new GigShiftDocument(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Event.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GigShiftDocumentStatus.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GigShiftAction.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GigShiftDocument[] newArray(int i12) {
            return new GigShiftDocument[i12];
        }
    }

    public GigShiftDocument(@k String str, @l String str2, @l Event event, @l GigShiftDocumentStatus gigShiftDocumentStatus, @l GigShiftAction gigShiftAction, @k String str3) {
        this.title = str;
        this.description = str2;
        this.event = event;
        this.status = gigShiftDocumentStatus;
        this.action = gigShiftAction;
        this.type = str3;
    }

    public static /* synthetic */ GigShiftDocument copy$default(GigShiftDocument gigShiftDocument, String str, String str2, Event event, GigShiftDocumentStatus gigShiftDocumentStatus, GigShiftAction gigShiftAction, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = gigShiftDocument.title;
        }
        if ((i12 & 2) != 0) {
            str2 = gigShiftDocument.description;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            event = gigShiftDocument.event;
        }
        Event event2 = event;
        if ((i12 & 8) != 0) {
            gigShiftDocumentStatus = gigShiftDocument.status;
        }
        GigShiftDocumentStatus gigShiftDocumentStatus2 = gigShiftDocumentStatus;
        if ((i12 & 16) != 0) {
            gigShiftAction = gigShiftDocument.action;
        }
        GigShiftAction gigShiftAction2 = gigShiftAction;
        if ((i12 & 32) != 0) {
            str3 = gigShiftDocument.type;
        }
        return gigShiftDocument.copy(str, str4, event2, gigShiftDocumentStatus2, gigShiftAction2, str3);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Event getEvent() {
        return this.event;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final GigShiftDocumentStatus getStatus() {
        return this.status;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final GigShiftAction getAction() {
        return this.action;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @k
    public final GigShiftDocument copy(@k String title, @l String description, @l Event event, @l GigShiftDocumentStatus status, @l GigShiftAction action, @k String type) {
        return new GigShiftDocument(title, description, event, status, action, type);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GigShiftDocument)) {
            return false;
        }
        GigShiftDocument gigShiftDocument = (GigShiftDocument) other;
        return L.f(this.title, gigShiftDocument.title) && L.f(this.description, gigShiftDocument.description) && L.f(this.event, gigShiftDocument.event) && this.status == gigShiftDocument.status && L.f(this.action, gigShiftDocument.action) && L.f(this.type, gigShiftDocument.type);
    }

    @l
    public final GigShiftAction getAction() {
        return this.action;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final Event getEvent() {
        return this.event;
    }

    @l
    public final GigShiftDocumentStatus getStatus() {
        return this.status;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @k
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Event event = this.event;
        int iHashCode3 = (iHashCode2 + (event == null ? 0 : event.hashCode())) * 31;
        GigShiftDocumentStatus gigShiftDocumentStatus = this.status;
        int iHashCode4 = (iHashCode3 + (gigShiftDocumentStatus == null ? 0 : gigShiftDocumentStatus.hashCode())) * 31;
        GigShiftAction gigShiftAction = this.action;
        return this.type.hashCode() + ((iHashCode4 + (gigShiftAction != null ? gigShiftAction.hashCode() : 0)) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("GigShiftDocument(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", event=");
        sb2.append(this.event);
        sb2.append(", status=");
        sb2.append(this.status);
        sb2.append(", action=");
        sb2.append(this.action);
        sb2.append(", type=");
        return C22026a.c(sb2, this.type, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        Event event = this.event;
        if (event == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            event.writeToParcel(parcel, flags);
        }
        GigShiftDocumentStatus gigShiftDocumentStatus = this.status;
        if (gigShiftDocumentStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gigShiftDocumentStatus.writeToParcel(parcel, flags);
        }
        GigShiftAction gigShiftAction = this.action;
        if (gigShiftAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gigShiftAction.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.type);
    }
}

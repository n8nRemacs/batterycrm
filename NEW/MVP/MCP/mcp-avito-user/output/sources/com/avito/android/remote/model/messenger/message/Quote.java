package com.avito.android.remote.model.messenger.message;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.component.accordion.s;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Quote.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JD\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010\u001aJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b-\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u0015¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/Quote;", "Landroid/os/Parcelable;", "", "id", "Lcom/avito/android/remote/model/messenger/message/MessageBody;", "body", "", "created", "fromId", "", "chunkIndex", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/messenger/message/MessageBody;JLjava/lang/String;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/messenger/message/MessageBody;", "component3", "()J", "component4", "component5", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/messenger/message/MessageBody;JLjava/lang/String;Ljava/lang/Integer;)Lcom/avito/android/remote/model/messenger/message/Quote;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/remote/model/messenger/message/MessageBody;", "getBody", "J", "getCreated", "getFromId", "Ljava/lang/Integer;", "getChunkIndex", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Quote implements Parcelable {

    @k
    public static final Parcelable.Creator<Quote> CREATOR = new Creator();

    @k
    private final MessageBody body;

    @l
    private final Integer chunkIndex;
    private final long created;

    @k
    private final String fromId;

    @k
    private final String id;

    /* compiled from: Quote.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Quote> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Quote createFromParcel(@k Parcel parcel) {
            return new Quote(parcel.readString(), (MessageBody) parcel.readParcelable(Quote.class.getClassLoader()), parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Quote[] newArray(int i12) {
            return new Quote[i12];
        }
    }

    public Quote(@k String str, @k MessageBody messageBody, long j12, @k String str2, @l Integer num) {
        this.id = str;
        this.body = messageBody;
        this.created = j12;
        this.fromId = str2;
        this.chunkIndex = num;
    }

    public static /* synthetic */ Quote copy$default(Quote quote, String str, MessageBody messageBody, long j12, String str2, Integer num, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = quote.id;
        }
        if ((i12 & 2) != 0) {
            messageBody = quote.body;
        }
        MessageBody messageBody2 = messageBody;
        if ((i12 & 4) != 0) {
            j12 = quote.created;
        }
        long j13 = j12;
        if ((i12 & 8) != 0) {
            str2 = quote.fromId;
        }
        String str3 = str2;
        if ((i12 & 16) != 0) {
            num = quote.chunkIndex;
        }
        return quote.copy(str, messageBody2, j13, str3, num);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final MessageBody getBody() {
        return this.body;
    }

    /* renamed from: component3, reason: from getter */
    public final long getCreated() {
        return this.created;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getFromId() {
        return this.fromId;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Integer getChunkIndex() {
        return this.chunkIndex;
    }

    @k
    public final Quote copy(@k String id2, @k MessageBody body, long created, @k String fromId, @l Integer chunkIndex) {
        return new Quote(id2, body, created, fromId, chunkIndex);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Quote)) {
            return false;
        }
        Quote quote = (Quote) other;
        return L.f(this.id, quote.id) && L.f(this.body, quote.body) && this.created == quote.created && L.f(this.fromId, quote.fromId) && L.f(this.chunkIndex, quote.chunkIndex);
    }

    @k
    public final MessageBody getBody() {
        return this.body;
    }

    @l
    public final Integer getChunkIndex() {
        return this.chunkIndex;
    }

    public final long getCreated() {
        return this.created;
    }

    @k
    public final String getFromId() {
        return this.fromId;
    }

    @k
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iD2 = H.d(r.g((this.body.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.created), 31, this.fromId);
        Integer num = this.chunkIndex;
        return iD2 + (num == null ? 0 : num.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Quote(id=");
        sb2.append(this.id);
        sb2.append(", body=");
        sb2.append(this.body);
        sb2.append(", created=");
        sb2.append(this.created);
        sb2.append(", fromId=");
        sb2.append(this.fromId);
        sb2.append(", chunkIndex=");
        return s.j(sb2, this.chunkIndex, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.body, flags);
        parcel.writeLong(this.created);
        parcel.writeString(this.fromId);
        Integer num = this.chunkIndex;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
    }
}

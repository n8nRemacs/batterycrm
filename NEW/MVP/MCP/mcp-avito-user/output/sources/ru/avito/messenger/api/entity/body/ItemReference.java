package ru.avito.messenger.api.entity.body;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ItemReference.kt */
@d
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\u000b\u0010\n¨\u0006\r"}, d2 = {"Lru/avito/messenger/api/entity/body/ItemReference;", "Lru/avito/messenger/api/entity/body/MessageBody;", "LV81/a;", "", "itemId", com.avito.android.remote.model.messenger.message.MessageBody.RANDOM_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getItemId", "()Ljava/lang/String;", "getRandomId", "a", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ItemReference implements MessageBody, V81.a {

    @k
    public static final Parcelable.Creator<ItemReference> CREATOR;

    @c("itemId")
    @k
    private final String itemId;

    @c(com.avito.android.remote.model.messenger.message.MessageBody.RANDOM_ID)
    @l
    private final String randomId;

    /* compiled from: ItemReference.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/avito/messenger/api/entity/body/ItemReference$a;", "", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ItemReference.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ItemReference> {
        @Override // android.os.Parcelable.Creator
        public final ItemReference createFromParcel(Parcel parcel) {
            return new ItemReference(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ItemReference[] newArray(int i12) {
            return new ItemReference[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public ItemReference(@k String str, @l String str2) {
        this.itemId = str;
        this.randomId = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemReference)) {
            return false;
        }
        ItemReference itemReference = (ItemReference) obj;
        return L.f(this.itemId, itemReference.itemId) && L.f(this.randomId, itemReference.randomId);
    }

    @k
    public final String getItemId() {
        return this.itemId;
    }

    @Override // V81.a
    @l
    public final String getRandomId() {
        return this.randomId;
    }

    public final int hashCode() {
        int iHashCode = this.itemId.hashCode() * 31;
        String str = this.randomId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemReference(itemId=");
        sb2.append(this.itemId);
        sb2.append(", randomId=");
        return C22026a.c(sb2, this.randomId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.itemId);
        parcel.writeString(this.randomId);
    }
}

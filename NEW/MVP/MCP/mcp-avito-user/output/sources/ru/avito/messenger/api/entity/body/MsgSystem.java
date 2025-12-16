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

/* compiled from: MsgSystem.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\f"}, d2 = {"Lru/avito/messenger/api/entity/body/MsgSystem;", "Lru/avito/messenger/api/entity/body/MessageBody;", "", "text", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "getPayload", "a", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class MsgSystem implements MessageBody {

    @k
    public static final Parcelable.Creator<MsgSystem> CREATOR;

    @c("payload")
    @l
    private final String payload;

    @c("text")
    @k
    private final String text;

    /* compiled from: MsgSystem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/avito/messenger/api/entity/body/MsgSystem$a;", "", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: MsgSystem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<MsgSystem> {
        @Override // android.os.Parcelable.Creator
        public final MsgSystem createFromParcel(Parcel parcel) {
            return new MsgSystem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MsgSystem[] newArray(int i12) {
            return new MsgSystem[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public MsgSystem(@k String str, @l String str2) {
        this.text = str;
        this.payload = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MsgSystem)) {
            return false;
        }
        MsgSystem msgSystem = (MsgSystem) obj;
        return L.f(this.text, msgSystem.text) && L.f(this.payload, msgSystem.payload);
    }

    public final int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        String str = this.payload;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MsgSystem(text=");
        sb2.append(this.text);
        sb2.append(", payload=");
        return C22026a.c(sb2, this.payload, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.text);
        parcel.writeString(this.payload);
    }
}

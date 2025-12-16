package ru.avito.messenger;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import ru.avito.messenger.MessengerUserType;

/* compiled from: MessengerUserInfo.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", "Lru/avito/messenger/n0;", "Landroid/os/Parcelable;", "a", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class MessengerUserHashInfo implements n0, Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f430680b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final MessengerUserType f430681c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f430682d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f430678e = new a(null);

    @Y61.k
    public static final Parcelable.Creator<MessengerUserHashInfo> CREATOR = new b();

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final MessengerUserHashInfo f430679f = new MessengerUserHashInfo("", MessengerUserType.Default.f430683b);

    /* compiled from: MessengerUserInfo.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo$a;", "", "<init>", "()V", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: MessengerUserInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<MessengerUserHashInfo> {
        @Override // android.os.Parcelable.Creator
        public final MessengerUserHashInfo createFromParcel(Parcel parcel) {
            return new MessengerUserHashInfo(parcel.readString(), (MessengerUserType) parcel.readParcelable(MessengerUserHashInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MessengerUserHashInfo[] newArray(int i12) {
            return new MessengerUserHashInfo[i12];
        }
    }

    public MessengerUserHashInfo(@Y61.k String str, @Y61.k MessengerUserType messengerUserType) {
        this.f430680b = str;
        this.f430681c = messengerUserType;
        if (str != null && str.length() != 0 && !(messengerUserType instanceof MessengerUserType.Default) && !(messengerUserType instanceof MessengerUserType.Employee.Personal)) {
            if (!(messengerUserType instanceof MessengerUserType.Employee.Company)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((MessengerUserType.Employee.Company) messengerUserType).f430684b;
        }
        this.f430682d = str;
    }

    @Override // ru.avito.messenger.n0
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getF430682d() {
        return this.f430682d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // ru.avito.messenger.n0
    @Y61.k
    public final MessengerUserType e() {
        throw null;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessengerUserHashInfo)) {
            return false;
        }
        MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) obj;
        return kotlin.jvm.internal.L.f(this.f430680b, messengerUserHashInfo.f430680b) && kotlin.jvm.internal.L.f(this.f430681c, messengerUserHashInfo.f430681c);
    }

    public final int hashCode() {
        return this.f430681c.hashCode() + (this.f430680b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "MessengerUserHashInfo(accountHashId=" + this.f430680b + ", userType=" + this.f430681c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f430680b);
        parcel.writeParcelable(this.f430681c, i12);
    }
}

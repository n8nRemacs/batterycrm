package com.avito.android.messenger.conversation;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.messenger.channels.analytics.MessengerStatsdEventFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ChannelActivityArguments.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelActivityArguments;", "Landroid/os/Parcelable;", "Create", "Open", "PerformanceParams", "Lcom/avito/android/messenger/conversation/ChannelActivityArguments$Create;", "Lcom/avito/android/messenger/conversation/ChannelActivityArguments$Open;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ChannelActivityArguments extends Parcelable {

    /* compiled from: ChannelActivityArguments.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelActivityArguments$PerformanceParams;", "Landroid/os/Parcelable;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class PerformanceParams implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<PerformanceParams> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Long f188906b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final MessengerStatsdEventFactory.Companion.ChannelType f188907c;

        /* compiled from: ChannelActivityArguments.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PerformanceParams> {
            @Override // android.os.Parcelable.Creator
            public final PerformanceParams createFromParcel(Parcel parcel) {
                return new PerformanceParams(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? MessengerStatsdEventFactory.Companion.ChannelType.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final PerformanceParams[] newArray(int i12) {
                return new PerformanceParams[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PerformanceParams() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PerformanceParams)) {
                return false;
            }
            PerformanceParams performanceParams = (PerformanceParams) obj;
            return kotlin.jvm.internal.L.f(this.f188906b, performanceParams.f188906b) && this.f188907c == performanceParams.f188907c;
        }

        public final int hashCode() {
            Long l12 = this.f188906b;
            int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
            MessengerStatsdEventFactory.Companion.ChannelType channelType = this.f188907c;
            return iHashCode + (channelType != null ? channelType.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "PerformanceParams(initActionTimestamp=" + this.f188906b + ", channelType=" + this.f188907c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            Long l12 = this.f188906b;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                com.akita.compose.theme.re23.style.C0.m(parcel, 1, l12);
            }
            MessengerStatsdEventFactory.Companion.ChannelType channelType = this.f188907c;
            if (channelType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                channelType.writeToParcel(parcel, i12);
            }
        }

        public PerformanceParams(@Y61.l Long l12, @Y61.l MessengerStatsdEventFactory.Companion.ChannelType channelType) {
            this.f188906b = l12;
            this.f188907c = channelType;
        }

        public /* synthetic */ PerformanceParams(Long l12, MessengerStatsdEventFactory.Companion.ChannelType channelType, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : l12, (i12 & 2) != 0 ? null : channelType);
        }
    }

    /* compiled from: ChannelActivityArguments.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelActivityArguments$Create;", "Lcom/avito/android/messenger/conversation/ChannelActivityArguments;", "ByItem", "ByOpponentUser", "WithAvito", "Lcom/avito/android/messenger/conversation/ChannelActivityArguments$Create$ByItem;", "Lcom/avito/android/messenger/conversation/ChannelActivityArguments$Create$ByOpponentUser;", "Lcom/avito/android/messenger/conversation/ChannelActivityArguments$Create$WithAvito;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Create extends ChannelActivityArguments {
        @Y61.l
        /* renamed from: R2 */
        Long getF188896e();

        /* compiled from: ChannelActivityArguments.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelActivityArguments$Create$ByOpponentUser;", "Lcom/avito/android/messenger/conversation/ChannelActivityArguments$Create;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class ByOpponentUser implements Create {

            @Y61.k
            public static final Parcelable.Creator<ByOpponentUser> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f188890b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f188891c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final Long f188892d;

            /* compiled from: ChannelActivityArguments.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ByOpponentUser> {
                @Override // android.os.Parcelable.Creator
                public final ByOpponentUser createFromParcel(Parcel parcel) {
                    return new ByOpponentUser(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
                }

                @Override // android.os.Parcelable.Creator
                public final ByOpponentUser[] newArray(int i12) {
                    return new ByOpponentUser[i12];
                }
            }

            public ByOpponentUser(@Y61.k String str, @Y61.l String str2, @Y61.l Long l12) {
                this.f188890b = str;
                this.f188891c = str2;
                this.f188892d = l12;
            }

            @Override // com.avito.android.messenger.conversation.ChannelActivityArguments.Create
            @Y61.l
            /* renamed from: R2, reason: from getter */
            public final Long getF188896e() {
                return this.f188892d;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ByOpponentUser)) {
                    return false;
                }
                ByOpponentUser byOpponentUser = (ByOpponentUser) obj;
                return kotlin.jvm.internal.L.f(this.f188890b, byOpponentUser.f188890b) && kotlin.jvm.internal.L.f(this.f188891c, byOpponentUser.f188891c) && kotlin.jvm.internal.L.f(this.f188892d, byOpponentUser.f188892d);
            }

            public final int hashCode() {
                int iHashCode = this.f188890b.hashCode() * 31;
                String str = this.f188891c;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                Long l12 = this.f188892d;
                return iHashCode2 + (l12 != null ? l12.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ByOpponentUser(opponentId=");
                sb2.append(this.f188890b);
                sb2.append(", messageDraft=");
                sb2.append(this.f188891c);
                sb2.append(", initActionTimestamp=");
                return androidx.media3.exoplayer.analytics.m.m(sb2, this.f188892d, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f188890b);
                parcel.writeString(this.f188891c);
                Long l12 = this.f188892d;
                if (l12 == null) {
                    parcel.writeInt(0);
                } else {
                    com.akita.compose.theme.re23.style.C0.m(parcel, 1, l12);
                }
            }

            public /* synthetic */ ByOpponentUser(String str, String str2, Long l12, int i12, C42822w c42822w) {
                this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : l12);
            }
        }

        /* compiled from: ChannelActivityArguments.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelActivityArguments$Create$WithAvito;", "Lcom/avito/android/messenger/conversation/ChannelActivityArguments$Create;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class WithAvito implements Create {

            @Y61.k
            public static final Parcelable.Creator<WithAvito> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final String f188893b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f188894c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final String f188895d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.l
            public final Long f188896e;

            /* compiled from: ChannelActivityArguments.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<WithAvito> {
                @Override // android.os.Parcelable.Creator
                public final WithAvito createFromParcel(Parcel parcel) {
                    return new WithAvito(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
                }

                @Override // android.os.Parcelable.Creator
                public final WithAvito[] newArray(int i12) {
                    return new WithAvito[i12];
                }
            }

            public WithAvito(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l Long l12) {
                this.f188893b = str;
                this.f188894c = str2;
                this.f188895d = str3;
                this.f188896e = l12;
            }

            @Override // com.avito.android.messenger.conversation.ChannelActivityArguments.Create
            @Y61.l
            /* renamed from: R2, reason: from getter */
            public final Long getF188896e() {
                return this.f188896e;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof WithAvito)) {
                    return false;
                }
                WithAvito withAvito = (WithAvito) obj;
                return kotlin.jvm.internal.L.f(this.f188893b, withAvito.f188893b) && kotlin.jvm.internal.L.f(this.f188894c, withAvito.f188894c) && kotlin.jvm.internal.L.f(this.f188895d, withAvito.f188895d) && kotlin.jvm.internal.L.f(this.f188896e, withAvito.f188896e);
            }

            public final int hashCode() {
                String str = this.f188893b;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f188894c;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f188895d;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Long l12 = this.f188896e;
                return iHashCode3 + (l12 != null ? l12.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("WithAvito(source=");
                sb2.append(this.f188893b);
                sb2.append(", extra=");
                sb2.append(this.f188894c);
                sb2.append(", avitoUserId=");
                sb2.append(this.f188895d);
                sb2.append(", initActionTimestamp=");
                return androidx.media3.exoplayer.analytics.m.m(sb2, this.f188896e, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f188893b);
                parcel.writeString(this.f188894c);
                parcel.writeString(this.f188895d);
                Long l12 = this.f188896e;
                if (l12 == null) {
                    parcel.writeInt(0);
                } else {
                    com.akita.compose.theme.re23.style.C0.m(parcel, 1, l12);
                }
            }

            public /* synthetic */ WithAvito(String str, String str2, String str3, Long l12, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : str, str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : l12);
            }
        }

        /* compiled from: ChannelActivityArguments.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelActivityArguments$Create$ByItem;", "Lcom/avito/android/messenger/conversation/ChannelActivityArguments$Create;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class ByItem implements Create {

            @Y61.k
            public static final Parcelable.Creator<ByItem> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f188883b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f188884c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final String f188885d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f188886e;

            /* renamed from: f, reason: collision with root package name */
            @Y61.l
            public final String f188887f;

            /* renamed from: g, reason: collision with root package name */
            @Y61.l
            public final String f188888g;

            /* renamed from: h, reason: collision with root package name */
            @Y61.l
            public final Long f188889h;

            /* compiled from: ChannelActivityArguments.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ByItem> {
                @Override // android.os.Parcelable.Creator
                public final ByItem createFromParcel(Parcel parcel) {
                    return new ByItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
                }

                @Override // android.os.Parcelable.Creator
                public final ByItem[] newArray(int i12) {
                    return new ByItem[i12];
                }
            }

            public ByItem(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, boolean z12, @Y61.l String str4, @Y61.l String str5, @Y61.l Long l12) {
                this.f188883b = str;
                this.f188884c = str2;
                this.f188885d = str3;
                this.f188886e = z12;
                this.f188887f = str4;
                this.f188888g = str5;
                this.f188889h = l12;
            }

            @Override // com.avito.android.messenger.conversation.ChannelActivityArguments.Create
            @Y61.l
            /* renamed from: R2, reason: from getter */
            public final Long getF188896e() {
                return this.f188889h;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ByItem)) {
                    return false;
                }
                ByItem byItem = (ByItem) obj;
                return kotlin.jvm.internal.L.f(this.f188883b, byItem.f188883b) && kotlin.jvm.internal.L.f(this.f188884c, byItem.f188884c) && kotlin.jvm.internal.L.f(this.f188885d, byItem.f188885d) && this.f188886e == byItem.f188886e && kotlin.jvm.internal.L.f(this.f188887f, byItem.f188887f) && kotlin.jvm.internal.L.f(this.f188888g, byItem.f188888g) && kotlin.jvm.internal.L.f(this.f188889h, byItem.f188889h);
            }

            public final int hashCode() {
                int iHashCode = this.f188883b.hashCode() * 31;
                String str = this.f188884c;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f188885d;
                int i12 = androidx.appcompat.app.r.i((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f188886e);
                String str3 = this.f188887f;
                int iHashCode3 = (i12 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f188888g;
                int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                Long l12 = this.f188889h;
                return iHashCode4 + (l12 != null ? l12.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ByItem(itemId=");
                sb2.append(this.f188883b);
                sb2.append(", messageDraft=");
                sb2.append(this.f188884c);
                sb2.append(", source=");
                sb2.append(this.f188885d);
                sb2.append(", sendDraftMessageImmediately=");
                sb2.append(this.f188886e);
                sb2.append(", extra=");
                sb2.append(this.f188887f);
                sb2.append(", xHash=");
                sb2.append(this.f188888g);
                sb2.append(", initActionTimestamp=");
                return androidx.media3.exoplayer.analytics.m.m(sb2, this.f188889h, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f188883b);
                parcel.writeString(this.f188884c);
                parcel.writeString(this.f188885d);
                parcel.writeInt(this.f188886e ? 1 : 0);
                parcel.writeString(this.f188887f);
                parcel.writeString(this.f188888g);
                Long l12 = this.f188889h;
                if (l12 == null) {
                    parcel.writeInt(0);
                } else {
                    com.akita.compose.theme.re23.style.C0.m(parcel, 1, l12);
                }
            }

            public /* synthetic */ ByItem(String str, String str2, String str3, boolean z12, String str4, String str5, Long l12, int i12, C42822w c42822w) {
                this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? false : z12, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? null : str5, (i12 & 64) == 0 ? l12 : null);
            }
        }
    }

    /* compiled from: ChannelActivityArguments.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelActivityArguments$Open;", "Lcom/avito/android/messenger/conversation/ChannelActivityArguments;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Open implements ChannelActivityArguments {

        @Y61.k
        public static final Parcelable.Creator<Open> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f188897b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Integer f188898c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f188899d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f188900e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f188901f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f188902g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final String f188903h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final String f188904i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final PerformanceParams f188905j;

        /* compiled from: ChannelActivityArguments.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Open> {
            @Override // android.os.Parcelable.Creator
            public final Open createFromParcel(Parcel parcel) {
                return new Open(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? PerformanceParams.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Open[] newArray(int i12) {
                return new Open[i12];
            }
        }

        public Open(@Y61.k String str, @Y61.l Integer num, @Y61.l String str2, @Y61.l String str3, boolean z12, boolean z13, @Y61.l String str4, @Y61.l String str5, @Y61.l PerformanceParams performanceParams) {
            this.f188897b = str;
            this.f188898c = num;
            this.f188899d = str2;
            this.f188900e = str3;
            this.f188901f = z12;
            this.f188902g = z13;
            this.f188903h = str4;
            this.f188904i = str5;
            this.f188905j = performanceParams;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Open)) {
                return false;
            }
            Open open = (Open) obj;
            return kotlin.jvm.internal.L.f(this.f188897b, open.f188897b) && kotlin.jvm.internal.L.f(this.f188898c, open.f188898c) && kotlin.jvm.internal.L.f(this.f188899d, open.f188899d) && kotlin.jvm.internal.L.f(this.f188900e, open.f188900e) && this.f188901f == open.f188901f && this.f188902g == open.f188902g && kotlin.jvm.internal.L.f(this.f188903h, open.f188903h) && kotlin.jvm.internal.L.f(this.f188904i, open.f188904i) && kotlin.jvm.internal.L.f(this.f188905j, open.f188905j);
        }

        public final int hashCode() {
            int iHashCode = this.f188897b.hashCode() * 31;
            Integer num = this.f188898c;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f188899d;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f188900e;
            int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f188901f), 31, this.f188902g);
            String str3 = this.f188903h;
            int iHashCode4 = (i12 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f188904i;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            PerformanceParams performanceParams = this.f188905j;
            return iHashCode5 + (performanceParams != null ? performanceParams.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "Open(channelId=" + this.f188897b + ", numberInList=" + this.f188898c + ", messageId=" + this.f188899d + ", searchQuery=" + this.f188900e + ", backWorksAsUp=" + this.f188901f + ", sendDraftMessageImmediately=" + this.f188902g + ", xHash=" + this.f188903h + ", flowId=" + this.f188904i + ", performanceParams=" + this.f188905j + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f188897b);
            Integer num = this.f188898c;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            parcel.writeString(this.f188899d);
            parcel.writeString(this.f188900e);
            parcel.writeInt(this.f188901f ? 1 : 0);
            parcel.writeInt(this.f188902g ? 1 : 0);
            parcel.writeString(this.f188903h);
            parcel.writeString(this.f188904i);
            PerformanceParams performanceParams = this.f188905j;
            if (performanceParams == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                performanceParams.writeToParcel(parcel, i12);
            }
        }

        public /* synthetic */ Open(String str, Integer num, String str2, String str3, boolean z12, boolean z13, String str4, String str5, PerformanceParams performanceParams, int i12, C42822w c42822w) {
            this(str, num, str2, str3, (i12 & 16) != 0 ? false : z12, (i12 & 32) != 0 ? false : z13, (i12 & 64) != 0 ? null : str4, (i12 & 128) != 0 ? null : str5, (i12 & 256) != 0 ? null : performanceParams);
        }
    }
}

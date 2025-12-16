package com.avito.android.remote.model.messenger.message;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import okhttp3.internal.http2.Http2;

/* compiled from: LocalMessage.kt */
@d
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001cBµ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010%\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001dJ\u0010\u0010-\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b-\u0010(J\u0012\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b.\u0010+J\u0012\u0010/\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010\u001dJ\u0010\u00102\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b4\u0010\u001dJ\u0012\u00105\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b5\u0010+JÒ\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0011\u001a\u00020\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00109\u001a\u000208HÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010=\u001a\u00020\f2\b\u0010<\u001a\u0004\u0018\u00010;HÖ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u000208HÖ\u0001¢\u0006\u0004\b?\u0010:J \u0010D\u001a\u00020C2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u000208HÖ\u0001¢\u0006\u0004\bD\u0010ER\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010F\u001a\u0004\bG\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010F\u001a\u0004\bH\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\bI\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010J\u001a\u0004\bK\u0010\"R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010F\u001a\u0004\bL\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010F\u001a\u0004\bM\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010N\u001a\u0004\bO\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010P\u001a\u0004\b\r\u0010(R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010P\u001a\u0004\b\u000e\u0010(R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010Q\u001a\u0004\bR\u0010+R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010F\u001a\u0004\bS\u0010\u001dR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010P\u001a\u0004\b\u0011\u0010(R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010Q\u001a\u0004\bT\u0010+R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010U\u001a\u0004\bV\u00100R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010F\u001a\u0004\bW\u0010\u001dR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010X\u001a\u0004\bY\u00103R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010F\u001a\u0004\bZ\u0010\u001dR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010Q\u001a\u0004\b[\u0010+R\u001d\u0010]\u001a\u00020\\8\u0006¢\u0006\u0012\n\u0004\b]\u0010^\u0012\u0004\ba\u0010b\u001a\u0004\b_\u0010`¨\u0006d"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "Landroid/os/Parcelable;", "", "localId", "remoteId", "channelId", "Lcom/avito/android/remote/model/messenger/message/MessageBody;", "body", ChannelContext.Item.USER_ID, "fromId", "", "created", "", "isRead", "isFailed", "readTimestamp", MessageSuggest.PREVIEW, "isSupported", "readLocallyTimestamp", "Lcom/avito/android/remote/model/messenger/message/Quote;", "quote", "xHash", "Lcom/avito/android/remote/model/messenger/message/LocalMessage$Type;", "userType", "accountId", "sendTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/messenger/message/MessageBody;Ljava/lang/String;Ljava/lang/String;JZZLjava/lang/Long;Ljava/lang/String;ZLjava/lang/Long;Lcom/avito/android/remote/model/messenger/message/Quote;Ljava/lang/String;Lcom/avito/android/remote/model/messenger/message/LocalMessage$Type;Ljava/lang/String;Ljava/lang/Long;)V", "toString", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/messenger/message/MessageBody;", "component5", "component6", "component7", "()J", "component8", "()Z", "component9", "component10", "()Ljava/lang/Long;", "component11", "component12", "component13", "component14", "()Lcom/avito/android/remote/model/messenger/message/Quote;", "component15", "component16", "()Lcom/avito/android/remote/model/messenger/message/LocalMessage$Type;", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/messenger/message/MessageBody;Ljava/lang/String;Ljava/lang/String;JZZLjava/lang/Long;Ljava/lang/String;ZLjava/lang/Long;Lcom/avito/android/remote/model/messenger/message/Quote;Ljava/lang/String;Lcom/avito/android/remote/model/messenger/message/LocalMessage$Type;Ljava/lang/String;Ljava/lang/Long;)Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLocalId", "getRemoteId", "getChannelId", "Lcom/avito/android/remote/model/messenger/message/MessageBody;", "getBody", "getUserId", "getFromId", "J", "getCreated", "Z", "Ljava/lang/Long;", "getReadTimestamp", "getPreview", "getReadLocallyTimestamp", "Lcom/avito/android/remote/model/messenger/message/Quote;", "getQuote", "getXHash", "Lcom/avito/android/remote/model/messenger/message/LocalMessage$Type;", "getUserType", "getAccountId", "getSendTimestamp", "Lcom/avito/android/remote/model/messenger/message/StatusCode;", "deliveryStatus", "Lcom/avito/android/remote/model/messenger/message/StatusCode;", "getDeliveryStatus", "()Lcom/avito/android/remote/model/messenger/message/StatusCode;", "getDeliveryStatus$annotations", "()V", "Type", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class LocalMessage implements Parcelable {

    @k
    public static final Parcelable.Creator<LocalMessage> CREATOR = new Creator();

    @k
    private final String accountId;

    @k
    private final MessageBody body;

    @k
    private final String channelId;
    private final long created;

    @k
    private final StatusCode deliveryStatus;

    @k
    private final String fromId;
    private final boolean isFailed;
    private final boolean isRead;
    private final boolean isSupported;

    @k
    private final String localId;

    @l
    private final String preview;

    @l
    private final Quote quote;

    @l
    private final Long readLocallyTimestamp;

    @l
    private final Long readTimestamp;

    @l
    private final String remoteId;

    @l
    private final Long sendTimestamp;

    @k
    private final String userId;

    @k
    private final Type userType;

    @l
    private final String xHash;

    /* compiled from: LocalMessage.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LocalMessage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final LocalMessage createFromParcel(@k Parcel parcel) {
            return new LocalMessage(parcel.readString(), parcel.readString(), parcel.readString(), (MessageBody) parcel.readParcelable(LocalMessage.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Quote.CREATOR.createFromParcel(parcel), parcel.readString(), (Type) parcel.readParcelable(LocalMessage.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final LocalMessage[] newArray(int i12) {
            return new LocalMessage[i12];
        }
    }

    /* compiled from: LocalMessage.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/LocalMessage$Type;", "Landroid/os/Parcelable;", "Default", "EmployeeCompany", "EmployeePersonal", "Lcom/avito/android/remote/model/messenger/message/LocalMessage$Type$Default;", "Lcom/avito/android/remote/model/messenger/message/LocalMessage$Type$EmployeeCompany;", "Lcom/avito/android/remote/model/messenger/message/LocalMessage$Type$EmployeePersonal;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Type extends Parcelable {

        /* compiled from: LocalMessage.kt */
        @d
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/LocalMessage$Type$Default;", "Lcom/avito/android/remote/model/messenger/message/LocalMessage$Type;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Default implements Type {

            @k
            public static final Default INSTANCE = new Default();

            @k
            public static final Parcelable.Creator<Default> CREATOR = new Creator();

            /* compiled from: LocalMessage.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Default> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Default createFromParcel(@k Parcel parcel) {
                    parcel.readInt();
                    return Default.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Default[] newArray(int i12) {
                    return new Default[i12];
                }
            }

            private Default() {
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                return this == other || (other instanceof Default);
            }

            public int hashCode() {
                return 1954806075;
            }

            @k
            public String toString() {
                return "Default";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: LocalMessage.kt */
        @d
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/LocalMessage$Type$EmployeeCompany;", "Lcom/avito/android/remote/model/messenger/message/LocalMessage$Type;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class EmployeeCompany implements Type {

            @k
            public static final EmployeeCompany INSTANCE = new EmployeeCompany();

            @k
            public static final Parcelable.Creator<EmployeeCompany> CREATOR = new Creator();

            /* compiled from: LocalMessage.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<EmployeeCompany> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final EmployeeCompany createFromParcel(@k Parcel parcel) {
                    parcel.readInt();
                    return EmployeeCompany.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final EmployeeCompany[] newArray(int i12) {
                    return new EmployeeCompany[i12];
                }
            }

            private EmployeeCompany() {
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                return this == other || (other instanceof EmployeeCompany);
            }

            public int hashCode() {
                return -572705047;
            }

            @k
            public String toString() {
                return "EmployeeCompany";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: LocalMessage.kt */
        @d
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/LocalMessage$Type$EmployeePersonal;", "Lcom/avito/android/remote/model/messenger/message/LocalMessage$Type;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class EmployeePersonal implements Type {

            @k
            public static final EmployeePersonal INSTANCE = new EmployeePersonal();

            @k
            public static final Parcelable.Creator<EmployeePersonal> CREATOR = new Creator();

            /* compiled from: LocalMessage.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<EmployeePersonal> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final EmployeePersonal createFromParcel(@k Parcel parcel) {
                    parcel.readInt();
                    return EmployeePersonal.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final EmployeePersonal[] newArray(int i12) {
                    return new EmployeePersonal[i12];
                }
            }

            private EmployeePersonal() {
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                return this == other || (other instanceof EmployeePersonal);
            }

            public int hashCode() {
                return 468941140;
            }

            @k
            public String toString() {
                return "EmployeePersonal";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeInt(1);
            }
        }
    }

    public LocalMessage(@k String str, @l String str2, @k String str3, @k MessageBody messageBody, @k String str4, @k String str5, long j12, boolean z12, boolean z13, @l Long l12, @l String str6, boolean z14, @l Long l13, @l Quote quote, @l String str7, @k Type type, @k String str8, @l Long l14) {
        this.localId = str;
        this.remoteId = str2;
        this.channelId = str3;
        this.body = messageBody;
        this.userId = str4;
        this.fromId = str5;
        this.created = j12;
        this.isRead = z12;
        this.isFailed = z13;
        this.readTimestamp = l12;
        this.preview = str6;
        this.isSupported = z14;
        this.readLocallyTimestamp = l13;
        this.quote = quote;
        this.xHash = str7;
        this.userType = type;
        this.accountId = str8;
        this.sendTimestamp = l14;
        this.deliveryStatus = (str2 != null || z13) ? (str2 == null && z13) ? StatusCode.ERROR : l12 != null ? StatusCode.READ : StatusCode.SENT : StatusCode.SENDING;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getLocalId() {
        return this.localId;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final Long getReadTimestamp() {
        return this.readTimestamp;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final String getPreview() {
        return this.preview;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsSupported() {
        return this.isSupported;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final Long getReadLocallyTimestamp() {
        return this.readLocallyTimestamp;
    }

    @l
    /* renamed from: component14, reason: from getter */
    public final Quote getQuote() {
        return this.quote;
    }

    @l
    /* renamed from: component15, reason: from getter */
    public final String getXHash() {
        return this.xHash;
    }

    @k
    /* renamed from: component16, reason: from getter */
    public final Type getUserType() {
        return this.userType;
    }

    @k
    /* renamed from: component17, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    @l
    /* renamed from: component18, reason: from getter */
    public final Long getSendTimestamp() {
        return this.sendTimestamp;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getRemoteId() {
        return this.remoteId;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final MessageBody getBody() {
        return this.body;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final String getFromId() {
        return this.fromId;
    }

    /* renamed from: component7, reason: from getter */
    public final long getCreated() {
        return this.created;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsRead() {
        return this.isRead;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsFailed() {
        return this.isFailed;
    }

    @k
    public final LocalMessage copy(@k String localId, @l String remoteId, @k String channelId, @k MessageBody body, @k String userId, @k String fromId, long created, boolean isRead, boolean isFailed, @l Long readTimestamp, @l String preview, boolean isSupported, @l Long readLocallyTimestamp, @l Quote quote, @l String xHash, @k Type userType, @k String accountId, @l Long sendTimestamp) {
        return new LocalMessage(localId, remoteId, channelId, body, userId, fromId, created, isRead, isFailed, readTimestamp, preview, isSupported, readLocallyTimestamp, quote, xHash, userType, accountId, sendTimestamp);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalMessage)) {
            return false;
        }
        LocalMessage localMessage = (LocalMessage) other;
        return L.f(this.localId, localMessage.localId) && L.f(this.remoteId, localMessage.remoteId) && L.f(this.channelId, localMessage.channelId) && L.f(this.body, localMessage.body) && L.f(this.userId, localMessage.userId) && L.f(this.fromId, localMessage.fromId) && this.created == localMessage.created && this.isRead == localMessage.isRead && this.isFailed == localMessage.isFailed && L.f(this.readTimestamp, localMessage.readTimestamp) && L.f(this.preview, localMessage.preview) && this.isSupported == localMessage.isSupported && L.f(this.readLocallyTimestamp, localMessage.readLocallyTimestamp) && L.f(this.quote, localMessage.quote) && L.f(this.xHash, localMessage.xHash) && L.f(this.userType, localMessage.userType) && L.f(this.accountId, localMessage.accountId) && L.f(this.sendTimestamp, localMessage.sendTimestamp);
    }

    @k
    public final String getAccountId() {
        return this.accountId;
    }

    @k
    public final MessageBody getBody() {
        return this.body;
    }

    @k
    public final String getChannelId() {
        return this.channelId;
    }

    public final long getCreated() {
        return this.created;
    }

    @k
    public final StatusCode getDeliveryStatus() {
        return this.deliveryStatus;
    }

    @k
    public final String getFromId() {
        return this.fromId;
    }

    @k
    public final String getLocalId() {
        return this.localId;
    }

    @l
    public final String getPreview() {
        return this.preview;
    }

    @l
    public final Quote getQuote() {
        return this.quote;
    }

    @l
    public final Long getReadLocallyTimestamp() {
        return this.readLocallyTimestamp;
    }

    @l
    public final Long getReadTimestamp() {
        return this.readTimestamp;
    }

    @l
    public final String getRemoteId() {
        return this.remoteId;
    }

    @l
    public final Long getSendTimestamp() {
        return this.sendTimestamp;
    }

    @k
    public final String getUserId() {
        return this.userId;
    }

    @k
    public final Type getUserType() {
        return this.userType;
    }

    @l
    public final String getXHash() {
        return this.xHash;
    }

    public int hashCode() {
        int iHashCode = this.localId.hashCode() * 31;
        String str = this.remoteId;
        int i12 = r.i(r.i(r.g(H.d(H.d((this.body.hashCode() + H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.channelId)) * 31, 31, this.userId), 31, this.fromId), 31, this.created), 31, this.isRead), 31, this.isFailed);
        Long l12 = this.readTimestamp;
        int iHashCode2 = (i12 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str2 = this.preview;
        int i13 = r.i((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isSupported);
        Long l13 = this.readLocallyTimestamp;
        int iHashCode3 = (i13 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Quote quote = this.quote;
        int iHashCode4 = (iHashCode3 + (quote == null ? 0 : quote.hashCode())) * 31;
        String str3 = this.xHash;
        int iD2 = H.d((this.userType.hashCode() + ((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31, this.accountId);
        Long l14 = this.sendTimestamp;
        return iD2 + (l14 != null ? l14.hashCode() : 0);
    }

    public final boolean isFailed() {
        return this.isFailed;
    }

    public final boolean isRead() {
        return this.isRead;
    }

    public final boolean isSupported() {
        return this.isSupported;
    }

    @k
    public String toString() {
        return C43066x.F0("LocalMessage(\n            |localId='" + this.localId + "',\n            |remoteId=" + this.remoteId + ",\n            |channelId='" + this.channelId + "',\n            |body=" + this.body + ",\n            " + LocalMessageKt.userInfoStr(this, HiAnalyticsConstant.REPORT_VAL_SEPARATOR) + ",\n            |fromId='" + this.fromId + "',\n            |created=" + this.created + ",\n            |isRead=" + this.isRead + ",\n            |isFailed=" + this.isFailed + ",\n            |readTimestamp=" + this.readTimestamp + ",\n            |preview=" + this.preview + ",\n            |isSupported=" + this.isSupported + ",\n            |readLocallyTimestamp=" + this.readLocallyTimestamp + ",\n            |quote=" + this.quote + "\n        )");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.localId);
        parcel.writeString(this.remoteId);
        parcel.writeString(this.channelId);
        parcel.writeParcelable(this.body, flags);
        parcel.writeString(this.userId);
        parcel.writeString(this.fromId);
        parcel.writeLong(this.created);
        parcel.writeInt(this.isRead ? 1 : 0);
        parcel.writeInt(this.isFailed ? 1 : 0);
        Long l12 = this.readTimestamp;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.preview);
        parcel.writeInt(this.isSupported ? 1 : 0);
        Long l13 = this.readLocallyTimestamp;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l13);
        }
        Quote quote = this.quote;
        if (quote == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            quote.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.xHash);
        parcel.writeParcelable(this.userType, flags);
        parcel.writeString(this.accountId);
        Long l14 = this.sendTimestamp;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l14);
        }
    }

    public static /* synthetic */ void getDeliveryStatus$annotations() {
    }

    public /* synthetic */ LocalMessage(String str, String str2, String str3, MessageBody messageBody, String str4, String str5, long j12, boolean z12, boolean z13, Long l12, String str6, boolean z14, Long l13, Quote quote, String str7, Type type, String str8, Long l14, int i12, C42822w c42822w) {
        this(str, str2, str3, messageBody, str4, str5, j12, z12, (i12 & 256) != 0 ? false : z13, (i12 & 512) != 0 ? null : l12, (i12 & 1024) != 0 ? null : str6, (i12 & 2048) != 0 ? true : z14, (i12 & 4096) != 0 ? null : l13, (i12 & 8192) != 0 ? null : quote, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str7, type, str8, (i12 & 131072) != 0 ? null : l14);
    }
}

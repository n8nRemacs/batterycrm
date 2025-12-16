package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: AvitoFinanceBaseCard.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/AvitoFinanceAction;", "Landroid/os/Parcelable;", "()V", "OpenDeeplink", "SendEvent", "Lcom/avito/android/remote/model/AvitoFinanceAction$OpenDeeplink;", "Lcom/avito/android/remote/model/AvitoFinanceAction$SendEvent;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class AvitoFinanceAction implements Parcelable {

    /* compiled from: AvitoFinanceBaseCard.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/AvitoFinanceAction$OpenDeeplink;", "Lcom/avito/android/remote/model/AvitoFinanceAction;", "", ContextActionHandler.Link.URL, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/AvitoFinanceAction$OpenDeeplink;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getUrl", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink extends AvitoFinanceAction {

        @k
        public static final Parcelable.Creator<OpenDeeplink> CREATOR = new Creator();

        @k
        private final String url;

        /* compiled from: AvitoFinanceBaseCard.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OpenDeeplink> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final OpenDeeplink createFromParcel(@k Parcel parcel) {
                return new OpenDeeplink(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final OpenDeeplink[] newArray(int i12) {
                return new OpenDeeplink[i12];
            }
        }

        public OpenDeeplink(@k String str) {
            super(null);
            this.url = str;
        }

        public static /* synthetic */ OpenDeeplink copy$default(OpenDeeplink openDeeplink, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = openDeeplink.url;
            }
            return openDeeplink.copy(str);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @k
        public final OpenDeeplink copy(@k String url) {
            return new OpenDeeplink(url);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OpenDeeplink) && L.f(this.url, ((OpenDeeplink) other).url);
        }

        @k
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("OpenDeeplink(url="), this.url, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.url);
        }
    }

    /* compiled from: AvitoFinanceBaseCard.kt */
    @d
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B<\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0019\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JM\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001b\b\u0002\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001bJ \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u000fR*\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0011R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b*\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u0014¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/AvitoFinanceAction$SendEvent;", "Lcom/avito/android/remote/model/AvitoFinanceAction;", "", "id", "", "", "", "LK51/e;", "params", "version", "", "hasSensitiveData", "<init>", "(JLjava/util/Map;JLjava/lang/Boolean;)V", "component1", "()J", "component2", "()Ljava/util/Map;", "component3", "component4", "()Ljava/lang/Boolean;", "copy", "(JLjava/util/Map;JLjava/lang/Boolean;)Lcom/avito/android/remote/model/AvitoFinanceAction$SendEvent;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getId", "Ljava/util/Map;", "getParams", "getVersion", "Ljava/lang/Boolean;", "getHasSensitiveData", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SendEvent extends AvitoFinanceAction {

        @k
        public static final Parcelable.Creator<SendEvent> CREATOR = new Creator();

        @l
        private final Boolean hasSensitiveData;
        private final long id;

        @l
        private final Map<String, Object> params;
        private final long version;

        /* compiled from: AvitoFinanceBaseCard.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SendEvent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SendEvent createFromParcel(@k Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Boolean boolValueOf;
                long j12 = parcel.readLong();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i12 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = h.c(SendEvent.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
                    }
                }
                long j13 = parcel.readLong();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new SendEvent(j12, linkedHashMap, j13, boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SendEvent[] newArray(int i12) {
                return new SendEvent[i12];
            }
        }

        public SendEvent(long j12, @l Map<String, ? extends Object> map, long j13, @l Boolean bool) {
            super(null);
            this.id = j12;
            this.params = map;
            this.version = j13;
            this.hasSensitiveData = bool;
        }

        public static /* synthetic */ SendEvent copy$default(SendEvent sendEvent, long j12, Map map, long j13, Boolean bool, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                j12 = sendEvent.id;
            }
            long j14 = j12;
            if ((i12 & 2) != 0) {
                map = sendEvent.params;
            }
            Map map2 = map;
            if ((i12 & 4) != 0) {
                j13 = sendEvent.version;
            }
            long j15 = j13;
            if ((i12 & 8) != 0) {
                bool = sendEvent.hasSensitiveData;
            }
            return sendEvent.copy(j14, map2, j15, bool);
        }

        /* renamed from: component1, reason: from getter */
        public final long getId() {
            return this.id;
        }

        @l
        public final Map<String, Object> component2() {
            return this.params;
        }

        /* renamed from: component3, reason: from getter */
        public final long getVersion() {
            return this.version;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Boolean getHasSensitiveData() {
            return this.hasSensitiveData;
        }

        @k
        public final SendEvent copy(long id2, @l Map<String, ? extends Object> params, long version, @l Boolean hasSensitiveData) {
            return new SendEvent(id2, params, version, hasSensitiveData);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SendEvent)) {
                return false;
            }
            SendEvent sendEvent = (SendEvent) other;
            return this.id == sendEvent.id && L.f(this.params, sendEvent.params) && this.version == sendEvent.version && L.f(this.hasSensitiveData, sendEvent.hasSensitiveData);
        }

        @l
        public final Boolean getHasSensitiveData() {
            return this.hasSensitiveData;
        }

        public final long getId() {
            return this.id;
        }

        @l
        public final Map<String, Object> getParams() {
            return this.params;
        }

        public final long getVersion() {
            return this.version;
        }

        public int hashCode() {
            int iHashCode = Long.hashCode(this.id) * 31;
            Map<String, Object> map = this.params;
            int iG2 = r.g((iHashCode + (map == null ? 0 : map.hashCode())) * 31, 31, this.version);
            Boolean bool = this.hasSensitiveData;
            return iG2 + (bool != null ? bool.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("SendEvent(id=");
            sb2.append(this.id);
            sb2.append(", params=");
            sb2.append(this.params);
            sb2.append(", version=");
            sb2.append(this.version);
            sb2.append(", hasSensitiveData=");
            return C0.g(sb2, this.hasSensitiveData, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeLong(this.id);
            Map<String, Object> map = this.params;
            if (map == null) {
                parcel.writeInt(0);
            } else {
                Iterator itH = C0.h(parcel, 1, map);
                while (itH.hasNext()) {
                    Map.Entry entry = (Map.Entry) itH.next();
                    h.h(parcel, (String) entry.getKey(), entry);
                }
            }
            parcel.writeLong(this.version);
            Boolean bool = this.hasSensitiveData;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }
    }

    public /* synthetic */ AvitoFinanceAction(C42822w c42822w) {
        this();
    }

    private AvitoFinanceAction() {
    }
}

package com.avito.android.multi_message_send.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: MultiMessageModalScreenDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/multi_message_send/deeplink/MultiMessageModalScreenDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "c", "_avito_multi-message-send_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final /* data */ class MultiMessageModalScreenDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<MultiMessageModalScreenDeeplink> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public final long f206620b;

    /* compiled from: MultiMessageModalScreenDeeplink.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/multi_message_send/deeplink/MultiMessageModalScreenDeeplink$a;", "", "<init>", "()V", "", "CHANNEL_ID_KEY", "Ljava/lang/String;", "MESSAGE_TEXT_KEY", "_avito_multi-message-send_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: MultiMessageModalScreenDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<MultiMessageModalScreenDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final MultiMessageModalScreenDeeplink createFromParcel(Parcel parcel) {
            return new MultiMessageModalScreenDeeplink(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final MultiMessageModalScreenDeeplink[] newArray(int i12) {
            return new MultiMessageModalScreenDeeplink[i12];
        }
    }

    /* compiled from: MultiMessageModalScreenDeeplink.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/multi_message_send/deeplink/MultiMessageModalScreenDeeplink$c;", "", "a", "Lcom/avito/android/multi_message_send/deeplink/MultiMessageModalScreenDeeplink$c$a;", "_avito_multi-message-send_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {

        /* compiled from: MultiMessageModalScreenDeeplink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/multi_message_send/deeplink/MultiMessageModalScreenDeeplink$c$a;", "Lcom/avito/android/multi_message_send/deeplink/MultiMessageModalScreenDeeplink$c;", "LJu/c$a;", "<init>", "()V", "_avito_multi-message-send_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements c, InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f206621b = new a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1542718352;
            }

            @k
            public final String toString() {
                return "RedirectToChannels";
            }
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public MultiMessageModalScreenDeeplink(long j12) {
        this.f206620b = j12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MultiMessageModalScreenDeeplink) && this.f206620b == ((MultiMessageModalScreenDeeplink) obj).f206620b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f206620b);
    }

    @k
    public final String toString() {
        return r.u(new StringBuilder("MultiMessageModalScreenDeeplink(itemId="), this.f206620b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f206620b);
    }
}

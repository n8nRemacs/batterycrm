package com.avito.android.entry_point_client_room.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: SendReportDeepLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/entry_point_client_room/deeplink/SendReportDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_entry-point-room-client_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final class SendReportDeepLink extends DeepLink {

    @k
    public static final Parcelable.Creator<SendReportDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f147626b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f147627c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f147628d;

    /* compiled from: SendReportDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SendReportDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final SendReportDeepLink createFromParcel(Parcel parcel) {
            return new SendReportDeepLink(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final SendReportDeepLink[] newArray(int i12) {
            return new SendReportDeepLink[i12];
        }
    }

    /* compiled from: SendReportDeepLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/entry_point_client_room/deeplink/SendReportDeepLink$b;", "LJu/c$b;", "<init>", "()V", "a", "b", "Lcom/avito/android/entry_point_client_room/deeplink/SendReportDeepLink$b$a;", "Lcom/avito/android/entry_point_client_room/deeplink/SendReportDeepLink$b$b;", "_avito_entry-point-room-client_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b implements InterfaceC14249c.b {

        /* compiled from: SendReportDeepLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/entry_point_client_room/deeplink/SendReportDeepLink$b$a;", "Lcom/avito/android/entry_point_client_room/deeplink/SendReportDeepLink$b;", "<init>", "()V", "_avito_entry-point-room-client_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f147629b = new a();

            public a() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1307791999;
            }

            @k
            public final String toString() {
                return "Cancel";
            }
        }

        /* compiled from: SendReportDeepLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/entry_point_client_room/deeplink/SendReportDeepLink$b$b;", "Lcom/avito/android/entry_point_client_room/deeplink/SendReportDeepLink$b;", "_avito_entry-point-room-client_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.entry_point_client_room.deeplink.SendReportDeepLink$b$b, reason: collision with other inner class name */
        public static final class C4315b extends b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f147630b;

            public C4315b(@k String str) {
                super(null);
                this.f147630b = str;
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public SendReportDeepLink(@l String str, @l String str2, @l Integer num) {
        this.f147626b = str;
        this.f147627c = str2;
        this.f147628d = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f147626b);
        parcel.writeString(this.f147627c);
        Integer num = this.f147628d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }
}

package com.avito.android.travel_file_download_deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import q50.InterfaceC47204b;

/* compiled from: TravelFileDownloadDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/TravelFileDownloadDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Action", "b", "_avito_travel-file-download-deeplink_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TravelFileDownloadDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<TravelFileDownloadDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Uri f301672b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f301673c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Action f301674d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f301675e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TravelFileDownloadDeeplink.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/TravelFileDownloadDeeplink$Action;", "", "Landroid/os/Parcelable;", "", "actionName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "OPEN", "_avito_travel-file-download-deeplink_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class Action implements Parcelable {

        @k
        public static final Parcelable.Creator<Action> CREATOR;

        @com.google.gson.annotations.c("open")
        public static final Action OPEN;

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final a f301676c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Action[] f301677d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f301678e;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f301679b;

        /* compiled from: TravelFileDownloadDeeplink.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/TravelFileDownloadDeeplink$Action$a;", "", "<init>", "()V", "_avito_travel-file-download-deeplink_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        /* compiled from: TravelFileDownloadDeeplink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Action> {
            @Override // android.os.Parcelable.Creator
            public final Action createFromParcel(Parcel parcel) {
                return Action.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Action[] newArray(int i12) {
                return new Action[i12];
            }
        }

        static {
            Action action = new Action("OPEN", 0, "open");
            OPEN = action;
            Action[] actionArr = {action};
            f301677d = actionArr;
            f301678e = kotlin.enums.c.a(actionArr);
            f301676c = new a(null);
            CREATOR = new b();
        }

        private Action(String str, int i12, String str2) {
            this.f301679b = str2;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) f301677d.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(name());
        }
    }

    /* compiled from: TravelFileDownloadDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TravelFileDownloadDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final TravelFileDownloadDeeplink createFromParcel(Parcel parcel) {
            return new TravelFileDownloadDeeplink((Uri) parcel.readParcelable(TravelFileDownloadDeeplink.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final TravelFileDownloadDeeplink[] newArray(int i12) {
            return new TravelFileDownloadDeeplink[i12];
        }
    }

    /* compiled from: TravelFileDownloadDeeplink.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/TravelFileDownloadDeeplink$b;", "LJu/c$b;", "a", "b", "c", "d", "Lcom/avito/android/travel_file_download_deeplink/TravelFileDownloadDeeplink$b$a;", "Lcom/avito/android/travel_file_download_deeplink/TravelFileDownloadDeeplink$b$b;", "Lcom/avito/android/travel_file_download_deeplink/TravelFileDownloadDeeplink$b$c;", "Lcom/avito/android/travel_file_download_deeplink/TravelFileDownloadDeeplink$b$d;", "_avito_travel-file-download-deeplink_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.b {

        /* compiled from: TravelFileDownloadDeeplink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/TravelFileDownloadDeeplink$b$a;", "Lcom/avito/android/travel_file_download_deeplink/TravelFileDownloadDeeplink$b;", "<init>", "()V", "_avito_travel-file-download-deeplink_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f301680b = new a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1592722970;
            }

            @k
            public final String toString() {
                return "Canceled";
            }
        }

        /* compiled from: TravelFileDownloadDeeplink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/TravelFileDownloadDeeplink$b$b;", "Lcom/avito/android/travel_file_download_deeplink/TravelFileDownloadDeeplink$b;", "<init>", "()V", "_avito_travel-file-download-deeplink_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.travel_file_download_deeplink.TravelFileDownloadDeeplink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C9229b implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C9229b f301681b = new C9229b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C9229b);
            }

            public final int hashCode() {
                return 1088520702;
            }

            @k
            public final String toString() {
                return "Failed";
            }
        }

        /* compiled from: TravelFileDownloadDeeplink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/TravelFileDownloadDeeplink$b$c;", "Lcom/avito/android/travel_file_download_deeplink/TravelFileDownloadDeeplink$b;", "_avito_travel-file-download-deeplink_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* renamed from: b, reason: collision with root package name */
            public final long f301682b;

            public c(long j12) {
                this.f301682b = j12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f301682b == ((c) obj).f301682b;
            }

            public final int hashCode() {
                return Long.hashCode(this.f301682b);
            }

            @k
            public final String toString() {
                return r.u(new StringBuilder("Pending(downloadId="), this.f301682b, ')');
            }
        }

        /* compiled from: TravelFileDownloadDeeplink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/TravelFileDownloadDeeplink$b$d;", "Lcom/avito/android/travel_file_download_deeplink/TravelFileDownloadDeeplink$b;", "_avito_travel-file-download-deeplink_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Uri f301683b;

            public d(@k Uri uri) {
                this.f301683b = uri;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && L.f(this.f301683b, ((d) obj).f301683b);
            }

            public final int hashCode() {
                return this.f301683b.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.actions_sheet.a.t(new StringBuilder("Success(uri="), this.f301683b, ')');
            }
        }
    }

    public TravelFileDownloadDeeplink(@k Uri uri, @k String str, @l Action action, boolean z12) {
        this.f301672b = uri;
        this.f301673c = str;
        this.f301674d = action;
        this.f301675e = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f301672b, i12);
        parcel.writeString(this.f301673c);
        Action action = this.f301674d;
        if (action == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            action.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f301675e ? 1 : 0);
    }
}

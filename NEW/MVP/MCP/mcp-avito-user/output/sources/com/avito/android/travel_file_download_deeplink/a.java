package com.avito.android.travel_file_download_deeplink;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DownloadStatus.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/a;", "", "a", "b", "c", "d", "Lcom/avito/android/travel_file_download_deeplink/a$a;", "Lcom/avito/android/travel_file_download_deeplink/a$b;", "Lcom/avito/android/travel_file_download_deeplink/a$c;", "Lcom/avito/android/travel_file_download_deeplink/a$d;", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: DownloadStatus.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/a$a;", "Lcom/avito/android/travel_file_download_deeplink/a;", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.travel_file_download_deeplink.a$a, reason: collision with other inner class name */
    public static final /* data */ class C9230a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final long f301684a;

        public C9230a(long j12) {
            this.f301684a = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9230a) && this.f301684a == ((C9230a) obj).f301684a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f301684a);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("Created(downloadId="), this.f301684a, ')');
        }
    }

    /* compiled from: DownloadStatus.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/a$b;", "Lcom/avito/android/travel_file_download_deeplink/a;", "<init>", "()V", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f301685a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1365308265;
        }

        @k
        public final String toString() {
            return "Failed";
        }
    }

    /* compiled from: DownloadStatus.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/a$c;", "Lcom/avito/android/travel_file_download_deeplink/a;", "<init>", "()V", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f301686a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 2048357410;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: DownloadStatus.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/a$d;", "Lcom/avito/android/travel_file_download_deeplink/a;", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Uri f301687a;

        public d(@k Uri uri) {
            this.f301687a = uri;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f301687a, ((d) obj).f301687a);
        }

        public final int hashCode() {
            return this.f301687a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.t(new StringBuilder("Success(fileUri="), this.f301687a, ')');
        }
    }
}

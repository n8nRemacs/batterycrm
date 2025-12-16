package com.avito.android.travel_file_download_deeplink.mvi.entity;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.appcompat.app.r;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.travel_file_download_deeplink.FileDownloadResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FileDownloadInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/mvi/entity/FileDownloadInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseWithResult", "LoadingFailed", "LoadingStarted", "LoadingSuccess", "Lcom/avito/android/travel_file_download_deeplink/mvi/entity/FileDownloadInternalAction$CloseWithResult;", "Lcom/avito/android/travel_file_download_deeplink/mvi/entity/FileDownloadInternalAction$LoadingFailed;", "Lcom/avito/android/travel_file_download_deeplink/mvi/entity/FileDownloadInternalAction$LoadingStarted;", "Lcom/avito/android/travel_file_download_deeplink/mvi/entity/FileDownloadInternalAction$LoadingSuccess;", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface FileDownloadInternalAction extends n {

    /* compiled from: FileDownloadInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/mvi/entity/FileDownloadInternalAction$CloseWithResult;", "Lcom/avito/android/travel_file_download_deeplink/mvi/entity/FileDownloadInternalAction;", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseWithResult implements FileDownloadInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final FileDownloadResult f301783b;

        public CloseWithResult(@k FileDownloadResult fileDownloadResult) {
            this.f301783b = fileDownloadResult;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CloseWithResult) && L.f(this.f301783b, ((CloseWithResult) obj).f301783b);
        }

        public final int hashCode() {
            return this.f301783b.hashCode();
        }

        @k
        public final String toString() {
            return "CloseWithResult(result=" + this.f301783b + ')';
        }
    }

    /* compiled from: FileDownloadInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/mvi/entity/FileDownloadInternalAction$LoadingFailed;", "Lcom/avito/android/travel_file_download_deeplink/mvi/entity/FileDownloadInternalAction;", "<init>", "()V", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingFailed implements FileDownloadInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final LoadingFailed f301784b = new LoadingFailed();

        private LoadingFailed() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof LoadingFailed);
        }

        public final int hashCode() {
            return -1020524251;
        }

        @k
        public final String toString() {
            return "LoadingFailed";
        }
    }

    /* compiled from: FileDownloadInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/mvi/entity/FileDownloadInternalAction$LoadingStarted;", "Lcom/avito/android/travel_file_download_deeplink/mvi/entity/FileDownloadInternalAction;", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingStarted implements FileDownloadInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f301785b;

        public LoadingStarted(long j12) {
            this.f301785b = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadingStarted) && this.f301785b == ((LoadingStarted) obj).f301785b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f301785b);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("LoadingStarted(downloadId="), this.f301785b, ')');
        }
    }

    /* compiled from: FileDownloadInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/mvi/entity/FileDownloadInternalAction$LoadingSuccess;", "Lcom/avito/android/travel_file_download_deeplink/mvi/entity/FileDownloadInternalAction;", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingSuccess implements FileDownloadInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Uri f301786b;

        public LoadingSuccess(@k Uri uri) {
            this.f301786b = uri;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadingSuccess) && L.f(this.f301786b, ((LoadingSuccess) obj).f301786b);
        }

        public final int hashCode() {
            return this.f301786b.hashCode();
        }

        @k
        public final String toString() {
            return a.t(new StringBuilder("LoadingSuccess(fileUri="), this.f301786b, ')');
        }
    }
}

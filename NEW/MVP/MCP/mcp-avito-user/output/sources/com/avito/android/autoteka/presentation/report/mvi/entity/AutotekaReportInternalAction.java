package com.avito.android.autoteka.presentation.report.mvi.entity;

import AK.c;
import Bf.C13142a;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.error.ApiError;
import java.io.InputStream;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaReportInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/autoteka/presentation/report/mvi/entity/AutotekaReportInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Data", "DownloadPdf", "Error", "Loading", "OpenAuthScreen", "ShareReport", "Lcom/avito/android/autoteka/presentation/report/mvi/entity/AutotekaReportInternalAction$Data;", "Lcom/avito/android/autoteka/presentation/report/mvi/entity/AutotekaReportInternalAction$DownloadPdf;", "Lcom/avito/android/autoteka/presentation/report/mvi/entity/AutotekaReportInternalAction$Error;", "Lcom/avito/android/autoteka/presentation/report/mvi/entity/AutotekaReportInternalAction$Loading;", "Lcom/avito/android/autoteka/presentation/report/mvi/entity/AutotekaReportInternalAction$OpenAuthScreen;", "Lcom/avito/android/autoteka/presentation/report/mvi/entity/AutotekaReportInternalAction$ShareReport;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AutotekaReportInternalAction extends n {

    /* compiled from: AutotekaReportInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/presentation/report/mvi/entity/AutotekaReportInternalAction$Data;", "Lcom/avito/android/autoteka/presentation/report/mvi/entity/AutotekaReportInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Data implements AutotekaReportInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C13142a f97721b;

        public Data(@k C13142a c13142a) {
            this.f97721b = c13142a;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF131216d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && L.f(this.f97721b, ((Data) obj).f97721b);
        }

        public final int hashCode() {
            return this.f97721b.hashCode();
        }

        @k
        public final String toString() {
            return "Data(reportItem=" + this.f97721b + ')';
        }
    }

    /* compiled from: AutotekaReportInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/report/mvi/entity/AutotekaReportInternalAction$DownloadPdf;", "Lcom/avito/android/autoteka/presentation/report/mvi/entity/AutotekaReportInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DownloadPdf implements AutotekaReportInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f97722b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final InputStream f97723c;

        public DownloadPdf(@k InputStream inputStream, @k String str) {
            this.f97722b = str;
            this.f97723c = inputStream;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DownloadPdf)) {
                return false;
            }
            DownloadPdf downloadPdf = (DownloadPdf) obj;
            return L.f(this.f97722b, downloadPdf.f97722b) && L.f(this.f97723c, downloadPdf.f97723c);
        }

        public final int hashCode() {
            return this.f97723c.hashCode() + (this.f97722b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "DownloadPdf(fileName=" + this.f97722b + ", inputStream=" + this.f97723c + ')';
        }
    }

    /* compiled from: AutotekaReportInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/presentation/report/mvi/entity/AutotekaReportInternalAction$Error;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "Lcom/avito/android/autoteka/presentation/report/mvi/entity/AutotekaReportInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements TrackableError, AutotekaReportInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f97724b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f97725c;

        public Error(@k ApiError apiError) {
            this.f97724b = apiError;
            this.f97725c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF131216d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && L.f(this.f97724b, ((Error) obj).f97724b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF325801c() {
            return this.f97725c;
        }

        public final int hashCode() {
            return this.f97724b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("Error(apiError="), this.f97724b, ')');
        }
    }

    /* compiled from: AutotekaReportInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/presentation/report/mvi/entity/AutotekaReportInternalAction$Loading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/autoteka/presentation/report/mvi/entity/AutotekaReportInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading extends TrackableLoadingStarted implements AutotekaReportInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final G0 f97726d;

        public Loading() {
            this(null, 1, null);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && L.f(this.f97726d, ((Loading) obj).f97726d);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return this.f97726d.hashCode();
        }

        @k
        public final String toString() {
            return c.v(new StringBuilder("Loading(stub="), this.f97726d, ')');
        }

        public Loading(G0 g02, int i12, C42822w c42822w) {
            this.f97726d = (i12 & 1) != 0 ? G0.f406611a : g02;
        }
    }

    /* compiled from: AutotekaReportInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/report/mvi/entity/AutotekaReportInternalAction$OpenAuthScreen;", "Lcom/avito/android/autoteka/presentation/report/mvi/entity/AutotekaReportInternalAction;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenAuthScreen implements AutotekaReportInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenAuthScreen f97727b = new OpenAuthScreen();

        private OpenAuthScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OpenAuthScreen);
        }

        public final int hashCode() {
            return 1319814149;
        }

        @k
        public final String toString() {
            return "OpenAuthScreen";
        }
    }

    /* compiled from: AutotekaReportInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/report/mvi/entity/AutotekaReportInternalAction$ShareReport;", "Lcom/avito/android/autoteka/presentation/report/mvi/entity/AutotekaReportInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShareReport implements AutotekaReportInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C13142a.C0064a f97728b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f97729c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f97730d;

        public ShareReport(@k C13142a.C0064a c0064a, @k String str, @l String str2) {
            this.f97728b = c0064a;
            this.f97729c = str;
            this.f97730d = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShareReport)) {
                return false;
            }
            ShareReport shareReport = (ShareReport) obj;
            return L.f(this.f97728b, shareReport.f97728b) && L.f(this.f97729c, shareReport.f97729c) && L.f(this.f97730d, shareReport.f97730d);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f97728b.hashCode() * 31, 31, this.f97729c);
            String str = this.f97730d;
            return iD2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShareReport(sharingLink=");
            sb2.append(this.f97728b);
            sb2.append(", reportPublicID=");
            sb2.append(this.f97729c);
            sb2.append(", autotekaX=");
            return C22026a.c(sb2, this.f97730d, ')');
        }
    }
}

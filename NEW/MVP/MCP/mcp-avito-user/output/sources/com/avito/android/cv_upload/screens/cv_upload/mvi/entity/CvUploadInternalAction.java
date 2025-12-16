package com.avito.android.cv_upload.screens.cv_upload.mvi.entity;

import It.c;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CvUploadInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/cv_upload/screens/cv_upload/mvi/entity/CvUploadInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Content", "FileLoading", "ParsedWithPending", "ReceivedDeeplink", "ScreenLoading", "ServerError", "Lcom/avito/android/cv_upload/screens/cv_upload/mvi/entity/CvUploadInternalAction$Content;", "Lcom/avito/android/cv_upload/screens/cv_upload/mvi/entity/CvUploadInternalAction$FileLoading;", "Lcom/avito/android/cv_upload/screens/cv_upload/mvi/entity/CvUploadInternalAction$ParsedWithPending;", "Lcom/avito/android/cv_upload/screens/cv_upload/mvi/entity/CvUploadInternalAction$ReceivedDeeplink;", "Lcom/avito/android/cv_upload/screens/cv_upload/mvi/entity/CvUploadInternalAction$ScreenLoading;", "Lcom/avito/android/cv_upload/screens/cv_upload/mvi/entity/CvUploadInternalAction$ServerError;", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CvUploadInternalAction extends n {

    /* compiled from: CvUploadInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cv_upload/screens/cv_upload/mvi/entity/CvUploadInternalAction$Content;", "Lcom/avito/android/cv_upload/screens/cv_upload/mvi/entity/CvUploadInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements CvUploadInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final c f131766b;

        public Content(@k c cVar) {
            this.f131766b = cVar;
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
            return (obj instanceof Content) && L.f(this.f131766b, ((Content) obj).f131766b);
        }

        public final int hashCode() {
            return this.f131766b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(content=" + this.f131766b + ')';
        }
    }

    /* compiled from: CvUploadInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_upload/screens/cv_upload/mvi/entity/CvUploadInternalAction$FileLoading;", "Lcom/avito/android/cv_upload/screens/cv_upload/mvi/entity/CvUploadInternalAction;", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FileLoading implements CvUploadInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f131767b;

        public FileLoading() {
            this(false, 1, null);
        }

        public FileLoading(boolean z12) {
            this.f131767b = z12;
        }

        public /* synthetic */ FileLoading(boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12);
        }
    }

    /* compiled from: CvUploadInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cv_upload/screens/cv_upload/mvi/entity/CvUploadInternalAction$ParsedWithPending;", "Lcom/avito/android/cv_upload/screens/cv_upload/mvi/entity/CvUploadInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "()V", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ParsedWithPending implements CvUploadInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ParsedWithPending f131768b = new ParsedWithPending();

        private ParsedWithPending() {
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
    }

    /* compiled from: CvUploadInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cv_upload/screens/cv_upload/mvi/entity/CvUploadInternalAction$ReceivedDeeplink;", "Lcom/avito/android/cv_upload/screens/cv_upload/mvi/entity/CvUploadInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ReceivedDeeplink implements CvUploadInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f131769b;

        public ReceivedDeeplink(@k DeepLink deepLink) {
            this.f131769b = deepLink;
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
    }

    /* compiled from: CvUploadInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cv_upload/screens/cv_upload/mvi/entity/CvUploadInternalAction$ScreenLoading;", "Lcom/avito/android/cv_upload/screens/cv_upload/mvi/entity/CvUploadInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ScreenLoading extends TrackableLoadingStarted implements CvUploadInternalAction {
    }

    /* compiled from: CvUploadInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cv_upload/screens/cv_upload/mvi/entity/CvUploadInternalAction$ServerError;", "Lcom/avito/android/cv_upload/screens/cv_upload/mvi/entity/CvUploadInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ServerError implements CvUploadInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f131770b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f131771c;

        public ServerError(@k ApiException apiException) {
            this.f131770b = apiException;
            this.f131771c = new J.a(apiException);
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
            return (obj instanceof ServerError) && this.f131770b.equals(((ServerError) obj).f131770b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF97725c() {
            return this.f131771c;
        }

        public final int hashCode() {
            return this.f131770b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.q(new StringBuilder("ServerError(error="), this.f131770b, ')');
        }
    }
}

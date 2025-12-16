package com.avito.android.mortgage.document_upload.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.document_upload.model.DocumentUploadArguments;
import com.avito.android.remote.error.ApiError;
import d00.C39479c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DocumentUploadInternalAction.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0012\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0082\u0001\u0012\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AddFilesClick", "AddPhotoClick", "CloseAllDocumentsScreens", "FileUpdated", "FileValidationError", "FilesAdded", "HandleDeeplink", "Init", "LocalFileDeleted", "NavigateBack", "NavigationFailure", "NavigationStarted", "OpenNextStepScreen", "OpenPreviousStepScreen", "RemoteFileDeleteFailed", "RemoteFileDeleteStarted", "RemoteFileDeleted", "ResetProcessId", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$AddFilesClick;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$AddPhotoClick;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$CloseAllDocumentsScreens;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$FileUpdated;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$FileValidationError;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$FilesAdded;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$HandleDeeplink;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$Init;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$LocalFileDeleted;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$NavigateBack;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$NavigationFailure;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$NavigationStarted;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$OpenNextStepScreen;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$OpenPreviousStepScreen;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$RemoteFileDeleteFailed;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$RemoteFileDeleteStarted;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$RemoteFileDeleted;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$ResetProcessId;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface DocumentUploadInternalAction extends n {

    /* compiled from: DocumentUploadInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$AddFilesClick;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AddFilesClick implements DocumentUploadInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f199406b;

        public AddFilesClick(@k String str) {
            this.f199406b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddFilesClick) && L.f(this.f199406b, ((AddFilesClick) obj).f199406b);
        }

        public final int hashCode() {
            return this.f199406b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("AddFilesClick(processId="), this.f199406b, ')');
        }
    }

    /* compiled from: DocumentUploadInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$AddPhotoClick;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AddPhotoClick implements DocumentUploadInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f199407b;

        public AddPhotoClick(@k String str) {
            this.f199407b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddPhotoClick) && L.f(this.f199407b, ((AddPhotoClick) obj).f199407b);
        }

        public final int hashCode() {
            return this.f199407b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("AddPhotoClick(processId="), this.f199407b, ')');
        }
    }

    /* compiled from: DocumentUploadInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$CloseAllDocumentsScreens;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseAllDocumentsScreens implements DocumentUploadInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseAllDocumentsScreens f199408b = new CloseAllDocumentsScreens();

        private CloseAllDocumentsScreens() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseAllDocumentsScreens);
        }

        public final int hashCode() {
            return 1892727722;
        }

        @k
        public final String toString() {
            return "CloseAllDocumentsScreens";
        }
    }

    /* compiled from: DocumentUploadInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$FileUpdated;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FileUpdated implements DocumentUploadInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C39479c f199409b;

        public FileUpdated(@k C39479c c39479c) {
            this.f199409b = c39479c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FileUpdated) && L.f(this.f199409b, ((FileUpdated) obj).f199409b);
        }

        public final int hashCode() {
            return this.f199409b.hashCode();
        }

        @k
        public final String toString() {
            return "FileUpdated(file=" + this.f199409b + ')';
        }
    }

    /* compiled from: DocumentUploadInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$FileValidationError;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FileValidationError implements DocumentUploadInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f199410b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f199411c;

        public FileValidationError(int i12, boolean z12) {
            this.f199410b = i12;
            this.f199411c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FileValidationError)) {
                return false;
            }
            FileValidationError fileValidationError = (FileValidationError) obj;
            return this.f199410b == fileValidationError.f199410b && this.f199411c == fileValidationError.f199411c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f199411c) + (Integer.hashCode(this.f199410b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FileValidationError(skippedFiles=");
            sb2.append(this.f199410b);
            sb2.append(", isAllSkipped=");
            return r.x(sb2, this.f199411c, ')');
        }
    }

    /* compiled from: DocumentUploadInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$FilesAdded;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FilesAdded implements DocumentUploadInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<C39479c> f199412b;

        public FilesAdded(@k List<C39479c> list) {
            this.f199412b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FilesAdded) && L.f(this.f199412b, ((FilesAdded) obj).f199412b);
        }

        public final int hashCode() {
            return this.f199412b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("FilesAdded(files="), this.f199412b, ')');
        }
    }

    /* compiled from: DocumentUploadInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$HandleDeeplink;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements DocumentUploadInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f199413b;

        public HandleDeeplink(@k DeepLink deepLink) {
            this.f199413b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f199413b, ((HandleDeeplink) obj).f199413b);
        }

        public final int hashCode() {
            return this.f199413b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f199413b, ')');
        }
    }

    /* compiled from: DocumentUploadInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$Init;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements DocumentUploadInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Init f199414b = new Init();

        private Init() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Init);
        }

        public final int hashCode() {
            return 815535970;
        }

        @k
        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: DocumentUploadInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$LocalFileDeleted;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LocalFileDeleted implements DocumentUploadInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f199415b;

        public LocalFileDeleted(long j12) {
            this.f199415b = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LocalFileDeleted) && this.f199415b == ((LocalFileDeleted) obj).f199415b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f199415b);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("LocalFileDeleted(fileId="), this.f199415b, ')');
        }
    }

    /* compiled from: DocumentUploadInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$NavigateBack;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateBack implements DocumentUploadInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NavigateBack f199416b = new NavigateBack();

        private NavigateBack() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NavigateBack);
        }

        public final int hashCode() {
            return -18670006;
        }

        @k
        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: DocumentUploadInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$NavigationFailure;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigationFailure implements DocumentUploadInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f199417b;

        public NavigationFailure(@k ApiError apiError) {
            this.f199417b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigationFailure) && L.f(this.f199417b, ((NavigationFailure) obj).f199417b);
        }

        public final int hashCode() {
            return this.f199417b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("NavigationFailure(error="), this.f199417b, ')');
        }
    }

    /* compiled from: DocumentUploadInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$NavigationStarted;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigationStarted implements DocumentUploadInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f199418b;

        public NavigationStarted() {
            this(false, 1, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigationStarted) && this.f199418b == ((NavigationStarted) obj).f199418b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f199418b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("NavigationStarted(isNavigatingUp="), this.f199418b, ')');
        }

        public NavigationStarted(boolean z12) {
            this.f199418b = z12;
        }

        public /* synthetic */ NavigationStarted(boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12);
        }
    }

    /* compiled from: DocumentUploadInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$OpenNextStepScreen;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenNextStepScreen implements DocumentUploadInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DocumentUploadArguments f199419b;

        public OpenNextStepScreen(@k DocumentUploadArguments documentUploadArguments) {
            this.f199419b = documentUploadArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenNextStepScreen) && L.f(this.f199419b, ((OpenNextStepScreen) obj).f199419b);
        }

        public final int hashCode() {
            return this.f199419b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenNextStepScreen(arguments=" + this.f199419b + ')';
        }
    }

    /* compiled from: DocumentUploadInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$OpenPreviousStepScreen;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenPreviousStepScreen implements DocumentUploadInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DocumentUploadArguments f199420b;

        public OpenPreviousStepScreen(@k DocumentUploadArguments documentUploadArguments) {
            this.f199420b = documentUploadArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenPreviousStepScreen) && L.f(this.f199420b, ((OpenPreviousStepScreen) obj).f199420b);
        }

        public final int hashCode() {
            return this.f199420b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenPreviousStepScreen(arguments=" + this.f199420b + ')';
        }
    }

    /* compiled from: DocumentUploadInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$RemoteFileDeleteFailed;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RemoteFileDeleteFailed implements DocumentUploadInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f199421b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ApiError f199422c;

        public RemoteFileDeleteFailed(@k ApiError apiError, @k String str) {
            this.f199421b = str;
            this.f199422c = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteFileDeleteFailed)) {
                return false;
            }
            RemoteFileDeleteFailed remoteFileDeleteFailed = (RemoteFileDeleteFailed) obj;
            return L.f(this.f199421b, remoteFileDeleteFailed.f199421b) && L.f(this.f199422c, remoteFileDeleteFailed.f199422c);
        }

        public final int hashCode() {
            return this.f199422c.hashCode() + (this.f199421b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RemoteFileDeleteFailed(fileId=");
            sb2.append(this.f199421b);
            sb2.append(", error=");
            return c.n(sb2, this.f199422c, ')');
        }
    }

    /* compiled from: DocumentUploadInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$RemoteFileDeleteStarted;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RemoteFileDeleteStarted implements DocumentUploadInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f199423b;

        public RemoteFileDeleteStarted(@k String str) {
            this.f199423b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoteFileDeleteStarted) && L.f(this.f199423b, ((RemoteFileDeleteStarted) obj).f199423b);
        }

        public final int hashCode() {
            return this.f199423b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("RemoteFileDeleteStarted(fileId="), this.f199423b, ')');
        }
    }

    /* compiled from: DocumentUploadInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$RemoteFileDeleted;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RemoteFileDeleted implements DocumentUploadInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f199424b;

        public RemoteFileDeleted(@k String str) {
            this.f199424b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoteFileDeleted) && L.f(this.f199424b, ((RemoteFileDeleted) obj).f199424b);
        }

        public final int hashCode() {
            return this.f199424b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("RemoteFileDeleted(fileId="), this.f199424b, ')');
        }
    }

    /* compiled from: DocumentUploadInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$ResetProcessId;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ResetProcessId implements DocumentUploadInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ResetProcessId f199425b = new ResetProcessId();

        private ResetProcessId() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ResetProcessId);
        }

        public final int hashCode() {
            return -1301592275;
        }

        @k
        public final String toString() {
            return "ResetProcessId";
        }
    }
}

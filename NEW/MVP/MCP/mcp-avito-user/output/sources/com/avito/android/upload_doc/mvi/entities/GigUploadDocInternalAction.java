package com.avito.android.upload_doc.mvi.entities;

import AK.c;
import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.upload_doc.view.checkbox.GigUploadDocCheckboxItem;
import com.avito.android.upload_doc.view.document.GigUploadDocDocumentItem;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigUploadDocInternalAction.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000f\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AddDocument", "AgreeToTerms", "Close", "DisagreeToTerms", "DocumentError", "DocumentLoaded", "DocumentLoading", "PickDocument", "RemoveDocument", "SendDocumentsDone", "SendDocumentsError", "SendDocumentsLoading", "ShowContent", "ShowError", "ShowLoading", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction$AddDocument;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction$AgreeToTerms;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction$Close;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction$DisagreeToTerms;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction$DocumentError;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction$DocumentLoaded;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction$DocumentLoading;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction$PickDocument;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction$RemoveDocument;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction$SendDocumentsDone;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction$SendDocumentsError;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction$SendDocumentsLoading;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction$ShowContent;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction$ShowError;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction$ShowLoading;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface GigUploadDocInternalAction extends n {

    /* compiled from: GigUploadDocInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction$AddDocument;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AddDocument extends TrackableLoadingStarted implements GigUploadDocInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final GigUploadDocDocumentItem f306850d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final Uri f306851e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f306852f = "GIG_UPLOAD_DOC_DOCUMENT";

        public AddDocument(@k GigUploadDocDocumentItem gigUploadDocDocumentItem, @k Uri uri) {
            this.f306850d = gigUploadDocDocumentItem;
            this.f306851e = uri;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF211483d() {
            return this.f306852f;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddDocument)) {
                return false;
            }
            AddDocument addDocument = (AddDocument) obj;
            return L.f(this.f306850d, addDocument.f306850d) && L.f(this.f306851e, addDocument.f306851e);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return this.f306851e.hashCode() + (this.f306850d.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AddDocument(document=");
            sb2.append(this.f306850d);
            sb2.append(", imageUri=");
            return a.t(sb2, this.f306851e, ')');
        }
    }

    /* compiled from: GigUploadDocInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction$AgreeToTerms;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AgreeToTerms implements GigUploadDocInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final GigUploadDocCheckboxItem f306853b;

        public AgreeToTerms(@k GigUploadDocCheckboxItem gigUploadDocCheckboxItem) {
            this.f306853b = gigUploadDocCheckboxItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AgreeToTerms) && L.f(this.f306853b, ((AgreeToTerms) obj).f306853b);
        }

        public final int hashCode() {
            return this.f306853b.hashCode();
        }

        @k
        public final String toString() {
            return "AgreeToTerms(forCheckbox=" + this.f306853b + ')';
        }
    }

    /* compiled from: GigUploadDocInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction$Close;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction;", "<init>", "()V", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements GigUploadDocInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f306854b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 305164389;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: GigUploadDocInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction$DisagreeToTerms;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DisagreeToTerms implements GigUploadDocInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final GigUploadDocCheckboxItem f306855b;

        public DisagreeToTerms(@k GigUploadDocCheckboxItem gigUploadDocCheckboxItem) {
            this.f306855b = gigUploadDocCheckboxItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisagreeToTerms) && L.f(this.f306855b, ((DisagreeToTerms) obj).f306855b);
        }

        public final int hashCode() {
            return this.f306855b.hashCode();
        }

        @k
        public final String toString() {
            return "DisagreeToTerms(forCheckbox=" + this.f306855b + ')';
        }
    }

    /* compiled from: GigUploadDocInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction$DocumentError;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DocumentError implements GigUploadDocInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f306856b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final GigUploadDocDocumentItem f306857c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f306858d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f306859e = "GIG_UPLOAD_DOC_DOCUMENT";

        public DocumentError(@k ApiError apiError, @k GigUploadDocDocumentItem gigUploadDocDocumentItem) {
            this.f306856b = apiError;
            this.f306857c = gigUploadDocDocumentItem;
            this.f306858d = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF211483d() {
            return this.f306859e;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return this.f306859e;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DocumentError)) {
                return false;
            }
            DocumentError documentError = (DocumentError) obj;
            return L.f(this.f306856b, documentError.f306856b) && L.f(this.f306857c, documentError.f306857c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF292965c() {
            return this.f306858d;
        }

        public final int hashCode() {
            return this.f306857c.hashCode() + (this.f306856b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "DocumentError(error=" + this.f306856b + ", document=" + this.f306857c + ')';
        }
    }

    /* compiled from: GigUploadDocInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction$DocumentLoaded;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DocumentLoaded implements GigUploadDocInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final GigUploadDocDocumentItem f306860b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f306861c;

        public DocumentLoaded(@k GigUploadDocDocumentItem gigUploadDocDocumentItem, @k String str) {
            this.f306860b = gigUploadDocDocumentItem;
            this.f306861c = str;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF211483d() {
            return "GIG_UPLOAD_DOC_DOCUMENT";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "GIG_UPLOAD_DOC_DOCUMENT";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DocumentLoaded)) {
                return false;
            }
            DocumentLoaded documentLoaded = (DocumentLoaded) obj;
            return L.f(this.f306860b, documentLoaded.f306860b) && L.f(this.f306861c, documentLoaded.f306861c);
        }

        public final int hashCode() {
            return this.f306861c.hashCode() + (this.f306860b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DocumentLoaded(document=");
            sb2.append(this.f306860b);
            sb2.append(", imageId=");
            return C22026a.c(sb2, this.f306861c, ')');
        }
    }

    /* compiled from: GigUploadDocInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction$DocumentLoading;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DocumentLoading extends TrackableLoadingStarted implements GigUploadDocInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final GigUploadDocDocumentItem f306862d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f306863e = "GIG_UPLOAD_DOC_DOCUMENT";

        public DocumentLoading(@k GigUploadDocDocumentItem gigUploadDocDocumentItem) {
            this.f306862d = gigUploadDocDocumentItem;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF211483d() {
            return this.f306863e;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DocumentLoading) && L.f(this.f306862d, ((DocumentLoading) obj).f306862d);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return this.f306862d.hashCode();
        }

        @k
        public final String toString() {
            return "DocumentLoading(document=" + this.f306862d + ')';
        }
    }

    /* compiled from: GigUploadDocInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction$PickDocument;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PickDocument implements GigUploadDocInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final GigUploadDocDocumentItem f306864b;

        public PickDocument(@k GigUploadDocDocumentItem gigUploadDocDocumentItem) {
            this.f306864b = gigUploadDocDocumentItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PickDocument) && L.f(this.f306864b, ((PickDocument) obj).f306864b);
        }

        public final int hashCode() {
            return this.f306864b.hashCode();
        }

        @k
        public final String toString() {
            return "PickDocument(document=" + this.f306864b + ')';
        }
    }

    /* compiled from: GigUploadDocInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction$RemoveDocument;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RemoveDocument implements GigUploadDocInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final GigUploadDocDocumentItem f306865b;

        public RemoveDocument(@k GigUploadDocDocumentItem gigUploadDocDocumentItem) {
            this.f306865b = gigUploadDocDocumentItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoveDocument) && L.f(this.f306865b, ((RemoveDocument) obj).f306865b);
        }

        public final int hashCode() {
            return this.f306865b.hashCode();
        }

        @k
        public final String toString() {
            return "RemoveDocument(document=" + this.f306865b + ')';
        }
    }

    /* compiled from: GigUploadDocInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction$SendDocumentsDone;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SendDocumentsDone implements GigUploadDocInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f306866b;

        public SendDocumentsDone(@k DeepLink deepLink) {
            this.f306866b = deepLink;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF211483d() {
            return "GIG_UPLOAD_DOC_SEND_DOCUMENT";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "GIG_UPLOAD_DOC_SEND_DOCUMENT";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SendDocumentsDone) && L.f(this.f306866b, ((SendDocumentsDone) obj).f306866b);
        }

        public final int hashCode() {
            return this.f306866b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("SendDocumentsDone(finishLink="), this.f306866b, ')');
        }
    }

    /* compiled from: GigUploadDocInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction$SendDocumentsError;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SendDocumentsError implements GigUploadDocInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f306867b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f306868c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f306869d = "GIG_UPLOAD_DOC_SEND_DOCUMENT";

        public SendDocumentsError(@k ApiError apiError) {
            this.f306867b = apiError;
            this.f306868c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF211483d() {
            return this.f306869d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return this.f306869d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SendDocumentsError) && L.f(this.f306867b, ((SendDocumentsError) obj).f306867b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF292965c() {
            return this.f306868c;
        }

        public final int hashCode() {
            return this.f306867b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("SendDocumentsError(error="), this.f306867b, ')');
        }
    }

    /* compiled from: GigUploadDocInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction$SendDocumentsLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction;", "<init>", "()V", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SendDocumentsLoading extends TrackableLoadingStarted implements GigUploadDocInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f306870d = "GIG_UPLOAD_DOC_SEND_DOCUMENT";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF211483d() {
            return this.f306870d;
        }
    }

    /* compiled from: GigUploadDocInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction$ShowContent;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContent implements GigUploadDocInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f306871b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f306872c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ArrayList f306873d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final ArrayList f306874e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final DeepLink f306875f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final String f306876g;

        public ShowContent(@k String str, @l String str2, @k ArrayList arrayList, @k ArrayList arrayList2, @l DeepLink deepLink, @k String str3) {
            this.f306871b = str;
            this.f306872c = str2;
            this.f306873d = arrayList;
            this.f306874e = arrayList2;
            this.f306875f = deepLink;
            this.f306876g = str3;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF211483d() {
            return "GIG_UPLOAD_DOC_PAGE";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "GIG_UPLOAD_DOC_PAGE";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowContent)) {
                return false;
            }
            ShowContent showContent = (ShowContent) obj;
            return L.f(this.f306871b, showContent.f306871b) && L.f(this.f306872c, showContent.f306872c) && this.f306873d.equals(showContent.f306873d) && this.f306874e.equals(showContent.f306874e) && L.f(this.f306875f, showContent.f306875f) && L.f(this.f306876g, showContent.f306876g);
        }

        public final int hashCode() {
            int iHashCode = this.f306871b.hashCode() * 31;
            String str = this.f306872c;
            int iG2 = e.g(this.f306874e, e.g(this.f306873d, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
            DeepLink deepLink = this.f306875f;
            return this.f306876g.hashCode() + ((iG2 + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowContent(title=");
            sb2.append(this.f306871b);
            sb2.append(", description=");
            sb2.append(this.f306872c);
            sb2.append(", sections=");
            sb2.append(this.f306873d);
            sb2.append(", checkboxes=");
            sb2.append(this.f306874e);
            sb2.append(", supportButtonDeepLink=");
            sb2.append(this.f306875f);
            sb2.append(", buttonText=");
            return C22026a.c(sb2, this.f306876g, ')');
        }
    }

    /* compiled from: GigUploadDocInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction$ShowError;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements GigUploadDocInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f306877b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f306878c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f306879d = "GIG_UPLOAD_DOC_PAGE";

        public ShowError(@k ApiError apiError) {
            this.f306877b = apiError;
            this.f306878c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF211483d() {
            return this.f306879d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return this.f306879d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowError) && L.f(this.f306877b, ((ShowError) obj).f306877b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF292965c() {
            return this.f306878c;
        }

        public final int hashCode() {
            return this.f306877b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ShowError(error="), this.f306877b, ')');
        }
    }

    /* compiled from: GigUploadDocInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction$ShowLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction;", "<init>", "()V", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowLoading extends TrackableLoadingStarted implements GigUploadDocInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f306880d = "GIG_UPLOAD_DOC_PAGE";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF211483d() {
            return this.f306880d;
        }
    }
}

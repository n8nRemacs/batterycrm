package com.avito.android.evidence_request.mvi.evidence_details.mvi.entity;

import UV0.a;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.evidence_request.mvi.domain.evidence_request.ProofDetailsContent;
import com.avito.android.photo_list_view.G;
import com.avito.android.remote.model.ImageUpload;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EvidenceDetailsInternalAction.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u0010\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ActivityResult", "Back", "FilesPicker", "FilesUpload", "Finish", "FormParametersSlots", "HasUploadData", "HideKeyboard", "Initial", "IsLoading", "ItemsUpdate", "OpenScreen", "RemoveFile", "ShowErrorToast", "ShowItems", "ValidationError", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$ActivityResult;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$Back;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$FilesPicker;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$FilesUpload;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$Finish;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$FormParametersSlots;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$HasUploadData;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$HideKeyboard;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$Initial;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$IsLoading;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$ItemsUpdate;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$OpenScreen;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$RemoveFile;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$ShowErrorToast;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$ShowItems;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$ValidationError;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface EvidenceDetailsInternalAction extends n {

    /* compiled from: EvidenceDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$ActivityResult;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ActivityResult implements EvidenceDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f149027b;

        public ActivityResult(@l String str) {
            this.f149027b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActivityResult) && L.f(this.f149027b, ((ActivityResult) obj).f149027b);
        }

        public final int hashCode() {
            String str = this.f149027b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ActivityResult(message="), this.f149027b, ')');
        }
    }

    /* compiled from: EvidenceDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$Back;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction;", "()V", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Back implements EvidenceDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Back f149028b = new Back();

        private Back() {
        }
    }

    /* compiled from: EvidenceDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$FilesPicker;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FilesPicker implements EvidenceDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String[] f149029b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final PhotoParameter f149030c;

        public FilesPicker(@k String[] strArr, @l PhotoParameter photoParameter) {
            this.f149029b = strArr;
            this.f149030c = photoParameter;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FilesPicker)) {
                return false;
            }
            FilesPicker filesPicker = (FilesPicker) obj;
            return L.f(this.f149029b, filesPicker.f149029b) && L.f(this.f149030c, filesPicker.f149030c);
        }

        public final int hashCode() {
            int iHashCode = Arrays.hashCode(this.f149029b) * 31;
            PhotoParameter photoParameter = this.f149030c;
            return iHashCode + (photoParameter == null ? 0 : photoParameter.hashCode());
        }

        @k
        public final String toString() {
            return "FilesPicker(mimeTypes=" + Arrays.toString(this.f149029b) + ", fileParameter=" + this.f149030c + ')';
        }
    }

    /* compiled from: EvidenceDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$FilesUpload;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction;", "()V", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FilesUpload implements EvidenceDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final FilesUpload f149031b = new FilesUpload();

        private FilesUpload() {
        }
    }

    /* compiled from: EvidenceDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$Finish;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction;", "()V", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Finish implements EvidenceDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Finish f149032b = new Finish();

        private Finish() {
        }
    }

    /* compiled from: EvidenceDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$FormParametersSlots;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FormParametersSlots implements EvidenceDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<ParameterSlot> f149033b;

        /* JADX WARN: Multi-variable type inference failed */
        public FormParametersSlots(@k List<? extends ParameterSlot> list) {
            this.f149033b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FormParametersSlots) && L.f(this.f149033b, ((FormParametersSlots) obj).f149033b);
        }

        public final int hashCode() {
            return this.f149033b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("FormParametersSlots(slots="), this.f149033b, ')');
        }
    }

    /* compiled from: EvidenceDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$HasUploadData;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HasUploadData implements EvidenceDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<ImageUpload> f149034b;

        /* JADX WARN: Multi-variable type inference failed */
        public HasUploadData(@k List<? extends ImageUpload> list) {
            this.f149034b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HasUploadData) && L.f(this.f149034b, ((HasUploadData) obj).f149034b);
        }

        public final int hashCode() {
            return this.f149034b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("HasUploadData(data="), this.f149034b, ')');
        }
    }

    /* compiled from: EvidenceDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$HideKeyboard;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction;", "()V", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HideKeyboard implements EvidenceDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final HideKeyboard f149035b = new HideKeyboard();

        private HideKeyboard() {
        }
    }

    /* compiled from: EvidenceDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$Initial;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Initial implements EvidenceDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ProofDetailsContent f149036b;

        public Initial(@k ProofDetailsContent proofDetailsContent) {
            this.f149036b = proofDetailsContent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Initial) && L.f(this.f149036b, ((Initial) obj).f149036b);
        }

        public final int hashCode() {
            return this.f149036b.hashCode();
        }

        @k
        public final String toString() {
            return "Initial(data=" + this.f149036b + ')';
        }
    }

    /* compiled from: EvidenceDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$IsLoading;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IsLoading implements EvidenceDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f149037b;

        public IsLoading(boolean z12) {
            this.f149037b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IsLoading) && this.f149037b == ((IsLoading) obj).f149037b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f149037b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("IsLoading(value="), this.f149037b, ')');
        }
    }

    /* compiled from: EvidenceDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$ItemsUpdate;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ItemsUpdate implements EvidenceDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a<? extends com.avito.conveyor_item.a> f149038b;

        public ItemsUpdate(@k a<? extends com.avito.conveyor_item.a> aVar) {
            this.f149038b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ItemsUpdate) && L.f(this.f149038b, ((ItemsUpdate) obj).f149038b);
        }

        public final int hashCode() {
            return this.f149038b.hashCode();
        }

        @k
        public final String toString() {
            return "ItemsUpdate(dataSource=" + this.f149038b + ')';
        }
    }

    /* compiled from: EvidenceDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$OpenScreen;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenScreen implements EvidenceDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f149039b;

        public OpenScreen(@k DeepLink deepLink) {
            this.f149039b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenScreen) && L.f(this.f149039b, ((OpenScreen) obj).f149039b);
        }

        public final int hashCode() {
            return this.f149039b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenScreen(deeplink="), this.f149039b, ')');
        }
    }

    /* compiled from: EvidenceDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$RemoveFile;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RemoveFile implements EvidenceDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final G f149040b;

        public RemoveFile(@k G g12) {
            this.f149040b = g12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoveFile) && L.f(this.f149040b, ((RemoveFile) obj).f149040b);
        }

        public final int hashCode() {
            return this.f149040b.hashCode();
        }

        @k
        public final String toString() {
            return "RemoveFile(data=" + this.f149040b + ')';
        }
    }

    /* compiled from: EvidenceDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$ShowErrorToast;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowErrorToast implements EvidenceDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f149041b;

        public ShowErrorToast(@k Throwable th2) {
            this.f149041b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowErrorToast) && L.f(this.f149041b, ((ShowErrorToast) obj).f149041b);
        }

        public final int hashCode() {
            return this.f149041b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("ShowErrorToast(error="), this.f149041b, ')');
        }
    }

    /* compiled from: EvidenceDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$ShowItems;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction;", "()V", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowItems implements EvidenceDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowItems f149042b = new ShowItems();

        private ShowItems() {
        }
    }

    /* compiled from: EvidenceDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$ValidationError;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ValidationError implements EvidenceDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f149043b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f149044c;

        public ValidationError(int i12, boolean z12) {
            this.f149043b = i12;
            this.f149044c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValidationError)) {
                return false;
            }
            ValidationError validationError = (ValidationError) obj;
            return this.f149043b == validationError.f149043b && this.f149044c == validationError.f149044c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f149044c) + (Integer.hashCode(this.f149043b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ValidationError(notificationIndex=");
            sb2.append(this.f149043b);
            sb2.append(", uploadInProgress=");
            return r.x(sb2, this.f149044c, ')');
        }
    }
}

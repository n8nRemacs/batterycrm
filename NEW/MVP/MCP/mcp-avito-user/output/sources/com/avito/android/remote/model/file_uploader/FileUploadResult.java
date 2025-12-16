package com.avito.android.remote.model.file_uploader;

import Y61.k;
import Y61.l;
import aW.InterfaceC19824b;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FileUploadResult.kt */
@InterfaceC19824b
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/file_uploader/FileUploadResult;", "", "Error", "Success", "Lcom/avito/android/remote/model/file_uploader/FileUploadResult$Error;", "Lcom/avito/android/remote/model/file_uploader/FileUploadResult$Success;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface FileUploadResult {

    /* compiled from: FileUploadResult.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/file_uploader/FileUploadResult$Error;", "Lcom/avito/android/remote/model/file_uploader/FileUploadResult;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements FileUploadResult {

        @c("message")
        @l
        private final String message;

        /* JADX WARN: Multi-variable type inference failed */
        public Error() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @k
        public final Error copy(@l String message) {
            return new Error(message);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && L.f(this.message, ((Error) other).message);
        }

        @l
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("Error(message="), this.message, ')');
        }

        public Error(@l String str) {
            this.message = str;
        }

        public /* synthetic */ Error(String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: FileUploadResult.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/file_uploader/FileUploadResult$Success;", "Lcom/avito/android/remote/model/file_uploader/FileUploadResult;", "id", "", "type", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getType", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Success implements FileUploadResult {

        @c("id")
        @k
        private final String id;

        @c("name")
        @l
        private final String name;

        @c(MessageBody.File.MIME_TYPE)
        @l
        private final String type;

        public Success(@k String str, @l String str2, @l String str3) {
            this.id = str;
            this.type = str2;
            this.name = str3;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, String str2, String str3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = success.id;
            }
            if ((i12 & 2) != 0) {
                str2 = success.type;
            }
            if ((i12 & 4) != 0) {
                str3 = success.name;
            }
            return success.copy(str, str2, str3);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @k
        public final Success copy(@k String id2, @l String type, @l String name) {
            return new Success(id2, type, name);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return L.f(this.id, success.id) && L.f(this.type, success.type) && L.f(this.name, success.name);
        }

        @k
        public final String getId() {
            return this.id;
        }

        @l
        public final String getName() {
            return this.name;
        }

        @l
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.type;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Success(id=");
            sb2.append(this.id);
            sb2.append(", type=");
            sb2.append(this.type);
            sb2.append(", name=");
            return C22026a.c(sb2, this.name, ')');
        }
    }
}

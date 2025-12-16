package com.avito.android.beduin.common.component.file_uploader;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinFileUploaderModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\b\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0006\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/ValidationRule;", "Landroid/os/Parcelable;", "", "message", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "Companion", "a", "b", "DeletingFilesRule", "FileTypesRule", "MaxFileSizeRule", "MaxFilesCountRule", "MinFilesCountRule", "UploadingFilesRule", "Lcom/avito/android/beduin/common/component/file_uploader/ValidationRule$DeletingFilesRule;", "Lcom/avito/android/beduin/common/component/file_uploader/ValidationRule$FileTypesRule;", "Lcom/avito/android/beduin/common/component/file_uploader/ValidationRule$MaxFileSizeRule;", "Lcom/avito/android/beduin/common/component/file_uploader/ValidationRule$MaxFilesCountRule;", "Lcom/avito/android/beduin/common/component/file_uploader/ValidationRule$MinFilesCountRule;", "Lcom/avito/android/beduin/common/component/file_uploader/ValidationRule$UploadingFilesRule;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class ValidationRule implements Parcelable {

    @Y61.k
    public static final String FILE_TYPES_RULE = "fileTypes";

    @Y61.k
    public static final String MAX_FILES_COUNT_RULE = "maxFilesCount";

    @Y61.k
    public static final String MAX_FILE_SIZE_RULE = "maxFileSize";

    @Y61.k
    public static final String MIN_FILES_COUNT_RULE = "minFilesCount";

    @Y61.k
    private final String message;

    /* compiled from: BeduinFileUploaderModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/ValidationRule$DeletingFilesRule;", "Lcom/avito/android/beduin/common/component/file_uploader/ValidationRule;", "", "_message", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeletingFilesRule extends ValidationRule {

        @Y61.k
        public static final Parcelable.Creator<DeletingFilesRule> CREATOR = new a();

        @com.google.gson.annotations.c("errorMessage")
        @Y61.k
        private final String _message;

        /* compiled from: BeduinFileUploaderModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DeletingFilesRule> {
            @Override // android.os.Parcelable.Creator
            public final DeletingFilesRule createFromParcel(Parcel parcel) {
                return new DeletingFilesRule(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final DeletingFilesRule[] newArray(int i12) {
                return new DeletingFilesRule[i12];
            }
        }

        public DeletingFilesRule(@Y61.k String str) {
            super(str, null);
            this._message = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeletingFilesRule) && L.f(this._message, ((DeletingFilesRule) obj)._message);
        }

        public final int hashCode() {
            return this._message.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("DeletingFilesRule(_message="), this._message, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this._message);
        }
    }

    /* compiled from: BeduinFileUploaderModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/ValidationRule$FileTypesRule;", "Lcom/avito/android/beduin/common/component/file_uploader/ValidationRule;", "", "_message", "", "value", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FileTypesRule extends ValidationRule {

        @Y61.k
        public static final Parcelable.Creator<FileTypesRule> CREATOR = new a();

        @com.google.gson.annotations.c("errorMessage")
        @Y61.k
        private final String _message;

        @com.google.gson.annotations.c("value")
        @Y61.k
        private final List<String> value;

        /* compiled from: BeduinFileUploaderModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FileTypesRule> {
            @Override // android.os.Parcelable.Creator
            public final FileTypesRule createFromParcel(Parcel parcel) {
                return new FileTypesRule(parcel.readString(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final FileTypesRule[] newArray(int i12) {
                return new FileTypesRule[i12];
            }
        }

        public FileTypesRule(@Y61.k String str, @Y61.k List<String> list) {
            super(str, null);
            this._message = str;
            this.value = list;
        }

        @Y61.k
        public final List<String> c() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FileTypesRule)) {
                return false;
            }
            FileTypesRule fileTypesRule = (FileTypesRule) obj;
            return L.f(this._message, fileTypesRule._message) && L.f(this.value, fileTypesRule.value);
        }

        public final int hashCode() {
            return this.value.hashCode() + (this._message.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FileTypesRule(_message=");
            sb2.append(this._message);
            sb2.append(", value=");
            return H.p(sb2, this.value, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this._message);
            parcel.writeStringList(this.value);
        }
    }

    /* compiled from: BeduinFileUploaderModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/ValidationRule$MaxFileSizeRule;", "Lcom/avito/android/beduin/common/component/file_uploader/ValidationRule;", "", "_message", "", "value", "<init>", "(Ljava/lang/String;I)V", "Ljava/lang/String;", "I", "c", "()I", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MaxFileSizeRule extends ValidationRule {

        @Y61.k
        public static final Parcelable.Creator<MaxFileSizeRule> CREATOR = new a();

        @com.google.gson.annotations.c("errorMessage")
        @Y61.k
        private final String _message;

        @com.google.gson.annotations.c("value")
        private final int value;

        /* compiled from: BeduinFileUploaderModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MaxFileSizeRule> {
            @Override // android.os.Parcelable.Creator
            public final MaxFileSizeRule createFromParcel(Parcel parcel) {
                return new MaxFileSizeRule(parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final MaxFileSizeRule[] newArray(int i12) {
                return new MaxFileSizeRule[i12];
            }
        }

        public MaxFileSizeRule(@Y61.k String str, int i12) {
            super(str, null);
            this._message = str;
            this.value = i12;
        }

        /* renamed from: c, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MaxFileSizeRule)) {
                return false;
            }
            MaxFileSizeRule maxFileSizeRule = (MaxFileSizeRule) obj;
            return L.f(this._message, maxFileSizeRule._message) && this.value == maxFileSizeRule.value;
        }

        public final int hashCode() {
            return Integer.hashCode(this.value) + (this._message.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MaxFileSizeRule(_message=");
            sb2.append(this._message);
            sb2.append(", value=");
            return androidx.appcompat.app.r.t(sb2, this.value, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this._message);
            parcel.writeInt(this.value);
        }
    }

    /* compiled from: BeduinFileUploaderModel.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\tR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/ValidationRule$MaxFilesCountRule;", "Lcom/avito/android/beduin/common/component/file_uploader/ValidationRule;", "Lcom/avito/android/beduin/common/component/file_uploader/ValidationRule$b;", "", "_message", "", "value", "<init>", "(Ljava/lang/String;I)V", "Ljava/lang/String;", "I", "c", "()I", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MaxFilesCountRule extends ValidationRule implements b {

        @Y61.k
        public static final Parcelable.Creator<MaxFilesCountRule> CREATOR = new a();

        @com.google.gson.annotations.c("errorMessage")
        @Y61.k
        private final String _message;

        @com.google.gson.annotations.c("value")
        private final int value;

        /* compiled from: BeduinFileUploaderModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MaxFilesCountRule> {
            @Override // android.os.Parcelable.Creator
            public final MaxFilesCountRule createFromParcel(Parcel parcel) {
                return new MaxFilesCountRule(parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final MaxFilesCountRule[] newArray(int i12) {
                return new MaxFilesCountRule[i12];
            }
        }

        public MaxFilesCountRule(@Y61.k String str, int i12) {
            super(str, null);
            this._message = str;
            this.value = i12;
        }

        /* renamed from: c, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MaxFilesCountRule)) {
                return false;
            }
            MaxFilesCountRule maxFilesCountRule = (MaxFilesCountRule) obj;
            return L.f(this._message, maxFilesCountRule._message) && this.value == maxFilesCountRule.value;
        }

        public final int hashCode() {
            return Integer.hashCode(this.value) + (this._message.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MaxFilesCountRule(_message=");
            sb2.append(this._message);
            sb2.append(", value=");
            return androidx.appcompat.app.r.t(sb2, this.value, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this._message);
            parcel.writeInt(this.value);
        }
    }

    /* compiled from: BeduinFileUploaderModel.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\tR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/ValidationRule$MinFilesCountRule;", "Lcom/avito/android/beduin/common/component/file_uploader/ValidationRule;", "Lcom/avito/android/beduin/common/component/file_uploader/ValidationRule$b;", "", "_message", "", "value", "<init>", "(Ljava/lang/String;I)V", "Ljava/lang/String;", "I", "c", "()I", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MinFilesCountRule extends ValidationRule implements b {

        @Y61.k
        public static final Parcelable.Creator<MinFilesCountRule> CREATOR = new a();

        @com.google.gson.annotations.c("errorMessage")
        @Y61.k
        private final String _message;

        @com.google.gson.annotations.c("value")
        private final int value;

        /* compiled from: BeduinFileUploaderModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MinFilesCountRule> {
            @Override // android.os.Parcelable.Creator
            public final MinFilesCountRule createFromParcel(Parcel parcel) {
                return new MinFilesCountRule(parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final MinFilesCountRule[] newArray(int i12) {
                return new MinFilesCountRule[i12];
            }
        }

        public MinFilesCountRule(@Y61.k String str, int i12) {
            super(str, null);
            this._message = str;
            this.value = i12;
        }

        /* renamed from: c, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MinFilesCountRule)) {
                return false;
            }
            MinFilesCountRule minFilesCountRule = (MinFilesCountRule) obj;
            return L.f(this._message, minFilesCountRule._message) && this.value == minFilesCountRule.value;
        }

        public final int hashCode() {
            return Integer.hashCode(this.value) + (this._message.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MinFilesCountRule(_message=");
            sb2.append(this._message);
            sb2.append(", value=");
            return androidx.appcompat.app.r.t(sb2, this.value, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this._message);
            parcel.writeInt(this.value);
        }
    }

    /* compiled from: BeduinFileUploaderModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/ValidationRule$UploadingFilesRule;", "Lcom/avito/android/beduin/common/component/file_uploader/ValidationRule;", "", "_message", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UploadingFilesRule extends ValidationRule {

        @Y61.k
        public static final Parcelable.Creator<UploadingFilesRule> CREATOR = new a();

        @com.google.gson.annotations.c("errorMessage")
        @Y61.k
        private final String _message;

        /* compiled from: BeduinFileUploaderModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UploadingFilesRule> {
            @Override // android.os.Parcelable.Creator
            public final UploadingFilesRule createFromParcel(Parcel parcel) {
                return new UploadingFilesRule(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final UploadingFilesRule[] newArray(int i12) {
                return new UploadingFilesRule[i12];
            }
        }

        public UploadingFilesRule(@Y61.k String str) {
            super(str, null);
            this._message = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UploadingFilesRule) && L.f(this._message, ((UploadingFilesRule) obj)._message);
        }

        public final int hashCode() {
            return this._message.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("UploadingFilesRule(_message="), this._message, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this._message);
        }
    }

    /* compiled from: BeduinFileUploaderModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/ValidationRule$b;", "", "Lcom/avito/android/beduin/common/component/file_uploader/ValidationRule$MaxFilesCountRule;", "Lcom/avito/android/beduin/common/component/file_uploader/ValidationRule$MinFilesCountRule;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
    }

    public /* synthetic */ ValidationRule(String str, C42822w c42822w) {
        this(str);
    }

    @Y61.k
    public final String getMessage() {
        return this.message;
    }

    private ValidationRule(String str) {
        this.message = str;
    }
}

package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FileUploaderParameter.kt */
@d
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0004\u0007\b\t\nB\u0011\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/FileUploadValidationRule;", "Landroid/os/Parcelable;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "Companion", "FileSizeRule", "FileTypesRule", "FilesCountRule", "Lcom/avito/android/remote/model/category_parameters/FileUploadValidationRule$FileSizeRule;", "Lcom/avito/android/remote/model/category_parameters/FileUploadValidationRule$FileTypesRule;", "Lcom/avito/android/remote/model/category_parameters/FileUploadValidationRule$FilesCountRule;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class FileUploadValidationRule implements Parcelable {

    @k
    public static final String FILES_COUNT_RULE = "filesCount";

    @k
    public static final String FILE_SIZE_RULE = "size";

    @k
    public static final String FILE_TYPES_RULE = "fileTypes";

    @l
    private final String message;

    /* compiled from: FileUploaderParameter.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/FileUploadValidationRule$FileSizeRule;", "Lcom/avito/android/remote/model/category_parameters/FileUploadValidationRule;", "", "_message", "", "value", "<init>", "(Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/avito/android/remote/model/category_parameters/FileUploadValidationRule$FileSizeRule;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "I", "getValue", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FileSizeRule extends FileUploadValidationRule {

        @k
        public static final Parcelable.Creator<FileSizeRule> CREATOR = new Creator();

        @l
        private final String _message;
        private final int value;

        /* compiled from: FileUploaderParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FileSizeRule> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FileSizeRule createFromParcel(@k Parcel parcel) {
                return new FileSizeRule(parcel.readString(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FileSizeRule[] newArray(int i12) {
                return new FileSizeRule[i12];
            }
        }

        public FileSizeRule(@l String str, int i12) {
            super(str, null);
            this._message = str;
            this.value = i12;
        }

        /* renamed from: component1, reason: from getter */
        private final String get_message() {
            return this._message;
        }

        public static /* synthetic */ FileSizeRule copy$default(FileSizeRule fileSizeRule, String str, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = fileSizeRule._message;
            }
            if ((i13 & 2) != 0) {
                i12 = fileSizeRule.value;
            }
            return fileSizeRule.copy(str, i12);
        }

        /* renamed from: component2, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        @k
        public final FileSizeRule copy(@l String _message, int value) {
            return new FileSizeRule(_message, value);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FileSizeRule)) {
                return false;
            }
            FileSizeRule fileSizeRule = (FileSizeRule) other;
            return L.f(this._message, fileSizeRule._message) && this.value == fileSizeRule.value;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this._message;
            return Integer.hashCode(this.value) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("FileSizeRule(_message=");
            sb2.append(this._message);
            sb2.append(", value=");
            return r.t(sb2, this.value, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this._message);
            parcel.writeInt(this.value);
        }
    }

    /* compiled from: FileUploaderParameter.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000b¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/FileUploadValidationRule$FileTypesRule;", "Lcom/avito/android/remote/model/category_parameters/FileUploadValidationRule;", "", "_message", "", "value", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/category_parameters/FileUploadValidationRule$FileTypesRule;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "Ljava/util/List;", "getValue", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FileTypesRule extends FileUploadValidationRule {

        @k
        public static final Parcelable.Creator<FileTypesRule> CREATOR = new Creator();

        @l
        private final String _message;

        @k
        private final List<String> value;

        /* compiled from: FileUploaderParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FileTypesRule> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FileTypesRule createFromParcel(@k Parcel parcel) {
                return new FileTypesRule(parcel.readString(), parcel.createStringArrayList());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FileTypesRule[] newArray(int i12) {
                return new FileTypesRule[i12];
            }
        }

        public FileTypesRule(@l String str, @k List<String> list) {
            super(str, null);
            this._message = str;
            this.value = list;
        }

        /* renamed from: component1, reason: from getter */
        private final String get_message() {
            return this._message;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FileTypesRule copy$default(FileTypesRule fileTypesRule, String str, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = fileTypesRule._message;
            }
            if ((i12 & 2) != 0) {
                list = fileTypesRule.value;
            }
            return fileTypesRule.copy(str, list);
        }

        @k
        public final List<String> component2() {
            return this.value;
        }

        @k
        public final FileTypesRule copy(@l String _message, @k List<String> value) {
            return new FileTypesRule(_message, value);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FileTypesRule)) {
                return false;
            }
            FileTypesRule fileTypesRule = (FileTypesRule) other;
            return L.f(this._message, fileTypesRule._message) && L.f(this.value, fileTypesRule.value);
        }

        @k
        public final List<String> getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this._message;
            return this.value.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("FileTypesRule(_message=");
            sb2.append(this._message);
            sb2.append(", value=");
            return H.p(sb2, this.value, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this._message);
            parcel.writeStringList(this.value);
        }
    }

    /* compiled from: FileUploaderParameter.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/FileUploadValidationRule$FilesCountRule;", "Lcom/avito/android/remote/model/category_parameters/FileUploadValidationRule;", "", "_message", "", "value", "<init>", "(Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/avito/android/remote/model/category_parameters/FileUploadValidationRule$FilesCountRule;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "I", "getValue", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FilesCountRule extends FileUploadValidationRule {

        @k
        public static final Parcelable.Creator<FilesCountRule> CREATOR = new Creator();

        @l
        private final String _message;
        private final int value;

        /* compiled from: FileUploaderParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FilesCountRule> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FilesCountRule createFromParcel(@k Parcel parcel) {
                return new FilesCountRule(parcel.readString(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FilesCountRule[] newArray(int i12) {
                return new FilesCountRule[i12];
            }
        }

        public FilesCountRule(@l String str, int i12) {
            super(str, null);
            this._message = str;
            this.value = i12;
        }

        /* renamed from: component1, reason: from getter */
        private final String get_message() {
            return this._message;
        }

        public static /* synthetic */ FilesCountRule copy$default(FilesCountRule filesCountRule, String str, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = filesCountRule._message;
            }
            if ((i13 & 2) != 0) {
                i12 = filesCountRule.value;
            }
            return filesCountRule.copy(str, i12);
        }

        /* renamed from: component2, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        @k
        public final FilesCountRule copy(@l String _message, int value) {
            return new FilesCountRule(_message, value);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FilesCountRule)) {
                return false;
            }
            FilesCountRule filesCountRule = (FilesCountRule) other;
            return L.f(this._message, filesCountRule._message) && this.value == filesCountRule.value;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this._message;
            return Integer.hashCode(this.value) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("FilesCountRule(_message=");
            sb2.append(this._message);
            sb2.append(", value=");
            return r.t(sb2, this.value, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this._message);
            parcel.writeInt(this.value);
        }
    }

    public /* synthetic */ FileUploadValidationRule(String str, C42822w c42822w) {
        this(str);
    }

    @l
    public final String getMessage() {
        return this.message;
    }

    private FileUploadValidationRule(String str) {
        this.message = str;
    }
}

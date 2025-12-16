package com.avito.android.beduin.common.component.file_uploader.file;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.file_uploader.FileState;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FileItem.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\bHÂ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\nHÂ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JF\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b*\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010.R\u0011\u00100\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b/\u0010\u000fR\u0011\u00101\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/file/FileItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "", "stringId", "name", "", "size", "Lcom/avito/android/beduin/common/component/file_uploader/FileState;", "_state", "", "_isUploaded", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLcom/avito/android/beduin/common/component/file_uploader/FileState;Ljava/lang/Boolean;)V", "component4", "()Lcom/avito/android/beduin/common/component/file_uploader/FileState;", "component5", "()Ljava/lang/Boolean;", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "copy", "(Ljava/lang/String;Ljava/lang/String;JLcom/avito/android/beduin/common/component/file_uploader/FileState;Ljava/lang/Boolean;)Lcom/avito/android/beduin/common/component/file_uploader/file/FileItem;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getStringId", "getName", "J", "getSize", "Lcom/avito/android/beduin/common/component/file_uploader/FileState;", "Ljava/lang/Boolean;", "getState", VoiceInfo.STATE, "isUploaded", "()Z", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FileItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<FileItem> CREATOR = new a();

    @l
    private final transient Boolean _isUploaded;

    @l
    private final transient FileState _state;

    @com.google.gson.annotations.c("name")
    @k
    private final String name;

    @com.google.gson.annotations.c("size")
    private final long size;

    @com.google.gson.annotations.c("id")
    @k
    private final String stringId;

    /* compiled from: FileItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FileItem> {
        @Override // android.os.Parcelable.Creator
        public final FileItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            long j12 = parcel.readLong();
            FileState fileState = (FileState) parcel.readParcelable(FileItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FileItem(string, string2, j12, fileState, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final FileItem[] newArray(int i12) {
            return new FileItem[i12];
        }
    }

    public FileItem(@k String str, @k String str2, long j12, @l FileState fileState, @l Boolean bool) {
        this.stringId = str;
        this.name = str2;
        this.size = j12;
        this._state = fileState;
        this._isUploaded = bool;
    }

    /* renamed from: component4, reason: from getter */
    private final FileState get_state() {
        return this._state;
    }

    /* renamed from: component5, reason: from getter */
    private final Boolean get_isUploaded() {
        return this._isUploaded;
    }

    public static /* synthetic */ FileItem copy$default(FileItem fileItem, String str, String str2, long j12, FileState fileState, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = fileItem.stringId;
        }
        if ((i12 & 2) != 0) {
            str2 = fileItem.name;
        }
        String str3 = str2;
        if ((i12 & 4) != 0) {
            j12 = fileItem.size;
        }
        long j13 = j12;
        if ((i12 & 8) != 0) {
            fileState = fileItem._state;
        }
        FileState fileState2 = fileState;
        if ((i12 & 16) != 0) {
            bool = fileItem._isUploaded;
        }
        return fileItem.copy(str, str3, j13, fileState2, bool);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getStringId() {
        return this.stringId;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @k
    public final FileItem copy(@k String stringId, @k String name, long size, @l FileState _state, @l Boolean _isUploaded) {
        return new FileItem(stringId, name, size, _state, _isUploaded);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileItem)) {
            return false;
        }
        FileItem fileItem = (FileItem) other;
        return L.f(this.stringId, fileItem.stringId) && L.f(this.name, fileItem.name) && this.size == fileItem.size && L.f(this._state, fileItem._state) && L.f(this._isUploaded, fileItem._isUploaded);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public long getF85686c() {
        return getF85687d().hashCode();
    }

    @k
    public final String getName() {
        return this.name;
    }

    public final long getSize() {
        return this.size;
    }

    @k
    public final FileState getState() {
        FileState fileState = this._state;
        return fileState == null ? FileState.Idle.f101210b : fileState;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public String getF85687d() {
        return this.stringId;
    }

    public int hashCode() {
        int iG2 = r.g(H.d(this.stringId.hashCode() * 31, 31, this.name), 31, this.size);
        FileState fileState = this._state;
        int iHashCode = (iG2 + (fileState == null ? 0 : fileState.hashCode())) * 31;
        Boolean bool = this._isUploaded;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final boolean isUploaded() {
        Boolean bool = this._isUploaded;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FileItem(stringId=");
        sb2.append(this.stringId);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", size=");
        sb2.append(this.size);
        sb2.append(", _state=");
        sb2.append(this._state);
        sb2.append(", _isUploaded=");
        return C0.g(sb2, this._isUploaded, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.stringId);
        parcel.writeString(this.name);
        parcel.writeLong(this.size);
        parcel.writeParcelable(this._state, flags);
        Boolean bool = this._isUploaded;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}

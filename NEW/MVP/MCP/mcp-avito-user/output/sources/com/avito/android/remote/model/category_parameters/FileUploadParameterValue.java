package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.FileState;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import nj0.InterfaceC44435b;

/* compiled from: FileUploaderParameter.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u0000 52\u00020\u0001:\u00015BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\bHÂ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\nHÂ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JV\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0013J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\"\u0010\u001dJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u0017R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00100R\u0011\u00102\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b1\u0010\u000fR\u0011\u00103\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/FileUploadParameterValue;", "Landroid/os/Parcelable;", "", "id", "type", "name", "", "size", "Lcom/avito/android/remote/model/category_parameters/FileState;", "_state", "", "_isUploaded", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/avito/android/remote/model/category_parameters/FileState;Ljava/lang/Boolean;)V", "component5", "()Lcom/avito/android/remote/model/category_parameters/FileState;", "component6", "()Ljava/lang/Boolean;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/avito/android/remote/model/category_parameters/FileState;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/category_parameters/FileUploadParameterValue;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getType", "getName", "Ljava/lang/Long;", "getSize", "Lcom/avito/android/remote/model/category_parameters/FileState;", "Ljava/lang/Boolean;", "getState", VoiceInfo.STATE, "isUploaded", "()Z", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FileUploadParameterValue implements Parcelable {

    @k
    @Deprecated
    public static final String ID_KEY = "id";

    @k
    @Deprecated
    public static final String NAME_KEY = "name";

    @k
    @Deprecated
    public static final String SIZE_KEY = "size";

    @k
    @Deprecated
    public static final String TYPE_KEY = "type";

    @l
    private final transient Boolean _isUploaded;

    @l
    private final transient FileState _state;

    @c("id")
    @k
    private final String id;

    @c("name")
    @l
    private final String name;

    @c("size")
    @l
    private final Long size;

    @c("type")
    @l
    private final String type;

    @k
    private static final Companion Companion = new Companion(null);

    @k
    public static final Parcelable.Creator<FileUploadParameterValue> CREATOR = new Creator();

    /* compiled from: FileUploaderParameter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/FileUploadParameterValue$Companion;", "", "()V", "ID_KEY", "", "NAME_KEY", "SIZE_KEY", "TYPE_KEY", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: FileUploaderParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FileUploadParameterValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FileUploadParameterValue createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            FileState fileState = (FileState) parcel.readParcelable(FileUploadParameterValue.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FileUploadParameterValue(string, string2, string3, lValueOf, fileState, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FileUploadParameterValue[] newArray(int i12) {
            return new FileUploadParameterValue[i12];
        }
    }

    public FileUploadParameterValue(@k String str, @l String str2, @l String str3, @l Long l12, @l FileState fileState, @l Boolean bool) {
        this.id = str;
        this.type = str2;
        this.name = str3;
        this.size = l12;
        this._state = fileState;
        this._isUploaded = bool;
    }

    /* renamed from: component5, reason: from getter */
    private final FileState get_state() {
        return this._state;
    }

    /* renamed from: component6, reason: from getter */
    private final Boolean get_isUploaded() {
        return this._isUploaded;
    }

    public static /* synthetic */ FileUploadParameterValue copy$default(FileUploadParameterValue fileUploadParameterValue, String str, String str2, String str3, Long l12, FileState fileState, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = fileUploadParameterValue.id;
        }
        if ((i12 & 2) != 0) {
            str2 = fileUploadParameterValue.type;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            str3 = fileUploadParameterValue.name;
        }
        String str5 = str3;
        if ((i12 & 8) != 0) {
            l12 = fileUploadParameterValue.size;
        }
        Long l13 = l12;
        if ((i12 & 16) != 0) {
            fileState = fileUploadParameterValue._state;
        }
        FileState fileState2 = fileState;
        if ((i12 & 32) != 0) {
            bool = fileUploadParameterValue._isUploaded;
        }
        return fileUploadParameterValue.copy(str, str4, str5, l13, fileState2, bool);
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

    @l
    /* renamed from: component4, reason: from getter */
    public final Long getSize() {
        return this.size;
    }

    @k
    public final FileUploadParameterValue copy(@k String id2, @l String type, @l String name, @l Long size, @l FileState _state, @l Boolean _isUploaded) {
        return new FileUploadParameterValue(id2, type, name, size, _state, _isUploaded);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileUploadParameterValue)) {
            return false;
        }
        FileUploadParameterValue fileUploadParameterValue = (FileUploadParameterValue) other;
        return L.f(this.id, fileUploadParameterValue.id) && L.f(this.type, fileUploadParameterValue.type) && L.f(this.name, fileUploadParameterValue.name) && L.f(this.size, fileUploadParameterValue.size) && L.f(this._state, fileUploadParameterValue._state) && L.f(this._isUploaded, fileUploadParameterValue._isUploaded);
    }

    @InterfaceC44435b(name = "id")
    @k
    public final String getId() {
        return this.id;
    }

    @l
    @InterfaceC44435b(name = "name")
    public final String getName() {
        return this.name;
    }

    @l
    @InterfaceC44435b(name = "size")
    public final Long getSize() {
        return this.size;
    }

    @k
    public final FileState getState() {
        FileState fileState = this._state;
        return fileState == null ? FileState.Idle.INSTANCE : fileState;
    }

    @l
    @InterfaceC44435b(name = "type")
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.type;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l12 = this.size;
        int iHashCode4 = (iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        FileState fileState = this._state;
        int iHashCode5 = (iHashCode4 + (fileState == null ? 0 : fileState.hashCode())) * 31;
        Boolean bool = this._isUploaded;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
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
        StringBuilder sb2 = new StringBuilder("FileUploadParameterValue(id=");
        sb2.append(this.id);
        sb2.append(", type=");
        sb2.append(this.type);
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
        parcel.writeString(this.id);
        parcel.writeString(this.type);
        parcel.writeString(this.name);
        Long l12 = this.size;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeParcelable(this._state, flags);
        Boolean bool = this._isUploaded;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public /* synthetic */ FileUploadParameterValue(String str, String str2, String str3, Long l12, FileState fileState, Boolean bool, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) == 0 ? l12 : null, (i12 & 16) != 0 ? FileState.Idle.INSTANCE : fileState, (i12 & 32) != 0 ? Boolean.TRUE : bool);
    }
}

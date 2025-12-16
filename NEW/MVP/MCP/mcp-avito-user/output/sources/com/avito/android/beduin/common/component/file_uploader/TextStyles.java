package com.avito.android.beduin.common.component.file_uploader;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinFileUploaderModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001%B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\b\u000f\u0010\rJ@\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#¨\u0006&"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/TextStyles;", "Landroid/os/Parcelable;", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "_theme", "", "_fileNameStyle", "_fileSizeStyle", "_errorStyle", "<init>", "(Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/beduin/common/component/file_uploader/TextStyles;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "Ljava/lang/String;", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TextStyles implements Parcelable {

    @com.google.gson.annotations.c("errorStyle")
    @Y61.l
    private final String _errorStyle;

    @com.google.gson.annotations.c("fileNameStyle")
    @Y61.l
    private final String _fileNameStyle;

    @com.google.gson.annotations.c("fileSizeStyle")
    @Y61.l
    private final String _fileSizeStyle;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
    @Y61.l
    private final BeduinComponentTheme _theme;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<TextStyles> CREATOR = new b();

    /* compiled from: BeduinFileUploaderModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/TextStyles$a;", "", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.file_uploader.TextStyles$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinFileUploaderModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<TextStyles> {
        @Override // android.os.Parcelable.Creator
        public final TextStyles createFromParcel(Parcel parcel) {
            return new TextStyles(parcel.readInt() == 0 ? null : BeduinComponentTheme.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TextStyles[] newArray(int i12) {
            return new TextStyles[i12];
        }
    }

    public TextStyles() {
        this(null, null, null, null, 15, null);
    }

    /* renamed from: component1, reason: from getter */
    private final BeduinComponentTheme get_theme() {
        return this._theme;
    }

    /* renamed from: component2, reason: from getter */
    private final String get_fileNameStyle() {
        return this._fileNameStyle;
    }

    /* renamed from: component3, reason: from getter */
    private final String get_fileSizeStyle() {
        return this._fileSizeStyle;
    }

    /* renamed from: component4, reason: from getter */
    private final String get_errorStyle() {
        return this._errorStyle;
    }

    public static /* synthetic */ TextStyles copy$default(TextStyles textStyles, BeduinComponentTheme beduinComponentTheme, String str, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            beduinComponentTheme = textStyles._theme;
        }
        if ((i12 & 2) != 0) {
            str = textStyles._fileNameStyle;
        }
        if ((i12 & 4) != 0) {
            str2 = textStyles._fileSizeStyle;
        }
        if ((i12 & 8) != 0) {
            str3 = textStyles._errorStyle;
        }
        return textStyles.copy(beduinComponentTheme, str, str2, str3);
    }

    @Y61.k
    public final TextStyles copy(@Y61.l BeduinComponentTheme _theme, @Y61.l String _fileNameStyle, @Y61.l String _fileSizeStyle, @Y61.l String _errorStyle) {
        return new TextStyles(_theme, _fileNameStyle, _fileSizeStyle, _errorStyle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextStyles)) {
            return false;
        }
        TextStyles textStyles = (TextStyles) other;
        return this._theme == textStyles._theme && L.f(this._fileNameStyle, textStyles._fileNameStyle) && L.f(this._fileSizeStyle, textStyles._fileSizeStyle) && L.f(this._errorStyle, textStyles._errorStyle);
    }

    public int hashCode() {
        BeduinComponentTheme beduinComponentTheme = this._theme;
        int iHashCode = (beduinComponentTheme == null ? 0 : beduinComponentTheme.hashCode()) * 31;
        String str = this._fileNameStyle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this._fileSizeStyle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this._errorStyle;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TextStyles(_theme=");
        sb2.append(this._theme);
        sb2.append(", _fileNameStyle=");
        sb2.append(this._fileNameStyle);
        sb2.append(", _fileSizeStyle=");
        sb2.append(this._fileSizeStyle);
        sb2.append(", _errorStyle=");
        return C22026a.c(sb2, this._errorStyle, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        BeduinComponentTheme beduinComponentTheme = this._theme;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, flags);
        }
        parcel.writeString(this._fileNameStyle);
        parcel.writeString(this._fileSizeStyle);
        parcel.writeString(this._errorStyle);
    }

    public TextStyles(@Y61.l BeduinComponentTheme beduinComponentTheme, @Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        this._theme = beduinComponentTheme;
        this._fileNameStyle = str;
        this._fileSizeStyle = str2;
        this._errorStyle = str3;
    }

    public /* synthetic */ TextStyles(BeduinComponentTheme beduinComponentTheme, String str, String str2, String str3, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : beduinComponentTheme, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3);
    }
}

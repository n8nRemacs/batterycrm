package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: LegacySerpAdvertBadge.kt */
@d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b!\u0010\u0019R\u001a\u0010'\u001a\u00020\"8VX\u0096\u0004¢\u0006\f\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\u001c\u0010*\u001a\u0004\u0018\u00010\"8VX\u0096\u0004¢\u0006\f\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010$¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/LegacySerpAdvertBadge;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/badge/Badge;", "", "title", "Lcom/avito/android/remote/model/Color;", "titleColor", "titleColorDark", "titleColorName", "backgroundColor", "backgroundColorDark", "backgroundColorName", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Color;Lcom/avito/android/remote/model/Color;Ljava/lang/String;Lcom/avito/android/remote/model/Color;Lcom/avito/android/remote/model/Color;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Color;", "getTitleColor", "()Lcom/avito/android/remote/model/Color;", "getTitleColorDark", "getTitleColorName", "getBackgroundColor", "getBackgroundColorDark", "getBackgroundColorName", "Lcom/avito/android/remote/model/UniversalColor;", "getUniversalTitleColor", "()Lcom/avito/android/remote/model/UniversalColor;", "getUniversalTitleColor$annotations", "()V", "universalTitleColor", "getUniversalBackgroundColor", "getUniversalBackgroundColor$annotations", "universalBackgroundColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LegacySerpAdvertBadge implements Parcelable, com.avito.android.remote.model.badge.Badge {

    @k
    public static final Parcelable.Creator<LegacySerpAdvertBadge> CREATOR = new Creator();

    @c("backgroundColor")
    @l
    private final Color backgroundColor;

    @c("backgroundColorDark")
    @l
    private final Color backgroundColorDark;

    @c("backgroundColorName")
    @l
    private final String backgroundColorName;

    @c("text")
    @k
    private final String title;

    @c("textColor")
    @k
    private final Color titleColor;

    @c("textColorDark")
    @l
    private final Color titleColorDark;

    @c("textColorName")
    @l
    private final String titleColorName;

    /* compiled from: LegacySerpAdvertBadge.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LegacySerpAdvertBadge> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final LegacySerpAdvertBadge createFromParcel(@k Parcel parcel) {
            return new LegacySerpAdvertBadge(parcel.readString(), (Color) parcel.readParcelable(LegacySerpAdvertBadge.class.getClassLoader()), (Color) parcel.readParcelable(LegacySerpAdvertBadge.class.getClassLoader()), parcel.readString(), (Color) parcel.readParcelable(LegacySerpAdvertBadge.class.getClassLoader()), (Color) parcel.readParcelable(LegacySerpAdvertBadge.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final LegacySerpAdvertBadge[] newArray(int i12) {
            return new LegacySerpAdvertBadge[i12];
        }
    }

    public LegacySerpAdvertBadge(@k String str, @k Color color, @l Color color2, @l String str2, @l Color color3, @l Color color4, @l String str3) {
        this.title = str;
        this.titleColor = color;
        this.titleColorDark = color2;
        this.titleColorName = str2;
        this.backgroundColor = color3;
        this.backgroundColorDark = color4;
        this.backgroundColorName = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Color getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    public final Color getBackgroundColorDark() {
        return this.backgroundColorDark;
    }

    @l
    public final String getBackgroundColorName() {
        return this.backgroundColorName;
    }

    @Override // com.avito.android.remote.model.badge.Badge
    @k
    public String getTitle() {
        return this.title;
    }

    @k
    public final Color getTitleColor() {
        return this.titleColor;
    }

    @l
    public final Color getTitleColorDark() {
        return this.titleColorDark;
    }

    @l
    public final String getTitleColorName() {
        return this.titleColorName;
    }

    @Override // com.avito.android.remote.model.badge.Badge
    @l
    /* renamed from: getUniversalBackgroundColor */
    public UniversalColor getF268991d() {
        Color color = this.backgroundColor;
        if (color == null && this.backgroundColorName == null) {
            return null;
        }
        return UniversalColorKt.universalColorOf(this.backgroundColorName, color, this.backgroundColorDark);
    }

    @Override // com.avito.android.remote.model.badge.Badge
    @k
    /* renamed from: getUniversalTitleColor */
    public UniversalColor getF268990c() {
        return UniversalColorKt.universalColorOf(this.titleColorName, this.titleColor, this.titleColorDark);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.titleColor, flags);
        parcel.writeParcelable(this.titleColorDark, flags);
        parcel.writeString(this.titleColorName);
        parcel.writeParcelable(this.backgroundColor, flags);
        parcel.writeParcelable(this.backgroundColorDark, flags);
        parcel.writeString(this.backgroundColorName);
    }

    public static /* synthetic */ void getUniversalBackgroundColor$annotations() {
    }

    public static /* synthetic */ void getUniversalTitleColor$annotations() {
    }
}

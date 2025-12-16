package com.avito.android.mortgage.api.model.landing;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LandingHeader.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/avito/android/mortgage/api/model/landing/TitlePart;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "Lcom/avito/android/mortgage/api/model/landing/TitlePart$TitlePartType;", "typeMeta", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/mortgage/api/model/landing/TitlePart$TitlePartType;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/mortgage/api/model/landing/TitlePart$TitlePartType;", "TitlePartType", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TitlePart implements Parcelable {

    @k
    public static final Parcelable.Creator<TitlePart> CREATOR = new a();

    @c("text")
    @k
    private final AttributedText text;

    @c("type")
    @l
    private final TitlePartType typeMeta;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LandingHeader.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/api/model/landing/TitlePart$TitlePartType;", "", "(Ljava/lang/String;I)V", "PLAIN", "GREEN_BADGE", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TitlePartType {

        @c("green_badge")
        public static final TitlePartType GREEN_BADGE;

        @c("plain")
        public static final TitlePartType PLAIN;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ TitlePartType[] f198262b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f198263c;

        static {
            TitlePartType titlePartType = new TitlePartType("PLAIN", 0);
            PLAIN = titlePartType;
            TitlePartType titlePartType2 = new TitlePartType("GREEN_BADGE", 1);
            GREEN_BADGE = titlePartType2;
            TitlePartType[] titlePartTypeArr = {titlePartType, titlePartType2};
            f198262b = titlePartTypeArr;
            f198263c = kotlin.enums.c.a(titlePartTypeArr);
        }

        private TitlePartType(String str, int i12) {
        }

        public static TitlePartType valueOf(String str) {
            return (TitlePartType) Enum.valueOf(TitlePartType.class, str);
        }

        public static TitlePartType[] values() {
            return (TitlePartType[]) f198262b.clone();
        }
    }

    /* compiled from: LandingHeader.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TitlePart> {
        @Override // android.os.Parcelable.Creator
        public final TitlePart createFromParcel(Parcel parcel) {
            return new TitlePart((AttributedText) parcel.readParcelable(TitlePart.class.getClassLoader()), parcel.readInt() == 0 ? null : TitlePartType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final TitlePart[] newArray(int i12) {
            return new TitlePart[i12];
        }
    }

    public TitlePart(@k AttributedText attributedText, @l TitlePartType titlePartType) {
        this.text = attributedText;
        this.typeMeta = titlePartType;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }

    @k
    public final TitlePartType d() {
        TitlePartType titlePartType = this.typeMeta;
        return titlePartType == null ? TitlePartType.PLAIN : titlePartType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitlePart)) {
            return false;
        }
        TitlePart titlePart = (TitlePart) obj;
        return L.f(this.text, titlePart.text) && this.typeMeta == titlePart.typeMeta;
    }

    public final int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        TitlePartType titlePartType = this.typeMeta;
        return iHashCode + (titlePartType == null ? 0 : titlePartType.hashCode());
    }

    @k
    public final String toString() {
        return "TitlePart(text=" + this.text + ", typeMeta=" + this.typeMeta + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.text, i12);
        TitlePartType titlePartType = this.typeMeta;
        if (titlePartType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(titlePartType.name());
        }
    }
}

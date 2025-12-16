package com.avito.android.beduin.common.component.model;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.component.accordion.s;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Layout.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0010B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/avito/android/beduin/common/component/model/Layout;", "Landroid/os/Parcelable;", "Lcom/avito/android/beduin/common/component/model/Layout$ContentMode;", "contentMode", "", "width", "height", "<init>", "(Lcom/avito/android/beduin/common/component/model/Layout$ContentMode;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Lcom/avito/android/beduin/common/component/model/Layout$ContentMode;", "c", "()Lcom/avito/android/beduin/common/component/model/Layout$ContentMode;", "Ljava/lang/Integer;", "getWidth", "()Ljava/lang/Integer;", "getHeight", "ContentMode", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Layout implements Parcelable {

    @k
    public static final Parcelable.Creator<Layout> CREATOR = new a();

    @com.google.gson.annotations.c("contentMode")
    @l
    private final ContentMode contentMode;

    @com.google.gson.annotations.c("height")
    @l
    private final Integer height;

    @com.google.gson.annotations.c("width")
    @l
    private final Integer width;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Layout.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/beduin/common/component/model/Layout$ContentMode;", "", "", "layoutParam", "<init>", "(Ljava/lang/String;II)V", "FIT_CONTENT", "FILL_PARENT", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ContentMode {

        @com.google.gson.annotations.c("fillParent")
        public static final ContentMode FILL_PARENT;

        @com.google.gson.annotations.c("fitContent")
        public static final ContentMode FIT_CONTENT;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ ContentMode[] f101773c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f101774d;

        /* renamed from: b, reason: collision with root package name */
        public final int f101775b;

        static {
            ContentMode contentMode = new ContentMode("FIT_CONTENT", 0, -2);
            FIT_CONTENT = contentMode;
            ContentMode contentMode2 = new ContentMode("FILL_PARENT", 1, -1);
            FILL_PARENT = contentMode2;
            ContentMode[] contentModeArr = {contentMode, contentMode2};
            f101773c = contentModeArr;
            f101774d = kotlin.enums.c.a(contentModeArr);
        }

        private ContentMode(String str, int i12, int i13) {
            this.f101775b = i13;
        }

        public static ContentMode valueOf(String str) {
            return (ContentMode) Enum.valueOf(ContentMode.class, str);
        }

        public static ContentMode[] values() {
            return (ContentMode[]) f101773c.clone();
        }
    }

    /* compiled from: Layout.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Layout> {
        @Override // android.os.Parcelable.Creator
        public final Layout createFromParcel(Parcel parcel) {
            return new Layout(parcel.readInt() == 0 ? null : ContentMode.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Layout[] newArray(int i12) {
            return new Layout[i12];
        }
    }

    public Layout(@l ContentMode contentMode, @l Integer num, @l Integer num2) {
        this.contentMode = contentMode;
        this.width = num;
        this.height = num2;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final ContentMode getContentMode() {
        return this.contentMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Layout)) {
            return false;
        }
        Layout layout = (Layout) obj;
        return this.contentMode == layout.contentMode && L.f(this.width, layout.width) && L.f(this.height, layout.height);
    }

    public final int hashCode() {
        ContentMode contentMode = this.contentMode;
        int iHashCode = (contentMode == null ? 0 : contentMode.hashCode()) * 31;
        Integer num = this.width;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Layout(contentMode=");
        sb2.append(this.contentMode);
        sb2.append(", width=");
        sb2.append(this.width);
        sb2.append(", height=");
        return s.j(sb2, this.height, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        ContentMode contentMode = this.contentMode;
        if (contentMode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(contentMode.name());
        }
        Integer num = this.width;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.height;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
    }
}

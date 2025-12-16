package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImvGoodsPollLink.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/avito/android/deep_linking/links/ImvGoodsPollLinkBodyOption;", "Landroid/os/Parcelable;", "", "title", "slug", "", "isChecked", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSlug", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ImvGoodsPollLinkBodyOption implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ImvGoodsPollLinkBodyOption> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f133363b;

    @com.google.gson.annotations.c("slug")
    @Y61.k
    private final String slug;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    /* compiled from: ImvGoodsPollLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImvGoodsPollLinkBodyOption> {
        @Override // android.os.Parcelable.Creator
        public final ImvGoodsPollLinkBodyOption createFromParcel(Parcel parcel) {
            return new ImvGoodsPollLinkBodyOption(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ImvGoodsPollLinkBodyOption[] newArray(int i12) {
            return new ImvGoodsPollLinkBodyOption[i12];
        }
    }

    public ImvGoodsPollLinkBodyOption(@Y61.k String str, @Y61.k String str2, boolean z12) {
        this.title = str;
        this.slug = str2;
        this.f133363b = z12;
    }

    public static ImvGoodsPollLinkBodyOption a(ImvGoodsPollLinkBodyOption imvGoodsPollLinkBodyOption, boolean z12) {
        return new ImvGoodsPollLinkBodyOption(imvGoodsPollLinkBodyOption.title, imvGoodsPollLinkBodyOption.slug, z12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImvGoodsPollLinkBodyOption)) {
            return false;
        }
        ImvGoodsPollLinkBodyOption imvGoodsPollLinkBodyOption = (ImvGoodsPollLinkBodyOption) obj;
        return kotlin.jvm.internal.L.f(this.title, imvGoodsPollLinkBodyOption.title) && kotlin.jvm.internal.L.f(this.slug, imvGoodsPollLinkBodyOption.slug) && this.f133363b == imvGoodsPollLinkBodyOption.f133363b;
    }

    @Y61.k
    public final String getSlug() {
        return this.slug;
    }

    @Y61.k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f133363b) + androidx.compose.foundation.H.d(this.title.hashCode() * 31, 31, this.slug);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImvGoodsPollLinkBodyOption(title=");
        sb2.append(this.title);
        sb2.append(", slug=");
        sb2.append(this.slug);
        sb2.append(", isChecked=");
        return androidx.appcompat.app.r.x(sb2, this.f133363b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.slug);
        parcel.writeInt(this.f133363b ? 1 : 0);
    }

    public /* synthetic */ ImvGoodsPollLinkBodyOption(String str, String str2, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? false : z12);
    }
}

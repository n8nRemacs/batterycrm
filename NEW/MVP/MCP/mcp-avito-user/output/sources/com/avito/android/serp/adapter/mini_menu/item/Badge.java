package com.avito.android.serp.adapter.mini_menu.item;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MiniMenuItem.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/mini_menu/item/Badge;", "Landroid/os/Parcelable;", "()V", "ImageBadge", "TextBadge", "Lcom/avito/android/serp/adapter/mini_menu/item/Badge$ImageBadge;", "Lcom/avito/android/serp/adapter/mini_menu/item/Badge$TextBadge;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class Badge implements Parcelable {

    /* compiled from: MiniMenuItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/mini_menu/item/Badge$ImageBadge;", "Lcom/avito/android/serp/adapter/mini_menu/item/Badge;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class ImageBadge extends Badge {

        @Y61.k
        public static final Parcelable.Creator<ImageBadge> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final UniversalImage f270342b;

        /* compiled from: MiniMenuItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ImageBadge> {
            @Override // android.os.Parcelable.Creator
            public final ImageBadge createFromParcel(Parcel parcel) {
                return new ImageBadge((UniversalImage) parcel.readParcelable(ImageBadge.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ImageBadge[] newArray(int i12) {
                return new ImageBadge[i12];
            }
        }

        public ImageBadge(@Y61.k UniversalImage universalImage) {
            super(null);
            this.f270342b = universalImage;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ImageBadge) && L.f(this.f270342b, ((ImageBadge) obj).f270342b);
        }

        public final int hashCode() {
            return this.f270342b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.s(new StringBuilder("ImageBadge(icon="), this.f270342b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f270342b, i12);
        }
    }

    /* compiled from: MiniMenuItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/mini_menu/item/Badge$TextBadge;", "Lcom/avito/android/serp/adapter/mini_menu/item/Badge;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class TextBadge extends Badge {

        @Y61.k
        public static final Parcelable.Creator<TextBadge> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f270343b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f270344c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f270345d;

        /* compiled from: MiniMenuItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TextBadge> {
            @Override // android.os.Parcelable.Creator
            public final TextBadge createFromParcel(Parcel parcel) {
                return new TextBadge(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TextBadge[] newArray(int i12) {
                return new TextBadge[i12];
            }
        }

        public TextBadge(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
            super(null);
            this.f270343b = str;
            this.f270344c = str2;
            this.f270345d = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextBadge)) {
                return false;
            }
            TextBadge textBadge = (TextBadge) obj;
            return L.f(this.f270343b, textBadge.f270343b) && L.f(this.f270344c, textBadge.f270344c) && L.f(this.f270345d, textBadge.f270345d);
        }

        public final int hashCode() {
            return this.f270345d.hashCode() + H.d(this.f270343b.hashCode() * 31, 31, this.f270344c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TextBadge(text=");
            sb2.append(this.f270343b);
            sb2.append(", backgroundColor=");
            sb2.append(this.f270344c);
            sb2.append(", textColor=");
            return C22026a.c(sb2, this.f270345d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f270343b);
            parcel.writeString(this.f270344c);
            parcel.writeString(this.f270345d);
        }
    }

    public /* synthetic */ Badge(C42822w c42822w) {
        this();
    }

    public Badge() {
    }
}

package com.avito.android.publish.slots.images_groups_recommendations.item;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ImagesGroupsRecommendationsItem.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/slots/images_groups_recommendations/item/Title;", "Landroid/os/Parcelable;", "()V", "Content", "Skeleton", "Lcom/avito/android/publish/slots/images_groups_recommendations/item/Title$Content;", "Lcom/avito/android/publish/slots/images_groups_recommendations/item/Title$Skeleton;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class Title implements Parcelable {

    /* compiled from: ImagesGroupsRecommendationsItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/images_groups_recommendations/item/Title$Content;", "Lcom/avito/android/publish/slots/images_groups_recommendations/item/Title;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Content extends Title {

        @Y61.k
        public static final Parcelable.Creator<Content> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f244205b;

        /* compiled from: ImagesGroupsRecommendationsItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Content> {
            @Override // android.os.Parcelable.Creator
            public final Content createFromParcel(Parcel parcel) {
                return new Content(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Content[] newArray(int i12) {
                return new Content[i12];
            }
        }

        public Content(@Y61.k String str) {
            super(null);
            this.f244205b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Content) && L.f(this.f244205b, ((Content) obj).f244205b);
        }

        public final int hashCode() {
            return this.f244205b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Content(title="), this.f244205b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f244205b);
        }
    }

    /* compiled from: ImagesGroupsRecommendationsItem.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/images_groups_recommendations/item/Title$Skeleton;", "Lcom/avito/android/publish/slots/images_groups_recommendations/item/Title;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Skeleton extends Title {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Skeleton f244206b = new Skeleton();

        @Y61.k
        public static final Parcelable.Creator<Skeleton> CREATOR = new a();

        /* compiled from: ImagesGroupsRecommendationsItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Skeleton> {
            @Override // android.os.Parcelable.Creator
            public final Skeleton createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Skeleton.f244206b;
            }

            @Override // android.os.Parcelable.Creator
            public final Skeleton[] newArray(int i12) {
                return new Skeleton[i12];
            }
        }

        public Skeleton() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof Skeleton);
        }

        public final int hashCode() {
            return 852357027;
        }

        @Y61.k
        public final String toString() {
            return "Skeleton";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ Title(C42822w c42822w) {
        this();
    }

    public Title() {
    }
}

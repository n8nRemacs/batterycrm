package com.avito.android.publish.slots.images_groups_recommendations.item;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ImagesGroupsRecommendationsItem.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/publish/slots/images_groups_recommendations/item/Recommendation;", "Landroid/os/Parcelable;", "<init>", "()V", "Content", "Skeleton", "Lcom/avito/android/publish/slots/images_groups_recommendations/item/Recommendation$Content;", "Lcom/avito/android/publish/slots/images_groups_recommendations/item/Recommendation$Skeleton;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class Recommendation implements Parcelable {

    /* compiled from: ImagesGroupsRecommendationsItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/images_groups_recommendations/item/Recommendation$Content;", "Lcom/avito/android/publish/slots/images_groups_recommendations/item/Recommendation;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Content extends Recommendation {

        @Y61.k
        public static final Parcelable.Creator<Content> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f244194b;

        /* renamed from: c, reason: collision with root package name */
        public final int f244195c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final UniversalImage f244196d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f244197e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final GroupTitle f244198f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final String f244199g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final String f244200h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final String f244201i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.k
        public final String f244202j;

        /* renamed from: k, reason: collision with root package name */
        public final int f244203k;

        /* compiled from: ImagesGroupsRecommendationsItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Content> {
            @Override // android.os.Parcelable.Creator
            public final Content createFromParcel(Parcel parcel) {
                return new Content(parcel.readString(), parcel.readInt(), (UniversalImage) parcel.readParcelable(Content.class.getClassLoader()), parcel.readString(), GroupTitle.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Content[] newArray(int i12) {
                return new Content[i12];
            }
        }

        public Content(@Y61.k String str, int i12, @Y61.k UniversalImage universalImage, @Y61.k String str2, @Y61.k GroupTitle groupTitle, @Y61.k String str3, @Y61.k String str4, @Y61.k String str5, @Y61.k String str6, int i13) {
            super(null);
            this.f244194b = str;
            this.f244195c = i12;
            this.f244196d = universalImage;
            this.f244197e = str2;
            this.f244198f = groupTitle;
            this.f244199g = str3;
            this.f244200h = str4;
            this.f244201i = str5;
            this.f244202j = str6;
            this.f244203k = i13;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return L.f(this.f244194b, content.f244194b) && this.f244195c == content.f244195c && L.f(this.f244196d, content.f244196d) && L.f(this.f244197e, content.f244197e) && L.f(this.f244198f, content.f244198f) && L.f(this.f244199g, content.f244199g) && L.f(this.f244200h, content.f244200h) && L.f(this.f244201i, content.f244201i) && L.f(this.f244202j, content.f244202j) && this.f244203k == content.f244203k;
        }

        @Override // com.avito.android.publish.slots.images_groups_recommendations.item.Recommendation
        @Y61.k
        /* renamed from: getId, reason: from getter */
        public final String getF244204b() {
            return this.f244194b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f244203k) + H.d(H.d(H.d(H.d((this.f244198f.hashCode() + H.d(com.avito.android.actions_sheet.a.a(r.e(this.f244195c, this.f244194b.hashCode() * 31, 31), 31, this.f244196d), 31, this.f244197e)) * 31, 31, this.f244199g), 31, this.f244200h), 31, this.f244201i), 31, this.f244202j);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(id=");
            sb2.append(this.f244194b);
            sb2.append(", count=");
            sb2.append(this.f244195c);
            sb2.append(", image=");
            sb2.append(this.f244196d);
            sb2.append(", groupId=");
            sb2.append(this.f244197e);
            sb2.append(", groupTitle=");
            sb2.append(this.f244198f);
            sb2.append(", longPostfixFormat=");
            sb2.append(this.f244199g);
            sb2.append(", shortPostfixFormat=");
            sb2.append(this.f244200h);
            sb2.append(", longSuggestPostfixFormat=");
            sb2.append(this.f244201i);
            sb2.append(", shortSuggestPostfixFormat=");
            sb2.append(this.f244202j);
            sb2.append(", imageOffset=");
            return r.t(sb2, this.f244203k, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f244194b);
            parcel.writeInt(this.f244195c);
            parcel.writeParcelable(this.f244196d, i12);
            parcel.writeString(this.f244197e);
            this.f244198f.writeToParcel(parcel, i12);
            parcel.writeString(this.f244199g);
            parcel.writeString(this.f244200h);
            parcel.writeString(this.f244201i);
            parcel.writeString(this.f244202j);
            parcel.writeInt(this.f244203k);
        }
    }

    /* compiled from: ImagesGroupsRecommendationsItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/images_groups_recommendations/item/Recommendation$Skeleton;", "Lcom/avito/android/publish/slots/images_groups_recommendations/item/Recommendation;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Skeleton extends Recommendation {

        @Y61.k
        public static final Parcelable.Creator<Skeleton> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f244204b;

        /* compiled from: ImagesGroupsRecommendationsItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Skeleton> {
            @Override // android.os.Parcelable.Creator
            public final Skeleton createFromParcel(Parcel parcel) {
                return new Skeleton(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Skeleton[] newArray(int i12) {
                return new Skeleton[i12];
            }
        }

        public Skeleton(@Y61.k String str) {
            super(null);
            this.f244204b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Skeleton) && L.f(this.f244204b, ((Skeleton) obj).f244204b);
        }

        @Override // com.avito.android.publish.slots.images_groups_recommendations.item.Recommendation
        @Y61.k
        /* renamed from: getId, reason: from getter */
        public final String getF244204b() {
            return this.f244204b;
        }

        public final int hashCode() {
            return this.f244204b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Skeleton(id="), this.f244204b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f244204b);
        }
    }

    public /* synthetic */ Recommendation(C42822w c42822w) {
        this();
    }

    @Y61.k
    /* renamed from: getId */
    public abstract String getF244204b();

    public Recommendation() {
    }
}

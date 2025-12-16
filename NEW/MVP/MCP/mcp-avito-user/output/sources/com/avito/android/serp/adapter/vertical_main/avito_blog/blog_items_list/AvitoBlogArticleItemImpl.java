package com.avito.android.serp.adapter.vertical_main.avito_blog.blog_items_list;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.vertical_main.ArticleType;
import com.avito.android.remote.model.vertical_main.AvitoBlogArticle;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AvitoBlogArticleItemImpl.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/avito_blog/blog_items_list/AvitoBlogArticleItemImpl;", "Lcom/avito/android/serp/adapter/vertical_main/avito_blog/blog_items_list/AvitoBlogArticleItem;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AvitoBlogArticleItemImpl implements AvitoBlogArticleItem {

    @k
    public static final Parcelable.Creator<AvitoBlogArticleItemImpl> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f272592b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Image f272593c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f272594d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AvitoBlogArticle f272595e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final ArticleType f272596f;

    /* renamed from: g, reason: collision with root package name */
    public final int f272597g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Analytics f272598h;

    /* compiled from: AvitoBlogArticleItemImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/avito_blog/blog_items_list/AvitoBlogArticleItemImpl$a;", "", "<init>", "()V", "", "ARTICLE_NAME", "Ljava/lang/String;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AvitoBlogArticleItemImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<AvitoBlogArticleItemImpl> {
        @Override // android.os.Parcelable.Creator
        public final AvitoBlogArticleItemImpl createFromParcel(Parcel parcel) {
            return new AvitoBlogArticleItemImpl(parcel.readString(), (Image) parcel.readParcelable(AvitoBlogArticleItemImpl.class.getClassLoader()), parcel.readString(), (AvitoBlogArticle) parcel.readParcelable(AvitoBlogArticleItemImpl.class.getClassLoader()), (ArticleType) parcel.readParcelable(AvitoBlogArticleItemImpl.class.getClassLoader()), parcel.readInt(), (Analytics) parcel.readParcelable(AvitoBlogArticleItemImpl.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AvitoBlogArticleItemImpl[] newArray(int i12) {
            return new AvitoBlogArticleItemImpl[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public AvitoBlogArticleItemImpl(@k String str, @k Image image, @k String str2, @k AvitoBlogArticle avitoBlogArticle, @l ArticleType articleType, int i12, @l Analytics analytics) {
        this.f272592b = str;
        this.f272593c = image;
        this.f272594d = str2;
        this.f272595e = avitoBlogArticle;
        this.f272596f = articleType;
        this.f272597g = i12;
        this.f272598h = analytics;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.avito_blog.blog_items_list.AvitoBlogArticleItem
    @k
    /* renamed from: I5, reason: from getter */
    public final AvitoBlogArticle getF272595e() {
        return this.f272595e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvitoBlogArticleItemImpl)) {
            return false;
        }
        AvitoBlogArticleItemImpl avitoBlogArticleItemImpl = (AvitoBlogArticleItemImpl) obj;
        return L.f(this.f272592b, avitoBlogArticleItemImpl.f272592b) && L.f(this.f272593c, avitoBlogArticleItemImpl.f272593c) && L.f(this.f272594d, avitoBlogArticleItemImpl.f272594d) && L.f(this.f272595e, avitoBlogArticleItemImpl.f272595e) && this.f272596f == avitoBlogArticleItemImpl.f272596f && this.f272597g == avitoBlogArticleItemImpl.f272597g && L.f(this.f272598h, avitoBlogArticleItemImpl.f272598h);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.avito_blog.blog_items_list.AvitoBlogArticleItem
    /* renamed from: f0, reason: from getter */
    public final int getF272597g() {
        return this.f272597g;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.avito_blog.blog_items_list.AvitoBlogArticleItem
    @l
    /* renamed from: getAnalytics, reason: from getter */
    public final Analytics getF272598h() {
        return this.f272598h;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF75315b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.avito_blog.blog_items_list.AvitoBlogArticleItem
    @k
    /* renamed from: getPreviewImageUrls, reason: from getter */
    public final Image getF272593c() {
        return this.f272593c;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF231617b() {
        return this.f272592b;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.avito_blog.blog_items_list.AvitoBlogArticleItem
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF272594d() {
        return this.f272594d;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.avito_blog.blog_items_list.AvitoBlogArticleItem
    @l
    /* renamed from: getType, reason: from getter */
    public final ArticleType getF272596f() {
        return this.f272596f;
    }

    public final int hashCode() {
        int iHashCode = (this.f272595e.hashCode() + H.d(com.avito.android.actions_sheet.a.g(this.f272593c, this.f272592b.hashCode() * 31, 31), 31, this.f272594d)) * 31;
        ArticleType articleType = this.f272596f;
        int iE2 = r.e(this.f272597g, (iHashCode + (articleType == null ? 0 : articleType.hashCode())) * 31, 31);
        Analytics analytics = this.f272598h;
        return iE2 + (analytics != null ? analytics.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "AvitoBlogArticleItemImpl(stringId=" + this.f272592b + ", previewImageUrls=" + this.f272593c + ", title=" + this.f272594d + ", article=" + this.f272595e + ", type=" + this.f272596f + ", widgetPosition=" + this.f272597g + ", analytics=" + this.f272598h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f272592b);
        parcel.writeParcelable(this.f272593c, i12);
        parcel.writeString(this.f272594d);
        parcel.writeParcelable(this.f272595e, i12);
        parcel.writeParcelable(this.f272596f, i12);
        parcel.writeInt(this.f272597g);
        parcel.writeParcelable(this.f272598h, i12);
    }

    public /* synthetic */ AvitoBlogArticleItemImpl(String str, Image image, String str2, AvitoBlogArticle avitoBlogArticle, ArticleType articleType, int i12, Analytics analytics, int i13, C42822w c42822w) {
        this(str, image, str2, avitoBlogArticle, articleType, i12, (i13 & 64) != 0 ? null : analytics);
    }
}

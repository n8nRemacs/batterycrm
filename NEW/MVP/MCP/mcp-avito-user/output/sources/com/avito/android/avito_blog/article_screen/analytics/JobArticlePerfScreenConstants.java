package com.avito.android.avito_blog.article_screen.analytics;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: JobArticlePerfScreenConstants.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/avito_blog/article_screen/analytics/JobArticlePerfScreenConstants;", "", "<init>", "()V", "JobArticleScreen", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class JobArticlePerfScreenConstants {

    /* compiled from: JobArticlePerfScreenConstants.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/avito_blog/article_screen/analytics/JobArticlePerfScreenConstants$JobArticleScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @b
    @d
    public static final class JobArticleScreen extends Screen {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final JobArticleScreen f97915d = new JobArticleScreen();

        @k
        public static final Parcelable.Creator<JobArticleScreen> CREATOR = new a();

        /* compiled from: JobArticlePerfScreenConstants.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<JobArticleScreen> {
            @Override // android.os.Parcelable.Creator
            public final JobArticleScreen createFromParcel(Parcel parcel) {
                parcel.readInt();
                return JobArticleScreen.f97915d;
            }

            @Override // android.os.Parcelable.Creator
            public final JobArticleScreen[] newArray(int i12) {
                return new JobArticleScreen[i12];
            }
        }

        public JobArticleScreen() {
            super("JobArticle", false, 2, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    static {
        new JobArticlePerfScreenConstants();
    }
}

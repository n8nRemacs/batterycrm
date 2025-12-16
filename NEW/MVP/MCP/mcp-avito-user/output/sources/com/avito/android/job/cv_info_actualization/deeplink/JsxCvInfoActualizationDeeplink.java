package com.avito.android.job.cv_info_actualization.deeplink;

import Ju.InterfaceC14247a;
import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: JsxCvInfoActualizationDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/deeplink/JsxCvInfoActualizationDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_job_cv-info-actualization_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final class JsxCvInfoActualizationDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<JsxCvInfoActualizationDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final DeepLink f174024b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f174025c;

    /* compiled from: JsxCvInfoActualizationDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JsxCvInfoActualizationDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final JsxCvInfoActualizationDeeplink createFromParcel(Parcel parcel) {
            return new JsxCvInfoActualizationDeeplink((DeepLink) parcel.readParcelable(JsxCvInfoActualizationDeeplink.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final JsxCvInfoActualizationDeeplink[] newArray(int i12) {
            return new JsxCvInfoActualizationDeeplink[i12];
        }
    }

    /* compiled from: JsxCvInfoActualizationDeeplink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/deeplink/JsxCvInfoActualizationDeeplink$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/job/cv_info_actualization/deeplink/JsxCvInfoActualizationDeeplink$b$a;", "Lcom/avito/android/job/cv_info_actualization/deeplink/JsxCvInfoActualizationDeeplink$b$b;", "_avito_job_cv-info-actualization_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: JsxCvInfoActualizationDeeplink.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/deeplink/JsxCvInfoActualizationDeeplink$b$a;", "Lcom/avito/android/job/cv_info_actualization/deeplink/JsxCvInfoActualizationDeeplink$b;", "LJu/c$b;", "LJu/a$a;", "<init>", "()V", "_avito_job_cv-info-actualization_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b implements InterfaceC14249c.b, InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f174026b = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: JsxCvInfoActualizationDeeplink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/deeplink/JsxCvInfoActualizationDeeplink$b$b;", "Lcom/avito/android/job/cv_info_actualization/deeplink/JsxCvInfoActualizationDeeplink$b;", "LJu/a$b;", "_avito_job_cv-info-actualization_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.job.cv_info_actualization.deeplink.JsxCvInfoActualizationDeeplink$b$b, reason: collision with other inner class name */
        public static final class C5126b extends b implements InterfaceC14247a.b {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final DeepLink f174027b;

            public C5126b(@l DeepLink deepLink) {
                super(null);
                this.f174027b = deepLink;
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public /* synthetic */ JsxCvInfoActualizationDeeplink(DeepLink deepLink, String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : deepLink, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f174024b, i12);
        parcel.writeString(this.f174025c);
    }

    public JsxCvInfoActualizationDeeplink(@l DeepLink deepLink, @k String str) {
        this.f174024b = deepLink;
        this.f174025c = str;
    }
}

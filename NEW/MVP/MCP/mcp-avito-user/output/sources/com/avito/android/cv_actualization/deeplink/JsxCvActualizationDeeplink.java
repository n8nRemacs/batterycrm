package com.avito.android.cv_actualization.deeplink;

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

/* compiled from: JsxCvActualizationDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cv_actualization/deeplink/JsxCvActualizationDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_job_cv-actualization_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class JsxCvActualizationDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<JsxCvActualizationDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f131087b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f131088c;

    /* compiled from: JsxCvActualizationDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JsxCvActualizationDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final JsxCvActualizationDeeplink createFromParcel(Parcel parcel) {
            return new JsxCvActualizationDeeplink(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final JsxCvActualizationDeeplink[] newArray(int i12) {
            return new JsxCvActualizationDeeplink[i12];
        }
    }

    /* compiled from: JsxCvActualizationDeeplink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/cv_actualization/deeplink/JsxCvActualizationDeeplink$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/cv_actualization/deeplink/JsxCvActualizationDeeplink$b$a;", "Lcom/avito/android/cv_actualization/deeplink/JsxCvActualizationDeeplink$b$b;", "_avito_job_cv-actualization_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: JsxCvActualizationDeeplink.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cv_actualization/deeplink/JsxCvActualizationDeeplink$b$a;", "Lcom/avito/android/cv_actualization/deeplink/JsxCvActualizationDeeplink$b;", "LJu/c$b;", "LJu/a$a;", "<init>", "()V", "_avito_job_cv-actualization_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b implements InterfaceC14249c.b, InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f131089b = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: JsxCvActualizationDeeplink.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cv_actualization/deeplink/JsxCvActualizationDeeplink$b$b;", "Lcom/avito/android/cv_actualization/deeplink/JsxCvActualizationDeeplink$b;", "LJu/c$b;", "LJu/a$b;", "_avito_job_cv-actualization_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.cv_actualization.deeplink.JsxCvActualizationDeeplink$b$b, reason: collision with other inner class name */
        public static final class C3900b extends b implements InterfaceC14249c.b, InterfaceC14247a.b {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f131090b;

            public C3900b(@l String str) {
                super(null);
                this.f131090b = str;
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public JsxCvActualizationDeeplink() {
        boolean z12 = false;
        this(z12, z12, 3, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f131087b ? 1 : 0);
        parcel.writeInt(this.f131088c ? 1 : 0);
    }

    public /* synthetic */ JsxCvActualizationDeeplink(boolean z12, boolean z13, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13);
    }

    public JsxCvActualizationDeeplink(boolean z12, boolean z13) {
        this.f131087b = z12;
        this.f131088c = z13;
    }
}

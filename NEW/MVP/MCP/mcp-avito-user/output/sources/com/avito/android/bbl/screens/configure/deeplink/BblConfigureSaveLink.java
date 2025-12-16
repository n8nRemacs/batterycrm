package com.avito.android.bbl.screens.configure.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: BblConfigureSaveLink.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bbl/screens/configure/deeplink/BblConfigureSaveLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "c", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes11.dex */
public final class BblConfigureSaveLink extends DeepLink {

    @k
    public static final Parcelable.Creator<BblConfigureSaveLink> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f99127b;

    /* compiled from: BblConfigureSaveLink.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/bbl/screens/configure/deeplink/BblConfigureSaveLink$a;", "", "<init>", "()V", "", "KEY_BBL_CONFIGURE_SAVE_BUTTON_ID", "Ljava/lang/String;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BblConfigureSaveLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BblConfigureSaveLink> {
        @Override // android.os.Parcelable.Creator
        public final BblConfigureSaveLink createFromParcel(Parcel parcel) {
            return new BblConfigureSaveLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BblConfigureSaveLink[] newArray(int i12) {
            return new BblConfigureSaveLink[i12];
        }
    }

    /* compiled from: BblConfigureSaveLink.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/bbl/screens/configure/deeplink/BblConfigureSaveLink$c;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/bbl/screens/configure/deeplink/BblConfigureSaveLink$c$a;", "Lcom/avito/android/bbl/screens/configure/deeplink/BblConfigureSaveLink$c$b;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class c {

        /* compiled from: BblConfigureSaveLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/bbl/screens/configure/deeplink/BblConfigureSaveLink$c$a;", "Lcom/avito/android/bbl/screens/configure/deeplink/BblConfigureSaveLink$c;", "LJu/c$b;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends c implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f99128b = new a();

            public a() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -917367862;
            }

            @k
            public final String toString() {
                return "Failure";
            }
        }

        /* compiled from: BblConfigureSaveLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/bbl/screens/configure/deeplink/BblConfigureSaveLink$c$b;", "Lcom/avito/android/bbl/screens/configure/deeplink/BblConfigureSaveLink$c;", "LJu/c$a;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends c implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final b f99129b = new b();

            public b() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1697963453;
            }

            @k
            public final String toString() {
                return "Success";
            }
        }

        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public BblConfigureSaveLink(@k String str) {
        this.f99127b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f99127b);
    }
}

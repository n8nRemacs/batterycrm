package com.avito.android.short_term_rent.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: StrIncreasedCashbackApplyLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/short_term_rent/deeplink/StrIncreasedCashbackApplyLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "b", "_avito_short-term-rent_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final class StrIncreasedCashbackApplyLink extends DeepLink {

    @k
    public static final Parcelable.Creator<StrIncreasedCashbackApplyLink> CREATOR = new a();

    /* compiled from: StrIncreasedCashbackApplyLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StrIncreasedCashbackApplyLink> {
        @Override // android.os.Parcelable.Creator
        public final StrIncreasedCashbackApplyLink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new StrIncreasedCashbackApplyLink();
        }

        @Override // android.os.Parcelable.Creator
        public final StrIncreasedCashbackApplyLink[] newArray(int i12) {
            return new StrIncreasedCashbackApplyLink[i12];
        }
    }

    /* compiled from: StrIncreasedCashbackApplyLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/short_term_rent/deeplink/StrIncreasedCashbackApplyLink$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/short_term_rent/deeplink/StrIncreasedCashbackApplyLink$b$a;", "Lcom/avito/android/short_term_rent/deeplink/StrIncreasedCashbackApplyLink$b$b;", "_avito_short-term-rent_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: StrIncreasedCashbackApplyLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/short_term_rent/deeplink/StrIncreasedCashbackApplyLink$b$a;", "Lcom/avito/android/short_term_rent/deeplink/StrIncreasedCashbackApplyLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_short-term-rent_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f282250b = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: StrIncreasedCashbackApplyLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/short_term_rent/deeplink/StrIncreasedCashbackApplyLink$b$b;", "Lcom/avito/android/short_term_rent/deeplink/StrIncreasedCashbackApplyLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_short-term-rent_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.short_term_rent.deeplink.StrIncreasedCashbackApplyLink$b$b, reason: collision with other inner class name */
        public static final class C8424b extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C8424b f282251b = new C8424b();

            public C8424b() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
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

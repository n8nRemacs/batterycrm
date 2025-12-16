package com.avito.android.str_calendar.deeplink;

import Ju.InterfaceC14247a;
import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: StrSellerCalendarLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/deeplink/StrSellerCalendarLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_str-calendar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class StrSellerCalendarLink extends DeepLink {

    @k
    public static final Parcelable.Creator<StrSellerCalendarLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f286653b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f286654c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f286655d;

    /* compiled from: StrSellerCalendarLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StrSellerCalendarLink> {
        @Override // android.os.Parcelable.Creator
        public final StrSellerCalendarLink createFromParcel(Parcel parcel) {
            return new StrSellerCalendarLink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StrSellerCalendarLink[] newArray(int i12) {
            return new StrSellerCalendarLink[i12];
        }
    }

    /* compiled from: StrSellerCalendarLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/str_calendar/deeplink/StrSellerCalendarLink$b;", "LJu/c$b;", "<init>", "()V", "a", "b", "Lcom/avito/android/str_calendar/deeplink/StrSellerCalendarLink$b$a;", "Lcom/avito/android/str_calendar/deeplink/StrSellerCalendarLink$b$b;", "_avito_str-calendar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b implements InterfaceC14249c.b {

        /* compiled from: StrSellerCalendarLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_calendar/deeplink/StrSellerCalendarLink$b$a;", "LJu/a$a;", "Lcom/avito/android/str_calendar/deeplink/StrSellerCalendarLink$b;", "<init>", "()V", "_avito_str-calendar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b implements InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f286656b = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: StrSellerCalendarLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_calendar/deeplink/StrSellerCalendarLink$b$b;", "LJu/a$b;", "Lcom/avito/android/str_calendar/deeplink/StrSellerCalendarLink$b;", "<init>", "()V", "_avito_str-calendar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.str_calendar.deeplink.StrSellerCalendarLink$b$b, reason: collision with other inner class name */
        public static final class C8587b extends b implements InterfaceC14247a.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C8587b f286657b = new C8587b();

            public C8587b() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public StrSellerCalendarLink(@k String str, @l String str2, @l String str3) {
        this.f286653b = str;
        this.f286654c = str2;
        this.f286655d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f286653b);
        parcel.writeString(this.f286654c);
        parcel.writeString(this.f286655d);
    }
}

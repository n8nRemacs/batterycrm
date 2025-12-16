package com.avito.android.advert.navbar;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsNavBarDelegate.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/advert/navbar/q;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "Lcom/avito/android/advert/navbar/q$a;", "Lcom/avito/android/advert/navbar/q$b;", "Lcom/avito/android/advert/navbar/q$c;", "Lcom/avito/android/advert/navbar/q$d;", "Lcom/avito/android/advert/navbar/q$e;", "Lcom/avito/android/advert/navbar/q$f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class q {

    /* compiled from: AdvertDetailsNavBarDelegate.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/navbar/q$a;", "Lcom/avito/android/advert/navbar/q;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f80869a = new a();

        public a() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1592515518;
        }

        @Y61.k
        public final String toString() {
            return "Compare";
        }
    }

    /* compiled from: AdvertDetailsNavBarDelegate.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/navbar/q$b;", "Lcom/avito/android/advert/navbar/q;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f80870a;

        public b(@Y61.k String str) {
            super(null);
            this.f80870a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f80870a, ((b) obj).f80870a);
        }

        public final int hashCode() {
            return this.f80870a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("DownloadFile(fileType="), this.f80870a, ')');
        }
    }

    /* compiled from: AdvertDetailsNavBarDelegate.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/navbar/q$c;", "Lcom/avito/android/advert/navbar/q;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f80871a = new c();

        public c() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -521075229;
        }

        @Y61.k
        public final String toString() {
            return "Favorite";
        }
    }

    /* compiled from: AdvertDetailsNavBarDelegate.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/navbar/q$d;", "Lcom/avito/android/advert/navbar/q;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f80872a = new d();

        public d() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1003781965;
        }

        @Y61.k
        public final String toString() {
            return "MoreDropdown";
        }
    }

    /* compiled from: AdvertDetailsNavBarDelegate.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/navbar/q$e;", "Lcom/avito/android/advert/navbar/q;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e extends q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f80873a = new e();

        public e() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1028456407;
        }

        @Y61.k
        public final String toString() {
            return "Other";
        }
    }

    /* compiled from: AdvertDetailsNavBarDelegate.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/navbar/q$f;", "Lcom/avito/android/advert/navbar/q;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f extends q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f80874a = new f();

        public f() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1025126152;
        }

        @Y61.k
        public final String toString() {
            return "Share";
        }
    }

    public /* synthetic */ q(C42822w c42822w) {
        this();
    }

    public q() {
    }
}

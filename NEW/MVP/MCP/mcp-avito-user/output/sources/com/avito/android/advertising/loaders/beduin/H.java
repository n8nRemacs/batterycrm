package com.avito.android.advertising.loaders.beduin;

import androidx.compose.runtime.C22026a;
import com.avito.android.advertising.CommercialItem;
import com.avito.android.advertising.adapter.items.buzzoola.CommercialHtmlBannerItem;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CommercialLoadedAdHolder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/H;", "", "b", "c", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface H {

    /* compiled from: CommercialLoadedAdHolder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: CommercialLoadedAdHolder.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/H$b;", "", "a", "b", "c", "Lcom/avito/android/advertising/loaders/beduin/H$b$a;", "Lcom/avito/android/advertising/loaders/beduin/H$b$b;", "Lcom/avito/android/advertising/loaders/beduin/H$b$c;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: CommercialLoadedAdHolder.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/H$b$a;", "Lcom/avito/android/advertising/loaders/beduin/H$b;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final CommercialHtmlBannerItem f88079a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Integer f88080b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f88081c;

            public a(@Y61.k CommercialHtmlBannerItem commercialHtmlBannerItem, @Y61.l Integer num, @Y61.l String str) {
                this.f88079a = commercialHtmlBannerItem;
                this.f88080b = num;
                this.f88081c = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return kotlin.jvm.internal.L.f(this.f88079a, aVar.f88079a) && kotlin.jvm.internal.L.f(this.f88080b, aVar.f88080b) && kotlin.jvm.internal.L.f(this.f88081c, aVar.f88081c);
            }

            public final int hashCode() {
                int iHashCode = this.f88079a.hashCode() * 31;
                Integer num = this.f88080b;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                String str = this.f88081c;
                return iHashCode2 + (str != null ? str.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Error(loadedItem=");
                sb2.append(this.f88079a);
                sb2.append(", errorCode=");
                sb2.append(this.f88080b);
                sb2.append(", errorDetails=");
                return C22026a.c(sb2, this.f88081c, ')');
            }
        }

        /* compiled from: CommercialLoadedAdHolder.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/H$b$b;", "Lcom/avito/android/advertising/loaders/beduin/H$b;", "<init>", "()V", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.advertising.loaders.beduin.H$b$b, reason: collision with other inner class name */
        public static final /* data */ class C2607b implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C2607b f88082a = new C2607b();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C2607b);
            }

            public final int hashCode() {
                return 1320898806;
            }

            @Y61.k
            public final String toString() {
                return "Loading";
            }
        }

        /* compiled from: CommercialLoadedAdHolder.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/H$b$c;", "Lcom/avito/android/advertising/loaders/beduin/H$b;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final CommercialHtmlBannerItem f88083a;

            public c(@Y61.k CommercialHtmlBannerItem commercialHtmlBannerItem) {
                this.f88083a = commercialHtmlBannerItem;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && kotlin.jvm.internal.L.f(this.f88083a, ((c) obj).f88083a);
            }

            public final int hashCode() {
                return this.f88083a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "Rendered(loadedItem=" + this.f88083a + ')';
            }
        }
    }

    /* compiled from: CommercialLoadedAdHolder.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/H$c;", "", "a", "b", "c", "d", "Lcom/avito/android/advertising/loaders/beduin/H$c$a;", "Lcom/avito/android/advertising/loaders/beduin/H$c$b;", "Lcom/avito/android/advertising/loaders/beduin/H$c$c;", "Lcom/avito/android/advertising/loaders/beduin/H$c$d;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {

        /* compiled from: CommercialLoadedAdHolder.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/H$c$a;", "Lcom/avito/android/advertising/loaders/beduin/H$c;", "<init>", "()V", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f88084a = new a();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1839191843;
            }

            @Y61.k
            public final String toString() {
                return "Closed";
            }
        }

        /* compiled from: CommercialLoadedAdHolder.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/H$c$b;", "Lcom/avito/android/advertising/loaders/beduin/H$c;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Throwable f88085a;

            public b(@Y61.k Throwable th2) {
                this.f88085a = th2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && kotlin.jvm.internal.L.f(this.f88085a, ((b) obj).f88085a);
            }

            public final int hashCode() {
                return this.f88085a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(throwable="), this.f88085a, ')');
            }
        }

        /* compiled from: CommercialLoadedAdHolder.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/H$c$c;", "Lcom/avito/android/advertising/loaders/beduin/H$c;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.advertising.loaders.beduin.H$c$c, reason: collision with other inner class name */
        public static final /* data */ class C2608c implements c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final CommercialItem f88086a;

            public C2608c(@Y61.k CommercialItem commercialItem) {
                this.f88086a = commercialItem;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2608c) && kotlin.jvm.internal.L.f(this.f88086a, ((C2608c) obj).f88086a);
            }

            public final int hashCode() {
                return this.f88086a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "Loaded(loadedItem=" + this.f88086a + ')';
            }
        }

        /* compiled from: CommercialLoadedAdHolder.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/H$c$d;", "Lcom/avito/android/advertising/loaders/beduin/H$c;", "<init>", "()V", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d implements c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final d f88087a = new d();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1710258197;
            }

            @Y61.k
            public final String toString() {
                return "Loading";
            }
        }
    }

    @Y61.k
    InterfaceC43160i<c> a(@Y61.k String str);

    void b(boolean z12);

    @Y61.k
    InterfaceC43160i<c> c();

    void d(@Y61.k b bVar);

    @Y61.k
    InterfaceC43160i<b> e();

    void f(@Y61.k String str, @Y61.k String str2, @Y61.k c cVar, boolean z12);

    @Y61.l
    c get(@Y61.k String str);
}

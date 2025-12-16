package ne0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.items.ItemWithAdditionalButton;
import com.avito.android.publish.scanner_v2.analytics.ScannerFromPage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InputVinMviAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lne0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "Lne0/a$a;", "Lne0/a$b;", "Lne0/a$c;", "Lne0/a$d;", "Lne0/a$e;", "Lne0/a$f;", "Lne0/a$g;", "Lne0/a$h;", "Lne0/a$i;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ne0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC44384a {

    /* compiled from: InputVinMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lne0/a$a;", "Lne0/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11865a implements InterfaceC44384a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ItemWithAdditionalButton f415222a;

        public C11865a(@k ItemWithAdditionalButton itemWithAdditionalButton) {
            this.f415222a = itemWithAdditionalButton;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11865a) && L.f(this.f415222a, ((C11865a) obj).f415222a);
        }

        public final int hashCode() {
            return this.f415222a.hashCode();
        }

        @k
        public final String toString() {
            return "AdditionalInputButtonClicked(element=" + this.f415222a + ')';
        }
    }

    /* compiled from: InputVinMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lne0/a$b;", "Lne0/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.a$b */
    public static final /* data */ class b implements InterfaceC44384a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f415223a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1974241656;
        }

        @k
        public final String toString() {
            return "BackButtonClicked";
        }
    }

    /* compiled from: InputVinMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lne0/a$c;", "Lne0/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.a$c */
    public static final /* data */ class c implements InterfaceC44384a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f415224a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 464233763;
        }

        @k
        public final String toString() {
            return "CloseButtonClicked";
        }
    }

    /* compiled from: InputVinMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lne0/a$d;", "Lne0/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.a$d */
    public static final /* data */ class d implements InterfaceC44384a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f415225a;

        public d(@k String str) {
            this.f415225a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f415225a, ((d) obj).f415225a);
        }

        public final int hashCode() {
            return this.f415225a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("InputVinChanged(vin="), this.f415225a, ')');
        }
    }

    /* compiled from: InputVinMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lne0/a$e;", "Lne0/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.a$e */
    public static final /* data */ class e implements InterfaceC44384a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UV0.a<? extends com.avito.conveyor_item.a> f415226a;

        public e(@k UV0.a<? extends com.avito.conveyor_item.a> aVar) {
            this.f415226a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f415226a, ((e) obj).f415226a);
        }

        public final int hashCode() {
            return this.f415226a.hashCode();
        }

        @k
        public final String toString() {
            return "ItemsDataChanged(itemsData=" + this.f415226a + ')';
        }
    }

    /* compiled from: InputVinMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lne0/a$f;", "Lne0/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.a$f */
    public static final /* data */ class f implements InterfaceC44384a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f415227a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -2090593812;
        }

        @k
        public final String toString() {
            return "PublishButtonClicked";
        }
    }

    /* compiled from: InputVinMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lne0/a$g;", "Lne0/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.a$g */
    public static final /* data */ class g implements InterfaceC44384a {
        public g() {
            ScannerFromPage scannerFromPage = ScannerFromPage.f239330c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            ScannerFromPage scannerFromPage = ScannerFromPage.f239330c;
            ((g) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return ScannerFromPage.f239333f.hashCode();
        }

        @k
        public final String toString() {
            return "ScanButtonClicked(fromPage=" + ScannerFromPage.f239333f + ')';
        }
    }

    /* compiled from: InputVinMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lne0/a$h;", "Lne0/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.a$h */
    public static final /* data */ class h implements InterfaceC44384a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final h f415228a = new h();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 605703733;
        }

        @k
        public final String toString() {
            return "ScanFinished";
        }
    }

    /* compiled from: InputVinMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lne0/a$i;", "Lne0/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.a$i */
    public static final /* data */ class i implements InterfaceC44384a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final i f415229a = new i();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 741303372;
        }

        @k
        public final String toString() {
            return "ShowManualButtonClicked";
        }
    }
}

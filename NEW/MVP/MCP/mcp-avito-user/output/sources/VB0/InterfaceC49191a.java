package vB0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: TariffCpxInfoLimitsAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LvB0/a;", "", "a", "b", "c", "LvB0/a$a;", "LvB0/a$b;", "LvB0/a$c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vB0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC49191a {

    /* compiled from: TariffCpxInfoLimitsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvB0/a$a;", "LvB0/a;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vB0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12748a implements InterfaceC49191a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12748a f440517a = new C12748a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12748a);
        }

        public final int hashCode() {
            return 1307121999;
        }

        @k
        public final String toString() {
            return "OnNavBarIconClicked";
        }
    }

    /* compiled from: TariffCpxInfoLimitsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvB0/a$b;", "LvB0/a;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vB0.a$b */
    public static final /* data */ class b implements InterfaceC49191a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f440518a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -583960836;
        }

        @k
        public final String toString() {
            return "OnRetryButtonClicked";
        }
    }

    /* compiled from: TariffCpxInfoLimitsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvB0/a$c;", "LvB0/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vB0.a$c */
    public static final /* data */ class c implements InterfaceC49191a {

        /* renamed from: a, reason: collision with root package name */
        public final int f440519a;

        public c(int i12) {
            this.f440519a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f440519a == ((c) obj).f440519a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f440519a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("OnTabClicked(tabIndex="), this.f440519a, ')');
        }
    }
}

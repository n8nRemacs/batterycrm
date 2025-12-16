package kv0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PortfolioProjectSellerAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lkv0/b;", "", "a", "b", "c", "d", "e", "Lkv0/b$a;", "Lkv0/b$b;", "Lkv0/b$c;", "Lkv0/b$d;", "Lkv0/b$e;", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kv0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC43503b {

    /* compiled from: PortfolioProjectSellerAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkv0/b$a;", "Lkv0/b;", "<init>", "()V", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kv0.b$a */
    public static final /* data */ class a implements InterfaceC43503b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f413266a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1665567984;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: PortfolioProjectSellerAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkv0/b$b;", "Lkv0/b;", "<init>", "()V", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kv0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11762b implements InterfaceC43503b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11762b f413267a = new C11762b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11762b);
        }

        public final int hashCode() {
            return 1473187220;
        }

        @k
        public final String toString() {
            return "Delete";
        }
    }

    /* compiled from: PortfolioProjectSellerAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkv0/b$c;", "Lkv0/b;", "<init>", "()V", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kv0.b$c */
    public static final /* data */ class c implements InterfaceC43503b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f413268a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1665475533;
        }

        @k
        public final String toString() {
            return "Edit";
        }
    }

    /* compiled from: PortfolioProjectSellerAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkv0/b$d;", "Lkv0/b;", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kv0.b$d */
    public static final /* data */ class d implements InterfaceC43503b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<Image> f413269a;

        /* renamed from: b, reason: collision with root package name */
        public final int f413270b;

        public d(@k List<Image> list, int i12) {
            this.f413269a = list;
            this.f413270b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f413269a, dVar.f413269a) && this.f413270b == dVar.f413270b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f413270b) + (this.f413269a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenImage(images=");
            sb2.append(this.f413269a);
            sb2.append(", startPosition=");
            return r.t(sb2, this.f413270b, ')');
        }
    }

    /* compiled from: PortfolioProjectSellerAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkv0/b$e;", "Lkv0/b;", "<init>", "()V", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kv0.b$e */
    public static final /* data */ class e implements InterfaceC43503b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f413271a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -2040854510;
        }

        @k
        public final String toString() {
            return "Refresh";
        }
    }
}

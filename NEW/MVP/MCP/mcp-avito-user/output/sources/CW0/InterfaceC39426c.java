package cw0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormViewState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcw0/c;", "", "a", "b", "c", "Lcw0/c$a;", "Lcw0/c$b;", "Lcw0/c$c;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cw0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC39426c {

    /* compiled from: BookingFormViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcw0/c$a;", "Lcw0/c;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cw0.c$a */
    public static final /* data */ class a implements InterfaceC39426c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f393075a;

        /* renamed from: b, reason: collision with root package name */
        public final int f393076b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ArrayList f393077c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final C39428e f393078d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final C39427d f393079e;

        public a(boolean z12, int i12, @k ArrayList arrayList, @k C39428e c39428e, @k C39427d c39427d) {
            this.f393075a = z12;
            this.f393076b = i12;
            this.f393077c = arrayList;
            this.f393078d = c39428e;
            this.f393079e = c39427d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f393075a == aVar.f393075a && this.f393076b == aVar.f393076b && this.f393077c.equals(aVar.f393077c) && L.f(this.f393078d, aVar.f393078d) && L.f(this.f393079e, aVar.f393079e);
        }

        public final int hashCode() {
            return this.f393079e.hashCode() + ((this.f393078d.hashCode() + androidx.compose.ui.graphics.colorspace.e.g(this.f393077c, r.e(this.f393076b, Boolean.hashCode(this.f393075a) * 31, 31), 31)) * 31);
        }

        @k
        public final String toString() {
            return "Content(showProgress=" + this.f393075a + ", currentPageIndex=" + this.f393076b + ", pages=" + this.f393077c + ", headerItem=" + this.f393078d + ", footerItem=" + this.f393079e + ')';
        }
    }

    /* compiled from: BookingFormViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcw0/c$b;", "Lcw0/c;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cw0.c$b */
    public static final /* data */ class b implements InterfaceC39426c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f393080a;

        public b(boolean z12) {
            this.f393080a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f393080a == ((b) obj).f393080a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f393080a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("Error(showProgress="), this.f393080a, ')');
        }
    }

    /* compiled from: BookingFormViewState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcw0/c$c;", "Lcw0/c;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cw0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C11003c implements InterfaceC39426c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11003c f393081a = new C11003c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11003c);
        }

        public final int hashCode() {
            return 112922878;
        }

        @k
        public final String toString() {
            return "Shimmer";
        }
    }
}

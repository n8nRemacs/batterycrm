package vF0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.serp.adapter.l1;
import j.InterfaceC42165v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TravelSearchState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"LvF0/c;", "", "a", "b", "c", "d", "LvF0/c$b;", "LvF0/c$c;", "LvF0/c$d;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vF0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC49208c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f440577a = a.f440578a;

    /* compiled from: TravelSearchState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvF0/c$a;", "", "<init>", "()V", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vF0.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f440578a = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final d f440579b = d.f440584b;
    }

    /* compiled from: TravelSearchState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvF0/c$b;", "LvF0/c;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vF0.c$b */
    public static final /* data */ class b implements InterfaceC49208c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<l1> f440580b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@k List<? extends l1> list) {
            this.f440580b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f440580b, ((b) obj).f440580b);
        }

        public final int hashCode() {
            return this.f440580b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("Content(items="), this.f440580b, ')');
        }
    }

    /* compiled from: TravelSearchState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvF0/c$c;", "LvF0/c;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vF0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C12755c implements InterfaceC49208c {

        /* renamed from: b, reason: collision with root package name */
        public final int f440581b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final PrintableText f440582c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final PrintableText f440583d;

        public C12755c(@InterfaceC42165v int i12, @k PrintableText printableText, @k PrintableText printableText2) {
            this.f440581b = i12;
            this.f440582c = printableText;
            this.f440583d = printableText2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12755c)) {
                return false;
            }
            C12755c c12755c = (C12755c) obj;
            return this.f440581b == c12755c.f440581b && this.f440582c.equals(c12755c.f440582c) && this.f440583d.equals(c12755c.f440583d);
        }

        public final int hashCode() {
            return this.f440583d.hashCode() + com.avito.android.actions_sheet.a.f(this.f440582c, Integer.hashCode(this.f440581b) * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(image=");
            sb2.append(this.f440581b);
            sb2.append(", title=");
            sb2.append(this.f440582c);
            sb2.append(", subtitle=");
            return AK.c.m(sb2, this.f440583d, ')');
        }
    }

    /* compiled from: TravelSearchState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvF0/c$d;", "LvF0/c;", "<init>", "()V", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vF0.c$d */
    public static final /* data */ class d implements InterfaceC49208c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final d f440584b = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -543481772;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }
}

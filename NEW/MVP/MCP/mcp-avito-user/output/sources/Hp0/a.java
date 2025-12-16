package HP0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: WebViewCommand.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"LHP0/a;", "", "<init>", "()V", "a", "b", "c", "d", "LHP0/a$a;", "LHP0/a$b;", "LHP0/a$c;", "LHP0/a$d;", "_avito_webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class a {

    /* compiled from: WebViewCommand.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHP0/a$a;", "LHP0/a;", "<init>", "()V", "_avito_webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: HP0.a$a, reason: collision with other inner class name */
    public static final class C0406a extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0406a f7080a = new C0406a();

        public C0406a() {
            super(null);
        }
    }

    /* compiled from: WebViewCommand.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHP0/a$b;", "LHP0/a;", "<init>", "()V", "_avito_webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f7081a = new b();

        public b() {
            super(null);
        }
    }

    /* compiled from: WebViewCommand.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHP0/a$c;", "LHP0/a;", "_avito_webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f7082a;

        public c(@k String str) {
            super(null);
            this.f7082a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f7082a, ((c) obj).f7082a);
        }

        public final int hashCode() {
            return this.f7082a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnCopyCommand(text="), this.f7082a, ')');
        }
    }

    /* compiled from: WebViewCommand.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHP0/a$d;", "LHP0/a;", "_avito_webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f7083a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f7084b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f7085c;

        public d(@k String str, @k String str2, @k String str3) {
            super(null);
            this.f7083a = str;
            this.f7084b = str2;
            this.f7085c = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f7083a, dVar.f7083a) && L.f(this.f7084b, dVar.f7084b) && L.f(this.f7085c, dVar.f7085c);
        }

        public final int hashCode() {
            return this.f7085c.hashCode() + H.d(this.f7083a.hashCode() * 31, 31, this.f7084b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnShareCommand(title=");
            sb2.append(this.f7083a);
            sb2.append(", subTitle=");
            sb2.append(this.f7084b);
            sb2.append(", uri=");
            return C22026a.c(sb2, this.f7085c, ')');
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    public a() {
    }
}

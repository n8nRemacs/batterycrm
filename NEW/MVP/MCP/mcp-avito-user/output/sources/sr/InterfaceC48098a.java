package sR;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import kotlin.AbstractC40048c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LegalRequestAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"LsR/a;", "", "a", "b", "c", "d", "e", "f", "g", "LsR/a$e;", "LsR/a$f;", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sR.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC48098a {

    /* compiled from: LegalRequestAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LsR/a$a;", "LsR/a$f;", "<init>", "()V", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sR.a$a, reason: collision with other inner class name */
    public static final class C12616a implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12616a f437647a = new C12616a();
    }

    /* compiled from: LegalRequestAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsR/a$b;", "LsR/a$e;", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sR.a$b */
    public static final /* data */ class b implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BeduinOneTimeEvent f437648a;

        public b(@k BeduinOneTimeEvent beduinOneTimeEvent) {
            this.f437648a = beduinOneTimeEvent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f437648a, ((b) obj).f437648a);
        }

        public final int hashCode() {
            return this.f437648a.hashCode();
        }

        @k
        public final String toString() {
            return "HandleBeduinEvent(beduinOneTimeEvent=" + this.f437648a + ')';
        }
    }

    /* compiled from: LegalRequestAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsR/a$c;", "LsR/a$f;", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sR.a$c */
    public static final /* data */ class c implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f437649a;

        public c(@k String str) {
            this.f437649a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f437649a, ((c) obj).f437649a);
        }

        public final int hashCode() {
            return this.f437649a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("LoadBeduinPage(pageUrl="), this.f437649a, ')');
        }
    }

    /* compiled from: LegalRequestAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsR/a$d;", "LsR/a$f;", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sR.a$d */
    public static final /* data */ class d implements f {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "LoadBeduinState(json=null)";
        }
    }

    /* compiled from: LegalRequestAction.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LsR/a$e;", "LsR/a;", "LsR/a$b;", "LsR/a$g;", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sR.a$e */
    public interface e extends InterfaceC48098a {
    }

    /* compiled from: LegalRequestAction.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"LsR/a$f;", "LsR/a;", "LsR/a$a;", "LsR/a$c;", "LsR/a$d;", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sR.a$f */
    public interface f extends InterfaceC48098a {
    }

    /* compiled from: LegalRequestAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsR/a$g;", "LsR/a$e;", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sR.a$g */
    public static final /* data */ class g implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AbstractC40048c f437650a;

        public g(@k AbstractC40048c abstractC40048c) {
            this.f437650a = abstractC40048c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f437650a, ((g) obj).f437650a);
        }

        public final int hashCode() {
            return this.f437650a.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateBeduinState(beduinState=" + this.f437650a + ')';
        }
    }
}

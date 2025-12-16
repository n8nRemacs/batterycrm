package dq0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Ldq0/b;", "", "a", "b", "c", "d", "Ldq0/b$a;", "Ldq0/b$b;", "Ldq0/b$c;", "Ldq0/b$d;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dq0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC39780b {

    /* compiled from: SelectState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldq0/b$a;", "Ldq0/b;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dq0.b$a */
    public static final /* data */ class a implements InterfaceC39780b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f394115a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1327028871;
        }

        @k
        public final String toString() {
            return "Content";
        }
    }

    /* compiled from: SelectState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldq0/b$b;", "Ldq0/b;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dq0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11038b implements InterfaceC39780b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11038b f394116a = new C11038b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11038b);
        }

        public final int hashCode() {
            return -80038323;
        }

        @k
        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: SelectState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldq0/b$c;", "Ldq0/b;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dq0.b$c */
    public static final /* data */ class c implements InterfaceC39780b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.select.e f394117a;

        public c(@k com.avito.android.select.e eVar) {
            this.f394117a = eVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f394117a, ((c) obj).f394117a);
        }

        public final int hashCode() {
            return this.f394117a.hashCode();
        }

        @k
        public final String toString() {
            return "Error(overlayInfo=" + this.f394117a + ')';
        }
    }

    /* compiled from: SelectState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldq0/b$d;", "Ldq0/b;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dq0.b$d */
    public static final /* data */ class d implements InterfaceC39780b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f394118a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1941908932;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }
}

package Wo0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SbcDispatchEditAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LWo0/b;", "", "a", "b", "c", "d", "LWo0/b$a;", "LWo0/b$b;", "LWo0/b$c;", "LWo0/b$d;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Wo0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC15786b {

    /* compiled from: SbcDispatchEditAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWo0/b$a;", "LWo0/b;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Wo0.b$a */
    public static final /* data */ class a implements InterfaceC15786b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f18052a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1804254816;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: SbcDispatchEditAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWo0/b$b;", "LWo0/b;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Wo0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1285b implements InterfaceC15786b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1285b f18053a = new C1285b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1285b);
        }

        public final int hashCode() {
            return -915299307;
        }

        @k
        public final String toString() {
            return "CheckAllClicked";
        }
    }

    /* compiled from: SbcDispatchEditAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWo0/b$c;", "LWo0/b;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Wo0.b$c */
    public static final /* data */ class c implements InterfaceC15786b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f18054a;

        public c(@k String str) {
            this.f18054a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f18054a, ((c) obj).f18054a);
        }

        public final int hashCode() {
            return this.f18054a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("CheckClicked(id="), this.f18054a, ')');
        }
    }

    /* compiled from: SbcDispatchEditAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWo0/b$d;", "LWo0/b;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Wo0.b$d */
    public static final /* data */ class d implements InterfaceC15786b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f18055a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -2049039903;
        }

        @k
        public final String toString() {
            return "RemoveFromDispatch";
        }
    }
}

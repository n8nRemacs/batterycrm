package Me0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StepsRequestInternalAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LMe0/b;", "", "a", "b", "LMe0/b$a;", "LMe0/b$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Me0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC14477b {

    /* compiled from: StepsRequestInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMe0/b$a;", "LMe0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Me0.b$a */
    public static final /* data */ class a implements InterfaceC14477b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f10972a;

        public a(@k String str) {
            this.f10972a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f10972a, ((a) obj).f10972a);
        }

        public final int hashCode() {
            return this.f10972a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowError(message="), this.f10972a, ')');
        }
    }

    /* compiled from: StepsRequestInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMe0/b$b;", "LMe0/b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Me0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0694b implements InterfaceC14477b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0694b f10973a = new C0694b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0694b);
        }

        public final int hashCode() {
            return -757515047;
        }

        @k
        public final String toString() {
            return "ShowLoading";
        }
    }
}

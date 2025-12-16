package eR;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LanguageSelectorOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LeR/c;", "", "a", "b", "LeR/c$a;", "LeR/c$b;", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eR.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC40042c {

    /* compiled from: LanguageSelectorOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LeR/c$a;", "LeR/c;", "<init>", "()V", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eR.c$a */
    public static final /* data */ class a implements InterfaceC40042c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f395190a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -959094768;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: LanguageSelectorOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeR/c$b;", "LeR/c;", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eR.c$b */
    public static final /* data */ class b implements InterfaceC40042c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f395191a;

        public b(@k String str) {
            this.f395191a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f395191a, ((b) obj).f395191a);
        }

        public final int hashCode() {
            return this.f395191a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowErrorToast(error="), this.f395191a, ')');
        }
    }
}

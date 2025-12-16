package Dw;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DealRoomDevelopmentOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LDw/c;", "", "a", "b", "c", "LDw/c$a;", "LDw/c$b;", "LDw/c$c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Dw.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC13447c {

    /* compiled from: DealRoomDevelopmentOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDw/c$a;", "LDw/c;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dw.c$a */
    public static final /* data */ class a implements InterfaceC13447c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f3545a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1665894542;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: DealRoomDevelopmentOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDw/c$b;", "LDw/c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dw.c$b */
    public static final /* data */ class b implements InterfaceC13447c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f3546a;

        public b(@k DeepLink deepLink) {
            this.f3546a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f3546a, ((b) obj).f3546a);
        }

        public final int hashCode() {
            return this.f3546a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f3546a, ')');
        }
    }

    /* compiled from: DealRoomDevelopmentOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDw/c$c;", "LDw/c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dw.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0204c implements InterfaceC13447c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f3547a;

        public C0204c(@k String str) {
            this.f3547a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0204c) && L.f(this.f3547a, ((C0204c) obj).f3547a);
        }

        public final int hashCode() {
            return this.f3547a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowAgencyCommissionTooltip(tooltipText="), this.f3547a, ')');
        }
    }
}

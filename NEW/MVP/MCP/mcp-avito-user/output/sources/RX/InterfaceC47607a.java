package rX;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: QualityServiceGrayAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LrX/a;", "", "a", "b", "c", "d", "LrX/a$a;", "LrX/a$b;", "LrX/a$c;", "LrX/a$d;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rX.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC47607a {

    /* compiled from: QualityServiceGrayAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrX/a$a;", "LrX/a;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rX.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12378a implements InterfaceC47607a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12378a f429855a = new C12378a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12378a);
        }

        public final int hashCode() {
            return -1287433388;
        }

        @k
        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: QualityServiceGrayAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrX/a$b;", "LrX/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rX.a$b */
    public static final /* data */ class b implements InterfaceC47607a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f429856a;

        public b(@k DeepLink deepLink) {
            this.f429856a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f429856a, ((b) obj).f429856a);
        }

        public final int hashCode() {
            return this.f429856a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f429856a, ')');
        }
    }

    /* compiled from: QualityServiceGrayAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrX/a$c;", "LrX/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rX.a$c */
    public static final /* data */ class c implements InterfaceC47607a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f429857a;

        public c(@k String str) {
            this.f429857a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f429857a, ((c) obj).f429857a);
        }

        public final int hashCode() {
            return this.f429857a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenUrl(url="), this.f429857a, ')');
        }
    }

    /* compiled from: QualityServiceGrayAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrX/a$d;", "LrX/a;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rX.a$d */
    public static final /* data */ class d implements InterfaceC47607a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f429858a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1076959747;
        }

        @k
        public final String toString() {
            return "RequestData";
        }
    }
}

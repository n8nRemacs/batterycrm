package rX;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: QualityServiceGrayOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LrX/b;", "", "a", "b", "c", "d", "LrX/b$a;", "LrX/b$b;", "LrX/b$c;", "LrX/b$d;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rX.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC47608b {

    /* compiled from: QualityServiceGrayOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrX/b$a;", "LrX/b;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rX.b$a */
    public static final /* data */ class a implements InterfaceC47608b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f429859a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 835841571;
        }

        @k
        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: QualityServiceGrayOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrX/b$b;", "LrX/b;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rX.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12379b implements InterfaceC47608b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12379b f429860a = new C12379b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12379b);
        }

        public final int hashCode() {
            return 612457744;
        }

        @k
        public final String toString() {
            return "NavigateToMain";
        }
    }

    /* compiled from: QualityServiceGrayOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrX/b$c;", "LrX/b;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rX.b$c */
    public static final /* data */ class c implements InterfaceC47608b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f429861a;

        public c(@k DeepLink deepLink) {
            this.f429861a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f429861a, ((c) obj).f429861a);
        }

        public final int hashCode() {
            return this.f429861a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeepLink(deepLink="), this.f429861a, ')');
        }
    }

    /* compiled from: QualityServiceGrayOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrX/b$d;", "LrX/b;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rX.b$d */
    public static final /* data */ class d implements InterfaceC47608b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f429862a;

        public d(@k String str) {
            this.f429862a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f429862a, ((d) obj).f429862a);
        }

        public final int hashCode() {
            return this.f429862a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenUrl(url="), this.f429862a, ')');
        }
    }
}

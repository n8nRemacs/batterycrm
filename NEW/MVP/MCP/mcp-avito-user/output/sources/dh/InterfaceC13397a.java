package Dh;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BblContactHistoryAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LDh/a;", "", "a", "b", "c", "LDh/a$a;", "LDh/a$b;", "LDh/a$c;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Dh.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC13397a {

    /* compiled from: BblContactHistoryAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDh/a$a;", "LDh/a;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dh.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0181a implements InterfaceC13397a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0181a f3353a = new C0181a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0181a);
        }

        public final int hashCode() {
            return 1216777562;
        }

        @k
        public final String toString() {
            return "OnBackClick";
        }
    }

    /* compiled from: BblContactHistoryAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDh/a$b;", "LDh/a;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dh.a$b */
    public static final /* data */ class b implements InterfaceC13397a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f3354a;

        public b(@k DeepLink deepLink) {
            this.f3354a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f3354a, ((b) obj).f3354a);
        }

        public final int hashCode() {
            return this.f3354a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnDeepLinkClick(deepLink="), this.f3354a, ')');
        }
    }

    /* compiled from: BblContactHistoryAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDh/a$c;", "LDh/a;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dh.a$c */
    public static final /* data */ class c implements InterfaceC13397a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f3355a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1825872641;
        }

        @k
        public final String toString() {
            return "Reload";
        }
    }
}

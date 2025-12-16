package zH;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MotivationsListAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LzH/a;", "", "a", "b", "c", "d", "LzH/a$a;", "LzH/a$b;", "LzH/a$c;", "LzH/a$d;", "_avito_gig_motivations-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zH.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC50462a {

    /* compiled from: MotivationsListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LzH/a$a;", "LzH/a;", "<init>", "()V", "_avito_gig_motivations-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zH.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12949a implements InterfaceC50462a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12949a f443990a = new C12949a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12949a);
        }

        public final int hashCode() {
            return -437811367;
        }

        @k
        public final String toString() {
            return "OnBackClick";
        }
    }

    /* compiled from: MotivationsListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LzH/a$b;", "LzH/a;", "_avito_gig_motivations-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zH.a$b */
    public static final /* data */ class b implements InterfaceC50462a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f443991a;

        public b(@k DeepLink deepLink) {
            this.f443991a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f443991a, ((b) obj).f443991a);
        }

        public final int hashCode() {
            return this.f443991a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnEmptyInfoClick(deepLink="), this.f443991a, ')');
        }
    }

    /* compiled from: MotivationsListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LzH/a$c;", "LzH/a;", "<init>", "()V", "_avito_gig_motivations-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zH.a$c */
    public static final /* data */ class c implements InterfaceC50462a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f443992a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 517418056;
        }

        @k
        public final String toString() {
            return "OnRetryClick";
        }
    }

    /* compiled from: MotivationsListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LzH/a$d;", "LzH/a;", "_avito_gig_motivations-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zH.a$d */
    public static final /* data */ class d implements InterfaceC50462a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f443993a;

        public d(@k DeepLink deepLink) {
            this.f443993a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f443993a, ((d) obj).f443993a);
        }

        public final int hashCode() {
            return this.f443993a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnSnippetClick(deepLink="), this.f443993a, ')');
        }
    }
}

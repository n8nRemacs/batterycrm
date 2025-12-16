package eF;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FreemiumRulesOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LeF/b;", "", "a", "b", "c", "LeF/b$a;", "LeF/b$b;", "LeF/b$c;", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eF.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC39998b {

    /* compiled from: FreemiumRulesOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LeF/b$a;", "LeF/b;", "<init>", "()V", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eF.b$a */
    public static final /* data */ class a implements InterfaceC39998b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f395066a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 100528728;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: FreemiumRulesOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeF/b$b;", "LeF/b;", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eF.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11062b implements InterfaceC39998b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f395067a;

        public C11062b(@k DeepLink deepLink) {
            this.f395067a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11062b) && L.f(this.f395067a, ((C11062b) obj).f395067a);
        }

        public final int hashCode() {
            return this.f395067a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeepLink(deepLink="), this.f395067a, ')');
        }
    }

    /* compiled from: FreemiumRulesOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeF/b$c;", "LeF/b;", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eF.b$c */
    public static final /* data */ class c implements InterfaceC39998b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f395068a;

        public c(@k String str) {
            this.f395068a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f395068a, ((c) obj).f395068a);
        }

        public final int hashCode() {
            return this.f395068a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowErrorToast(message="), this.f395068a, ')');
        }
    }
}

package mw;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.developments_advice.t;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DevelopmentsAdviceAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lmw/a;", "", "a", "b", "c", "d", "e", "Lmw/a$a;", "Lmw/a$b;", "Lmw/a$c;", "Lmw/a$d;", "Lmw/a$e;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mw.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC44144a {

    /* compiled from: DevelopmentsAdviceAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmw/a$a;", "Lmw/a;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mw.a$a, reason: collision with other inner class name */
    public static final class C11848a implements InterfaceC44144a {

        /* renamed from: a, reason: collision with root package name */
        public final int f414803a;

        public C11848a(int i12) {
            this.f414803a = i12;
        }
    }

    /* compiled from: DevelopmentsAdviceAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmw/a$b;", "Lmw/a;", "<init>", "()V", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mw.a$b */
    public static final class b implements InterfaceC44144a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f414804a = new b();
    }

    /* compiled from: DevelopmentsAdviceAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmw/a$c;", "Lmw/a;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mw.a$c */
    public static final class c implements InterfaceC44144a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f414805a;

        public c(@k DeepLink deepLink) {
            this.f414805a = deepLink;
        }
    }

    /* compiled from: DevelopmentsAdviceAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmw/a$d;", "Lmw/a;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mw.a$d */
    public static final /* data */ class d implements InterfaceC44144a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f414806a;

        public d(@k String str) {
            this.f414806a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f414806a, ((d) obj).f414806a);
        }

        public final int hashCode() {
            return this.f414806a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("PhoneSuggestionClicked(phone="), this.f414806a, ')');
        }
    }

    /* compiled from: DevelopmentsAdviceAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmw/a$e;", "Lmw/a;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mw.a$e */
    public static final class e implements InterfaceC44144a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final t f414807a;

        public e(@k t tVar) {
            this.f414807a = tVar;
        }
    }
}

package DA;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PersonalLinkEditAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LDA/a;", "", "a", "b", "c", "LDA/a$a;", "LDA/a$b;", "LDA/a$c;", "_avito_extended-profile-personal-link-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface a {

    /* compiled from: PersonalLinkEditAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDA/a$a;", "LDA/a;", "<init>", "()V", "_avito_extended-profile-personal-link-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: DA.a$a, reason: collision with other inner class name */
    public static final class C0155a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0155a f3074a = new C0155a();
    }

    /* compiled from: PersonalLinkEditAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDA/a$b;", "LDA/a;", "<init>", "()V", "_avito_extended-profile-personal-link-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f3075a = new b();
    }

    /* compiled from: PersonalLinkEditAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDA/a$c;", "LDA/a;", "_avito_extended-profile-personal-link-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f3076a;

        public c(@k String str) {
            this.f3076a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f3076a, ((c) obj).f3076a);
        }

        public final int hashCode() {
            return this.f3076a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("TypingText(text="), this.f3076a, ')');
        }
    }
}

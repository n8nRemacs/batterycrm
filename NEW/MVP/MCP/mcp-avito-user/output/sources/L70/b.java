package l70;

import Y61.k;
import Y61.l;
import com.avito.android.personal_selections.view.PersonalSelectionsItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PersonalSelectionsInternalAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Ll70/b;", "", "a", "b", "Ll70/b$a;", "Ll70/b$b;", "_avito_personal-selections_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: PersonalSelectionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll70/b$a;", "Ll70/b;", "_avito_personal-selections_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PersonalSelectionsItem f413538a;

        public a(@k PersonalSelectionsItem personalSelectionsItem) {
            this.f413538a = personalSelectionsItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f413538a, ((a) obj).f413538a);
        }

        public final int hashCode() {
            return this.f413538a.hashCode();
        }

        @k
        public final String toString() {
            return "Content(item=" + this.f413538a + ')';
        }
    }

    /* compiled from: PersonalSelectionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll70/b$b;", "Ll70/b;", "<init>", "()V", "_avito_personal-selections_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: l70.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11776b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11776b f413539a = new C11776b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11776b);
        }

        public final int hashCode() {
            return -585958738;
        }

        @k
        public final String toString() {
            return "NoContent";
        }
    }
}

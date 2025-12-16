package EI0;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;

/* compiled from: Overlay.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LEI0/a;", "", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: Overlay.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEI0/a$a;", "LEI0/a;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: EI0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0223a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0223a f3921a = new C0223a();

        /* renamed from: b, reason: collision with root package name */
        public static final int f3922b = BeduinInputModel.MIN_TEXT_VERSION;

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0223a);
        }

        @Override // EI0.a
        public final int getPriority() {
            return f3922b;
        }

        public final int hashCode() {
            return -1863992510;
        }

        @k
        public final String toString() {
            return "Empty";
        }
    }

    int getPriority();
}

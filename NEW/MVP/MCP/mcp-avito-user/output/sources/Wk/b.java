package WK;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: IacFinishedFeedbackScreenEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LWK/b;", "", "a", "b", "LWK/b$a;", "LWK/b$b;", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface b {

    /* compiled from: IacFinishedFeedbackScreenEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWK/b$a;", "LWK/b;", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f17859a;

        public a(boolean z12) {
            this.f17859a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f17859a == ((a) obj).f17859a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f17859a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("CloseScreen(delayed="), this.f17859a, ')');
        }
    }

    /* compiled from: IacFinishedFeedbackScreenEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWK/b$b;", "LWK/b;", "<init>", "()V", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: WK.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1263b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1263b f17860a = new C1263b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1263b);
        }

        public final int hashCode() {
            return 820182153;
        }

        @k
        public final String toString() {
            return "DisplayBottomSheet";
        }
    }
}

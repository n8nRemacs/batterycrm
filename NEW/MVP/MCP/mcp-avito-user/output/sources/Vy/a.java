package VY;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BottomSheetInputAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LVY/a;", "", "a", "b", "LVY/a$a;", "LVY/a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: BottomSheetInputAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVY/a$a;", "LVY/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: VY.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1183a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f17187a;

        public C1183a(@k String str) {
            this.f17187a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1183a) && L.f(this.f17187a, ((C1183a) obj).f17187a);
        }

        public final int hashCode() {
            return this.f17187a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnConfirmClicked(inputText="), this.f17187a, ')');
        }
    }

    /* compiled from: BottomSheetInputAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVY/a$b;", "LVY/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f17188a;

        public b(@k String str) {
            this.f17188a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f17188a, ((b) obj).f17188a);
        }

        public final int hashCode() {
            return this.f17188a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnTextChanged(text="), this.f17188a, ')');
        }
    }
}

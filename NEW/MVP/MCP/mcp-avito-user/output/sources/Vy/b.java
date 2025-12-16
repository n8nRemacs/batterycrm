package VY;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BottomSheetInputOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LVY/b;", "", "a", "b", "LVY/b$a;", "LVY/b$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: BottomSheetInputOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVY/b$a;", "LVY/b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f17189a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1116052081;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: BottomSheetInputOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVY/b$b;", "LVY/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: VY.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1184b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f17190a;

        public C1184b(@k PrintableText printableText) {
            this.f17190a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1184b) && L.f(this.f17190a, ((C1184b) obj).f17190a);
        }

        public final int hashCode() {
            return this.f17190a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowError(text="), this.f17190a, ')');
        }
    }
}

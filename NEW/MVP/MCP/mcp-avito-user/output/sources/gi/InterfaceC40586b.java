package gI;

import Y61.k;
import Y61.l;
import com.avito.android.guests_selector.io.GuestsSelectorOutput;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GuestsSelectorOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LgI/b;", "", "a", "b", "LgI/b$a;", "LgI/b$b;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gI.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC40586b {

    /* compiled from: GuestsSelectorOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LgI/b$a;", "LgI/b;", "<init>", "()V", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gI.b$a */
    public static final /* data */ class a implements InterfaceC40586b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f396429a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -2036092582;
        }

        @k
        public final String toString() {
            return "CloseDialog";
        }
    }

    /* compiled from: GuestsSelectorOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LgI/b$b;", "LgI/b;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gI.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11204b implements InterfaceC40586b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final GuestsSelectorOutput f396430a;

        public C11204b(@k GuestsSelectorOutput guestsSelectorOutput) {
            this.f396430a = guestsSelectorOutput;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11204b) && L.f(this.f396430a, ((C11204b) obj).f396430a);
        }

        public final int hashCode() {
            return this.f396430a.hashCode();
        }

        @k
        public final String toString() {
            return "SetResult(outputParams=" + this.f396430a + ')';
        }
    }
}

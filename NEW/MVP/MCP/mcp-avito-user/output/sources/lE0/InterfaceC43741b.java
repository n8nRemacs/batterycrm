package le0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InputImeiOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lle0/b;", "", "a", "b", "c", "d", "e", "Lle0/b$a;", "Lle0/b$b;", "Lle0/b$c;", "Lle0/b$d;", "Lle0/b$e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: le0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC43741b {

    /* compiled from: InputImeiOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lle0/b$a;", "Lle0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: le0.b$a */
    public static final /* data */ class a implements InterfaceC43741b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final CategoryPublishStep.Params.ScanButtonData.Position f413968a;

        public a(@k CategoryPublishStep.Params.ScanButtonData.Position position) {
            this.f413968a = position;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f413968a == ((a) obj).f413968a;
        }

        public final int hashCode() {
            return this.f413968a.hashCode();
        }

        @k
        public final String toString() {
            return "AddScanButton(scanButtonPosition=" + this.f413968a + ')';
        }
    }

    /* compiled from: InputImeiOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lle0/b$b;", "Lle0/b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: le0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11792b implements InterfaceC43741b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11792b f413969a = new C11792b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11792b);
        }

        public final int hashCode() {
            return 173390605;
        }

        @k
        public final String toString() {
            return "SaveAndExit";
        }
    }

    /* compiled from: InputImeiOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lle0/b$c;", "Lle0/b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: le0.b$c */
    public static final /* data */ class c implements InterfaceC43741b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f413970a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -836173488;
        }

        @k
        public final String toString() {
            return "ScanImei";
        }
    }

    /* compiled from: InputImeiOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lle0/b$d;", "Lle0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: le0.b$d */
    public static final /* data */ class d implements InterfaceC43741b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f413971a;

        public d(@k PrintableText printableText) {
            this.f413971a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f413971a, ((d) obj).f413971a);
        }

        public final int hashCode() {
            return this.f413971a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowErrorMessage(text="), this.f413971a, ')');
        }
    }

    /* compiled from: InputImeiOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lle0/b$e;", "Lle0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: le0.b$e */
    public static final /* data */ class e implements InterfaceC43741b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ru.avito.component.toolbar.d f413972a;

        public e(@k ru.avito.component.toolbar.d dVar) {
            this.f413972a = dVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f413972a, ((e) obj).f413972a);
        }

        public final int hashCode() {
            return this.f413972a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowOnboarding(onboardingData=" + this.f413972a + ')';
        }
    }
}

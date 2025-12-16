package ZK;

import Y61.k;
import Y61.l;
import aL.C19787a;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer_finished.public_module.screens.finished_mic_request_screen.IacFinishedMicRequestScreenArgument;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiDeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacFinishedMicRequestScreenEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"LZK/b;", "", "a", "b", "c", "d", "e", "f", "LZK/b$a;", "LZK/b$b;", "LZK/b$d;", "LZK/b$e;", "LZK/b$f;", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final c f20102a = c.f20104a;

    /* compiled from: IacFinishedMicRequestScreenEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZK/b$a;", "LZK/b;", "<init>", "()V", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b {
        static {
            new a();
        }

        @k
        public final String toString() {
            b.f20102a.getClass();
            return c.f20105b.a(new String[0], this);
        }
    }

    /* compiled from: IacFinishedMicRequestScreenEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZK/b$b;", "LZK/b;", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ZK.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1436b implements b {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final IacPiiDeepLink f20103b;

        public C1436b(@l IacPiiDeepLink iacPiiDeepLink) {
            this.f20103b = iacPiiDeepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1436b) && L.f(this.f20103b, ((C1436b) obj).f20103b);
        }

        public final int hashCode() {
            IacPiiDeepLink iacPiiDeepLink = this.f20103b;
            if (iacPiiDeepLink == null) {
                return 0;
            }
            return iacPiiDeepLink.hashCode();
        }

        @k
        public final String toString() {
            b.f20102a.getClass();
            return c.f20105b.a(new String[]{"link=" + this.f20103b}, this);
        }
    }

    /* compiled from: IacFinishedMicRequestScreenEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZK/b$c;", "", "<init>", "()V", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ c f20104a = new c();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C19787a<b> f20105b = new C19787a<>(b.class);
    }

    /* compiled from: IacFinishedMicRequestScreenEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZK/b$d;", "LZK/b;", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final IacPiiDeepLink f20106b;

        public d(@k IacPiiDeepLink iacPiiDeepLink) {
            this.f20106b = iacPiiDeepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f20106b, ((d) obj).f20106b);
        }

        public final int hashCode() {
            return this.f20106b.hashCode();
        }

        @k
        public final String toString() {
            b.f20102a.getClass();
            return c.f20105b.a(new String[]{"link=" + this.f20106b}, this);
        }
    }

    /* compiled from: IacFinishedMicRequestScreenEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZK/b$e;", "LZK/b;", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final IacFinishedMicRequestScreenArgument f20107b;

        public e(@k IacFinishedMicRequestScreenArgument iacFinishedMicRequestScreenArgument) {
            this.f20107b = iacFinishedMicRequestScreenArgument;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f20107b, ((e) obj).f20107b);
        }

        public final int hashCode() {
            return this.f20107b.hashCode();
        }

        @k
        public final String toString() {
            b.f20102a.getClass();
            return c.f20105b.a(new String[]{"argument=" + this.f20107b}, this);
        }
    }

    /* compiled from: IacFinishedMicRequestScreenEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZK/b$f;", "LZK/b;", "<init>", "()V", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final f f20108b = new f();

        @k
        public final String toString() {
            b.f20102a.getClass();
            return c.f20105b.a(new String[0], this);
        }
    }
}

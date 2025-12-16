package Ux;

import Y61.k;
import Y61.l;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessAdvertFeedbackOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LUx/b;", "", "a", "b", "LUx/b$a;", "LUx/b$b;", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ux.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC15580b {

    /* compiled from: EarlyAccessAdvertFeedbackOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUx/b$a;", "LUx/b;", "<init>", "()V", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ux.b$a */
    public static final class a implements InterfaceC15580b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f16786a = new a();
    }

    /* compiled from: EarlyAccessAdvertFeedbackOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUx/b$b;", "LUx/b;", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ux.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1156b implements InterfaceC15580b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f16787a;

        public C1156b(@k PrintableText printableText) {
            this.f16787a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1156b) && L.f(this.f16787a, ((C1156b) obj).f16787a);
        }

        public final int hashCode() {
            return this.f16787a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowErrorToast(message="), this.f16787a, ')');
        }
    }
}

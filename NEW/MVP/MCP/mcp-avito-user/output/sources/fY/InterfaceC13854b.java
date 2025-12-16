package Fy;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EmailUpdateOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LFy/b;", "", "a", "LFy/b$a;", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Fy.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC13854b {

    /* compiled from: EmailUpdateOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFy/b$a;", "LFy/b;", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fy.b$a */
    public static final /* data */ class a implements InterfaceC13854b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f6094a;

        public a(@k Throwable th2) {
            this.f6094a = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f6094a, ((a) obj).f6094a);
        }

        public final int hashCode() {
            return this.f6094a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("EmailFailedToChangeOneTimeEvent(error="), this.f6094a, ')');
        }
    }
}

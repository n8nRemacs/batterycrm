package be;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AuthSocialsAction.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lbe/b;", "", "a", "Lbe/b$a;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: be.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC25635b {

    /* compiled from: AuthSocialsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbe/b$a;", "Lbe/b;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: be.b$a */
    public static final /* data */ class a implements InterfaceC25635b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InterfaceC25634a f57306a;

        public a(@k InterfaceC25634a interfaceC25634a) {
            this.f57306a = interfaceC25634a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f57306a, ((a) obj).f57306a);
        }

        public final int hashCode() {
            return this.f57306a.hashCode();
        }

        @k
        public final String toString() {
            return "SocialClick(social=" + this.f57306a + ')';
        }
    }
}

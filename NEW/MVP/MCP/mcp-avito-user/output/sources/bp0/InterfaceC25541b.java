package bP0;

import Y61.k;
import Y61.l;
import android.content.Intent;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TopUpFormOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LbP0/b;", "", "a", "b", "LbP0/b$a;", "LbP0/b$b;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bP0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC25541b {

    /* compiled from: TopUpFormOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbP0/b$a;", "LbP0/b;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bP0.b$a */
    public static final /* data */ class a implements InterfaceC25541b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f57055a;

        public a(@k String str) {
            this.f57055a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f57055a, ((a) obj).f57055a);
        }

        public final int hashCode() {
            return this.f57055a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("CloseScreenWithError(error="), this.f57055a, ')');
        }
    }

    /* compiled from: TopUpFormOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbP0/b$b;", "LbP0/b;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bP0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C2000b implements InterfaceC25541b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Intent f57056a;

        public C2000b(@k Intent intent) {
            this.f57056a = intent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2000b) && L.f(this.f57056a, ((C2000b) obj).f57056a);
        }

        public final int hashCode() {
            return this.f57056a.hashCode();
        }

        @k
        public final String toString() {
            return "SubmitTopUp(intent=" + this.f57056a + ')';
        }
    }
}

package Fy;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EmailUpdateAction.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LFy/a;", "", "a", "LFy/a$a;", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Fy.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC13853a {

    /* compiled from: EmailUpdateAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFy/a$a;", "LFy/a;", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fy.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0314a implements InterfaceC13853a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f6093a;

        public C0314a(@k String str) {
            this.f6093a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0314a) && L.f(this.f6093a, ((C0314a) obj).f6093a);
        }

        public final int hashCode() {
            return this.f6093a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SaveEmail(email="), this.f6093a, ')');
        }
    }
}

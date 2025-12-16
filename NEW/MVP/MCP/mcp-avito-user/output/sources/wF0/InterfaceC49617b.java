package wf0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: SleepingPlacesOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lwf0/b;", "", "a", "Lwf0/b$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wf0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC49617b {

    /* compiled from: SleepingPlacesOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwf0/b$a;", "Lwf0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wf0.b$a */
    public static final /* data */ class a implements InterfaceC49617b {

        /* renamed from: a, reason: collision with root package name */
        public final int f441724a;

        public a(int i12) {
            this.f441724a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f441724a == ((a) obj).f441724a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f441724a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("PassResult(bedId="), this.f441724a, ')');
        }
    }
}

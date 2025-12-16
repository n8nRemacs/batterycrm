package Zz;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProofTypesOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LZz/b;", "", "a", "b", "LZz/b$a;", "LZz/b$b;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zz.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC19625b {

    /* compiled from: ProofTypesOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZz/b$a;", "LZz/b;", "<init>", "()V", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zz.b$a */
    public static final class a implements InterfaceC19625b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f20617a = new a();
    }

    /* compiled from: ProofTypesOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZz/b$b;", "LZz/b;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zz.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1476b implements InterfaceC19625b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f20618a;

        public C1476b(@k String str) {
            this.f20618a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1476b) && L.f(this.f20618a, ((C1476b) obj).f20618a);
        }

        public final int hashCode() {
            return this.f20618a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenDetailsScreen(screenId="), this.f20618a, ')');
        }
    }
}

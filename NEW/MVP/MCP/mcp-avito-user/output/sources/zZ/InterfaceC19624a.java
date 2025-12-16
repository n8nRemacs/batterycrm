package Zz;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProofTypesAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LZz/a;", "", "a", "b", "LZz/a$a;", "LZz/a$b;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zz.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC19624a {

    /* compiled from: ProofTypesAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZz/a$a;", "LZz/a;", "<init>", "()V", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zz.a$a, reason: collision with other inner class name */
    public static final class C1475a implements InterfaceC19624a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1475a f20615a = new C1475a();
    }

    /* compiled from: ProofTypesAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZz/a$b;", "LZz/a;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zz.a$b */
    public static final /* data */ class b implements InterfaceC19624a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f20616a;

        public b(@k String str) {
            this.f20616a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f20616a, ((b) obj).f20616a);
        }

        public final int hashCode() {
            return this.f20616a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SelectButtonClick(screenId="), this.f20616a, ')');
        }
    }
}

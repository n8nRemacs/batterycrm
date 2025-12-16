package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.b;
import com.google.common.util.concurrent.D0;
import kotlin.Metadata;
import kotlinx.coroutines.InterfaceC43076a0;
import kotlinx.coroutines.V0;

/* compiled from: CoroutineAdapter.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ads-adservices-java_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {
    public static D0 a(final InterfaceC43076a0 interfaceC43076a0) {
        return androidx.concurrent.futures.b.a(new b.c() { // from class: androidx.privacysandbox.ads.adservices.java.internal.a
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.concurrent.futures.b.c
            public final Object d(b.a aVar) {
                InterfaceC43076a0 interfaceC43076a02 = interfaceC43076a0;
                ((V0) interfaceC43076a02).k(new b(aVar, interfaceC43076a02));
                return "Deferred.asListenableFuture";
            }
        });
    }
}

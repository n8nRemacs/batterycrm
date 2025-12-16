package io.ktor.serialization;

import io.ktor.client.plugins.contentnegotiation.a;
import io.ktor.client.plugins.contentnegotiation.j;
import io.ktor.http.C41524i;
import io.ktor.http.InterfaceC41526j;
import kotlin.Metadata;

/* compiled from: ContentConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/serialization/a;", "", "ktor-serialization"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface a {

    /* compiled from: ContentConverter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.serialization.a$a, reason: collision with other inner class name */
    public static final class C11416a {
        public static void a(a.C11402a c11402a, C41524i c41524i, io.ktor.serialization.kotlinx.i iVar) {
            b bVar = b.f400278l;
            c11402a.getClass();
            C41524i.a.f400035a.getClass();
            InterfaceC41526j bVar2 = c41524i.equals(C41524i.a.f400036b) ? j.f399338a : new io.ktor.client.plugins.contentnegotiation.b(c41524i);
            bVar.invoke(iVar);
            c11402a.f399309b.add(new a.C11402a.C11403a(iVar, c41524i, bVar2));
        }
    }
}

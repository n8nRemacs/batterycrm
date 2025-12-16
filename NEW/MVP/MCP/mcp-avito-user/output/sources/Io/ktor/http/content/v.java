package io.ktor.http.content;

import io.ktor.http.C41519f0;
import io.ktor.http.C41524i;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Multipart.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/ktor/http/i;", "invoke", "()Lio/ktor/http/i;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes8.dex */
final class v extends N implements Y41.a<C41524i> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t f399990l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(t tVar) {
        super(0);
        this.f399990l = tVar;
    }

    @Override // Y41.a
    public final C41524i invoke() {
        t tVar = this.f399990l;
        C41519f0.f400005a.getClass();
        String str = tVar.f399986b.get(C41519f0.f400014j);
        if (str == null) {
            return null;
        }
        C41524i.f400031f.getClass();
        return C41524i.c.a(str);
    }
}

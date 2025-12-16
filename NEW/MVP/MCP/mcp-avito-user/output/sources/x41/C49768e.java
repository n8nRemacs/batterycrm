package x41;

import javax.servlet.http.HttpServletRequest;
import y41.C50057c;
import y41.C50063i;

/* compiled from: HttpEventBuilderHelper.java */
/* renamed from: x41.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C49768e implements InterfaceC49766c {

    /* renamed from: a, reason: collision with root package name */
    public final C49764a f442209a = new C49764a();

    @Override // x41.InterfaceC49766c
    public final void a(io.sentry.event.b bVar) {
        HttpServletRequest httpServletRequestA = A41.b.a();
        if (httpServletRequestA == null) {
            return;
        }
        bVar.d(new C50057c(httpServletRequestA, this.f442209a), false);
        b(bVar, httpServletRequestA);
    }

    public final void b(io.sentry.event.b bVar, HttpServletRequest httpServletRequest) {
        bVar.d(new C50063i(httpServletRequest.getUserPrincipal() != null ? httpServletRequest.getUserPrincipal().getName() : null, this.f442209a.a(httpServletRequest)), false);
    }
}

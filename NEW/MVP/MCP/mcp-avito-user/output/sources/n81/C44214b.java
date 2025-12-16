package n81;

import java.util.concurrent.ConcurrentHashMap;
import o81.InterfaceC44601a;
import t81.AbstractC48517a;

/* compiled from: ObjenesisBase.java */
/* renamed from: n81.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C44214b implements InterfaceC44213a {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC48517a f414908a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap<String, InterfaceC44601a<?>> f414909b;

    public C44214b(AbstractC48517a abstractC48517a, boolean z12) {
        this.f414908a = abstractC48517a;
        this.f414909b = z12 ? new ConcurrentHashMap<>() : null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getName());
        sb2.append(" using ");
        sb2.append(this.f414908a.getClass().getName());
        return AK.c.s(sb2, this.f414909b == null ? " without" : " with", " caching");
    }
}

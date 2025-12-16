package coil.request;

import M2.c;
import coil.view.InterfaceC27254h;
import coil.view.Precision;
import coil.view.Scale;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DefinedRequestOptions.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/request/c;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: coil.request.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27246c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final InterfaceC27254h f58637a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Scale f58638b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final c.a f58639c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Precision f58640d;

    public C27246c(@Y61.l InterfaceC27254h interfaceC27254h, @Y61.l Scale scale, @Y61.l c.a aVar, @Y61.l Precision precision) {
        this.f58637a = interfaceC27254h;
        this.f58638b = scale;
        this.f58639c = aVar;
        this.f58640d = precision;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C27246c) {
            C27246c c27246c = (C27246c) obj;
            c27246c.getClass();
            if (L.f(null, null) && L.f(this.f58637a, c27246c.f58637a) && this.f58638b == c27246c.f58638b && L.f(null, null) && L.f(null, null) && L.f(null, null) && L.f(null, null) && L.f(this.f58639c, c27246c.f58639c) && this.f58640d == c27246c.f58640d && L.f(null, null) && L.f(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        InterfaceC27254h interfaceC27254h = this.f58637a;
        int iHashCode = (interfaceC27254h != null ? interfaceC27254h.hashCode() : 0) * 31;
        Scale scale = this.f58638b;
        int iHashCode2 = (iHashCode + (scale != null ? scale.hashCode() : 0)) * 28629151;
        c.a aVar = this.f58639c;
        int iHashCode3 = (iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Precision precision = this.f58640d;
        return (iHashCode3 + (precision != null ? precision.hashCode() : 0)) * 887503681;
    }
}

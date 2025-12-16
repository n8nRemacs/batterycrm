package uS;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.avito.component.map.state.Pin;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Pins.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LuS/c;", "", "_design-modules_beduin-v2_renderer_component_map"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uS.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C48945c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f439966a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Pin.Anchor f439967b;

    public C48945c(@k String str, @k Pin.Anchor anchor) {
        this.f439966a = str;
        this.f439967b = anchor;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48945c)) {
            return false;
        }
        C48945c c48945c = (C48945c) obj;
        return L.f(this.f439966a, c48945c.f439966a) && this.f439967b == c48945c.f439967b;
    }

    public final int hashCode() {
        return this.f439967b.hashCode() + (this.f439966a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "RemotePinImage(url=" + this.f439966a + ", anchor=" + this.f439967b + ')';
    }
}

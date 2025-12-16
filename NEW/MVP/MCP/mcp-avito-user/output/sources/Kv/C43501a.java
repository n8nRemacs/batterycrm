package kv;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeeplinkResultEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkv/a;", "", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kv.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C43501a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.bundle.a f413260a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC14249c f413261b;

    public C43501a(@k com.avito.android.deeplink_handler.handler.bundle.a aVar, @k InterfaceC14249c interfaceC14249c) {
        this.f413260a = aVar;
        this.f413261b = interfaceC14249c;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43501a)) {
            return false;
        }
        C43501a c43501a = (C43501a) obj;
        return L.f(this.f413260a, c43501a.f413260a) && L.f(this.f413261b, c43501a.f413261b);
    }

    public final int hashCode() {
        return this.f413261b.hashCode() + (this.f413260a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "DeeplinkResultEvent(bundle=" + this.f413260a + ", result=" + this.f413261b + ')';
    }
}

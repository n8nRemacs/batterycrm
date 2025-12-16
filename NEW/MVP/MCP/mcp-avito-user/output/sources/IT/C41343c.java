package iT;

import Y61.k;
import Y61.l;
import cU0.C27106d;
import cU0.InterfaceC27108f;
import com.avito.beduin.v2.engine.component.x;
import com.avito.beduin.v2.engine.component.z;
import kotlin.Metadata;

/* compiled from: BeduinMetaStoragesHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LiT/c;", "LiT/a;", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iT.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C41343c implements InterfaceC41341a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final x f398526b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C27106d f398527c;

    public C41343c(@k x xVar, @k C27106d c27106d) {
        this.f398526b = xVar;
        this.f398527c = c27106d;
    }

    @Override // iT.InterfaceC41341a
    @k
    public final InterfaceC27108f Ed() {
        return this.f398527c;
    }

    @Override // iT.InterfaceC41341a
    @k
    public final z H4() {
        return this.f398526b;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41343c)) {
            return false;
        }
        C41343c c41343c = (C41343c) obj;
        return this.f398526b.equals(c41343c.f398526b) && this.f398527c.equals(c41343c.f398527c);
    }

    public final int hashCode() {
        return this.f398527c.hashCode() + (this.f398526b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "SimpleBeduinMetaStoragesHolder(metaComponentsStorage=" + this.f398526b + ", metaFunctionsStorage=" + this.f398527c + ')';
    }
}

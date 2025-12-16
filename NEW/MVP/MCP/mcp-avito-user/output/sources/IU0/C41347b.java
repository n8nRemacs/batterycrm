package iU0;

import Y61.k;
import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.d;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.j;
import com.avito.beduin.v2.engine.field.m;
import com.avito.beduin.v2.engine.utils.f;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: CreatePerfMarkerFunction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LiU0/b;", "LcU0/a;", "<init>", "()V", "function_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iU0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41347b extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C41347b f398529a = new C41347b();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final String f398530b = "CreatePerfMarker";

    @Override // cU0.AbstractC27103a
    @k
    public final d b(@k z zVar, @k j jVar, @k m mVar) {
        return new A(new m((Q<String, ? extends d>[]) new Q[]{new Q("perf_tag", C36273j.e(zVar, f.a()))}), null, 2, null);
    }

    @Override // cU0.InterfaceC27104b
    @k
    /* renamed from: getType */
    public final String getF415152b() {
        return f398530b;
    }
}

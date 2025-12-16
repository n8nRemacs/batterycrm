package com.avito.beduin.v2.render.compose;

import androidx.compose.runtime.C22066f2;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Rebugger.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class u extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Map<String, Object> f338100l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.p<String, String, G0> f338101m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f338102n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Map map, Y41.p pVar, String str, int i12) {
        super(2);
        this.f338100l = map;
        this.f338101m = pVar;
        this.f338102n = str;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1);
        v.a(this.f338100l, this.f338102n, a12, iA2);
        return G0.f406611a;
    }
}

package com.avito.beduin.v2.interaction.delegate.flow;

import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.entity.l;
import com.avito.beduin.v2.engine.field.m;
import dU0.f;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DelegateInteraction.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LdU0/f;", "invoke", "()LdU0/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class a extends N implements Y41.a<f> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f337286l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f337287m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ A f337288n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l lVar, z zVar, A a12) {
        super(0);
        this.f337286l = lVar;
        this.f337287m = zVar;
        this.f337288n = a12;
    }

    @Override // Y41.a
    public final f invoke() {
        l lVar = this.f337286l;
        if (lVar != null) {
            return lVar.t(this.f337287m.getF336594a().i(), new m((Map<String, ? extends com.avito.beduin.v2.engine.field.d>) Collections.singletonMap("args", this.f337288n)));
        }
        return null;
    }
}

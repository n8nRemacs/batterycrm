package com.avito.beduin.v2.interaction.postmessage.flow;

import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.entity.l;
import com.avito.beduin.v2.engine.field.m;
import dU0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WebViewPostMessageInteraction.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LdU0/f;", "invoke", "()LdU0/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class a extends N implements Y41.a<f> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f337711l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f337712m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(z zVar, l lVar) {
        super(0);
        this.f337711l = lVar;
        this.f337712m = zVar;
    }

    @Override // Y41.a
    public final f invoke() {
        l lVar = this.f337711l;
        if (lVar == null) {
            return null;
        }
        z zVarI = this.f337712m.getF336594a().i();
        m.f336868b.getClass();
        return lVar.t(zVarI, m.f336869c);
    }
}

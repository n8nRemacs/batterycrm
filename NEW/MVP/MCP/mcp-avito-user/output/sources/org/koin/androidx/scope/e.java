package org.koin.androidx.scope;

import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: ActivityViewModelLazy.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "androidx/activity/d", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
public final class e extends N implements Y41.a<AbstractC50339a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f421409l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p pVar) {
        super(0);
        this.f421409l = pVar;
    }

    @Override // Y41.a
    public final AbstractC50339a invoke() {
        return this.f421409l.getDefaultViewModelCreationExtras();
    }
}

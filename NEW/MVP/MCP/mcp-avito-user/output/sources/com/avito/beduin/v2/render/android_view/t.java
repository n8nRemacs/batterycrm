package com.avito.beduin.v2.render.android_view;

import com.avito.beduin.v2.engine.component.InterfaceC36244d;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ContainerHelper.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/beduin/v2/engine/component/d;", "T", "it", "", "invoke", "(Lcom/avito/beduin/v2/engine/component/d;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class t extends N implements Y41.l<InterfaceC36244d, String> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC36244d, InterfaceC36249i> f338013l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(Y41.l<InterfaceC36244d, ? extends InterfaceC36249i> lVar) {
        super(1);
        this.f338013l = lVar;
    }

    @Override // Y41.l
    public final String invoke(InterfaceC36244d interfaceC36244d) {
        return this.f338013l.invoke(interfaceC36244d).getId();
    }
}

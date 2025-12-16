package com.yandex.div.core.view2.divs;

import com.yandex.div.core.InterfaceC37915j;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div2.DivAction;
import java.util.List;
import kotlin.Metadata;

/* compiled from: DivStateBinder.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* renamed from: com.yandex.div.core.view2.divs.a2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37934a2 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<DivAction> f368336l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z1 f368337m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C38029k f368338n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37934a2(C38029k c38029k, Z1 z12, com.yandex.div.core.view2.divs.widgets.t tVar, List list) {
        super(0);
        this.f368336l = list;
        this.f368337m = z12;
        this.f368338n = c38029k;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        for (DivAction divAction : this.f368336l) {
            Z1 z12 = this.f368337m;
            z12.f368294f.a(this.f368338n, divAction, null);
            z12.f368297i.getClass();
            InterfaceC37915j interfaceC37915j = InterfaceC37915j.f367563a;
        }
        return kotlin.G0.f406611a;
    }
}

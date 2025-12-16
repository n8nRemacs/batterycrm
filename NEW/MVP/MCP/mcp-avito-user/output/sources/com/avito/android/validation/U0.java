package com.avito.android.validation;

import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.items.ItemWithState;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ParametersListPresenterImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/avito/conveyor_item/a;", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class U0 extends kotlin.jvm.internal.N implements Y41.l<List<? extends com.avito.conveyor_item.a>, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y0 f319304l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f319305m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.items.a f319306n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ItemWithState.State.Normal f319307o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(Y0 y02, int i12, com.avito.android.items.a aVar, ItemWithState.State.Normal normal) {
        super(1);
        this.f319304l = y02;
        this.f319305m = i12;
        this.f319306n = aVar;
        this.f319307o = normal;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(List<? extends com.avito.conveyor_item.a> list) {
        this.f319304l.f319328g.set(this.f319305m, ParameterElement.p.f((ParameterElement.p) this.f319306n, null, null, this.f319307o, null, 536862719));
        return kotlin.G0.f406611a;
    }
}

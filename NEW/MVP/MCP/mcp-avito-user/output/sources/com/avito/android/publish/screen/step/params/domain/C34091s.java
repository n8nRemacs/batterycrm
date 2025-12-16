package com.avito.android.publish.screen.step.params.domain;

import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PublishDetailsInteractorAsync.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LUV0/b;", "Lcom/avito/conveyor_item/a;", "dataSource", "Lkotlin/G0;", "invoke", "(LUV0/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.screen.step.params.domain.s, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34091s extends kotlin.jvm.internal.N implements Y41.l<UV0.b<? extends com.avito.conveyor_item.a>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34076c f241289l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34091s(C34076c c34076c) {
        super(1);
        this.f241289l = c34076c;
    }

    @Override // Y41.l
    public final G0 invoke(UV0.b<? extends com.avito.conveyor_item.a> bVar) {
        Iterator<? extends com.avito.conveyor_item.a> it = bVar.iterator();
        while (it.hasNext()) {
            this.f241289l.f241198m.a(it.next());
        }
        return G0.f406611a;
    }
}

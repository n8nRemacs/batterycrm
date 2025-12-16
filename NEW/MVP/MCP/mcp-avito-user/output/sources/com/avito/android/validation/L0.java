package com.avito.android.validation;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ParametersListPresenterImpl.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a4\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005 \u0002*\u0019\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00060\u0004¢\u0006\u0002\b\u00062\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lcom/avito/conveyor_item/a;", "kotlin.jvm.PlatformType", "it", "Lorg/reactivestreams/c;", "Lkotlin/G0;", "Lj41/e;", "invoke", "(Ljava/util/List;)Lorg/reactivestreams/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class L0 extends kotlin.jvm.internal.N implements Y41.l<List<? extends com.avito.conveyor_item.a>, org.reactivestreams.c<? extends kotlin.G0>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y0 f319274l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(Y0 y02) {
        super(1);
        this.f319274l = y02;
    }

    @Override // Y41.l
    public final org.reactivestreams.c<? extends kotlin.G0> invoke(List<? extends com.avito.conveyor_item.a> list) {
        Y0 y02 = this.f319274l;
        return y02.f319322a.b().G0(BackpressureStrategy.f401954c).k(new com.avito.android.blueprints.publish.reg_number.d(26, new K0(y02)));
    }
}

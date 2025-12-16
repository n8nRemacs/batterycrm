package com.avito.android.validation;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ParametersListPresenterImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/avito/conveyor_item/a;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class J0 extends kotlin.jvm.internal.N implements Y41.l<List<? extends com.avito.conveyor_item.a>, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y0 f319270l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(Y0 y02) {
        super(1);
        this.f319270l = y02;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(List<? extends com.avito.conveyor_item.a> list) {
        this.f319270l.f319328g = new ArrayList(list);
        return kotlin.G0.f406611a;
    }
}

package com.avito.android.publish.details;

import java.util.List;
import kotlin.Metadata;

/* compiled from: PublishDetailsViewModel.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class n2 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K1 f234855l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List<com.avito.conveyor_item.a> f234856m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n2(K1 k12, List<? extends com.avito.conveyor_item.a> list) {
        super(0);
        this.f234855l = k12;
        this.f234856m = list;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        this.f234855l.pe(this.f234856m);
        return kotlin.G0.f406611a;
    }
}

package com.avito.android.service_booking_common.blueprints.input;

import com.avito.android.service_booking_common.blueprints.SbInputItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SbInputItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f276443l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SbInputItem f276444m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SbInputItem sbInputItem, h hVar) {
        super(0);
        this.f276443l = hVar;
        this.f276444m = sbInputItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f276443l.f276442c.K5(this.f276444m);
        return G0.f406611a;
    }
}

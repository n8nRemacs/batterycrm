package com.avito.android.service_booking_common.blueprints.input;

import com.avito.android.service_booking_common.blueprints.SbInputItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SbInputItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class g extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SbInputItem f276445l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f276446m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SbInputItem sbInputItem, h hVar) {
        super(1);
        this.f276445l = sbInputItem;
        this.f276446m = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        if (str2 == null) {
            str2 = "";
        }
        SbInputItem sbInputItem = this.f276445l;
        sbInputItem.f276231f = str2;
        this.f276446m.f276441b.K5(sbInputItem);
        return G0.f406611a;
    }
}

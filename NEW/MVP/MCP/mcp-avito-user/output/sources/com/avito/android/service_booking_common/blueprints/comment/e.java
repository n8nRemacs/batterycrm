package com.avito.android.service_booking_common.blueprints.comment;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SbCommentItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e extends N implements l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f276276l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f276277m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, f fVar) {
        super(1);
        this.f276276l = cVar;
        this.f276277m = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        c cVar = this.f276276l;
        cVar.f276275e = str;
        this.f276277m.f276278b.K5(cVar);
        return G0.f406611a;
    }
}

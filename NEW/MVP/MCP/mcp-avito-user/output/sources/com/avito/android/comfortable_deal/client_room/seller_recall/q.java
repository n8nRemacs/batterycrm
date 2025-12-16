package com.avito.android.comfortable_deal.client_room.seller_recall;

import com.avito.android.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.N;

/* compiled from: SellerRecallView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class q extends N implements Y41.a<List<? extends String>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f120021l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar) {
        super(0);
        this.f120021l = rVar;
    }

    @Override // Y41.a
    public final List<? extends String> invoke() {
        return C42756l.g0(this.f120021l.f120022a.getContext().getResources().getStringArray(R.array.reasons));
    }
}

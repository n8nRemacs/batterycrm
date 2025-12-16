package com.avito.android.profile.user_profile.cards.diff;

import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.conveyor_item.ParcelableItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: ProfileCardsDiffCallback.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/avito/conveyor_item/ParcelableItem;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class f extends N implements Y41.l<List<? extends ParcelableItem>, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TV0.a f224938l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TV0.a aVar) {
        super(1);
        this.f224938l = aVar;
    }

    @Override // Y41.l
    public final Boolean invoke(List<? extends ParcelableItem> list) {
        return Boolean.valueOf(!L.f(list, ((CardItem.ActiveOrdersWidgetCardItem) this.f224938l).f224299h));
    }
}

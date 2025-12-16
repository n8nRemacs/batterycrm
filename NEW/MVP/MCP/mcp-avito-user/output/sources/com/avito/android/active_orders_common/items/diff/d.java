package com.avito.android.active_orders_common.items.diff;

import Y41.l;
import com.avito.android.active_orders_common.items.order.OrderItem;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: ActiveOrdersDiffCallback.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/text/AttributedText;", "invoke", "(Lcom/avito/android/remote/model/text/AttributedText;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class d extends N implements l<AttributedText, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TV0.a f68359l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TV0.a aVar) {
        super(1);
        this.f68359l = aVar;
    }

    @Override // Y41.l
    public final Boolean invoke(AttributedText attributedText) {
        return Boolean.valueOf(!L.f(attributedText, ((OrderItem) this.f68359l).getF68368d()));
    }
}

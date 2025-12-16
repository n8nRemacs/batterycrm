package com.avito.android.item_price_history.data;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ItemPriceHistoryRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.item_price_history.data.ItemPriceHistoryRepositoryImpl", f = "ItemPriceHistoryRepositoryImpl.kt", i = {0}, l = {21}, m = "getItemPriceHistoryForm", n = {"this"}, s = {"L$0"})
/* loaded from: classes14.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public c f173649q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f173650r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f173651s;

    /* renamed from: t, reason: collision with root package name */
    public int f173652t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f173651s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f173650r = obj;
        this.f173652t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f173651s.a(null, this);
    }
}

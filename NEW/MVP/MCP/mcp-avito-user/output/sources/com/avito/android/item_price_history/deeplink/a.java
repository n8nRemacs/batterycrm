package com.avito.android.item_price_history.deeplink;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ItemPriceHistoryDeeplinkHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.item_price_history.deeplink.ItemPriceHistoryDeeplinkHandler", f = "ItemPriceHistoryDeeplinkHandler.kt", i = {0, 0, 0}, l = {23}, m = "doHandleSuspend", n = {"this", Constants.DEEPLINK, "args"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes14.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public c f173660q;

    /* renamed from: r, reason: collision with root package name */
    public ItemPriceHistoryLink f173661r;

    /* renamed from: s, reason: collision with root package name */
    public Bundle f173662s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f173663t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f173664u;

    /* renamed from: v, reason: collision with root package name */
    public int f173665v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f173664u = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f173663t = obj;
        this.f173665v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f173664u.o(null, null, this);
    }
}

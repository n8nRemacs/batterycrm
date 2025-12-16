package com.avito.android.imv_goods_poll;

import android.content.Context;
import android.content.Intent;
import com.avito.android.deep_linking.links.ImvGoodsPollLinkBody;
import com.avito.android.imv_goods_poll.ImvGoodsPollActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImvGoodsPollIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_goods_poll/g;", "Lcom/avito/android/imv_goods_poll/f;", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f170630a;

    @Inject
    public g(@Y61.k Context context) {
        this.f170630a = context;
    }

    @Override // com.avito.android.imv_goods_poll.f
    @Y61.k
    public final Intent a(@Y61.k ImvGoodsPollLinkBody imvGoodsPollLinkBody, long j12, @Y61.k String str) {
        ImvGoodsPollActivity.a aVar = ImvGoodsPollActivity.f170581n;
        ImvGoodsPollParams imvGoodsPollParams = new ImvGoodsPollParams(imvGoodsPollLinkBody, j12, str);
        aVar.getClass();
        return new Intent(this.f170630a, (Class<?>) ImvGoodsPollActivity.class).setFlags(603979776).putExtra("open_params", imvGoodsPollParams);
    }
}

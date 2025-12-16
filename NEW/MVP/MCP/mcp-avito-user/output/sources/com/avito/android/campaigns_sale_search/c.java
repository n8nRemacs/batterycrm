package com.avito.android.campaigns_sale_search;

import com.avito.android.lib.design.input.Input;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;
import um.b;

/* compiled from: CampaignsSaleSearchAddToSaleDialog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class c extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f114512l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Input f114513m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Input input) {
        super(1);
        this.f114512l = dVar;
        this.f114513m = input;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        ((h) this.f114512l.f114514E).invoke(new b.l(C43066x.y0(this.f114513m.getDeformattedText())));
        return G0.f406611a;
    }
}

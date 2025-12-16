package com.avito.android.advert.item.recall_me;

import com.avito.android.util.C5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;

/* compiled from: RecallMeBlockPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "phone", "successMessage", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class q extends N implements Y41.p<String, String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f78504l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ RecallMeBlockItem f78505m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z f78506n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(o oVar, RecallMeBlockItem recallMeBlockItem, z zVar) {
        super(2);
        this.f78504l = oVar;
        this.f78505m = recallMeBlockItem;
        this.f78506n = zVar;
    }

    @Override // Y41.p
    public final G0 invoke(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        int i12 = o.f78483n;
        o oVar = this.f78504l;
        boolean zE2 = C5.f318568b.e(str3);
        RecallMeBlockItem recallMeBlockItem = this.f78505m;
        z zVar = this.f78506n;
        if (zE2) {
            String strConcat = "7".concat(str3);
            N0 n02 = oVar.f78492j;
            if (n02 != null) {
                ((V0) n02).c(null);
            }
            oVar.f78492j = C43259k.d(oVar.f78491i, null, null, new s(zVar, oVar, str3, recallMeBlockItem, strConcat, str4, null), 3);
        } else {
            zVar.HJ(oVar.f78489g.f78459b);
        }
        oVar.f78487e.b(recallMeBlockItem.f78469g);
        return G0.f406611a;
    }
}

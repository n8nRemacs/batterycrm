package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import com.yandex.metrica.DoNotInline;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/yandex/metrica/impl/ob/Vj;", "", "Landroid/content/Context;", "context", "", "Lcom/yandex/metrica/impl/ob/Tj;", "a", "(Landroid/content/Context;)Ljava/util/List;", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, k = 1, mv = {1, 1, 15})
@TargetApi(23)
@DoNotInline
/* loaded from: classes7.dex */
public final class Vj {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Vj f379789a = new Vj();

    public static final class a<T, R> implements InterfaceC39036om<SubscriptionManager, List<? extends SubscriptionInfo>> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f379790a = new a();

        @Override // com.yandex.metrica.impl.ob.InterfaceC39036om
        public List<? extends SubscriptionInfo> a(SubscriptionManager subscriptionManager) {
            return subscriptionManager.getActiveSubscriptionInfoList();
        }
    }

    private Vj() {
    }

    @X41.n
    @Y61.k
    public static final List<Tj> a(@Y61.k Context context) {
        List<SubscriptionInfo> list = (List) A2.a(a.f379790a, context, "telephony_subscription_service", "getting active subcription info list", "SubscriptionManager");
        if (list == null) {
            return C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (SubscriptionInfo subscriptionInfo : list) {
            Integer numA = A2.a(29) ? Wj.a(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMcc());
            Integer numB = A2.a(29) ? Wj.b(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMnc());
            boolean z12 = subscriptionInfo.getDataRoaming() == 1;
            CharSequence carrierName = subscriptionInfo.getCarrierName();
            arrayList.add(new Tj(numA, numB, z12, carrierName != null ? carrierName.toString() : null));
        }
        return arrayList;
    }
}

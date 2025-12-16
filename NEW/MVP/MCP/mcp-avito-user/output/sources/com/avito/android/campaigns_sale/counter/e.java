package com.avito.android.campaigns_sale.counter;

import Y61.k;
import android.annotation.SuppressLint;
import com.avito.android.account.E;
import com.avito.android.campaigns_sale.network.remote.model.CampaignsSaleCounterResult;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Y5;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import om.InterfaceC44818a;
import vm.InterfaceC49347b;
import vm.InterfaceC49348c;

/* compiled from: CampaignsSaleCounterRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/campaigns_sale/counter/e;", "Lvm/b;", "a", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"CheckResult"})
/* loaded from: classes12.dex */
public final class e implements InterfaceC49347b {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f113868e = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC44818a> f113869a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f113870b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC49348c f113871c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.b<Integer> f113872d = com.jakewharton.rxrelay3.b.N0(0);

    /* compiled from: CampaignsSaleCounterRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/campaigns_sale/counter/e$a;", "", "<init>", "()V", "", "PROMOTIONS_COUNTER_DEFAULT", "I", "PROMOTIONS_COUNTER_VALUE", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public e(@k h31.e eVar, @k InterfaceC35745a5 interfaceC35745a5, @k InterfaceC49348c interfaceC49348c, @k E e12) {
        this.f113869a = eVar;
        this.f113870b = interfaceC35745a5;
        this.f113871c = interfaceC49348c;
        e12.g().x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).m0(c.f113866b).t0(new l41.g() { // from class: com.avito.android.campaigns_sale.counter.d
            @Override // l41.g
            public final void accept(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                e eVar2 = this.f113867b;
                if (!zBooleanValue) {
                    int i12 = e.f113868e;
                    eVar2.f113872d.accept(0);
                } else {
                    z<TypedResult<CampaignsSaleCounterResult>> zVarA = eVar2.f113869a.get().a();
                    InterfaceC35745a5 interfaceC35745a52 = eVar2.f113870b;
                    Y5.a(zVarA.x0(interfaceC35745a52.a()).j0(interfaceC35745a52.e())).u0(new f(eVar2), new g(eVar2));
                }
            }
        });
    }

    @Override // vm.InterfaceC49347b
    @k
    public final C41981q0 a() {
        com.jakewharton.rxrelay3.b<Integer> bVar = this.f113872d;
        bVar.getClass();
        return new C41981q0(bVar);
    }

    @Override // vm.InterfaceC49347b
    public final void b() {
        this.f113872d.accept(0);
    }
}

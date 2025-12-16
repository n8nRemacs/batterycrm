package com.avito.android.user_advert.advert.items.support_automation;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SupportAutomationItemView.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_advert/advert/items/support_automation/d;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/konveyor/util/d;", "Lcom/avito/android/user_advert/advert/items/support_automation/a;", "a", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d extends com.avito.konveyor.adapter.b implements com.avito.konveyor.util.d<com.avito.android.user_advert.advert.items.support_automation.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f310320b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Button f310321c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Y41.a<G0> f310322d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public com.avito.android.user_advert.advert.items.support_automation.a f310323e;

    /* compiled from: SupportAutomationItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/support_automation/d$a;", "", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void d(@k DeepLink deepLink);
    }

    /* compiled from: SupportAutomationItemView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            DeepLink deepLink;
            d dVar = d.this;
            com.avito.android.user_advert.advert.items.support_automation.a aVar = dVar.f310323e;
            if (aVar != null && (deepLink = aVar.f310314d) != null) {
                dVar.f310320b.d(deepLink);
            }
            return G0.f406611a;
        }
    }

    public d(@k View view, @k a aVar) {
        super(view);
        this.f310320b = aVar;
        this.f310321c = (Button) view.findViewById(R.id.support_automation_button);
        this.f310322d = new b();
    }

    @Override // com.avito.konveyor.util.d
    public final void kD(TV0.a aVar) {
        com.avito.android.user_advert.advert.items.support_automation.a aVar2 = (com.avito.android.user_advert.advert.items.support_automation.a) aVar;
        this.f310321c.setState(new UU.a(aVar2.f310313c, null, false, false, false, this.f310322d, null, null, null, false, 990, null));
        this.f310323e = aVar2;
    }
}

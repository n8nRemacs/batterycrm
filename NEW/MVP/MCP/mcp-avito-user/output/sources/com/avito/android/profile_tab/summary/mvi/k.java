package com.avito.android.profile_tab.summary.mvi;

import Dc0.InterfaceC13386c;
import com.avito.android.arch.mvi.q;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ProfileSummaryFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile_tab/summary/mvi/k;", "Lcom/avito/android/arch/mvi/q;", "LDc0/c;", "LDc0/e;", "LDc0/f;", "LDc0/d;", "_avito_profile-tab_summary_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k extends q<InterfaceC13386c, Dc0.e, Dc0.f, Dc0.d> {

    /* compiled from: ProfileSummaryFeatureBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LDc0/c;", "LDc0/e;", "LDc0/f;", "LDc0/d;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<q<InterfaceC13386c, Dc0.e, Dc0.f, Dc0.d>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.profile_tab.summary.mvi.a f230920l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ m f230921m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ R0 f230922n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.profile_tab.summary.mvi.a aVar, m mVar, R0 r02) {
            super(1);
            this.f230920l = aVar;
            this.f230921m = mVar;
            this.f230922n = r02;
        }

        @Override // Y41.l
        public final G0 invoke(q<InterfaceC13386c, Dc0.e, Dc0.f, Dc0.d> qVar) {
            q<InterfaceC13386c, Dc0.e, Dc0.f, Dc0.d> qVar2 = qVar;
            qVar2.f92009e = this.f230920l;
            qVar2.f92011g = this.f230921m;
            qVar2.f92013i = this.f230922n.c();
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public k(@Y61.k com.avito.android.profile_tab.summary.a aVar, @Y61.k ZS.b bVar, @Y61.k com.avito.android.profile_tab.summary.mvi.a aVar2, @Y61.k m mVar, @Y61.k R0 r02) {
        super("ProfileSummaryFeature:ProfileTab", new Dc0.f("ProfileTabBeduinItemView", aVar.f230846a, bVar, null, 8, null), new a(aVar2, mVar, r02));
        aVar.getClass();
    }
}

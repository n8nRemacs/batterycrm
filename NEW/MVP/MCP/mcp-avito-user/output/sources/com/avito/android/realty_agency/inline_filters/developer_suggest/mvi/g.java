package com.avito.android.realty_agency.inline_filters.developer_suggest.mvi;

import com.avito.android.arch.mvi.q;
import gi0.C40689d;
import gi0.InterfaceC40686a;
import gi0.InterfaceC40687b;
import gi0.InterfaceC40688c;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DeveloperSuggestFilterFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/developer_suggest/mvi/g;", "Lcom/avito/android/arch/mvi/q;", "Lgi0/a;", "Lgi0/b;", "Lgi0/d;", "Lgi0/c;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends q<InterfaceC40686a, InterfaceC40687b, C40689d, InterfaceC40688c> {

    /* compiled from: DeveloperSuggestFilterFeatureBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lgi0/a;", "Lgi0/b;", "Lgi0/d;", "Lgi0/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<q<InterfaceC40686a, InterfaceC40687b, C40689d, InterfaceC40688c>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f251553l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ c f251554m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ k f251555n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ i f251556o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, e eVar, i iVar, k kVar) {
            super(1);
            this.f251553l = eVar;
            this.f251554m = cVar;
            this.f251555n = kVar;
            this.f251556o = iVar;
        }

        @Override // Y41.l
        public final G0 invoke(q<InterfaceC40686a, InterfaceC40687b, C40689d, InterfaceC40688c> qVar) {
            q<InterfaceC40686a, InterfaceC40687b, C40689d, InterfaceC40688c> qVar2 = qVar;
            qVar2.f92008d = this.f251553l;
            qVar2.f92009e = this.f251554m;
            qVar2.f92011g = this.f251555n;
            qVar2.f92010f = this.f251556o;
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public g(@Y61.k c cVar, @Y61.k e eVar, @Y61.k i iVar, @Y61.k k kVar) {
        super("DeveloperSuggestFilter", C40689d.f396745g, new a(cVar, eVar, iVar, kVar));
        C40689d.f396744f.getClass();
    }
}

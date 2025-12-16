package com.avito.android.beduin.common.component.inline_filter;

import Y41.l;
import Y41.p;
import Y61.k;
import android.app.Activity;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.inline_filters.di.o;
import com.avito.android.inline_filters.dialog.AbstractC30998a;
import com.avito.android.inline_filters.dialog.InterfaceC30999b;
import com.avito.android.inline_filters.dialog.s;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: InlineFilterDialogShower.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/inline_filter/g;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @Inject
    public s f101497a;

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public InterfaceC30999b f101498b;

    /* compiled from: InlineFilterDialogShower.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/search/Filter;", "<anonymous parameter 0>", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "selectedValue", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/search/Filter;Lcom/avito/android/remote/model/search/InlineFilterValue;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<Filter, InlineFilterValue, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f101499l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super InlineFilterValue, G0> lVar) {
            super(2);
            this.f101499l = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(Filter filter, InlineFilterValue inlineFilterValue) {
            this.f101499l.invoke(inlineFilterValue);
            return G0.f406611a;
        }
    }

    /* compiled from: InlineFilterDialogShower.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<DeepLink, Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f101500l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final /* bridge */ /* synthetic */ G0 invoke(DeepLink deepLink, Boolean bool) {
            bool.booleanValue();
            return G0.f406611a;
        }
    }

    /* compiled from: InlineFilterDialogShower.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "link", "", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements p<DeepLink, Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.deeplink_handler.handler.composite.a f101501l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.avito.android.deeplink_handler.handler.composite.a aVar) {
            super(2);
            this.f101501l = aVar;
        }

        @Override // Y41.p
        public final G0 invoke(DeepLink deepLink, Boolean bool) {
            DeepLink deepLink2 = deepLink;
            bool.getClass();
            com.avito.android.deeplink_handler.handler.composite.a aVar = this.f101501l;
            if (aVar != null) {
                b.a.a(aVar, deepLink2, null, null, 6);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: InlineFilterDialogShower.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f101502l = new d();

        public d() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: InlineFilterDialogShower.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements l<Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f101503l = new e();

        public e() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Integer num) {
            return G0.f406611a;
        }
    }

    public g(@k Activity activity) {
        com.avito.android.beduin.di.inline_filters.b.a().a(activity, (o) C29972i.a(C29972i.b(activity), o.class)).a(this);
    }

    public final void a(@k Filter filter, @Y61.l com.avito.android.deeplink_handler.handler.composite.a aVar, @k l<? super InlineFilterValue, G0> lVar) {
        s sVar = this.f101497a;
        if (sVar == null) {
            sVar = null;
        }
        List<com.avito.android.inline_filters.dialog.select.adapter.i> listA = sVar.a(filter);
        InterfaceC30999b interfaceC30999b = this.f101498b;
        AbstractC30998a abstractC30998aA = InterfaceC30999b.a.a(interfaceC30999b != null ? interfaceC30999b : null, null, filter, listA, null, null, null, null, null, null, null, aVar, null, null, null, new a(lVar), null, b.f101500l, new c(aVar), d.f101502l, e.f101503l, null, null, null, null, null, null, 248552192);
        if (abstractC30998aA != null) {
            abstractC30998aA.d();
        }
    }
}

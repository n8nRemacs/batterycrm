package com.avito.android.beduin.common.component;

import Ui.InterfaceC15523b;
import android.view.View;
import com.avito.android.beduin_models.BeduinAction;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Components.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j {

    /* compiled from: Components.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<View, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC15523b<BeduinAction> f101645l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ List<BeduinAction> f101646m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC15523b<BeduinAction> interfaceC15523b, List<? extends BeduinAction> list) {
            super(1);
            this.f101645l = interfaceC15523b;
            this.f101646m = list;
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            com.avito.android.beduin_shared.model.utils.a.a(this.f101645l, this.f101646m);
            return G0.f406611a;
        }
    }

    public static final void a(@Y61.k View view, @Y61.l List<? extends BeduinAction> list, @Y61.k InterfaceC15523b<BeduinAction> interfaceC15523b) {
        List<? extends BeduinAction> list2 = list;
        boolean z12 = list2 == null || list2.isEmpty();
        a aVar = z12 ? null : new a(interfaceC15523b, list);
        view.setOnClickListener(aVar != null ? new com.avito.android.advert.item.compatibility.v2.m(8, aVar) : null);
        boolean z13 = !z12;
        view.setClickable(z13);
        view.setFocusable(z13);
    }
}

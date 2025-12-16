package com.avito.android.inline_filters.dialog.category_with_params;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.inline_filters.InterfaceC30995b;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.InlineFilters;
import io.reactivex.rxjava3.core.z;
import java.util.ArrayList;
import kotlin.Metadata;
import l41.g;

/* compiled from: CategoryWithParamsFilterDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/category_with_params/d;", "Lcom/avito/android/category_with_params/a;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements com.avito.android.category_with_params.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f171531a;

    public d(a aVar) {
        this.f171531a = aVar;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [Y41.p, kotlin.jvm.internal.N] */
    public final void a(@k ArrayList arrayList, boolean z12) {
        InlineFilterValue.InlineFilterMultiSelectValue inlineFilterMultiSelectValue = new InlineFilterValue.InlineFilterMultiSelectValue(arrayList);
        boolean zIsEmpty = inlineFilterMultiSelectValue.isEmpty();
        final a aVar = this.f171531a;
        if (zIsEmpty) {
            int i12 = a.f171517o;
            aVar.f();
            return;
        }
        if (!z12) {
            aVar.f171526l.invoke(aVar.f171518d, inlineFilterMultiSelectValue);
            aVar.f();
            return;
        }
        InterfaceC30995b interfaceC30995b = aVar.f171521g;
        if (interfaceC30995b == null) {
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar = aVar.f171528n;
        cVar.e();
        z zVarC = interfaceC30995b.c(aVar.f171518d, inlineFilterMultiSelectValue, aVar.f171523i, aVar.f171524j, aVar.f171522h, aVar.f171525k);
        g gVar = new g() { // from class: com.avito.android.inline_filters.dialog.category_with_params.b
            @Override // l41.g
            public final void accept(Object obj) {
                int i13 = a.f171517o;
                a aVar2 = aVar;
                aVar2.getClass();
                DeepLink uri = ((InlineFilters) obj).getResult().getUri();
                if (uri == null) {
                    return;
                }
                com.avito.android.deeplink_handler.handler.composite.a aVar3 = aVar2.f171520f;
                if (aVar3 != null) {
                    b.a.a(aVar3, uri, null, null, 6);
                }
                aVar2.f();
            }
        };
        c cVar2 = new c(aVar);
        zVarC.getClass();
        cVar.b(zVarC.v0(gVar, cVar2, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }
}

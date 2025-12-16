package com.avito.android.serp.adapter.rich_snippets.regular;

import com.avito.android.serp.adapter.AdvertItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertRichItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.serp.adapter.rich_snippets.regular.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34793p extends kotlin.jvm.internal.N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f271199l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C34797u f271200m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34793p(AdvertItem advertItem, C34797u c34797u) {
        super(1);
        this.f271199l = advertItem;
        this.f271200m = c34797u;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    @Override // Y41.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(java.lang.Boolean r5) {
        /*
            r4 = this;
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.getClass()
            com.avito.android.serp.adapter.AdvertItem r5 = r4.f271199l
            com.avito.android.remote.model.AdvertActions r0 = r5.f268408U
            r1 = 0
            if (r0 == 0) goto L35
            java.util.List r0 = r0.getActions()
            if (r0 == 0) goto L35
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.avito.android.remote.model.AdvertAction r3 = (com.avito.android.remote.model.AdvertAction) r3
            boolean r3 = r3 instanceof com.avito.android.remote.model.AdvertAction.CallOrder
            if (r3 == 0) goto L18
            goto L2b
        L2a:
            r2 = r1
        L2b:
            com.avito.android.remote.model.AdvertAction r2 = (com.avito.android.remote.model.AdvertAction) r2
            if (r2 == 0) goto L35
            com.avito.android.deep_linking.links.DeepLink r0 = r2.getDeepLink()
            if (r0 != 0) goto L60
        L35:
            java.util.List<com.avito.android.remote.model.ConstructorAdvertGalleryItemModel> r5 = r5.f268406T
            if (r5 == 0) goto L5f
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L41:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L50
            java.lang.Object r0 = r5.next()
            boolean r2 = r0 instanceof com.avito.android.remote.model.CallOrderItemModel
            if (r2 == 0) goto L41
            goto L51
        L50:
            r0 = r1
        L51:
            boolean r5 = r0 instanceof com.avito.android.remote.model.CallOrderItemModel
            if (r5 != 0) goto L56
            r0 = r1
        L56:
            com.avito.android.remote.model.CallOrderItemModel r0 = (com.avito.android.remote.model.CallOrderItemModel) r0
            if (r0 == 0) goto L5f
            com.avito.android.deep_linking.links.DeepLink r0 = r0.getUri()
            goto L60
        L5f:
            r0 = r1
        L60:
            if (r0 == 0) goto L71
            com.avito.android.serp.adapter.rich_snippets.regular.u r5 = r4.f271200m
            h31.e<rn0.b> r5 = r5.f271211b
            java.lang.Object r5 = r5.get()
            rn0.c r5 = (rn0.InterfaceC47691c) r5
            r2 = 14
            rn0.InterfaceC47691c.a.a(r5, r0, r1, r2)
        L71:
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.serp.adapter.rich_snippets.regular.C34793p.invoke(java.lang.Object):java.lang.Object");
    }
}

package com.avito.android.rubricator.list.category;

import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.rubricator.list.category.CategoryListFragment;
import com.avito.android.util.K2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import vn0.InterfaceC49358c;

/* compiled from: CategoryListFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class a extends H implements l<InterfaceC49358c, G0> {
    @Override // Y41.l
    public final G0 invoke(InterfaceC49358c interfaceC49358c) {
        InterfaceC49358c interfaceC49358c2 = interfaceC49358c;
        CategoryListFragment categoryListFragment = (CategoryListFragment) this.receiver;
        CategoryListFragment.a aVar = CategoryListFragment.f255836A0;
        categoryListFragment.getClass();
        if (interfaceC49358c2 instanceof InterfaceC49358c.a) {
            K2.e(categoryListFragment);
            categoryListFragment.r5();
        } else if (interfaceC49358c2 instanceof InterfaceC49358c.b) {
            InterfaceC49358c.b bVar = (InterfaceC49358c.b) interfaceC49358c2;
            com.avito.android.deeplink_handler.mapping.checker.c cVar = categoryListFragment.f255840w0;
            if (cVar == null) {
                cVar = null;
            }
            DeepLink deepLink = bVar.f440958a;
            if (cVar.a(deepLink)) {
                K2.e(categoryListFragment);
                categoryListFragment.r5();
            }
            com.avito.android.deeplink_handler.handler.composite.a aVar2 = categoryListFragment.f255839v0;
            if (aVar2 == null) {
                aVar2 = null;
            }
            b.a.a(aVar2, deepLink, null, null, 6);
        } else if (interfaceC49358c2 instanceof InterfaceC49358c.C12790c) {
            K2.e(categoryListFragment);
        }
        return G0.f406611a;
    }
}

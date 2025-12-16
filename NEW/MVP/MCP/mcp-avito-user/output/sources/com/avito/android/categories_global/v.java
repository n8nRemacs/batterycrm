package com.avito.android.categories_global;

import Jn.InterfaceC14220a;
import android.os.Bundle;
import androidx.compose.animation.InterfaceC20395w;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.view.C23395u;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CategoriesScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/w;", "Landroidx/navigation/u;", "nav", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/w;Landroidx/navigation/u;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class v extends N implements Y41.r<InterfaceC20395w, C23395u, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CategoriesScreen f116448l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(CategoriesScreen categoriesScreen) {
        super(4);
        this.f116448l = categoriesScreen;
    }

    @Override // Y41.r
    public final G0 invoke(InterfaceC20395w interfaceC20395w, C23395u c23395u, androidx.compose.runtime.A a12, Integer num) {
        C23395u c23395u2 = c23395u;
        androidx.compose.runtime.A a13 = a12;
        num.intValue();
        com.avito.android.analytics.screens.compose.g gVarA = com.avito.android.analytics.screens.compose.l.a(this.f116448l, a13);
        Bundle bundleA = c23395u2.a();
        String string = bundleA != null ? bundleA.getString("categoryName") : null;
        Bundle bundleA2 = c23395u2.a();
        String string2 = bundleA2 != null ? bundleA2.getString("categoryId") : null;
        s sVar = s.f116445l;
        t tVar = t.f116446l;
        androidx.compose.runtime.saveable.w wVar = androidx.compose.runtime.saveable.v.f38606a;
        InterfaceC14220a interfaceC14220a = (InterfaceC14220a) com.avito.android.navigation.compose.h.a(new r((androidx.appcompat.app.m) a13.o(AndroidCompositionLocals_androidKt.f41069b), gVarA, ((Boolean) androidx.compose.runtime.saveable.j.c(new Object[0], new androidx.compose.runtime.saveable.w(tVar, sVar), u.f116447l, a13, 3144, 4)).booleanValue(), string2, string), a13);
        com.avito.android.analytics.screens.compose.q.a(interfaceC14220a, gVarA, null, androidx.compose.runtime.internal.r.c(-23753775, new q(string, interfaceC14220a), a13), a13, 3072);
        return G0.f406611a;
    }
}

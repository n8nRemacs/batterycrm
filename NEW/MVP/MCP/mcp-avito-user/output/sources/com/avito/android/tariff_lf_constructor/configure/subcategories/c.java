package com.avito.android.tariff_lf_constructor.configure.subcategories;

import android.widget.TextView;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.reflect.n;
import qK0.C47313c;

/* compiled from: ConstructorConfigureSubCategoriesFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LED0/b;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(LED0/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class c extends N implements Y41.l<ED0.b, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ConstructorConfigureSubCategoryFragment f300436l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ConstructorConfigureSubCategoryFragment constructorConfigureSubCategoryFragment) {
        super(1);
        this.f300436l = constructorConfigureSubCategoryFragment;
    }

    @Override // Y41.l
    public final G0 invoke(ED0.b bVar) {
        ED0.b bVar2 = bVar;
        ConstructorConfigureSubCategoryFragment constructorConfigureSubCategoryFragment = this.f300436l;
        C47313c c47313c = constructorConfigureSubCategoryFragment.f300427v0;
        n<Object> nVar = ConstructorConfigureSubCategoryFragment.f300416D0[3];
        ((TextView) c47313c.a()).setText(bVar2.f3894a);
        constructorConfigureSubCategoryFragment.q5().setText(bVar2.f3895b);
        D6.H(constructorConfigureSubCategoryFragment.q5());
        return G0.f406611a;
    }
}

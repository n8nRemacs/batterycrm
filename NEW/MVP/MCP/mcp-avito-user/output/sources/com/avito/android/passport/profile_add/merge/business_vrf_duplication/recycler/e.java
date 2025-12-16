package com.avito.android.passport.profile_add.merge.business_vrf_duplication.recycler;

import Y41.l;
import android.view.View;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.passport.deeplinks.PassportAccountsProfileErrorLink;
import com.avito.android.passport.profile_add.merge.business_vrf_duplication.mvi.o;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PassportVrfActionItem.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class e extends N implements l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PassportVrfActionItem f212587l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f212588m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PassportVrfActionItem passportVrfActionItem, f fVar) {
        super(1);
        this.f212587l = passportVrfActionItem;
        this.f212588m = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(View view) {
        PassportVrfActionItem passportVrfActionItem = this.f212587l;
        DeepLink deepLink = passportVrfActionItem.f212580f;
        if (deepLink instanceof PassportAccountsProfileErrorLink) {
            ((PassportAccountsProfileErrorLink) deepLink).f211118b = passportVrfActionItem.f212581g;
        }
        f fVar = this.f212588m;
        fVar.f212589b.invoke(new o(deepLink, passportVrfActionItem.f212576b));
        return G0.f406611a;
    }
}

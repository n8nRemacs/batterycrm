package com.avito.android.edit_seller_type.mvi;

import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.edit_seller_type.mvi.entity.EditSellerTypeInternalAction;
import com.avito.android.edit_seller_type.mvi.entity.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: EditSellerTypeActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/edit_seller_type/mvi/entity/a;", "Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction;", "Lcom/avito/android/edit_seller_type/mvi/entity/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements com.avito.android.arch.mvi.a<com.avito.android.edit_seller_type.mvi.entity.a, EditSellerTypeInternalAction, com.avito.android.edit_seller_type.mvi.entity.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.edit_seller_type.interactor.a f146774a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f146775b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f146776c;

    @Inject
    public c(@Y61.k com.avito.android.edit_seller_type.interactor.a aVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        this.f146774a = aVar;
        this.f146775b = interfaceC28373a;
        this.f146776c = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<EditSellerTypeInternalAction> b(com.avito.android.edit_seller_type.mvi.entity.a aVar, com.avito.android.edit_seller_type.mvi.entity.c cVar) {
        C43210w c43210w;
        com.avito.android.edit_seller_type.mvi.entity.a aVar2 = aVar;
        com.avito.android.edit_seller_type.mvi.entity.c cVar2 = cVar;
        if (aVar2.equals(a.c.f146793a)) {
            return new C43210w(EditSellerTypeInternalAction.Close.f146781b);
        }
        if (aVar2 instanceof a.f) {
            c43210w = new C43210w(new EditSellerTypeInternalAction.OptionSelected(((a.f) aVar2).f146796a));
        } else {
            if (aVar2.equals(a.g.f146797a)) {
                return C43175k.G(new a(cVar2, this, null));
            }
            if (aVar2 instanceof a.d) {
                c43210w = new C43210w(new EditSellerTypeInternalAction.OpenDeeplink(((a.d) aVar2).f146794a));
            } else {
                if (!(aVar2 instanceof a.e)) {
                    if (aVar2.equals(a.b.f146792a)) {
                        return new C43210w(EditSellerTypeInternalAction.DismissDialog.f146784b);
                    }
                    if (aVar2.equals(a.h.f146798a)) {
                        return this.f146774a.a();
                    }
                    if (aVar2.equals(a.C4271a.f146791a)) {
                        return C43175k.G(new b(cVar2, this, null));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                c43210w = new C43210w(new EditSellerTypeInternalAction.OpenDeeplink(new WebViewLink.AnyDomain(Uri.parse(((a.e) aVar2).f146795a), null, null, 6, null)));
            }
        }
        return c43210w;
    }
}

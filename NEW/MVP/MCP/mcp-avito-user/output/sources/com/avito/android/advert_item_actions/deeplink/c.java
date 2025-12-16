package com.avito.android.advert_item_actions.deeplink;

import Na.C14553a;
import Y41.l;
import com.avito.android.advert_item_actions.AdvertItemActionsDeeplink;
import io.reactivex.rxjava3.kotlin.A1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertItemActionsDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class c extends N implements l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f85839l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertItemActionsDeeplink f85840m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, AdvertItemActionsDeeplink advertItemActionsDeeplink) {
        super(1);
        this.f85839l = fVar;
        this.f85840m = advertItemActionsDeeplink;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        f fVar = this.f85839l;
        AdvertItemActionsDeeplink advertItemActionsDeeplink = this.f85840m;
        fVar.f85847i.c(new C14553a(advertItemActionsDeeplink.f85810b, advertItemActionsDeeplink.f85813e, advertItemActionsDeeplink.f85812d, advertItemActionsDeeplink.f85815g, str2));
        String str3 = advertItemActionsDeeplink.f85812d;
        fVar.f85849k.b(A1.h(fVar.f85846h.a(advertItemActionsDeeplink.f85813e, advertItemActionsDeeplink.f85810b, str2, str3).j0(fVar.f85848j.e()), new a(fVar), new b(fVar, advertItemActionsDeeplink), 2));
        return G0.f406611a;
    }
}

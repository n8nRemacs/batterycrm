package com.avito.android.advert_item_actions.deeplink;

import Y41.l;
import android.content.Context;
import com.avito.android.advert_item_actions.AdvertItemActionsDeeplink;
import com.avito.android.remote.model.AdvertItemActions;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertItemActionsDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "context", "Lcom/avito/android/lib/design/bottom_sheet/d;", "invoke", "(Landroid/content/Context;)Lcom/avito/android/lib/design/bottom_sheet/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e extends N implements l<Context, com.avito.android.lib.design.bottom_sheet.d> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f85842l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertItemActionsDeeplink f85843m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, AdvertItemActionsDeeplink advertItemActionsDeeplink) {
        super(1);
        this.f85842l = fVar;
        this.f85843m = advertItemActionsDeeplink;
    }

    @Override // Y41.l
    public final com.avito.android.lib.design.bottom_sheet.d invoke(Context context) {
        Context context2 = context;
        f fVar = this.f85842l;
        AdvertItemActionsDeeplink advertItemActionsDeeplink = this.f85843m;
        AdvertItemActions advertItemActions = advertItemActionsDeeplink.f85811c;
        String title = advertItemActions != null ? advertItemActions.getTitle() : null;
        AdvertItemActions advertItemActions2 = advertItemActionsDeeplink.f85811c;
        com.avito.android.advert_item_actions.view.e eVarA = fVar.f85845g.a(context2, title, advertItemActions2 != null ? advertItemActions2.getActions() : null, new c(fVar, advertItemActionsDeeplink), new d(fVar));
        fVar.f85850l = eVarA;
        return eVarA;
    }
}

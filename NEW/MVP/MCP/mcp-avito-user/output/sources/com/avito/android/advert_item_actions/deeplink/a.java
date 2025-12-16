package com.avito.android.advert_item_actions.deeplink;

import Y41.l;
import com.avito.android.advert_item_actions.AdvertItemActionsDeeplink;
import com.avito.android.util.N0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertItemActionsDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class a extends N implements l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f85836l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar) {
        super(1);
        this.f85836l = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        AdvertItemActionsDeeplink.b.C2558b c2558b = AdvertItemActionsDeeplink.b.C2558b.f85817b;
        f fVar = this.f85836l;
        fVar.j(c2558b);
        com.avito.android.lib.design.bottom_sheet.d dVar = fVar.f85850l;
        if (dVar != null) {
            N0.a(dVar);
        }
        return G0.f406611a;
    }
}

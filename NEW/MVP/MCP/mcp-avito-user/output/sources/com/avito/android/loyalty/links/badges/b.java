package com.avito.android.loyalty.links.badges;

import Y41.l;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BadgeBarShowLinkAsyncHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "context", "Lcom/avito/android/lib/design/bottom_sheet/d;", "invoke", "(Landroid/content/Context;)Lcom/avito/android/lib/design/bottom_sheet/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class b extends N implements l<Context, com.avito.android.lib.design.bottom_sheet.d> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.loyalty.ui.badge_details.b f183215l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f183216m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.avito.android.loyalty.ui.badge_details.b bVar, e eVar) {
        super(1);
        this.f183215l = bVar;
        this.f183216m = eVar;
    }

    @Override // Y41.l
    public final com.avito.android.lib.design.bottom_sheet.d invoke(Context context) {
        return new com.avito.android.loyalty.ui.badge_details.c(context, this.f183215l, this.f183216m.f183225l);
    }
}

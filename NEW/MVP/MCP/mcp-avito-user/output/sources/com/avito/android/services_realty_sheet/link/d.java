package com.avito.android.services_realty_sheet.link;

import Y41.l;
import android.content.Context;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServicesRealtySheetLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "context", "Lcom/avito/android/lib/design/bottom_sheet/d;", "invoke", "(Landroid/content/Context;)Lcom/avito/android/lib/design/bottom_sheet/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d extends N implements l<Context, com.avito.android.lib.design.bottom_sheet.d> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f280427l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Bundle f280428m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ServicesRealtySheetLink f280429n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Bundle bundle, ServicesRealtySheetLink servicesRealtySheetLink) {
        super(1);
        this.f280427l = eVar;
        this.f280428m = bundle;
        this.f280429n = servicesRealtySheetLink;
    }

    @Override // Y41.l
    public final com.avito.android.lib.design.bottom_sheet.d invoke(Context context) {
        Context context2 = context;
        e eVar = this.f280427l;
        eVar.f280433i.a();
        Bundle bundle = this.f280428m;
        String string = bundle != null ? bundle.getString("key_xhash") : null;
        return new com.avito.android.services_realty_sheet.c(context2, this.f280429n, new a(eVar, string), new b(eVar, string), new c(eVar));
    }
}

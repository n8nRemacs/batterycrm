package com.avito.android.tariff_cpt.info.deeplink;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import zC0.DialogC50437b;

/* compiled from: TariffCptInfoMonthsDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "context", "Lcom/avito/android/lib/design/bottom_sheet/d;", "invoke", "(Landroid/content/Context;)Lcom/avito/android/lib/design/bottom_sheet/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class d extends N implements Y41.l<Context, com.avito.android.lib.design.bottom_sheet.d> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TariffCptInfoMonthsLink f298154l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f298155m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TariffCptInfoMonthsLink tariffCptInfoMonthsLink, e eVar) {
        super(1);
        this.f298154l = tariffCptInfoMonthsLink;
        this.f298155m = eVar;
    }

    @Override // Y41.l
    public final com.avito.android.lib.design.bottom_sheet.d invoke(Context context) {
        return new DialogC50437b(context, this.f298154l.f298143b, this.f298155m.f298157e);
    }
}

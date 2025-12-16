package com.avito.android.installments.onboarding.deeplink;

import Y41.l;
import android.content.Context;
import android.content.Intent;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InstallmentsOnboardingShowDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "activity", "Lkotlin/G0;", "invoke", "(Landroid/content/Context;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class b extends N implements l<Context, G0> {

    /* renamed from: l, reason: collision with root package name */
    public static final b f172834l = new b();

    public b() {
        super(1);
    }

    @Override // Y41.l
    public final G0 invoke(Context context) {
        Context context2 = context;
        Intent intent = new Intent(context2, context2.getClass());
        intent.setFlags(603979776);
        context2.startActivity(intent);
        return G0.f406611a;
    }
}

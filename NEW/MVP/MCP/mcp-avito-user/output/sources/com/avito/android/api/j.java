package com.avito.android.api;

import android.content.Context;
import android.content.Intent;
import com.avito.android.P;
import com.avito.android.update.UpdateApplicationActivity;
import com.avito.android.update.mvi_screen.UpdateApplicationMviActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ApiErrorsHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/Intent;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class j extends N implements Y41.a<Intent> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f91319l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar) {
        super(0);
        this.f91319l = kVar;
    }

    @Override // Y41.a
    public final Intent invoke() {
        com.avito.android.update.k kVar = this.f91319l.f91326g;
        P p12 = kVar.f306656b;
        kotlin.reflect.n<Object> nVar = P.f67370w0[73];
        boolean zBooleanValue = ((Boolean) p12.f67409g0.a().invoke()).booleanValue();
        Context context = kVar.f306655a;
        return (zBooleanValue ? new Intent(context, (Class<?>) UpdateApplicationMviActivity.class) : new Intent(context, (Class<?>) UpdateApplicationActivity.class)).addFlags(268468224);
    }
}

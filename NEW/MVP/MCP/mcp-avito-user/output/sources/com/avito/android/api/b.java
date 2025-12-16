package com.avito.android.api;

import android.content.Context;
import android.content.Intent;
import com.avito.android.K2;
import com.avito.android.P;
import com.avito.android.certificate_pinning.UnsafeNetworkActivity;
import com.avito.android.certificate_pinning.UnsafeNetworkMviActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ApiErrorsHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/Intent;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class b extends N implements Y41.a<Intent> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f91301l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k kVar) {
        super(0);
        this.f91301l = kVar;
    }

    @Override // Y41.a
    public final Intent invoke() {
        K2 k22 = this.f91301l.f91325f;
        P p12 = k22.f67347b;
        kotlin.reflect.n<Object> nVar = P.f67370w0[75];
        boolean zBooleanValue = ((Boolean) p12.f67413i0.a().invoke()).booleanValue();
        Context context = k22.f67346a;
        return zBooleanValue ? new Intent(context, (Class<?>) UnsafeNetworkMviActivity.class) : new Intent(context, (Class<?>) UnsafeNetworkActivity.class);
    }
}

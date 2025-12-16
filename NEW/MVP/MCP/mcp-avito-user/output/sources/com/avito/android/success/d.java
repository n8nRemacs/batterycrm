package com.avito.android.success;

import android.content.Context;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SuccessIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/success/d;", "Lcom/avito/android/success/c;", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f291567a;

    @Inject
    public d(@Y61.k Context context) {
        this.f291567a = context;
    }

    @Override // com.avito.android.success.c
    @Y61.k
    public final Intent a(@Y61.k String str) {
        Intent intent = new Intent(this.f291567a, (Class<?>) SuccessActivity.class);
        intent.setFlags(603979776);
        return intent.putExtra("success-context", str);
    }
}

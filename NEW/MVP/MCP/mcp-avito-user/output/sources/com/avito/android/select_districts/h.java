package com.avito.android.select_districts;

import android.content.Context;
import android.content.Intent;
import com.avito.android.util.C35961v3;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: SelectDistrictsIntentFactory.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select_districts/h;", "Lcom/avito/android/select_districts/g;", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f266958a;

    @Inject
    public h(@Y61.k Context context) {
        this.f266958a = context;
    }

    @Override // com.avito.android.select_districts.g
    @Y61.k
    public final Intent a(int i12, @Y61.k String str, @Y61.k List list) {
        Intent intent = new Intent(this.f266958a, (Class<?>) SelectDistrictsActivity.class);
        C35961v3.b(intent, new SelectDistrictsScreenParams(str, i12, list));
        return intent;
    }
}

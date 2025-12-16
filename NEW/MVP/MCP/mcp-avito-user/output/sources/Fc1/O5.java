package Fc1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import i.b;

/* loaded from: classes9.dex */
public final class O5 extends b.i {

    /* renamed from: d, reason: collision with root package name */
    public int f5126d;

    public O5() {
        super(0, 1, null);
        int i12 = kotlin.jvm.internal.J.f406821a;
        this.f5126d = 0;
    }

    @Override // i.b.i, i.AbstractC41201a
    @Y61.k
    /* renamed from: a */
    public final Intent createIntent(@Y61.k Context context, @Y61.k androidx.view.result.l lVar) {
        Intent intentCreateIntent = super.createIntent(context, lVar);
        Bundle extras = intentCreateIntent.getExtras();
        if (extras != null && this.f5126d > 0 && extras.containsKey("android.provider.extra.PICK_IMAGES_MAX")) {
            intentCreateIntent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.f5126d);
        }
        return intentCreateIntent;
    }
}

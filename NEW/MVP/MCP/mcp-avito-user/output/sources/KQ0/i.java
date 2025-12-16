package Kq0;

import android.content.res.Resources;
import com.avito.android.R;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SellerPromotionsModule_ProvideGridColumnsAmountFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final l f9671a;

    public i(l lVar) {
        this.f9671a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f9671a.f393949a;
        h.f9670a.getClass();
        return Integer.valueOf(resources.getInteger(R.integer.serp_columns));
    }
}

package in;

import android.content.res.Resources;
import com.avito.android.R;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CartSimilarItemsModule_ProvideGridColumnsAmountFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final l f398764a;

    public j(l lVar) {
        this.f398764a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f398764a.f393949a;
        i.f398763a.getClass();
        return Integer.valueOf(resources.getInteger(R.integer.serp_columns));
    }
}

package com.avito.android.serp.adapter.reformulations;

import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.C;
import com.avito.android.util.L0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ReformulationsItemWidthProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/reformulations/v;", "Lcom/avito/android/serp/adapter/reformulations/u;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class v implements u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final L0 f270662a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C f270663b;

    /* renamed from: c, reason: collision with root package name */
    public final int f270664c;

    @Inject
    public v(@Y61.k Resources resources, @Y61.k L0 l02) {
        this.f270662a = l02;
        this.f270663b = l02.getF318655a();
        this.f270664c = resources.getDimensionPixelOffset(R.dimen.content_horizontal_padding);
    }

    @Override // com.avito.android.serp.adapter.reformulations.u
    public final int getWidth() {
        int iC2 = this.f270662a.c();
        int i12 = iC2 - (this.f270664c * 2);
        if (i12 > 0) {
            return i12;
        }
        this.f270663b.o().getClass();
        return iC2;
    }
}

package com.avito.android.favorites.adapter.error;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.printable_text.PrintableText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: FavoriteErrorItemView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorites/adapter/error/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/favorites/adapter/error/h;", "LLU/a;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h, LU.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f156567b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LU.b f156568c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Y41.a<G0> f156569d;

    public i(@k View view) {
        super(view);
        this.f156567b = view;
        this.f156568c = new LU.b(view);
    }

    @Override // LU.a
    public final void Od(@l Y41.a<G0> aVar) {
        this.f156568c.Od(aVar);
    }

    @Override // com.avito.android.favorites.adapter.error.h
    public final void d(@l Y41.a<G0> aVar) {
        this.f156569d = aVar;
    }

    @Override // LU.a
    public final void i7(@k PrintableText printableText) {
        this.f156568c.i7(printableText);
    }
}

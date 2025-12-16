package com.avito.android.advertising.adapter.items.buzzoola;

import com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner;
import kotlin.Metadata;

/* compiled from: BuzzoolaPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "color", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class j<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BuzzoolaBanner.BuzzoolaDirect f87306b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.advertising.ui.buzzoola.d f87307c;

    public j(BuzzoolaBanner.BuzzoolaDirect buzzoolaDirect, com.avito.android.advertising.ui.buzzoola.d dVar) {
        this.f87306b = buzzoolaDirect;
        this.f87307c = dVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        this.f87306b.f88228o = Integer.valueOf(iIntValue);
        this.f87307c.uF(Integer.valueOf(iIntValue));
    }
}

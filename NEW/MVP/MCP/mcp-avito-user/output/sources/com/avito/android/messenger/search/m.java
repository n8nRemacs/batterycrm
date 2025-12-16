package com.avito.android.messenger.search;

import com.avito.android.messenger.search.h;
import kotlin.Metadata;

/* compiled from: ChannelsSearchInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class m<T> implements l41.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h.d f197167b;

    public m(h.d dVar) {
        this.f197167b = dVar;
    }

    @Override // l41.r
    public final boolean test(Object obj) {
        return ((Number) obj).longValue() != this.f197167b.f197151d.f197041a;
    }
}

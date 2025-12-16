package com.avito.android.messenger.search;

import com.avito.android.messenger.search.t;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: ChannelsSearchPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "uniqueLocallyDeletedChannelIds", "Lkotlin/G0;", "accept", "(Ljava/util/Set;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class v<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f197209b;

    public v(t tVar) {
        this.f197209b = tVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f197209b.le().s(new t.d((Set) obj));
    }
}

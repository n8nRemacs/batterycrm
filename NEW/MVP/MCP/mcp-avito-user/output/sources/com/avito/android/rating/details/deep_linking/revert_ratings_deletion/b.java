package com.avito.android.rating.details.deep_linking.revert_ratings_deletion;

import com.avito.android.deep_linking.RevertRatingsDeletionLink;
import kotlin.Metadata;
import l41.g;

/* compiled from: RevertRatingsDeletionLinkAsyncHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class b<T> implements g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f246975b;

    public b(c cVar) {
        this.f246975b = cVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f246975b.j(new RevertRatingsDeletionLink.b.a((Throwable) obj));
    }
}

package com.avito.android.rating.details.deep_linking.revert_ratings_deletion;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import com.avito.android.deep_linking.RevertRatingsDeletionLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.rating.details.interactor.s;
import com.avito.android.util.InterfaceC35745a5;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RevertRatingsDeletionLinkAsyncHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/details/deep_linking/revert_ratings_deletion/c;", "Lev/a;", "Lcom/avito/android/deep_linking/RevertRatingsDeletionLink;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c extends AbstractC40161a<RevertRatingsDeletionLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final s f246976f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f246977g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public y f246978h;

    @Inject
    public c(@k s sVar, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f246976f = sVar;
        this.f246977g = interfaceC35745a5;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f246978h = (y) this.f246976f.a(((RevertRatingsDeletionLink) deepLink).f132872b).j0(this.f246977g.e()).v0(new a(this), new b(this), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        y yVar = this.f246978h;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f246978h = null;
    }
}

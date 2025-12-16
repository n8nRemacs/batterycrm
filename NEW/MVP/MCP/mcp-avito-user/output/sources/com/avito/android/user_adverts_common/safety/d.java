package com.avito.android.user_adverts_common.safety;

import com.avito.android.deep_linking.links.DetailsSheetLinkBody;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.maybe.C41928w;
import kotlin.Metadata;
import l41.o;

/* compiled from: SafetyInfoProvider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DetailsSheetLinkBody;", "result", "Lio/reactivex/rxjava3/core/w;", "apply", "(Lcom/avito/android/deep_linking/links/DetailsSheetLinkBody;)Lio/reactivex/rxjava3/core/w;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class d<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f315919b;

    public d(g gVar) {
        this.f315919b = gVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        DetailsSheetLinkBody detailsSheetLinkBody = (DetailsSheetLinkBody) obj;
        this.f315919b.getClass();
        String title = detailsSheetLinkBody.getTitle();
        return ((title == null || title.length() == 0) && detailsSheetLinkBody.getDescription() == null) ? C41928w.f403335b : q.i(detailsSheetLinkBody);
    }
}

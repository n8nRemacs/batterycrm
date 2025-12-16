package com.avito.android.publish;

import com.avito.android.publish.PublishParametersInteractor;
import com.avito.android.publish.drafts.C33842h;
import com.avito.android.remote.model.Draft;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import kotlin.Metadata;

/* compiled from: PublishParametersInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Larrow/core/Y0;", "Lcom/avito/android/publish/drafts/h;", "optionalLocalDraft", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/publish/PublishParametersInteractor$a;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.p0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33979p0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33883n0 f238171b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Draft f238172c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PublishParametersInteractor.a f238173d;

    public C33979p0(C33883n0 c33883n0, Draft draft, PublishParametersInteractor.a aVar) {
        this.f238171b = c33883n0;
        this.f238172c = draft;
        this.f238173d = aVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        AbstractC41768a abstractC41768aG;
        C33842h c33842h = (C33842h) arrow.core.Z0.a((arrow.core.Y0) obj, C33885o0.f237466l);
        PublishParametersInteractor.a aVar = this.f238173d;
        CategoryParameters categoryParameters = aVar.f232001a;
        String str = C33883n0.f237442k;
        Draft draft = this.f238172c;
        C33883n0 c33883n0 = this.f238171b;
        if (c33842h == null) {
            abstractC41768aG = c33883n0.i(draft, categoryParameters);
        } else {
            c33883n0.getClass();
            abstractC41768aG = (!kotlin.jvm.internal.L.f(c33842h.f235381g, draft.getDraftId()) || draft.getVersion() >= c33842h.f235378d) ? c33883n0.f237447f.a("ParametersLoadNewDraft").g(c33883n0.i(draft, categoryParameters)) : C41823n.f402260b;
        }
        return abstractC41768aG.B(aVar);
    }
}

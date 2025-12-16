package com.avito.android.rating_form.interactor;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RatingFormInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.rating_form.interactor.RatingFormBaseInteractor", f = "RatingFormInteractor.kt", i = {0, 0, 0, 0, 0, 1, 1}, l = {293, 297, 303}, m = "handleValidationResult", n = {"this", "stepIdentifier", "failedValidationList", "itemValidationResult", "draftId", "this", "failedValidationList"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1"})
/* loaded from: classes16.dex */
final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public d f248228q;

    /* renamed from: r, reason: collision with root package name */
    public Object f248229r;

    /* renamed from: s, reason: collision with root package name */
    public Map f248230s;

    /* renamed from: t, reason: collision with root package name */
    public List f248231t;

    /* renamed from: u, reason: collision with root package name */
    public int f248232u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f248233v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f248234w;

    /* renamed from: x, reason: collision with root package name */
    public int f248235x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f248234w = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f248233v = obj;
        this.f248235x |= BeduinInputModel.MIN_TEXT_VERSION;
        int i12 = d.f248211i;
        return this.f248234w.j(0, null, null, null, this);
    }
}

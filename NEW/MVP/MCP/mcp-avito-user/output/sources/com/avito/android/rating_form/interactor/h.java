package com.avito.android.rating_form.interactor;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.rating_form.StepIdentifier;
import com.avito.android.rating_form.api.remote.model.RatingFormField;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RatingFormInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.rating_form.interactor.RatingFormBaseInteractor", f = "RatingFormInteractor.kt", i = {0, 0, 0, 0, 0, 0}, l = {167, 186, 194, 197}, m = "updateFieldValue$suspendImpl", n = {"$this", "stepIdentifier", "newValue", "failedValidationList", "editedField", "draftId"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"})
/* loaded from: classes16.dex */
final class h extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public d f248247q;

    /* renamed from: r, reason: collision with root package name */
    public StepIdentifier f248248r;

    /* renamed from: s, reason: collision with root package name */
    public RatingFormField.ValueType f248249s;

    /* renamed from: t, reason: collision with root package name */
    public Map f248250t;

    /* renamed from: u, reason: collision with root package name */
    public RatingFormField f248251u;

    /* renamed from: v, reason: collision with root package name */
    public int f248252v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f248253w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f248254x;

    /* renamed from: y, reason: collision with root package name */
    public int f248255y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f248254x = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f248253w = obj;
        this.f248255y |= BeduinInputModel.MIN_TEXT_VERSION;
        return d.m(this.f248254x, 0, null, null, null, false, null, this);
    }
}

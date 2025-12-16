package com.avito.android.rating_form.interactor;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.rating_form.StepIdentifier;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RatingFormInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.rating_form.interactor.RatingFormBaseInteractor", f = "RatingFormInteractor.kt", i = {1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5}, l = {234, 239, 246, 248, 254, 260, 266, 273}, m = "sendCommand", n = {"this", "stepIdentifier", "commands", "failedValidationList", "fieldsForStep", "draftId", "needCheckEmptyFields", "this", "stepIdentifier", "commands", "failedValidationList", "fieldsForStep", "stepValidation", "draftId", "needCheckEmptyFields", "this", "stepIdentifier", "commands", "failedValidationList", "stepValidation", "experienceValidation", "draftId", "this", "stepIdentifier", "commands", "failedValidationList", "draftId", "this", "stepIdentifier", "commands", "failedValidationList", "draftId"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0"})
/* loaded from: classes16.dex */
final class g extends ContinuationImpl {

    /* renamed from: A, reason: collision with root package name */
    public int f248236A;

    /* renamed from: q, reason: collision with root package name */
    public d f248237q;

    /* renamed from: r, reason: collision with root package name */
    public StepIdentifier f248238r;

    /* renamed from: s, reason: collision with root package name */
    public List f248239s;

    /* renamed from: t, reason: collision with root package name */
    public Map f248240t;

    /* renamed from: u, reason: collision with root package name */
    public Object f248241u;

    /* renamed from: v, reason: collision with root package name */
    public Map f248242v;

    /* renamed from: w, reason: collision with root package name */
    public int f248243w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f248244x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f248245y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ d f248246z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f248246z = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f248245y = obj;
        this.f248236A |= BeduinInputModel.MIN_TEXT_VERSION;
        int i12 = d.f248211i;
        return this.f248246z.l(0, null, null, false, false, null, this);
    }
}

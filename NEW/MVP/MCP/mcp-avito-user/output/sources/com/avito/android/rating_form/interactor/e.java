package com.avito.android.rating_form.interactor;

import android.os.Parcelable;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RatingFormInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.rating_form.interactor.RatingFormBaseInteractor", f = "RatingFormInteractor.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 2, 3, 3, 3, 3}, l = {89, 98, UpdateStatusCode.DialogButton.CONFIRM, 105, 111}, m = "addFormRating$suspendImpl", n = {"$this", "commands", "draftId", "stepIdentifier", "failedValidationList", "$this", "failedValidationList", "ratingFormResult", "$this", "$this", "commands", "draftId", "stepIdentifier"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$3", "L$0", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes16.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f248220q;

    /* renamed from: r, reason: collision with root package name */
    public Object f248221r;

    /* renamed from: s, reason: collision with root package name */
    public Object f248222s;

    /* renamed from: t, reason: collision with root package name */
    public Parcelable f248223t;

    /* renamed from: u, reason: collision with root package name */
    public Object f248224u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f248225v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f248226w;

    /* renamed from: x, reason: collision with root package name */
    public int f248227x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f248226w = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f248225v = obj;
        this.f248227x |= BeduinInputModel.MIN_TEXT_VERSION;
        return d.g(this.f248226w, null, null, null, null, this);
    }
}

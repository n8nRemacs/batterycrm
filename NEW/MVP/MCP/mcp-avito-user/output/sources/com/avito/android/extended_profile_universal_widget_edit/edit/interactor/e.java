package com.avito.android.extended_profile_universal_widget_edit.edit.interactor;

import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UniversalWidgetEditInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.extended_profile_universal_widget_edit.edit.interactor.UniversalWidgetEditInteractorImpl", f = "UniversalWidgetEditInteractor.kt", i = {0}, l = {183, 184}, m = "uploadImage", n = {"this"}, s = {"L$0"})
/* loaded from: classes13.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public d f153889q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f153890r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f153891s;

    /* renamed from: t, reason: collision with root package name */
    public int f153892t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f153891s = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f153890r = obj;
        this.f153892t |= BeduinInputModel.MIN_TEXT_VERSION;
        return d.f(this.f153891s, null, this);
    }
}

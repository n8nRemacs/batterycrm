package com.avito.android.cv_actualization.view;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: JsxCvActualizationInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.cv_actualization.view.JsxCvActualizationInteractor", f = "JsxCvActualizationInteractor.kt", i = {}, l = {37}, m = "confirmPhone", n = {}, s = {})
/* loaded from: classes12.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f131109q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f131110r;

    /* renamed from: s, reason: collision with root package name */
    public int f131111s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f131110r = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f131109q = obj;
        this.f131111s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f131110r.a(null, null, this);
    }
}

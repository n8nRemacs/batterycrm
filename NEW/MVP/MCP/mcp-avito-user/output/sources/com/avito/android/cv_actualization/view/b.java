package com.avito.android.cv_actualization.view;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: JsxCvActualizationInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.cv_actualization.view.JsxCvActualizationInteractor", f = "JsxCvActualizationInteractor.kt", i = {}, l = {20}, m = "requestCode", n = {}, s = {})
/* loaded from: classes12.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f131112q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f131113r;

    /* renamed from: s, reason: collision with root package name */
    public int f131114s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f131113r = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f131112q = obj;
        this.f131114s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f131113r.b(null, this);
    }
}

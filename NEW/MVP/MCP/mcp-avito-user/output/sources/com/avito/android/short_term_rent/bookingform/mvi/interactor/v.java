package com.avito.android.short_term_rent.bookingform.mvi.interactor;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ValidateInputsInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.mvi.interactor.ValidateInputsInteractorImpl", f = "ValidateInputsInteractor.kt", i = {0, 0, 0}, l = {37}, m = "validate", n = {"this", "errors", "parameterId"}, s = {"L$0", "L$1", "L$3"})
/* loaded from: classes3.dex */
final class v extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public w f281952q;

    /* renamed from: r, reason: collision with root package name */
    public Map f281953r;

    /* renamed from: s, reason: collision with root package name */
    public Iterator f281954s;

    /* renamed from: t, reason: collision with root package name */
    public String f281955t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f281956u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ w f281957v;

    /* renamed from: w, reason: collision with root package name */
    public int f281958w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f281957v = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f281956u = obj;
        this.f281958w |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f281957v.a(null, this);
    }
}

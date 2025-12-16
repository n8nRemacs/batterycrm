package com.avito.android.verification.verification_form_builder.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FormBuilderActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.verification.verification_form_builder.mvi.FormBuilderActor", f = "FormBuilderActor.kt", i = {0, 0, 0, 0, 1, 1, 3, 3, 3, 4, 4, 4, 4, 5, 5}, l = {111, 117, 118, 123, 127, 133, 135}, m = "validate", n = {"this", "$this$validate", VoiceInfo.STATE, "loading", "$this$validate", "loading", "this", "$this$validate", "loading", "this", "$this$validate", "loading", "it", "$this$validate", "loading"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
/* loaded from: classes5.dex */
final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f325446q;

    /* renamed from: r, reason: collision with root package name */
    public Object f325447r;

    /* renamed from: s, reason: collision with root package name */
    public Object f325448s;

    /* renamed from: t, reason: collision with root package name */
    public Object f325449t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f325450u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f325451v;

    /* renamed from: w, reason: collision with root package name */
    public int f325452w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f325451v = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f325450u = obj;
        this.f325452w |= BeduinInputModel.MIN_TEXT_VERSION;
        return g.c(this.f325451v, null, null, null, this);
    }
}

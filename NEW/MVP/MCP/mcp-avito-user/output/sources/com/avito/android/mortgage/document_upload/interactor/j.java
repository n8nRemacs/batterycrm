package com.avito.android.mortgage.document_upload.interactor;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NavigationInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.mortgage.document_upload.interactor.NavigationInteractor", f = "NavigationInteractor.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {52, 59, 79, 81, 85}, m = "navigate", n = {"this", "$this$navigate", VoiceInfo.STATE, "navigateUp", "$this$navigate", VoiceInfo.STATE, "nextDocumentId", "navigateUp", "nextScreenNumber"}, s = {"L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "Z$0", "I$0"})
/* loaded from: classes15.dex */
final class j extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f199353q;

    /* renamed from: r, reason: collision with root package name */
    public Object f199354r;

    /* renamed from: s, reason: collision with root package name */
    public Object f199355s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f199356t;

    /* renamed from: u, reason: collision with root package name */
    public int f199357u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f199358v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f199359w;

    /* renamed from: x, reason: collision with root package name */
    public int f199360x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f199359w = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f199358v = obj;
        this.f199360x |= BeduinInputModel.MIN_TEXT_VERSION;
        return k.a(this.f199359w, null, null, false, this);
    }
}

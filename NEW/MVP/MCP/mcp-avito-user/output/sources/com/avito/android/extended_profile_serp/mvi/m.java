package com.avito.android.extended_profile_serp.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ExtendedProfileSerpActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.extended_profile_serp.mvi.ExtendedProfileSerpActor", f = "ExtendedProfileSerpActor.kt", i = {0, 0, 0, 0}, l = {384}, m = "sendCallContactClickEvents", n = {"this", VoiceInfo.STATE, "userKey", "advertId"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes13.dex */
final class m extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public n f153014q;

    /* renamed from: r, reason: collision with root package name */
    public ExtendedProfileSerpState f153015r;

    /* renamed from: s, reason: collision with root package name */
    public String f153016s;

    /* renamed from: t, reason: collision with root package name */
    public String f153017t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f153018u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ n f153019v;

    /* renamed from: w, reason: collision with root package name */
    public int f153020w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f153019v = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f153018u = obj;
        this.f153020w |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f153019v.c(null, null, null, null, this);
    }
}

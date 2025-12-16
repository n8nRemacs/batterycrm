package com.avito.android.extended_profile.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ExtendedProfileActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.extended_profile.mvi.ExtendedProfileActor", f = "ExtendedProfileActor.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1032}, m = "sendCallContactClickEvents", n = {"this", VoiceInfo.STATE, "userKey", "contextId", "contactsClickSource", "advertId", "fromSpace"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"})
/* renamed from: com.avito.android.extended_profile.mvi.s, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30468s extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C30451a f150376q;

    /* renamed from: r, reason: collision with root package name */
    public com.avito.android.extended_profile.mvi.entity.a f150377r;

    /* renamed from: s, reason: collision with root package name */
    public String f150378s;

    /* renamed from: t, reason: collision with root package name */
    public String f150379t;

    /* renamed from: u, reason: collision with root package name */
    public Object f150380u;

    /* renamed from: v, reason: collision with root package name */
    public String f150381v;

    /* renamed from: w, reason: collision with root package name */
    public String f150382w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f150383x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C30451a f150384y;

    /* renamed from: z, reason: collision with root package name */
    public int f150385z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30468s(C30451a c30451a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f150384y = c30451a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f150383x = obj;
        this.f150385z |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f150384y.i(null, null, null, null, null, this);
    }
}

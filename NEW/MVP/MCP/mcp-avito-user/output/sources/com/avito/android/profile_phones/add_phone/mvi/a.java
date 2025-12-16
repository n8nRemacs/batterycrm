package com.avito.android.profile_phones.add_phone.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: AddPhoneActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.profile_phones.add_phone.mvi.AddPhoneActor", f = "AddPhoneActor.kt", i = {0, 0, 1, 1}, l = {113, 123, WebSocketProtocol.PAYLOAD_SHORT}, m = "handleOkStatusForExtendedProfileSettings", n = {"this", "phone", "this", "phone"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes16.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public e f226879q;

    /* renamed from: r, reason: collision with root package name */
    public String f226880r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f226881s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f226882t;

    /* renamed from: u, reason: collision with root package name */
    public int f226883u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f226882t = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f226881s = obj;
        this.f226883u |= BeduinInputModel.MIN_TEXT_VERSION;
        return e.c(this.f226882t, null, this);
    }
}

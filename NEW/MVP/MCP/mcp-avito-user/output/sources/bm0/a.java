package BM0;

import CM0.i;
import EM0.d;
import EM0.e;
import J81.o;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: VerificationApi.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ^\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\fH§@¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LBM0/a;", "", "LDM0/d;", "request", "Lcom/avito/android/remote/model/TypedResult;", "LDM0/e;", "c", "(LDM0/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LEM0/d;", "LEM0/e;", "a", "(LEM0/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "code", "codeVerifier", "error", MessageBody.SystemMessageBody.Platform.FLOW, VoiceInfo.STATE, "type", "LFM0/d;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LCM0/c;", "LCM0/i;", "d", "(LCM0/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes5.dex */
public interface a {
    @o("3/verificationView/start")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@J81.a @k d dVar, @k Continuation<? super TypedResult<e>> continuation);

    @o("3/verificationView/tochkaFinish")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @J81.e
    @l
    Object b(@J81.c("code") @l String str, @J81.c("code_verifier") @l String str2, @J81.c("error") @l String str3, @J81.c(MessageBody.SystemMessageBody.Platform.FLOW) @l String str4, @J81.c(VoiceInfo.STATE) @l String str5, @J81.c("type") @l String str6, @k Continuation<? super TypedResult<FM0.d>> continuation);

    @o("3/verificationView/redirect")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object c(@J81.a @k DM0.d dVar, @k Continuation<? super TypedResult<DM0.e>> continuation);

    @o("4/verificationView/disclaimer")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object d(@J81.a @k CM0.c cVar, @k Continuation<? super TypedResult<i>> continuation);
}

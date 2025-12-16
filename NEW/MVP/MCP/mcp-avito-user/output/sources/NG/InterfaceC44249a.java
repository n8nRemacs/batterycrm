package nG;

import J81.e;
import J81.o;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import oG.C44636a;

/* compiled from: SendEsiaDataScreenApi.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LnG/a;", "", "", "code", VoiceInfo.STATE, "Lcom/avito/android/remote/model/TypedResult;", "LoG/a;", "a", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_gig_send-esia-data-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: nG.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC44249a {
    @o("1/gig/worker/documents/selfEmployment/esia/start")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object a(@J81.c("code") @k String str, @J81.c(VoiceInfo.STATE) @k String str2, @k Continuation<? super TypedResult<C44636a>> continuation);
}

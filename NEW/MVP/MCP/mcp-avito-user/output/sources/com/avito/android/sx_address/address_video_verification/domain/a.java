package com.avito.android.sx_address.address_video_verification.domain;

import J81.o;
import J81.q;
import J81.t;
import J81.y;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import e30.InterfaceC39936a;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;

/* compiled from: SxAddressVideoVerificationApi.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/sx_address/address_video_verification/domain/a;", "", "", ContextActionHandler.Link.URL, "fileId", "Lokhttp3/MultipartBody$Part;", "video", "Lretrofit2/y;", "Lkotlin/G0;", "a", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes4.dex */
public interface a {
    @o
    @J81.l
    @InterfaceC42830m
    @Y61.l
    Object a(@y @Y61.k String str, @t("id") @Y61.k String str2, @q @Y61.k MultipartBody.Part part, @Y61.k Continuation<? super retrofit2.y<G0>> continuation);
}

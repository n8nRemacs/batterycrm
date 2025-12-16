package iH;

import J81.f;
import J81.k;
import J81.o;
import J81.t;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import jH.C42255a;
import kH.C42581a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import lH.C43635a;

/* compiled from: UploadDocApi.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"LiH/a;", "", "Lcom/avito/android/remote/model/TypedResult;", "LkH/a;", "d", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "flowType", "LjH/a;", "b", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LlH/a;", "request", "LlH/c;", "c", "(LlH/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "imageId", "a", "_avito_gig_upload-doc_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: iH.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC41285a {
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @J81.b("2/gig/worker/medical/image")
    @l
    Object a(@l @t("image_id") String str, @Y61.k Continuation<? super TypedResult<Object>> continuation);

    @f("1/gig/worker/medical/upload-info")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@t("flow_type") @Y61.k String str, @Y61.k Continuation<? super TypedResult<C42255a>> continuation);

    @o("1/gig/worker/medical/upload-submit")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object c(@J81.a @Y61.k C43635a c43635a, @Y61.k Continuation<? super TypedResult<lH.c>> continuation);

    @o("1/gig/worker/medical/create-image")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object d(@Y61.k Continuation<? super TypedResult<C42581a>> continuation);
}

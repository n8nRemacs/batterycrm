package Gy;

import Hy.C14047a;
import Hy.C14048b;
import Iy.C14173a;
import Iy.C14174b;
import J81.k;
import J81.o;
import Jy.C14259a;
import Jy.C14260b;
import Ky.C14360a;
import Ky.C14361b;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: EmailApi.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LGy/a;", "", "LIy/b;", "request", "Lcom/avito/android/remote/model/TypedResult;", "LIy/a;", "d", "(LIy/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LHy/b;", "LHy/a;", "b", "(LHy/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LKy/b;", "LKy/a;", "a", "(LKy/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LJy/b;", "LJy/a;", "c", "(LJy/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Gy.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC13928a {
    @o("1/profile/email/change")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object a(@J81.a @Y61.k C14361b c14361b, @Y61.k Continuation<? super TypedResult<C14360a>> continuation);

    @o("1/profile/email/add-confirm")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object b(@J81.a @Y61.k C14048b c14048b, @Y61.k Continuation<? super TypedResult<C14047a>> continuation);

    @o("1/profile/email/change-confirm")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object c(@J81.a @Y61.k C14260b c14260b, @Y61.k Continuation<? super TypedResult<C14259a>> continuation);

    @o("1/profile/email/add")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object d(@J81.a @Y61.k C14174b c14174b, @Y61.k Continuation<? super TypedResult<C14173a>> continuation);
}

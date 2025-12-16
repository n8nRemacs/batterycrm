package Nl;

import J81.e;
import J81.k;
import J81.o;
import Ol.C14707a;
import Y61.l;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: C2CTrxApi.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J:\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LNl/a;", "", "", Navigation.ATTRIBUTES, "draftID", "slots", "Lcom/avito/android/remote/model/TypedResult;", "LOl/a;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_c2c-trx_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Nl.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC14584a {
    @o("1/car/c2c-trx/publish/add")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @k({"X-Geo-required: true"})
    @l
    Object a(@J81.c(Navigation.ATTRIBUTES) @l String str, @J81.c("draftID") @l String str2, @J81.c("slots") @l String str3, @Y61.k Continuation<? super TypedResult<C14707a>> continuation);
}

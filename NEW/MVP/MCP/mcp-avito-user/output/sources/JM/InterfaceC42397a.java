package jm;

import J81.f;
import J81.o;
import J81.s;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import km.C42713a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import lm.C43793a;
import lm.C43794b;
import mm.InterfaceC44097a;

/* compiled from: CampaignsSaleApi.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\rH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ljm/a;", "", "", "id", "Lkm/a;", "request", "Lcom/avito/android/remote/model/TypedResult;", "b", "(Ljava/lang/String;Lkm/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Llm/b;", "Llm/a;", "a", "(Ljava/lang/String;Llm/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "init", "Lmm/a;", "c", "(Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-network_campaigns-sale"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: jm.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC42397a {
    @o("2/campaigns/sales/{id}/save")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@s("id") @k String str, @J81.a @k C43794b c43794b, @k Continuation<? super TypedResult<C43793a>> continuation);

    @o("2/campaigns/sales/{id}/autosave")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@s("id") @k String str, @J81.a @k C42713a c42713a, @k Continuation<? super TypedResult<Object>> continuation);

    @f("4/campaigns/sales/{id}/items")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object c(@s("id") @k String str, @l @t("init") Boolean bool, @k Continuation<? super TypedResult<InterfaceC44097a>> continuation);
}

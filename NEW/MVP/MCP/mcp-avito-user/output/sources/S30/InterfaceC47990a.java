package s30;

import J81.f;
import J81.k;
import J81.t;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import t30.C48495a;
import u30.C48782a;
import v30.C49155a;

/* compiled from: NewCarsMarkModelFilterApi.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J:\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H§@¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0010\b\u0001\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ls30/a;", "", "", "", "brands", "models", "Lcom/avito/android/remote/model/TypedResult;", "Lt30/a;", "a", "(Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lu30/a;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ids", "Lv30/a;", "c", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_new-cars-mark-model-filter_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: s30.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC47990a {
    @f("1/new-cars/filter/apply")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object a(@l @t("brands") List<Long> list, @l @t("models") List<Long> list2, @Y61.k Continuation<? super TypedResult<C48495a>> continuation);

    @f("1/new-cars/filter/brands")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@Y61.k Continuation<? super TypedResult<C48782a>> continuation);

    @f("1/new-cars/filter/models")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object c(@l @t("ids") List<Long> list, @Y61.k Continuation<? super TypedResult<C49155a>> continuation);
}

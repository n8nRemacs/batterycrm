package pD0;

import J81.d;
import J81.e;
import J81.f;
import J81.o;
import Y61.k;
import Y61.l;
import aC0.C19756a;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.z;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import qD0.C47284b;
import rD0.C47528b;
import sD0.C48034b;
import tD0.C48538b;
import uD0.C48885b;
import xD0.C49823c;
import yD0.C50102a;
import zD0.C50442b;

/* compiled from: TariffLfConstructorOldApi.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00020\u000b2\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00020\u000b2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0006H'¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00020\u000b2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0006H'¢\u0006\u0004\b\u0013\u0010\u0011J9\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00020\u000b2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u0006H'¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00020\u000b2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0006H'¢\u0006\u0004\b\u0019\u0010\u0011J9\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00020\u000b2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\u001a\u001a\u00020\u0006H'¢\u0006\u0004\b\u001c\u0010\u0017J/\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00020\u000b2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0006H'¢\u0006\u0004\b\u001e\u0010\u0011Js\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00020\u000b2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00062\u0014\b\u0001\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001f2\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0014\b\u0001\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001f2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b#\u0010$J/\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00020\u000b2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010&\u001a\u00020%H'¢\u0006\u0004\b'\u0010(J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0002H§@¢\u0006\u0004\b*\u0010\u0005¨\u0006+"}, d2 = {"LpD0/a;", "", "Lcom/avito/android/remote/model/TypedResult;", "LzD0/b;", "j", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "context", "LtD0/b;", "l", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/reactivex/rxjava3/core/z;", "LwD0/e;", "d", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "packageId", "e", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "LxD0/c;", "g", "sizeId", "LyD0/a;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "LrD0/b;", "a", "categoryId", "LaC0/a;", "f", "LuD0/b;", "i", "", "locationIds", "subcategoryIds", "LqD0/b;", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "", "autoProlong", "b", "(Ljava/lang/String;Z)Lio/reactivex/rxjava3/core/z;", "LsD0/b;", "k", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: pD0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC46937a {
    @o("1/tariff/configure/lfs/category")
    @e
    @k
    z<TypedResult<C47528b>> a(@J81.c("context") @k String context, @J81.c("packageId") @k String packageId);

    @o("1/tariff/configure/save")
    @e
    @k
    z<TypedResult<C47284b>> b(@J81.c("context") @k String context, @J81.c("autoProlong") boolean autoProlong);

    @o("1/tariff/configure/lfs/size/price")
    @e
    @k
    z<TypedResult<C50102a>> c(@J81.c("context") @k String context, @J81.c("packageId") @k String packageId, @J81.c("sizeId") @k String sizeId);

    @o("1/tariff/configure")
    @e
    @k
    z<TypedResult<wD0.e>> d(@J81.c("context") @l String context);

    @o("1/tariff/configure/lfs/remove")
    @e
    @k
    z<TypedResult<wD0.e>> e(@J81.c("context") @k String context, @J81.c("packageId") @k String packageId);

    @o("1/tariff/configure/lfs/subcategories")
    @e
    @k
    z<TypedResult<C19756a>> f(@J81.c("context") @k String context, @J81.c("packageId") @k String packageId, @J81.c("categoryId") @k String categoryId);

    @o("1/tariff/configure/lfs/size")
    @e
    @k
    z<TypedResult<C49823c>> g(@J81.c("context") @k String context, @J81.c("packageId") @k String packageId);

    @o("1/tariff/configure/lfs/update")
    @e
    @k
    z<TypedResult<C47284b>> h(@J81.c("context") @k String context, @J81.c("packageId") @k String packageId, @d @k Map<String, String> locationIds, @J81.c("categoryId") @l String categoryId, @d @k Map<String, String> subcategoryIds, @J81.c("sizeId") @l String sizeId);

    @o("1/tariff/configure/lfs/locations")
    @e
    @k
    z<TypedResult<C48885b>> i(@J81.c("context") @k String context, @J81.c("packageId") @k String packageId);

    @f("5/tariff/configure/vertical")
    @l
    Object j(@k Continuation<? super TypedResult<C50442b>> continuation);

    @f("3/tariff/configure/landing")
    @l
    Object k(@k Continuation<? super TypedResult<C48034b>> continuation);

    @o("1/tariff/configure/level")
    @e
    @l
    Object l(@J81.c("context") @k String str, @k Continuation<? super TypedResult<C48538b>> continuation);
}

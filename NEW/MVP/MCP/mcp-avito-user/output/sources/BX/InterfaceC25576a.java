package bX;

import J81.d;
import J81.e;
import J81.f;
import J81.o;
import J81.u;
import Y61.k;
import Y61.l;
import cX.C27116b;
import com.avito.android.remote.model.TypedResult;
import dX.C39635b;
import dX.C39636c;
import dX.h;
import dX.m;
import dX.r;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.I;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: LoyaltyApi.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J1\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\b\u0010\tJ,\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000bJ,\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0010\u0010\u000bJ,\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\u0014\b\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0013\u0010\u000bJ,\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\u0014\b\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0015\u0010\u000bJ,\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, d2 = {"LbX/a;", "", "", "", "query", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "LcX/b;", "c", "(Ljava/util/Map;)Lio/reactivex/rxjava3/core/I;", "d", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "args", "LdX/r;", "b", "LdX/m;", "e", "map", "LdX/b;", "f", "LdX/c;", "g", "LdX/h;", "a", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: bX.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC25576a {
    @f("3/loyalty/alert/content/bulk")
    @l
    Object a(@u @k Map<String, String> map, @k Continuation<? super TypedResult<h>> continuation);

    @o("3/loyalty/layout/general")
    @e
    @l
    Object b(@d @k Map<String, String> map, @k Continuation<? super TypedResult<r>> continuation);

    @f("2/badges/content")
    @k
    I<TypedResult<C27116b>> c(@u @k Map<String, String> query);

    @f("2/badges/content")
    @l
    Object d(@u @k Map<String, String> map, @k Continuation<? super TypedResult<C27116b>> continuation);

    @o("3/loyalty/layout/gray/general")
    @e
    @l
    Object e(@d @k Map<String, String> map, @k Continuation<? super TypedResult<m>> continuation);

    @o("3/loyalty/layout/criteria")
    @e
    @l
    Object f(@d @k Map<String, String> map, @k Continuation<? super TypedResult<C39635b>> continuation);

    @o("3/loyalty/layout/gray/criteria")
    @e
    @l
    Object g(@d @k Map<String, String> map, @k Continuation<? super TypedResult<C39636c>> continuation);
}

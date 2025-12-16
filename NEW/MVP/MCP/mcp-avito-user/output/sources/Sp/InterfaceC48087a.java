package sP;

import J81.f;
import J81.o;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import tP.C48591a;
import uP.C48927b;
import uP.e;
import vP.C49245a;
import wP.C49546a;
import xP.C49872a;
import yP.C50156b;

/* compiled from: CrmPaidCvsApi.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\nH§@¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004H§@¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004H§@¢\u0006\u0004\b\u001a\u0010\u0018J\"\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00042\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LsP/a;", "", "LuP/e;", "request", "Lcom/avito/android/remote/model/TypedResult;", "LuP/b;", "e", "(LuP/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "", "note", "status", "LvP/a;", "a", "(JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "limit", "cursor", "LwP/k;", "LwP/a;", "b", "(Ljava/lang/Long;Ljava/lang/Long;LwP/k;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LtP/a;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LxP/a;", "f", "categoryId", "LyP/b;", "d", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_job_crm-paid-cvs_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: sP.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC48087a {
    @f("1/job/paid_cv/change_status_and_note")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@t("id") long j12, @t("note") @k String str, @t("status") @k String str2, @k Continuation<? super TypedResult<C49245a>> continuation);

    @o("1/job/paid_cv/get_cvs")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@l @t("limit") Long l12, @l @t("cursor") Long l13, @J81.a @k wP.k kVar, @k Continuation<? super TypedResult<C49546a>> continuation);

    @f("1/job/paid_cv/get_favorites_filters")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object c(@k Continuation<? super TypedResult<C48591a>> continuation);

    @f("5/subscriptions")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @J81.k({"X-Geo-required: true"})
    @l
    Object d(@l @t("categoryId") Long l12, @k Continuation<? super TypedResult<C50156b>> continuation);

    @o("1/job/favorites_cv/get_favorites")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object e(@J81.a @k e eVar, @k Continuation<? super TypedResult<C48927b>> continuation);

    @f("1/job/paid_cv/get_filters")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object f(@k Continuation<? super TypedResult<C49872a>> continuation);
}

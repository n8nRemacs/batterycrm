package i00;

import J81.f;
import J81.k;
import J81.o;
import J81.s;
import J81.t;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import j00.C42171a;
import k00.C42468a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import l00.C43523a;
import l00.C43524b;
import m00.C43854a;
import m00.C43855b;
import n00.C44162a;
import o00.C44499a;
import p00.C44968a;
import q00.C47178a;
import q00.C47179b;
import r00.C47472a;
import s00.C47950a;
import s00.C47951b;

/* compiled from: MortgageApi.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\u0007J*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0017\u0010\u0018J6\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\b\b\u0001\u0010\r\u001a\u00020\u001eH§@¢\u0006\u0004\b \u0010!J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0004H§@¢\u0006\u0004\b#\u0010$J \u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00042\b\b\u0001\u0010\r\u001a\u00020%H§@¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"Li00/a;", "", "", "applicationId", "Lcom/avito/android/remote/model/TypedResult;", "Lj00/a;", "e", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lk00/a;", "j", "Ln00/a;", "c", "Lo00/b;", "request", "Lo00/a;", "h", "(Ljava/lang/String;Lo00/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll00/b;", "Ll00/a;", "a", "(Ljava/lang/String;Ll00/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lm00/b;", "Lm00/a;", "b", "(Ljava/lang/String;Lm00/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flowType", "role", "Lp00/a;", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lq00/b;", "Lq00/a;", "f", "(Lq00/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lr00/a;", "d", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ls00/b;", "Ls00/a;", "i", "(Ls00/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: i00.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC41203a {
    @o("1/mortgage-form/application/{applicationId}/set-appeal-selection")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object a(@s("applicationId") @Y61.k String str, @J81.a @Y61.k C43524b c43524b, @Y61.k Continuation<? super TypedResult<C43523a>> continuation);

    @o("1/mortgage-form/application/{applicationId}/set-appeal-viewed")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object b(@s("applicationId") @Y61.k String str, @J81.a @Y61.k C43855b c43855b, @Y61.k Continuation<? super TypedResult<C43854a>> continuation);

    @o("1/mortgage-form/application/{applicationId}/realty-object/submit")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object c(@s("applicationId") @Y61.k String str, @Y61.k Continuation<? super TypedResult<C44162a>> continuation);

    @f("1/mortgage-professional/get-consultation-slots")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object d(@Y61.k Continuation<? super TypedResult<C47472a>> continuation);

    @o("1/mortgage-form/application/{applicationId}/copy")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object e(@s("applicationId") @Y61.k String str, @Y61.k Continuation<? super TypedResult<C42171a>> continuation);

    @o("1/mortgage-professional/assign-consultation")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object f(@J81.a @Y61.k C47179b c47179b, @Y61.k Continuation<? super TypedResult<C47178a>> continuation);

    @f("1/mortgage-form/landing/manager-usp")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object g(@l @t("applicationId") String str, @t("flowType") @Y61.k String str2, @t("role") @Y61.k String str3, @Y61.k Continuation<? super TypedResult<C44968a>> continuation);

    @o("1/mortgage-form/application/{applicationId}/realty-object/upsert")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object h(@s("applicationId") @Y61.k String str, @J81.a @Y61.k o00.b bVar, @Y61.k Continuation<? super TypedResult<C44499a>> continuation);

    @o("1/mortgage-professional/get-entry-point")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object i(@J81.a @Y61.k C47951b c47951b, @Y61.k Continuation<? super TypedResult<C47950a>> continuation);

    @o("1/mortgage-form/application/{applicationId}/realty-object/delete")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object j(@s("applicationId") @Y61.k String str, @Y61.k Continuation<? super TypedResult<C42468a>> continuation);
}

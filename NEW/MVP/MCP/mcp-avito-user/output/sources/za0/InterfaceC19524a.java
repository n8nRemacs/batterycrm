package Za0;

import J81.e;
import J81.f;
import J81.o;
import J81.t;
import Y61.k;
import Y61.l;
import ab0.C19857a;
import ab0.C19860d;
import bb0.C25621b;
import cb0.h;
import com.avito.android.remote.model.TypedResult;
import db0.C39698a;
import db0.C39699b;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import eb0.g;
import fb0.C40392a;
import fb0.C40393b;
import gb0.C40647a;
import gb0.C40648b;
import hb0.C40908a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ProfileManagementApi.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\u0019\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001a\u0010\u001bJ\"\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00042\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001cH§@¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0004H§@¢\u0006\u0004\b\"\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0004H§@¢\u0006\u0004\b%\u0010#¨\u0006&"}, d2 = {"LZa0/a;", "", "Ldb0/a;", "request", "Lcom/avito/android/remote/model/TypedResult;", "Ldb0/b;", "e", "(Ldb0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lfb0/a;", "Lfb0/b;", "b", "(Lfb0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Leb0/g;", "Leb0/h;", "h", "(Leb0/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lgb0/b;", "Lgb0/a;", "a", "(Lgb0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lab0/a;", "Lab0/d;", "g", "(Lab0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isPublic", "i", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "verificationToken", "Lhb0/a;", "f", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbb0/b;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcb0/h;", "d", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Za0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC19524a {
    @o("1/universal-widget/visibility")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@J81.a @k C40648b c40648b, @k Continuation<? super TypedResult<C40647a>> continuation);

    @o("1/universal-widget/order")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@J81.a @k C40392a c40392a, @k Continuation<? super TypedResult<C40393b>> continuation);

    @o("3/profile/management/avatar/delete")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object c(@k Continuation<? super TypedResult<C25621b>> continuation);

    @f("3/profile/servicesSellerType/optionsList")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object d(@k Continuation<? super TypedResult<h>> continuation);

    @o("1/universal-widget/delete")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object e(@J81.a @k C39698a c39698a, @k Continuation<? super TypedResult<C39699b>> continuation);

    @f("2/vertical-profile/info")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object f(@l @t("verificationToken") String str, @k Continuation<? super TypedResult<C40908a>> continuation);

    @o("2/profile/basic-info/edit")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object g(@J81.a @k C19857a c19857a, @k Continuation<? super TypedResult<C19860d>> continuation);

    @o("1/universal-widget/save")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object h(@J81.a @k g gVar, @k Continuation<? super TypedResult<eb0.h>> continuation);

    @o("2/profile/management/avatar/delete")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object i(@J81.c("isPublic") boolean z12, @k Continuation<? super TypedResult<Boolean>> continuation);
}

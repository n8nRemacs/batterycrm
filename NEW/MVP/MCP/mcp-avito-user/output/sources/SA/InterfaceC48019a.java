package sA;

import J81.f;
import J81.i;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import uA.InterfaceC48870a;

/* compiled from: ExtendedProfileCreationApi.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J:\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LsA/a;", "", "", "mergekey", "scenario", "verificationToken", "Lcom/avito/android/remote/model/TypedResult;", "LuA/a;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_extended-profile-creation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: sA.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC48019a {
    @f("3/extended-profile/constructor/profiles-data")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@i("Mergekey") @l String str, @l @t("scenario") String str2, @l @t("verificationToken") String str3, @k Continuation<? super TypedResult<InterfaceC48870a>> continuation);
}

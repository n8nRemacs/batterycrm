package Wl0;

import J81.f;
import J81.k;
import J81.t;
import Y61.l;
import Yl0.C18288k;
import Zl0.C19575a;
import am0.C19910a;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: UserAdvertsApi.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001Jv\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\fH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\fH§@¢\u0006\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"LWl0/a;", "", "", "shortcut", "q", "bt", "limit", "offset", "filterParams", "segment", "", "isPro", "Lcom/avito/android/remote/model/TypedResult;", "LYl0/k;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LZl0/a;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lam0/a;", "a", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Wl0.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC15774a {
    @f("4/serp/profile/items/shortcuts")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Employeemode-required: true"})
    @l
    Object a(@Y61.k Continuation<? super TypedResult<C19910a>> continuation);

    @f("2/profile/items/expired/count")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Employeemode-required: true"})
    @l
    Object b(@Y61.k Continuation<? super TypedResult<C19575a>> continuation);

    @f("13/serp/profile/items")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Employeemode-required: true"})
    @l
    Object c(@l @t("shortcut") String str, @l @t("q") String str2, @l @t("bt") String str3, @l @t("limit") String str4, @l @t("offset") String str5, @l @t("filterParams") String str6, @l @t("segment") String str7, @l @t("isPro") Boolean bool, @Y61.k Continuation<? super TypedResult<C18288k>> continuation);
}

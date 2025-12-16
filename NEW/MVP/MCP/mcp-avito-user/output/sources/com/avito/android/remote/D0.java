package com.avito.android.remote;

import com.avito.android.remote.model.FormatTextResult;
import com.avito.android.remote.model.ProfileSettingsResult;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.basic.AvatarUploadResult;
import com.avito.android.remote.model.basic.BasicProfileSettingsResult;
import com.avito.android.remote.model.extended.ExtendedProfileSettingsResult;
import com.avito.android.remote.model.extended.ExtendedProfileSettingsUploadResult;
import com.avito.android.remote.model.extended.SelectionItemListResult;
import com.avito.android.remote.model.extended.adverts.ExtendedProfileSettingsAdvertsResult;
import com.avito.android.remote.model.extended.modification.ModificationResult;
import com.avito.android.remote.model.extended.modification.SelectionModificationResult;
import e30.InterfaceC39936a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;

/* compiled from: ProfileManagementApi.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H§@¢\u0006\u0004\b\f\u0010\u0005J*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\b\b\u0003\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u0006H§@¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u0006H§@¢\u0006\u0004\b\u001a\u0010\nJ \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u0006H§@¢\u0006\u0004\b\u001c\u0010\nJ,\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00022\u0014\b\u0001\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001dH§@¢\u0006\u0004\b \u0010!JF\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00022\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0001\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0001\u0010'\u001a\u0004\u0018\u00010%H§@¢\u0006\u0004\b)\u0010*J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0002H§@¢\u0006\u0004\b+\u0010\u0005J \u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0013H§@¢\u0006\u0004\b-\u0010.J \u0010/\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u0006H§@¢\u0006\u0004\b/\u0010\nJ\"\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00022\n\b\u0001\u00100\u001a\u0004\u0018\u00010%H§@¢\u0006\u0004\b2\u00103¨\u00064"}, d2 = {"Lcom/avito/android/remote/D0;", "", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/ProfileSettingsResult;", "g", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", SearchParamsConverterKt.SOURCE, "Lcom/avito/android/remote/model/basic/BasicProfileSettingsResult;", "b", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/remote/model/extended/ExtendedProfileSettingsResult;", "l", "type", "text", "Lcom/avito/android/remote/model/FormatTextResult;", "j", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fieldName", "Lokhttp3/MultipartBody$Part;", "file", "Lcom/avito/android/remote/model/extended/ExtendedProfileSettingsUploadResult;", "i", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "jsonData", "Lcom/avito/android/remote/model/extended/modification/ModificationResult;", "e", "Lcom/avito/android/remote/model/extended/modification/SelectionModificationResult;", "h", "", "field", "Lkotlin/G0;", "f", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "query", "", SearchParamsConverterKt.SORT, "", "offset", "limit", "Lcom/avito/android/remote/model/extended/adverts/ExtendedProfileSettingsAdvertsResult;", "k", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lcom/avito/android/remote/model/basic/AvatarUploadResult;", "d", "(Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "m", "itemListId", "Lcom/avito/android/remote/model/extended/SelectionItemListResult;", "c", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes17.dex */
public interface D0 {

    /* compiled from: ProfileManagementApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @J81.o("1/vertical-profile/disable")
    @Y61.l
    Object a(@Y61.k Continuation<? super TypedResult<kotlin.G0>> continuation);

    @J81.f("1/profile/management/basic")
    @Y61.l
    Object b(@Y61.l @J81.t("s") String str, @Y61.k Continuation<? super TypedResult<BasicProfileSettingsResult>> continuation);

    @J81.f("1/extended-profile/item-list/items")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @Y61.l
    Object c(@Y61.l @J81.t("itemListId") Long l12, @Y61.k Continuation<? super TypedResult<SelectionItemListResult>> continuation);

    @J81.o("2/profile/management/avatar/upload")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @J81.l
    @Y61.l
    Object d(@J81.q @Y61.k MultipartBody.Part part, @Y61.k Continuation<? super TypedResult<AvatarUploadResult>> continuation);

    @J81.o("1/extended-profile/modify-fields")
    @J81.e
    @Y61.l
    Object e(@J81.c("jsonData") @Y61.k String str, @Y61.k Continuation<? super TypedResult<ModificationResult>> continuation);

    @J81.o("1/profile/management/basic/edit")
    @J81.e
    @Y61.l
    Object f(@J81.d @Y61.k Map<String, String> map, @Y61.k Continuation<? super TypedResult<kotlin.G0>> continuation);

    @J81.f("1/profile/management")
    @Y61.l
    Object g(@Y61.k Continuation<? super TypedResult<ProfileSettingsResult>> continuation);

    @J81.o("1/extended-profile/modify-fields")
    @J81.e
    @Y61.l
    Object h(@J81.c("jsonData") @Y61.k String str, @Y61.k Continuation<? super TypedResult<SelectionModificationResult>> continuation);

    @J81.o("1/extended-profile/image-upload")
    @Y61.l
    @J81.l
    Object i(@J81.t("fieldName") @Y61.k String str, @J81.q @Y61.k MultipartBody.Part part, @Y61.k Continuation<? super TypedResult<ExtendedProfileSettingsUploadResult>> continuation);

    @J81.o("1/profile/management/edit-text")
    @J81.e
    @Y61.l
    Object j(@J81.c("type") @Y61.k String str, @J81.c("text") @Y61.k String str2, @Y61.k Continuation<? super TypedResult<FormatTextResult>> continuation);

    @J81.f("1/extended-profile/windows/items")
    @Y61.l
    Object k(@Y61.l @J81.t("query") String str, @Y61.l @J81.t(SearchParamsConverterKt.SORT) Integer num, @Y61.l @J81.t("offset") Long l12, @Y61.l @J81.t("limit") Long l13, @Y61.k Continuation<? super TypedResult<ExtendedProfileSettingsAdvertsResult>> continuation);

    @J81.f("1/profile/management/extended")
    @Y61.l
    Object l(@Y61.k Continuation<? super TypedResult<ExtendedProfileSettingsResult>> continuation);

    @J81.o("1/extended-profile/item-list/update")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @J81.e
    @Y61.l
    Object m(@J81.c("jsonData") @Y61.k String str, @Y61.k Continuation<? super TypedResult<kotlin.G0>> continuation);
}

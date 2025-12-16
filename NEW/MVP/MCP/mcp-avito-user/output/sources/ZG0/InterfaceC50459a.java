package zG0;

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

/* compiled from: UniversalTransactionApi.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0094\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LzG0/a;", "", "", "bricksEnv", "id", "scenario", "namespace", "location", "extra", "eventparams", "templateSlug", "", "templateVersion", "status", "tagsGroups", "Lcom/avito/android/remote/model/TypedResult;", "LAG0/a;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: zG0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC50459a {
    @f("1/transaction/page")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@i("Bricks-Env") @l String str, @t("id") @k String str2, @t("scenario") @k String str3, @t("namespace") @k String str4, @l @t("location") String str5, @l @t("extra") String str6, @l @t("eventparams") String str7, @l @t("templateSlug") String str8, @l @t("templateVersion") Long l12, @l @t("status") String str9, @l @t("tagsGroups") String str10, @k Continuation<? super TypedResult<AG0.a>> continuation);
}

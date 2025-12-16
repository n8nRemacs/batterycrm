package Fk;

import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.buy_contact.api.BuyContactResponse;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: BuyContactLinkApi.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LFk/a;", "", "", "itemId", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/buy_contact/api/BuyContactResponse;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_job_buy-contact-link_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Fk.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC13809a {
    @J81.f("1/job/resume/get_package_deeplink")
    @l
    Object a(@t("itemId") @k String str, @k Continuation<? super TypedResult<BuyContactResponse>> continuation);
}

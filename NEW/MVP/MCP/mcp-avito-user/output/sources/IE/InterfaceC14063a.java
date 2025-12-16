package Ie;

import J81.f;
import J81.t;
import Je.C14189a;
import Y61.k;
import Y61.l;
import com.avito.android.auto_loans_cabinet.generated.api.autoloan_user_blanks.LoansType;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: AutoLoansCabinetApi.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LIe/a;", "", "Lcom/avito/android/auto_loans_cabinet/generated/api/autoloan_user_blanks/LoansType;", "loansType", "Lcom/avito/android/remote/model/TypedResult;", "LJe/a;", "a", "(Lcom/avito/android/auto_loans_cabinet/generated/api/autoloan_user_blanks/LoansType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Ie.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC14063a {
    @f("1/autoloan/user-blanks")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@l @t("loansType") LoansType loansType, @k Continuation<? super TypedResult<C14189a>> continuation);
}

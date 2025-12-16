package b70;

import J81.f;
import J81.i;
import J81.k;
import J81.t;
import Y61.l;
import c70.C26952a;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: FeatureApi.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JP\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lb70/a;", "", "", "beduinComponents", "beduinAgent", "segment", "context", "placement", "Lcom/avito/android/remote/model/TypedResult;", "Lc70/a;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_personal-banner_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: b70.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC25423a {
    @f("1/sx-banners/get")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Employeemode-required: true"})
    @l
    Object a(@i("Beduin-Components") @l String str, @i("Beduin-Agent") @l String str2, @l @t("segment") String str3, @l @t("context") String str4, @t("placement") @Y61.k String str5, @Y61.k Continuation<? super TypedResult<C26952a>> continuation);
}

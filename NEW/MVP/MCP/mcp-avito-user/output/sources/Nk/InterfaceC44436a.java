package nk;

import J81.f;
import J81.i;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.brandspace.remote.model.Brandspace;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;

/* compiled from: BrandspaceApi.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JS\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lnk/a;", "", "", "beduinAgent", "components", "itemId", "session", SearchParamsConverterKt.SOURCE, "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/brandspace/remote/model/Brandspace;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "_avito-discouraged_avito-api_brandspace"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: nk.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC44436a {

    /* compiled from: BrandspaceApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nk.a$a, reason: collision with other inner class name */
    public static final class C12150a {
    }

    @f("2/brandspace")
    @k
    I<TypedResult<Brandspace>> a(@i("Beduin-Agent") @l String beduinAgent, @i("Beduin-Components") @l String components, @t("id") @k String itemId, @t("session") @k String session, @l @t(SearchParamsConverterKt.SOURCE) String source);
}

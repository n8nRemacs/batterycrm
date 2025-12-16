package Uq;

import J81.f;
import J81.i;
import J81.o;
import J81.s;
import J81.t;
import Vq.AbstractC15707a;
import Vq.d;
import Y61.k;
import Y61.l;
import com.avito.android.comparison.remote.model.ComparisonListResponse;
import com.avito.android.comparison.remote.model.ComparisonResponse;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;

/* compiled from: ComparisonApi.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J1\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00060\u0005H'¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00060\u000f2\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00060\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LUq/a;", "", "", "categoryId", "fromPage", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/comparison/remote/model/ComparisonResponse;", "c", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/comparison/remote/model/ComparisonListResponse;", "b", "()Lio/reactivex/rxjava3/core/z;", "itemId", "searchContext", "Lio/reactivex/rxjava3/core/I;", "LVq/a;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "context", "LVq/d;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "_avito-discouraged_avito-network_comparison"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Uq.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC15558a {

    /* compiled from: ComparisonApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Uq.a$a, reason: collision with other inner class name */
    public static final class C1152a {
    }

    @o("1/comparisons/add")
    @k
    I<TypedResult<AbstractC15707a>> a(@t("itemId") @k String itemId, @t("from_page") @k String fromPage, @l @t("context") String searchContext);

    @f("1/comparisons/list")
    @k
    z<TypedResult<ComparisonListResponse>> b();

    @f("1/comparisons/get/{categoryId}")
    @k
    z<TypedResult<ComparisonResponse>> c(@s("categoryId") @k String categoryId, @l @t("fromPage") String fromPage);

    @J81.b("1/comparisons/{categoryId}/item/{itemId}")
    @k
    I<TypedResult<d>> d(@s("categoryId") @k String categoryId, @s("itemId") @k String itemId, @i("fromPage") @k String fromPage, @i("context") @l String context);
}

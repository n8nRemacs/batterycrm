package HO;

import J81.f;
import J81.s;
import Y61.k;
import com.avito.android.remote.model.AdvertReport;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;

/* compiled from: ItemReportApi.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LHO/a;", "", "", "itemId", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/AdvertReport;", "a", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "_avito_item-report_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes14.dex */
public interface a {
    @f("2/items/{itemId}/report")
    @k
    z<AdvertReport> a(@s("itemId") @k String itemId);
}

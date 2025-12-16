package Gx;

import J81.e;
import J81.o;
import Y61.k;
import com.avito.android.remote.ApartmentNumberRequestResponse;
import com.avito.android.remote.DomotekaTeaserResponse;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;

/* compiled from: DomotekaApi.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"LGx/a;", "", "", "itemId", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/DomotekaTeaserResponse;", "b", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/ApartmentNumberRequestResponse;", "a", "_avito_domoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Gx.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC13925a {
    @o("1/domoteka/getApartmentNumber")
    @e
    @k
    z<ApartmentNumberRequestResponse> a(@J81.c("itemId") @k String itemId);

    @o("1/domoteka/getDynamicTeaser")
    @e
    @k
    z<DomotekaTeaserResponse> b(@J81.c("itemId") @k String itemId);
}

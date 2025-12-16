package Mw;

import Y61.k;
import android.app.Activity;
import androidx.compose.runtime.internal.P;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.location.find.o;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;

/* compiled from: FindCurrentLocationUseCase.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"LMw/b;", "Lkotlin/Function0;", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/avito_map/AvitoMapPoint;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements Y41.a<InterfaceC43160i<? extends AvitoMapPoint>> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Activity f11101b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final o f11102c;

    @Inject
    public b(@k Activity activity, @k o oVar) {
        this.f11101b = activity;
        this.f11102c = oVar;
    }

    @Override // Y41.a
    public final InterfaceC43160i<? extends AvitoMapPoint> invoke() {
        return new C14536a(y.a(this.f11102c.b(this.f11101b, (4 & 2) == 0, (4 & 4) == 0)));
    }
}

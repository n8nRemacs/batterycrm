package lW;

import Y61.k;
import Y61.l;
import android.location.Location;
import androidx.compose.foundation.H;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.location.LocationSource;
import com.avito.android.server_time.f;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import mW.C44022a;
import mW.C44023b;
import mW.C44024c;
import mW.g;

/* compiled from: LocationAnalyticsInteractor.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LlW/b;", "LlW/a;", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lW.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C43692b implements InterfaceC43691a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f413825a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final f f413826b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public String f413827c = "";

    /* renamed from: d, reason: collision with root package name */
    public boolean f413828d;

    @Inject
    public C43692b(@k InterfaceC28373a interfaceC28373a, @k f fVar) {
        this.f413825a = interfaceC28373a;
        this.f413826b = fVar;
    }

    @Override // lW.InterfaceC43691a
    public final void a(@l String str, @k String str2, @k String str3) {
        this.f413825a.c(new mW.f(null, str3, str, str2));
    }

    @Override // lW.InterfaceC43691a
    public final void b(@k HashMap<LocationSource, String> map, @l LocationSource locationSource, @l String str) {
        this.f413825a.c(new g(map, locationSource, str));
    }

    @Override // lW.InterfaceC43691a
    public final void c(@l String str, @l String str2, @k String str3, boolean z12) {
        this.f413825a.c(new mW.e(str, z12 ? "0" : "1", str2, str3));
    }

    @Override // lW.InterfaceC43691a
    public final void d(@k Location location, @l Integer num) {
        this.f413825a.c(new mW.d(null, num, e.a(location), "first_launch"));
    }

    @Override // lW.InterfaceC43691a
    public final void e(@l String str) {
        StringBuilder sbR = H.r(str);
        sbR.append(this.f413826b.now());
        String string = sbR.toString();
        this.f413827c = string;
        this.f413825a.c(new C44024c(str, string));
    }

    @Override // lW.InterfaceC43691a
    public final void f(@l Location location, @l String str) {
        this.f413828d = true;
        this.f413825a.c(new C44022a(this.f413827c, str, location != null ? e.a(location) : null, location != null));
    }

    @Override // lW.InterfaceC43691a
    public final void g() {
        if (this.f413827c.length() <= 0 || !this.f413828d) {
            return;
        }
        this.f413825a.c(new C44023b(this.f413827c));
    }
}

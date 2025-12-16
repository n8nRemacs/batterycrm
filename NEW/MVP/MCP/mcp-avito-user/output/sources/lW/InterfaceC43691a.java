package lW;

import Y61.k;
import Y61.l;
import android.location.Location;
import com.avito.android.location.LocationSource;
import java.util.HashMap;
import kotlin.Metadata;

/* compiled from: LocationAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LlW/a;", "", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lW.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC43691a {

    /* compiled from: LocationAnalyticsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lW.a$a, reason: collision with other inner class name */
    public static final class C11788a {
    }

    void a(@l String str, @k String str2, @k String str3);

    void b(@k HashMap<LocationSource, String> map, @l LocationSource locationSource, @l String str);

    void c(@l String str, @l String str2, @k String str3, boolean z12);

    void d(@k Location location, @l Integer num);

    void e(@l String str);

    void f(@l Location location, @l String str);

    void g();
}

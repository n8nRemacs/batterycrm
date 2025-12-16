package N70;

import Y61.k;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ExifExtraDataSerializer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LN70/c;", "LN70/b;", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Gson f11207a;

    @Inject
    public c(@k Gson gson) {
        this.f11207a = gson;
    }

    @Override // N70.b
    @k
    public final String a(@k a aVar) {
        return this.f11207a.l(aVar);
    }
}

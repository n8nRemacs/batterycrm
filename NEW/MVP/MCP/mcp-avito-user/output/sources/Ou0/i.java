package OU0;

import Y61.k;
import Y61.l;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlinx.serialization.json.JsonElement;

/* compiled from: KotlinxJson.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOU0/i;", "LPU0/i;", "<init>", "()V", "kotlinx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i implements PU0.i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinkedHashMap f12293a = new LinkedHashMap();

    @Override // PU0.i
    @l
    public final e a(@k String str, @k PU0.f fVar) {
        JsonElement jsonElement = (JsonElement) this.f12293a.put(str, f.a(fVar));
        if (jsonElement != null) {
            return f.b(jsonElement);
        }
        return null;
    }
}

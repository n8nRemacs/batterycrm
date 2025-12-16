package OU0;

import Y61.k;
import kotlin.Metadata;
import kotlinx.serialization.json.JsonPrimitive;

/* compiled from: KotlinxJson.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LOU0/j;", "LOU0/e;", "LPU0/j;", "kotlinx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j extends e implements PU0.j {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final JsonPrimitive f12294b;

    public j(@k JsonPrimitive jsonPrimitive) {
        super(null);
        this.f12294b = jsonPrimitive;
    }

    @Override // PU0.j
    public final boolean b() {
        return this.f12294b.d();
    }

    @Override // PU0.j
    @k
    public final String d() {
        return this.f12294b.b();
    }

    @k
    public final String toString() {
        return this.f12294b.toString();
    }
}

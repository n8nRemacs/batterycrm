package kotlinx.serialization.json.internal;

import kotlin.Metadata;

/* compiled from: Composers.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/r;", "Lkotlinx/serialization/json/internal/q;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
@o0
/* loaded from: classes8.dex */
public final class r extends C43466q {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f413127c;

    public r(@Y61.k T t12, boolean z12) {
        super(t12);
        this.f413127c = z12;
    }

    @Override // kotlinx.serialization.json.internal.C43466q
    public final void j(@Y61.k String str) {
        if (this.f413127c) {
            super.j(str);
        } else {
            h(str);
        }
    }
}

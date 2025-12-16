package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlinx.serialization.json.AbstractC43443a;

/* compiled from: Composers.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/t;", "Lkotlinx/serialization/json/internal/q;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.serialization.json.internal.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43468t extends C43466q {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AbstractC43443a f413129c;

    /* renamed from: d, reason: collision with root package name */
    public int f413130d;

    public C43468t(@Y61.k T t12, @Y61.k AbstractC43443a abstractC43443a) {
        super(t12);
        this.f413129c = abstractC43443a;
    }

    @Override // kotlinx.serialization.json.internal.C43466q
    public final void a() {
        this.f413125b = true;
        this.f413130d++;
    }

    @Override // kotlinx.serialization.json.internal.C43466q
    public final void b() {
        this.f413125b = false;
        this.f413124a.c("\n");
        int i12 = this.f413130d;
        for (int i13 = 0; i13 < i12; i13++) {
            h(this.f413129c.f412955a.f412987g);
        }
    }

    @Override // kotlinx.serialization.json.internal.C43466q
    public final void c() {
        if (this.f413125b) {
            this.f413125b = false;
        } else {
            b();
        }
    }

    @Override // kotlinx.serialization.json.internal.C43466q
    public final void k() {
        e(' ');
    }

    @Override // kotlinx.serialization.json.internal.C43466q
    public final void l() {
        this.f413130d--;
    }
}

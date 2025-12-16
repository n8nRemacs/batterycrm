package androidx.compose.foundation.content.internal;

import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ReceiveContentConfiguration.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/content/internal/b;", "Landroidx/compose/foundation/content/internal/c;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final androidx.compose.foundation.content.f f26984a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f26985b = new a();

    /* compiled from: ReceiveContentConfiguration.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/content/internal/b$a", "Landroidx/compose/foundation/content/d;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements androidx.compose.foundation.content.d {

        /* renamed from: a, reason: collision with root package name */
        public int f26986a;

        public a() {
        }

        public final void a() {
            int i12 = this.f26986a + 1;
            this.f26986a = i12;
            b bVar = b.this;
            if (i12 == 1) {
                bVar.f26984a.getClass();
                throw null;
            }
            c cVarA = e.a(bVar.f26984a);
            androidx.compose.foundation.content.d dVarA = cVarA != null ? cVarA.a() : null;
            if (dVarA != null) {
                ((a) dVarA).a();
            }
        }

        public final void b() {
            int i12 = this.f26986a;
            int i13 = i12 - 1;
            if (i13 < 0) {
                i13 = 0;
            }
            this.f26986a = i13;
            b bVar = b.this;
            if (i13 == 0 && i12 > 0) {
                bVar.f26984a.getClass();
                throw null;
            }
            c cVarA = e.a(bVar.f26984a);
            androidx.compose.foundation.content.d dVarA = cVarA != null ? cVarA.a() : null;
            if (dVarA != null) {
                ((a) dVarA).b();
            }
        }

        public final androidx.compose.foundation.content.g c(androidx.compose.foundation.content.g gVar) {
            b.this.f26984a.getClass();
            throw null;
        }
    }

    public b(@k androidx.compose.foundation.content.f fVar) {
        this.f26984a = fVar;
    }

    @Override // androidx.compose.foundation.content.internal.c
    @k
    public final androidx.compose.foundation.content.d a() {
        return this.f26985b;
    }
}

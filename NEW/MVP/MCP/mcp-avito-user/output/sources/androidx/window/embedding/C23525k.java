package androidx.window.embedding;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: EmbeddingAspectRatio.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/window/embedding/k;", "", "a", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.window.embedding.k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C23525k {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f55246c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final C23525k f55247d = new C23525k("ALWAYS_ALLOW", 0.0f);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f55248a;

    /* renamed from: b, reason: collision with root package name */
    public final float f55249b;

    /* compiled from: EmbeddingAspectRatio.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/window/embedding/k$a;", "", "<init>", "()V", "Landroidx/window/embedding/k;", "ALWAYS_ALLOW", "Landroidx/window/embedding/k;", "ALWAYS_DISALLOW", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.window.embedding.k$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ C23525k(String str, float f12, C42822w c42822w) {
        this(str, f12);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C23525k)) {
            return false;
        }
        C23525k c23525k = (C23525k) obj;
        return this.f55249b == c23525k.f55249b && kotlin.jvm.internal.L.f(this.f55248a, c23525k.f55248a);
    }

    public final int hashCode() {
        return (Float.hashCode(this.f55249b) * 31) + this.f55248a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("EmbeddingAspectRatio("), this.f55248a, ')');
    }

    public C23525k(String str, float f12) {
        this.f55248a = str;
        this.f55249b = f12;
    }
}

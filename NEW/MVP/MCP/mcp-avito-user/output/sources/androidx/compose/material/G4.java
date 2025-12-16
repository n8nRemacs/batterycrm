package androidx.compose.material;

import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: SnackbarHost.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material/G4;", "T", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class G4<T> {

    /* renamed from: a, reason: collision with root package name */
    public final U8 f32661a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C22096n f32662b;

    public G4(U8 u82, @Y61.k C22096n c22096n) {
        this.f32661a = u82;
        this.f32662b = c22096n;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G4)) {
            return false;
        }
        G4 g42 = (G4) obj;
        return kotlin.jvm.internal.L.f(this.f32661a, g42.f32661a) && this.f32662b.equals(g42.f32662b);
    }

    public final int hashCode() {
        U8 u82 = this.f32661a;
        return this.f32662b.hashCode() + ((u82 == null ? 0 : u82.hashCode()) * 31);
    }

    @Y61.k
    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f32661a + ", transition=" + this.f32662b + ')';
    }
}

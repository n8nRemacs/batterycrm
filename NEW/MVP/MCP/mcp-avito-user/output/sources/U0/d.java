package u0;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.vector.C22293d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VectorResources.android.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lu0/d;", "", "<init>", "()V", "a", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final HashMap<b, WeakReference<a>> f439715a = new HashMap<>();

    /* compiled from: VectorResources.android.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lu0/d$a;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final C22293d f439716a;

        /* renamed from: b, reason: collision with root package name */
        public final int f439717b;

        public a(@k C22293d c22293d, int i12) {
            this.f439716a = c22293d;
            this.f439717b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f439716a, aVar.f439716a) && this.f439717b == aVar.f439717b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f439717b) + (this.f439716a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ImageVectorEntry(imageVector=");
            sb2.append(this.f439716a);
            sb2.append(", configFlags=");
            return r.t(sb2, this.f439717b, ')');
        }
    }

    /* compiled from: VectorResources.android.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lu0/d$b;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Resources.Theme f439718a;

        /* renamed from: b, reason: collision with root package name */
        public final int f439719b;

        public b(@k Resources.Theme theme, int i12) {
            this.f439718a = theme;
            this.f439719b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f439718a, bVar.f439718a) && this.f439719b == bVar.f439719b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f439719b) + (this.f439718a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Key(theme=");
            sb2.append(this.f439718a);
            sb2.append(", id=");
            return r.t(sb2, this.f439719b, ')');
        }
    }
}

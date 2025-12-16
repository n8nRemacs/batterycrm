package Oa1;

import java.util.ArrayList;

/* renamed from: Oa1.y, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC14665y {

    /* renamed from: Oa1.y$a */
    public static final class a extends AbstractC14665y {

        /* renamed from: a, reason: collision with root package name */
        public static final a f12398a = new a();
    }

    /* renamed from: Oa1.y$b */
    public static final class b extends AbstractC14665y {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f12399a;

        public b(ArrayList arrayList) {
            this.f12399a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.L.f(this.f12399a, ((b) obj).f12399a);
        }

        public final int hashCode() {
            return this.f12399a.hashCode();
        }

        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("Sent(values="), this.f12399a, ')');
        }
    }
}

package androidx.compose.foundation.text.input;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TextFieldCharSequence.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0081@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/input/s;", "", "a", "value", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f31524b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f31525c = 1;

    /* renamed from: a, reason: collision with root package name */
    public final int f31526a;

    /* compiled from: TextFieldCharSequence.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/input/s$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    private /* synthetic */ s(int i12) {
        this.f31526a = i12;
    }

    public static final /* synthetic */ s a(int i12) {
        return new s(i12);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f31526a == ((s) obj).f31526a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31526a);
    }

    public final String toString() {
        return androidx.appcompat.app.r.t(new StringBuilder("TextHighlightType(value="), this.f31526a, ')');
    }
}

package androidx.compose.ui.autofill;

import kotlin.Metadata;

/* compiled from: ContentDataType.android.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0083@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/autofill/i;", "Landroidx/compose/ui/autofill/t;", "androidAutofillType", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class i implements t {

    /* renamed from: b, reason: collision with root package name */
    public final int f38886b;

    private /* synthetic */ i(int i12) {
        this.f38886b = i12;
    }

    public static final /* synthetic */ i a(int i12) {
        return new i(i12);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f38886b == ((i) obj).f38886b;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38886b);
    }

    public final String toString() {
        return androidx.appcompat.app.r.t(new StringBuilder("AndroidContentDataType(androidAutofillType="), this.f38886b, ')');
    }
}

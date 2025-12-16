package androidx.core.view.accessibility;

import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.app.slice.SliceSpec;
import android.net.Uri;
import android.text.PrecomputedText;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d {
    public static /* synthetic */ Slice.Builder b(Slice.Builder builder) {
        return new Slice.Builder(builder);
    }

    public static /* synthetic */ Slice.Builder f(Uri uri, SliceSpec sliceSpec) {
        return new Slice.Builder(uri, sliceSpec);
    }

    public static /* bridge */ /* synthetic */ SliceItem h(Object obj) {
        return (SliceItem) obj;
    }

    public static /* synthetic */ SliceSpec i() {
        return new SliceSpec("Action", 0);
    }

    public static /* synthetic */ void q() {
    }

    public static /* bridge */ /* synthetic */ boolean v(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }

    public static /* synthetic */ SliceSpec w() {
        return new SliceSpec("AuthenticationAction", 0);
    }

    public static /* synthetic */ SliceSpec z() {
        return new SliceSpec("RemoteEntry", 1);
    }
}

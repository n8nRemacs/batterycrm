package androidx.media3.exoplayer.trackselection;

import android.os.Bundle;
import androidx.media3.common.InterfaceC23096j;
import androidx.media3.common.util.C23110a;
import androidx.media3.exoplayer.trackselection.g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements InterfaceC23096j.a {
    @Override // androidx.media3.common.InterfaceC23096j.a
    public final InterfaceC23096j fromBundle(Bundle bundle) {
        int i12 = bundle.getInt(g.f.f49987e, -1);
        int[] intArray = bundle.getIntArray(g.f.f49988f);
        int i13 = bundle.getInt(g.f.f49989g, -1);
        C23110a.b(i12 >= 0 && i13 >= 0);
        intArray.getClass();
        return new g.f(i12, i13, intArray);
    }
}

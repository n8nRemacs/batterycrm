package androidx.media3.exoplayer.source;

import android.os.Bundle;
import androidx.media3.common.InterfaceC23096j;
import androidx.media3.common.util.C23114e;
import androidx.media3.common.util.InterfaceC23119j;
import androidx.media3.exoplayer.source.O;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class N implements InterfaceC23119j, InterfaceC23096j.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f49610b;

    public /* synthetic */ N(int i12) {
        this.f49610b = i12;
    }

    @Override // androidx.media3.common.util.InterfaceC23119j
    public void accept(Object obj) {
        switch (this.f49610b) {
            case 0:
                ((O.c) obj).f49645b.release();
                break;
        }
    }

    @Override // androidx.media3.common.InterfaceC23096j.a
    public InterfaceC23096j fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Y.f49706f);
        return parcelableArrayList == null ? new Y(new androidx.media3.common.Q[0]) : new Y((androidx.media3.common.Q[]) C23114e.a(androidx.media3.common.Q.f47438i, parcelableArrayList).toArray(new androidx.media3.common.Q[0]));
    }

    private final void a(Object obj) {
    }
}

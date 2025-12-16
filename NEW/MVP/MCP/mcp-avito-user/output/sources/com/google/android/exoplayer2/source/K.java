package com.google.android.exoplayer2.source;

import android.os.Bundle;
import com.google.android.exoplayer2.InterfaceC36525h;
import com.google.android.exoplayer2.source.L;
import com.google.android.exoplayer2.util.C36588d;
import com.google.android.exoplayer2.util.InterfaceC36593i;
import com.google.common.collect.AbstractC37401r1;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class K implements InterfaceC36593i, InterfaceC36525h.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f346035b;

    @Override // com.google.android.exoplayer2.util.InterfaceC36593i
    public void accept(Object obj) {
        switch (this.f346035b) {
            case 0:
                ((L.c) obj).f346073b.release();
                break;
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC36525h.a
    public InterfaceC36525h fromBundle(Bundle bundle) {
        switch (this.f346035b) {
            case 2:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
                return new V(bundle.getString(Integer.toString(1, 36), ""), (com.google.android.exoplayer2.I[]) (parcelableArrayList == null ? AbstractC37401r1.C() : C36588d.a(com.google.android.exoplayer2.I.f343457I, parcelableArrayList)).toArray(new com.google.android.exoplayer2.I[0]));
            default:
                W w12 = W.f346153e;
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(Integer.toString(0, 36));
                return parcelableArrayList2 == null ? new W(new V[0]) : new W((V[]) C36588d.a(V.f346147g, parcelableArrayList2).toArray(new V[0]));
        }
    }

    private final void a(Object obj) {
    }
}

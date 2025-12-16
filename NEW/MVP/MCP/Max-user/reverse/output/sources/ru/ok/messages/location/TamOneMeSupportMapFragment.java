package ru.ok.messages.location;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.ydg;
import kotlin.Metadata;
import one.me.geo.view.OneMeSupportMapFragment;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/messages/location/TamOneMeSupportMapFragment;", "Lone/me/geo/view/OneMeSupportMapFragment;", "<init>", "()V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TamOneMeSupportMapFragment extends OneMeSupportMapFragment {
    public FrameLayout o1;
    public ydg p1;

    @Override // androidx.fragment.app.a
    public final View B() {
        return this.o1;
    }

    @Override // com.google.android.gms.maps.SupportMapFragment, androidx.fragment.app.a
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.o1 = (FrameLayout) super.O(layoutInflater, viewGroup, bundle);
        ydg ydgVar = new ydg(t());
        ydgVar.addView(this.o1);
        this.p1 = ydgVar;
        return ydgVar;
    }
}

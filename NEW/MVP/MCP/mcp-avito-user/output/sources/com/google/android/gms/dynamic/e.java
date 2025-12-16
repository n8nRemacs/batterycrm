package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import j.N;
import j.P;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
/* loaded from: classes6.dex */
public interface e {
    @RX0.a
    void c(@N Bundle bundle);

    @RX0.a
    void d(@P Bundle bundle);

    @RX0.a
    void e();

    @RX0.a
    void f(@N Activity activity, @N Bundle bundle, @P Bundle bundle2);

    @N
    @RX0.a
    View g(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, @P Bundle bundle);

    @RX0.a
    void onDestroyView();

    @RX0.a
    void onLowMemory();

    @RX0.a
    void onPause();

    @RX0.a
    void onResume();

    @RX0.a
    void onStart();

    @RX0.a
    void onStop();
}

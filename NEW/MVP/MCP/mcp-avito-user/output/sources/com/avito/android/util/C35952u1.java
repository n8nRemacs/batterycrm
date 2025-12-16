package com.avito.android.util;

import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.home.bottom_navigation.BottomNavigationFragment;
import kotlin.Metadata;

/* compiled from: Fragments.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\n\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/util/u1;", "Lkotlin/properties/h;", "", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.u1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35952u1 implements kotlin.properties.h<Object, Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomNavigationFragment f319088b;

    public C35952u1(BottomNavigationFragment bottomNavigationFragment) {
        this.f319088b = bottomNavigationFragment;
    }

    @Override // kotlin.properties.g
    public final Object getValue(Object obj, kotlin.reflect.n nVar) {
        Bundle arguments = this.f319088b.getArguments();
        if (arguments != null) {
            return arguments.getParcelable("bottom_navigation_controller_state");
        }
        return null;
    }

    @Override // kotlin.properties.h
    public final void setValue(Object obj, kotlin.reflect.n nVar, Object obj2) {
        Parcelable parcelable = (Parcelable) obj2;
        BottomNavigationFragment bottomNavigationFragment = this.f319088b;
        if (bottomNavigationFragment.getArguments() == null) {
            bottomNavigationFragment.setArguments(new Bundle());
        }
        bottomNavigationFragment.requireArguments().putParcelable("bottom_navigation_controller_state", parcelable);
    }
}

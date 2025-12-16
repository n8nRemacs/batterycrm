package com.avito.android.util;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;

/* compiled from: OpenParams.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/util/w3;", "Lkotlin/properties/h;", "", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.w3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35968w3 implements kotlin.properties.h<Object, Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f319116b;

    public C35968w3(Fragment fragment) {
        this.f319116b = fragment;
    }

    @Override // kotlin.properties.g
    public final Object getValue(Object obj, kotlin.reflect.n nVar) {
        OpenParams openParams = (OpenParams) this.f319116b.requireArguments().getParcelable("open_params");
        if (openParams != null) {
            return openParams;
        }
        throw new IllegalStateException("No open params provided for ".concat(C35968w3.class.getName()).toString());
    }

    @Override // kotlin.properties.h
    public final void setValue(Object obj, kotlin.reflect.n nVar, Object obj2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("open_params", (OpenParams) obj2);
        this.f319116b.setArguments(bundle);
    }
}

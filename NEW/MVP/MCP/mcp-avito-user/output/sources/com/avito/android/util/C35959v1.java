package com.avito.android.util;

import android.os.Bundle;
import com.avito.android.ui.fragments.BaseDialogFragment;
import kotlin.Metadata;

/* compiled from: Fragments.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\b\n\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/v1;", "Lkotlin/properties/h;", "", "", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.v1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35959v1 implements kotlin.properties.h<Object, String> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseDialogFragment f319096b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f319097c;

    public C35959v1(BaseDialogFragment baseDialogFragment, String str) {
        this.f319096b = baseDialogFragment;
        this.f319097c = str;
    }

    @Override // kotlin.properties.g
    public final Object getValue(Object obj, kotlin.reflect.n nVar) {
        Bundle arguments = this.f319096b.getArguments();
        if (arguments != null) {
            return arguments.getString(this.f319097c);
        }
        return null;
    }

    @Override // kotlin.properties.h
    public final void setValue(Object obj, kotlin.reflect.n nVar, String str) {
        throw null;
    }
}

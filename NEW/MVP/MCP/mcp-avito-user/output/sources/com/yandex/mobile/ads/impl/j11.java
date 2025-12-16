package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes8.dex */
public final class j11<T extends View> {
    @j.P
    public static View a(@j.N Context context, @j.N Class cls, @j.I int i12, @j.P ViewGroup viewGroup) {
        try {
            return (View) cls.cast(LayoutInflater.from(context).inflate(i12, viewGroup, false));
        } catch (Exception unused) {
            return null;
        }
    }
}

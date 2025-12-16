package com.avito.security;

import com.avito.android.beduin.common.component.input.BeduinInputModel;

/* loaded from: classes5.dex */
class j1 extends i1 {
    public static int a(double d12) {
        if (Double.isNaN(d12)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d12 > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return d12 < ((double) BeduinInputModel.MIN_TEXT_VERSION) ? BeduinInputModel.MIN_TEXT_VERSION : (int) Math.round(d12);
    }
}

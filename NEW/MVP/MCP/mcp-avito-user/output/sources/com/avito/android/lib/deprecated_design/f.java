package com.avito.android.lib.deprecated_design;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.ContextThemeWrapper;
import com.avito.android.R;
import j.f0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Themes.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_deprecated-components"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f {
    @k
    @InterfaceC42830m
    public static final Context a(@k Context context, @l String str) {
        return str != null ? new ContextThemeWrapper(context, b(R.style.Theme_DesignSystem_Legacy, str)) : context;
    }

    @f0
    public static final int b(@f0 int i12, @l String str) {
        if (str == null) {
            return i12;
        }
        switch (str.hashCode()) {
            case -1906561885:
                if (!str.equals("avitoRe23")) {
                    return i12;
                }
                break;
            case -182907729:
                return !str.equals("avitoLookAndFeel") ? i12 : R.style.Theme_DesignSystem_LookAndFeel;
            case 3494836:
                if (!str.equals("re23")) {
                    return i12;
                }
                break;
            case 1574915320:
                return !str.equals("avitoLegacy") ? i12 : R.style.Theme_DesignSystem_Material;
            default:
                return i12;
        }
        return R.style.Theme_DesignSystem_Re23;
    }
}

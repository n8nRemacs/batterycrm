package com.avito.android.mnz_common.extensions;

import Y61.k;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.avito.android.ui.fragments.BaseFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FragmentExtensions.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mnz-common_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d {
    public static final boolean a(@k BaseFragment baseFragment, @k String str) {
        Bundle arguments = baseFragment.getArguments();
        if (arguments != null) {
            Boolean boolValueOf = Boolean.valueOf(arguments.getBoolean(str));
            Bundle arguments2 = baseFragment.getArguments();
            if (arguments2 == null || !arguments2.containsKey(str)) {
                boolValueOf = null;
            }
            if (boolValueOf != null) {
                return boolValueOf.booleanValue();
            }
        }
        throw new IllegalArgumentException(str.concat(" - param must be not null"));
    }

    public static final long b(@k Fragment fragment, @k String str) {
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            Long lValueOf = Long.valueOf(arguments.getLong(str));
            Bundle arguments2 = fragment.getArguments();
            if (arguments2 == null || !arguments2.containsKey(str)) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                return lValueOf.longValue();
            }
        }
        throw new IllegalArgumentException(str.concat(" - param must be not null"));
    }

    @k
    public static final String c(@k Fragment fragment, @k String str) {
        Bundle arguments = fragment.getArguments();
        String string = arguments != null ? arguments.getString(str) : null;
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException(str.concat(" - param must be not null"));
    }
}

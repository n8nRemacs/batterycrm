package com.avito.android.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.Toast;
import com.avito.android.util.InterfaceC35791f4;
import kotlin.Metadata;

/* compiled from: Toasts.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"proxy-toast_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class L5 {
    @X41.j
    @Y61.k
    @SuppressLint({"ShowToast"})
    public static final Toast a(@Y61.k Context context, @j.e0 int i12, int i13) {
        Toast toastMakeText = Toast.makeText(context, i12, i13);
        InterfaceC35791f4.f318869a.getClass();
        InterfaceC35791f4.a.f318871b.getClass();
        toastMakeText.show();
        return toastMakeText;
    }

    @X41.j
    @Y61.k
    @SuppressLint({"ShowToast"})
    public static final Toast b(@Y61.k Context context, @Y61.k CharSequence charSequence, int i12) {
        Toast toastMakeText = Toast.makeText(context, charSequence, i12);
        InterfaceC35791f4.f318869a.getClass();
        InterfaceC35791f4.a.f318871b.getClass();
        toastMakeText.show();
        return toastMakeText;
    }
}

package com.avito.android.validation;

import kotlin.Metadata;

/* compiled from: ItemViewWithError.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/validation/k;", "", "_avito_validation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.validation.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC36016k {

    /* compiled from: ItemViewWithError.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.validation.k$a */
    public static final class a {
        public static boolean a(@Y61.l CharSequence charSequence) {
            return (charSequence == null || charSequence.length() == 0 || String.valueOf(charSequence).equals("Required field is empty")) ? false : true;
        }
    }
}

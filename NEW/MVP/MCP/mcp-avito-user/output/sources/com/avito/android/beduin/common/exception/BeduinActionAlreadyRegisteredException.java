package com.avito.android.beduin.common.exception;

import AK.c;
import Y61.k;
import kotlin.Metadata;

/* compiled from: BeduinActionAlreadyRegisteredException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/exception/BeduinActionAlreadyRegisteredException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinActionAlreadyRegisteredException extends Exception {
    public BeduinActionAlreadyRegisteredException(@k String str) {
        super(c.k("Action with type ", str, " has been registered before"));
    }
}

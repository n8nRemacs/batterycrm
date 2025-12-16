package com.avito.beduin.v2.handler.flow.exception;

import AK.c;
import Y61.k;
import kotlin.Metadata;

/* compiled from: UnregisteredInteractionHandlerException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/handler/flow/exception/UnregisteredInteractionHandlerException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UnregisteredInteractionHandlerException extends RuntimeException {
    public UnregisteredInteractionHandlerException(@k String str) {
        super(c.k("InteractionHandler for \"", str, "\" hasn't been registered"));
    }
}

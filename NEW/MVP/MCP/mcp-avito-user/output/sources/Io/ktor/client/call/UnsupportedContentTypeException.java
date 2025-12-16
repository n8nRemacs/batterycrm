package io.ktor.client.call;

import Y61.k;
import io.ktor.http.content.p;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;

/* compiled from: utils.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/client/call/UnsupportedContentTypeException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UnsupportedContentTypeException extends IllegalStateException {
    public UnsupportedContentTypeException(@k p pVar) {
        StringBuilder sb2 = new StringBuilder("Failed to write body: ");
        super(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, pVar.getClass(), sb2));
    }
}

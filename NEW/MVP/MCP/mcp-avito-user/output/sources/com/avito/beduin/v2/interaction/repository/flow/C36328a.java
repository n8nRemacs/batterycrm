package com.avito.beduin.v2.interaction.repository.flow;

import com.avito.beduin.v2.engine.C36272i;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: ArgsFormatterUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"utils_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.interaction.repository.flow.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36328a {
    @Y61.k
    public static final com.avito.beduin.v2.engine.field.entity.A a(@Y61.l com.avito.beduin.v2.engine.field.d dVar) {
        if (dVar == null) {
            dVar = com.avito.beduin.v2.engine.field.entity.f.f336800b;
        }
        return new com.avito.beduin.v2.engine.field.entity.A(new Q("value", dVar));
    }

    @Y61.k
    public static final com.avito.beduin.v2.engine.field.entity.A b(@Y61.k Throwable th2, @Y61.k C36272i c36272i) {
        com.avito.beduin.v2.engine.field.entity.A a12;
        if (th2 instanceof CancellationException) {
            a12 = new com.avito.beduin.v2.engine.field.entity.A(new Q("cancelled", c36272i.f(true)));
        } else {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            a12 = new com.avito.beduin.v2.engine.field.entity.A(new Q("message", c36272i.e(message)));
        }
        return new com.avito.beduin.v2.engine.field.entity.A(new Q("error", a12));
    }
}

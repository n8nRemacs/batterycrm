package com.avito.beduin.v2.interaction.flow.keyboard;

import Y61.k;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.engine.field.m;
import kotlin.Metadata;

/* compiled from: HideKeyboardInteractionFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/flow/keyboard/b;", "LdU0/c;", "<init>", "()V", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends dU0.c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final b f337432b = new b();

    public b() {
        super("HideKeyboard");
    }

    @Override // dU0.c
    @k
    public final dU0.b b(@k z zVar, @k m mVar) throws BeduinPropertyException {
        Boolean boolO = mVar.o(zVar, "clearFocus");
        return new a(boolO != null ? boolO.booleanValue() : true);
    }
}

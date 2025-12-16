package ru.ok.tamtam.api;

import defpackage.ho7;
import defpackage.pzf;
import defpackage.xhb;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/tamtam/api/UnknownOpcodeException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "tamtam-java-sdk"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UnknownOpcodeException extends IllegalStateException {
    public final pzf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnknownOpcodeException(short s) {
        super(ho7.i("Unknown opcode ", "0x".concat(Integer.toHexString(s & 65535)), "!"));
        xhb.c.getClass();
        this.a = new pzf("unknown.opcode", getMessage(), null);
    }
}

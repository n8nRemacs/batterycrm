package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.StateSerializer;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.q9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39072q9 implements StateSerializer {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final StateSerializer f381450a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C39228wm f381451b;

    public C39072q9(@j.N StateSerializer stateSerializer, @j.N C39228wm c39228wm) {
        this.f381450a = stateSerializer;
        this.f381451b = c39228wm;
    }

    @Override // com.yandex.metrica.core.api.StateSerializer
    @j.N
    public Object defaultValue() {
        return this.f381450a.defaultValue();
    }

    @Override // com.yandex.metrica.core.api.StateSerializer
    @j.N
    public byte[] toByteArray(@j.N Object obj) {
        try {
            return this.f381451b.a(this.f381450a.toByteArray(obj));
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    @Override // com.yandex.metrica.core.api.StateSerializer
    @j.N
    public Object toState(@j.N byte[] bArr) throws IOException {
        try {
            C39228wm c39228wm = this.f381451b;
            c39228wm.getClass();
            return this.f381450a.toState(c39228wm.a(bArr, 0, bArr.length));
        } catch (Throwable th2) {
            throw new IOException(th2);
        }
    }
}

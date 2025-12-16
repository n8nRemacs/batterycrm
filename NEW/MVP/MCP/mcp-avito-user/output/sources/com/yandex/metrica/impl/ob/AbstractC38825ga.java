package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.core.api.ProtobufStateStorage;

/* renamed from: com.yandex.metrica.impl.ob.ga, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38825ga<T> implements InterfaceC38800fa<T> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC38800fa
    public ProtobufStateStorage a(@j.N Context context) {
        return a(context, c(context));
    }

    @j.N
    public abstract ProtobufStateStorage a(@j.N Context context, @j.N R7 r72);

    @Override // com.yandex.metrica.impl.ob.InterfaceC38800fa
    public ProtobufStateStorage b(@j.N Context context) {
        return a(context, d(context));
    }

    @j.N
    public abstract R7 c(@j.N Context context);

    @j.N
    public abstract R7 d(@j.N Context context);
}

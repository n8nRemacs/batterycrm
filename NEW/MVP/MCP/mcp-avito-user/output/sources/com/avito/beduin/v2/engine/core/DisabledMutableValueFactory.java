package com.avito.beduin.v2.engine.core;

import com.avito.beduin.v2.engine.InterfaceC36274k;
import com.avito.beduin.v2.engine.core.u;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MutableValue.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/core/DisabledMutableValueFactory;", "", "Lcom/avito/beduin/v2/engine/core/u$a;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DisabledMutableValueFactory implements u.a {

    /* renamed from: b, reason: collision with root package name */
    public static final DisabledMutableValueFactory f336590b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ DisabledMutableValueFactory[] f336591c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f336592d;

    static {
        DisabledMutableValueFactory disabledMutableValueFactory = new DisabledMutableValueFactory();
        f336590b = disabledMutableValueFactory;
        DisabledMutableValueFactory[] disabledMutableValueFactoryArr = {disabledMutableValueFactory};
        f336591c = disabledMutableValueFactoryArr;
        f336592d = kotlin.enums.c.a(disabledMutableValueFactoryArr);
    }

    public static DisabledMutableValueFactory valueOf(String str) {
        return (DisabledMutableValueFactory) Enum.valueOf(DisabledMutableValueFactory.class, str);
    }

    public static DisabledMutableValueFactory[] values() {
        return (DisabledMutableValueFactory[]) f336591c.clone();
    }

    @Override // com.avito.beduin.v2.engine.core.u.a
    @Y61.k
    public final <T> u<T> a(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str) {
        throw new IllegalStateException("Prohibited to create mutable fields in reusable hierarchy. Disable 'layout_recycle' for the item in the lazy-container");
    }
}

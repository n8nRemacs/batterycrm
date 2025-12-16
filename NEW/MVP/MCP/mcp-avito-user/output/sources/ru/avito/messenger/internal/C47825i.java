package ru.avito.messenger.internal;

import k91.C42552j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import org.funktionale.option.a;

/* compiled from: MessengerClientImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/funktionale/option/a;", "Lk91/j;", "userSession", "", "apply", "(Lorg/funktionale/option/a;)Lorg/funktionale/option/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: ru.avito.messenger.internal.i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C47825i<T, R> implements l41.o {
    static {
        new C47825i();
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        org.funktionale.option.a aVar = (org.funktionale.option.a) obj;
        return aVar.b() ? a.b.f420401b : new a.c(((C42552j) aVar.a()).getUserId());
    }
}

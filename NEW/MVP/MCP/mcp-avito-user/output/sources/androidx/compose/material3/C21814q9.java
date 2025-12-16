package androidx.compose.material3;

import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: MappedInteractionSource.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/material3/q9;", "Landroidx/compose/foundation/interaction/k;", "underlyingInteractionSource", "Ll0/g;", "delta", "<init>", "(Landroidx/compose/foundation/interaction/k;JLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.q9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21814q9 implements androidx.compose.foundation.interaction.k {

    /* renamed from: a, reason: collision with root package name */
    public final long f37173a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f37174b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C21791p9 f37175c;

    public C21814q9(androidx.compose.foundation.interaction.k kVar, long j12, C42822w c42822w) {
        this.f37173a = j12;
        this.f37175c = new C21791p9(kVar.c(), this);
    }

    @Override // androidx.compose.foundation.interaction.k
    @Y61.k
    public final InterfaceC43160i<androidx.compose.foundation.interaction.j> c() {
        return this.f37175c;
    }
}

package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: SlotTable.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/L2;", "Landroidx/compose/runtime/tooling/a;", "", "Landroidx/compose/runtime/tooling/c;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class L2 implements androidx.compose.runtime.tooling.a, Iterable<androidx.compose.runtime.tooling.c>, Z41.a {

    /* renamed from: c, reason: collision with root package name */
    public int f38013c;

    /* renamed from: e, reason: collision with root package name */
    public int f38015e;

    /* renamed from: f, reason: collision with root package name */
    public int f38016f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Object f38017g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f38018h;

    /* renamed from: i, reason: collision with root package name */
    public int f38019i;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public HashMap<C22068g, E0> f38021k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public androidx.collection.A0<androidx.collection.B0> f38022l;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public int[] f38012b = new int[0];

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public Object[] f38014d = new Object[0];

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public ArrayList<C22068g> f38020j = new ArrayList<>();

    public final int a(@Y61.k C22068g c22068g) {
        if (this.f38018h) {
            G.c("Use active SlotWriter to determine anchor location instead");
        }
        if (!c22068g.a()) {
            P1.a("Anchor refers to a group that was removed");
        }
        return c22068g.f38401a;
    }

    public final void b() {
        this.f38021k = new HashMap<>();
    }

    @Y61.k
    public final K2 d() {
        if (this.f38018h) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f38016f++;
        return new K2(this);
    }

    @Y61.k
    public final O2 e() {
        if (this.f38018h) {
            G.c("Cannot start a writer when another writer is pending");
        }
        if (this.f38016f > 0) {
            G.c("Cannot start a writer when a reader is pending");
        }
        this.f38018h = true;
        this.f38019i++;
        return new O2(this);
    }

    public final boolean g(@Y61.k C22068g c22068g) {
        int iF2;
        return c22068g.a() && (iF2 = N2.f(this.f38020j, c22068g.f38401a, this.f38013c)) >= 0 && kotlin.jvm.internal.L.f(this.f38020j.get(iF2), c22068g);
    }

    @Override // java.lang.Iterable
    @Y61.k
    public final Iterator<androidx.compose.runtime.tooling.c> iterator() {
        return new C0(this, 0, this.f38013c);
    }
}

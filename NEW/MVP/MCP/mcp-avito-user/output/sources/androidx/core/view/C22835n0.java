package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: Sequences.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlin/sequences/t", "Lkotlin/sequences/m;", "kotlin-stdlib"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.core.view.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22835n0 implements InterfaceC43030m<View> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f45083a;

    public C22835n0(ViewGroup viewGroup) {
        this.f45083a = viewGroup;
    }

    @Override // kotlin.sequences.InterfaceC43030m
    @Y61.k
    public final Iterator<View> iterator() {
        return new Z(new C22829k0(this.f45083a).iterator(), C22831l0.f45079l);
    }
}

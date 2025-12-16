package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.C20712c0;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.layout.I0;
import kotlin.Metadata;

/* compiled from: LazyLayoutPinnableItem.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/layout/X;", "Landroidx/compose/ui/layout/I0;", "Landroidx/compose/ui/layout/I0$a;", "Landroidx/compose/foundation/lazy/layout/c0$a;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class X implements androidx.compose.ui.layout.I0, I0.a, C20712c0.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Object f29370a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C20712c0 f29371b;

    /* renamed from: d, reason: collision with root package name */
    public int f29373d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public I0.a f29374e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f29375f;

    /* renamed from: c, reason: collision with root package name */
    public int f29372c = -1;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f29376g = C22126m3.g(null);

    public X(@Y61.l Object obj, @Y61.k C20712c0 c20712c0) {
        this.f29370a = obj;
        this.f29371b = c20712c0;
    }

    @Override // androidx.compose.ui.layout.I0
    @Y61.k
    public final I0.a a() {
        if (this.f29375f) {
            androidx.compose.foundation.internal.e.c("Pin should not be called on an already disposed item ");
        }
        if (this.f29373d == 0) {
            this.f29371b.f29399b.add(this);
            androidx.compose.ui.layout.I0 i02 = (androidx.compose.ui.layout.I0) ((C22082i3) this.f29376g).getValue();
            this.f29374e = i02 != null ? i02.a() : null;
        }
        this.f29373d++;
        return this;
    }

    @Override // androidx.compose.foundation.lazy.layout.C20712c0.a
    /* renamed from: getIndex, reason: from getter */
    public final int getF29372c() {
        return this.f29372c;
    }

    @Override // androidx.compose.foundation.lazy.layout.C20712c0.a
    @Y61.l
    /* renamed from: getKey, reason: from getter */
    public final Object getF29370a() {
        return this.f29370a;
    }

    @Override // androidx.compose.ui.layout.I0.a
    public final void release() {
        if (this.f29375f) {
            return;
        }
        if (this.f29373d <= 0) {
            androidx.compose.foundation.internal.e.c("Release should only be called once");
        }
        int i12 = this.f29373d - 1;
        this.f29373d = i12;
        if (i12 == 0) {
            this.f29371b.f29399b.remove(this);
            I0.a aVar = this.f29374e;
            if (aVar != null) {
                aVar.release();
            }
            this.f29374e = null;
        }
    }
}

package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: ViewGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/core/view/m0;", "", "Landroid/view/View;", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.core.view.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22833m0 implements Iterator<View>, Z41.d {

    /* renamed from: b, reason: collision with root package name */
    public int f45081b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f45082c;

    public C22833m0(ViewGroup viewGroup) {
        this.f45082c = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f45081b < this.f45082c.getChildCount();
    }

    @Override // java.util.Iterator
    public final View next() {
        int i12 = this.f45081b;
        this.f45081b = i12 + 1;
        View childAt = this.f45082c.getChildAt(i12);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i12 = this.f45081b - 1;
        this.f45081b = i12;
        this.f45082c.removeViewAt(i12);
    }
}

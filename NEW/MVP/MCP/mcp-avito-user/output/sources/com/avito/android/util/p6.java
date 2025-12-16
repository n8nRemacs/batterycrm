package com.avito.android.util;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: ViewGroups.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/util/p6;", "", "Landroid/view/View;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class p6 implements Iterator<View>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    public int f318952b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f318953c;

    public p6(ViewGroup viewGroup) {
        this.f318953c = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f318953c.getChildCount() > this.f318952b;
    }

    @Override // java.util.Iterator
    public final View next() {
        boolean zHasNext = hasNext();
        ViewGroup viewGroup = this.f318953c;
        if (zHasNext) {
            View childAt = viewGroup.getChildAt(this.f318952b);
            this.f318952b++;
            return childAt;
        }
        throw new NoSuchElementException("childCount=" + viewGroup.getChildCount() + " but currentPosition=" + this.f318952b);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

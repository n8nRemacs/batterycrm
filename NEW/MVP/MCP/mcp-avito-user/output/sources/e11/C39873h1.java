package e11;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: e11.h1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39873h1 implements Iterator<View> {

    /* renamed from: b, reason: collision with root package name */
    public int f394607b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f394608c;

    public C39873h1(ViewGroup viewGroup) {
        this.f394608c = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f394607b < this.f394608c.getChildCount();
    }

    @Override // java.util.Iterator
    public final View next() {
        int i12 = this.f394607b;
        this.f394607b = i12 + 1;
        return this.f394608c.getChildAt(i12);
    }
}

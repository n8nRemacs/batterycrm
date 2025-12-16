package com.avito.android.extended_profile;

import android.graphics.Rect;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* compiled from: ExtendedProfileMviView.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Rect;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class L extends kotlin.jvm.internal.N implements Y41.a<Rect> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ WeakReference<A> f149343l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Rect f149344m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(WeakReference<A> weakReference, Rect rect) {
        super(0);
        this.f149343l = weakReference;
        this.f149344m = rect;
    }

    @Override // Y41.a
    public final Rect invoke() {
        FrameLayout frameLayout;
        A a12 = this.f149343l.get();
        if (a12 == null || (frameLayout = a12.f149217B) == null) {
            return null;
        }
        int i12 = -frameLayout.getTop();
        Rect rect = this.f149344m;
        rect.top = i12;
        return rect;
    }
}

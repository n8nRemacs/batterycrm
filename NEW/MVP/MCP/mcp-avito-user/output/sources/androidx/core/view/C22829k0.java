package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: ViewGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/core/view/k0;", "Lkotlin/sequences/m;", "Landroid/view/View;", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.core.view.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22829k0 implements InterfaceC43030m<View> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f45078a;

    public C22829k0(ViewGroup viewGroup) {
        this.f45078a = viewGroup;
    }

    @Override // kotlin.sequences.InterfaceC43030m
    public final Iterator<View> iterator() {
        return new C22833m0(this.f45078a);
    }
}

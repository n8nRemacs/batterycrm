package androidx.view;

import Y41.l;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Navigation.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "it", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.J0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C23296J0 extends N implements l<View, View> {

    /* renamed from: l, reason: collision with root package name */
    public static final C23296J0 f52801l = new C23296J0();

    public C23296J0() {
        super(1);
    }

    @Override // Y41.l
    public final View invoke(View view) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}

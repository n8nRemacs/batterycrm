package androidx.view;

import Y41.l;
import com.avito.android.R;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Navigation.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Landroidx/navigation/v;", "invoke", "(Landroid/view/View;)Landroidx/navigation/v;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.navigation.K0, reason: from Kotlin metadata */
/* loaded from: classes.dex */
final class View extends N implements l<android.view.View, C23397v> {

    /* renamed from: l, reason: collision with root package name */
    public static final View f52802l = new View();

    public View() {
        super(1);
    }

    @Override // Y41.l
    public final C23397v invoke(android.view.View view) {
        C23299L0.f52803a.getClass();
        Object tag = view.getTag(R.id.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            return (C23397v) ((WeakReference) tag).get();
        }
        if (tag instanceof C23397v) {
            return (C23397v) tag;
        }
        return null;
    }
}

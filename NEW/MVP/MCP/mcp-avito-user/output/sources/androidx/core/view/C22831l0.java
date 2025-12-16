package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: ViewGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Landroid/view/View;", "child", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.core.view.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22831l0 extends kotlin.jvm.internal.N implements Y41.l<View, Iterator<? extends View>> {

    /* renamed from: l, reason: collision with root package name */
    public static final C22831l0 f45079l = new C22831l0();

    public C22831l0() {
        super(1);
    }

    @Override // Y41.l
    public final Iterator<? extends View> invoke(View view) {
        View view2 = view;
        ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
        if (viewGroup != null) {
            return C22816e.a(viewGroup);
        }
        return null;
    }
}

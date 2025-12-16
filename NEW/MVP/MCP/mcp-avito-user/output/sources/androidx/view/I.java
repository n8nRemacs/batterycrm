package androidx.view;

import X41.i;
import Y41.l;
import Y61.k;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.sequences.C43033p;

/* compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@i
/* loaded from: classes.dex */
public final class I {

    /* compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "it", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends N implements l<android.view.View, android.view.View> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f21180l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final android.view.View invoke(android.view.View view) {
            Object parent = view.getParent();
            if (parent instanceof android.view.View) {
                return (android.view.View) parent;
            }
            return null;
        }
    }

    /* compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Landroidx/activity/C;", "invoke", "(Landroid/view/View;)Landroidx/activity/C;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.activity.I$b, reason: from Kotlin metadata */
    public static final class View extends N implements l<android.view.View, C> {

        /* renamed from: l, reason: collision with root package name */
        public static final View f21181l = new View();

        public View() {
            super(1);
        }

        @Override // Y41.l
        public final C invoke(android.view.View view) {
            Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
            if (tag instanceof C) {
                return (C) tag;
            }
            return null;
        }
    }

    @Y61.l
    @i
    public static final C a(@k android.view.View view) {
        return (C) C43033p.n(C43033p.y(C43033p.u(a.f21180l, view), View.f21181l));
    }
}

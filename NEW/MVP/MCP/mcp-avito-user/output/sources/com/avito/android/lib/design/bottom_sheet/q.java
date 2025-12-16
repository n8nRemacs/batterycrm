package com.avito.android.lib.design.bottom_sheet;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.transition.C23492c;
import j.InterfaceC42156l;
import j.InterfaceC42165v;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ModalBottomSheetView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/bottom_sheet/q;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f178563a = a.f178564a;

    /* compiled from: ModalBottomSheetView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/bottom_sheet/q$a;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f178564a = new a();
    }

    /* compiled from: ModalBottomSheetView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    void A(boolean z12);

    void B(@Y61.k View view);

    void C(boolean z12);

    void D(boolean z12);

    void E(@Y61.l Y41.a<G0> aVar);

    void F(@Y61.l CharSequence charSequence, @Y61.l CharSequence charSequence2, boolean z12, boolean z13);

    @Y61.k
    /* renamed from: T1 */
    FrameLayout getF178583j();

    void U(@Y61.l Y41.a<G0> aVar);

    void a();

    void b(int i12);

    void c(int i12);

    void d(@InterfaceC42156l int i12);

    void dismiss();

    void e(boolean z12, boolean z13);

    void f(@Y61.k View view);

    @Y61.k
    /* renamed from: g */
    FrameLayout getF178585l();

    void g7(int i12);

    @Y61.k
    /* renamed from: getTouchOutsideView */
    View getF178577d();

    void h(@InterfaceC42165v int i12);

    @Y61.l
    Map<Class<?>, Y41.p<View, MotionEvent, Boolean>> i();

    void j();

    void j2();

    void k();

    void l(boolean z12);

    void l2(boolean z12);

    void m(boolean z12);

    @Y61.k
    /* renamed from: n */
    FrameLayout getF178578e();

    void o(@Y61.k C23492c c23492c, @Y61.k Y41.a aVar);

    void p(@Y61.k ColorStateList colorStateList);

    void q(@Y61.l Y41.a<G0> aVar);

    void r(@Y61.k C23492c c23492c, @Y61.k Y41.a aVar);

    void s(@Y61.l Y41.p<? super View, ? super Integer, G0> pVar);

    void setDraggable(boolean z12);

    void show();

    @Y61.l
    Y41.a<G0> t();

    void u(@Y61.k Y41.a<Boolean> aVar);

    void v(@Y61.l Drawable drawable);

    void w(boolean z12);

    void x(boolean z12);

    void y(int i12);

    void z();
}

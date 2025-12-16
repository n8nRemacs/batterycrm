package androidx.compose.ui.focus;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.focus.C22220e;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Metadata;

/* compiled from: FocusInteropUtils.android.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.focus.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22228m {
    @Y61.k
    public static final l0.j a(@Y61.k View view, @Y61.k AndroidComposeView androidComposeView) {
        C22227l.f39180a.getClass();
        int[] iArr = C22227l.f39181b;
        view.getLocationInWindow(iArr);
        int i12 = iArr[0];
        int i13 = iArr[1];
        androidComposeView.getLocationInWindow(iArr);
        float f12 = i12 - iArr[0];
        float f13 = i13 - iArr[1];
        return new l0.j(f12, f13, view.getWidth() + f12, view.getHeight() + f13);
    }

    public static final boolean b(@Y61.k View view, @Y61.l Integer num, @Y61.l Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !view.hasFocus()) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (view instanceof AndroidComposeView) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    @Y61.l
    public static final Integer c(int i12) {
        C22220e.a aVar = C22220e.f39163b;
        aVar.getClass();
        if (C22220e.b(i12, C22220e.f39168g)) {
            return 33;
        }
        aVar.getClass();
        if (C22220e.b(i12, C22220e.f39169h)) {
            return 130;
        }
        aVar.getClass();
        if (C22220e.b(i12, C22220e.f39166e)) {
            return 17;
        }
        aVar.getClass();
        if (C22220e.b(i12, C22220e.f39167f)) {
            return 66;
        }
        aVar.getClass();
        if (C22220e.b(i12, C22220e.f39164c)) {
            return 2;
        }
        aVar.getClass();
        return C22220e.b(i12, C22220e.f39165d) ? 1 : null;
    }

    @Y61.l
    public static final C22220e d(int i12) {
        if (i12 == 1) {
            C22220e.f39163b.getClass();
            return C22220e.a(C22220e.f39165d);
        }
        if (i12 == 2) {
            C22220e.f39163b.getClass();
            return C22220e.a(C22220e.f39164c);
        }
        if (i12 == 17) {
            C22220e.f39163b.getClass();
            return C22220e.a(C22220e.f39166e);
        }
        if (i12 == 33) {
            C22220e.f39163b.getClass();
            return C22220e.a(C22220e.f39168g);
        }
        if (i12 == 66) {
            C22220e.f39163b.getClass();
            return C22220e.a(C22220e.f39167f);
        }
        if (i12 != 130) {
            return null;
        }
        C22220e.f39163b.getClass();
        return C22220e.a(C22220e.f39169h);
    }
}

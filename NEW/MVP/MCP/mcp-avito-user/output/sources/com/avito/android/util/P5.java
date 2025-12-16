package com.avito.android.util;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C22816e;
import androidx.core.view.C22829k0;
import androidx.core.view.C22833m0;
import com.avito.android.R;
import hw.InterfaceC41178c;
import j.InterfaceC42150f;
import j.InterfaceC42156l;
import java.util.Iterator;
import kotlin.Metadata;
import q50.InterfaceC47203a;
import ru.avito.component.appbar.ActionMenu;

/* compiled from: Toolbars.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_ui-components_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
@InterfaceC47203a
/* loaded from: classes5.dex */
public final class P5 {
    @InterfaceC41178c
    public static final void a(@Y61.k Toolbar toolbar, int i12, @Y61.k ActionMenu actionMenu) {
        MenuItem menuItemAdd = toolbar.getMenu().add(0, i12, 0, actionMenu.f430340b);
        menuItemAdd.setShowAsAction(actionMenu.f430341c);
        Integer num = actionMenu.f430342d;
        if (num != null) {
            menuItemAdd.setIcon(num.intValue());
            Integer num2 = actionMenu.f430343e;
            if (num2 != null) {
                C35766c3.b(menuItemAdd, toolbar.getContext(), num2.intValue());
                Integer num3 = actionMenu.f430344f;
                if (num3 != null) {
                    String string = toolbar.getContext().getString(num3.intValue());
                    if (menuItemAdd instanceof K0.b) {
                        ((K0.b) menuItemAdd).setContentDescription((CharSequence) string);
                    } else {
                        menuItemAdd.setContentDescription(string);
                    }
                }
            }
        }
    }

    @InterfaceC41178c
    public static final void b(@Y61.k Toolbar toolbar) {
        toolbar.setNavigationIcon(R.drawable.ic_back_24_black);
    }

    @InterfaceC41178c
    public static final void c(@Y61.k Toolbar toolbar, @InterfaceC42150f int i12) {
        Drawable drawableMutate;
        TypedArray typedArrayObtainStyledAttributes = toolbar.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.navigationIcon});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, R.drawable.ic_back_24_blue);
        typedArrayObtainStyledAttributes.recycle();
        if (i12 == 0) {
            toolbar.setNavigationIcon(resourceId);
            return;
        }
        Drawable drawable = toolbar.getContext().getDrawable(resourceId);
        if (drawable == null || (drawableMutate = drawable.mutate()) == null) {
            return;
        }
        drawableMutate.setTint(C35835l0.d(i12, toolbar.getContext()));
        toolbar.setNavigationIcon(drawableMutate);
    }

    @InterfaceC41178c
    public static final void d(@Y61.k Toolbar toolbar) {
        toolbar.setNavigationIcon(R.drawable.ic_close_24_black);
    }

    @InterfaceC41178c
    public static final void e(@Y61.k Toolbar toolbar, @InterfaceC42156l int i12) {
        Iterator<View> it = new C22829k0(toolbar).iterator();
        while (true) {
            C22833m0 c22833m0 = (C22833m0) it;
            if (!c22833m0.hasNext()) {
                return;
            }
            View view = (View) c22833m0.next();
            if (view instanceof ImageButton) {
                ((ImageButton) view).setBackground(V0.c(ColorStateList.valueOf(i12)));
            } else if (view instanceof ActionMenuView) {
                Iterator itA = C22816e.a((ViewGroup) view);
                while (true) {
                    C22833m0 c22833m02 = (C22833m0) itA;
                    if (c22833m02.hasNext()) {
                        ((View) c22833m02.next()).setBackground(V0.c(ColorStateList.valueOf(i12)));
                    }
                }
            }
        }
    }

    @InterfaceC41178c
    public static final void f(@Y61.k Toolbar toolbar, @InterfaceC42150f int i12) {
        Menu menu = toolbar.getMenu();
        if (menu == null) {
            return;
        }
        Context context = toolbar.getContext();
        int size = menu.size();
        if (size == 0) {
            return;
        }
        kotlin.ranges.k it = kotlin.ranges.s.r(0, size).iterator();
        while (it.f406910d) {
            C35766c3.b(menu.getItem(it.a()), context, i12);
        }
    }

    @InterfaceC41178c
    @Y61.k
    public static final io.reactivex.rxjava3.internal.operators.observable.C g(@Y61.k Toolbar toolbar) {
        return new io.reactivex.rxjava3.internal.operators.observable.C(new E1(toolbar, 4));
    }
}

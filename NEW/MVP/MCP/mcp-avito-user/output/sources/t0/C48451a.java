package t0;

import Y61.k;
import Y61.l;
import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.actionmodecallback.MenuItemOption;
import j.X;
import kotlin.G0;
import kotlin.Metadata;
import l0.j;

/* compiled from: FloatingTextActionModeCallback.android.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lt0/a;", "Landroid/view/ActionMode$Callback2;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X
/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48451a extends ActionMode.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C48453c f439009a;

    public C48451a(@k C48453c c48453c) {
        this.f439009a = c48453c;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(@l ActionMode actionMode, @l MenuItem menuItem) {
        C48453c c48453c = this.f439009a;
        c48453c.getClass();
        int itemId = menuItem.getItemId();
        MenuItemOption menuItemOption = MenuItemOption.f41381d;
        if (itemId == 0) {
            Y41.a<G0> aVar = c48453c.f439012c;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (itemId == 1) {
            Y41.a<G0> aVar2 = c48453c.f439013d;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (itemId == 2) {
            Y41.a<G0> aVar3 = c48453c.f439014e;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else if (itemId == 3) {
            Y41.a<G0> aVar4 = c48453c.f439015f;
            if (aVar4 != null) {
                aVar4.invoke();
            }
        } else {
            if (itemId != 4) {
                return false;
            }
            Y41.a<G0> aVar5 = c48453c.f439016g;
            if (aVar5 != null) {
                aVar5.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(@l ActionMode actionMode, @l Menu menu) {
        C48453c c48453c = this.f439009a;
        c48453c.getClass();
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (c48453c.f439012c != null) {
            C48453c.a(menu, MenuItemOption.f41381d);
        }
        if (c48453c.f439013d != null) {
            C48453c.a(menu, MenuItemOption.f41382e);
        }
        if (c48453c.f439014e != null) {
            C48453c.a(menu, MenuItemOption.f41383f);
        }
        if (c48453c.f439015f != null) {
            C48453c.a(menu, MenuItemOption.f41384g);
        }
        if (c48453c.f439016g == null) {
            return true;
        }
        C48453c.a(menu, MenuItemOption.f41385h);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(@l ActionMode actionMode) {
        Y41.a<G0> aVar = this.f439009a.f439010a;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(@l ActionMode actionMode, @l View view, @l Rect rect) {
        j jVar = this.f439009a.f439011b;
        if (rect != null) {
            rect.set((int) jVar.f413390a, (int) jVar.f413391b, (int) jVar.f413392c, (int) jVar.f413393d);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(@l ActionMode actionMode, @l Menu menu) {
        C48453c c48453c = this.f439009a;
        c48453c.getClass();
        if (actionMode == null || menu == null) {
            return false;
        }
        C48453c.b(menu, MenuItemOption.f41381d, c48453c.f439012c);
        C48453c.b(menu, MenuItemOption.f41382e, c48453c.f439013d);
        C48453c.b(menu, MenuItemOption.f41383f, c48453c.f439014e);
        C48453c.b(menu, MenuItemOption.f41384g, c48453c.f439015f);
        C48453c.b(menu, MenuItemOption.f41385h, c48453c.f439016g);
        return true;
    }
}

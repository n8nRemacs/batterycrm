package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;

/* loaded from: classes.dex */
public final class lr extends dtf implements sm6 {
    public final /* synthetic */ AppearanceSettingsMultiThemeScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr(Continuation continuation, AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen) {
        super(2, continuation);
        this.X = appearanceSettingsMultiThemeScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        lr lrVar = (lr) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        lrVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        lr lrVar = new lr(continuation, this.X);
        lrVar.o = obj;
        return lrVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object obj2;
        Object next;
        s5g n5gVar;
        g8j.b(obj);
        pr prVar = (pr) this.o;
        AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen = this.X;
        appearanceSettingsMultiThemeScreen.Y.E(prVar.a);
        TextView textView = (TextView) appearanceSettingsMultiThemeScreen.d.D(appearanceSettingsMultiThemeScreen, AppearanceSettingsMultiThemeScreen.Z[1]);
        Iterator it = prVar.a.iterator();
        while (true) {
            obj2 = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((f7g) next).a) {
                break;
            }
        }
        f7g f7gVar = (f7g) next;
        if (f7gVar == null) {
            n5gVar = s5g.b;
        } else {
            h5b h5bVar = f7gVar.c;
            n5gVar = h5bVar.equals(h5b.d) ? new n5g(lwa.r) : h5bVar.equals(h5b.e) ? new n5g(lwa.m) : h5bVar.equals(h5b.f) ? new n5g(lwa.n) : h5bVar.equals(h5b.g) ? new n5g(lwa.q) : h5bVar.equals(h5b.h) ? new n5g(lwa.l) : h5bVar.equals(h5b.i) ? new n5g(lwa.k) : h5bVar.equals(h5b.j) ? new n5g(lwa.o) : h5bVar.equals(h5b.k) ? new n5g(lwa.p) : new n5g(lwa.s);
        }
        textView.setText(n5gVar.b(appearanceSettingsMultiThemeScreen.getContext()));
        Iterator it2 = prVar.b.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((zq) next2).b.equals(Boolean.TRUE)) {
                obj2 = next2;
                break;
            }
        }
        zq zqVar = (zq) obj2;
        if (zqVar != null) {
            ((MaterialButtonToggleGroup) appearanceSettingsMultiThemeScreen.o.D(appearanceSettingsMultiThemeScreen, AppearanceSettingsMultiThemeScreen.Z[2])).b((int) zqVar.getItemId(), true);
        }
        Drawable drawable = prVar.c;
        if (drawable != null) {
            ((rt2) appearanceSettingsMultiThemeScreen.c.D(appearanceSettingsMultiThemeScreen, AppearanceSettingsMultiThemeScreen.Z[0])).setBackgroundPreview(drawable);
        }
        return qqg.a;
    }
}

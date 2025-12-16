package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.View;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.io.File;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class znd implements qp5, cff, v5, ge8, ikd, yci {
    public Object a;

    public /* synthetic */ znd(Object obj) {
        this.a = obj;
    }

    public static void b(Collection collection, String str) {
        if (l8g.c(str)) {
            return;
        }
        collection.add(new File(str));
    }

    @Override // defpackage.ge8
    public void a(boolean z) {
        ((k01) this.a).l(x71.Y, Boolean.valueOf(z));
    }

    @Override // defpackage.ikd
    public void accept(Object obj, Object obj2) {
        rf8 rf8Var = (rf8) this.a;
        y9j y9jVar = (y9j) ((yji) obj).o();
        wii wiiVar = new wii((n2g) obj2, 0);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        int i = xgi.a;
        parcelObtain.writeInt(1);
        rf8Var.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(wiiVar);
        parcelObtain.writeString(null);
        y9jVar.i(parcelObtain, 63);
    }

    @Override // defpackage.yci
    public Object d() {
        return new x8j(((qc4) ((hfd) this.a).b).a);
    }

    @Override // defpackage.cff
    public void e(fff fffVar) {
        ((zhf) this.a).e(fffVar);
    }

    @Override // defpackage.cff
    public void g(fff fffVar) {
        ((zhf) this.a).g(fffVar);
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new x0e((Context) ((Provider) this.a).get(), "com.google.android.datatransport.events", Integer.valueOf(x0e.d).intValue());
    }

    @Override // defpackage.v5
    public boolean h(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.a;
        if (!swipeDismissBehavior.x(view)) {
            return false;
        }
        WeakHashMap weakHashMap = hfh.a;
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.d;
        view.offsetLeftAndRight((!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    public znd(int i) {
        switch (i) {
            case 5:
                this.a = new SparseArray();
                break;
            case 6:
            default:
                this.a = (ExtraCroppingQuirk) rv4.a.e(ExtraCroppingQuirk.class);
                break;
            case 7:
                this.a = new LinkedHashMap();
                break;
        }
    }
}

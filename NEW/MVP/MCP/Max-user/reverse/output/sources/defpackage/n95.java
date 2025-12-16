package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.photoeditor.view.BrushWidthViewImpl;

/* loaded from: classes2.dex */
public final class n95 implements q95 {
    public final r95 a;
    public yub b;
    public i5i c;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f = -65536;
    public float g = 24.0f;
    public boolean h = false;

    public n95(r95 r95Var) {
        this.a = r95Var;
        r95Var.setListener(this);
    }

    public final l95 a() {
        Integer num;
        r95 r95Var = this.a;
        List<k95> layers = r95Var.getLayers();
        Rect bounds = r95Var.getBounds();
        boolean z = r95Var.x0;
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        Iterator<k95> it = layers.iterator();
        int i = 1;
        while (true) {
            g18 g18Var = null;
            if (!it.hasNext()) {
                break;
            }
            k95 next = it.next();
            if (next instanceof r45) {
                r45 r45Var = (r45) next;
                g18Var = new g18(i, r45Var.c.getColor(), r45Var.c.getStrokeWidth(), r45Var.a);
            }
            if (g18Var != null) {
                arrayList.add(g18Var);
                map.put(next, Integer.valueOf(i));
                i++;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            u9 u9Var = (u9) it2.next();
            dg3 dg3Var = (!(u9Var instanceof u9) || (num = (Integer) map.get(u9Var.a)) == null) ? null : new dg3(num.intValue());
            if (dg3Var != null) {
                arrayList2.add(dg3Var);
            }
        }
        return new l95(arrayList, arrayList2, bounds, z);
    }

    public final void b() {
        yub yubVar = this.b;
        if (yubVar != null) {
            boolean z = !this.e.isEmpty();
            ArrayList arrayList = this.d;
            boolean z2 = !arrayList.isEmpty();
            boolean z3 = !arrayList.isEmpty();
            boolean z4 = this.h;
            bvb bvbVar = yubVar.e;
            bvbVar.getClass();
            bvb bvbVar2 = new bvb(z, z2, z3, bvbVar.d, bvbVar.o, z4, bvbVar.Y);
            yubVar.e = bvbVar2;
            yubVar.a.a(bvbVar2);
        }
    }

    public final void c(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        r95 r95Var = this.a;
        if (action == 0) {
            motionEvent.getX();
            motionEvent.getY();
            List<k95> layers = r95Var.getLayers();
            for (int size = layers.size() - 1; size >= 0; size--) {
                layers.get(size);
            }
            r45 r45Var = new r45(this.f, this.g);
            i5i i5iVar = new i5i();
            i5iVar.b = new ArrayList();
            i5iVar.a = r45Var;
            this.c = i5iVar;
            ((ArrayList) i5iVar.b).add(new t45(motionEvent.getX(), motionEvent.getY()));
            r95Var.a.add(r45Var);
            r95Var.invalidate();
            yub yubVar = this.b;
            if (yubVar != null) {
                ((BrushWidthViewImpl) yubVar.a.s0).setVisibility(8);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            i5i i5iVar2 = this.c;
            if (i5iVar2 != null) {
                i5iVar2.m(motionEvent);
            }
            i5i i5iVar3 = this.c;
            if (i5iVar3 != null) {
                u9 u9VarG = i5iVar3.g();
                this.e.clear();
                this.d.add(u9VarG);
            }
            this.c = null;
            this.h = true;
            b();
        } else {
            i5i i5iVar4 = this.c;
            if (i5iVar4 != null) {
                i5iVar4.m(motionEvent);
            }
        }
        r95Var.invalidate();
    }
}

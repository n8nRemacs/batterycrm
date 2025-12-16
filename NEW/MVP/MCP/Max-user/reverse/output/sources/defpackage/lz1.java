package defpackage;

import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class lz1 implements dn6 {
    public final /* synthetic */ int a;

    public /* synthetic */ lz1(int i) {
        this.a = i;
    }

    @Override // defpackage.dn6
    public final Object apply(Object obj) {
        ArrayList arrayList = null;
        switch (this.a) {
            case 0:
                return Boolean.TRUE;
            case 1:
                return null;
            case 2:
                return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
            case 3:
                int i = yz1.g;
                return Boolean.FALSE;
            case 4:
                int i2 = a02.h;
                return Boolean.FALSE;
            case 5:
                return new x9c((w9c) obj);
            case 6:
                ce7 ce7Var = ee7.A;
                return null;
            case 7:
                le8 le8Var = (le8) obj;
                le8Var.g = false;
                le8Var.h = false;
                return le8Var;
            case 8:
                le8 le8Var2 = (le8) obj;
                le8Var2.e = false;
                return le8Var2;
            case 9:
                le8 le8Var3 = (le8) obj;
                le8Var3.g = true;
                le8Var3.h = true;
                return le8Var3;
            case 10:
                le8 le8Var4 = (le8) obj;
                le8Var4.e = true;
                return le8Var4;
            case 11:
                le8 le8Var5 = (le8) obj;
                le8Var5.e = false;
                le8Var5.g = false;
                le8Var5.h = false;
                return le8Var5;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                le8 le8Var6 = (le8) obj;
                le8Var6.g = false;
                le8Var6.h = false;
                le8Var6.e = false;
                return le8Var6;
            case 13:
                le8 le8Var7 = (le8) obj;
                le8Var7.e = false;
                le8Var7.g = false;
                le8Var7.h = false;
                return le8Var7;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                le8 le8Var8 = (le8) obj;
                le8Var8.a = true;
                le8Var8.c = true;
                le8Var8.b = false;
                return le8Var8;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return null;
            case 16:
                try {
                    return h3h.a(g3h.L0((bc0) obj), null);
                } catch (InvalidConfigException e) {
                    gri.j("VideoEncoderInfoImpl", "Unable to find a VideoEncoderInfoImpl", e);
                    return null;
                }
            default:
                List<q5i> list = (List) obj;
                if (list != null) {
                    arrayList = new ArrayList(we3.q(list, 10));
                    for (q5i q5iVar : list) {
                        ArrayList arrayList2 = q5iVar.g;
                        arrayList.add(new x4i(UUID.fromString(q5iVar.a), q5iVar.b, q5iVar.c, q5iVar.f, !arrayList2.isEmpty() ? (yd4) arrayList2.get(0) : yd4.c, q5iVar.d, q5iVar.e));
                    }
                }
                return arrayList;
        }
    }
}

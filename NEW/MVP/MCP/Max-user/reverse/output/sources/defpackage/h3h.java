package defpackage;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class h3h implements f3h {
    public final f3h a;
    public final Range b;
    public final Range c;
    public final HashSet d;

    public h3h(f3h f3hVar) {
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.a = f3hVar;
        int iH = f3hVar.H();
        this.b = Range.create(Integer.valueOf(iH), Integer.valueOf(((int) Math.ceil(4096.0d / iH)) * iH));
        int iU = f3hVar.U();
        this.c = Range.create(Integer.valueOf(iU), Integer.valueOf(((int) Math.ceil(2160.0d / iU)) * iU));
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.a.contains(Build.MODEL.toLowerCase(Locale.US)) ? Collections.singleton(new Size(1920, 1080)) : Collections.EMPTY_SET);
    }

    public static f3h a(f3h f3hVar, Size size) {
        if (!(f3hVar instanceof h3h)) {
            if (pv4.a.e(MediaCodecInfoReportIncorrectInfoQuirk.class) != null) {
                f3hVar = new h3h(f3hVar);
            } else if (size != null && !f3hVar.b(size.getWidth(), size.getHeight())) {
                gri.i("VideoEncoderInfoWrapper", "Detected that the device does not support a size " + size + " that should be valid in widths/heights = " + f3hVar.V() + "/" + f3hVar.Y());
                f3hVar = new h3h(f3hVar);
            }
        }
        if (size != null && (f3hVar instanceof h3h)) {
            ((h3h) f3hVar).d.add(size);
        }
        return f3hVar;
    }

    @Override // defpackage.f3h
    public final int H() {
        return this.a.H();
    }

    @Override // defpackage.f3h
    public final Range I() {
        return this.a.I();
    }

    @Override // defpackage.f3h
    public final boolean L() {
        return this.a.L();
    }

    @Override // defpackage.f3h
    public final Range Q(int i) {
        Integer numValueOf = Integer.valueOf(i);
        Range range = this.c;
        boolean zContains = range.contains((Range) numValueOf);
        f3h f3hVar = this.a;
        z5j.a("Not supported height: " + i + " which is not in " + range + " or can not be divided by alignment " + f3hVar.U(), zContains && i % f3hVar.U() == 0);
        return this.b;
    }

    @Override // defpackage.f3h
    public final Range T(int i) {
        Integer numValueOf = Integer.valueOf(i);
        Range range = this.b;
        boolean zContains = range.contains((Range) numValueOf);
        f3h f3hVar = this.a;
        z5j.a("Not supported width: " + i + " which is not in " + range + " or can not be divided by alignment " + f3hVar.H(), zContains && i % f3hVar.H() == 0);
        return this.c;
    }

    @Override // defpackage.f3h
    public final int U() {
        return this.a.U();
    }

    @Override // defpackage.f3h
    public final Range V() {
        return this.b;
    }

    @Override // defpackage.f3h
    public final boolean W(int i, int i2) {
        f3h f3hVar = this.a;
        if (f3hVar.W(i, i2)) {
            return true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getWidth() == i && size.getHeight() == i2) {
                return true;
            }
        }
        return this.b.contains((Range) Integer.valueOf(i)) && this.c.contains((Range) Integer.valueOf(i2)) && i % f3hVar.H() == 0 && i2 % f3hVar.U() == 0;
    }

    @Override // defpackage.f3h
    public final Range Y() {
        return this.c;
    }
}

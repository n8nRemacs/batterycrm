package defpackage;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class n00 implements es8, tm6, gu3 {
    public final /* synthetic */ p00 a;

    @Override // defpackage.gu3
    public void accept(Object obj) {
        Throwable th = (Throwable) obj;
        wqi.b("AttachPreviewDiskCache", "onError", th);
        ((y3b) this.a.a).a(th);
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        this.a.getClass();
        HashMap map = new HashMap();
        for (File file : (List) obj) {
            String name = file.getName();
            String str = !name.endsWith(".png") ? null : name.split("_")[1];
            if (!l8g.c(str)) {
                map.put(str, Uri.fromFile(file));
            }
        }
        return map;
    }

    @Override // defpackage.es8
    public void b(rr8 rr8Var) {
        iz5 iz5Var = (iz5) this.a.b;
        iz5Var.getClass();
        File fileG = iz5.g(iz5.b(iz5Var.c), "previewVideoCache");
        if (!pbj.b(fileG) && !rr8Var.e()) {
            rr8Var.b();
        }
        File[] fileArrListFiles = fileG.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            if (rr8Var.e()) {
                return;
            }
            rr8Var.b();
            return;
        }
        Arrays.sort(fileArrListFiles, new o00(0));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < fileArrListFiles.length && i < 200; i++) {
            arrayList.add(fileArrListFiles[i]);
        }
        if (rr8Var.e()) {
            return;
        }
        rr8Var.a(arrayList);
    }
}

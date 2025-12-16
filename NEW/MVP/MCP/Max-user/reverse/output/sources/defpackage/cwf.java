package defpackage;

import android.util.Log;
import java.io.File;

/* loaded from: classes.dex */
public final class cwf implements w74, mhd, rl3, ghg {
    @Override // defpackage.ghg
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // defpackage.rl3
    public Object j(v6d v6dVar) {
        return new tri((o1a) v6dVar.a(o1a.class));
    }

    @Override // defpackage.mhd
    public boolean q(UnsatisfiedLinkError unsatisfiedLinkError, h6f[] h6fVarArr) {
        String str = unsatisfiedLinkError instanceof g6f ? ((g6f) unsatisfiedLinkError).a : null;
        StringBuilder sb = new StringBuilder("Waiting on SoSources due to ");
        sb.append(unsatisfiedLinkError);
        sb.append(str == null ? "" : ", retrying for specific library ".concat(str));
        Log.e("SoLoader", sb.toString());
        for (h6f h6fVar : h6fVarArr) {
            if (h6fVar instanceof urg) {
                urg urgVar = (urg) h6fVar;
                Log.e("SoLoader", "Waiting on SoSource " + h6fVar.b());
                urgVar.getClass();
                File file = urgVar.a;
                try {
                    fwf.d(file, new File(file, "dso_lock")).close();
                } catch (Exception e) {
                    Log.e("fb-UnpackingSoSource", "Encountered exception during wait for unpacking trying to acquire file lock for " + urgVar.getClass().getName() + " (" + file + "): ", e);
                }
            }
        }
        return true;
    }
}

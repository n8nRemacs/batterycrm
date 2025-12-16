package androidx.media3.datasource;

import androidx.media3.common.util.J;
import j.P;
import java.io.IOException;

/* compiled from: DataSourceUtil.java */
@J
/* loaded from: classes.dex */
public final class n {
    public static void a(@P j jVar) {
        if (jVar != null) {
            try {
                jVar.close();
            } catch (IOException unused) {
            }
        }
    }
}

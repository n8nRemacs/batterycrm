package com.avito.android.db;

import com.avito.android.util.V2;
import java.io.File;
import kotlin.Metadata;

/* compiled from: DbHelper.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_persistence_core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g {
    public static final void a(File file) {
        try {
            file.delete();
        } catch (Exception unused) {
            V2.f318762a.e("Cannot delete file " + file.getName(), null);
        }
    }
}

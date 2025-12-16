package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;

/* loaded from: classes2.dex */
public final class ae implements d1e {
    public final Context b;
    public final vob c;
    public final c28 d;
    public final bwf e = new bwf(new i6(7, this));

    public ae(Context context, vob vobVar, c28 c28Var) {
        this.b = context;
        this.c = vobVar;
        this.d = c28Var;
    }

    @Override // defpackage.d1e
    public final Uri a(e1e e1eVar, String str) {
        String strI = e1eVar.i();
        uz9 uz9VarA = e1eVar.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        File file = new File(strI, "MAX");
        imb[] imbVarArr = {new imb("_display_name", str), new imb("mime_type", uz9VarA.a), new imb("date_added", Long.valueOf(jCurrentTimeMillis)), new imb("date_modified", Long.valueOf(jCurrentTimeMillis)), new imb("relative_path", file + File.separator)};
        ContentValues contentValues = new ContentValues(5);
        for (int i = 0; i < 5; i++) {
            imb imbVar = imbVarArr[i];
            String str2 = (String) imbVar.a;
            Object obj = imbVar.b;
            if (obj == null) {
                contentValues.putNull(str2);
            } else if (obj instanceof String) {
                contentValues.put(str2, (String) obj);
            } else if (obj instanceof Integer) {
                contentValues.put(str2, (Integer) obj);
            } else if (obj instanceof Long) {
                contentValues.put(str2, (Long) obj);
            } else if (obj instanceof Boolean) {
                contentValues.put(str2, (Boolean) obj);
            } else if (obj instanceof Float) {
                contentValues.put(str2, (Float) obj);
            } else if (obj instanceof Double) {
                contentValues.put(str2, (Double) obj);
            } else if (obj instanceof byte[]) {
                contentValues.put(str2, (byte[]) obj);
            } else if (obj instanceof Byte) {
                contentValues.put(str2, (Byte) obj);
            } else {
                if (!(obj instanceof Short)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str2 + '\"');
                }
                contentValues.put(str2, (Short) obj);
            }
        }
        Integer numK = e1eVar.k();
        if (numK != null) {
            contentValues.put("_size", Integer.valueOf(numK.intValue()));
        }
        Integer width = e1eVar.getWidth();
        if (width != null) {
            contentValues.put("width", Integer.valueOf(width.intValue()));
        }
        Integer height = e1eVar.getHeight();
        if (height != null) {
            contentValues.put("height", Integer.valueOf(height.intValue()));
        }
        contentValues.put("is_pending", (Integer) 1);
        bwf bwfVar = this.e;
        Uri uriInsert = ((ContentResolver) bwfVar.getValue()).insert(e1eVar.h(), contentValues);
        if (uriInsert == null) {
            return null;
        }
        e1eVar.c((ContentResolver) bwfVar.getValue(), uriInsert);
        contentValues.clear();
        contentValues.put("is_pending", (Integer) 0);
        ((ContentResolver) bwfVar.getValue()).update(uriInsert, contentValues, null, null);
        d1e.e(this.b, uriInsert);
        return uriInsert;
    }

    @Override // defpackage.d1e
    public final Uri b(e1e e1eVar, String str) {
        vob vobVar = this.c;
        File file = new File(vobVar.a(), str);
        e1eVar.n(file);
        Context context = vobVar.a;
        return FileProvider.d(context, file, context.getPackageName() + ".provider");
    }

    @Override // defpackage.d1e
    public final c28 d() {
        return this.d;
    }
}

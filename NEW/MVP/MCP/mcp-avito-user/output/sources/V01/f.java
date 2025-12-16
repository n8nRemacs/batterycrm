package V01;

import android.content.Context;
import android.os.AsyncTask;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes7.dex */
public class f extends AsyncTask<Context, Integer, Boolean> {
    @Override // android.os.AsyncTask
    public final Boolean doInBackground(Context[] contextArr) throws IOException {
        FileInputStream fileInputStreamH;
        Context[] contextArr2 = contextArr;
        System.currentTimeMillis();
        try {
            fileInputStreamH = a.h(contextArr2[0]);
        } catch (Exception e12) {
            e12.getMessage();
            fileInputStreamH = null;
        }
        System.currentTimeMillis();
        if (fileInputStreamH == null) {
            return Boolean.FALSE;
        }
        h.a(fileInputStreamH);
        return Boolean.TRUE;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Boolean bool) {
        bool.booleanValue();
    }

    @Override // android.os.AsyncTask
    public final void onProgressUpdate(Integer[] numArr) {
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
    }
}

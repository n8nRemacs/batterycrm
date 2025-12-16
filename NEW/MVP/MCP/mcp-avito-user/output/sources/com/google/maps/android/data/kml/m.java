package com.google.maps.android.data.kml;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: KmlRenderer.java */
/* loaded from: classes6.dex */
public class m extends com.google.maps.android.data.l {

    /* compiled from: KmlRenderer.java */
    public class a extends AsyncTask<String, Void, Bitmap> {
        @Override // android.os.AsyncTask
        public final Bitmap doInBackground(String[] strArr) {
            try {
                return BitmapFactory.decodeStream((InputStream) new URL(null).getContent());
            } catch (MalformedURLException unused) {
                return BitmapFactory.decodeFile(null);
            } catch (IOException unused2) {
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Bitmap bitmap) {
            if (bitmap != null) {
                throw null;
            }
        }
    }

    /* compiled from: KmlRenderer.java */
    public class b extends AsyncTask<String, Void, Bitmap> {
        @Override // android.os.AsyncTask
        public final Bitmap doInBackground(String[] strArr) {
            try {
                return BitmapFactory.decodeStream((InputStream) new URL(null).getContent());
            } catch (MalformedURLException unused) {
                return BitmapFactory.decodeFile(null);
            } catch (IOException e12) {
                e12.printStackTrace();
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Bitmap bitmap) {
            if (bitmap != null) {
                throw null;
            }
        }
    }
}

package androidx.print;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import j.X;
import java.io.FileNotFoundException;

/* compiled from: PrintHelper.java */
/* loaded from: classes.dex */
public final class b {

    /* compiled from: PrintHelper.java */
    public interface a {
    }

    /* compiled from: PrintHelper.java */
    @X
    public class c extends PrintDocumentAdapter {

        /* renamed from: a, reason: collision with root package name */
        public Bitmap f53494a;

        /* compiled from: PrintHelper.java */
        public class a extends AsyncTask<Uri, Boolean, Bitmap> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CancellationSignal f53495a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PrintAttributes f53496b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PrintAttributes f53497c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ PrintDocumentAdapter.LayoutResultCallback f53498d;

            /* compiled from: PrintHelper.java */
            /* renamed from: androidx.print.b$c$a$a, reason: collision with other inner class name */
            public class C1881a implements CancellationSignal.OnCancelListener {
                public C1881a() {
                }

                @Override // android.os.CancellationSignal.OnCancelListener
                public final void onCancel() {
                    c.this.getClass();
                    throw null;
                }
            }

            public a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, PrintAttributes printAttributes2, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback) {
                this.f53495a = cancellationSignal;
                this.f53496b = printAttributes;
                this.f53497c = printAttributes2;
                this.f53498d = layoutResultCallback;
            }

            @Override // android.os.AsyncTask
            public final Bitmap doInBackground(Uri[] uriArr) {
                try {
                    c.this.getClass();
                    throw null;
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            public final void onCancelled(Bitmap bitmap) {
                this.f53498d.onLayoutCancelled();
            }

            @Override // android.os.AsyncTask
            public final void onPostExecute(Bitmap bitmap) {
                Bitmap bitmap2 = bitmap;
                super.onPostExecute(bitmap2);
                c cVar = c.this;
                if (bitmap2 != null) {
                    throw null;
                }
                cVar.f53494a = bitmap2;
                PrintDocumentAdapter.LayoutResultCallback layoutResultCallback = this.f53498d;
                if (bitmap2 != null) {
                    layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(null).setContentType(1).setPageCount(1).build(), true ^ this.f53496b.equals(this.f53497c));
                } else {
                    layoutResultCallback.onLayoutFailed(null);
                }
            }

            @Override // android.os.AsyncTask
            public final void onPreExecute() {
                this.f53495a.setOnCancelListener(new C1881a());
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public final void onFinish() {
            super.onFinish();
            throw null;
        }

        @Override // android.print.PrintDocumentAdapter
        public final void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            synchronized (this) {
            }
            if (cancellationSignal.isCanceled()) {
                layoutResultCallback.onLayoutCancelled();
            } else if (this.f53494a != null) {
                layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(null).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
            } else {
                new a(cancellationSignal, printAttributes2, printAttributes, layoutResultCallback).execute(new Uri[0]);
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public final void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            throw null;
        }
    }

    /* compiled from: PrintHelper.java */
    @X
    /* renamed from: androidx.print.b$b, reason: collision with other inner class name */
    public class C1880b extends PrintDocumentAdapter {
        @Override // android.print.PrintDocumentAdapter
        public final void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(null).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
        }

        @Override // android.print.PrintDocumentAdapter
        public final void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            throw null;
        }

        @Override // android.print.PrintDocumentAdapter
        public final void onFinish() {
        }
    }
}

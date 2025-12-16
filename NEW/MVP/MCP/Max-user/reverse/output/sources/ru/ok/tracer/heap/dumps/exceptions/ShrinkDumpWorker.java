package ru.ok.tracer.heap.dumps.exceptions;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.la8;
import defpackage.nme;
import defpackage.q85;
import defpackage.rmb;
import defpackage.swi;
import defpackage.tha;
import defpackage.v17;
import defpackage.x77;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/tracer/heap/dumps/exceptions/ShrinkDumpWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "tracer-heap-dumps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ShrinkDumpWorker extends Worker {
    public ShrinkDumpWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final la8 a() throws Throwable {
        String strE = getInputData().e("param_dump_path");
        if (strE == null || strE.length() == 0) {
            return la8.a();
        }
        String strE2 = getInputData().e("param_tag");
        File file = new File(strE);
        long length = file.length();
        if (length < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            file.delete();
            return la8.b();
        }
        nme nmeVar = rmb.a;
        if (tha.t(nmeVar)) {
            file.delete();
            return la8.b();
        }
        try {
            File fileV = v17.v(getApplicationContext(), nmeVar);
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                int i = x77.v0;
                x77 x77Var = new x77(new DataInputStream(new BufferedInputStream(bufferedInputStream)));
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileV));
                    try {
                        swi.a(x77Var, bufferedOutputStream);
                        bufferedOutputStream.close();
                        x77Var.close();
                        file.delete();
                        q85.v(getApplicationContext(), nmeVar, fileV, strE2, Long.valueOf(length), null, 200);
                        return la8.b();
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                file.delete();
                throw th;
            }
        } catch (IOException unused) {
            return la8.a();
        }
    }
}

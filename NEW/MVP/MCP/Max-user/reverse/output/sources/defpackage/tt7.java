package defpackage;

import android.os.AsyncTask;

/* loaded from: classes.dex */
public final class tt7 extends AsyncTask {
    public final /* synthetic */ bu7 a;

    public tt7(bu7 bu7Var) {
        this.a = bu7Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        while (true) {
            bu7 bu7Var = this.a;
            wt7 wt7VarDequeueWork = bu7Var.dequeueWork();
            if (wt7VarDequeueWork == null) {
                return null;
            }
            bu7Var.onHandleWork(wt7VarDequeueWork.getIntent());
            wt7VarDequeueWork.a();
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        this.a.processorFinished();
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        this.a.processorFinished();
    }
}

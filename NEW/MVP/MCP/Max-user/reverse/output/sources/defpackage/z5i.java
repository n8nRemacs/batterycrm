package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public abstract class z5i {
    public static final String a = cei.m("WorkerFactory");

    public abstract ma8 a(Context context, String str, WorkerParameters workerParameters);

    public final ma8 b(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        String str2 = a;
        ma8 ma8VarA = a(context, str, workerParameters);
        if (ma8VarA == null) {
            try {
                clsAsSubclass = Class.forName(str).asSubclass(ma8.class);
            } catch (Throwable th) {
                cei.g().f(str2, "Invalid class: " + str, th);
                clsAsSubclass = null;
            }
            if (clsAsSubclass != null) {
                try {
                    ma8VarA = (ma8) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    cei.g().f(str2, "Could not instantiate " + str, th2);
                }
            }
        }
        if (ma8VarA == null || !ma8VarA.isUsed()) {
            return ma8VarA;
        }
        throw new IllegalStateException(wy1.j("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
    }
}

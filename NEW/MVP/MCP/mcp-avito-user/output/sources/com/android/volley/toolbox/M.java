package com.android.volley.toolbox;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.android.volley.Request;
import j.N;
import java.util.concurrent.PriorityBlockingQueue;

/* compiled from: Volley.java */
/* loaded from: classes10.dex */
public class M {
    @N
    public static com.android.volley.u a(Context context, q qVar) {
        com.android.volley.u uVar = new com.android.volley.u(new C27631k(new L(context.getApplicationContext())), new C27627g(qVar), 4, new com.android.volley.n(new Handler(Looper.getMainLooper())));
        uVar.e();
        PriorityBlockingQueue<Request<?>> priorityBlockingQueue = uVar.f67152c;
        PriorityBlockingQueue<Request<?>> priorityBlockingQueue2 = uVar.f67153d;
        com.android.volley.j jVar = uVar.f67154e;
        com.android.volley.x xVar = uVar.f67156g;
        com.android.volley.l lVar = new com.android.volley.l(priorityBlockingQueue, priorityBlockingQueue2, jVar, xVar);
        uVar.f67158i = lVar;
        lVar.start();
        int i12 = 0;
        while (true) {
            com.android.volley.q[] qVarArr = uVar.f67157h;
            if (i12 >= qVarArr.length) {
                return uVar;
            }
            com.android.volley.q qVar2 = new com.android.volley.q(priorityBlockingQueue2, uVar.f67155f, jVar, xVar);
            qVarArr[i12] = qVar2;
            qVar2.start();
            i12++;
        }
    }
}

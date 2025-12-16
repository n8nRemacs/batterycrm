package defpackage;

import androidx.work.WorkRequest;
import java.util.Set;

/* loaded from: classes.dex */
public final class a6i {
    public final String a;
    public final String b;
    public final uk5 c;
    public final r5i d;
    public final Set e;
    public final long f;
    public final int g;

    public a6i(String str, String str2, uk5 uk5Var, r5i r5iVar, Set set, long j, int i) {
        this.a = str;
        this.b = str2;
        this.c = uk5Var;
        this.d = r5iVar;
        this.e = set;
        this.f = j;
        this.g = i;
    }

    public a6i(String str, uk5 uk5Var, WorkRequest workRequest) {
        this(workRequest.getId().toString(), str, uk5Var, workRequest.getWorkSpec(), workRequest.getTags(), System.currentTimeMillis(), 0);
    }
}

package k11;

import android.text.TextUtils;
import e11.C39867f1;
import e11.Q0;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class c extends b {

    /* renamed from: m, reason: collision with root package name */
    public final boolean f406016m;

    /* renamed from: n, reason: collision with root package name */
    @P
    public final com.my.target.common.models.b f406017n;

    /* renamed from: o, reason: collision with root package name */
    @N
    public final ArrayList<d> f406018o;

    public static final class a {
    }

    public c(@N Q0 q02) {
        super(q02);
        this.f406018o = new ArrayList<>();
        boolean z12 = q02.f394464I != null;
        this.f406016m = z12;
        TextUtils.isEmpty(q02.f394711j);
        TextUtils.isEmpty(q02.f394712k);
        this.f406017n = q02.f394716o;
        if (z12) {
            return;
        }
        ArrayList arrayListD = q02.d();
        if (arrayListD.isEmpty()) {
            return;
        }
        Iterator it = arrayListD.iterator();
        while (it.hasNext()) {
            this.f406018o.add(new d((C39867f1) it.next()));
        }
    }
}

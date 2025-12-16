package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.http.protocol.HTTP;

/* loaded from: classes2.dex */
public final class w97 {
    public ArrayList a = new ArrayList();

    public void a(String str, String str2, rw5 rw5Var) {
        this.a.add(new z97(str, str2, (String) rw5Var.b, rw5Var));
    }

    public void b(String str, String str2) {
        this.a.add(new z97(str, null, null, tha.b(HTTP.PLAIN_TEXT_TYPE, str2)));
    }

    public z95 c() {
        return new z95(String.format("------------%016x", Arrays.copyOf(new Object[]{Long.valueOf(k7d.b.d())}, 1)), ue3.d0(this.a));
    }

    public d69 d() {
        if (this.a == null) {
            return d69.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.a);
        return new d69(bundle, this.a);
    }
}

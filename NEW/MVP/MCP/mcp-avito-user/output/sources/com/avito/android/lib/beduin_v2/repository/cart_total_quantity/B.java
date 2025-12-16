package com.avito.android.lib.beduin_v2.repository.cart_total_quantity;

import com.avito.android.util.R1;
import com.google.gson.Gson;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.G0;
import kotlin.collections.C42745f0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class B implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f176441b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F f176442c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f176443d;

    public /* synthetic */ B(F f12, Object obj, int i12) {
        this.f176441b = i12;
        this.f176442c = f12;
        this.f176443d = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object objE;
        switch (this.f176441b) {
            case 0:
                F f12 = this.f176442c;
                String strD = f12.f176446a.d("cart_icon_count_data");
                Gson gson = (Gson) f12.f176448c.getValue();
                if (strD == null) {
                    strD = "";
                }
                Integer num = null;
                try {
                    Type type = new E().getType();
                    objE = gson.e(strD, ((type instanceof ParameterizedType) && R1.a((ParameterizedType) type)) ? ((ParameterizedType) type).getRawType() : R1.b(type));
                } catch (Throwable unused) {
                    objE = null;
                }
                Q q12 = (Q) objE;
                if (q12 != null) {
                    boolean zF2 = kotlin.jvm.internal.L.f(q12.f176485b, (String) this.f176443d);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    boolean z12 = jCurrentTimeMillis <= q12.f176487d && q12.f176486c <= jCurrentTimeMillis;
                    if (!zF2 || !z12) {
                        q12 = null;
                    }
                    if (q12 != null) {
                        num = q12.f176488e;
                    }
                }
                f12.f176447b.b(new C31169l(num, false));
                return num;
            default:
                List list = (List) this.f176443d;
                this.f176442c.f176446a.putStringSet("cart_icon_supported_categories", list != null ? C42745f0.P0(list) : null);
                return G0.f406611a;
        }
    }
}

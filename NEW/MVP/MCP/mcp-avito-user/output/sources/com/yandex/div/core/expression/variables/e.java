package com.yandex.div.core.expression.variables;

import android.os.Handler;
import android.os.Looper;
import com.yandex.div.internal.util.r;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: GlobalVariableController.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/expression/variables/e;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final r<Y41.l<String, G0>> f367501a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<String, G0> f367502b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final m f367503c;

    /* compiled from: GlobalVariableController.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "variableName", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends N implements Y41.l<String, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            List listM0;
            String str2 = str;
            r<Y41.l<String, G0>> rVar = e.this.f367501a;
            synchronized (rVar.f370186a) {
                listM0 = C42745f0.M0(rVar.f370186a);
            }
            if (listM0 != null) {
                Iterator it = listM0.iterator();
                while (it.hasNext()) {
                    ((Y41.l) it.next()).invoke(str2);
                }
            }
            return G0.f406611a;
        }
    }

    public e() {
        new Handler(Looper.getMainLooper());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        r rVar = new r();
        new LinkedHashSet();
        new LinkedHashSet();
        this.f367501a = new r<>();
        this.f367503c = new m(concurrentHashMap, new a(), rVar);
    }
}

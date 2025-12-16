package com.yandex.div.core;

import android.content.Context;
import com.yandex.div.core.a0;
import com.yandex.div.core.dagger.C37907a;
import com.yandex.div.core.dagger.q;
import j.InterfaceC42148d;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import t21.InterfaceC48467b;

/* compiled from: DivKit.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/Z;", "", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@InterfaceC48467b
/* loaded from: classes7.dex */
public final class Z {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f367267b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a0 f367268c = new a0(null, Executors.newSingleThreadExecutor(), new a0.a().f367274a, null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public static volatile Z f367269d;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.dagger.q f367270a;

    /* compiled from: DivKit.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/div/core/Z$a;", "", "<init>", "()V", "Lcom/yandex/div/core/a0;", "DEFAULT_CONFIGURATION", "Lcom/yandex/div/core/a0;", "configuration", "Lcom/yandex/div/core/Z;", "instance", "Lcom/yandex/div/core/Z;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @X41.n
        @Y61.k
        @InterfaceC42148d
        public final Z a(@Y61.k Context context) {
            Z z12 = Z.f367269d;
            if (z12 != null) {
                return z12;
            }
            synchronized (this) {
                Z z13 = Z.f367269d;
                if (z13 != null) {
                    return z13;
                }
                Z z14 = new Z(context, Z.f367268c, null);
                Z.f367269d = z14;
                return z14;
            }
        }

        public a() {
        }
    }

    public Z(Context context, a0 a0Var, C42822w c42822w) {
        q.a aVarC = C37907a.c();
        aVarC.b(context.getApplicationContext());
        aVarC.a(a0Var);
        this.f367270a = aVarC.build();
    }
}

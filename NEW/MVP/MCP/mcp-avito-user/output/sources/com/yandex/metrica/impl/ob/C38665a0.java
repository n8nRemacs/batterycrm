package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.Context;
import com.yandex.metrica.IReporter;
import com.yandex.metrica.impl.ob.C39062q;

/* renamed from: com.yandex.metrica.impl.ob.a0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38665a0 {

    /* renamed from: a, reason: collision with root package name */
    private Context f380030a;

    /* renamed from: b, reason: collision with root package name */
    private final C39062q.b f380031b;

    /* renamed from: c, reason: collision with root package name */
    private final C39062q f380032c;

    /* renamed from: d, reason: collision with root package name */
    private final IReporter f380033d;

    /* renamed from: com.yandex.metrica.impl.ob.a0$a */
    public static final class a implements C39062q.b {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.C39062q.b
        public final void a(@Y61.k Activity activity, @Y61.k C39062q.a aVar) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 1) {
                C38665a0.this.f380033d.resumeSession();
            } else {
                if (iOrdinal != 2) {
                    return;
                }
                C38665a0.this.f380033d.pauseSession();
            }
        }
    }

    @X41.j
    public C38665a0(@Y61.k C39062q c39062q) {
        this(c39062q, null, 2);
    }

    @X41.j
    public C38665a0(@Y61.k C39062q c39062q, @Y61.k IReporter iReporter) {
        this.f380032c = c39062q;
        this.f380033d = iReporter;
        this.f380031b = new a();
    }

    public final synchronized void a(@Y61.k Context context) {
        if (this.f380030a == null) {
            Context applicationContext = context.getApplicationContext();
            this.f380032c.a(applicationContext);
            this.f380032c.a(this.f380031b, C39062q.a.RESUMED, C39062q.a.PAUSED);
            this.f380030a = applicationContext;
        }
    }

    public /* synthetic */ C38665a0(C39062q c39062q, IReporter iReporter, int i12) {
        this(c39062q, (i12 & 2) != 0 ? C39031oh.a() : null);
    }
}

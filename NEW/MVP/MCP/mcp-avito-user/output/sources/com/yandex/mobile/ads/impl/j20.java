package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.l0;

/* loaded from: classes8.dex */
public final class j20 {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    private static final Object f386738h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f386739i = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ha f386740a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final oa f386741b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final ma f386742c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final Context f386743d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    private ka f386744e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    private final k20 f386745f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    private final String f386746g;

    public static final class a {
        @Y61.k
        public static Object a() {
            return j20.f386738h;
        }
    }

    public j20(@Y61.k Context context, @Y61.k ha haVar, @Y61.k oa oaVar, @Y61.k ma maVar, @Y61.k jb0 jb0Var) {
        this.f386740a = haVar;
        this.f386741b = oaVar;
        this.f386742c = maVar;
        this.f386745f = k20.f387038a;
        this.f386746g = jb0Var.a();
        this.f386743d = context.getApplicationContext();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.yandex.mobile.ads.impl.ka] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Y61.k
    public final ka b() {
        ?? r22;
        l0.h hVar = new l0.h();
        synchronized (f386738h) {
            try {
                ka kaVar = this.f386744e;
                r22 = kaVar;
                if (kaVar == null) {
                    ha haVar = this.f386740a;
                    Context context = this.f386743d;
                    haVar.getClass();
                    String strB = ha.b(context);
                    ha haVar2 = this.f386740a;
                    Context context2 = this.f386743d;
                    haVar2.getClass();
                    ka kaVar2 = new ka(null, ha.a(context2), strB);
                    this.f386742c.a(this.f386743d, this);
                    r22 = kaVar2;
                }
                hVar.f406842b = r22;
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return r22;
    }

    @Y61.k
    public final k20 c() {
        return this.f386745f;
    }

    @Y61.k
    public final String d() {
        return this.f386746g;
    }

    public final void a(@Y61.k ka kaVar) {
        synchronized (f386738h) {
            try {
                this.f386741b.getClass();
                if (oa.a(kaVar)) {
                    this.f386744e = kaVar;
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public /* synthetic */ j20(Context context, ha haVar, oa oaVar, ma maVar) {
        this(context, haVar, oaVar, maVar, new jb0(y90.a(context)));
    }

    public j20(@Y61.k Context context) {
        this(context, new ha(), new oa(), new ma(new ha(), new la()));
    }
}

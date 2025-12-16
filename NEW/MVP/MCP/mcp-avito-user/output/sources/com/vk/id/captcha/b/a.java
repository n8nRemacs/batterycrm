package com.vk.id.captcha.b;

import X41.i;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Looper;
import com.vk.id.captcha.sensors.SensorsDataRepository;
import com.vk.id.captcha.sensors.SensorsDataRepositoryImpl;
import com.vk.id.captcha.web.b;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: DI.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\t8AX\u0081\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\fR\u001b\u0010\n\u001a\u00020\u000e8AX\u0081\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\u0006\u0010\u000fR\u001e\u0010\u0006\u001a\u0006*\u00020\u00100\u00108\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\n\u0010\u0013"}, d2 = {"Lcom/vk/id/captcha/b/a;", "", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "b", "Landroid/content/Context;", "a", "Lcom/vk/id/captcha/c/e;", "c", "Lkotlin/C;", "()Lcom/vk/id/captcha/c/e;", "d", "Lcom/vk/id/captcha/web/b;", "()Lcom/vk/id/captcha/web/b;", "Landroid/os/Looper;", "e", "Landroid/os/Looper;", "()Landroid/os/Looper;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    @l
    private static volatile a f366780f;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final Context a;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private final InterfaceC42726C d = C42727D.c(new AnonymousClass2());

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    private final InterfaceC42726C c = C42727D.c(new AnonymousClass1());

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Looper b = Looper.getMainLooper();

    /* compiled from: DI.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/vk/id/captcha/web/b;", "a", "()Lcom/vk/id/captcha/web/b;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.b.a$1, reason: invalid class name */
    public static final class AnonymousClass1 extends N implements Y41.a<b> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            return new b(a.this.a);
        }
    }

    /* compiled from: DI.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/vk/id/captcha/c/f;", "a", "()Lcom/vk/id/captcha/c/f;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.b.a$2, reason: invalid class name */
    public static final class AnonymousClass2 extends N implements Y41.a<SensorsDataRepositoryImpl> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SensorsDataRepositoryImpl invoke() {
            SensorsDataRepositoryImpl.a aVar = SensorsDataRepositoryImpl.f366820a;
            return SensorsDataRepositoryImpl.a.a(a.this.a);
        }
    }

    /* compiled from: DI.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/vk/id/captcha/b/a$a;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lkotlin/G0;", "a", "(Landroid/content/Context;)V", "Lcom/vk/id/captcha/b/a;", "()Lcom/vk/id/captcha/b/a;", "b", "f", "Lcom/vk/id/captcha/b/a;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.b.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @i
        @k
        public static a a() {
            a aVar = a.f366780f;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("DI is not initialized!");
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public static void a(@k Context p02) {
            if (a.f366780f == null) {
                synchronized (a.class) {
                    try {
                        if (a.f366780f == null) {
                            a.f366780f = new a(p02);
                        }
                        G0 g02 = G0.f406611a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    public a(@k Context context) {
        this.a = context;
    }

    @i
    /* renamed from: c, reason: from getter */
    public final Looper getB() {
        return this.b;
    }

    @i
    @k
    public final SensorsDataRepository a() {
        return (SensorsDataRepository) this.d.getValue();
    }

    @i
    @k
    public final b b() {
        return (b) this.c.getValue();
    }
}

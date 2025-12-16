package com.vk.id.captcha.sensors.a;

import X41.i;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SensorData.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0006\u0003\nB\t\b\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r"}, d2 = {"Lcom/vk/id/captcha/c/a/a;", "", "Lorg/json/JSONObject;", "b", "()Lorg/json/JSONObject;", "", "a", "()Ljava/lang/String;", "<init>", "()V", "c", "Lcom/vk/id/captcha/c/a/a$a;", "Lcom/vk/id/captcha/c/a/a$b;", "Lcom/vk/id/captcha/c/a/a$c;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class a {

    /* compiled from: SensorData.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\r8\u0017X\u0097D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0013X\u0007¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0013X\u0007¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u0013X\u0007¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014"}, d2 = {"Lcom/vk/id/captcha/c/a/a$a;", "Lcom/vk/id/captcha/c/a/a;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lorg/json/JSONObject;", "b", "()Lorg/json/JSONObject;", "", "toString", "()Ljava/lang/String;", "e", "Ljava/lang/String;", "a", "", "F", "c", "d", "p1", "p2", "<init>", "(FFF)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.c.a.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10825a extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);
        public float b;
        public float c;
        public float d;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @k
        private final String a;

        /* compiled from: SensorData.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/vk/id/captcha/c/a/a$a$a;", "", "", "p0", "Lcom/vk/id/captcha/c/a/a$a;", "a", "([F)Lcom/vk/id/captcha/c/a/a$a;", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.vk.id.captcha.c.a.a$a$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @k
            public final C10825a a(@k float[] p02) {
                return new C10825a(p02[0], p02[1], p02[2]);
            }

            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }
        }

        public C10825a(float f12, float f13, float f14) {
            super(null);
            this.b = f12;
            this.c = f13;
            this.d = f14;
            this.a = "accelerometer";
        }

        @Override // com.vk.id.captcha.sensors.a.a
        @i
        @k
        /* renamed from: a, reason: from getter */
        public final String getD() {
            return this.a;
        }

        @Override // com.vk.id.captcha.sensors.a.a
        @k
        public final JSONObject b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("x", Float.valueOf(this.b));
            jSONObject.put("y", Float.valueOf(this.c));
            jSONObject.put("z", Float.valueOf(this.d));
            return jSONObject;
        }

        public final boolean equals(@l Object p02) {
            if (this == p02) {
                return true;
            }
            if (!(p02 instanceof C10825a)) {
                return false;
            }
            C10825a c10825a = (C10825a) p02;
            return Float.compare(this.b, c10825a.b) == 0 && Float.compare(this.c, c10825a.c) == 0 && Float.compare(this.d, c10825a.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + r.d(this.c, Float.hashCode(this.b) * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("a(b=");
            sb2.append(this.b);
            sb2.append(", c=");
            sb2.append(this.c);
            sb2.append(", d=");
            return r.k(')', this.d, sb2);
        }
    }

    /* compiled from: SensorData.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\r8\u0017X\u0097D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0013X\u0007¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0013X\u0007¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u0013X\u0007¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014"}, d2 = {"Lcom/vk/id/captcha/c/a/a$b;", "Lcom/vk/id/captcha/c/a/a;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lorg/json/JSONObject;", "b", "()Lorg/json/JSONObject;", "", "toString", "()Ljava/lang/String;", "e", "Ljava/lang/String;", "a", "", "F", "c", "d", "p1", "p2", "<init>", "(FFF)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);
        public float b;
        public float c;
        public float d;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @k
        private final String a;

        /* compiled from: SensorData.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/vk/id/captcha/c/a/a$b$a;", "", "", "p0", "Lcom/vk/id/captcha/c/a/a$b;", "a", "([F)Lcom/vk/id/captcha/c/a/a$b;", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.vk.id.captcha.c.a.a$b$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @k
            public final b a(@k float[] p02) {
                return new b(p02[0], p02[1], p02[2]);
            }

            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }
        }

        public b(float f12, float f13, float f14) {
            super(null);
            this.b = f12;
            this.c = f13;
            this.d = f14;
            this.a = "gyroscope";
        }

        @Override // com.vk.id.captcha.sensors.a.a
        @i
        @k
        /* renamed from: a, reason: from getter */
        public final String getD() {
            return this.a;
        }

        @Override // com.vk.id.captcha.sensors.a.a
        @k
        public final JSONObject b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("x", Float.valueOf(this.b));
            jSONObject.put("y", Float.valueOf(this.c));
            jSONObject.put("z", Float.valueOf(this.d));
            return jSONObject;
        }

        public final boolean equals(@l Object p02) {
            if (this == p02) {
                return true;
            }
            if (!(p02 instanceof b)) {
                return false;
            }
            b bVar = (b) p02;
            return Float.compare(this.b, bVar.b) == 0 && Float.compare(this.c, bVar.c) == 0 && Float.compare(this.d, bVar.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + r.d(this.c, Float.hashCode(this.b) * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("b(b=");
            sb2.append(this.b);
            sb2.append(", c=");
            sb2.append(this.c);
            sb2.append(", d=");
            return r.k(')', this.d, sb2);
        }
    }

    /* compiled from: SensorData.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u0010X\u0006¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0010X\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u0010X\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\r8\u0017X\u0097D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u000f"}, d2 = {"Lcom/vk/id/captcha/c/a/a$c;", "Lcom/vk/id/captcha/c/a/a;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lorg/json/JSONObject;", "b", "()Lorg/json/JSONObject;", "", "toString", "()Ljava/lang/String;", "", "F", "a", "c", "d", "e", "Ljava/lang/String;", "p1", "p2", "<init>", "(FFF)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public float a;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public float b;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        public float c;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @k
        private final String d;

        /* compiled from: SensorData.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/vk/id/captcha/c/a/a$c$a;", "", "", "p0", "Lcom/vk/id/captcha/c/a/a$c;", "a", "([F)Lcom/vk/id/captcha/c/a/a$c;", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.vk.id.captcha.c.a.a$c$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @k
            public final c a(@k float[] p02) {
                float f12 = p02[0];
                return new c(f12, f12, f12);
            }

            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }
        }

        public c(float f12, float f13, float f14) {
            super(null);
            this.a = f12;
            this.b = f13;
            this.c = f14;
            this.d = "motion";
        }

        @Override // com.vk.id.captcha.sensors.a.a
        @i
        @k
        /* renamed from: a, reason: from getter */
        public final String getD() {
            return this.d;
        }

        @Override // com.vk.id.captcha.sensors.a.a
        @k
        public final JSONObject b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("alpha", Float.valueOf(this.a));
            jSONObject.put("beta", Float.valueOf(this.b));
            jSONObject.put("gamma", Float.valueOf(this.c));
            return jSONObject;
        }

        public final boolean equals(@l Object p02) {
            if (this == p02) {
                return true;
            }
            if (!(p02 instanceof c)) {
                return false;
            }
            c cVar = (c) p02;
            return Float.compare(this.a, cVar.a) == 0 && Float.compare(this.b, cVar.b) == 0 && Float.compare(this.c, cVar.c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.c) + r.d(this.b, Float.hashCode(this.a) * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("c(a=");
            sb2.append(this.a);
            sb2.append(", b=");
            sb2.append(this.b);
            sb2.append(", c=");
            return r.k(')', this.c, sb2);
        }
    }

    private a() {
    }

    @i
    @k
    /* renamed from: a */
    public abstract String getD();

    @k
    public abstract JSONObject b();

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }
}

package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.C42822w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.internal.C43466q;
import kotlinx.serialization.json.internal.C43468t;
import kotlinx.serialization.json.internal.C43471w;
import kotlinx.serialization.json.internal.T;
import kotlinx.serialization.json.internal.WriteMode;
import kotlinx.serialization.json.internal.i0;
import kotlinx.serialization.json.internal.k0;
import kotlinx.serialization.json.internal.m0;
import okhttp3.internal.http2.Settings;

/* compiled from: Json.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/json/a;", "Lkotlinx/serialization/G;", "a", "Lkotlinx/serialization/json/a$a;", "Lkotlinx/serialization/json/u;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.serialization.json.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43443a implements kotlinx.serialization.G {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final C11757a f412954d = new C11757a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C43448f f412955a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlinx.serialization.modules.f f412956b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C43471w f412957c = new C43471w();

    /* compiled from: Json.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/json/a$a;", "Lkotlinx/serialization/json/a;", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.serialization.json.a$a, reason: collision with other inner class name */
    public static final class C11757a extends AbstractC43443a {
        public /* synthetic */ C11757a(C42822w c42822w) {
            this();
        }

        public C11757a() {
            super(new C43448f(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, null, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null), kotlinx.serialization.modules.m.f413167a, null);
        }
    }

    public AbstractC43443a(C43448f c43448f, kotlinx.serialization.modules.f fVar, C42822w c42822w) {
        this.f412955a = c43448f;
        this.f412956b = fVar;
    }

    @Override // kotlinx.serialization.s
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final kotlinx.serialization.modules.f getF412956b() {
        return this.f412956b;
    }

    @Override // kotlinx.serialization.G
    @Y61.k
    public final <T> String c(@Y61.k kotlinx.serialization.x<? super T> xVar, T t12) {
        T t13 = new T();
        try {
            new k0(this.f412955a.f412985e ? new C43468t(t13, this) : new C43466q(t13), this, WriteMode.f413034d, new t[((AbstractC42734a) WriteMode.f413039i).getF38291e()]).f(xVar, t12);
            return t13.toString();
        } finally {
            t13.b();
        }
    }

    @Override // kotlinx.serialization.G
    public final Object d(@org.intellij.lang.annotations.d @Y61.k String str, @Y61.k KSerializer kSerializer) {
        m0 m0Var = new m0(str);
        Object objM = new i0(this, WriteMode.f413034d, m0Var, kSerializer.getF332717a(), null).m(kSerializer);
        m0Var.o();
        return objM;
    }
}

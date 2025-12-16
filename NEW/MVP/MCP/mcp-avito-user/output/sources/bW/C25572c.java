package bW;

import AK0.l;
import Y61.k;
import com.avito.android.B2;
import com.google.gson.Gson;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.reflect.n;

/* compiled from: LiquidityStatusStorageImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LbW/c;", "LbW/b;", "a", "_avito_liquidity-status_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bW.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C25572c implements InterfaceC25571b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Gson f57098a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l f57099b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final B2 f57100c;

    /* compiled from: LiquidityStatusStorageImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"LbW/c$a;", "", "<init>", "()V", "", "LIQUIDITY_STATUS_FREEMIUM_STARTED_COUNT_KEY", "Ljava/lang/String;", "LIQUIDITY_STATUS_FREEMIUM_START_WAITING_KEY", "LIQUIDITY_STATUS_SHOWN_TIMESTAMP_KEY", "WAITING_KEY", "_avito_liquidity-status_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bW.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: LiquidityStatusStorageImpl.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0001¨\u0006\u0005"}, d2 = {"bW/c$b", "Lcom/google/gson/reflect/a;", "", "", "", "_avito_liquidity-status_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bW.c$b */
    public static final class b extends com.google.gson.reflect.a<Map<String, ? extends Object>> {
    }

    static {
        new a(null);
    }

    @Inject
    public C25572c(@k Gson gson, @k l lVar, @k B2 b22) {
        this.f57098a = gson;
        this.f57099b = lVar;
        this.f57100c = b22;
    }

    @Override // bW.InterfaceC25571b
    public final boolean a() {
        l lVar = this.f57099b;
        int i12 = lVar.getInt("liquidity_status_freemium_started_count_key", 0);
        if (i12 >= 2) {
            return true;
        }
        try {
            Map map = (Map) this.f57098a.e(lVar.getString("liquidity_status_freemium_waiting_key"), new b().getType());
            Object obj = map != null ? map.get("waiting") : null;
            Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
            if (bool != null ? bool.booleanValue() : false) {
                lVar.a(i12 + 1, "liquidity_status_freemium_started_count_key");
                lVar.remove("liquidity_status_freemium_waiting_key");
            }
            return i12 + 1 >= 2;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // bW.InterfaceC25571b
    public final void b(long j12) {
        this.f57099b.putLong("liquidity_status_shown_timestamp_key", j12);
    }

    @Override // bW.InterfaceC25571b
    public final boolean c(long j12) {
        B2 b22 = this.f57100c;
        b22.getClass();
        n<Object> nVar = B2.f67184X[3];
        return ((Boolean) b22.f67211e.a().invoke()).booleanValue() && j12 > this.f57099b.getLong("liquidity_status_shown_timestamp_key", -1L);
    }
}

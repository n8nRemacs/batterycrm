package ru.tinkoff.core.tinkoffId.codeVerifier;

import Y61.k;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: CodeVerifierStore.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/tinkoff/core/tinkoffId/codeVerifier/a;", "", "a", "tinkoff-id_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f437027a;

    /* compiled from: CodeVerifierStore.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lru/tinkoff/core/tinkoffId/codeVerifier/a$a;", "", "<init>", "()V", "", "CODE_VERIFIER", "Ljava/lang/String;", "PREFS_FILENAME", "tinkoff-id_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: ru.tinkoff.core.tinkoffId.codeVerifier.a$a, reason: collision with other inner class name */
    public static final class C12593a {
        public /* synthetic */ C12593a(C42822w c42822w) {
            this();
        }

        public C12593a() {
        }
    }

    /* compiled from: CodeVerifierStore.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b extends N implements Y41.a<SharedPreferences> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Context f437028l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.f437028l = context;
        }

        @Override // Y41.a
        public final SharedPreferences invoke() {
            return this.f437028l.getSharedPreferences("prefs_tinkoff_partner", 0);
        }
    }

    static {
        new C12593a(null);
    }

    public a(@k Context context) {
        this.f437027a = C42727D.b(LazyThreadSafetyMode.f406615c, new b(context));
    }
}

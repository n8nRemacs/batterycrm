package sM;

import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: RunOnceLinkStorage.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LsM/j;", "LsM/i;", "a", "_avito_iac-util-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f437622a;

    /* compiled from: RunOnceLinkStorage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LsM/j$a;", "", "<init>", "()V", "", "LOGIN_SCOPE_PREFIX", "Ljava/lang/String;", "PERMANENT_SCOPE_PREFIX", "_avito_iac-util-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public j(@Y61.k AK0.l lVar) {
        this.f437622a = lVar;
    }

    @Override // sM.i
    public final void a() {
        AK0.l lVar = this.f437622a;
        for (String str : lVar.getAll().keySet()) {
            if (C43066x.h0(str, "run_once_login_scope_", false)) {
                lVar.remove(str);
            }
        }
    }

    @Override // sM.i
    public final void b(@Y61.k String str) {
        this.f437622a.putBoolean("run_once_login_scope_".concat(str), true);
    }

    @Override // sM.i
    public final boolean c(@Y61.k String str) {
        return this.f437622a.getBoolean("run_once_login_scope_".concat(str), false);
    }

    @Override // sM.i
    public final void d(@Y61.k String str) {
        this.f437622a.putBoolean("run_once_permanent_scope_".concat(str), true);
    }

    @Override // sM.i
    public final boolean e(@Y61.k String str) {
        return this.f437622a.getBoolean("run_once_permanent_scope_".concat(str), false);
    }
}

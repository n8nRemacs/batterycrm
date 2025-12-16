package com.avito.android.verification.inn;

import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC23040h0;
import com.avito.android.di.B;
import com.avito.android.verification.verification_input_inn.VerificationInputInnFragment;
import javax.inject.Inject;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;

/* compiled from: InnListPresenterWatcher.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/inn/d;", "", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f323882d = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f323883a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.inn.b f323884b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f323885c;

    /* compiled from: InnListPresenterWatcher.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/verification/inn/d$a;", "", "<init>", "()V", "", "MILLISECONDS_PER_INCH", "F", "", "TAG_VERIFICATION_SELECT_FRAGMENT", "Ljava/lang/String;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: InnListPresenterWatcher.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f323886b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l lVar) {
            this.f323886b = (N) lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return this.f323886b.equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f323886b;
        }

        public final int hashCode() {
            return this.f323886b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f323886b.invoke(obj);
        }
    }

    static {
        new a(null);
    }

    @Inject
    public d(@Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k com.avito.android.verification.inn.b bVar, @Y61.k com.avito.konveyor.adapter.a aVar) {
        this.f323883a = jVar;
        this.f323884b = bVar;
        this.f323885c = aVar;
    }

    public final void a(@Y61.k VerificationInputInnFragment verificationInputInnFragment, @Y61.l RecyclerView recyclerView) {
        com.avito.android.verification.inn.b bVar = this.f323884b;
        bVar.f323877d.observe(verificationInputInnFragment.getViewLifecycleOwner(), new b(new e(this)));
        bVar.f323875b.observe(verificationInputInnFragment.getViewLifecycleOwner(), new b(new f(verificationInputInnFragment)));
        bVar.f323878e.observe(verificationInputInnFragment.getViewLifecycleOwner(), new b(new g(recyclerView, this)));
        bVar.f323876c.observe(verificationInputInnFragment.getViewLifecycleOwner(), new b(new h(verificationInputInnFragment)));
    }
}

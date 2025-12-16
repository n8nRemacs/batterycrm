package com.avito.android.publish.pretend;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.publish.C0;
import com.avito.android.remote.model.PretendErrorValue;
import com.avito.android.remote.model.PretendResult;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.AbstractC35806h3;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PretendViewModel.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/pretend/h;", "Landroidx/lifecycle/M0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f238376E;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final e f238377J;

    /* renamed from: K, reason: collision with root package name */
    @k
    public final C0 f238378K;

    /* renamed from: L, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f238379L = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: M, reason: collision with root package name */
    @k
    public final C23038g0<AbstractC35806h3<PretendResult>> f238380M = new C23038g0<>();

    /* compiled from: PretendViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f238381l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            V2.f318762a.a("DEFAULT_TAG", "startValidation", th2);
            return G0.f406611a;
        }
    }

    /* compiled from: PretendViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/h3;", "Lcom/avito/android/remote/model/PretendResult;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/h3;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<AbstractC35806h3<? super PretendResult>, G0> {
        public b() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final G0 invoke(AbstractC35806h3<? super PretendResult> abstractC35806h3) {
            AbstractC35806h3<? super PretendResult> abstractC35806h32 = abstractC35806h3;
            h hVar = h.this;
            hVar.f238380M.setValue(abstractC35806h32);
            if (abstractC35806h32 instanceof AbstractC35806h3.d) {
                Map<String, PretendErrorValue> errors = ((PretendResult) ((AbstractC35806h3.d) abstractC35806h32).f318893a).getErrors();
                boolean zIsEmpty = errors.isEmpty();
                C0 c02 = hVar.f238378K;
                if (zIsEmpty || !c02.ze(errors)) {
                    c02.xe(null);
                }
            }
            return G0.f406611a;
        }
    }

    public h(@k InterfaceC35745a5 interfaceC35745a5, @k e eVar, @k C0 c02) {
        this.f238376E = interfaceC35745a5;
        this.f238377J = eVar;
        this.f238378K = c02;
    }

    public final void ke() {
        C0 c02 = this.f238378K;
        CategoryParameters categoryParameters = c02.f231873k0;
        if (categoryParameters == null) {
            return;
        }
        this.f238379L.b(A1.h(this.f238377J.m(c02.f231861Y.getNavigation(), categoryParameters).j0(this.f238376E.e()), a.f238381l, new b(), 2));
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f238379L.e();
    }
}

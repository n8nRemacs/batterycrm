package com.avito.android.beduin_shared.model.utils;

import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC23040h0;
import androidx.work.impl.CallableC23587q;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_shared.model.progress_overlay.b;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35743a3;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import gj.InterfaceC40691b;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.single.G;
import java.util.List;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import lj.InterfaceC43779a;

/* compiled from: BeduinContexts.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin-shared_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b {

    /* compiled from: BeduinContexts.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a \u0012\u001c\b\u0001\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b0\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Llj/a;", "kotlin.jvm.PlatformType", "it", "Lio/reactivex/rxjava3/core/E;", "", "Lej/a;", "Lcom/avito/android/beduin_models/BeduinModel;", "Lej/e;", "Lcom/avito/android/beduin_shared/model/component/BeduinComponentItem;", "apply", "(Llj/a;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f105325b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((InterfaceC43779a) obj).getF103348p();
        }
    }

    /* compiled from: BeduinContexts.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/beduin_shared/model/progress_overlay/b;", "kotlin.jvm.PlatformType", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin_shared/model/progress_overlay/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.beduin_shared.model.utils.b$b, reason: collision with other inner class name */
    public static final class C3149b extends N implements Y41.l<com.avito.android.beduin_shared.model.progress_overlay.b, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.beduin_shared.model.progress_overlay.a f105326l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3149b(com.avito.android.beduin_shared.model.progress_overlay.a aVar) {
            super(1);
            this.f105326l = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.beduin_shared.model.progress_overlay.b bVar) {
            com.avito.android.beduin_shared.model.progress_overlay.b bVar2 = bVar;
            boolean zF2 = L.f(bVar2, b.C3148b.f105322a);
            com.avito.android.beduin_shared.model.progress_overlay.a aVar = this.f105326l;
            if (zF2) {
                aVar.b();
            } else if (bVar2 instanceof b.a) {
                aVar.e((b.a) bVar2);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinContexts.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f105327b;

        public c(Y41.l lVar) {
            this.f105327b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return L.f(this.f105327b, ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f105327b;
        }

        public final int hashCode() {
            return this.f105327b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f105327b.invoke(obj);
        }
    }

    @Y61.k
    public static final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> a(@Y61.k InterfaceC40691b interfaceC40691b, @Y61.k String str, @Y61.k List<? extends BeduinModel> list) {
        z zVarP = new G(new CallableC23587q(3, interfaceC40691b, list, str)).p(a.f105325b);
        if (!C35743a3.a()) {
            zVarP = zVarP.x0(io.reactivex.rxjava3.android.schedulers.b.b());
        }
        return (List) zVarP.d();
    }

    @Y61.k
    public static final B0 b(@Y61.k InterfaceC40691b interfaceC40691b) {
        return interfaceC40691b.q().d0(com.avito.android.beduin_shared.model.utils.c.f105328b);
    }

    public static final void c(@Y61.k InterfaceC40691b interfaceC40691b, @Y61.k Fragment fragment, @Y61.k com.avito.android.beduin_shared.model.progress_overlay.a aVar) {
        interfaceC40691b.s(fragment.requireContext()).observe(fragment.getViewLifecycleOwner(), new c(new C3149b(aVar)));
    }
}

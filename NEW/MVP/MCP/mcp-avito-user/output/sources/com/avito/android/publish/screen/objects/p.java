package com.avito.android.publish.screen.objects;

import Ge0.InterfaceC13872a;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.view.C23060r0;
import i31.InterfaceC41220a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ObjectFillFormViewModel.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/screen/objects/p;", "Lcom/avito/android/arch/mvi/android/j;", "LGe0/a;", "LGe0/f;", "LGe0/d;", "a", "b", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class p extends com.avito.android.arch.mvi.android.j<InterfaceC13872a, Ge0.f, Ge0.d> {

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.screen.objects.domain.a f240249N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.screen.objects.domain.d f240250O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final C23060r0 f240251P;

    /* compiled from: ObjectFillFormViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/screen/objects/p$a;", "", "<init>", "()V", "", "KEY_INTERACTOR_STATE", "Ljava/lang/String;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ObjectFillFormViewModel.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/objects/p$b;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        @Y61.k
        p a(@Y61.k C23060r0 c23060r0);
    }

    static {
        new a(null);
    }

    @i31.c
    public p(@Y61.k com.avito.android.publish.screen.objects.mvi.k kVar, @Y61.k com.avito.android.publish.screen.objects.domain.a aVar, @Y61.k com.avito.android.publish.screen.objects.domain.d dVar, @InterfaceC41220a @Y61.k C23060r0 c23060r0) {
        super(kVar, null, 2, null);
        this.f240249N = aVar;
        this.f240250O = dVar;
        this.f240251P = c23060r0;
        aVar.b((Bundle) c23060r0.b("interactor"));
        aVar.q();
        dVar.q();
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        super.onCleared();
        com.avito.android.publish.screen.objects.domain.a aVar = this.f240249N;
        this.f240251P.e(aVar.H(), "interactor");
        aVar.a();
        this.f240250O.f0();
    }
}

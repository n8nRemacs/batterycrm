package com.avito.android.publish.screen.step.params;

import Ie0.InterfaceC14065a;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.view.C23060r0;
import com.avito.android.publish.screen.step.params.domain.InterfaceC34074a;
import gj.InterfaceC40691b;
import i31.InterfaceC41220a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PublishDetailsViewModel.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/screen/step/params/J;", "Lcom/avito/android/arch/mvi/android/j;", "LIe0/a;", "LIe0/f;", "LIe0/d;", "a", "b", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class J extends com.avito.android.arch.mvi.android.j<InterfaceC14065a, Ie0.f, Ie0.d> {

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34074a f240410N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f240411O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final C23060r0 f240412P;

    /* compiled from: PublishDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/screen/step/params/J$a;", "", "<init>", "()V", "", "KEY_INTERACTOR_STATE", "Ljava/lang/String;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/J$b;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        @Y61.k
        J a(@Y61.k C23060r0 c23060r0);
    }

    static {
        new a(null);
    }

    @i31.c
    public J(@Y61.k com.avito.android.publish.screen.step.params.mvi.D d12, @Y61.k InterfaceC34074a interfaceC34074a, @Y61.k InterfaceC40691b interfaceC40691b, @InterfaceC41220a @Y61.k C23060r0 c23060r0) {
        super(d12, null, 2, null);
        this.f240410N = interfaceC34074a;
        this.f240411O = interfaceC40691b;
        this.f240412P = c23060r0;
        interfaceC34074a.b((Bundle) c23060r0.b("interactor"));
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        InterfaceC34074a interfaceC34074a = this.f240410N;
        this.f240412P.e(interfaceC34074a.P(), "interactor");
        interfaceC34074a.f0();
        this.f240411O.onCleared();
    }
}

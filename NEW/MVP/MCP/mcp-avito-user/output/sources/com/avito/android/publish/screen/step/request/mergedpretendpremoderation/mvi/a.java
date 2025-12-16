package com.avito.android.publish.screen.step.request.mergedpretendpremoderation.mvi;

import Ke0.InterfaceC14307a;
import Ke0.InterfaceC14308b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.publish.C0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import nI0.InterfaceC44261b;

/* compiled from: MergedPretendPremoderationActor.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LKe0/a;", "LKe0/b;", "LKe0/d;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC14307a, InterfaceC14308b, Ke0.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C0 f241808a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.g f241809b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44261b f241810c;

    /* compiled from: MergedPretendPremoderationActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/mvi/a$a;", "", "<init>", "()V", "", "KEY_SHOULD_FINISH_AFTER_ACTIVATION", "Ljava/lang/String;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.screen.step.request.mergedpretendpremoderation.mvi.a$a, reason: collision with other inner class name */
    public static final class C7243a {
        public /* synthetic */ C7243a(C42822w c42822w) {
            this();
        }

        public C7243a() {
        }
    }

    static {
        new C7243a(null);
    }

    @Inject
    public a(@Y61.k C0 c02, @Y61.k com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.g gVar, @Y61.k InterfaceC44261b interfaceC44261b) {
        this.f241808a = c02;
        this.f241809b = gVar;
        this.f241810c = interfaceC44261b;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC14308b> b(InterfaceC14307a interfaceC14307a, Ke0.d dVar) {
        InterfaceC14307a interfaceC14307a2 = interfaceC14307a;
        if (interfaceC14307a2.equals(InterfaceC14307a.C0586a.f9573a)) {
            return C43175k.G(new b(this, null));
        }
        if (interfaceC14307a2.equals(InterfaceC14307a.c.f9575a)) {
            return C43175k.G(new c(this, null));
        }
        if (interfaceC14307a2.equals(InterfaceC14307a.d.f9576a)) {
            return C43175k.G(new d(this, null));
        }
        if (interfaceC14307a2.equals(InterfaceC14307a.e.f9577a)) {
            return this.f241809b.load();
        }
        if (interfaceC14307a2 instanceof InterfaceC14307a.b) {
            return C43175k.G(new e(((InterfaceC14307a.b) interfaceC14307a2).f9574a, this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}

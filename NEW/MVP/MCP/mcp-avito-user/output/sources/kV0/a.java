package KV0;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.interaction.flow.keyboard.e;
import com.avito.beduin.v2.interaction.flow.keyboard.f;
import kotlin.Metadata;

/* compiled from: KeyboardInteractionClient.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LKV0/a;", "Lcom/avito/beduin/v2/interaction/flow/keyboard/e;", "<init>", "()V", "keyboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements e {

    /* renamed from: b, reason: collision with root package name */
    @l
    public f f9501b;

    @Override // com.avito.beduin.v2.interaction.flow.keyboard.f
    public final void L4(boolean z12) {
        f fVar = this.f9501b;
        if (fVar != null) {
            fVar.L4(z12);
        }
    }

    @Override // FV0.h
    public final void P() {
        this.f9501b = null;
    }

    @Override // FV0.h
    public final void Q(@k FV0.a aVar) {
        this.f9501b = aVar instanceof f ? (f) aVar : null;
    }
}

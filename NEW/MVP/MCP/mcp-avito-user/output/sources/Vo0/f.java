package Vo0;

import Uo0.InterfaceC15546c;
import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: AutoDispatchPresetsViewFactory.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LVo0/f;", "LVo0/c;", "LUo0/c;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements InterfaceC15702c<InterfaceC15546c> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f17395a;

    public f(@k View view) {
        this.f17395a = view;
    }

    @Override // Vo0.InterfaceC15702c
    public final void a(InterfaceC15546c interfaceC15546c) {
        if (interfaceC15546c instanceof InterfaceC15546c.a) {
            this.f17395a.setTag("customOption");
        }
    }

    @Override // Vo0.InterfaceC15702c
    @k
    /* renamed from: getRoot, reason: from getter */
    public final View getF17395a() {
        return this.f17395a;
    }
}

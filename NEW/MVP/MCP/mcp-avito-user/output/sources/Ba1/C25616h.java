package ba1;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;

/* renamed from: ba1.h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C25616h implements Aa1.d {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC42726C f57194a;

    /* renamed from: b, reason: collision with root package name */
    public final int f57195b;

    public C25616h(boolean z12) {
        InterfaceC42726C interfaceC42726CC = C42727D.c(new C25615g(z12));
        this.f57194a = interfaceC42726CC;
        this.f57195b = ((List) interfaceC42726CC.getValue()).size();
    }

    @Override // Aa1.d
    public final Fragment a(int i12, Bundle bundle) {
        InterfaceC42726C interfaceC42726C = this.f57194a;
        if (i12 < ((List) interfaceC42726C.getValue()).size()) {
            return (Fragment) ((Y41.a) ((List) interfaceC42726C.getValue()).get(i12)).invoke();
        }
        throw new IllegalStateException(AK.c.g(i12, "Wrong position in passport flow "));
    }

    @Override // Aa1.d
    public final int a() {
        return this.f57195b;
    }
}

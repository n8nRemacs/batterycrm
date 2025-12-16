package androidx.compose.ui.platform;

import androidx.view.C23485c;
import kotlin.Metadata;

/* compiled from: DisposableSaveableStateRegistry.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.ui.platform.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22452a1 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f41375l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C23485c f41376m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f41377n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22452a1(boolean z12, C23485c c23485c, String str) {
        super(0);
        this.f41375l = z12;
        this.f41376m = c23485c;
        this.f41377n = str;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        if (this.f41375l) {
            this.f41376m.f54426a.d(this.f41377n);
        }
        return kotlin.G0.f406611a;
    }
}

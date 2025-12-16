package androidx.compose.ui.platform;

import androidx.view.Lifecycle;
import kotlin.Metadata;

/* compiled from: ViewCompositionStrategy.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.ui.platform.v2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22536v2 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f41627l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ M11.d f41628m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22536v2(Lifecycle lifecycle, M11.d dVar) {
        super(0);
        this.f41627l = lifecycle;
        this.f41628m = dVar;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        this.f41627l.c(this.f41628m);
        return kotlin.G0.f406611a;
    }
}

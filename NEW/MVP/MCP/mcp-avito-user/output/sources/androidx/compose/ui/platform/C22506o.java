package androidx.compose.ui.platform;

import kotlin.Metadata;

/* compiled from: AndroidComposeView.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "it", "Landroidx/compose/ui/platform/c0;", "invoke", "(Lkotlinx/coroutines/T;)Landroidx/compose/ui/platform/c0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.ui.platform.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22506o extends kotlin.jvm.internal.N implements Y41.l<kotlinx.coroutines.T, C22459c0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f41519l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22506o(AndroidComposeView androidComposeView) {
        super(1);
        this.f41519l = androidComposeView;
    }

    @Override // Y41.l
    public final C22459c0 invoke(kotlinx.coroutines.T t12) {
        AndroidComposeView androidComposeView = this.f41519l;
        return new C22459c0(androidComposeView, androidComposeView.getTextInputService(), t12);
    }
}

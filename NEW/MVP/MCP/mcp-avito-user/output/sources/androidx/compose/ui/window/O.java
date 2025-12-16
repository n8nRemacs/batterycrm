package androidx.compose.ui.window;

import android.os.Handler;
import android.os.Looper;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AndroidPopup.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Lkotlin/G0;", "command", "invoke", "(LY41/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class O extends kotlin.jvm.internal.N implements Y41.l<Y41.a<? extends G0>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ L f43061l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(L l12) {
        super(1);
        this.f43061l = l12;
    }

    @Override // Y41.l
    public final G0 invoke(Y41.a<? extends G0> aVar) {
        final Y41.a<? extends G0> aVar2 = aVar;
        L l12 = this.f43061l;
        Handler handler = l12.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            aVar2.invoke();
        } else {
            Handler handler2 = l12.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: androidx.compose.ui.window.N
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVar2.invoke();
                    }
                });
            }
        }
        return G0.f406611a;
    }
}

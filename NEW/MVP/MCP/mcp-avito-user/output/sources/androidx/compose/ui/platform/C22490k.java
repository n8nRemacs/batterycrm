package androidx.compose.ui.platform;

import android.view.MotionEvent;
import kotlin.Metadata;

/* compiled from: AndroidComposeView.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22490k extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f41483l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ MotionEvent f41484m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22490k(MotionEvent motionEvent, AndroidComposeView androidComposeView) {
        super(0);
        this.f41483l = androidComposeView;
        this.f41484m = motionEvent;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        return Boolean.valueOf(super/*android.view.View*/.dispatchGenericMotionEvent(this.f41484m));
    }
}

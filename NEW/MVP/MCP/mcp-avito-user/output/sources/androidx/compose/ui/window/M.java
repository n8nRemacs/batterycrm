package androidx.compose.ui.window;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AndroidPopup.android.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class M extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ L f43059l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(L l12) {
        super(0);
        this.f43059l = l12;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        L l12 = this.f43059l;
        androidx.compose.ui.layout.A parentLayoutCoordinates = l12.getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null || !parentLayoutCoordinates.m()) {
            parentLayoutCoordinates = null;
        }
        return Boolean.valueOf((parentLayoutCoordinates == null || l12.m5getPopupContentSizebOM6tXw() == null) ? false : true);
    }
}

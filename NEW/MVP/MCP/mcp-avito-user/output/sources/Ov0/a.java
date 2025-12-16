package OV0;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.interaction.status_bar.flow.StatusBarContentAppearance;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ScreenAwareSetStatusBarContentAppearanceClient.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOV0/a;", "Lcom/avito/beduin/v2/interaction/status_bar/flow/b;", "<init>", "()V", "status-bar-client_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.beduin.v2.interaction.status_bar.flow.b {

    /* renamed from: b, reason: collision with root package name */
    @l
    public FV0.a f12295b;

    /* compiled from: ScreenAwareSetStatusBarContentAppearanceClient.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: OV0.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0793a {
        static {
            int[] iArr = new int[StatusBarContentAppearance.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                StatusBarContentAppearance[] statusBarContentAppearanceArr = StatusBarContentAppearance.f337857b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                StatusBarContentAppearance[] statusBarContentAppearanceArr2 = StatusBarContentAppearance.f337857b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // FV0.h
    public final void P() {
        this.f12295b = null;
    }

    @Override // FV0.h
    public final void Q(@k FV0.a aVar) {
        this.f12295b = aVar;
    }
}

package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.BaseInputConnection;
import kotlin.Metadata;

/* compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/inputmethod/BaseInputConnection;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.input.internal.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20913r0 extends kotlin.jvm.internal.N implements Y41.a<BaseInputConnection> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C20946v0 f31209l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20913r0(C20946v0 c20946v0) {
        super(0);
        this.f31209l = c20946v0;
    }

    @Override // Y41.a
    public final BaseInputConnection invoke() {
        return new BaseInputConnection(this.f31209l.f31482a, false);
    }
}

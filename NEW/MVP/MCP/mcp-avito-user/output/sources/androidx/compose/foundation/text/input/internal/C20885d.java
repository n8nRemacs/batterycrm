package androidx.compose.foundation.text.input.internal;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AndroidTextInputSession.android.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt", f = "AndroidTextInputSession.android.kt", i = {}, l = {59}, m = "platformSpecificTextInputSession", n = {}, s = {})
/* renamed from: androidx.compose.foundation.text.input.internal.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20885d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f31057q;

    /* renamed from: r, reason: collision with root package name */
    public int f31058r;

    public C20885d() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f31057q = obj;
        this.f31058r |= BeduinInputModel.MIN_TEXT_VERSION;
        return C20895i.b(null, null, null, null, null, null, null, null, null, this);
    }
}

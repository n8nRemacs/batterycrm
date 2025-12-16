package androidx.compose.ui.platform;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AndroidComposeView.android.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.platform.AndroidComposeView", f = "AndroidComposeView.android.kt", i = {}, l = {739}, m = "textInputSession", n = {}, s = {})
/* renamed from: androidx.compose.ui.platform.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22502n extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f41515q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f41516r;

    /* renamed from: s, reason: collision with root package name */
    public int f41517s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22502n(AndroidComposeView androidComposeView, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f41516r = androidComposeView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f41515q = obj;
        this.f41517s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f41516r.d(null, this);
    }
}

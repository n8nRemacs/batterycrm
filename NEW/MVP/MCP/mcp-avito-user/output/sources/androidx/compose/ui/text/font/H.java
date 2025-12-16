package androidx.compose.ui.text.font;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FontFamilyResolver.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.text.font.FontFamilyResolverImpl", f = "FontFamilyResolver.kt", i = {0, 0}, l = {43}, m = "preload", n = {"this", "fontFamily"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
final class H extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f42177q;

    /* renamed from: r, reason: collision with root package name */
    public int f42178r;

    public H() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f42177q = obj;
        this.f42178r |= BeduinInputModel.MIN_TEXT_VERSION;
        throw null;
    }
}

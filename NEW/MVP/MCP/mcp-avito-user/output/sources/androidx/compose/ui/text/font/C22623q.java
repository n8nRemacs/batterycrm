package androidx.compose.ui.text.font;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", i = {0}, l = {314}, m = "loadWithTimeoutOrNull$ui_text_release", n = {"$this$loadWithTimeoutOrNull"}, s = {"L$0"})
/* renamed from: androidx.compose.ui.text.font.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22623q extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public D f42289q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f42290r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C22624s f42291s;

    /* renamed from: t, reason: collision with root package name */
    public int f42292t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22623q(C22624s c22624s, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f42291s = c22624s;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f42290r = obj;
        this.f42292t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f42291s.d(null, this);
    }
}

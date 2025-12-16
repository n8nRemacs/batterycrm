package androidx.compose.ui.text.font;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {281, 295}, m = "load", n = {"this", "$this$fastForEach$iv", "font", "index$iv", "this", "$this$fastForEach$iv", "index$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"})
/* renamed from: androidx.compose.ui.text.font.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22621o extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C22624s f42278q;

    /* renamed from: r, reason: collision with root package name */
    public List f42279r;

    /* renamed from: s, reason: collision with root package name */
    public D f42280s;

    /* renamed from: t, reason: collision with root package name */
    public int f42281t;

    /* renamed from: u, reason: collision with root package name */
    public int f42282u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f42283v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C22624s f42284w;

    /* renamed from: x, reason: collision with root package name */
    public int f42285x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22621o(C22624s c22624s, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f42284w = c22624s;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f42283v = obj;
        this.f42285x |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f42284w.a(this);
    }
}

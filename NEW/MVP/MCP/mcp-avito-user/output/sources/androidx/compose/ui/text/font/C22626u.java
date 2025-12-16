package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.C22625t;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", i = {0, 0, 0}, l = {412}, m = "runCached", n = {"this", "key", "forever"}, s = {"L$0", "L$1", "Z$0"})
/* renamed from: androidx.compose.ui.text.font.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22626u extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C22625t f42314q;

    /* renamed from: r, reason: collision with root package name */
    public C22625t.b f42315r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f42316s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f42317t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C22625t f42318u;

    /* renamed from: v, reason: collision with root package name */
    public int f42319v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22626u(C22625t c22625t, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f42318u = c22625t;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f42317t = obj;
        this.f42319v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f42318u.b(null, null, false, null, this);
    }
}
